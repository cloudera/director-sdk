# VersionsApi

All URIs are relative to *https://localhost:7189*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getLatestVersion**](VersionsApi.md#getLatestVersion) | **GET** /api/versions/latest | getLatestVersion
[**getVersions**](VersionsApi.md#getVersions) | **GET** /api/versions | getVersions


<a name="getLatestVersion"></a>
# **getLatestVersion**
> String getLatestVersion()

getLatestVersion

### Example
```java
// Import classes:
//import com.cloudera.director.client.common.ApiClient;
//import com.cloudera.director.client.common.ApiException;
//import com.cloudera.director.client.common.Configuration;
//import com.cloudera.director.client.common.auth.*;
//import com.cloudera.director.client.common.VersionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

VersionsApi apiInstance = new VersionsApi();
try {
    String result = apiInstance.getLatestVersion();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VersionsApi#getLatestVersion");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**String**

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getVersions"></a>
# **getVersions**
> Version getVersions()

getVersions

### Example
```java
// Import classes:
//import com.cloudera.director.client.common.ApiClient;
//import com.cloudera.director.client.common.ApiException;
//import com.cloudera.director.client.common.Configuration;
//import com.cloudera.director.client.common.auth.*;
//import com.cloudera.director.client.common.VersionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

VersionsApi apiInstance = new VersionsApi();
try {
    Version result = apiInstance.getVersions();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VersionsApi#getVersions");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Version**](Version.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

