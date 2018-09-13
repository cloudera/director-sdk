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
import com.cloudera.director.client.latest.model.ClusterTemplate;
import com.cloudera.director.client.latest.model.Status;
import com.cloudera.director.client.latest.model.VirtualInstance;
import com.cloudera.director.client.latest.model.VirtualInstanceGroup;

import java.util.UUID;


/**
 * Example on how to use the API to repair an instance in the cluster.
 */
@Parameters(commandDescription = "Repair an instance in a Cluster")
public class RepairClusterSample extends CommonParameters {

  @Parameter(names = "--environment", required = true,
      description = "The Environment name of the Cluster")
  private String environmentName;

  @Parameter(names = "--deployment", required = true,
      description = "The Deployment name of the Cluster")
  private String deploymentName;

  @Parameter(names = "--cluster", required = true,
      description = "The Cluster name")
  private String clusterName;

  @Parameter(names = "--instanceId", required = true,
      description = "The virtual instance id to repair")
  private String repairInstanceId;

  /**
   * Repair an instance by replacing the virtual instance id.
   */
  public int run() throws Exception {
    ApiClient client = ClientUtil.newAuthenticatedApiClient(this);

    ClustersApi api = new ClustersApi(client);

    System.out.println("Retrieving Cluster Template...");
    ClusterTemplate template = api.getTemplateRedacted(environmentName, deploymentName, clusterName);

    // Repair is done by changing the virtual instance id of the instance to be replaced.
    // This will tell Director to remove the old instance if it still exists and provision
    // a new one in its place.

    boolean foundVirtualInstance = false;

    for (VirtualInstanceGroup group : template.getVirtualInstanceGroups().values()) {
      for (VirtualInstance virtualInstance : group.getVirtualInstances()) {
        if (virtualInstance.getId().equals(repairInstanceId)) {
          foundVirtualInstance = true;
          System.out.println("Found instance in group " + group.getName());
          String newInstanceId = UUID.randomUUID().toString();
          System.out.println(String.format("Replacing instance with id %s with new instance %s",
              repairInstanceId, newInstanceId));
          virtualInstance.setId(newInstanceId);
          break;
        }
      }
    }

    if (!foundVirtualInstance) {
      System.err.println("Could not find any instance with virtual instance id " + repairInstanceId);
      return ExitCodes.INSTANCE_NOT_FOUND;
    }

    System.out.println("Submitting update request...");
    try {
      api.update(environmentName, deploymentName, clusterName, template);
    } catch (ApiException ex) {
      System.err.println(String.format("Got API exception code %d with message: %s",
          ex.getCode(), ex.getMessage()));
      return ExitCodes.API_EXCEPTION;
    }

    System.out.println("Waiting for the cluster to be ready. Check the web interface for details.");
    Status.StageEnum stage = ClientUtil.waitForCluster(client, environmentName, deploymentName, clusterName);

    if (!stage.equals(Status.StageEnum.READY)) {
      System.err.println("Cluster went into an unexpected stage");
      return ExitCodes.UNEXPECTED_STAGE;
    }

    return ExitCodes.OK;
  }

  public static void main(String[] args) throws Exception {
    RepairClusterSample sample = new RepairClusterSample();

    JCommander jc = new JCommander(sample);
    jc.setProgramName("RepairClusterSample");

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
