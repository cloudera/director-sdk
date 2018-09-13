# DeploymentsApi

All URIs are relative to *https://localhost:7189*

Method | HTTP request | Description
------------- | ------------- | -------------
[**collectDiagnosticData**](DeploymentsApi.md#collectDiagnosticData) | **POST** /api/d6.0/environments/{environment}/deployments/{deployment}/diagnosticData | Collects diagnostic data
[**create**](DeploymentsApi.md#create) | **POST** /api/d6.0/environments/{environment}/deployments | Create a new deployment
[**delete**](DeploymentsApi.md#delete) | **DELETE** /api/d6.0/environments/{environment}/deployments/{deployment} | Delete a deployment by name
[**getRedacted**](DeploymentsApi.md#getRedacted) | **GET** /api/d6.0/environments/{environment}/deployments/{deployment} | Get a deployment by name
[**getStatus**](DeploymentsApi.md#getStatus) | **GET** /api/d6.0/environments/{environment}/deployments/{deployment}/status | Get a deployment status by name
[**getTemplateRedacted**](DeploymentsApi.md#getTemplateRedacted) | **GET** /api/d6.0/environments/{environment}/deployments/{deployment}/template | Get a deployment template by name
[**list**](DeploymentsApi.md#list) | **GET** /api/d6.0/environments/{environment}/deployments | List all deployments
[**update**](DeploymentsApi.md#update) | **PUT** /api/d6.0/environments/{environment}/deployments/{deployment} | Update an existing deployment template
[**updateMeteringSetting**](DeploymentsApi.md#updateMeteringSetting) | **PUT** /api/d6.0/environments/{environment}/deployments/{deployment}/metering | Update billing ID for an existing deployment


<a name="collectDiagnosticData"></a>
# **collectDiagnosticData**
> collectDiagnosticData(environment, deployment)

Collects diagnostic data

### Example
```java
// Import classes:
//import com.cloudera.director.client.common.ApiClient;
//import com.cloudera.director.client.common.ApiException;
//import com.cloudera.director.client.common.Configuration;
//import com.cloudera.director.client.common.auth.*;
//import com.cloudera.director.client.latest.api.DeploymentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

DeploymentsApi apiInstance = new DeploymentsApi();
String environment = "environment_example"; // String | environment
String deployment = "deployment_example"; // String | deployment
try {
    apiInstance.collectDiagnosticData(environment, deployment);
} catch (ApiException e) {
    System.err.println("Exception when calling DeploymentsApi#collectDiagnosticData");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **environment** | **String**| environment |
 **deployment** | **String**| deployment |

### Return type

null (empty response body)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="create"></a>
# **create**
> create(environment, deploymentTemplate)

Create a new deployment

### Example
```java
// Import classes:
//import com.cloudera.director.client.common.ApiClient;
//import com.cloudera.director.client.common.ApiException;
//import com.cloudera.director.client.common.Configuration;
//import com.cloudera.director.client.common.auth.*;
//import com.cloudera.director.client.latest.api.DeploymentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

DeploymentsApi apiInstance = new DeploymentsApi();
String environment = "environment_example"; // String | environment
DeploymentTemplate deploymentTemplate = new DeploymentTemplate(); // DeploymentTemplate | deploymentTemplate
try {
    apiInstance.create(environment, deploymentTemplate);
} catch (ApiException e) {
    System.err.println("Exception when calling DeploymentsApi#create");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **environment** | **String**| environment |
 **deploymentTemplate** | [**DeploymentTemplate**](DeploymentTemplate.md)| deploymentTemplate |

### Return type

null (empty response body)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="delete"></a>
# **delete**
> delete(environment, deployment)

Delete a deployment by name

### Example
```java
// Import classes:
//import com.cloudera.director.client.common.ApiClient;
//import com.cloudera.director.client.common.ApiException;
//import com.cloudera.director.client.common.Configuration;
//import com.cloudera.director.client.common.auth.*;
//import com.cloudera.director.client.latest.api.DeploymentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

DeploymentsApi apiInstance = new DeploymentsApi();
String environment = "environment_example"; // String | environment
String deployment = "deployment_example"; // String | deployment
try {
    apiInstance.delete(environment, deployment);
} catch (ApiException e) {
    System.err.println("Exception when calling DeploymentsApi#delete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **environment** | **String**| environment |
 **deployment** | **String**| deployment |

### Return type

null (empty response body)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getRedacted"></a>
# **getRedacted**
> Deployment getRedacted(environment, deployment)

Get a deployment by name

### Example
```java
// Import classes:
//import com.cloudera.director.client.common.ApiClient;
//import com.cloudera.director.client.common.ApiException;
//import com.cloudera.director.client.common.Configuration;
//import com.cloudera.director.client.common.auth.*;
//import com.cloudera.director.client.latest.api.DeploymentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

DeploymentsApi apiInstance = new DeploymentsApi();
String environment = "environment_example"; // String | environment
String deployment = "deployment_example"; // String | deployment
try {
    Deployment result = apiInstance.getRedacted(environment, deployment);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeploymentsApi#getRedacted");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **environment** | **String**| environment |
 **deployment** | **String**| deployment |

### Return type

[**Deployment**](Deployment.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getStatus"></a>
# **getStatus**
> Status getStatus(environment, deployment)

Get a deployment status by name

### Example
```java
// Import classes:
//import com.cloudera.director.client.common.ApiClient;
//import com.cloudera.director.client.common.ApiException;
//import com.cloudera.director.client.common.Configuration;
//import com.cloudera.director.client.common.auth.*;
//import com.cloudera.director.client.latest.api.DeploymentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

DeploymentsApi apiInstance = new DeploymentsApi();
String environment = "environment_example"; // String | environment
String deployment = "deployment_example"; // String | deployment
try {
    Status result = apiInstance.getStatus(environment, deployment);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeploymentsApi#getStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **environment** | **String**| environment |
 **deployment** | **String**| deployment |

### Return type

[**Status**](Status.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTemplateRedacted"></a>
# **getTemplateRedacted**
> DeploymentTemplate getTemplateRedacted(environment, deployment)

Get a deployment template by name

### Example
```java
// Import classes:
//import com.cloudera.director.client.common.ApiClient;
//import com.cloudera.director.client.common.ApiException;
//import com.cloudera.director.client.common.Configuration;
//import com.cloudera.director.client.common.auth.*;
//import com.cloudera.director.client.latest.api.DeploymentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

DeploymentsApi apiInstance = new DeploymentsApi();
String environment = "environment_example"; // String | environment
String deployment = "deployment_example"; // String | deployment
try {
    DeploymentTemplate result = apiInstance.getTemplateRedacted(environment, deployment);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeploymentsApi#getTemplateRedacted");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **environment** | **String**| environment |
 **deployment** | **String**| deployment |

### Return type

[**DeploymentTemplate**](DeploymentTemplate.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="list"></a>
# **list**
> List&lt;String&gt; list(environment)

List all deployments

### Example
```java
// Import classes:
//import com.cloudera.director.client.common.ApiClient;
//import com.cloudera.director.client.common.ApiException;
//import com.cloudera.director.client.common.Configuration;
//import com.cloudera.director.client.common.auth.*;
//import com.cloudera.director.client.latest.api.DeploymentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

DeploymentsApi apiInstance = new DeploymentsApi();
String environment = "environment_example"; // String | environment
try {
    List<String> result = apiInstance.list(environment);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeploymentsApi#list");
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
> update(environment, deployment, updatedTemplate)

Update an existing deployment template

### Example
```java
// Import classes:
//import com.cloudera.director.client.common.ApiClient;
//import com.cloudera.director.client.common.ApiException;
//import com.cloudera.director.client.common.Configuration;
//import com.cloudera.director.client.common.auth.*;
//import com.cloudera.director.client.latest.api.DeploymentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

DeploymentsApi apiInstance = new DeploymentsApi();
String environment = "environment_example"; // String | environment
String deployment = "deployment_example"; // String | deployment
DeploymentTemplate updatedTemplate = new DeploymentTemplate(); // DeploymentTemplate | updatedTemplate
try {
    apiInstance.update(environment, deployment, updatedTemplate);
} catch (ApiException e) {
    System.err.println("Exception when calling DeploymentsApi#update");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **environment** | **String**| environment |
 **deployment** | **String**| deployment |
 **updatedTemplate** | [**DeploymentTemplate**](DeploymentTemplate.md)| updatedTemplate |

### Return type

null (empty response body)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateMeteringSetting"></a>
# **updateMeteringSetting**
> updateMeteringSetting(environment, deployment, meteringSetting)

Update billing ID for an existing deployment

### Example
```java
// Import classes:
//import com.cloudera.director.client.common.ApiClient;
//import com.cloudera.director.client.common.ApiException;
//import com.cloudera.director.client.common.Configuration;
//import com.cloudera.director.client.common.auth.*;
//import com.cloudera.director.client.latest.api.DeploymentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

DeploymentsApi apiInstance = new DeploymentsApi();
String environment = "environment_example"; // String | environment
String deployment = "deployment_example"; // String | deployment
MeteringSetting meteringSetting = new MeteringSetting(); // MeteringSetting | meteringSetting
try {
    apiInstance.updateMeteringSetting(environment, deployment, meteringSetting);
} catch (ApiException e) {
    System.err.println("Exception when calling DeploymentsApi#updateMeteringSetting");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **environment** | **String**| environment |
 **deployment** | **String**| deployment |
 **meteringSetting** | [**MeteringSetting**](MeteringSetting.md)| meteringSetting |

### Return type

null (empty response body)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

