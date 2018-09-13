# ClustersApi

All URIs are relative to *https://localhost:7189*

Method | HTTP request | Description
------------- | ------------- | -------------
[**collectDiagnosticData**](ClustersApi.md#collectDiagnosticData) | **POST** /api/d6.0/environments/{environment}/deployments/{deployment}/clusters/{cluster}/diagnosticData | Collects diagnostic data
[**create**](ClustersApi.md#create) | **POST** /api/d6.0/environments/{environment}/deployments/{deployment}/clusters | Create a new cluster
[**delete**](ClustersApi.md#delete) | **DELETE** /api/d6.0/environments/{environment}/deployments/{deployment}/clusters/{cluster} | Delete a cluster by name
[**exportClusterConfiguration**](ClustersApi.md#exportClusterConfiguration) | **GET** /api/d6.0/environments/{environment}/deployments/{deployment}/clusters/{cluster}/config | Exports the cluster configuration for this cluster
[**getAdministrationSettings**](ClustersApi.md#getAdministrationSettings) | **GET** /api/d6.0/environments/{environment}/deployments/{deployment}/clusters/{cluster}/settings | Get administration settings for a cluster
[**getHistory**](ClustersApi.md#getHistory) | **GET** /api/d6.0/environments/{environment}/deployments/{deployment}/clusters/{cluster}/history | Get history of updates for a cluster
[**getMetrics**](ClustersApi.md#getMetrics) | **GET** /api/d6.0/environments/{environment}/deployments/{deployment}/clusters/{cluster}/metrics | Get cluster metrics by name
[**getRedacted**](ClustersApi.md#getRedacted) | **GET** /api/d6.0/environments/{environment}/deployments/{deployment}/clusters/{cluster} | Get a cluster by name
[**getStatus**](ClustersApi.md#getStatus) | **GET** /api/d6.0/environments/{environment}/deployments/{deployment}/clusters/{cluster}/status | Get a cluster status by name
[**getTemplateRedacted**](ClustersApi.md#getTemplateRedacted) | **GET** /api/d6.0/environments/{environment}/deployments/{deployment}/clusters/{cluster}/template | Get a cluster template by name
[**list**](ClustersApi.md#list) | **GET** /api/d6.0/environments/{environment}/deployments/{deployment}/clusters | List all clusters
[**update**](ClustersApi.md#update) | **PUT** /api/d6.0/environments/{environment}/deployments/{deployment}/clusters/{cluster} | Update an existing cluster
[**updateAdministrationSettings**](ClustersApi.md#updateAdministrationSettings) | **PUT** /api/d6.0/environments/{environment}/deployments/{deployment}/clusters/{cluster}/settings | Update administration settings for a cluster


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
String environment = "environment_example"; // String | environment
String deployment = "deployment_example"; // String | deployment
String cluster = "cluster_example"; // String | cluster
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
 **environment** | **String**| environment |
 **deployment** | **String**| deployment |
 **cluster** | **String**| cluster |

### Return type

null (empty response body)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
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
String environment = "environment_example"; // String | environment
String deployment = "deployment_example"; // String | deployment
ClusterTemplate clusterTemplate = new ClusterTemplate(); // ClusterTemplate | clusterTemplate
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
 **environment** | **String**| environment |
 **deployment** | **String**| deployment |
 **clusterTemplate** | [**ClusterTemplate**](ClusterTemplate.md)| clusterTemplate |

### Return type

null (empty response body)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
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
String environment = "environment_example"; // String | environment
String deployment = "deployment_example"; // String | deployment
String cluster = "cluster_example"; // String | cluster
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
 **environment** | **String**| environment |
 **deployment** | **String**| deployment |
 **cluster** | **String**| cluster |

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
String environment = "environment_example"; // String | environment
String deployment = "deployment_example"; // String | deployment
String cluster = "cluster_example"; // String | cluster
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
 **environment** | **String**| environment |
 **deployment** | **String**| deployment |
 **cluster** | **String**| cluster |

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
String environment = "environment_example"; // String | environment
String deployment = "deployment_example"; // String | deployment
String cluster = "cluster_example"; // String | cluster
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
 **environment** | **String**| environment |
 **deployment** | **String**| deployment |
 **cluster** | **String**| cluster |

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
String environment = "environment_example"; // String | environment
String deployment = "deployment_example"; // String | deployment
String cluster = "cluster_example"; // String | cluster
Integer numEvents = 10; // Integer | numEvents
Integer page = 0; // Integer | page
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
 **environment** | **String**| environment |
 **deployment** | **String**| deployment |
 **cluster** | **String**| cluster |
 **numEvents** | **Integer**| numEvents | [optional] [default to 10]
 **page** | **Integer**| page | [optional] [default to 0]

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
String environment = "environment_example"; // String | environment
String deployment = "deployment_example"; // String | deployment
String cluster = "cluster_example"; // String | cluster
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
 **environment** | **String**| environment |
 **deployment** | **String**| deployment |
 **cluster** | **String**| cluster |

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
String environment = "environment_example"; // String | environment
String deployment = "deployment_example"; // String | deployment
String cluster = "cluster_example"; // String | cluster
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
 **environment** | **String**| environment |
 **deployment** | **String**| deployment |
 **cluster** | **String**| cluster |

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
String environment = "environment_example"; // String | environment
String deployment = "deployment_example"; // String | deployment
String cluster = "cluster_example"; // String | cluster
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
 **environment** | **String**| environment |
 **deployment** | **String**| deployment |
 **cluster** | **String**| cluster |

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
String environment = "environment_example"; // String | environment
String deployment = "deployment_example"; // String | deployment
String cluster = "cluster_example"; // String | cluster
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
 **environment** | **String**| environment |
 **deployment** | **String**| deployment |
 **cluster** | **String**| cluster |

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
String environment = "environment_example"; // String | environment
String deployment = "deployment_example"; // String | deployment
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
 **environment** | **String**| environment |
 **deployment** | **String**| deployment |

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
String environment = "environment_example"; // String | environment
String deployment = "deployment_example"; // String | deployment
String cluster = "cluster_example"; // String | cluster
ClusterTemplate desired = new ClusterTemplate(); // ClusterTemplate | desired
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
 **environment** | **String**| environment |
 **deployment** | **String**| deployment |
 **cluster** | **String**| cluster |
 **desired** | [**ClusterTemplate**](ClusterTemplate.md)| desired |

### Return type

null (empty response body)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
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
String environment = "environment_example"; // String | environment
String deployment = "deployment_example"; // String | deployment
String cluster = "cluster_example"; // String | cluster
ClusterAdministrationSettings administrationSettings = new ClusterAdministrationSettings(); // ClusterAdministrationSettings | administrationSettings
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
 **environment** | **String**| environment |
 **deployment** | **String**| deployment |
 **cluster** | **String**| cluster |
 **administrationSettings** | [**ClusterAdministrationSettings**](ClusterAdministrationSettings.md)| administrationSettings |

### Return type

null (empty response body)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

