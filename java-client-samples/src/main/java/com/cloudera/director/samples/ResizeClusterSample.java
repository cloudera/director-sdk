/*
 * Copyright (c) 2017 Cloudera, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.cloudera.director.samples;

import com.beust.jcommander.JCommander;
import com.beust.jcommander.Parameter;
import com.beust.jcommander.ParameterException;
import com.beust.jcommander.Parameters;
import com.cloudera.director.client.common.ApiClient;
import com.cloudera.director.client.common.ApiException;
import com.cloudera.director.client.latest.api.ClustersApi;
import com.cloudera.director.client.latest.model.Cluster;
import com.cloudera.director.client.latest.model.ClusterTemplate;
import com.cloudera.director.client.latest.model.Instance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

import com.cloudera.director.client.latest.model.Status;
import com.cloudera.director.client.latest.model.VirtualInstance;
import com.cloudera.director.client.latest.model.VirtualInstanceGroup;

/**
 * Example on how to use the API to resize the cluster.
 */
@Parameters(commandDescription = "Resize a Cloudera cluster")
public class ResizeClusterSample extends CommonParameters {

  @Parameter(names = "--environment", required = true,
      description = "The Environment name of the Cluster")
  private String environmentName;

  @Parameter(names = "--deployment", required = true,
      description = "The Deployment name of the Cluster")
  private String deploymentName;

  @Parameter(names = "--cluster", required = true,
      description = "The Cluster name")
  private String clusterName;

  @Parameter(names = "--group", required = true,
      description = "The name of the instance group to resize")
  private String instanceGroupName;

  @Parameter(names = "--size", required = true,
      description = "Resize the instance group the specified size")
  private int desiredSize;

  private boolean clusterHasAllInstances(VirtualInstanceGroup group, Cluster cluster) {
    Set<String> instancesInCluster = new HashSet<String>();
    for (Instance instance : cluster.getInstances()) {
      instancesInCluster.add(instance.getVirtualInstance().getId());
    }
    Set<String> instancesInGroup = new HashSet<String>();
    for (VirtualInstance instance : group.getVirtualInstances()) {
      instancesInGroup.add(instance.getId());
    }
    return instancesInCluster.containsAll(instancesInGroup);
   }

  /**
   * Update the cluster by growing or shrinking an instance group to a specified size.
   */
  public int run() throws Exception {
    ApiClient client = ClientUtil.newAuthenticatedApiClient(this);

    ClustersApi api = new ClustersApi(client);

    System.out.println("Retrieving Cluster and Template...");
    Cluster cluster = api.get(environmentName, deploymentName, clusterName);
    ClusterTemplate template = api.getTemplateRedacted(environmentName, deploymentName, clusterName);

    Map<String, VirtualInstanceGroup> vigs = template.getVirtualInstanceGroups();
    if (!vigs.containsKey(instanceGroupName)) {
      System.err.println("Could not find instance group with name " + instanceGroupName);
      return ExitCodes.INSTANCE_GROUP_NOT_FOUND;
    }

    VirtualInstanceGroup group = vigs.get(instanceGroupName);
    List<VirtualInstance> instancesInGroup = group.getVirtualInstances();

    // For simplicity this sample only performs updates where the cluster contains
    // all the instances specified in the cluster template'a instance group. When
    // there is an instance in the template that isn't in the cluster, it indicates
    // that the instance failed to provision in a previous bootstrap or update
    // attempt. In this case the instance can be either:
    //
    // (1) Re-provisioned: Submit template with the virtual instance id replaced (see RepairClusterSample)
    // (2) Removed: Submit the template with the virtual instance removed

    if (!clusterHasAllInstances(group, cluster)) {
      System.err.println("There are instances in the cluster template that are not present " +
          "in the cluster. This indicates provisioning failure from a previous run. These " +
          "instances should be re-provisioned/repaired or removed from the template");
      return ExitCodes.MISSING_CLUSTER_INSTANCES;
    }

    int currentSize = instancesInGroup.size();

    System.out.println(String.format("The current size of %s group is %d and desired size is %d",
        instanceGroupName, currentSize, desiredSize));

    if (desiredSize == currentSize) {
      System.out.println("Nothing to do");
      return ExitCodes.OK;
    }

    ClusterTemplate updatedTemplate;

    if (desiredSize > currentSize) {
      updatedTemplate = grow(template, instanceGroupName, currentSize, desiredSize);
    } else {
      updatedTemplate = shrink(template, instanceGroupName, currentSize, desiredSize);
    }

    System.out.println("Submitting update request...");
    try {
      api.update(environmentName, deploymentName, clusterName, updatedTemplate);
    } catch (ApiException ex) {
      System.err.println(String.format("Got API exception code %d with message: %s",
          ex.getCode(), ex.getMessage()));
      return ExitCodes.API_EXCEPTION;
    }

    System.out.println("Waiting for the cluster to be ready. Check the web interface for details.");
    String stage = ClientUtil.waitForCluster(client, environmentName, deploymentName, clusterName);

    if (!stage.equals(Status.Stage.READY)) {
      System.err.println("Cluster went into an unexpected stage");
      return ExitCodes.UNEXPECTED_STAGE;
    }

    return ExitCodes.OK;
  }

