# EnvironmentsApi

All URIs are relative to *https://localhost:7189*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create**](EnvironmentsApi.md#create) | **POST** /api/d6.0/environments | Create a new environment
[**delete**](EnvironmentsApi.md#delete) | **DELETE** /api/d6.0/environments/{name} | Delete an environment by name
[**getRedacted**](EnvironmentsApi.md#getRedacted) | **GET** /api/d6.0/environments/{name} | Get an environment by name
[**list**](EnvironmentsApi.md#list) | **GET** /api/d6.0/environments | List all environments
[**update**](EnvironmentsApi.md#update) | **PUT** /api/d6.0/environments/{name} | Update an existing environment
[**updateProviderCredentials**](EnvironmentsApi.md#updateProviderCredentials) | **PUT** /api/d6.0/environments/{name}/provider/credentials | Update provider credentials for a specific environment


<a name="create"></a>
# **create**
> create(environment)

Create a new environment

### Example
```java
// Import classes:
//import com.cloudera.director.client.common.ApiClient;
//import com.cloudera.director.client.common.ApiException;
//import com.cloudera.director.client.common.Configuration;
//import com.cloudera.director.client.common.auth.*;
//import com.cloudera.director.client.latest.api.EnvironmentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

EnvironmentsApi apiInstance = new EnvironmentsApi();
Environment environment = new Environment(); // Environment | environment
try {
    apiInstance.create(environment);
} catch (ApiException e) {
    System.err.println("Exception when calling EnvironmentsApi#create");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **environment** | [**Environment**](Environment.md)| environment |

### Return type

null (empty response body)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="delete"></a>
# **delete**
> delete(name)

Delete an environment by name

### Example
```java
// Import classes:
//import com.cloudera.director.client.common.ApiClient;
//import com.cloudera.director.client.common.ApiException;
//import com.cloudera.director.client.common.Configuration;
//import com.cloudera.director.client.common.auth.*;
//import com.cloudera.director.client.latest.api.EnvironmentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

EnvironmentsApi apiInstance = new EnvironmentsApi();
String name = "name_example"; // String | name
try {
    apiInstance.delete(name);
} catch (ApiException e) {
    System.err.println("Exception when calling EnvironmentsApi#delete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| name |

### Return type

null (empty response body)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getRedacted"></a>
# **getRedacted**
> Environment getRedacted(name)

Get an environment by name

### Example
```java
// Import classes:
//import com.cloudera.director.client.common.ApiClient;
//import com.cloudera.director.client.common.ApiException;
//import com.cloudera.director.client.common.Configuration;
//import com.cloudera.director.client.common.auth.*;
//import com.cloudera.director.client.latest.api.EnvironmentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

EnvironmentsApi apiInstance = new EnvironmentsApi();
String name = "name_example"; // String | name
try {
    Environment result = apiInstance.getRedacted(name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EnvironmentsApi#getRedacted");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| name |

### Return type

[**Environment**](Environment.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="list"></a>
# **list**
> List&lt;String&gt; list()

List all environments

### Example
```java
// Import classes:
//import com.cloudera.director.client.common.ApiClient;
//import com.cloudera.director.client.common.ApiException;
//import com.cloudera.director.client.common.Configuration;
//import com.cloudera.director.client.common.auth.*;
//import com.cloudera.director.client.latest.api.EnvironmentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

EnvironmentsApi apiInstance = new EnvironmentsApi();
try {
    List<String> result = apiInstance.list();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EnvironmentsApi#list");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**List&lt;String&gt;**

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="update"></a>
# **update**
> update(name, environment)

Update an existing environment

### Example
```java
// Import classes:
//import com.cloudera.director.client.common.ApiClient;
//import com.cloudera.director.client.common.ApiException;
//import com.cloudera.director.client.common.Configuration;
//import com.cloudera.director.client.common.auth.*;
//import com.cloudera.director.client.latest.api.EnvironmentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

EnvironmentsApi apiInstance = new EnvironmentsApi();
String name = "name_example"; // String | name
Environment environment = new Environment(); // Environment | environment
try {
    apiInstance.update(name, environment);
} catch (ApiException e) {
    System.err.println("Exception when calling EnvironmentsApi#update");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| name |
 **environment** | [**Environment**](Environment.md)| environment |

### Return type

null (empty response body)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateProviderCredentials"></a>
# **updateProviderCredentials**
> updateProviderCredentials(name, credentials)

Update provider credentials for a specific environment

### Example
```java
// Import classes:
//import com.cloudera.director.client.common.ApiClient;
//import com.cloudera.director.client.common.ApiException;
//import com.cloudera.director.client.common.Configuration;
//import com.cloudera.director.client.common.auth.*;
//import com.cloudera.director.client.latest.api.EnvironmentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

EnvironmentsApi apiInstance = new EnvironmentsApi();
String name = "name_example"; // String | name
Object credentials = null; // Object | credentials
try {
    apiInstance.updateProviderCredentials(name, credentials);
} catch (ApiException e) {
    System.err.println("Exception when calling EnvironmentsApi#updateProviderCredentials");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| name |
 **credentials** | **Object**| credentials |

### Return type

null (empty response body)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

