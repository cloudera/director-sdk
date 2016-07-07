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

package com.cloudera.director.client.common;

import java.util.HashMap;
import java.util.Map;

public class VersionsApi {
  private ApiClient apiClient;

  public VersionsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Returns the current version information.
   *
   * @return The current version information.
   * @throws ApiException
   */
  public Version get() throws ApiException {
    return (Version) ApiClient.deserialize(getResponse("/api/versions"), "",
        Version.class);
  }

  /**
   * Returns the latest API version supported by Director.
   *
   * @return The latest API version supported by Director.
   * @throws ApiException
   */
  public String getLatestApiVersion() throws ApiException {
    return (String) ApiClient.deserialize(getResponse("/api/versions/latest"), "", String.class);
  }

  // Gets the response as a string from the given endpoint
  private String getResponse(String endpoint) throws ApiException {
    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    String contentType = "application/json";

    return apiClient.invokeAPI(endpoint, "GET", queryParams, null, headerParams, formParams,
        contentType);
  }
}

