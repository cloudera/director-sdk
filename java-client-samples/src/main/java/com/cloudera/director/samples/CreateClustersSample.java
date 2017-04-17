/*
 * Copyright (c) 2015 Cloudera, Inc.
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
import com.cloudera.director.client.latest.api.DeploymentsApi;
import com.cloudera.director.client.latest.api.EnvironmentsApi;
import com.cloudera.director.client.latest.model.ClusterTemplate;
import com.cloudera.director.client.latest.model.DeploymentTemplate;
import com.cloudera.director.client.latest.model.Environment;
import com.cloudera.director.client.latest.model.InstanceProviderConfig;
import com.cloudera.director.client.latest.model.InstanceTemplate;
import com.cloudera.director.client.latest.model.SshCredentials;
import com.cloudera.director.client.latest.model.Status;
import com.cloudera.director.client.latest.model.VirtualInstance;
import com.cloudera.director.client.latest.model.VirtualInstanceGroup;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.UUID;

import org.ini4j.Ini;

/**
 * Example on how to use the API to create a cluster.
 */
@Parameters(commandDescription = "Create a Cloudera cluster")
public class CreateClustersSample extends CommonParameters {

  @Parameter(names = "--config", required = true,
      description = "Path to the cluster configuration file")
  private String configFile;

  /**
   * Create a new environment with data from the configuration file.
   *
   * @param client authenticated API client
   * @param config parsed configuration file
   * @return the name of the new environment
   * @throws FileNotFoundException if the key file can't be found
   * @throws ApiException
   */
  private String createEnvironment(ApiClient client, Ini config)
      throws FileNotFoundException, ApiException {
    String clusterName = config.get("cluster", "name");

    SshCredentials credentials = SshCredentials.builder()
        .username(config.get("ssh", "username"))
        .privateKey(readFile(config.get("ssh", "privateKey")))
        .port(22)
        .build();

    Map<String, String> properties = new HashMap<String, String>();
    properties.put("accessKeyId", config.get("provider", "accessKeyId"));
    properties.put("secretAccessKey", config.get("provider", "secretAccessKey"));
    properties.put("region", config.get("provider", "region"));

    InstanceProviderConfig provider = InstanceProviderConfig.builder()
        .type(config.get("provider", "type"))
        .config(properties)
        .build();

    Environment environment = Environment.builder()
        .name(clusterName + " Environment")
        .credentials(credentials)
        .provider(provider)
        .build();

    EnvironmentsApi api = new EnvironmentsApi(client);
    try {
      api.create(environment);

    } catch (ApiException e) {
      if (e.getCode() == 302 /* found */) {
        System.out.println("Warning: an environment with the same name already exists");
      } else {
        throw e;
      }
    }

    System.out.printf("Environments: %s%n", api.list());
    return environment.getName();
  }

  /**
   * Create a new deployment (Cloudera Manager) with data from the configuration file.
   */
  private String createDeployment(ApiClient client, String environmentName, Ini config)
      throws ApiException {
    String clusterName = config.get("cluster", "name");

    Map<String, String> cmConfigs = new HashMap<String, String>();
    cmConfigs.put("enable_api_debug", "true");

    Map<String, Map<String, String>> overrides = new HashMap<String, Map<String, String>>();
    overrides.put("CLOUDERA_MANAGER", cmConfigs);

    DeploymentTemplate template = DeploymentTemplate.builder()
        .name(clusterName + " Deployment")
        .managerVirtualInstance(
            createVirtualInstanceWithRandomId(config, "manager"))
        .port(7180)
        .enableEnterpriseTrial(true)
        .configs(overrides)
        .build();

    DeploymentsApi api = new DeploymentsApi(client);
    try {
      api.create(environmentName, template);

    } catch (ApiException e) {
      if (e.getCode() == 302 /* found */) {
        System.out.println("Warning: a deployment with the same name already exists");
      } else {
        throw e;
      }
    }

    System.out.printf("Deployments: %s%n", api.list(environmentName));
    return template.getName();
  }

