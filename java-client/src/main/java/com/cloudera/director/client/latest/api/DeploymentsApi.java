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

package com.cloudera.director.client.latest.api;

import com.cloudera.director.client.latest.common.ApiException;
import com.cloudera.director.client.latest.common.ApiClient;

import com.cloudera.director.client.latest.model.Status;
import com.cloudera.director.client.latest.model.DeploymentTemplate;
import com.cloudera.director.client.latest.model.Deployment;
import com.sun.jersey.multipart.FormDataMultiPart;

import javax.ws.rs.core.MediaType;

import java.io.File;
import java.util.*;

public class DeploymentsApi {
  ApiClient apiClient;

  public ApiClient getClient() {
    return apiClient;
  }

  public DeploymentsApi (ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
  * Create a new deployment
  * @param  environment  environmentName
  * @param  XRequestId  requestId
  * @param  deploymentTemplate  deploymentTemplate
  * status code: 400 reason: "Invalid deployment template"
  * status code: 201 reason: "Deployment template accepted"
  * status code: 401 reason: "Unauthorized"
  * status code: 403 reason: "Forbidden"
  * status code: 404 reason: "Not Found"
  * status code: 302 reason: "Deployment already exists"
  */
  public void create (String environment, String XRequestId, DeploymentTemplate deploymentTemplate) throws ApiException {
    Object postBody = deploymentTemplate;
    // verify required params are set
    if(environment == null || deploymentTemplate == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/api/v2/environments/{environment}/deployments".replaceAll("\\{format\\}","json").replaceAll("\\{" + "environment" + "\\}", apiClient.escapeString(environment.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    headerParams.put("X-Request-Id", XRequestId);
    String contentType = "application/json";

    try {
      String response = apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return ;
      }
      else {
        return ;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	return ;
      }
      else {
        throw ex;
      }
    }
  }
  
  public void create (String environment, DeploymentTemplate deploymentTemplate) throws ApiException {
      create(environment, null, deploymentTemplate);
    }
  /**
  * Delete a deployment by name
  * @param  environment  environmentName
  * @param  deployment  deploymentName
  * @param  XRequestId  requestId
  * status code: 401 reason: "Unauthorized"
  * status code: 403 reason: "Forbidden"
  * status code: 204 reason: "Delete request accepted"
  * status code: 404 reason: "Entity not found"
  */
  public void delete (String environment, String deployment, String XRequestId) throws ApiException {
    Object postBody = null;
    // verify required params are set
    if(environment == null || deployment == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/api/v2/environments/{environment}/deployments/{deployment}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "environment" + "\\}", apiClient.escapeString(environment.toString())).replaceAll("\\{" + "deployment" + "\\}", apiClient.escapeString(deployment.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    headerParams.put("X-Request-Id", XRequestId);
    String contentType = "application/json";

    try {
      String response = apiClient.invokeAPI(path, "DELETE", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return ;
      }
      else {
        return ;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	return ;
      }
      else {
        throw ex;
      }
    }
  }
  
  public void delete (String environment, String deployment) throws ApiException {
      delete(environment, deployment, null);
    }
  /**
  * Get a deployment by name
  * @param  environment  environmentName
  * @param  deployment  deploymentName
  * status code: 200 reason: "OK"
  * status code: 401 reason: "Unauthorized"
  * status code: 403 reason: "Forbidden"
  * status code: 404 reason: "Entity not found"
  * status code: 204 reason: "Deployment is in transition (no content)"
  */
  public Deployment getRedacted (String environment, String deployment) throws ApiException {
    Object postBody = null;
    // verify required params are set
    if(environment == null || deployment == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/api/v2/environments/{environment}/deployments/{deployment}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "environment" + "\\}", apiClient.escapeString(environment.toString())).replaceAll("\\{" + "deployment" + "\\}", apiClient.escapeString(deployment.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    String contentType = "application/json";

    try {
      String response = apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (Deployment) ApiClient.deserialize(response, "", Deployment.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	return null;
      }
      else {
        throw ex;
      }
    }
  }
  
  /**
  * Get a deployment status by name
  * @param  environment  environmentName
  * @param  deployment  deploymentName
  * status code: 200 reason: "OK"
  * status code: 401 reason: "Unauthorized"
  * status code: 403 reason: "Forbidden"
  * status code: 404 reason: "Entity not found"
  */
  public Status getStatus (String environment, String deployment) throws ApiException {
    Object postBody = null;
    // verify required params are set
    if(environment == null || deployment == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/api/v2/environments/{environment}/deployments/{deployment}/status".replaceAll("\\{format\\}","json").replaceAll("\\{" + "environment" + "\\}", apiClient.escapeString(environment.toString())).replaceAll("\\{" + "deployment" + "\\}", apiClient.escapeString(deployment.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    String contentType = "application/json";

    try {
      String response = apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (Status) ApiClient.deserialize(response, "", Status.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	return null;
      }
      else {
        throw ex;
      }
    }
  }
  
  /**
  * Get a deployment template by name
  * @param  environment  environmentName
  * @param  deployment  deploymentName
  * status code: 200 reason: "OK"
  * status code: 401 reason: "Unauthorized"
  * status code: 403 reason: "Forbidden"
  * status code: 404 reason: "Entity not found"
  */
  public DeploymentTemplate getTemplateRedacted (String environment, String deployment) throws ApiException {
    Object postBody = null;
    // verify required params are set
    if(environment == null || deployment == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/api/v2/environments/{environment}/deployments/{deployment}/template".replaceAll("\\{format\\}","json").replaceAll("\\{" + "environment" + "\\}", apiClient.escapeString(environment.toString())).replaceAll("\\{" + "deployment" + "\\}", apiClient.escapeString(deployment.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    String contentType = "application/json";

    try {
      String response = apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (DeploymentTemplate) ApiClient.deserialize(response, "", DeploymentTemplate.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	return null;
      }
      else {
        throw ex;
      }
    }
  }
  
  /**
  * List all deployments
  * @param  environment  environmentName
  * status code: 200 reason: "OK"
  * status code: 401 reason: "Unauthorized"
  * status code: 403 reason: "Forbidden"
  * status code: 404 reason: "Environment not found"
  */
  public List<String> list (String environment) throws ApiException {
    Object postBody = null;
    // verify required params are set
    if(environment == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/api/v2/environments/{environment}/deployments".replaceAll("\\{format\\}","json").replaceAll("\\{" + "environment" + "\\}", apiClient.escapeString(environment.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    String contentType = "application/json";

    try {
      String response = apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (List<String>) ApiClient.deserialize(response, "List", String.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	return null;
      }
      else {
        throw ex;
      }
    }
  }
  
  /**
  * Update an existing deployment (unsupported)
  * @param  environment  environmentName
  * @param  deployment  deploymentName
  * @param  XRequestId  requestId
  * @param  updatedTemplate  updatedTemplate
  * status code: 400 reason: "Deployment update not supported"
  * status code: 201 reason: "Created"
  * status code: 401 reason: "Unauthorized"
  * status code: 403 reason: "Forbidden"
  * status code: 404 reason: "Not Found"
  */
  public void update (String environment, String deployment, String XRequestId, DeploymentTemplate updatedTemplate) throws ApiException {
    Object postBody = updatedTemplate;
    // verify required params are set
    if(environment == null || deployment == null || updatedTemplate == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/api/v2/environments/{environment}/deployments/{deployment}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "environment" + "\\}", apiClient.escapeString(environment.toString())).replaceAll("\\{" + "deployment" + "\\}", apiClient.escapeString(deployment.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    headerParams.put("X-Request-Id", XRequestId);
    String contentType = "application/json";

    try {
      String response = apiClient.invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return ;
      }
      else {
        return ;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	return ;
      }
      else {
        throw ex;
      }
    }
  }
  
  public void update (String environment, String deployment, DeploymentTemplate updatedTemplate) throws ApiException {
      update(environment, deployment, null, updatedTemplate);
    }
  }

