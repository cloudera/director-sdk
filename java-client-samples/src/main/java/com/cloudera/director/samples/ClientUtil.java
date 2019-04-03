/*
 * Copyright (c) 2017 Cloudera, Inc. All rights reserved.
 */

package com.cloudera.director.samples;

import com.cloudera.director.client.common.ApiClient;
import com.cloudera.director.client.common.ApiException;
import com.cloudera.director.client.latest.api.ClustersApi;
import com.cloudera.director.client.latest.api.DeploymentsApi;
import com.cloudera.director.client.latest.model.Status;

import java.util.concurrent.TimeUnit;

public class ClientUtil {

  public static ApiClient newAuthenticatedApiClient(CommonParameters common)
      throws ApiException {
    ApiClient client = new ApiClient(common.getServerUrl(), common.getAdminUsername(), common.getAdminPassword());
    client.setVerifyingSsl(common.isHostnameVerificationEnabled());
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
  public static Status.StageEnum waitForCluster(ApiClient client, String environmentName, String deploymentName,
                                                String clusterName) throws InterruptedException, ApiException {

    ClustersApi api = new ClustersApi(client);
    Status.StageEnum stage = null;
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
  public static Status.StageEnum waitForDeployment(ApiClient client, String environmentName,
                                                   String deploymentName) throws InterruptedException, ApiException {

    DeploymentsApi api = new DeploymentsApi(client);
    Status.StageEnum stage = null;
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
  private static boolean isFinalStage(Status.StageEnum stage) {
    return Status.StageEnum.READY.equals(stage) ||
           Status.StageEnum.BOOTSTRAP_FAILED.equals(stage) ||
           Status.StageEnum.UPDATE_FAILED.equals(stage) ||
           Status.StageEnum.TERMINATE_FAILED.equals(stage);
  }

  private static void waitAndReportProgress() throws InterruptedException {
    System.out.print(".");
    System.out.flush();

    TimeUnit.SECONDS.sleep(1);
  }
}
