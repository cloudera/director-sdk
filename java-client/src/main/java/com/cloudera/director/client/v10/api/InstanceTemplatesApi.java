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

package com.cloudera.director.client.v10.api;

import com.cloudera.director.client.common.ApiClient;
import com.cloudera.director.client.common.ApiException;

import com.cloudera.director.client.v10.model.InstanceTemplate;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List; // NOPMD
import java.util.Map;

@SuppressWarnings("parametername")
public class InstanceTemplatesApi {
  ApiClient apiClient;

  public ApiClient getClient() {
    return apiClient;
  }

  public InstanceTemplatesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
  * Create a new instance template.
  * @param  environment  environmentName
  * @param  body  instanceTemplate
  * status code: 201 reason: "Instance template created"
  * status code: 302 reason: "Instance template already exists"
  * status code: 400 reason: "Invalid instance template"
  * status code: 401 reason: "Unauthorized"
  * status code: 403 reason: "Forbidden"
  * status code: 404 reason: "Environment not found"
  */
  public void create(String environment, InstanceTemplate body) throws ApiException {
    Object postBody = body;
    // verify required params are set
    if (environment == null || body == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/api/v10/environments/{environment}/templates/instances"
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
  * Delete an instance template by name.
  * @param  environment  environmentName
  * @param  template  templateName
  * status code: 204 reason: "Instance template deleted"
  * status code: 401 reason: "Unauthorized"
  * status code: 403 reason: "Forbidden"
  * status code: 404 reason: "Environment not found"
  */
  public void delete(String environment, String template) throws ApiException {
    Object postBody = null;
    // verify required params are set
    if (environment == null || template == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/api/v10/environments/{environment}/templates/instances/{template}"
      .replaceAll("\\{format\\}", "json")
      .replaceAll("\\{" + "environment" + "\\}",
                  apiClient.escapeString(environment.toString()))
      .replaceAll("\\{" + "template" + "\\}",
                  apiClient.escapeString(template.toString()))
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
  * Get an instance template by name.
  * @param  environment  environmentName
  * @param  template  templateName
  * status code: 200 reason: "OK"
  * status code: 401 reason: "Unauthorized"
  * status code: 403 reason: "Forbidden"
  * status code: 404 reason: "Entity not found"
  */
  public InstanceTemplate get(String environment, String template) throws ApiException {
    Object postBody = null;
    // verify required params are set
    if (environment == null || template == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/api/v10/environments/{environment}/templates/instances/{template}"
      .replaceAll("\\{format\\}", "json")
      .replaceAll("\\{" + "environment" + "\\}",
                  apiClient.escapeString(environment.toString()))
      .replaceAll("\\{" + "template" + "\\}",
                  apiClient.escapeString(template.toString()))
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
      return (InstanceTemplate) ApiClient.deserialize(response, "", InstanceTemplate.class);
    } else {
      return null;
    }
  }

  /**
  * List all instance templates.
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
    String path = "/api/v10/environments/{environment}/templates/instances"
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
  * Update an existing instance template.
  * @param  environment  environmentName
  * @param  template  templateName
  * @param  body  instanceTemplate
  * status code: 201 reason: "Created"
  * status code: 202 reason: ""
  * status code: 204 reason: "Accepted updated instance template"
  * status code: 400 reason: "Invalid instance template"
  * status code: 401 reason: "Unauthorized"
  * status code: 403 reason: "Forbidden"
  * status code: 404 reason: "Not Found"
  */
  public void update(String environment, String template, InstanceTemplate body) throws ApiException {
    Object postBody = body;
    // verify required params are set
    if (environment == null || template == null || body == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/api/v10/environments/{environment}/templates/instances/{template}"
      .replaceAll("\\{format\\}", "json")
      .replaceAll("\\{" + "environment" + "\\}",
                  apiClient.escapeString(environment.toString()))
      .replaceAll("\\{" + "template" + "\\}",
                  apiClient.escapeString(template.toString()))
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