  private ClusterTemplate grow(ClusterTemplate template, String groupName, int currentSize, int desiredSize) {
    if (currentSize == 0) {
      throw new IllegalArgumentException("Can't grow a group that has no virtual instances");
    }

    int numInstancesToAdd = desiredSize - currentSize;
    System.out.println("Adding " + numInstancesToAdd + " instances");

    Map<String, VirtualInstanceGroup> updatedVIGs = new HashMap<String, VirtualInstanceGroup>();
    for (VirtualInstanceGroup vig : template.getVirtualInstanceGroups().values()) {
      if (vig.getName().equals(groupName)) {
        // we will copy the configurations of an existing instance in the group
        List<VirtualInstance> existingInstanceList = vig.getVirtualInstances();
        VirtualInstance existingInstance = existingInstanceList.get(0);

        VirtualInstance[] newInstances = new VirtualInstance[numInstancesToAdd];
        for (int i = 0; i < numInstancesToAdd; i++) {
          newInstances[i] = newCopyOfInstance(existingInstance);
        }
        List<VirtualInstance> updatedInstanceList = new ArrayList<VirtualInstance>(existingInstanceList);
        updatedInstanceList.addAll(Arrays.asList(newInstances));

        VirtualInstanceGroup updatedVIG = vig.toBuilder().virtualInstances(updatedInstanceList).build();
        updatedVIGs.put(updatedVIG.getName(), updatedVIG);
      } else {
        updatedVIGs.put(vig.getName(), vig);
      }
    }

    return template.toBuilder().virtualInstanceGroups(updatedVIGs).build();
  }

  private ClusterTemplate shrink(ClusterTemplate template, String groupName, int currentSize, int desiredSize) {
    int numInstancesToRemove = currentSize - desiredSize;
    System.out.println("Removing " + numInstancesToRemove + " instances");

    Map<String, VirtualInstanceGroup> updatedVIGs = new HashMap<String, VirtualInstanceGroup>();
    for (VirtualInstanceGroup vig : template.getVirtualInstanceGroups().values()) {
      if (vig.getName().equals(groupName)) {
        List<VirtualInstance> existingInstanceList = vig.getVirtualInstances();
        List<VirtualInstance> shrunkInstanceList = existingInstanceList.subList(0, desiredSize);
        VirtualInstanceGroup updatedVIG = vig.toBuilder().virtualInstances(shrunkInstanceList).build();
        updatedVIGs.put(updatedVIG.getName(), updatedVIG);
      } else {
        updatedVIGs.put(vig.getName(), vig);
      }
    }

    return template.toBuilder().virtualInstanceGroups(updatedVIGs).build();
  }

  private static VirtualInstance newCopyOfInstance(VirtualInstance existingInstance) {
    return existingInstance.toBuilder().id(UUID.randomUUID().toString()).build();
  }

  public static void main(String[] args) throws Exception {
    ResizeClusterSample sample = new ResizeClusterSample();

    JCommander jc = new JCommander(sample);
    jc.setProgramName("ResizeClusterSample");

    try {
      jc.parse(args);

    } catch (ParameterException e) {
      System.err.println(e.getMessage());
      jc.usage();
      System.exit(ExitCodes.PARAMETER_EXCEPTION);
    }

    System.exit(sample.run());
  }
}
