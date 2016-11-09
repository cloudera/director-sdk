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

package com.cloudera.director.client.v6.api;

import com.cloudera.director.client.common.ApiClient;
import com.cloudera.director.client.common.ApiException;

import com.cloudera.director.client.v6.model.Workflow;
import com.cloudera.director.client.v6.model.WorkflowStatus;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List; // NOPMD
import java.util.Map;

@SuppressWarnings("parametername")
public class WorkflowsApi {
  ApiClient apiClient;

  public ApiClient getClient() {
    return apiClient;
  }

  public WorkflowsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
  * Describe an Oozie workflow.
  * @param  environment  environmentName
  * @param  deployment  deploymentName
  * @param  cluster  clusterName
  * @param  workflowUuid  workflowUuid
  * status code: 200 reason: "OK"
  * status code: 401 reason: "Unauthorized"
  * status code: 403 reason: "Forbidden"
  * status code: 404 reason: "Not Found"
  */
  public WorkflowStatus describe(String environment, String deployment, String cluster, String workflowUuid) throws ApiException {
    Object postBody = null;
    // verify required params are set
    if (environment == null || deployment == null || cluster == null || workflowUuid == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/api/v6/environments/{environment}/deployments/{deployment}/clusters/{cluster}/workflows/{workflowUuid}"
      .replaceAll("\\{format\\}", "json")
      .replaceAll("\\{" + "environment" + "\\}",
                  apiClient.escapeString(environment.toString()))
      .replaceAll("\\{" + "deployment" + "\\}",
                  apiClient.escapeString(deployment.toString()))
      .replaceAll("\\{" + "cluster" + "\\}",
                  apiClient.escapeString(cluster.toString()))
      .replaceAll("\\{" + "workflowUuid" + "\\}",
                  apiClient.escapeString(workflowUuid.toString()))
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

    try {
      String response = apiClient.invokeAPI(path, "GET", queryParams, postBody,
        headerParams, formParams, contentTypes[0]);

      if (response != null) {
        return (WorkflowStatus) ApiClient.deserialize(response, "", WorkflowStatus.class);
      } else {
        return null;
      }
    } catch (ApiException ex) {
      if (ex.getCode() == 404) {
        return null;
      } else {
        throw ex;
      }
    }
  }

  /**
  * Run a new Oozie workflow.
  * @param  body  workflow
  * @param  environment  environmentName
  * @param  deployment  deploymentName
  * @param  cluster  clusterName
  * @param  workflowUuid  workflowUuid
  * status code: 201 reason: "Created"
  * status code: 401 reason: "Unauthorized"
  * status code: 403 reason: "Forbidden"
  * status code: 404 reason: "Not Found"
  */
  public void dispatch(Workflow body, String environment, String deployment, String cluster, String workflowUuid) throws ApiException {
    Object postBody = body;
    // verify required params are set
    if (body == null || environment == null || deployment == null || cluster == null || workflowUuid == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/api/v6/environments/{environment}/deployments/{deployment}/clusters/{cluster}/workflows/{workflowUuid}"
      .replaceAll("\\{format\\}", "json")
      .replaceAll("\\{" + "environment" + "\\}",
                  apiClient.escapeString(environment.toString()))
      .replaceAll("\\{" + "deployment" + "\\}",
                  apiClient.escapeString(deployment.toString()))
      .replaceAll("\\{" + "cluster" + "\\}",
                  apiClient.escapeString(cluster.toString()))
      .replaceAll("\\{" + "workflowUuid" + "\\}",
                  apiClient.escapeString(workflowUuid.toString()))
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

    try {
      String response = apiClient.invokeAPI(path, "POST", queryParams, postBody,
        headerParams, formParams, contentTypes[0]);

      if (response != null) {
        return ;
      } else {
        return ;
      }
    } catch (ApiException ex) {
      if (ex.getCode() == 404) {
        return ;
      } else {
        throw ex;
      }
    }
  }

  /**
  * Terminate an Oozie workflow.
  * @param  environment  environmentName
  * @param  deployment  deploymentName
  * @param  cluster  clusterName
  * @param  workflowUuid  workflowUuid
  * status code: 200 reason: ""
  * status code: 204 reason: "No Content"
  * status code: 401 reason: "Unauthorized"
  * status code: 403 reason: "Forbidden"
  */
  public void terminate(String environment, String deployment, String cluster, String workflowUuid) throws ApiException {
    Object postBody = null;
    // verify required params are set
    if (environment == null || deployment == null || cluster == null || workflowUuid == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/api/v6/environments/{environment}/deployments/{deployment}/clusters/{cluster}/workflows/{workflowUuid}"
      .replaceAll("\\{format\\}", "json")
      .replaceAll("\\{" + "environment" + "\\}",
                  apiClient.escapeString(environment.toString()))
      .replaceAll("\\{" + "deployment" + "\\}",
                  apiClient.escapeString(deployment.toString()))
      .replaceAll("\\{" + "cluster" + "\\}",
                  apiClient.escapeString(cluster.toString()))
      .replaceAll("\\{" + "workflowUuid" + "\\}",
                  apiClient.escapeString(workflowUuid.toString()))
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

    try {
      String response = apiClient.invokeAPI(path, "DELETE", queryParams, postBody,
        headerParams, formParams, contentTypes[0]);

      if (response != null) {
        return ;
      } else {
        return ;
      }
    } catch (ApiException ex) {
      if (ex.getCode() == 404) {
        return ;
      } else {
        throw ex;
      }
    }
  }

  }

