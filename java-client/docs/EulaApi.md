# EulaApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get**](EulaApi.md#get) | **GET** /api/d6.1/eula | Get the EULA
[**update**](EulaApi.md#update) | **PUT** /api/d6.1/eula | Update the EULA


<a name="get"></a>
# **get**
> Eula get()

Get the EULA



### Example
```java
// Import classes:
//import com.cloudera.director.client.common.ApiException;
//import com.cloudera.director.client.latest.api.EulaApi;


EulaApi apiInstance = new EulaApi();
try {
    Eula result = apiInstance.get();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EulaApi#get");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Eula**](Eula.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="update"></a>
# **update**
> update(eula)

Update the EULA



### Example
```java
// Import classes:
//import com.cloudera.director.client.common.ApiException;
//import com.cloudera.director.client.latest.api.EulaApi;


EulaApi apiInstance = new EulaApi();
Eula eula = new Eula(); // Eula | 
try {
    apiInstance.update(eula);
} catch (ApiException e) {
    System.err.println("Exception when calling EulaApi#update");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eula** | [**Eula**](Eula.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

