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


package com.cloudera.director.client.v11.api;

import com.cloudera.director.client.common.ApiCallback;
import com.cloudera.director.client.common.ApiClient;
import com.cloudera.director.client.common.ApiException;
import com.cloudera.director.client.common.ApiResponse;
import com.cloudera.director.client.common.Configuration;
import com.cloudera.director.client.common.Pair;
import com.cloudera.director.client.common.ProgressRequestBody;
import com.cloudera.director.client.common.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.cloudera.director.client.v11.model.ImportResult;
import com.cloudera.director.client.v11.model.ValidationResult;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ImportClientConfigApi {
    private ApiClient apiClient;

    public ImportClientConfigApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ImportClientConfigApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for importClientConfig
     * @param clientConfig clientConfig (required)
     * @param clusterName clusterName (optional)
     * @param deploymentName deploymentName (optional)
     * @param environmentName environmentName (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call importClientConfigCall(String clientConfig, String clusterName, String deploymentName, String environmentName, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = clientConfig;

        // create path and map variables
        String localVarPath = "/api/v11/import";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (clusterName != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("clusterName", clusterName));
        if (deploymentName != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("deploymentName", deploymentName));
        if (environmentName != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("environmentName", environmentName));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "*/*"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "text/plain"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "basic" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call importClientConfigValidateBeforeCall(String clientConfig, String clusterName, String deploymentName, String environmentName, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'clientConfig' is set
        if (clientConfig == null) {
            throw new ApiException("Missing the required parameter 'clientConfig' when calling importClientConfig(Async)");
        }
        

        com.squareup.okhttp.Call call = importClientConfigCall(clientConfig, clusterName, deploymentName, environmentName, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Import Client Config
     * 
     * @param clientConfig clientConfig (required)
     * @param clusterName clusterName (optional)
     * @param deploymentName deploymentName (optional)
     * @param environmentName environmentName (optional)
     * @return ImportResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ImportResult importClientConfig(String clientConfig, String clusterName, String deploymentName, String environmentName) throws ApiException {
        ApiResponse<ImportResult> resp = importClientConfigWithHttpInfo(clientConfig, clusterName, deploymentName, environmentName);
        return resp.getData();
    }

    /**
     * Import Client Config
     * 
     * @param clientConfig clientConfig (required)
     * @param clusterName clusterName (optional)
     * @param deploymentName deploymentName (optional)
     * @param environmentName environmentName (optional)
     * @return ApiResponse&lt;ImportResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ImportResult> importClientConfigWithHttpInfo(String clientConfig, String clusterName, String deploymentName, String environmentName) throws ApiException {
        com.squareup.okhttp.Call call = importClientConfigValidateBeforeCall(clientConfig, clusterName, deploymentName, environmentName, null, null);
        Type localVarReturnType = new TypeToken<ImportResult>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Import Client Config (asynchronously)
     * 
     * @param clientConfig clientConfig (required)
     * @param clusterName clusterName (optional)
     * @param deploymentName deploymentName (optional)
     * @param environmentName environmentName (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call importClientConfigAsync(String clientConfig, String clusterName, String deploymentName, String environmentName, final ApiCallback<ImportResult> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = importClientConfigValidateBeforeCall(clientConfig, clusterName, deploymentName, environmentName, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ImportResult>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for validate
     * @param clientConfig clientConfig (required)
     * @param clusterName clusterName (optional)
     * @param deploymentName deploymentName (optional)
     * @param environmentName environmentName (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call validateCall(String clientConfig, String clusterName, String deploymentName, String environmentName, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = clientConfig;

        // create path and map variables
        String localVarPath = "/api/v11/import/clientConfig/validate";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (clusterName != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("clusterName", clusterName));
        if (deploymentName != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("deploymentName", deploymentName));
        if (environmentName != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("environmentName", environmentName));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "text/plain"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "basic" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call validateValidateBeforeCall(String clientConfig, String clusterName, String deploymentName, String environmentName, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'clientConfig' is set
        if (clientConfig == null) {
            throw new ApiException("Missing the required parameter 'clientConfig' when calling validate(Async)");
        }
        

        com.squareup.okhttp.Call call = validateCall(clientConfig, clusterName, deploymentName, environmentName, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Validate Client Config
     * 
     * @param clientConfig clientConfig (required)
     * @param clusterName clusterName (optional)
     * @param deploymentName deploymentName (optional)
     * @param environmentName environmentName (optional)
     * @return ValidationResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ValidationResult validate(String clientConfig, String clusterName, String deploymentName, String environmentName) throws ApiException {
        ApiResponse<ValidationResult> resp = validateWithHttpInfo(clientConfig, clusterName, deploymentName, environmentName);
        return resp.getData();
    }

    /**
     * Validate Client Config
     * 
     * @param clientConfig clientConfig (required)
     * @param clusterName clusterName (optional)
     * @param deploymentName deploymentName (optional)
     * @param environmentName environmentName (optional)
     * @return ApiResponse&lt;ValidationResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ValidationResult> validateWithHttpInfo(String clientConfig, String clusterName, String deploymentName, String environmentName) throws ApiException {
        com.squareup.okhttp.Call call = validateValidateBeforeCall(clientConfig, clusterName, deploymentName, environmentName, null, null);
        Type localVarReturnType = new TypeToken<ValidationResult>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Validate Client Config (asynchronously)
     * 
     * @param clientConfig clientConfig (required)
     * @param clusterName clusterName (optional)
     * @param deploymentName deploymentName (optional)
     * @param environmentName environmentName (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call validateAsync(String clientConfig, String clusterName, String deploymentName, String environmentName, final ApiCallback<ValidationResult> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = validateValidateBeforeCall(clientConfig, clusterName, deploymentName, environmentName, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ValidationResult>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
