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

import com.cloudera.director.client.v10.model.CloudProviderMetadata;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List; // NOPMD
import java.util.Map;

@SuppressWarnings("parametername")
public class ProviderMetadataApi {
  ApiClient apiClient;

  public ApiClient getClient() {
    return apiClient;
  }

  public ProviderMetadataApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
  * Get a provider by name.
  * @param  providerId  providerId
  * status code: 200 reason: "OK"
  * status code: 401 reason: "Unauthorized"
  * status code: 403 reason: "Forbidden"
  * status code: 404 reason: "Not found"
  */
  public CloudProviderMetadata get(String providerId) throws ApiException {
    Object postBody = null;
    // verify required params are set
    if (providerId == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/api/v10/metadata/providers/{providerId}"
      .replaceAll("\\{format\\}", "json")
      .replaceAll("\\{" + "providerId" + "\\}",
                  apiClient.escapeString(providerId.toString()))
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
      return (CloudProviderMetadata) ApiClient.deserialize(response, "", CloudProviderMetadata.class);
    } else {
      return null;
    }
  }

  /**
  * List all provider metadata.
  * status code: 200 reason: "OK"
  * status code: 401 reason: "Unauthorized"
  * status code: 403 reason: "Forbidden"
  * status code: 404 reason: "Not Found"
  */
  public List<CloudProviderMetadata> list() throws ApiException {
    Object postBody = null;
    // create path and map variables
    String path = "/api/v10/metadata/providers"
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
      return (List<CloudProviderMetadata>) ApiClient.deserialize(response, "List", CloudProviderMetadata.class);
    } else {
      return null;
    }
  }

  }

