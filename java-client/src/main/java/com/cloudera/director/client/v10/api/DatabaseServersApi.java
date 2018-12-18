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


package com.cloudera.director.client.v10.api;

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


import com.cloudera.director.client.v10.model.ExternalDatabaseServer;
import com.cloudera.director.client.v10.model.ExternalDatabaseServerTemplate;
import com.cloudera.director.client.v10.model.ExternalDatabaseServerUsage;
import com.cloudera.director.client.v10.model.Status;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DatabaseServersApi {
    private ApiClient apiClient;

    public DatabaseServersApi() {
        this(Configuration.getDefaultApiClient());
    }

    public DatabaseServersApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for create
     * @param environment  (required)
     * @param externalDatabaseServerTemplate  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createCall(String environment, ExternalDatabaseServerTemplate externalDatabaseServerTemplate, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = externalDatabaseServerTemplate;

        // create path and map variables
        String localVarPath = "/api/v10/environments/{environment}/databaseServers"
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
    private com.squareup.okhttp.Call createValidateBeforeCall(String environment, ExternalDatabaseServerTemplate externalDatabaseServerTemplate, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'environment' is set
        if (environment == null) {
            throw new ApiException("Missing the required parameter 'environment' when calling create(Async)");
        }
        
        // verify the required parameter 'externalDatabaseServerTemplate' is set
        if (externalDatabaseServerTemplate == null) {
            throw new ApiException("Missing the required parameter 'externalDatabaseServerTemplate' when calling create(Async)");
        }
        

        com.squareup.okhttp.Call call = createCall(environment, externalDatabaseServerTemplate, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Create a new external database server
     * 
     * @param environment  (required)
     * @param externalDatabaseServerTemplate  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void create(String environment, ExternalDatabaseServerTemplate externalDatabaseServerTemplate) throws ApiException {
        createWithHttpInfo(environment, externalDatabaseServerTemplate);
    }

    /**
     * Create a new external database server
     * 
     * @param environment  (required)
     * @param externalDatabaseServerTemplate  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> createWithHttpInfo(String environment, ExternalDatabaseServerTemplate externalDatabaseServerTemplate) throws ApiException {
        com.squareup.okhttp.Call call = createValidateBeforeCall(environment, externalDatabaseServerTemplate, null, null);
        return apiClient.execute(call);
    }

    /**
     * Create a new external database server (asynchronously)
     * 
     * @param environment  (required)
     * @param externalDatabaseServerTemplate  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createAsync(String environment, ExternalDatabaseServerTemplate externalDatabaseServerTemplate, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = createValidateBeforeCall(environment, externalDatabaseServerTemplate, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for delete
     * @param environment  (required)
     * @param externalDatabaseServer  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteCall(String environment, String externalDatabaseServer, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/v10/environments/{environment}/databaseServers/{externalDatabaseServer}"
            .replaceAll("\\{" + "environment" + "\\}", apiClient.escapeString(environment.toString()))
            .replaceAll("\\{" + "externalDatabaseServer" + "\\}", apiClient.escapeString(externalDatabaseServer.toString()));

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
    private com.squareup.okhttp.Call deleteValidateBeforeCall(String environment, String externalDatabaseServer, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'environment' is set
        if (environment == null) {
            throw new ApiException("Missing the required parameter 'environment' when calling delete(Async)");
        }
        
        // verify the required parameter 'externalDatabaseServer' is set
        if (externalDatabaseServer == null) {
            throw new ApiException("Missing the required parameter 'externalDatabaseServer' when calling delete(Async)");
        }
        

        com.squareup.okhttp.Call call = deleteCall(environment, externalDatabaseServer, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Delete an external database server by name
     * 
     * @param environment  (required)
     * @param externalDatabaseServer  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void delete(String environment, String externalDatabaseServer) throws ApiException {
        deleteWithHttpInfo(environment, externalDatabaseServer);
    }

    /**
     * Delete an external database server by name
     * 
     * @param environment  (required)
     * @param externalDatabaseServer  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteWithHttpInfo(String environment, String externalDatabaseServer) throws ApiException {
        com.squareup.okhttp.Call call = deleteValidateBeforeCall(environment, externalDatabaseServer, null, null);
        return apiClient.execute(call);
    }

    /**
     * Delete an external database server by name (asynchronously)
     * 
     * @param environment  (required)
     * @param externalDatabaseServer  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteAsync(String environment, String externalDatabaseServer, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteValidateBeforeCall(environment, externalDatabaseServer, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for getDatabaseServerUsage
     * @param environment  (required)
     * @param externalDatabaseServer  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getDatabaseServerUsageCall(String environment, String externalDatabaseServer, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/v10/environments/{environment}/databaseServers/{externalDatabaseServer}/usage"
            .replaceAll("\\{" + "environment" + "\\}", apiClient.escapeString(environment.toString()))
            .replaceAll("\\{" + "externalDatabaseServer" + "\\}", apiClient.escapeString(externalDatabaseServer.toString()));

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
    private com.squareup.okhttp.Call getDatabaseServerUsageValidateBeforeCall(String environment, String externalDatabaseServer, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'environment' is set
        if (environment == null) {
            throw new ApiException("Missing the required parameter 'environment' when calling getDatabaseServerUsage(Async)");
        }
        
        // verify the required parameter 'externalDatabaseServer' is set
        if (externalDatabaseServer == null) {
            throw new ApiException("Missing the required parameter 'externalDatabaseServer' when calling getDatabaseServerUsage(Async)");
        }
        

        com.squareup.okhttp.Call call = getDatabaseServerUsageCall(environment, externalDatabaseServer, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get an external database server usage by name
     * 
     * @param environment  (required)
     * @param externalDatabaseServer  (required)
     * @return ExternalDatabaseServerUsage
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ExternalDatabaseServerUsage getDatabaseServerUsage(String environment, String externalDatabaseServer) throws ApiException {
        ApiResponse<ExternalDatabaseServerUsage> resp = getDatabaseServerUsageWithHttpInfo(environment, externalDatabaseServer);
        return resp.getData();
    }

    /**
     * Get an external database server usage by name
     * 
     * @param environment  (required)
     * @param externalDatabaseServer  (required)
     * @return ApiResponse&lt;ExternalDatabaseServerUsage&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ExternalDatabaseServerUsage> getDatabaseServerUsageWithHttpInfo(String environment, String externalDatabaseServer) throws ApiException {
        com.squareup.okhttp.Call call = getDatabaseServerUsageValidateBeforeCall(environment, externalDatabaseServer, null, null);
        Type localVarReturnType = new TypeToken<ExternalDatabaseServerUsage>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get an external database server usage by name (asynchronously)
     * 
     * @param environment  (required)
     * @param externalDatabaseServer  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getDatabaseServerUsageAsync(String environment, String externalDatabaseServer, final ApiCallback<ExternalDatabaseServerUsage> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getDatabaseServerUsageValidateBeforeCall(environment, externalDatabaseServer, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ExternalDatabaseServerUsage>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getRedacted
     * @param environment  (required)
     * @param externalDatabaseServer  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getRedactedCall(String environment, String externalDatabaseServer, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/v10/environments/{environment}/databaseServers/{externalDatabaseServer}"
            .replaceAll("\\{" + "environment" + "\\}", apiClient.escapeString(environment.toString()))
            .replaceAll("\\{" + "externalDatabaseServer" + "\\}", apiClient.escapeString(externalDatabaseServer.toString()));

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
    private com.squareup.okhttp.Call getRedactedValidateBeforeCall(String environment, String externalDatabaseServer, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'environment' is set
        if (environment == null) {
            throw new ApiException("Missing the required parameter 'environment' when calling getRedacted(Async)");
        }
        
        // verify the required parameter 'externalDatabaseServer' is set
        if (externalDatabaseServer == null) {
            throw new ApiException("Missing the required parameter 'externalDatabaseServer' when calling getRedacted(Async)");
        }
        

        com.squareup.okhttp.Call call = getRedactedCall(environment, externalDatabaseServer, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get an external database server by name
     * 
     * @param environment  (required)
     * @param externalDatabaseServer  (required)
     * @return ExternalDatabaseServer
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ExternalDatabaseServer getRedacted(String environment, String externalDatabaseServer) throws ApiException {
        ApiResponse<ExternalDatabaseServer> resp = getRedactedWithHttpInfo(environment, externalDatabaseServer);
        return resp.getData();
    }

    /**
     * Get an external database server by name
     * 
     * @param environment  (required)
     * @param externalDatabaseServer  (required)
     * @return ApiResponse&lt;ExternalDatabaseServer&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ExternalDatabaseServer> getRedactedWithHttpInfo(String environment, String externalDatabaseServer) throws ApiException {
        com.squareup.okhttp.Call call = getRedactedValidateBeforeCall(environment, externalDatabaseServer, null, null);
        Type localVarReturnType = new TypeToken<ExternalDatabaseServer>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get an external database server by name (asynchronously)
     * 
     * @param environment  (required)
     * @param externalDatabaseServer  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getRedactedAsync(String environment, String externalDatabaseServer, final ApiCallback<ExternalDatabaseServer> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getRedactedValidateBeforeCall(environment, externalDatabaseServer, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ExternalDatabaseServer>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getStatus
     * @param environment  (required)
     * @param externalDatabaseServer  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getStatusCall(String environment, String externalDatabaseServer, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/v10/environments/{environment}/databaseServers/{externalDatabaseServer}/status"
            .replaceAll("\\{" + "environment" + "\\}", apiClient.escapeString(environment.toString()))
            .replaceAll("\\{" + "externalDatabaseServer" + "\\}", apiClient.escapeString(externalDatabaseServer.toString()));

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
    private com.squareup.okhttp.Call getStatusValidateBeforeCall(String environment, String externalDatabaseServer, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'environment' is set
        if (environment == null) {
            throw new ApiException("Missing the required parameter 'environment' when calling getStatus(Async)");
        }
        
        // verify the required parameter 'externalDatabaseServer' is set
        if (externalDatabaseServer == null) {
            throw new ApiException("Missing the required parameter 'externalDatabaseServer' when calling getStatus(Async)");
        }
        

        com.squareup.okhttp.Call call = getStatusCall(environment, externalDatabaseServer, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get an external database server status by name
     * 
     * @param environment  (required)
     * @param externalDatabaseServer  (required)
     * @return Status
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Status getStatus(String environment, String externalDatabaseServer) throws ApiException {
        ApiResponse<Status> resp = getStatusWithHttpInfo(environment, externalDatabaseServer);
        return resp.getData();
    }

    /**
     * Get an external database server status by name
     * 
     * @param environment  (required)
     * @param externalDatabaseServer  (required)
     * @return ApiResponse&lt;Status&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Status> getStatusWithHttpInfo(String environment, String externalDatabaseServer) throws ApiException {
        com.squareup.okhttp.Call call = getStatusValidateBeforeCall(environment, externalDatabaseServer, null, null);
        Type localVarReturnType = new TypeToken<Status>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get an external database server status by name (asynchronously)
     * 
     * @param environment  (required)
     * @param externalDatabaseServer  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getStatusAsync(String environment, String externalDatabaseServer, final ApiCallback<Status> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getStatusValidateBeforeCall(environment, externalDatabaseServer, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Status>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getTemplateRedacted
     * @param environment  (required)
     * @param externalDatabaseServer  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getTemplateRedactedCall(String environment, String externalDatabaseServer, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/v10/environments/{environment}/databaseServers/{externalDatabaseServer}/template"
            .replaceAll("\\{" + "environment" + "\\}", apiClient.escapeString(environment.toString()))
            .replaceAll("\\{" + "externalDatabaseServer" + "\\}", apiClient.escapeString(externalDatabaseServer.toString()));

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
    private com.squareup.okhttp.Call getTemplateRedactedValidateBeforeCall(String environment, String externalDatabaseServer, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'environment' is set
        if (environment == null) {
            throw new ApiException("Missing the required parameter 'environment' when calling getTemplateRedacted(Async)");
        }
        
        // verify the required parameter 'externalDatabaseServer' is set
        if (externalDatabaseServer == null) {
            throw new ApiException("Missing the required parameter 'externalDatabaseServer' when calling getTemplateRedacted(Async)");
        }
        

        com.squareup.okhttp.Call call = getTemplateRedactedCall(environment, externalDatabaseServer, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get an external database server template by name
     * 
     * @param environment  (required)
     * @param externalDatabaseServer  (required)
     * @return ExternalDatabaseServerTemplate
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ExternalDatabaseServerTemplate getTemplateRedacted(String environment, String externalDatabaseServer) throws ApiException {
        ApiResponse<ExternalDatabaseServerTemplate> resp = getTemplateRedactedWithHttpInfo(environment, externalDatabaseServer);
        return resp.getData();
    }

    /**
     * Get an external database server template by name
     * 
     * @param environment  (required)
     * @param externalDatabaseServer  (required)
     * @return ApiResponse&lt;ExternalDatabaseServerTemplate&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ExternalDatabaseServerTemplate> getTemplateRedactedWithHttpInfo(String environment, String externalDatabaseServer) throws ApiException {
        com.squareup.okhttp.Call call = getTemplateRedactedValidateBeforeCall(environment, externalDatabaseServer, null, null);
        Type localVarReturnType = new TypeToken<ExternalDatabaseServerTemplate>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get an external database server template by name (asynchronously)
     * 
     * @param environment  (required)
     * @param externalDatabaseServer  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getTemplateRedactedAsync(String environment, String externalDatabaseServer, final ApiCallback<ExternalDatabaseServerTemplate> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getTemplateRedactedValidateBeforeCall(environment, externalDatabaseServer, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ExternalDatabaseServerTemplate>(){}.getType();
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
        String localVarPath = "/api/v10/environments/{environment}/databaseServers"
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
     * List all externalDatabaseServers
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
     * List all externalDatabaseServers
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
     * List all externalDatabaseServers (asynchronously)
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
     * @param externalDatabaseServer  (required)
     * @param updatedTemplate  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call updateCall(String environment, String externalDatabaseServer, ExternalDatabaseServerTemplate updatedTemplate, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = updatedTemplate;

        // create path and map variables
        String localVarPath = "/api/v10/environments/{environment}/databaseServers/{externalDatabaseServer}"
            .replaceAll("\\{" + "environment" + "\\}", apiClient.escapeString(environment.toString()))
            .replaceAll("\\{" + "externalDatabaseServer" + "\\}", apiClient.escapeString(externalDatabaseServer.toString()));

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
    private com.squareup.okhttp.Call updateValidateBeforeCall(String environment, String externalDatabaseServer, ExternalDatabaseServerTemplate updatedTemplate, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'environment' is set
        if (environment == null) {
            throw new ApiException("Missing the required parameter 'environment' when calling update(Async)");
        }
        
        // verify the required parameter 'externalDatabaseServer' is set
        if (externalDatabaseServer == null) {
            throw new ApiException("Missing the required parameter 'externalDatabaseServer' when calling update(Async)");
        }
        
        // verify the required parameter 'updatedTemplate' is set
        if (updatedTemplate == null) {
            throw new ApiException("Missing the required parameter 'updatedTemplate' when calling update(Async)");
        }
        

        com.squareup.okhttp.Call call = updateCall(environment, externalDatabaseServer, updatedTemplate, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Update an existing external database server (unsupported)
     * 
     * @param environment  (required)
     * @param externalDatabaseServer  (required)
     * @param updatedTemplate  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void update(String environment, String externalDatabaseServer, ExternalDatabaseServerTemplate updatedTemplate) throws ApiException {
        updateWithHttpInfo(environment, externalDatabaseServer, updatedTemplate);
    }

    /**
     * Update an existing external database server (unsupported)
     * 
     * @param environment  (required)
     * @param externalDatabaseServer  (required)
     * @param updatedTemplate  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> updateWithHttpInfo(String environment, String externalDatabaseServer, ExternalDatabaseServerTemplate updatedTemplate) throws ApiException {
        com.squareup.okhttp.Call call = updateValidateBeforeCall(environment, externalDatabaseServer, updatedTemplate, null, null);
        return apiClient.execute(call);
    }

    /**
     * Update an existing external database server (unsupported) (asynchronously)
     * 
     * @param environment  (required)
     * @param externalDatabaseServer  (required)
     * @param updatedTemplate  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateAsync(String environment, String externalDatabaseServer, ExternalDatabaseServerTemplate updatedTemplate, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = updateValidateBeforeCall(environment, externalDatabaseServer, updatedTemplate, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
}
