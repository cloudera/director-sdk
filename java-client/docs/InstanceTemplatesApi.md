# InstanceTemplatesApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create**](InstanceTemplatesApi.md#create) | **POST** /api/d6.1/environments/{environment}/templates/instances | Create a new instance template
[**delete**](InstanceTemplatesApi.md#delete) | **DELETE** /api/d6.1/environments/{environment}/templates/instances/{template} | Delete an instance template by name
[**get**](InstanceTemplatesApi.md#get) | **GET** /api/d6.1/environments/{environment}/templates/instances/{template} | Get an instance template by name
[**list**](InstanceTemplatesApi.md#list) | **GET** /api/d6.1/environments/{environment}/templates/instances | List all instance templates
[**update**](InstanceTemplatesApi.md#update) | **PUT** /api/d6.1/environments/{environment}/templates/instances/{template} | Update an existing instance template


<a name="create"></a>
# **create**
> create(environment, instanceTemplate)

Create a new instance template



### Example
```java
// Import classes:
//import com.cloudera.director.client.common.ApiClient;
//import com.cloudera.director.client.common.ApiException;
//import com.cloudera.director.client.common.Configuration;
//import com.cloudera.director.client.common.auth.*;
//import com.cloudera.director.client.latest.api.InstanceTemplatesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

InstanceTemplatesApi apiInstance = new InstanceTemplatesApi();
String environment = "environment_example"; // String | 
InstanceTemplate instanceTemplate = new InstanceTemplate(); // InstanceTemplate | 
try {
    apiInstance.create(environment, instanceTemplate);
} catch (ApiException e) {
    System.err.println("Exception when calling InstanceTemplatesApi#create");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **environment** | **String**|  |
 **instanceTemplate** | [**InstanceTemplate**](InstanceTemplate.md)|  |

### Return type

null (empty response body)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="delete"></a>
# **delete**
> delete(environment, template)

Delete an instance template by name



### Example
```java
// Import classes:
//import com.cloudera.director.client.common.ApiClient;
//import com.cloudera.director.client.common.ApiException;
//import com.cloudera.director.client.common.Configuration;
//import com.cloudera.director.client.common.auth.*;
//import com.cloudera.director.client.latest.api.InstanceTemplatesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

InstanceTemplatesApi apiInstance = new InstanceTemplatesApi();
String environment = "environment_example"; // String | 
String template = "template_example"; // String | 
try {
    apiInstance.delete(environment, template);
} catch (ApiException e) {
    System.err.println("Exception when calling InstanceTemplatesApi#delete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **environment** | **String**|  |
 **template** | **String**|  |

### Return type

null (empty response body)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="get"></a>
# **get**
> InstanceTemplate get(environment, template)

Get an instance template by name



### Example
```java
// Import classes:
//import com.cloudera.director.client.common.ApiClient;
//import com.cloudera.director.client.common.ApiException;
//import com.cloudera.director.client.common.Configuration;
//import com.cloudera.director.client.common.auth.*;
//import com.cloudera.director.client.latest.api.InstanceTemplatesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

InstanceTemplatesApi apiInstance = new InstanceTemplatesApi();
String environment = "environment_example"; // String | 
String template = "template_example"; // String | 
try {
    InstanceTemplate result = apiInstance.get(environment, template);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InstanceTemplatesApi#get");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **environment** | **String**|  |
 **template** | **String**|  |

### Return type

[**InstanceTemplate**](InstanceTemplate.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="list"></a>
# **list**
> List&lt;String&gt; list(environment)

List all instance templates



### Example
```java
// Import classes:
//import com.cloudera.director.client.common.ApiClient;
//import com.cloudera.director.client.common.ApiException;
//import com.cloudera.director.client.common.Configuration;
//import com.cloudera.director.client.common.auth.*;
//import com.cloudera.director.client.latest.api.InstanceTemplatesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

InstanceTemplatesApi apiInstance = new InstanceTemplatesApi();
String environment = "environment_example"; // String | 
try {
    List<String> result = apiInstance.list(environment);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InstanceTemplatesApi#list");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **environment** | **String**|  |

### Return type

**List&lt;String&gt;**

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="update"></a>
# **update**
> update(environment, template, instanceTemplate)

Update an existing instance template



### Example
```java
// Import classes:
//import com.cloudera.director.client.common.ApiClient;
//import com.cloudera.director.client.common.ApiException;
//import com.cloudera.director.client.common.Configuration;
//import com.cloudera.director.client.common.auth.*;
//import com.cloudera.director.client.latest.api.InstanceTemplatesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

InstanceTemplatesApi apiInstance = new InstanceTemplatesApi();
String environment = "environment_example"; // String | 
String template = "template_example"; // String | 
InstanceTemplate instanceTemplate = new InstanceTemplate(); // InstanceTemplate | 
try {
    apiInstance.update(environment, template, instanceTemplate);
} catch (ApiException e) {
    System.err.println("Exception when calling InstanceTemplatesApi#update");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **environment** | **String**|  |
 **template** | **String**|  |
 **instanceTemplate** | [**InstanceTemplate**](InstanceTemplate.md)|  |

### Return type

null (empty response body)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

