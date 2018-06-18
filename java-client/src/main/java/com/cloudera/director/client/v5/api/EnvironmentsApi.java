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

package com.cloudera.director.client.v5.api;

import com.cloudera.director.client.common.ApiClient;
import com.cloudera.director.client.common.ApiException;

import com.cloudera.director.client.v5.model.Environment;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List; // NOPMD
import java.util.Map;

@SuppressWarnings("parametername")
public class EnvironmentsApi {
  ApiClient apiClient;

  public ApiClient getClient() {
    return apiClient;
  }

  public EnvironmentsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
  * Create a new environment.
  * @param  body  environment
  * status code: 201 reason: "Environment created"
  * status code: 302 reason: "Environment already exists"
  * status code: 400 reason: "Invalid environment"
  * status code: 401 reason: "Unauthorized"
  * status code: 403 reason: "Forbidden"
  * status code: 404 reason: "Not Found"
  */
  public void create(Environment body) throws ApiException {
    Object postBody = body;
    // verify required params are set
    if (body == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/api/v5/environments"
      .replaceAll("\\{format\\}", "json")
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
  * Delete an environment by name.
  * @param  name  environmentName
  * status code: 204 reason: "Environment deleted"
  * status code: 400 reason: "Environment is not empty"
  * status code: 401 reason: "Unauthorized"
  * status code: 403 reason: "Forbidden"
  */
  public void delete(String name) throws ApiException {
    Object postBody = null;
    // verify required params are set
    if (name == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/api/v5/environments/{name}"
      .replaceAll("\\{format\\}", "json")
      .replaceAll("\\{" + "name" + "\\}",
                  apiClient.escapeString(name.toString()))
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
  * Get an environment by name.
  * @param  name  name
  * status code: 200 reason: "OK"
  * status code: 401 reason: "Unauthorized"
  * status code: 403 reason: "Forbidden"
  * status code: 404 reason: "Environment not found"
  */
  public Environment getRedacted(String name) throws ApiException {
    Object postBody = null;
    // verify required params are set
    if (name == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/api/v5/environments/{name}"
      .replaceAll("\\{format\\}", "json")
      .replaceAll("\\{" + "name" + "\\}",
                  apiClient.escapeString(name.toString()))
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
      headerParams, formParams, contentTypes[0], "", Environment.class);
    return (Environment) response;}


  /**
  * List all environments.
  * status code: 200 reason: "OK"
  * status code: 401 reason: "Unauthorized"
  * status code: 403 reason: "Forbidden"
  * status code: 404 reason: "Not Found"
  */
  public List<String> list() throws ApiException {
    Object postBody = null;
    // create path and map variables
    String path = "/api/v5/environments"
      .replaceAll("\\{format\\}", "json")
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
  * Update an existing environment.
  * @param  name  environmentName
  * @param  body  environment
  * status code: 201 reason: "Created"
  * status code: 202 reason: "Updated environment accepted"
  * status code: 400 reason: "Validation error or rename not allowed"
  * status code: 401 reason: "Unauthorized"
  * status code: 403 reason: "Forbidden"
  * status code: 404 reason: "Environment not found"
  */
  public void update(String name, Environment body) throws ApiException {
    Object postBody = body;
    // verify required params are set
    if (name == null || body == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/api/v5/environments/{name}"
      .replaceAll("\\{format\\}", "json")
      .replaceAll("\\{" + "name" + "\\}",
                  apiClient.escapeString(name.toString()))
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
  * Update provider credentials for a specific environment.
  * @param  name  environmentName
  * @param  body  credentials
  * status code: 201 reason: "Created"
  * status code: 202 reason: "Updated environment accepted"
  * status code: 400 reason: "Validation error or rename not allowed"
  * status code: 401 reason: "Unauthorized"
  * status code: 403 reason: "Forbidden"
  * status code: 404 reason: "Environment not found"
  */
  public void updateProviderCredentials(String name, Map<String, String> body) throws ApiException {
    Object postBody = body;
    // verify required params are set
    if (name == null || body == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/api/v5/environments/{name}/provider/credentials"
      .replaceAll("\\{format\\}", "json")
      .replaceAll("\\{" + "name" + "\\}",
                  apiClient.escapeString(name.toString()))
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

