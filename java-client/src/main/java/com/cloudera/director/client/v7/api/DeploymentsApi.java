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


package com.cloudera.director.client.v7.api;

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


import com.cloudera.director.client.v7.model.Deployment;
import com.cloudera.director.client.v7.model.DeploymentTemplate;
import com.cloudera.director.client.v7.model.MeteringSetting;
import com.cloudera.director.client.v7.model.Status;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DeploymentsApi {
    private ApiClient apiClient;

    public DeploymentsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public DeploymentsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for collectDiagnosticData
     * @param environment  (required)
     * @param deployment  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call collectDiagnosticDataCall(String environment, String deployment, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/v7/environments/{environment}/deployments/{deployment}/diagnosticData"
            .replaceAll("\\{" + "environment" + "\\}", apiClient.escapeString(environment.toString()))
            .replaceAll("\\{" + "deployment" + "\\}", apiClient.escapeString(deployment.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
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
    private com.squareup.okhttp.Call collectDiagnosticDataValidateBeforeCall(String environment, String deployment, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'environment' is set
        if (environment == null) {
            throw new ApiException("Missing the required parameter 'environment' when calling collectDiagnosticData(Async)");
        }
        
        // verify the required parameter 'deployment' is set
        if (deployment == null) {
            throw new ApiException("Missing the required parameter 'deployment' when calling collectDiagnosticData(Async)");
        }
        

        com.squareup.okhttp.Call call = collectDiagnosticDataCall(environment, deployment, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Collects diagnostic data
     * 
     * @param environment  (required)
     * @param deployment  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void collectDiagnosticData(String environment, String deployment) throws ApiException {
        collectDiagnosticDataWithHttpInfo(environment, deployment);
    }

    /**
     * Collects diagnostic data
     * 
     * @param environment  (required)
     * @param deployment  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> collectDiagnosticDataWithHttpInfo(String environment, String deployment) throws ApiException {
        com.squareup.okhttp.Call call = collectDiagnosticDataValidateBeforeCall(environment, deployment, null, null);
        return apiClient.execute(call);
    }

    /**
     * Collects diagnostic data (asynchronously)
     * 
     * @param environment  (required)
     * @param deployment  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call collectDiagnosticDataAsync(String environment, String deployment, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = collectDiagnosticDataValidateBeforeCall(environment, deployment, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for create
     * @param environment  (required)
     * @param deploymentTemplate  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createCall(String environment, DeploymentTemplate deploymentTemplate, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = deploymentTemplate;

        // create path and map variables
        String localVarPath = "/api/v7/environments/{environment}/deployments"
            .replaceAll("\\{" + "environment" + "\\}", apiClient.escapeString(environment.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
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
    private com.squareup.okhttp.Call createValidateBeforeCall(String environment, DeploymentTemplate deploymentTemplate, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'environment' is set
        if (environment == null) {
            throw new ApiException("Missing the required parameter 'environment' when calling create(Async)");
        }
        
        // verify the required parameter 'deploymentTemplate' is set
        if (deploymentTemplate == null) {
            throw new ApiException("Missing the required parameter 'deploymentTemplate' when calling create(Async)");
        }
        

        com.squareup.okhttp.Call call = createCall(environment, deploymentTemplate, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Create a new deployment
     * 
     * @param environment  (required)
     * @param deploymentTemplate  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void create(String environment, DeploymentTemplate deploymentTemplate) throws ApiException {
        createWithHttpInfo(environment, deploymentTemplate);
    }

    /**
     * Create a new deployment
     * 
     * @param environment  (required)
     * @param deploymentTemplate  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> createWithHttpInfo(String environment, DeploymentTemplate deploymentTemplate) throws ApiException {
        com.squareup.okhttp.Call call = createValidateBeforeCall(environment, deploymentTemplate, null, null);
        return apiClient.execute(call);
    }

    /**
     * Create a new deployment (asynchronously)
     * 
     * @param environment  (required)
     * @param deploymentTemplate  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createAsync(String environment, DeploymentTemplate deploymentTemplate, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = createValidateBeforeCall(environment, deploymentTemplate, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for delete
     * @param environment  (required)
     * @param deployment  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteCall(String environment, String deployment, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/v7/environments/{environment}/deployments/{deployment}"
            .replaceAll("\\{" + "environment" + "\\}", apiClient.escapeString(environment.toString()))
            .replaceAll("\\{" + "deployment" + "\\}", apiClient.escapeString(deployment.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
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
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deleteValidateBeforeCall(String environment, String deployment, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'environment' is set
        if (environment == null) {
            throw new ApiException("Missing the required parameter 'environment' when calling delete(Async)");
        }
        
        // verify the required parameter 'deployment' is set
        if (deployment == null) {
            throw new ApiException("Missing the required parameter 'deployment' when calling delete(Async)");
        }
        

        com.squareup.okhttp.Call call = deleteCall(environment, deployment, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Delete a deployment by name
     * 
     * @param environment  (required)
     * @param deployment  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void delete(String environment, String deployment) throws ApiException {
        deleteWithHttpInfo(environment, deployment);
    }

    /**
     * Delete a deployment by name
     * 
     * @param environment  (required)
     * @param deployment  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteWithHttpInfo(String environment, String deployment) throws ApiException {
        com.squareup.okhttp.Call call = deleteValidateBeforeCall(environment, deployment, null, null);
        return apiClient.execute(call);
    }

    /**
     * Delete a deployment by name (asynchronously)
     * 
     * @param environment  (required)
     * @param deployment  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteAsync(String environment, String deployment, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteValidateBeforeCall(environment, deployment, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for getRedacted
     * @param environment  (required)
     * @param deployment  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getRedactedCall(String environment, String deployment, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/v7/environments/{environment}/deployments/{deployment}"
            .replaceAll("\\{" + "environment" + "\\}", apiClient.escapeString(environment.toString()))
            .replaceAll("\\{" + "deployment" + "\\}", apiClient.escapeString(deployment.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
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
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getRedactedValidateBeforeCall(String environment, String deployment, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'environment' is set
        if (environment == null) {
            throw new ApiException("Missing the required parameter 'environment' when calling getRedacted(Async)");
        }
        
        // verify the required parameter 'deployment' is set
        if (deployment == null) {
            throw new ApiException("Missing the required parameter 'deployment' when calling getRedacted(Async)");
        }
        

        com.squareup.okhttp.Call call = getRedactedCall(environment, deployment, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get a deployment by name
     * 
     * @param environment  (required)
     * @param deployment  (required)
     * @return Deployment
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Deployment getRedacted(String environment, String deployment) throws ApiException {
        ApiResponse<Deployment> resp = getRedactedWithHttpInfo(environment, deployment);
        return resp.getData();
    }

    /**
     * Get a deployment by name
     * 
     * @param environment  (required)
     * @param deployment  (required)
     * @return ApiResponse&lt;Deployment&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Deployment> getRedactedWithHttpInfo(String environment, String deployment) throws ApiException {
        com.squareup.okhttp.Call call = getRedactedValidateBeforeCall(environment, deployment, null, null);
        Type localVarReturnType = new TypeToken<Deployment>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get a deployment by name (asynchronously)
     * 
     * @param environment  (required)
     * @param deployment  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getRedactedAsync(String environment, String deployment, final ApiCallback<Deployment> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getRedactedValidateBeforeCall(environment, deployment, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Deployment>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getStatus
     * @param environment  (required)
     * @param deployment  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getStatusCall(String environment, String deployment, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/v7/environments/{environment}/deployments/{deployment}/status"
            .replaceAll("\\{" + "environment" + "\\}", apiClient.escapeString(environment.toString()))
            .replaceAll("\\{" + "deployment" + "\\}", apiClient.escapeString(deployment.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
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
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getStatusValidateBeforeCall(String environment, String deployment, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'environment' is set
        if (environment == null) {
            throw new ApiException("Missing the required parameter 'environment' when calling getStatus(Async)");
        }
        
        // verify the required parameter 'deployment' is set
        if (deployment == null) {
            throw new ApiException("Missing the required parameter 'deployment' when calling getStatus(Async)");
        }
        

        com.squareup.okhttp.Call call = getStatusCall(environment, deployment, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get a deployment status by name
     * 
     * @param environment  (required)
     * @param deployment  (required)
     * @return Status
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Status getStatus(String environment, String deployment) throws ApiException {
        ApiResponse<Status> resp = getStatusWithHttpInfo(environment, deployment);
        return resp.getData();
    }

    /**
     * Get a deployment status by name
     * 
     * @param environment  (required)
     * @param deployment  (required)
     * @return ApiResponse&lt;Status&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Status> getStatusWithHttpInfo(String environment, String deployment) throws ApiException {
        com.squareup.okhttp.Call call = getStatusValidateBeforeCall(environment, deployment, null, null);
        Type localVarReturnType = new TypeToken<Status>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get a deployment status by name (asynchronously)
     * 
     * @param environment  (required)
     * @param deployment  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getStatusAsync(String environment, String deployment, final ApiCallback<Status> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getStatusValidateBeforeCall(environment, deployment, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Status>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getTemplateRedacted
     * @param environment  (required)
     * @param deployment  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getTemplateRedactedCall(String environment, String deployment, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/v7/environments/{environment}/deployments/{deployment}/template"
            .replaceAll("\\{" + "environment" + "\\}", apiClient.escapeString(environment.toString()))
            .replaceAll("\\{" + "deployment" + "\\}", apiClient.escapeString(deployment.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
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
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getTemplateRedactedValidateBeforeCall(String environment, String deployment, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'environment' is set
        if (environment == null) {
            throw new ApiException("Missing the required parameter 'environment' when calling getTemplateRedacted(Async)");
        }
        
        // verify the required parameter 'deployment' is set
        if (deployment == null) {
            throw new ApiException("Missing the required parameter 'deployment' when calling getTemplateRedacted(Async)");
        }
        

        com.squareup.okhttp.Call call = getTemplateRedactedCall(environment, deployment, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get a deployment template by name
     * 
     * @param environment  (required)
     * @param deployment  (required)
     * @return DeploymentTemplate
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DeploymentTemplate getTemplateRedacted(String environment, String deployment) throws ApiException {
        ApiResponse<DeploymentTemplate> resp = getTemplateRedactedWithHttpInfo(environment, deployment);
        return resp.getData();
    }

    /**
     * Get a deployment template by name
     * 
     * @param environment  (required)
     * @param deployment  (required)
     * @return ApiResponse&lt;DeploymentTemplate&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DeploymentTemplate> getTemplateRedactedWithHttpInfo(String environment, String deployment) throws ApiException {
        com.squareup.okhttp.Call call = getTemplateRedactedValidateBeforeCall(environment, deployment, null, null);
        Type localVarReturnType = new TypeToken<DeploymentTemplate>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get a deployment template by name (asynchronously)
     * 
     * @param environment  (required)
     * @param deployment  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getTemplateRedactedAsync(String environment, String deployment, final ApiCallback<DeploymentTemplate> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getTemplateRedactedValidateBeforeCall(environment, deployment, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DeploymentTemplate>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for list
     * @param environment  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call listCall(String environment, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/v7/environments/{environment}/deployments"
            .replaceAll("\\{" + "environment" + "\\}", apiClient.escapeString(environment.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
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
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call listValidateBeforeCall(String environment, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'environment' is set
        if (environment == null) {
            throw new ApiException("Missing the required parameter 'environment' when calling list(Async)");
        }
        

        com.squareup.okhttp.Call call = listCall(environment, progressListener, progressRequestListener);
        return call;

    }

    /**
     * List all deployments
     * 
     * @param environment  (required)
     * @return List&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<String> list(String environment) throws ApiException {
        ApiResponse<List<String>> resp = listWithHttpInfo(environment);
        return resp.getData();
    }

    /**
     * List all deployments
     * 
     * @param environment  (required)
     * @return ApiResponse&lt;List&lt;String&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<String>> listWithHttpInfo(String environment) throws ApiException {
        com.squareup.okhttp.Call call = listValidateBeforeCall(environment, null, null);
        Type localVarReturnType = new TypeToken<List<String>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * List all deployments (asynchronously)
     * 
     * @param environment  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listAsync(String environment, final ApiCallback<List<String>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = listValidateBeforeCall(environment, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<String>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for update
     * @param environment  (required)
     * @param deployment  (required)
     * @param updatedTemplate  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call updateCall(String environment, String deployment, DeploymentTemplate updatedTemplate, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = updatedTemplate;

        // create path and map variables
        String localVarPath = "/api/v7/environments/{environment}/deployments/{deployment}"
            .replaceAll("\\{" + "environment" + "\\}", apiClient.escapeString(environment.toString()))
            .replaceAll("\\{" + "deployment" + "\\}", apiClient.escapeString(deployment.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
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
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call updateValidateBeforeCall(String environment, String deployment, DeploymentTemplate updatedTemplate, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'environment' is set
        if (environment == null) {
            throw new ApiException("Missing the required parameter 'environment' when calling update(Async)");
        }
        
        // verify the required parameter 'deployment' is set
        if (deployment == null) {
            throw new ApiException("Missing the required parameter 'deployment' when calling update(Async)");
        }
        
        // verify the required parameter 'updatedTemplate' is set
        if (updatedTemplate == null) {
            throw new ApiException("Missing the required parameter 'updatedTemplate' when calling update(Async)");
        }
        

        com.squareup.okhttp.Call call = updateCall(environment, deployment, updatedTemplate, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Update an existing deployment template
     * 
     * @param environment  (required)
     * @param deployment  (required)
     * @param updatedTemplate  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void update(String environment, String deployment, DeploymentTemplate updatedTemplate) throws ApiException {
        updateWithHttpInfo(environment, deployment, updatedTemplate);
    }

    /**
     * Update an existing deployment template
     * 
     * @param environment  (required)
     * @param deployment  (required)
     * @param updatedTemplate  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> updateWithHttpInfo(String environment, String deployment, DeploymentTemplate updatedTemplate) throws ApiException {
        com.squareup.okhttp.Call call = updateValidateBeforeCall(environment, deployment, updatedTemplate, null, null);
        return apiClient.execute(call);
    }

    /**
     * Update an existing deployment template (asynchronously)
     * 
     * @param environment  (required)
     * @param deployment  (required)
     * @param updatedTemplate  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateAsync(String environment, String deployment, DeploymentTemplate updatedTemplate, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = updateValidateBeforeCall(environment, deployment, updatedTemplate, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for updateMeteringSetting
     * @param environment  (required)
     * @param deployment  (required)
     * @param meteringSetting  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call updateMeteringSettingCall(String environment, String deployment, MeteringSetting meteringSetting, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = meteringSetting;

        // create path and map variables
        String localVarPath = "/api/v7/environments/{environment}/deployments/{deployment}/metering"
            .replaceAll("\\{" + "environment" + "\\}", apiClient.escapeString(environment.toString()))
            .replaceAll("\\{" + "deployment" + "\\}", apiClient.escapeString(deployment.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
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
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call updateMeteringSettingValidateBeforeCall(String environment, String deployment, MeteringSetting meteringSetting, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'environment' is set
        if (environment == null) {
            throw new ApiException("Missing the required parameter 'environment' when calling updateMeteringSetting(Async)");
        }
        
        // verify the required parameter 'deployment' is set
        if (deployment == null) {
            throw new ApiException("Missing the required parameter 'deployment' when calling updateMeteringSetting(Async)");
        }
        
        // verify the required parameter 'meteringSetting' is set
        if (meteringSetting == null) {
            throw new ApiException("Missing the required parameter 'meteringSetting' when calling updateMeteringSetting(Async)");
        }
        

        com.squareup.okhttp.Call call = updateMeteringSettingCall(environment, deployment, meteringSetting, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Update billing ID for an existing deployment
     * 
     * @param environment  (required)
     * @param deployment  (required)
     * @param meteringSetting  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void updateMeteringSetting(String environment, String deployment, MeteringSetting meteringSetting) throws ApiException {
        updateMeteringSettingWithHttpInfo(environment, deployment, meteringSetting);
    }

    /**
     * Update billing ID for an existing deployment
     * 
     * @param environment  (required)
     * @param deployment  (required)
     * @param meteringSetting  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> updateMeteringSettingWithHttpInfo(String environment, String deployment, MeteringSetting meteringSetting) throws ApiException {
        com.squareup.okhttp.Call call = updateMeteringSettingValidateBeforeCall(environment, deployment, meteringSetting, null, null);
        return apiClient.execute(call);
    }

    /**
     * Update billing ID for an existing deployment (asynchronously)
     * 
     * @param environment  (required)
     * @param deployment  (required)
     * @param meteringSetting  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateMeteringSettingAsync(String environment, String deployment, MeteringSetting meteringSetting, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = updateMeteringSettingValidateBeforeCall(environment, deployment, meteringSetting, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
}
