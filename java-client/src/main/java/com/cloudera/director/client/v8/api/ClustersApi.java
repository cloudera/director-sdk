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


package com.cloudera.director.client.v8.api;

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


import com.cloudera.director.client.v8.model.Cluster;
import com.cloudera.director.client.v8.model.ClusterTemplate;
import com.cloudera.director.client.v8.model.Metrics;
import com.cloudera.director.client.v8.model.Status;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClustersApi {
    private ApiClient apiClient;

    public ClustersApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ClustersApi(ApiClient apiClient) {
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
     * @param environment environment (required)
     * @param deployment deployment (required)
     * @param cluster cluster (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call collectDiagnosticDataCall(String environment, String deployment, String cluster, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/v8/environments/{environment}/deployments/{deployment}/clusters/{cluster}/diagnosticData"
            .replaceAll("\\{" + "environment" + "\\}", apiClient.escapeString(environment.toString()))
            .replaceAll("\\{" + "deployment" + "\\}", apiClient.escapeString(deployment.toString()))
            .replaceAll("\\{" + "cluster" + "\\}", apiClient.escapeString(cluster.toString()));

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
            "application/json"
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
    private com.squareup.okhttp.Call collectDiagnosticDataValidateBeforeCall(String environment, String deployment, String cluster, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'environment' is set
        if (environment == null) {
            throw new ApiException("Missing the required parameter 'environment' when calling collectDiagnosticData(Async)");
        }
        
        // verify the required parameter 'deployment' is set
        if (deployment == null) {
            throw new ApiException("Missing the required parameter 'deployment' when calling collectDiagnosticData(Async)");
        }
        
        // verify the required parameter 'cluster' is set
        if (cluster == null) {
            throw new ApiException("Missing the required parameter 'cluster' when calling collectDiagnosticData(Async)");
        }
        

        com.squareup.okhttp.Call call = collectDiagnosticDataCall(environment, deployment, cluster, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Collects diagnostic data
     * 
     * @param environment environment (required)
     * @param deployment deployment (required)
     * @param cluster cluster (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void collectDiagnosticData(String environment, String deployment, String cluster) throws ApiException {
        collectDiagnosticDataWithHttpInfo(environment, deployment, cluster);
    }

    /**
     * Collects diagnostic data
     * 
     * @param environment environment (required)
     * @param deployment deployment (required)
     * @param cluster cluster (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> collectDiagnosticDataWithHttpInfo(String environment, String deployment, String cluster) throws ApiException {
        com.squareup.okhttp.Call call = collectDiagnosticDataValidateBeforeCall(environment, deployment, cluster, null, null);
        return apiClient.execute(call);
    }

    /**
     * Collects diagnostic data (asynchronously)
     * 
     * @param environment environment (required)
     * @param deployment deployment (required)
     * @param cluster cluster (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call collectDiagnosticDataAsync(String environment, String deployment, String cluster, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = collectDiagnosticDataValidateBeforeCall(environment, deployment, cluster, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for create
     * @param environment environment (required)
     * @param deployment deployment (required)
     * @param clusterTemplate clusterTemplate (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createCall(String environment, String deployment, ClusterTemplate clusterTemplate, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = clusterTemplate;

        // create path and map variables
        String localVarPath = "/api/v8/environments/{environment}/deployments/{deployment}/clusters"
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
            "application/json"
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
    private com.squareup.okhttp.Call createValidateBeforeCall(String environment, String deployment, ClusterTemplate clusterTemplate, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'environment' is set
        if (environment == null) {
            throw new ApiException("Missing the required parameter 'environment' when calling create(Async)");
        }
        
        // verify the required parameter 'deployment' is set
        if (deployment == null) {
            throw new ApiException("Missing the required parameter 'deployment' when calling create(Async)");
        }
        
        // verify the required parameter 'clusterTemplate' is set
        if (clusterTemplate == null) {
            throw new ApiException("Missing the required parameter 'clusterTemplate' when calling create(Async)");
        }
        

        com.squareup.okhttp.Call call = createCall(environment, deployment, clusterTemplate, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Create a new cluster
     * 
     * @param environment environment (required)
     * @param deployment deployment (required)
     * @param clusterTemplate clusterTemplate (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void create(String environment, String deployment, ClusterTemplate clusterTemplate) throws ApiException {
        createWithHttpInfo(environment, deployment, clusterTemplate);
    }

    /**
     * Create a new cluster
     * 
     * @param environment environment (required)
     * @param deployment deployment (required)
     * @param clusterTemplate clusterTemplate (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> createWithHttpInfo(String environment, String deployment, ClusterTemplate clusterTemplate) throws ApiException {
        com.squareup.okhttp.Call call = createValidateBeforeCall(environment, deployment, clusterTemplate, null, null);
        return apiClient.execute(call);
    }

    /**
     * Create a new cluster (asynchronously)
     * 
     * @param environment environment (required)
     * @param deployment deployment (required)
     * @param clusterTemplate clusterTemplate (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createAsync(String environment, String deployment, ClusterTemplate clusterTemplate, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = createValidateBeforeCall(environment, deployment, clusterTemplate, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for delete
     * @param environment environment (required)
     * @param deployment deployment (required)
     * @param cluster cluster (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteCall(String environment, String deployment, String cluster, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/v8/environments/{environment}/deployments/{deployment}/clusters/{cluster}"
            .replaceAll("\\{" + "environment" + "\\}", apiClient.escapeString(environment.toString()))
            .replaceAll("\\{" + "deployment" + "\\}", apiClient.escapeString(deployment.toString()))
            .replaceAll("\\{" + "cluster" + "\\}", apiClient.escapeString(cluster.toString()));

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
    private com.squareup.okhttp.Call deleteValidateBeforeCall(String environment, String deployment, String cluster, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'environment' is set
        if (environment == null) {
            throw new ApiException("Missing the required parameter 'environment' when calling delete(Async)");
        }
        
        // verify the required parameter 'deployment' is set
        if (deployment == null) {
            throw new ApiException("Missing the required parameter 'deployment' when calling delete(Async)");
        }
        
        // verify the required parameter 'cluster' is set
        if (cluster == null) {
            throw new ApiException("Missing the required parameter 'cluster' when calling delete(Async)");
        }
        

        com.squareup.okhttp.Call call = deleteCall(environment, deployment, cluster, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Delete a cluster by name
     * 
     * @param environment environment (required)
     * @param deployment deployment (required)
     * @param cluster cluster (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void delete(String environment, String deployment, String cluster) throws ApiException {
        deleteWithHttpInfo(environment, deployment, cluster);
    }

    /**
     * Delete a cluster by name
     * 
     * @param environment environment (required)
     * @param deployment deployment (required)
     * @param cluster cluster (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteWithHttpInfo(String environment, String deployment, String cluster) throws ApiException {
        com.squareup.okhttp.Call call = deleteValidateBeforeCall(environment, deployment, cluster, null, null);
        return apiClient.execute(call);
    }

    /**
     * Delete a cluster by name (asynchronously)
     * 
     * @param environment environment (required)
     * @param deployment deployment (required)
     * @param cluster cluster (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteAsync(String environment, String deployment, String cluster, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteValidateBeforeCall(environment, deployment, cluster, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for get
     * @param environment environment (required)
     * @param deployment deployment (required)
     * @param cluster cluster (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getCall(String environment, String deployment, String cluster, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/v8/environments/{environment}/deployments/{deployment}/clusters/{cluster}"
            .replaceAll("\\{" + "environment" + "\\}", apiClient.escapeString(environment.toString()))
            .replaceAll("\\{" + "deployment" + "\\}", apiClient.escapeString(deployment.toString()))
            .replaceAll("\\{" + "cluster" + "\\}", apiClient.escapeString(cluster.toString()));

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
    private com.squareup.okhttp.Call getValidateBeforeCall(String environment, String deployment, String cluster, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'environment' is set
        if (environment == null) {
            throw new ApiException("Missing the required parameter 'environment' when calling get(Async)");
        }
        
        // verify the required parameter 'deployment' is set
        if (deployment == null) {
            throw new ApiException("Missing the required parameter 'deployment' when calling get(Async)");
        }
        
        // verify the required parameter 'cluster' is set
        if (cluster == null) {
            throw new ApiException("Missing the required parameter 'cluster' when calling get(Async)");
        }
        

        com.squareup.okhttp.Call call = getCall(environment, deployment, cluster, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get a cluster by name
     * 
     * @param environment environment (required)
     * @param deployment deployment (required)
     * @param cluster cluster (required)
     * @return Cluster
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Cluster get(String environment, String deployment, String cluster) throws ApiException {
        ApiResponse<Cluster> resp = getWithHttpInfo(environment, deployment, cluster);
        return resp.getData();
    }

    /**
     * Get a cluster by name
     * 
     * @param environment environment (required)
     * @param deployment deployment (required)
     * @param cluster cluster (required)
     * @return ApiResponse&lt;Cluster&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Cluster> getWithHttpInfo(String environment, String deployment, String cluster) throws ApiException {
        com.squareup.okhttp.Call call = getValidateBeforeCall(environment, deployment, cluster, null, null);
        Type localVarReturnType = new TypeToken<Cluster>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get a cluster by name (asynchronously)
     * 
     * @param environment environment (required)
     * @param deployment deployment (required)
     * @param cluster cluster (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getAsync(String environment, String deployment, String cluster, final ApiCallback<Cluster> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getValidateBeforeCall(environment, deployment, cluster, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Cluster>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getMetrics
     * @param environment environment (required)
     * @param deployment deployment (required)
     * @param cluster cluster (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getMetricsCall(String environment, String deployment, String cluster, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/v8/environments/{environment}/deployments/{deployment}/clusters/{cluster}/metrics"
            .replaceAll("\\{" + "environment" + "\\}", apiClient.escapeString(environment.toString()))
            .replaceAll("\\{" + "deployment" + "\\}", apiClient.escapeString(deployment.toString()))
            .replaceAll("\\{" + "cluster" + "\\}", apiClient.escapeString(cluster.toString()));

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
    private com.squareup.okhttp.Call getMetricsValidateBeforeCall(String environment, String deployment, String cluster, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'environment' is set
        if (environment == null) {
            throw new ApiException("Missing the required parameter 'environment' when calling getMetrics(Async)");
        }
        
        // verify the required parameter 'deployment' is set
        if (deployment == null) {
            throw new ApiException("Missing the required parameter 'deployment' when calling getMetrics(Async)");
        }
        
        // verify the required parameter 'cluster' is set
        if (cluster == null) {
            throw new ApiException("Missing the required parameter 'cluster' when calling getMetrics(Async)");
        }
        

        com.squareup.okhttp.Call call = getMetricsCall(environment, deployment, cluster, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get cluster metrics by name
     * 
     * @param environment environment (required)
     * @param deployment deployment (required)
     * @param cluster cluster (required)
     * @return Metrics
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Metrics getMetrics(String environment, String deployment, String cluster) throws ApiException {
        ApiResponse<Metrics> resp = getMetricsWithHttpInfo(environment, deployment, cluster);
        return resp.getData();
    }

    /**
     * Get cluster metrics by name
     * 
     * @param environment environment (required)
     * @param deployment deployment (required)
     * @param cluster cluster (required)
     * @return ApiResponse&lt;Metrics&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Metrics> getMetricsWithHttpInfo(String environment, String deployment, String cluster) throws ApiException {
        com.squareup.okhttp.Call call = getMetricsValidateBeforeCall(environment, deployment, cluster, null, null);
        Type localVarReturnType = new TypeToken<Metrics>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get cluster metrics by name (asynchronously)
     * 
     * @param environment environment (required)
     * @param deployment deployment (required)
     * @param cluster cluster (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getMetricsAsync(String environment, String deployment, String cluster, final ApiCallback<Metrics> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getMetricsValidateBeforeCall(environment, deployment, cluster, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Metrics>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getStatus
     * @param environment environment (required)
     * @param deployment deployment (required)
     * @param cluster cluster (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getStatusCall(String environment, String deployment, String cluster, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/v8/environments/{environment}/deployments/{deployment}/clusters/{cluster}/status"
            .replaceAll("\\{" + "environment" + "\\}", apiClient.escapeString(environment.toString()))
            .replaceAll("\\{" + "deployment" + "\\}", apiClient.escapeString(deployment.toString()))
            .replaceAll("\\{" + "cluster" + "\\}", apiClient.escapeString(cluster.toString()));

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
    private com.squareup.okhttp.Call getStatusValidateBeforeCall(String environment, String deployment, String cluster, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'environment' is set
        if (environment == null) {
            throw new ApiException("Missing the required parameter 'environment' when calling getStatus(Async)");
        }
        
        // verify the required parameter 'deployment' is set
        if (deployment == null) {
            throw new ApiException("Missing the required parameter 'deployment' when calling getStatus(Async)");
        }
        
        // verify the required parameter 'cluster' is set
        if (cluster == null) {
            throw new ApiException("Missing the required parameter 'cluster' when calling getStatus(Async)");
        }
        

        com.squareup.okhttp.Call call = getStatusCall(environment, deployment, cluster, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get a cluster status by name
     * 
     * @param environment environment (required)
     * @param deployment deployment (required)
     * @param cluster cluster (required)
     * @return Status
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Status getStatus(String environment, String deployment, String cluster) throws ApiException {
        ApiResponse<Status> resp = getStatusWithHttpInfo(environment, deployment, cluster);
        return resp.getData();
    }

    /**
     * Get a cluster status by name
     * 
     * @param environment environment (required)
     * @param deployment deployment (required)
     * @param cluster cluster (required)
     * @return ApiResponse&lt;Status&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Status> getStatusWithHttpInfo(String environment, String deployment, String cluster) throws ApiException {
        com.squareup.okhttp.Call call = getStatusValidateBeforeCall(environment, deployment, cluster, null, null);
        Type localVarReturnType = new TypeToken<Status>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get a cluster status by name (asynchronously)
     * 
     * @param environment environment (required)
     * @param deployment deployment (required)
     * @param cluster cluster (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getStatusAsync(String environment, String deployment, String cluster, final ApiCallback<Status> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getStatusValidateBeforeCall(environment, deployment, cluster, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Status>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getTemplateRedacted
     * @param environment environment (required)
     * @param deployment deployment (required)
     * @param cluster cluster (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getTemplateRedactedCall(String environment, String deployment, String cluster, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/v8/environments/{environment}/deployments/{deployment}/clusters/{cluster}/template"
            .replaceAll("\\{" + "environment" + "\\}", apiClient.escapeString(environment.toString()))
            .replaceAll("\\{" + "deployment" + "\\}", apiClient.escapeString(deployment.toString()))
            .replaceAll("\\{" + "cluster" + "\\}", apiClient.escapeString(cluster.toString()));

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
    private com.squareup.okhttp.Call getTemplateRedactedValidateBeforeCall(String environment, String deployment, String cluster, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'environment' is set
        if (environment == null) {
            throw new ApiException("Missing the required parameter 'environment' when calling getTemplateRedacted(Async)");
        }
        
        // verify the required parameter 'deployment' is set
        if (deployment == null) {
            throw new ApiException("Missing the required parameter 'deployment' when calling getTemplateRedacted(Async)");
        }
        
        // verify the required parameter 'cluster' is set
        if (cluster == null) {
            throw new ApiException("Missing the required parameter 'cluster' when calling getTemplateRedacted(Async)");
        }
        

        com.squareup.okhttp.Call call = getTemplateRedactedCall(environment, deployment, cluster, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get a cluster template by name
     * 
     * @param environment environment (required)
     * @param deployment deployment (required)
     * @param cluster cluster (required)
     * @return ClusterTemplate
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ClusterTemplate getTemplateRedacted(String environment, String deployment, String cluster) throws ApiException {
        ApiResponse<ClusterTemplate> resp = getTemplateRedactedWithHttpInfo(environment, deployment, cluster);
        return resp.getData();
    }

    /**
     * Get a cluster template by name
     * 
     * @param environment environment (required)
     * @param deployment deployment (required)
     * @param cluster cluster (required)
     * @return ApiResponse&lt;ClusterTemplate&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ClusterTemplate> getTemplateRedactedWithHttpInfo(String environment, String deployment, String cluster) throws ApiException {
        com.squareup.okhttp.Call call = getTemplateRedactedValidateBeforeCall(environment, deployment, cluster, null, null);
        Type localVarReturnType = new TypeToken<ClusterTemplate>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get a cluster template by name (asynchronously)
     * 
     * @param environment environment (required)
     * @param deployment deployment (required)
     * @param cluster cluster (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getTemplateRedactedAsync(String environment, String deployment, String cluster, final ApiCallback<ClusterTemplate> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getTemplateRedactedValidateBeforeCall(environment, deployment, cluster, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ClusterTemplate>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for list
     * @param environment environment (required)
     * @param deployment deployment (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call listCall(String environment, String deployment, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/v8/environments/{environment}/deployments/{deployment}/clusters"
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
    private com.squareup.okhttp.Call listValidateBeforeCall(String environment, String deployment, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'environment' is set
        if (environment == null) {
            throw new ApiException("Missing the required parameter 'environment' when calling list(Async)");
        }
        
        // verify the required parameter 'deployment' is set
        if (deployment == null) {
            throw new ApiException("Missing the required parameter 'deployment' when calling list(Async)");
        }
        

        com.squareup.okhttp.Call call = listCall(environment, deployment, progressListener, progressRequestListener);
        return call;

    }

    /**
     * List all clusters
     * 
     * @param environment environment (required)
     * @param deployment deployment (required)
     * @return List&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<String> list(String environment, String deployment) throws ApiException {
        ApiResponse<List<String>> resp = listWithHttpInfo(environment, deployment);
        return resp.getData();
    }

    /**
     * List all clusters
     * 
     * @param environment environment (required)
     * @param deployment deployment (required)
     * @return ApiResponse&lt;List&lt;String&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<String>> listWithHttpInfo(String environment, String deployment) throws ApiException {
        com.squareup.okhttp.Call call = listValidateBeforeCall(environment, deployment, null, null);
        Type localVarReturnType = new TypeToken<List<String>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * List all clusters (asynchronously)
     * 
     * @param environment environment (required)
     * @param deployment deployment (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listAsync(String environment, String deployment, final ApiCallback<List<String>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = listValidateBeforeCall(environment, deployment, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<String>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for update
     * @param environment environment (required)
     * @param deployment deployment (required)
     * @param cluster cluster (required)
     * @param desired desired (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call updateCall(String environment, String deployment, String cluster, ClusterTemplate desired, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = desired;

        // create path and map variables
        String localVarPath = "/api/v8/environments/{environment}/deployments/{deployment}/clusters/{cluster}"
            .replaceAll("\\{" + "environment" + "\\}", apiClient.escapeString(environment.toString()))
            .replaceAll("\\{" + "deployment" + "\\}", apiClient.escapeString(deployment.toString()))
            .replaceAll("\\{" + "cluster" + "\\}", apiClient.escapeString(cluster.toString()));

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
            "application/json"
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
    private com.squareup.okhttp.Call updateValidateBeforeCall(String environment, String deployment, String cluster, ClusterTemplate desired, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'environment' is set
        if (environment == null) {
            throw new ApiException("Missing the required parameter 'environment' when calling update(Async)");
        }
        
        // verify the required parameter 'deployment' is set
        if (deployment == null) {
            throw new ApiException("Missing the required parameter 'deployment' when calling update(Async)");
        }
        
        // verify the required parameter 'cluster' is set
        if (cluster == null) {
            throw new ApiException("Missing the required parameter 'cluster' when calling update(Async)");
        }
        
        // verify the required parameter 'desired' is set
        if (desired == null) {
            throw new ApiException("Missing the required parameter 'desired' when calling update(Async)");
        }
        

        com.squareup.okhttp.Call call = updateCall(environment, deployment, cluster, desired, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Update an existing cluster
     * 
     * @param environment environment (required)
     * @param deployment deployment (required)
     * @param cluster cluster (required)
     * @param desired desired (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void update(String environment, String deployment, String cluster, ClusterTemplate desired) throws ApiException {
        updateWithHttpInfo(environment, deployment, cluster, desired);
    }

    /**
     * Update an existing cluster
     * 
     * @param environment environment (required)
     * @param deployment deployment (required)
     * @param cluster cluster (required)
     * @param desired desired (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> updateWithHttpInfo(String environment, String deployment, String cluster, ClusterTemplate desired) throws ApiException {
        com.squareup.okhttp.Call call = updateValidateBeforeCall(environment, deployment, cluster, desired, null, null);
        return apiClient.execute(call);
    }

    /**
     * Update an existing cluster (asynchronously)
     * 
     * @param environment environment (required)
     * @param deployment deployment (required)
     * @param cluster cluster (required)
     * @param desired desired (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateAsync(String environment, String deployment, String cluster, ClusterTemplate desired, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = updateValidateBeforeCall(environment, deployment, cluster, desired, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
}
