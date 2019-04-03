# ClustersApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**collectDiagnosticData**](ClustersApi.md#collectDiagnosticData) | **POST** /api/d6.2/environments/{environment}/deployments/{deployment}/clusters/{cluster}/diagnosticData | Collects diagnostic data
[**create**](ClustersApi.md#create) | **POST** /api/d6.2/environments/{environment}/deployments/{deployment}/clusters | Create a new cluster
[**delete**](ClustersApi.md#delete) | **DELETE** /api/d6.2/environments/{environment}/deployments/{deployment}/clusters/{cluster} | Delete a cluster by name
[**exportClusterConfiguration**](ClustersApi.md#exportClusterConfiguration) | **GET** /api/d6.2/environments/{environment}/deployments/{deployment}/clusters/{cluster}/config | Exports the cluster configuration for this cluster
[**getAdministrationSettings**](ClustersApi.md#getAdministrationSettings) | **GET** /api/d6.2/environments/{environment}/deployments/{deployment}/clusters/{cluster}/settings | Get administration settings for a cluster
[**getHistory**](ClustersApi.md#getHistory) | **GET** /api/d6.2/environments/{environment}/deployments/{deployment}/clusters/{cluster}/history | Get history of updates for a cluster
[**getMetrics**](ClustersApi.md#getMetrics) | **GET** /api/d6.2/environments/{environment}/deployments/{deployment}/clusters/{cluster}/metrics | Get cluster metrics by name
[**getRedacted**](ClustersApi.md#getRedacted) | **GET** /api/d6.2/environments/{environment}/deployments/{deployment}/clusters/{cluster} | Get a cluster by name
[**getStatus**](ClustersApi.md#getStatus) | **GET** /api/d6.2/environments/{environment}/deployments/{deployment}/clusters/{cluster}/status | Get a cluster status by name
[**getTemplateRedacted**](ClustersApi.md#getTemplateRedacted) | **GET** /api/d6.2/environments/{environment}/deployments/{deployment}/clusters/{cluster}/template | Get a cluster template by name
[**list**](ClustersApi.md#list) | **GET** /api/d6.2/environments/{environment}/deployments/{deployment}/clusters | List all clusters
[**update**](ClustersApi.md#update) | **PUT** /api/d6.2/environments/{environment}/deployments/{deployment}/clusters/{cluster} | Update an existing cluster
[**updateAdministrationSettings**](ClustersApi.md#updateAdministrationSettings) | **PUT** /api/d6.2/environments/{environment}/deployments/{deployment}/clusters/{cluster}/settings | Update administration settings for a cluster


<a name="collectDiagnosticData"></a>
# **collectDiagnosticData**
> collectDiagnosticData(environment, deployment, cluster)

Collects diagnostic data



### Example
```java
// Import classes:
//import com.cloudera.director.client.common.ApiClient;
//import com.cloudera.director.client.common.ApiException;
//import com.cloudera.director.client.common.Configuration;
//import com.cloudera.director.client.common.auth.*;
//import com.cloudera.director.client.latest.api.ClustersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

ClustersApi apiInstance = new ClustersApi();
String environment = "environment_example"; // String | 
String deployment = "deployment_example"; // String | 
String cluster = "cluster_example"; // String | 
try {
    apiInstance.collectDiagnosticData(environment, deployment, cluster);
} catch (ApiException e) {
    System.err.println("Exception when calling ClustersApi#collectDiagnosticData");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **environment** | **String**|  |
 **deployment** | **String**|  |
 **cluster** | **String**|  |

### Return type

null (empty response body)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="create"></a>
# **create**
> create(environment, deployment, clusterTemplate)

Create a new cluster



### Example
```java
// Import classes:
//import com.cloudera.director.client.common.ApiClient;
//import com.cloudera.director.client.common.ApiException;
//import com.cloudera.director.client.common.Configuration;
//import com.cloudera.director.client.common.auth.*;
//import com.cloudera.director.client.latest.api.ClustersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

ClustersApi apiInstance = new ClustersApi();
String environment = "environment_example"; // String | 
String deployment = "deployment_example"; // String | 
ClusterTemplate clusterTemplate = new ClusterTemplate(); // ClusterTemplate | 
try {
    apiInstance.create(environment, deployment, clusterTemplate);
} catch (ApiException e) {
    System.err.println("Exception when calling ClustersApi#create");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **environment** | **String**|  |
 **deployment** | **String**|  |
 **clusterTemplate** | [**ClusterTemplate**](ClusterTemplate.md)|  |

### Return type

null (empty response body)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="delete"></a>
# **delete**
> delete(environment, deployment, cluster)

Delete a cluster by name



### Example
```java
// Import classes:
//import com.cloudera.director.client.common.ApiClient;
//import com.cloudera.director.client.common.ApiException;
//import com.cloudera.director.client.common.Configuration;
//import com.cloudera.director.client.common.auth.*;
//import com.cloudera.director.client.latest.api.ClustersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

ClustersApi apiInstance = new ClustersApi();
String environment = "environment_example"; // String | 
String deployment = "deployment_example"; // String | 
String cluster = "cluster_example"; // String | 
try {
    apiInstance.delete(environment, deployment, cluster);
} catch (ApiException e) {
    System.err.println("Exception when calling ClustersApi#delete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **environment** | **String**|  |
 **deployment** | **String**|  |
 **cluster** | **String**|  |

### Return type

null (empty response body)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="exportClusterConfiguration"></a>
# **exportClusterConfiguration**
> String exportClusterConfiguration(environment, deployment, cluster)

Exports the cluster configuration for this cluster



### Example
```java
// Import classes:
//import com.cloudera.director.client.common.ApiClient;
//import com.cloudera.director.client.common.ApiException;
//import com.cloudera.director.client.common.Configuration;
//import com.cloudera.director.client.common.auth.*;
//import com.cloudera.director.client.latest.api.ClustersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

ClustersApi apiInstance = new ClustersApi();
String environment = "environment_example"; // String | 
String deployment = "deployment_example"; // String | 
String cluster = "cluster_example"; // String | 
try {
    String result = apiInstance.exportClusterConfiguration(environment, deployment, cluster);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClustersApi#exportClusterConfiguration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **environment** | **String**|  |
 **deployment** | **String**|  |
 **cluster** | **String**|  |

### Return type

**String**

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/hocon

<a name="getAdministrationSettings"></a>
# **getAdministrationSettings**
> ClusterAdministrationSettings getAdministrationSettings(environment, deployment, cluster)

Get administration settings for a cluster



### Example
```java
// Import classes:
//import com.cloudera.director.client.common.ApiClient;
//import com.cloudera.director.client.common.ApiException;
//import com.cloudera.director.client.common.Configuration;
//import com.cloudera.director.client.common.auth.*;
//import com.cloudera.director.client.latest.api.ClustersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

ClustersApi apiInstance = new ClustersApi();
String environment = "environment_example"; // String | 
String deployment = "deployment_example"; // String | 
String cluster = "cluster_example"; // String | 
try {
    ClusterAdministrationSettings result = apiInstance.getAdministrationSettings(environment, deployment, cluster);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClustersApi#getAdministrationSettings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **environment** | **String**|  |
 **deployment** | **String**|  |
 **cluster** | **String**|  |

### Return type

[**ClusterAdministrationSettings**](ClusterAdministrationSettings.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getHistory"></a>
# **getHistory**
> List&lt;ClusterUpdateEventSummary&gt; getHistory(environment, deployment, cluster, numEvents, page)

Get history of updates for a cluster



### Example
```java
// Import classes:
//import com.cloudera.director.client.common.ApiClient;
//import com.cloudera.director.client.common.ApiException;
//import com.cloudera.director.client.common.Configuration;
//import com.cloudera.director.client.common.auth.*;
//import com.cloudera.director.client.latest.api.ClustersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

ClustersApi apiInstance = new ClustersApi();
String environment = "environment_example"; // String | 
String deployment = "deployment_example"; // String | 
String cluster = "cluster_example"; // String | 
Integer numEvents = 56; // Integer | 
Integer page = 56; // Integer | 
try {
    List<ClusterUpdateEventSummary> result = apiInstance.getHistory(environment, deployment, cluster, numEvents, page);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClustersApi#getHistory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **environment** | **String**|  |
 **deployment** | **String**|  |
 **cluster** | **String**|  |
 **numEvents** | **Integer**|  | [optional]
 **page** | **Integer**|  | [optional]

### Return type

[**List&lt;ClusterUpdateEventSummary&gt;**](ClusterUpdateEventSummary.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getMetrics"></a>
# **getMetrics**
> Metrics getMetrics(environment, deployment, cluster)

Get cluster metrics by name



### Example
```java
// Import classes:
//import com.cloudera.director.client.common.ApiClient;
//import com.cloudera.director.client.common.ApiException;
//import com.cloudera.director.client.common.Configuration;
//import com.cloudera.director.client.common.auth.*;
//import com.cloudera.director.client.latest.api.ClustersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

ClustersApi apiInstance = new ClustersApi();
String environment = "environment_example"; // String | 
String deployment = "deployment_example"; // String | 
String cluster = "cluster_example"; // String | 
try {
    Metrics result = apiInstance.getMetrics(environment, deployment, cluster);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClustersApi#getMetrics");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **environment** | **String**|  |
 **deployment** | **String**|  |
 **cluster** | **String**|  |

### Return type

[**Metrics**](Metrics.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getRedacted"></a>
# **getRedacted**
> Cluster getRedacted(environment, deployment, cluster)

Get a cluster by name



### Example
```java
// Import classes:
//import com.cloudera.director.client.common.ApiClient;
//import com.cloudera.director.client.common.ApiException;
//import com.cloudera.director.client.common.Configuration;
//import com.cloudera.director.client.common.auth.*;
//import com.cloudera.director.client.latest.api.ClustersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

ClustersApi apiInstance = new ClustersApi();
String environment = "environment_example"; // String | 
String deployment = "deployment_example"; // String | 
String cluster = "cluster_example"; // String | 
try {
    Cluster result = apiInstance.getRedacted(environment, deployment, cluster);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClustersApi#getRedacted");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **environment** | **String**|  |
 **deployment** | **String**|  |
 **cluster** | **String**|  |

### Return type

[**Cluster**](Cluster.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getStatus"></a>
# **getStatus**
> Status getStatus(environment, deployment, cluster)

Get a cluster status by name



### Example
```java
// Import classes:
//import com.cloudera.director.client.common.ApiClient;
//import com.cloudera.director.client.common.ApiException;
//import com.cloudera.director.client.common.Configuration;
//import com.cloudera.director.client.common.auth.*;
//import com.cloudera.director.client.latest.api.ClustersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

ClustersApi apiInstance = new ClustersApi();
String environment = "environment_example"; // String | 
String deployment = "deployment_example"; // String | 
String cluster = "cluster_example"; // String | 
try {
    Status result = apiInstance.getStatus(environment, deployment, cluster);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClustersApi#getStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **environment** | **String**|  |
 **deployment** | **String**|  |
 **cluster** | **String**|  |

### Return type

[**Status**](Status.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTemplateRedacted"></a>
# **getTemplateRedacted**
> ClusterTemplate getTemplateRedacted(environment, deployment, cluster)

Get a cluster template by name



### Example
```java
// Import classes:
//import com.cloudera.director.client.common.ApiClient;
//import com.cloudera.director.client.common.ApiException;
//import com.cloudera.director.client.common.Configuration;
//import com.cloudera.director.client.common.auth.*;
//import com.cloudera.director.client.latest.api.ClustersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

ClustersApi apiInstance = new ClustersApi();
String environment = "environment_example"; // String | 
String deployment = "deployment_example"; // String | 
String cluster = "cluster_example"; // String | 
try {
    ClusterTemplate result = apiInstance.getTemplateRedacted(environment, deployment, cluster);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClustersApi#getTemplateRedacted");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **environment** | **String**|  |
 **deployment** | **String**|  |
 **cluster** | **String**|  |

### Return type

[**ClusterTemplate**](ClusterTemplate.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="list"></a>
# **list**
> List&lt;String&gt; list(environment, deployment)

List all clusters



### Example
```java
// Import classes:
//import com.cloudera.director.client.common.ApiClient;
//import com.cloudera.director.client.common.ApiException;
//import com.cloudera.director.client.common.Configuration;
//import com.cloudera.director.client.common.auth.*;
//import com.cloudera.director.client.latest.api.ClustersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

ClustersApi apiInstance = new ClustersApi();
String environment = "environment_example"; // String | 
String deployment = "deployment_example"; // String | 
try {
    List<String> result = apiInstance.list(environment, deployment);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClustersApi#list");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **environment** | **String**|  |
 **deployment** | **String**|  |

### Return type

**List&lt;String&gt;**

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="update"></a>
# **update**
> update(environment, deployment, cluster, desired)

Update an existing cluster



### Example
```java
// Import classes:
//import com.cloudera.director.client.common.ApiClient;
//import com.cloudera.director.client.common.ApiException;
//import com.cloudera.director.client.common.Configuration;
//import com.cloudera.director.client.common.auth.*;
//import com.cloudera.director.client.latest.api.ClustersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

ClustersApi apiInstance = new ClustersApi();
String environment = "environment_example"; // String | 
String deployment = "deployment_example"; // String | 
String cluster = "cluster_example"; // String | 
ClusterTemplate desired = new ClusterTemplate(); // ClusterTemplate | 
try {
    apiInstance.update(environment, deployment, cluster, desired);
} catch (ApiException e) {
    System.err.println("Exception when calling ClustersApi#update");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **environment** | **String**|  |
 **deployment** | **String**|  |
 **cluster** | **String**|  |
 **desired** | [**ClusterTemplate**](ClusterTemplate.md)|  |

### Return type

null (empty response body)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateAdministrationSettings"></a>
# **updateAdministrationSettings**
> updateAdministrationSettings(environment, deployment, cluster, administrationSettings)

Update administration settings for a cluster



### Example
```java
// Import classes:
//import com.cloudera.director.client.common.ApiClient;
//import com.cloudera.director.client.common.ApiException;
//import com.cloudera.director.client.common.Configuration;
//import com.cloudera.director.client.common.auth.*;
//import com.cloudera.director.client.latest.api.ClustersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

ClustersApi apiInstance = new ClustersApi();
String environment = "environment_example"; // String | 
String deployment = "deployment_example"; // String | 
String cluster = "cluster_example"; // String | 
ClusterAdministrationSettings administrationSettings = new ClusterAdministrationSettings(); // ClusterAdministrationSettings | 
try {
    apiInstance.updateAdministrationSettings(environment, deployment, cluster, administrationSettings);
} catch (ApiException e) {
    System.err.println("Exception when calling ClustersApi#updateAdministrationSettings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **environment** | **String**|  |
 **deployment** | **String**|  |
 **cluster** | **String**|  |
 **administrationSettings** | [**ClusterAdministrationSettings**](ClusterAdministrationSettings.md)|  |

### Return type

null (empty response body)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

