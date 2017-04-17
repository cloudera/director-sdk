/*
 * Copyright (c) 2017 Cloudera, Inc. All rights reserved.
 */

package com.cloudera.director.samples;

import com.cloudera.director.client.common.ApiClient;
import com.cloudera.director.client.common.ApiException;
import com.cloudera.director.client.latest.api.AuthenticationApi;
import com.cloudera.director.client.latest.api.ClustersApi;
import com.cloudera.director.client.latest.api.DeploymentsApi;
import com.cloudera.director.client.latest.model.Login;
import com.cloudera.director.client.latest.model.Status;

import java.util.concurrent.TimeUnit;

public class ClientUtil {

  public static ApiClient newAuthenticatedApiClient(CommonParameters common)
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
   * Wait for cluster bootstrap or update process to complete.
   *
   * @param client the api client
   * @param environmentName the environment name that the cluster belongs to
   * @param deploymentName the deployment name that the cluster belongs to
   * @param clusterName the name of the cluster to wait for
   * @return
   * @throws InterruptedException
   * @throws ApiException
   */
  public static String waitForCluster(ApiClient client, String environmentName, String deploymentName,
                              String clusterName) throws InterruptedException, ApiException {

    ClustersApi api = new ClustersApi(client);
    String stage = null;
    do {
      waitAndReportProgress();
      stage = api.getStatus(environmentName, deploymentName, clusterName).getStage();

    } while (!isFinalStage(stage));

    System.out.printf("%nCluster '%s' current stage is '%s'%n", clusterName, stage);
    return stage;
  }

  /**
   * Wait for deployment bootstrap or update process to complete.
   *
   * @param client the api client
   * @param environmentName the environment name that the deployment belongs to
   * @param deploymentName the name of the deployment to wait for
   * @return the final stage the deployment is in
   *
   * @throws InterruptedException
   * @throws ApiException
   */
  public static String waitForDeployment(ApiClient client, String environmentName,
                                 String deploymentName) throws InterruptedException, ApiException {

    DeploymentsApi api = new DeploymentsApi(client);
    String stage = null;
    do {
      waitAndReportProgress();
      stage = api.getStatus(environmentName, deploymentName).getStage();

    } while (!isFinalStage(stage));

    System.out.printf("%nDeployment '%s' current stage is '%s'%n", deploymentName, stage);
    return stage;

  }

  /**
   * Whether the specified stage is a final stage (like BOOTSTRAP_FAILED)
   * as opposed to an intermediate stage (like BOOTSTRAPPING).
   *
   * @param stage the stage to check
   * @return whether the stage is final
   */
  private static boolean isFinalStage(String stage) {
    return Status.Stage.READY.equals(stage) ||
           Status.Stage.BOOTSTRAP_FAILED.equals(stage) ||
           Status.Stage.UPDATE_FAILED.equals(stage) ||
           Status.Stage.TERMINATE_FAILED.equals(stage);
  }

  private static void waitAndReportProgress() throws InterruptedException {
    System.out.print(".");
    System.out.flush();

    TimeUnit.SECONDS.sleep(1);
  }
}