  /**
   * Create a new CDH cluster with data from the configuration file.
   */
  private String createCluster(ApiClient client, String environmentName,
      String deploymentName, Ini config) throws ApiException {

    String clusterName = config.get("cluster", "name");
    int clusterSize = Integer.parseInt(config.get("cluster", "size"));

    // Create the master group

    Map<String, List<String>> masterRoles = new HashMap<String, List<String>>();
    masterRoles.put("HDFS", Arrays.asList("NAMENODE", "SECONDARYNAMENODE"));
    masterRoles.put("YARN", Arrays.asList("RESOURCEMANAGER", "JOBHISTORY"));

    Map<String, VirtualInstanceGroup> groups = new HashMap<String, VirtualInstanceGroup>();
    groups.put("masters", VirtualInstanceGroup.builder()
        .name("masters")
        .minCount(1)
        .serviceTypeToRoleTypes(masterRoles)
        .virtualInstances(Arrays.asList(createVirtualInstanceWithRandomId(config, "master")))
        .build());

    // Create the workers group

    Map<String, List<String>> workerRoles = new HashMap<String, List<String>>();
    workerRoles.put("HDFS", Arrays.asList("DATANODE"));
    workerRoles.put("YARN", Arrays.asList("NODEMANAGER"));

    List<VirtualInstance> workerVirtualInstances = new ArrayList<VirtualInstance>();
    for (int i = 0; i < clusterSize; i++) {
      workerVirtualInstances.add(createVirtualInstanceWithRandomId(config, "worker"));
    }

    groups.put("workers", VirtualInstanceGroup.builder()
        .name("workers")
        .minCount(clusterSize)
        .serviceTypeToRoleTypes(workerRoles)
        .virtualInstances(workerVirtualInstances)
        .build());

    // Create the cluster template

    ClusterTemplate template = ClusterTemplate.builder()
        .name(clusterName)
        .productVersions(newMap("CDH", config.get("cluster", "cdh_version")))
        .services(Arrays.asList("HDFS", "YARN"))
        .virtualInstanceGroups(groups)
        .build();

    ClustersApi api = new ClustersApi(client);
    try {
      api.create(environmentName, deploymentName, template);

    } catch (ApiException e) {
      if (e.getCode() == 302 /* found */) {
        System.out.println("Warning: a cluster with the same name already exists");
      } else {
        throw e;
      }
    }

    System.out.printf("Clusters: %s%n", api.list(environmentName, deploymentName));
    return template.getName();
  }

  /**
   * Create a new virtual instance object with a random ID and a template from the configuration file.
   */
  private VirtualInstance createVirtualInstanceWithRandomId(Ini config, String templateName) {
    return VirtualInstance.builder()
        .id(UUID.randomUUID().toString())
        .template(createInstanceTemplate(config, templateName))
        .build();
  }

  /**
   * Create an instance template with data from the configuration file.
   */
  private InstanceTemplate createInstanceTemplate(Ini config, String templateName) {
    Map<String, String> configs = new HashMap<String, String>();
    configs.put("subnetId", config.get("instance", "subnetId"));
    configs.put("securityGroupsIds", config.get("instance", "securityGroupId"));
    configs.put("instanceNamePrefix", config.get("instance", "namePrefix"));

    return InstanceTemplate.builder()
        .name(templateName)
        .image(config.get("instance", "image"))
        .type(config.get("instance", "type"))
        .config(configs)
        .build();
  }

  private String readFile(String path) throws FileNotFoundException {
    Scanner scanner = new Scanner(new File(path), "UTF-8");
    try {
      return scanner.useDelimiter("\\Z").next();

    } finally {
      scanner.close();
    }
  }

  private <T> Map<T, T> newMap(T... pairs) {
    if (pairs.length % 2 != 0) {
      throw new IllegalArgumentException("This function expects an even number of arguments");
    }
    Map<T, T> result = new HashMap<T, T>();
    for (int i = 0; i < pairs.length; i += 2) {
      result.put(pairs[i], pairs[i + 1]);
    }
    return result;
  }

  /**
   * Go through the steps for creating a cluster based on the configuration file.
   */
  public int run() throws Exception {
    Ini config;
    try {
      config = new Ini(new File(configFile));

    } catch (FileNotFoundException e) {
      System.err.println("Configuration file not found: " + configFile);
      return ExitCodes.CONFIG_FILE_ERROR;
    }

    ApiClient client = ClientUtil.newAuthenticatedApiClient(this);

    System.out.println("Creating a new environment...");
    String environmentName = createEnvironment(client, config);

    System.out.println("Creating a new Cloudera Manager instance...");
    String deploymentName = createDeployment(client, environmentName, config);

    System.out.println("Creating a new CDH cluster...");
    String clusterName = createCluster(client, environmentName, deploymentName, config);

    System.out.println("Waiting for deployment to be ready. Check the web interface for details.");
    String stage = ClientUtil.waitForDeployment(client, environmentName, deploymentName);

    if (!stage.equals(Status.Stage.READY)) {
      System.err.println("Deployment went into an unexpected stage");
      return ExitCodes.UNEXPECTED_STAGE;
    }

    System.out.println("Waiting for the cluster to be ready. Check the web interface for details.");
    stage = ClientUtil.waitForCluster(client, environmentName, deploymentName, clusterName);

    if (!stage.equals(Status.Stage.READY)) {
      System.err.println("Cluster went into an unexpected stage");
      return ExitCodes.UNEXPECTED_STAGE;
    }

    return ExitCodes.OK;
  }

  public static void main(String[] args) throws Exception {
    CreateClustersSample sample = new CreateClustersSample();

    JCommander jc = new JCommander(sample);
    jc.setProgramName("CreateClustersSample");

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
