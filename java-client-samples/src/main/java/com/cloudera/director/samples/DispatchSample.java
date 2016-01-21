/*
 * Copyright (c) 2016 Cloudera, Inc.
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
import com.cloudera.director.client.latest.api.AuthenticationApi;
import com.cloudera.director.client.latest.api.ImportClientConfigApi;
import com.cloudera.director.client.latest.model.ImportResult;
import com.cloudera.director.client.latest.model.Login;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Example on how to use the API to import a client config file.
 */
@Parameters(commandDescription = "Import a client config file")
public class DispatchSample extends CommonParameters {

  @Parameter(names = "--config", required = true,
    description = "Path to the cluster configuration file")
  private String configFile;

  @Parameter(names = "--environment", required = false,
    description = "Optional override for environment name")
  private String environmentName = null;

  @Parameter(names = "--deployment", required = false,
    description = "Optional override for deployment name")
  private String deploymentName = null;

  @Parameter(names = "--cluster", required = false,
    description = "Optional override for cluster name")
  private String clusterName = null;

  private ApiClient newAuthenticatedApiClient(CommonParameters common)
    throws ApiException {
    ApiClient client = new ApiClient(common.getServerUrl());

    Login login = Login.builder()
      .username(common.getAdminUsername())
      .password(common.getAdminPassword())
      .build();

    new AuthenticationApi(client).login(login);

    return client;
  }

  /**
   * Import client config file.
   */
  public int run() throws Exception {
    String config;
    try {
      config = new String(Files.readAllBytes(Paths.get(configFile)), StandardCharsets.UTF_8);

    } catch (IOException e) {
      System.err.println("Unable to read configuration file: " + configFile);
      return -2;
    }

    ApiClient client = newAuthenticatedApiClient(this);

    ImportClientConfigApi api = new ImportClientConfigApi(client);
    ImportResult result = api.importClientConfig(config, clusterName, deploymentName, environmentName);

    System.out.println(result.toString());

    return 0;
  }

  public static void main(String[] args) throws Exception {
    DispatchSample sample = new DispatchSample();

    JCommander jc = new JCommander(sample);
    jc.setProgramName("DispatchSample");

    try {
      jc.parse(args);

    } catch (ParameterException e) {
      System.err.println(e.getMessage());
      jc.usage();
      System.exit(-1);
    }

    System.exit(sample.run());
  }
}
