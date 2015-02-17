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

import com.cloudera.director.client.latest.model.InstanceTemplate;
import com.sun.jersey.multipart.FormDataMultiPart;

import javax.ws.rs.core.MediaType;

import java.io.File;
import java.util.*;

public class InstanceTemplatesApi {
  ApiClient apiClient;

  public ApiClient getClient() {
    return apiClient;
  }

  public InstanceTemplatesApi (ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
  * Create a new instance template
  * @param  environment  environmentName
  * @param  instanceTemplate  instanceTemplate
  * status code: 400 reason: "Invalid instance template"
  * status code: 201 reason: "Instance template created"
  * status code: 401 reason: "Unauthorized"
  * status code: 403 reason: "Forbidden"
  * status code: 404 reason: "Environment not found"
  * status code: 302 reason: "Instance template already exists"
  */
  public void create (String environment, InstanceTemplate instanceTemplate) throws ApiException {
    Object postBody = instanceTemplate;
    // verify required params are set
    if(environment == null || instanceTemplate == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/api/v2/environments/{environment}/templates/instances".replaceAll("\\{format\\}","json").replaceAll("\\{" + "environment" + "\\}", apiClient.escapeString(environment.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

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
  
  /**
  * Delete an instance template by name
  * @param  environment  environmentName
  * @param  template  templateName
  * status code: 401 reason: "Unauthorized"
  * status code: 403 reason: "Forbidden"
  * status code: 204 reason: "Instance template deleted"
  * status code: 404 reason: "Environment not found"
  */
  public void delete (String environment, String template) throws ApiException {
    Object postBody = null;
    // verify required params are set
    if(environment == null || template == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/api/v2/environments/{environment}/templates/instances/{template}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "environment" + "\\}", apiClient.escapeString(environment.toString())).replaceAll("\\{" + "template" + "\\}", apiClient.escapeString(template.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

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
  
  /**
  * Get an instance template by name
  * @param  environment  environmentName
  * @param  template  templateName
  * status code: 200 reason: "OK"
  * status code: 401 reason: "Unauthorized"
  * status code: 403 reason: "Forbidden"
  * status code: 404 reason: "Entity not found"
  */
  public InstanceTemplate get (String environment, String template) throws ApiException {
    Object postBody = null;
    // verify required params are set
    if(environment == null || template == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/api/v2/environments/{environment}/templates/instances/{template}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "environment" + "\\}", apiClient.escapeString(environment.toString())).replaceAll("\\{" + "template" + "\\}", apiClient.escapeString(template.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    String contentType = "application/json";

    try {
      String response = apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (InstanceTemplate) ApiClient.deserialize(response, "", InstanceTemplate.class);
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
  * List all instance templates
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
    String path = "/api/v2/environments/{environment}/templates/instances".replaceAll("\\{format\\}","json").replaceAll("\\{" + "environment" + "\\}", apiClient.escapeString(environment.toString()));

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
  * Update an existing instance template
  * @param  environment  environmentName
  * @param  template  templateName
  * @param  instanceTemplate  instanceTemplate
  * status code: 400 reason: "Invalid instance template"
  * status code: 201 reason: "Created"
  * status code: 401 reason: "Unauthorized"
  * status code: 403 reason: "Forbidden"
  * status code: 404 reason: "Not Found"
  * status code: 204 reason: "Accepted updated instance template"
  */
  public void update (String environment, String template, InstanceTemplate instanceTemplate) throws ApiException {
    Object postBody = instanceTemplate;
    // verify required params are set
    if(environment == null || template == null || instanceTemplate == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/api/v2/environments/{environment}/templates/instances/{template}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "environment" + "\\}", apiClient.escapeString(environment.toString())).replaceAll("\\{" + "template" + "\\}", apiClient.escapeString(template.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

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
  
  }

