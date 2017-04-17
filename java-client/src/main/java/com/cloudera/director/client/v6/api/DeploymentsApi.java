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

import com.cloudera.director.client.v6.model.Deployment;
import com.cloudera.director.client.v6.model.DeploymentTemplate;
import com.cloudera.director.client.v6.model.MeteringSetting;
import com.cloudera.director.client.v6.model.Status;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List; // NOPMD
import java.util.Map;

@SuppressWarnings("parametername")
public class DeploymentsApi {
  ApiClient apiClient;

  public ApiClient getClient() {
    return apiClient;
  }

  public DeploymentsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
  * Collects diagnostic data.
  * @param  environment  environmentName
  * @param  deployment  deploymentName
  * status code: 201 reason: "Created"
  * status code: 202 reason: "Accepted"
  * status code: 401 reason: "Unauthorized"
  * status code: 403 reason: "Forbidden"
  * status code: 404 reason: "Entity not found"
  * status code: 409 reason: "Deployment is in transition"
  * status code: 412 reason: "Deployment is not available"
  */
  public void collectDiagnosticData(String environment, String deployment) throws ApiException {
    Object postBody = null;
    // verify required params are set
    if (environment == null || deployment == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/api/v6/environments/{environment}/deployments/{deployment}/diagnosticData"
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

    String response = apiClient.invokeAPI(path, "POST", queryParams, postBody,
      headerParams, formParams, contentTypes[0]);

    if (response != null) {
      return ;
    } else {
      return ;
    }
  }

  /**
  * Create a new deployment.
  * @param  environment  environmentName
  * @param  body  deploymentTemplate
  * status code: 201 reason: "Deployment template accepted"
  * status code: 302 reason: "Deployment already exists"
  * status code: 400 reason: "Invalid deployment template"
  * status code: 401 reason: "Unauthorized"
  * status code: 403 reason: "Forbidden"
  * status code: 404 reason: "Not Found"
  */
  public void create(String environment, DeploymentTemplate body) throws ApiException {
    Object postBody = body;
    // verify required params are set
    if (environment == null || body == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/api/v6/environments/{environment}/deployments"
      .replaceAll("\\{format\\}", "json")
      .replaceAll("\\{" + "environment" + "\\}",
                  apiClient.escapeString(environment.toString()))
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

    String response = apiClient.invokeAPI(path, "POST", queryParams, postBody,
      headerParams, formParams, contentTypes[0]);

    if (response != null) {
      return ;
    } else {
      return ;
    }
  }

  /**
  * Delete a deployment by name.
  * @param  environment  environmentName
  * @param  deployment  deploymentName
  * status code: 204 reason: "Delete request accepted"
  * status code: 401 reason: "Unauthorized"
  * status code: 403 reason: "Forbidden"
  * status code: 404 reason: "Entity not found"
  */
  public void delete(String environment, String deployment) throws ApiException {
    Object postBody = null;
    // verify required params are set
    if (environment == null || deployment == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/api/v6/environments/{environment}/deployments/{deployment}"
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

    String response = apiClient.invokeAPI(path, "DELETE", queryParams, postBody,
      headerParams, formParams, contentTypes[0]);

    if (response != null) {
      return ;
    } else {
      return ;
    }
  }

  /**
  * Get a deployment by name.
  * @param  environment  environmentName
  * @param  deployment  deploymentName
  * status code: 200 reason: "OK"
  * status code: 204 reason: "Deployment is in transition or failed stage"
  * status code: 401 reason: "Unauthorized"
  * status code: 403 reason: "Forbidden"
  * status code: 404 reason: "Entity not found"
  */
  public Deployment getRedacted(String environment, String deployment) throws ApiException {
    Object postBody = null;
    // verify required params are set
    if (environment == null || deployment == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/api/v6/environments/{environment}/deployments/{deployment}"
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

    String response = apiClient.invokeAPI(path, "GET", queryParams, postBody,
      headerParams, formParams, contentTypes[0]);

    if (response != null) {
      return (Deployment) ApiClient.deserialize(response, "", Deployment.class);
    } else {
      return null;
    }
  }

  /**
  * Get a deployment status by name.
  * @param  environment  environmentName
  * @param  deployment  deploymentName
  * status code: 200 reason: "OK"
  * status code: 401 reason: "Unauthorized"
  * status code: 403 reason: "Forbidden"
  * status code: 404 reason: "Entity not found"
  */
  public Status getStatus(String environment, String deployment) throws ApiException {
    Object postBody = null;
    // verify required params are set
    if (environment == null || deployment == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/api/v6/environments/{environment}/deployments/{deployment}/status"
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

    String response = apiClient.invokeAPI(path, "GET", queryParams, postBody,
      headerParams, formParams, contentTypes[0]);

    if (response != null) {
      return (Status) ApiClient.deserialize(response, "", Status.class);
    } else {
      return null;
    }
  }

  /**
  * Get a deployment template by name.
  * @param  environment  environmentName
  * @param  deployment  deploymentName
  * status code: 200 reason: "OK"
  * status code: 401 reason: "Unauthorized"
  * status code: 403 reason: "Forbidden"
  * status code: 404 reason: "Entity not found"
  */
  public DeploymentTemplate getTemplateRedacted(String environment, String deployment) throws ApiException {
    Object postBody = null;
    // verify required params are set
    if (environment == null || deployment == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/api/v6/environments/{environment}/deployments/{deployment}/template"
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

    String response = apiClient.invokeAPI(path, "GET", queryParams, postBody,
      headerParams, formParams, contentTypes[0]);

    if (response != null) {
      return (DeploymentTemplate) ApiClient.deserialize(response, "", DeploymentTemplate.class);
    } else {
      return null;
    }
  }

  /**
  * List all deployments.
  * @param  environment  environmentName
  * status code: 200 reason: "OK"
  * status code: 401 reason: "Unauthorized"
  * status code: 403 reason: "Forbidden"
  * status code: 404 reason: "Environment not found"
  */
  public List<String> list(String environment) throws ApiException {
    Object postBody = null;
    // verify required params are set
    if (environment == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/api/v6/environments/{environment}/deployments"
      .replaceAll("\\{format\\}", "json")
      .replaceAll("\\{" + "environment" + "\\}",
                  apiClient.escapeString(environment.toString()))
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

    String response = apiClient.invokeAPI(path, "GET", queryParams, postBody,
      headerParams, formParams, contentTypes[0]);

    if (response != null) {
      return (List<String>) ApiClient.deserialize(response, "List", String.class);
    } else {
      return null;
    }
  }

  /**
  * Update an existing deployment template.
  * @param  environment  environmentName
  * @param  deployment  deploymentName
  * @param  body  updatedTemplate
  * status code: 201 reason: "Created"
  * status code: 202 reason: ""
  * status code: 400 reason: "Deployment template update not supported"
  * status code: 401 reason: "Unauthorized"
  * status code: 403 reason: "Forbidden"
  * status code: 404 reason: "Not Found"
  */
  public void update(String environment, String deployment, DeploymentTemplate body) throws ApiException {
    Object postBody = body;
    // verify required params are set
    if (environment == null || deployment == null || body == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/api/v6/environments/{environment}/deployments/{deployment}"
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

    String response = apiClient.invokeAPI(path, "PUT", queryParams, postBody,
      headerParams, formParams, contentTypes[0]);

    if (response != null) {
      return ;
    } else {
      return ;
    }
  }

  /**
  * Update billing ID for an existing deployment.
  * @param  environment  environmentName
  * @param  deployment  deploymentName
  * @param  body  meteringSetting
  * status code: 201 reason: "Created"
  * status code: 202 reason: ""
  * status code: 400 reason: "Update billing ID failed"
  * status code: 401 reason: "Unauthorized"
  * status code: 403 reason: "Forbidden"
  * status code: 404 reason: "Not Found"
  */
  public void updateMeteringSetting(String environment, String deployment, MeteringSetting body) throws ApiException {
    Object postBody = body;
    // verify required params are set
    if (environment == null || deployment == null || body == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/api/v6/environments/{environment}/deployments/{deployment}/metering"
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

    String response = apiClient.invokeAPI(path, "PUT", queryParams, postBody,
      headerParams, formParams, contentTypes[0]);

    if (response != null) {
      return ;
    } else {
      return ;
    }
  }

  }

