# MarketplacesApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCDHImages**](MarketplacesApi.md#getCDHImages) | **GET** /api/d6.2/marketplaces/images/CDH | Get CDH marketplace images
[**getCMImages**](MarketplacesApi.md#getCMImages) | **GET** /api/d6.2/marketplaces/images/CM | Get CM marketplace images


<a name="getCDHImages"></a>
# **getCDHImages**
> List&lt;MarketplaceImage&gt; getCDHImages()

Get CDH marketplace images



### Example
```java
// Import classes:
//import com.cloudera.director.client.common.ApiClient;
//import com.cloudera.director.client.common.ApiException;
//import com.cloudera.director.client.common.Configuration;
//import com.cloudera.director.client.common.auth.*;
//import com.cloudera.director.client.latest.api.MarketplacesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

MarketplacesApi apiInstance = new MarketplacesApi();
try {
    List<MarketplaceImage> result = apiInstance.getCDHImages();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MarketplacesApi#getCDHImages");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;MarketplaceImage&gt;**](MarketplaceImage.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCMImages"></a>
# **getCMImages**
> List&lt;MarketplaceImage&gt; getCMImages()

Get CM marketplace images



### Example
```java
// Import classes:
//import com.cloudera.director.client.common.ApiClient;
//import com.cloudera.director.client.common.ApiException;
//import com.cloudera.director.client.common.Configuration;
//import com.cloudera.director.client.common.auth.*;
//import com.cloudera.director.client.latest.api.MarketplacesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

MarketplacesApi apiInstance = new MarketplacesApi();
try {
    List<MarketplaceImage> result = apiInstance.getCMImages();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MarketplacesApi#getCMImages");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;MarketplaceImage&gt;**](MarketplaceImage.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

