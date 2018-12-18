# ServerConfigApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get**](ServerConfigApi.md#get) | **GET** /api/d6.1/serverConfigs | Get server configuration
[**metadata**](ServerConfigApi.md#metadata) | **GET** /api/d6.1/serverConfigs/metadata | Retrieves the metadata for server configuration
[**updateConfigs**](ServerConfigApi.md#updateConfigs) | **POST** /api/d6.1/serverConfigs | Get server configuration


<a name="get"></a>
# **get**
> Map&lt;String, String&gt; get()

Get server configuration



### Example
```java
// Import classes:
//import com.cloudera.director.client.common.ApiClient;
//import com.cloudera.director.client.common.ApiException;
//import com.cloudera.director.client.common.Configuration;
//import com.cloudera.director.client.common.auth.*;
//import com.cloudera.director.client.latest.api.ServerConfigApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

ServerConfigApi apiInstance = new ServerConfigApi();
try {
    Map<String, String> result = apiInstance.get();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServerConfigApi#get");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**Map&lt;String, String&gt;**

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="metadata"></a>
# **metadata**
> List&lt;ConfigurationProperty&gt; metadata()

Retrieves the metadata for server configuration



### Example
```java
// Import classes:
//import com.cloudera.director.client.common.ApiClient;
//import com.cloudera.director.client.common.ApiException;
//import com.cloudera.director.client.common.Configuration;
//import com.cloudera.director.client.common.auth.*;
//import com.cloudera.director.client.latest.api.ServerConfigApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

ServerConfigApi apiInstance = new ServerConfigApi();
try {
    List<ConfigurationProperty> result = apiInstance.metadata();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServerConfigApi#metadata");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;ConfigurationProperty&gt;**](ConfigurationProperty.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateConfigs"></a>
# **updateConfigs**
> updateConfigs(serverConfigs)

Get server configuration



### Example
```java
// Import classes:
//import com.cloudera.director.client.common.ApiClient;
//import com.cloudera.director.client.common.ApiException;
//import com.cloudera.director.client.common.Configuration;
//import com.cloudera.director.client.common.auth.*;
//import com.cloudera.director.client.latest.api.ServerConfigApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

ServerConfigApi apiInstance = new ServerConfigApi();
Object serverConfigs = null; // Object | 
try {
    apiInstance.updateConfigs(serverConfigs);
} catch (ApiException e) {
    System.err.println("Exception when calling ServerConfigApi#updateConfigs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serverConfigs** | **Object**|  |

### Return type

null (empty response body)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

