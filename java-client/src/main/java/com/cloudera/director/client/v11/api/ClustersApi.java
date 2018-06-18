// Licensed to Cloudera, Inc. under one
// or more contributor license agreements.  See the NOTICE file
// distributed with this work for additional information
// regarding copyright ownership.  Cloudera, Inc. licenses this file
// to you under the Apache License, Version 2.0 (the
// "License"); you may not use this file except in compliance
// with the License.  You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

// Note: This file is auto generated. Do not edit manually.

package com.cloudera.director.client.v11.api;

import com.cloudera.director.client.common.ApiClient;
import com.cloudera.director.client.common.ApiException;

import com.cloudera.director.client.v11.model.Cluster;
import com.cloudera.director.client.v11.model.ClusterAdministrationSettings;
import com.cloudera.director.client.v11.model.ClusterTemplate;
import com.cloudera.director.client.v11.model.ClusterUpdateEventSummary;
import com.cloudera.director.client.v11.model.Metrics;
import com.cloudera.director.client.v11.model.Status;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List; // NOPMD
import java.util.Map;

@SuppressWarnings("parametername")
public class ClustersApi {
  ApiClient apiClient;

  public ApiClient getClient() {
    return apiClient;
  }

  public ClustersApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
  * Collects diagnostic data.
  * @param  environment  environmentName
  * @param  deployment  deploymentName
  * @param  cluster  clusterName
  * status code: 201 reason: "Created"
  * status code: 202 reason: "Accepted"
  * status code: 401 reason: "Unauthorized"
  * status code: 403 reason: "Forbidden"
  * status code: 404 reason: "Entity not found"
  * status code: 409 reason: "Cluster is in transition"
  * status code: 412 reason: "Deployment is not available"
  */
  public void collectDiagnosticData(String environment, String deployment, String cluster) throws ApiException {
    Object postBody = null;
    // verify required params are set
    if (environment == null || deployment == null || cluster == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/api/v11/environments/{environment}/deployments/{deployment}/clusters/{cluster}/diagnosticData"
      .replaceAll("\\{format\\}", "json")
      .replaceAll("\\{" + "environment" + "\\}",
                  apiClient.escapeString(environment.toString()))
      .replaceAll("\\{" + "deployment" + "\\}",
                  apiClient.escapeString(deployment.toString()))
      .replaceAll("\\{" + "cluster" + "\\}",
                  apiClient.escapeString(cluster.toString()))
      ;

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    String[] contentTypes = { "application/json"};
    if (contentTypes.length != 1) {
      throw new IllegalArgumentException("An API client expects a single content type. Got: "
        + Arrays.toString(contentTypes));
    }

    apiClient.invokeAPI(path, "POST", queryParams, postBody,
      headerParams, formParams, contentTypes[0]);
    }


  /**
  * Create a new cluster.
  * @param  environment  environmentName
  * @param  deployment  deploymentName
  * @param  body  clusterTemplate
  * status code: 201 reason: "Cluster template accepted"
  * status code: 302 reason: "Cluster already exists"
  * status code: 400 reason: "Invalid cluster template"
  * status code: 401 reason: "Unauthorized"
  * status code: 403 reason: "Forbidden"
  * status code: 404 reason: "Not Found"
  */
  public void create(String environment, String deployment, ClusterTemplate body) throws ApiException {
    Object postBody = body;
    // verify required params are set
    if (environment == null || deployment == null || body == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/api/v11/environments/{environment}/deployments/{deployment}/clusters"
      .replaceAll("\\{format\\}", "json")
      .replaceAll("\\{" + "environment" + "\\}",
                  apiClient.escapeString(environment.toString()))
      .replaceAll("\\{" + "deployment" + "\\}",
                  apiClient.escapeString(deployment.toString()))
      ;

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    String[] contentTypes = { "application/json"};
    if (contentTypes.length != 1) {
      throw new IllegalArgumentException("An API client expects a single content type. Got: "
        + Arrays.toString(contentTypes));
    }

    apiClient.invokeAPI(path, "POST", queryParams, postBody,
      headerParams, formParams, contentTypes[0]);
    }


  /**
  * Delete a cluster by name.
  * @param  environment  environmentName
  * @param  deployment  deploymentName
  * @param  cluster  clusterName
  * status code: 204 reason: "Delete request accepted"
  * status code: 401 reason: "Unauthorized"
  * status code: 403 reason: "Forbidden"
  * status code: 404 reason: "Entity not found"
  */
  public void delete(String environment, String deployment, String cluster) throws ApiException {
    Object postBody = null;
    // verify required params are set
    if (environment == null || deployment == null || cluster == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/api/v11/environments/{environment}/deployments/{deployment}/clusters/{cluster}"
      .replaceAll("\\{format\\}", "json")
      .replaceAll("\\{" + "environment" + "\\}",
                  apiClient.escapeString(environment.toString()))
      .replaceAll("\\{" + "deployment" + "\\}",
                  apiClient.escapeString(deployment.toString()))
      .replaceAll("\\{" + "cluster" + "\\}",
                  apiClient.escapeString(cluster.toString()))
      ;

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    String[] contentTypes = { "application/json"};
    if (contentTypes.length != 1) {
      throw new IllegalArgumentException("An API client expects a single content type. Got: "
        + Arrays.toString(contentTypes));
    }

    apiClient.invokeAPI(path, "DELETE", queryParams, postBody,
      headerParams, formParams, contentTypes[0]);
    }


  /**
  * Get a cluster by name.
  * @param  environment  environmentName
  * @param  deployment  deploymentName
  * @param  cluster  clusterName
  * status code: 200 reason: "OK"
  * status code: 204 reason: "Cluster is in transition or failed stage"
  * status code: 401 reason: "Unauthorized"
  * status code: 403 reason: "Forbidden"
  * status code: 404 reason: "Entity not found"
  */
  public Cluster get(String environment, String deployment, String cluster) throws ApiException {
    Object postBody = null;
    // verify required params are set
    if (environment == null || deployment == null || cluster == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/api/v11/environments/{environment}/deployments/{deployment}/clusters/{cluster}"
      .replaceAll("\\{format\\}", "json")
      .replaceAll("\\{" + "environment" + "\\}",
                  apiClient.escapeString(environment.toString()))
      .replaceAll("\\{" + "deployment" + "\\}",
                  apiClient.escapeString(deployment.toString()))
      .replaceAll("\\{" + "cluster" + "\\}",
                  apiClient.escapeString(cluster.toString()))
      ;

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    String[] contentTypes = { "application/json"};
    if (contentTypes.length != 1) {
      throw new IllegalArgumentException("An API client expects a single content type. Got: "
        + Arrays.toString(contentTypes));
    }

    Object response = apiClient.invokeAPI(path, "GET", queryParams, postBody,
      headerParams, formParams, contentTypes[0], "", Cluster.class);
    return (Cluster) response;}


  /**
  * Get administration settings for a cluster.
  * @param  environment  environmentName
  * @param  deployment  deploymentName
  * @param  cluster  clusterName
  * status code: 200 reason: "OK"
  * status code: 401 reason: "Unauthorized"
  * status code: 403 reason: "Forbidden"
  * status code: 404 reason: "Entity not found"
  */
  public ClusterAdministrationSettings getAdministrationSettings(String environment, String deployment, String cluster) throws ApiException {
    Object postBody = null;
    // verify required params are set
    if (environment == null || deployment == null || cluster == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/api/v11/environments/{environment}/deployments/{deployment}/clusters/{cluster}/settings"
      .replaceAll("\\{format\\}", "json")
      .replaceAll("\\{" + "environment" + "\\}",
                  apiClient.escapeString(environment.toString()))
      .replaceAll("\\{" + "deployment" + "\\}",
                  apiClient.escapeString(deployment.toString()))
      .replaceAll("\\{" + "cluster" + "\\}",
                  apiClient.escapeString(cluster.toString()))
      ;

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    String[] contentTypes = { "application/json"};
    if (contentTypes.length != 1) {
      throw new IllegalArgumentException("An API client expects a single content type. Got: "
        + Arrays.toString(contentTypes));
    }

    Object response = apiClient.invokeAPI(path, "GET", queryParams, postBody,
      headerParams, formParams, contentTypes[0], "", ClusterAdministrationSettings.class);
    return (ClusterAdministrationSettings) response;}


  /**
  * Get history of updates for a cluster.
  * @param  environment  environmentName
  * @param  deployment  deploymentName
  * @param  cluster  clusterName
  * @param  numEvents  numEvents
  * @param  page  page
  * status code: 200 reason: "OK"
  * status code: 401 reason: "Unauthorized"
  * status code: 403 reason: "Forbidden"
  * status code: 404 reason: "Entity not found"
  */
  public List<ClusterUpdateEventSummary> getHistory(String environment, String deployment, String cluster, Integer numEvents, Integer page) throws ApiException {
    Object postBody = null;
    // verify required params are set
    if (environment == null || deployment == null || cluster == null || numEvents == null || page == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/api/v11/environments/{environment}/deployments/{deployment}/clusters/{cluster}/history"
      .replaceAll("\\{format\\}", "json")
      .replaceAll("\\{" + "environment" + "\\}",
                  apiClient.escapeString(environment.toString()))
      .replaceAll("\\{" + "deployment" + "\\}",
                  apiClient.escapeString(deployment.toString()))
      .replaceAll("\\{" + "cluster" + "\\}",
                  apiClient.escapeString(cluster.toString()))
      ;

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if (!"null".equals(String.valueOf(numEvents)))
      queryParams.put("numEvents", String.valueOf(numEvents));
    if (!"null".equals(String.valueOf(page)))
      queryParams.put("page", String.valueOf(page));
    String[] contentTypes = { "application/json"};
    if (contentTypes.length != 1) {
      throw new IllegalArgumentException("An API client expects a single content type. Got: "
        + Arrays.toString(contentTypes));
    }

    Object response = apiClient.invokeAPI(path, "GET", queryParams, postBody,
      headerParams, formParams, contentTypes[0], "List", ClusterUpdateEventSummary.class);
    return (List<ClusterUpdateEventSummary>) response;}


  /**
  * Get cluster metrics by name.
  * @param  environment  environmentName
  * @param  deployment  deploymentName
  * @param  cluster  clusterName
  * status code: 200 reason: "OK"
  * status code: 204 reason: "Cluster is in transition or a failed stage"
  * status code: 401 reason: "Unauthorized"
  * status code: 403 reason: "Forbidden"
  * status code: 404 reason: "Entity not found"
  */
  public Metrics getMetrics(String environment, String deployment, String cluster) throws ApiException {
    Object postBody = null;
    // verify required params are set
    if (environment == null || deployment == null || cluster == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/api/v11/environments/{environment}/deployments/{deployment}/clusters/{cluster}/metrics"
      .replaceAll("\\{format\\}", "json")
      .replaceAll("\\{" + "environment" + "\\}",
                  apiClient.escapeString(environment.toString()))
      .replaceAll("\\{" + "deployment" + "\\}",
                  apiClient.escapeString(deployment.toString()))
      .replaceAll("\\{" + "cluster" + "\\}",
                  apiClient.escapeString(cluster.toString()))
      ;

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    String[] contentTypes = { "application/json"};
    if (contentTypes.length != 1) {
      throw new IllegalArgumentException("An API client expects a single content type. Got: "
        + Arrays.toString(contentTypes));
    }

    Object response = apiClient.invokeAPI(path, "GET", queryParams, postBody,
      headerParams, formParams, contentTypes[0], "", Metrics.class);
    return (Metrics) response;}


  /**
  * Get a cluster status by name.
  * @param  environment  environmentName
  * @param  deployment  deploymentName
  * @param  cluster  clusterName
  * status code: 200 reason: "OK"
  * status code: 401 reason: "Unauthorized"
  * status code: 403 reason: "Forbidden"
  * status code: 404 reason: "Entity not found"
  */
  public Status getStatus(String environment, String deployment, String cluster) throws ApiException {
    Object postBody = null;
    // verify required params are set
    if (environment == null || deployment == null || cluster == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/api/v11/environments/{environment}/deployments/{deployment}/clusters/{cluster}/status"
      .replaceAll("\\{format\\}", "json")
      .replaceAll("\\{" + "environment" + "\\}",
                  apiClient.escapeString(environment.toString()))
      .replaceAll("\\{" + "deployment" + "\\}",
                  apiClient.escapeString(deployment.toString()))
      .replaceAll("\\{" + "cluster" + "\\}",
                  apiClient.escapeString(cluster.toString()))
      ;

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    String[] contentTypes = { "application/json"};
    if (contentTypes.length != 1) {
      throw new IllegalArgumentException("An API client expects a single content type. Got: "
        + Arrays.toString(contentTypes));
    }

    Object response = apiClient.invokeAPI(path, "GET", queryParams, postBody,
      headerParams, formParams, contentTypes[0], "", Status.class);
    return (Status) response;}


  /**
  * Get a cluster template by name.
  * @param  environment  environmentName
  * @param  deployment  deploymentName
  * @param  cluster  clusterName
  * status code: 200 reason: "OK"
  * status code: 401 reason: "Unauthorized"
  * status code: 403 reason: "Forbidden"
  * status code: 404 reason: "Entity not found"
  */
  public ClusterTemplate getTemplateRedacted(String environment, String deployment, String cluster) throws ApiException {
    Object postBody = null;
    // verify required params are set
    if (environment == null || deployment == null || cluster == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/api/v11/environments/{environment}/deployments/{deployment}/clusters/{cluster}/template"
      .replaceAll("\\{format\\}", "json")
      .replaceAll("\\{" + "environment" + "\\}",
                  apiClient.escapeString(environment.toString()))
      .replaceAll("\\{" + "deployment" + "\\}",
                  apiClient.escapeString(deployment.toString()))
      .replaceAll("\\{" + "cluster" + "\\}",
                  apiClient.escapeString(cluster.toString()))
      ;

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    String[] contentTypes = { "application/json"};
    if (contentTypes.length != 1) {
      throw new IllegalArgumentException("An API client expects a single content type. Got: "
        + Arrays.toString(contentTypes));
    }

    Object response = apiClient.invokeAPI(path, "GET", queryParams, postBody,
      headerParams, formParams, contentTypes[0], "", ClusterTemplate.class);
    return (ClusterTemplate) response;}


  /**
  * List all clusters.
  * @param  environment  environmentName
  * @param  deployment  deploymentName
  * status code: 200 reason: "OK"
  * status code: 401 reason: "Unauthorized"
  * status code: 403 reason: "Forbidden"
  * status code: 404 reason: "Entity not found"
  */
  public List<String> list(String environment, String deployment) throws ApiException {
    Object postBody = null;
    // verify required params are set
    if (environment == null || deployment == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/api/v11/environments/{environment}/deployments/{deployment}/clusters"
      .replaceAll("\\{format\\}", "json")
      .replaceAll("\\{" + "environment" + "\\}",
                  apiClient.escapeString(environment.toString()))
      .replaceAll("\\{" + "deployment" + "\\}",
                  apiClient.escapeString(deployment.toString()))
      ;

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    String[] contentTypes = { "application/json"};
    if (contentTypes.length != 1) {
      throw new IllegalArgumentException("An API client expects a single content type. Got: "
        + Arrays.toString(contentTypes));
    }

    Object response = apiClient.invokeAPI(path, "GET", queryParams, postBody,
      headerParams, formParams, contentTypes[0], "List", String.class);
    return (List<String>) response;}


  /**
  * Update an existing cluster.
  * @param  environment  environmentName
  * @param  deployment  deploymentName
  * @param  cluster  clusterName
  * @param  body  desired
  * status code: 201 reason: "Created"
  * status code: 202 reason: "Cluster update accepted"
  * status code: 400 reason: "Cluster update not supported"
  * status code: 401 reason: "Unauthorized"
  * status code: 403 reason: "Forbidden"
  * status code: 404 reason: "Not found"
  * status code: 409 reason: "Cluster is in a non-updatable state"
  */
  public void update(String environment, String deployment, String cluster, ClusterTemplate body) throws ApiException {
    Object postBody = body;
    // verify required params are set
    if (environment == null || deployment == null || cluster == null || body == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/api/v11/environments/{environment}/deployments/{deployment}/clusters/{cluster}"
      .replaceAll("\\{format\\}", "json")
      .replaceAll("\\{" + "environment" + "\\}",
                  apiClient.escapeString(environment.toString()))
      .replaceAll("\\{" + "deployment" + "\\}",
                  apiClient.escapeString(deployment.toString()))
      .replaceAll("\\{" + "cluster" + "\\}",
                  apiClient.escapeString(cluster.toString()))
      ;

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    String[] contentTypes = { "application/json"};
    if (contentTypes.length != 1) {
      throw new IllegalArgumentException("An API client expects a single content type. Got: "
        + Arrays.toString(contentTypes));
    }

    apiClient.invokeAPI(path, "PUT", queryParams, postBody,
      headerParams, formParams, contentTypes[0]);
    }


  /**
  * Update administration settings for a cluster.
  * @param  environment  environmentName
  * @param  deployment  deploymentName
  * @param  cluster  clusterName
  * @param  body  administrationSettings
  * status code: 201 reason: "Created"
  * status code: 202 reason: "Cluster update accepted"
  * status code: 401 reason: "Unauthorized"
  * status code: 403 reason: "Forbidden"
  * status code: 404 reason: "Not found"
  */
  public void updateAdministrationSettings(String environment, String deployment, String cluster, ClusterAdministrationSettings body) throws ApiException {
    Object postBody = body;
    // verify required params are set
    if (environment == null || deployment == null || cluster == null || body == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/api/v11/environments/{environment}/deployments/{deployment}/clusters/{cluster}/settings"
      .replaceAll("\\{format\\}", "json")
      .replaceAll("\\{" + "environment" + "\\}",
                  apiClient.escapeString(environment.toString()))
      .replaceAll("\\{" + "deployment" + "\\}",
                  apiClient.escapeString(deployment.toString()))
      .replaceAll("\\{" + "cluster" + "\\}",
                  apiClient.escapeString(cluster.toString()))
      ;

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    String[] contentTypes = { "application/json"};
    if (contentTypes.length != 1) {
      throw new IllegalArgumentException("An API client expects a single content type. Got: "
        + Arrays.toString(contentTypes));
    }

    apiClient.invokeAPI(path, "PUT", queryParams, postBody,
      headerParams, formParams, contentTypes[0]);
    }


  }

