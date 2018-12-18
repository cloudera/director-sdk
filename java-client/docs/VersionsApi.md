# VersionsApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getLatestVersion**](VersionsApi.md#getLatestVersion) | **GET** /api/versions/latest | 
[**getVersions**](VersionsApi.md#getVersions) | **GET** /api/versions | 


<a name="getLatestVersion"></a>
# **getLatestVersion**
> String getLatestVersion()



### Example
```java
// Import classes:
//import com.cloudera.director.client.common.ApiException;
//import com.cloudera.director.client.common.VersionsApi;


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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getVersions"></a>
# **getVersions**
> Version getVersions()



### Example
```java
// Import classes:
//import com.cloudera.director.client.common.ApiException;
//import com.cloudera.director.client.common.VersionsApi;


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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

