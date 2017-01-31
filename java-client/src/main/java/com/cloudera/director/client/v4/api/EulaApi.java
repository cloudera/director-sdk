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

package com.cloudera.director.client.v4.api;

import com.cloudera.director.client.common.ApiClient;
import com.cloudera.director.client.common.ApiException;

import com.cloudera.director.client.v4.model.Eula;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List; // NOPMD
import java.util.Map;

@SuppressWarnings("parametername")
public class EulaApi {
  ApiClient apiClient;

  public ApiClient getClient() {
    return apiClient;
  }

  public EulaApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
  * Get the EULA.
  * status code: 200 reason: "OK"
  * status code: 401 reason: "Unauthorized"
  * status code: 403 reason: "Forbidden"
  * status code: 404 reason: "Not Found"
  */
  public Eula get() throws ApiException {
    Object postBody = null;
    // create path and map variables
    String path = "/api/v4/eula"
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

    String response = apiClient.invokeAPI(path, "GET", queryParams, postBody,
      headerParams, formParams, contentTypes[0]);

    if (response != null) {
      return (Eula) ApiClient.deserialize(response, "", Eula.class);
    } else {
      return null;
    }
  }

  /**
  * Update the EULA.
  * @param  body  eula
  * status code: 200 reason: "OK"
  * status code: 201 reason: "Created"
  * status code: 202 reason: ""
  * status code: 400 reason: "Invalid eula data."
  * status code: 401 reason: "Unauthorized"
  * status code: 403 reason: "Forbidden"
  * status code: 404 reason: "Not Found"
  */
  public void update(Eula body) throws ApiException {
    Object postBody = body;
    // verify required params are set
    if (body == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/api/v4/eula"
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

    String response = apiClient.invokeAPI(path, "PUT", queryParams, postBody,
      headerParams, formParams, contentTypes[0]);

    if (response != null) {
      return ;
    } else {
      return ;
    }
  }

  }

