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

package com.cloudera.director.client.v8.api;

import com.cloudera.director.client.common.ApiClient;
import com.cloudera.director.client.common.ApiException;

import com.cloudera.director.client.v8.model.ImportResult;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List; // NOPMD
import java.util.Map;

@SuppressWarnings("parametername")
public class ImportClientConfigApi {
  ApiClient apiClient;

  public ApiClient getClient() {
    return apiClient;
  }

  public ImportClientConfigApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
  * Import Client Config.
  * @param  body  clientConfig
  * @param  clusterName  clusterName
  * @param  deploymentName  deploymentName
  * @param  environmentName  environmentName
  * status code: 201 reason: "Created"
  * status code: 202 reason: "Import request accepted"
  * status code: 401 reason: "Unauthorized"
  * status code: 403 reason: "Forbidden"
  * status code: 404 reason: "Not Found"
  */
  public ImportResult importClientConfig(String body, String clusterName, String deploymentName, String environmentName) throws ApiException {
    Object postBody = body;
    // verify required params are set
    if (body == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/api/v8/import"
      .replaceAll("\\{format\\}", "json")
      ;

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if (!"null".equals(String.valueOf(clusterName)))
      queryParams.put("clusterName", String.valueOf(clusterName));
    if (!"null".equals(String.valueOf(deploymentName)))
      queryParams.put("deploymentName", String.valueOf(deploymentName));
    if (!"null".equals(String.valueOf(environmentName)))
      queryParams.put("environmentName", String.valueOf(environmentName));
    String[] contentTypes = { "text/plain"};
    if (contentTypes.length != 1) {
      throw new IllegalArgumentException("An API client expects a single content type. Got: "
        + Arrays.toString(contentTypes));
    }

    String response = apiClient.invokeAPI(path, "POST", queryParams, postBody,
      headerParams, formParams, contentTypes[0]);

    if (response != null) {
      return (ImportResult) ApiClient.deserialize(response, "", ImportResult.class);
    } else {
      return null;
    }
  }

  public ImportResult importClientConfig(String body) throws ApiException {
     return importClientConfig(body, null, null, null);
    }
  }

