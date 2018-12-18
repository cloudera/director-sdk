# ProviderMetadataApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get**](ProviderMetadataApi.md#get) | **GET** /api/d6.1/metadata/providers/{providerId} | Get a provider by name
[**list**](ProviderMetadataApi.md#list) | **GET** /api/d6.1/metadata/providers | List all provider metadata


<a name="get"></a>
# **get**
> CloudProviderMetadata get(providerId)

Get a provider by name



### Example
```java
// Import classes:
//import com.cloudera.director.client.common.ApiClient;
//import com.cloudera.director.client.common.ApiException;
//import com.cloudera.director.client.common.Configuration;
//import com.cloudera.director.client.common.auth.*;
//import com.cloudera.director.client.latest.api.ProviderMetadataApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

ProviderMetadataApi apiInstance = new ProviderMetadataApi();
String providerId = "providerId_example"; // String | 
try {
    CloudProviderMetadata result = apiInstance.get(providerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProviderMetadataApi#get");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **providerId** | **String**|  |

### Return type

[**CloudProviderMetadata**](CloudProviderMetadata.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="list"></a>
# **list**
> List&lt;CloudProviderMetadata&gt; list()

List all provider metadata



### Example
```java
// Import classes:
//import com.cloudera.director.client.common.ApiClient;
//import com.cloudera.director.client.common.ApiException;
//import com.cloudera.director.client.common.Configuration;
//import com.cloudera.director.client.common.auth.*;
//import com.cloudera.director.client.latest.api.ProviderMetadataApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

ProviderMetadataApi apiInstance = new ProviderMetadataApi();
try {
    List<CloudProviderMetadata> result = apiInstance.list();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProviderMetadataApi#list");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;CloudProviderMetadata&gt;**](CloudProviderMetadata.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

