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

import com.cloudera.director.client.v5.model.ExternalDatabaseServer;
import com.cloudera.director.client.v5.model.ExternalDatabaseServerTemplate;
import com.cloudera.director.client.v5.model.ExternalDatabaseServerUsage;
import com.cloudera.director.client.v5.model.Status;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List; // NOPMD
import java.util.Map;

@SuppressWarnings("parametername")
public class DatabaseServersApi {
  ApiClient apiClient;

  public ApiClient getClient() {
    return apiClient;
  }

  public DatabaseServersApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
  * Create a new external database server.
  * @param  environment  environmentName
  * @param  body  externalDatabaseServerTemplate
  * status code: 201 reason: "External database server template accepted"
  * status code: 302 reason: "External database server already exists"
  * status code: 400 reason: "Invalid external database server template"
  * status code: 401 reason: "Unauthorized"
  * status code: 403 reason: "Forbidden"
  * status code: 404 reason: "Not Found"
  */
  public void create(String environment, ExternalDatabaseServerTemplate body) throws ApiException {
    Object postBody = body;
    // verify required params are set
    if (environment == null || body == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/api/v5/environments/{environment}/databaseServers"
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
  * Delete an external database server by name.
  * @param  environment  environmentName
  * @param  externalDatabaseServer  externalDatabaseServerName
  * status code: 204 reason: "Delete request accepted"
  * status code: 401 reason: "Unauthorized"
  * status code: 403 reason: "Forbidden"
  * status code: 404 reason: "Entity not found"
  */
  public void delete(String environment, String externalDatabaseServer) throws ApiException {
    Object postBody = null;
    // verify required params are set
    if (environment == null || externalDatabaseServer == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/api/v5/environments/{environment}/databaseServers/{externalDatabaseServer}"
      .replaceAll("\\{format\\}", "json")
      .replaceAll("\\{" + "environment" + "\\}",
                  apiClient.escapeString(environment.toString()))
      .replaceAll("\\{" + "externalDatabaseServer" + "\\}",
                  apiClient.escapeString(externalDatabaseServer.toString()))
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
  * Get an external database server usage by name.
  * @param  environment  environmentName
  * @param  externalDatabaseServer  externalDatabaseServerName
  * status code: 200 reason: "OK"
  * status code: 401 reason: "Unauthorized"
  * status code: 403 reason: "Forbidden"
  * status code: 404 reason: "Entity not found"
  */
  public ExternalDatabaseServerUsage getDatabaseServerUsage(String environment, String externalDatabaseServer) throws ApiException {
    Object postBody = null;
    // verify required params are set
    if (environment == null || externalDatabaseServer == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/api/v5/environments/{environment}/databaseServers/{externalDatabaseServer}/usage"
      .replaceAll("\\{format\\}", "json")
      .replaceAll("\\{" + "environment" + "\\}",
                  apiClient.escapeString(environment.toString()))
      .replaceAll("\\{" + "externalDatabaseServer" + "\\}",
                  apiClient.escapeString(externalDatabaseServer.toString()))
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
      return (ExternalDatabaseServerUsage) ApiClient.deserialize(response, "", ExternalDatabaseServerUsage.class);
    } else {
      return null;
    }
  }

  /**
  * Get an external database server by name.
  * @param  environment  environmentName
  * @param  externalDatabaseServer  externalDatabaseServerName
  * status code: 200 reason: "OK"
  * status code: 204 reason: "External database server is in transition or failed stage"
  * status code: 401 reason: "Unauthorized"
  * status code: 403 reason: "Forbidden"
  * status code: 404 reason: "Entity not found"
  */
  public ExternalDatabaseServer getRedacted(String environment, String externalDatabaseServer) throws ApiException {
    Object postBody = null;
    // verify required params are set
    if (environment == null || externalDatabaseServer == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/api/v5/environments/{environment}/databaseServers/{externalDatabaseServer}"
      .replaceAll("\\{format\\}", "json")
      .replaceAll("\\{" + "environment" + "\\}",
                  apiClient.escapeString(environment.toString()))
      .replaceAll("\\{" + "externalDatabaseServer" + "\\}",
                  apiClient.escapeString(externalDatabaseServer.toString()))
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
      return (ExternalDatabaseServer) ApiClient.deserialize(response, "", ExternalDatabaseServer.class);
    } else {
      return null;
    }
  }

  /**
  * Get an external database server status by name.
  * @param  environment  environmentName
  * @param  externalDatabaseServer  externalDatabaseServerName
  * status code: 200 reason: "OK"
  * status code: 401 reason: "Unauthorized"
  * status code: 403 reason: "Forbidden"
  * status code: 404 reason: "Entity not found"
  */
  public Status getStatus(String environment, String externalDatabaseServer) throws ApiException {
    Object postBody = null;
    // verify required params are set
    if (environment == null || externalDatabaseServer == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/api/v5/environments/{environment}/databaseServers/{externalDatabaseServer}/status"
      .replaceAll("\\{format\\}", "json")
      .replaceAll("\\{" + "environment" + "\\}",
                  apiClient.escapeString(environment.toString()))
      .replaceAll("\\{" + "externalDatabaseServer" + "\\}",
                  apiClient.escapeString(externalDatabaseServer.toString()))
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
  * Get an external database server template by name.
  * @param  environment  environmentName
  * @param  externalDatabaseServer  externalDatabaseServerName
  * status code: 200 reason: "OK"
  * status code: 401 reason: "Unauthorized"
  * status code: 403 reason: "Forbidden"
  * status code: 404 reason: "Entity not found"
  */
  public ExternalDatabaseServerTemplate getTemplateRedacted(String environment, String externalDatabaseServer) throws ApiException {
    Object postBody = null;
    // verify required params are set
    if (environment == null || externalDatabaseServer == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/api/v5/environments/{environment}/databaseServers/{externalDatabaseServer}/template"
      .replaceAll("\\{format\\}", "json")
      .replaceAll("\\{" + "environment" + "\\}",
                  apiClient.escapeString(environment.toString()))
      .replaceAll("\\{" + "externalDatabaseServer" + "\\}",
                  apiClient.escapeString(externalDatabaseServer.toString()))
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
      return (ExternalDatabaseServerTemplate) ApiClient.deserialize(response, "", ExternalDatabaseServerTemplate.class);
    } else {
      return null;
    }
  }

  /**
  * List all externalDatabaseServers.
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
    String path = "/api/v5/environments/{environment}/databaseServers"
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
  * Update an existing external database server (unsupported).
  * @param  environment  environmentName
  * @param  externalDatabaseServer  externalDatabaseServerName
  * @param  body  updatedTemplate
  * status code: 201 reason: "Created"
  * status code: 202 reason: ""
  * status code: 400 reason: "External database server update not supported"
  * status code: 401 reason: "Unauthorized"
  * status code: 403 reason: "Forbidden"
  * status code: 404 reason: "Not Found"
  */
  public void update(String environment, String externalDatabaseServer, ExternalDatabaseServerTemplate body) throws ApiException {
    Object postBody = body;
    // verify required params are set
    if (environment == null || externalDatabaseServer == null || body == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/api/v5/environments/{environment}/databaseServers/{externalDatabaseServer}"
      .replaceAll("\\{format\\}", "json")
      .replaceAll("\\{" + "environment" + "\\}",
                  apiClient.escapeString(environment.toString()))
      .replaceAll("\\{" + "externalDatabaseServer" + "\\}",
                  apiClient.escapeString(externalDatabaseServer.toString()))
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

