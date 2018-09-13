# DatabaseServersApi

All URIs are relative to *https://localhost:7189*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create**](DatabaseServersApi.md#create) | **POST** /api/d6.0/environments/{environment}/databaseServers | Create a new external database server
[**delete**](DatabaseServersApi.md#delete) | **DELETE** /api/d6.0/environments/{environment}/databaseServers/{externalDatabaseServer} | Delete an external database server by name
[**getDatabaseServerUsage**](DatabaseServersApi.md#getDatabaseServerUsage) | **GET** /api/d6.0/environments/{environment}/databaseServers/{externalDatabaseServer}/usage | Get an external database server usage by name
[**getRedacted**](DatabaseServersApi.md#getRedacted) | **GET** /api/d6.0/environments/{environment}/databaseServers/{externalDatabaseServer} | Get an external database server by name
[**getStatus**](DatabaseServersApi.md#getStatus) | **GET** /api/d6.0/environments/{environment}/databaseServers/{externalDatabaseServer}/status | Get an external database server status by name
[**getTemplateRedacted**](DatabaseServersApi.md#getTemplateRedacted) | **GET** /api/d6.0/environments/{environment}/databaseServers/{externalDatabaseServer}/template | Get an external database server template by name
[**list**](DatabaseServersApi.md#list) | **GET** /api/d6.0/environments/{environment}/databaseServers | List all externalDatabaseServers
[**update**](DatabaseServersApi.md#update) | **PUT** /api/d6.0/environments/{environment}/databaseServers/{externalDatabaseServer} | Update an existing external database server (unsupported)


<a name="create"></a>
# **create**
> create(environment, externalDatabaseServerTemplate)

Create a new external database server

### Example
```java
// Import classes:
//import com.cloudera.director.client.common.ApiClient;
//import com.cloudera.director.client.common.ApiException;
//import com.cloudera.director.client.common.Configuration;
//import com.cloudera.director.client.common.auth.*;
//import com.cloudera.director.client.latest.api.DatabaseServersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

DatabaseServersApi apiInstance = new DatabaseServersApi();
String environment = "environment_example"; // String | environment
ExternalDatabaseServerTemplate externalDatabaseServerTemplate = new ExternalDatabaseServerTemplate(); // ExternalDatabaseServerTemplate | externalDatabaseServerTemplate
try {
    apiInstance.create(environment, externalDatabaseServerTemplate);
} catch (ApiException e) {
    System.err.println("Exception when calling DatabaseServersApi#create");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **environment** | **String**| environment |
 **externalDatabaseServerTemplate** | [**ExternalDatabaseServerTemplate**](ExternalDatabaseServerTemplate.md)| externalDatabaseServerTemplate |

### Return type

null (empty response body)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="delete"></a>
# **delete**
> delete(environment, externalDatabaseServer)

Delete an external database server by name

### Example
```java
// Import classes:
//import com.cloudera.director.client.common.ApiClient;
//import com.cloudera.director.client.common.ApiException;
//import com.cloudera.director.client.common.Configuration;
//import com.cloudera.director.client.common.auth.*;
//import com.cloudera.director.client.latest.api.DatabaseServersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

DatabaseServersApi apiInstance = new DatabaseServersApi();
String environment = "environment_example"; // String | environment
String externalDatabaseServer = "externalDatabaseServer_example"; // String | externalDatabaseServer
try {
    apiInstance.delete(environment, externalDatabaseServer);
} catch (ApiException e) {
    System.err.println("Exception when calling DatabaseServersApi#delete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **environment** | **String**| environment |
 **externalDatabaseServer** | **String**| externalDatabaseServer |

### Return type

null (empty response body)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDatabaseServerUsage"></a>
# **getDatabaseServerUsage**
> ExternalDatabaseServerUsage getDatabaseServerUsage(environment, externalDatabaseServer)

Get an external database server usage by name

### Example
```java
// Import classes:
//import com.cloudera.director.client.common.ApiClient;
//import com.cloudera.director.client.common.ApiException;
//import com.cloudera.director.client.common.Configuration;
//import com.cloudera.director.client.common.auth.*;
//import com.cloudera.director.client.latest.api.DatabaseServersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

DatabaseServersApi apiInstance = new DatabaseServersApi();
String environment = "environment_example"; // String | environment
String externalDatabaseServer = "externalDatabaseServer_example"; // String | externalDatabaseServer
try {
    ExternalDatabaseServerUsage result = apiInstance.getDatabaseServerUsage(environment, externalDatabaseServer);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatabaseServersApi#getDatabaseServerUsage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **environment** | **String**| environment |
 **externalDatabaseServer** | **String**| externalDatabaseServer |

### Return type

[**ExternalDatabaseServerUsage**](ExternalDatabaseServerUsage.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getRedacted"></a>
# **getRedacted**
> ExternalDatabaseServer getRedacted(environment, externalDatabaseServer)

Get an external database server by name

### Example
```java
// Import classes:
//import com.cloudera.director.client.common.ApiClient;
//import com.cloudera.director.client.common.ApiException;
//import com.cloudera.director.client.common.Configuration;
//import com.cloudera.director.client.common.auth.*;
//import com.cloudera.director.client.latest.api.DatabaseServersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

DatabaseServersApi apiInstance = new DatabaseServersApi();
String environment = "environment_example"; // String | environment
String externalDatabaseServer = "externalDatabaseServer_example"; // String | externalDatabaseServer
try {
    ExternalDatabaseServer result = apiInstance.getRedacted(environment, externalDatabaseServer);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatabaseServersApi#getRedacted");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **environment** | **String**| environment |
 **externalDatabaseServer** | **String**| externalDatabaseServer |

### Return type

[**ExternalDatabaseServer**](ExternalDatabaseServer.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getStatus"></a>
# **getStatus**
> Status getStatus(environment, externalDatabaseServer)

Get an external database server status by name

### Example
```java
// Import classes:
//import com.cloudera.director.client.common.ApiClient;
//import com.cloudera.director.client.common.ApiException;
//import com.cloudera.director.client.common.Configuration;
//import com.cloudera.director.client.common.auth.*;
//import com.cloudera.director.client.latest.api.DatabaseServersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

DatabaseServersApi apiInstance = new DatabaseServersApi();
String environment = "environment_example"; // String | environment
String externalDatabaseServer = "externalDatabaseServer_example"; // String | externalDatabaseServer
try {
    Status result = apiInstance.getStatus(environment, externalDatabaseServer);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatabaseServersApi#getStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **environment** | **String**| environment |
 **externalDatabaseServer** | **String**| externalDatabaseServer |

### Return type

[**Status**](Status.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTemplateRedacted"></a>
# **getTemplateRedacted**
> ExternalDatabaseServerTemplate getTemplateRedacted(environment, externalDatabaseServer)

Get an external database server template by name

### Example
```java
// Import classes:
//import com.cloudera.director.client.common.ApiClient;
//import com.cloudera.director.client.common.ApiException;
//import com.cloudera.director.client.common.Configuration;
//import com.cloudera.director.client.common.auth.*;
//import com.cloudera.director.client.latest.api.DatabaseServersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

DatabaseServersApi apiInstance = new DatabaseServersApi();
String environment = "environment_example"; // String | environment
String externalDatabaseServer = "externalDatabaseServer_example"; // String | externalDatabaseServer
try {
    ExternalDatabaseServerTemplate result = apiInstance.getTemplateRedacted(environment, externalDatabaseServer);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatabaseServersApi#getTemplateRedacted");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **environment** | **String**| environment |
 **externalDatabaseServer** | **String**| externalDatabaseServer |

### Return type

[**ExternalDatabaseServerTemplate**](ExternalDatabaseServerTemplate.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="list"></a>
# **list**
> List&lt;String&gt; list(environment)

List all externalDatabaseServers

### Example
```java
// Import classes:
//import com.cloudera.director.client.common.ApiClient;
//import com.cloudera.director.client.common.ApiException;
//import com.cloudera.director.client.common.Configuration;
//import com.cloudera.director.client.common.auth.*;
//import com.cloudera.director.client.latest.api.DatabaseServersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

DatabaseServersApi apiInstance = new DatabaseServersApi();
String environment = "environment_example"; // String | environment
try {
    List<String> result = apiInstance.list(environment);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatabaseServersApi#list");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **environment** | **String**| environment |

### Return type

**List&lt;String&gt;**

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="update"></a>
# **update**
> update(environment, externalDatabaseServer, updatedTemplate)

Update an existing external database server (unsupported)

### Example
```java
// Import classes:
//import com.cloudera.director.client.common.ApiClient;
//import com.cloudera.director.client.common.ApiException;
//import com.cloudera.director.client.common.Configuration;
//import com.cloudera.director.client.common.auth.*;
//import com.cloudera.director.client.latest.api.DatabaseServersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

DatabaseServersApi apiInstance = new DatabaseServersApi();
String environment = "environment_example"; // String | environment
String externalDatabaseServer = "externalDatabaseServer_example"; // String | externalDatabaseServer
ExternalDatabaseServerTemplate updatedTemplate = new ExternalDatabaseServerTemplate(); // ExternalDatabaseServerTemplate | updatedTemplate
try {
    apiInstance.update(environment, externalDatabaseServer, updatedTemplate);
} catch (ApiException e) {
    System.err.println("Exception when calling DatabaseServersApi#update");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **environment** | **String**| environment |
 **externalDatabaseServer** | **String**| externalDatabaseServer |
 **updatedTemplate** | [**ExternalDatabaseServerTemplate**](ExternalDatabaseServerTemplate.md)| updatedTemplate |

### Return type

null (empty response body)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

