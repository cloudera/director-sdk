# cloudera.director.ClustersApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**collect_diagnostic_data**](ClustersApi.md#collect_diagnostic_data) | **POST** /api/d6.1/environments/{environment}/deployments/{deployment}/clusters/{cluster}/diagnosticData | Collects diagnostic data
[**create**](ClustersApi.md#create) | **POST** /api/d6.1/environments/{environment}/deployments/{deployment}/clusters | Create a new cluster
[**delete**](ClustersApi.md#delete) | **DELETE** /api/d6.1/environments/{environment}/deployments/{deployment}/clusters/{cluster} | Delete a cluster by name
[**export_cluster_configuration**](ClustersApi.md#export_cluster_configuration) | **GET** /api/d6.1/environments/{environment}/deployments/{deployment}/clusters/{cluster}/config | Exports the cluster configuration for this cluster
[**get_administration_settings**](ClustersApi.md#get_administration_settings) | **GET** /api/d6.1/environments/{environment}/deployments/{deployment}/clusters/{cluster}/settings | Get administration settings for a cluster
[**get_history**](ClustersApi.md#get_history) | **GET** /api/d6.1/environments/{environment}/deployments/{deployment}/clusters/{cluster}/history | Get history of updates for a cluster
[**get_metrics**](ClustersApi.md#get_metrics) | **GET** /api/d6.1/environments/{environment}/deployments/{deployment}/clusters/{cluster}/metrics | Get cluster metrics by name
[**get_redacted**](ClustersApi.md#get_redacted) | **GET** /api/d6.1/environments/{environment}/deployments/{deployment}/clusters/{cluster} | Get a cluster by name
[**get_status**](ClustersApi.md#get_status) | **GET** /api/d6.1/environments/{environment}/deployments/{deployment}/clusters/{cluster}/status | Get a cluster status by name
[**get_template_redacted**](ClustersApi.md#get_template_redacted) | **GET** /api/d6.1/environments/{environment}/deployments/{deployment}/clusters/{cluster}/template | Get a cluster template by name
[**list**](ClustersApi.md#list) | **GET** /api/d6.1/environments/{environment}/deployments/{deployment}/clusters | List all clusters
[**update**](ClustersApi.md#update) | **PUT** /api/d6.1/environments/{environment}/deployments/{deployment}/clusters/{cluster} | Update an existing cluster
[**update_administration_settings**](ClustersApi.md#update_administration_settings) | **PUT** /api/d6.1/environments/{environment}/deployments/{deployment}/clusters/{cluster}/settings | Update administration settings for a cluster


# **collect_diagnostic_data**
> collect_diagnostic_data(environment, deployment, cluster)

Collects diagnostic data



### Example
```python
from __future__ import print_function
import time
import cloudera.director
from cloudera.director.rest import ApiException
from pprint import pprint

# Configure HTTP basic authorization: basic
configuration = cloudera.director.Configuration()
configuration.username = 'YOUR_USERNAME'
configuration.password = 'YOUR_PASSWORD'

# create an instance of the API class
api_instance = cloudera.director.ClustersApi(cloudera.director.ApiClient(configuration))
environment = 'environment_example' # str | 
deployment = 'deployment_example' # str | 
cluster = 'cluster_example' # str | 

try:
    # Collects diagnostic data
    api_instance.collect_diagnostic_data(environment, deployment, cluster)
except ApiException as e:
    print("Exception when calling ClustersApi->collect_diagnostic_data: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **environment** | **str**|  | 
 **deployment** | **str**|  | 
 **cluster** | **str**|  | 

### Return type

void (empty response body)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create**
> create(environment, deployment, cluster_template)

Create a new cluster



### Example
```python
from __future__ import print_function
import time
import cloudera.director
from cloudera.director.rest import ApiException
from pprint import pprint

# Configure HTTP basic authorization: basic
configuration = cloudera.director.Configuration()
configuration.username = 'YOUR_USERNAME'
configuration.password = 'YOUR_PASSWORD'

# create an instance of the API class
api_instance = cloudera.director.ClustersApi(cloudera.director.ApiClient(configuration))
environment = 'environment_example' # str | 
deployment = 'deployment_example' # str | 
cluster_template = cloudera.director.ClusterTemplate() # ClusterTemplate | 

try:
    # Create a new cluster
    api_instance.create(environment, deployment, cluster_template)
except ApiException as e:
    print("Exception when calling ClustersApi->create: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **environment** | **str**|  | 
 **deployment** | **str**|  | 
 **cluster_template** | [**ClusterTemplate**](ClusterTemplate.md)|  | 

### Return type

void (empty response body)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete**
> delete(environment, deployment, cluster)

Delete a cluster by name



### Example
```python
from __future__ import print_function
import time
import cloudera.director
from cloudera.director.rest import ApiException
from pprint import pprint

# Configure HTTP basic authorization: basic
configuration = cloudera.director.Configuration()
configuration.username = 'YOUR_USERNAME'
configuration.password = 'YOUR_PASSWORD'

# create an instance of the API class
api_instance = cloudera.director.ClustersApi(cloudera.director.ApiClient(configuration))
environment = 'environment_example' # str | 
deployment = 'deployment_example' # str | 
cluster = 'cluster_example' # str | 

try:
    # Delete a cluster by name
    api_instance.delete(environment, deployment, cluster)
except ApiException as e:
    print("Exception when calling ClustersApi->delete: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **environment** | **str**|  | 
 **deployment** | **str**|  | 
 **cluster** | **str**|  | 

### Return type

void (empty response body)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **export_cluster_configuration**
> str export_cluster_configuration(environment, deployment, cluster)

Exports the cluster configuration for this cluster



### Example
```python
from __future__ import print_function
import time
import cloudera.director
from cloudera.director.rest import ApiException
from pprint import pprint

# Configure HTTP basic authorization: basic
configuration = cloudera.director.Configuration()
configuration.username = 'YOUR_USERNAME'
configuration.password = 'YOUR_PASSWORD'

# create an instance of the API class
api_instance = cloudera.director.ClustersApi(cloudera.director.ApiClient(configuration))
environment = 'environment_example' # str | 
deployment = 'deployment_example' # str | 
cluster = 'cluster_example' # str | 

try:
    # Exports the cluster configuration for this cluster
    api_response = api_instance.export_cluster_configuration(environment, deployment, cluster)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ClustersApi->export_cluster_configuration: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **environment** | **str**|  | 
 **deployment** | **str**|  | 
 **cluster** | **str**|  | 

### Return type

**str**

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/hocon

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_administration_settings**
> ClusterAdministrationSettings get_administration_settings(environment, deployment, cluster)

Get administration settings for a cluster



### Example
```python
from __future__ import print_function
import time
import cloudera.director
from cloudera.director.rest import ApiException
from pprint import pprint

# Configure HTTP basic authorization: basic
configuration = cloudera.director.Configuration()
configuration.username = 'YOUR_USERNAME'
configuration.password = 'YOUR_PASSWORD'

# create an instance of the API class
api_instance = cloudera.director.ClustersApi(cloudera.director.ApiClient(configuration))
environment = 'environment_example' # str | 
deployment = 'deployment_example' # str | 
cluster = 'cluster_example' # str | 

try:
    # Get administration settings for a cluster
    api_response = api_instance.get_administration_settings(environment, deployment, cluster)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ClustersApi->get_administration_settings: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **environment** | **str**|  | 
 **deployment** | **str**|  | 
 **cluster** | **str**|  | 

### Return type

[**ClusterAdministrationSettings**](ClusterAdministrationSettings.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_history**
> list[ClusterUpdateEventSummary] get_history(environment, deployment, cluster, num_events=num_events, page=page)

Get history of updates for a cluster



### Example
```python
from __future__ import print_function
import time
import cloudera.director
from cloudera.director.rest import ApiException
from pprint import pprint

# Configure HTTP basic authorization: basic
configuration = cloudera.director.Configuration()
configuration.username = 'YOUR_USERNAME'
configuration.password = 'YOUR_PASSWORD'

# create an instance of the API class
api_instance = cloudera.director.ClustersApi(cloudera.director.ApiClient(configuration))
environment = 'environment_example' # str | 
deployment = 'deployment_example' # str | 
cluster = 'cluster_example' # str | 
num_events = 56 # int |  (optional)
page = 56 # int |  (optional)

try:
    # Get history of updates for a cluster
    api_response = api_instance.get_history(environment, deployment, cluster, num_events=num_events, page=page)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ClustersApi->get_history: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **environment** | **str**|  | 
 **deployment** | **str**|  | 
 **cluster** | **str**|  | 
 **num_events** | **int**|  | [optional] 
 **page** | **int**|  | [optional] 

### Return type

[**list[ClusterUpdateEventSummary]**](ClusterUpdateEventSummary.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_metrics**
> Metrics get_metrics(environment, deployment, cluster)

Get cluster metrics by name



### Example
```python
from __future__ import print_function
import time
import cloudera.director
from cloudera.director.rest import ApiException
from pprint import pprint

# Configure HTTP basic authorization: basic
configuration = cloudera.director.Configuration()
configuration.username = 'YOUR_USERNAME'
configuration.password = 'YOUR_PASSWORD'

# create an instance of the API class
api_instance = cloudera.director.ClustersApi(cloudera.director.ApiClient(configuration))
environment = 'environment_example' # str | 
deployment = 'deployment_example' # str | 
cluster = 'cluster_example' # str | 

try:
    # Get cluster metrics by name
    api_response = api_instance.get_metrics(environment, deployment, cluster)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ClustersApi->get_metrics: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **environment** | **str**|  | 
 **deployment** | **str**|  | 
 **cluster** | **str**|  | 

### Return type

[**Metrics**](Metrics.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_redacted**
> Cluster get_redacted(environment, deployment, cluster)

Get a cluster by name



### Example
```python
from __future__ import print_function
import time
import cloudera.director
from cloudera.director.rest import ApiException
from pprint import pprint

# Configure HTTP basic authorization: basic
configuration = cloudera.director.Configuration()
configuration.username = 'YOUR_USERNAME'
configuration.password = 'YOUR_PASSWORD'

# create an instance of the API class
api_instance = cloudera.director.ClustersApi(cloudera.director.ApiClient(configuration))
environment = 'environment_example' # str | 
deployment = 'deployment_example' # str | 
cluster = 'cluster_example' # str | 

try:
    # Get a cluster by name
    api_response = api_instance.get_redacted(environment, deployment, cluster)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ClustersApi->get_redacted: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **environment** | **str**|  | 
 **deployment** | **str**|  | 
 **cluster** | **str**|  | 

### Return type

[**Cluster**](Cluster.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_status**
> Status get_status(environment, deployment, cluster)

Get a cluster status by name



### Example
```python
from __future__ import print_function
import time
import cloudera.director
from cloudera.director.rest import ApiException
from pprint import pprint

# Configure HTTP basic authorization: basic
configuration = cloudera.director.Configuration()
configuration.username = 'YOUR_USERNAME'
configuration.password = 'YOUR_PASSWORD'

# create an instance of the API class
api_instance = cloudera.director.ClustersApi(cloudera.director.ApiClient(configuration))
environment = 'environment_example' # str | 
deployment = 'deployment_example' # str | 
cluster = 'cluster_example' # str | 

try:
    # Get a cluster status by name
    api_response = api_instance.get_status(environment, deployment, cluster)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ClustersApi->get_status: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **environment** | **str**|  | 
 **deployment** | **str**|  | 
 **cluster** | **str**|  | 

### Return type

[**Status**](Status.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_template_redacted**
> ClusterTemplate get_template_redacted(environment, deployment, cluster)

Get a cluster template by name



### Example
```python
from __future__ import print_function
import time
import cloudera.director
from cloudera.director.rest import ApiException
from pprint import pprint

# Configure HTTP basic authorization: basic
configuration = cloudera.director.Configuration()
configuration.username = 'YOUR_USERNAME'
configuration.password = 'YOUR_PASSWORD'

# create an instance of the API class
api_instance = cloudera.director.ClustersApi(cloudera.director.ApiClient(configuration))
environment = 'environment_example' # str | 
deployment = 'deployment_example' # str | 
cluster = 'cluster_example' # str | 

try:
    # Get a cluster template by name
    api_response = api_instance.get_template_redacted(environment, deployment, cluster)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ClustersApi->get_template_redacted: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **environment** | **str**|  | 
 **deployment** | **str**|  | 
 **cluster** | **str**|  | 

### Return type

[**ClusterTemplate**](ClusterTemplate.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list**
> list[str] list(environment, deployment)

List all clusters



### Example
```python
from __future__ import print_function
import time
import cloudera.director
from cloudera.director.rest import ApiException
from pprint import pprint

# Configure HTTP basic authorization: basic
configuration = cloudera.director.Configuration()
configuration.username = 'YOUR_USERNAME'
configuration.password = 'YOUR_PASSWORD'

# create an instance of the API class
api_instance = cloudera.director.ClustersApi(cloudera.director.ApiClient(configuration))
environment = 'environment_example' # str | 
deployment = 'deployment_example' # str | 

try:
    # List all clusters
    api_response = api_instance.list(environment, deployment)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ClustersApi->list: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **environment** | **str**|  | 
 **deployment** | **str**|  | 

### Return type

**list[str]**

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update**
> update(environment, deployment, cluster, desired)

Update an existing cluster



### Example
```python
from __future__ import print_function
import time
import cloudera.director
from cloudera.director.rest import ApiException
from pprint import pprint

# Configure HTTP basic authorization: basic
configuration = cloudera.director.Configuration()
configuration.username = 'YOUR_USERNAME'
configuration.password = 'YOUR_PASSWORD'

# create an instance of the API class
api_instance = cloudera.director.ClustersApi(cloudera.director.ApiClient(configuration))
environment = 'environment_example' # str | 
deployment = 'deployment_example' # str | 
cluster = 'cluster_example' # str | 
desired = cloudera.director.ClusterTemplate() # ClusterTemplate | 

try:
    # Update an existing cluster
    api_instance.update(environment, deployment, cluster, desired)
except ApiException as e:
    print("Exception when calling ClustersApi->update: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **environment** | **str**|  | 
 **deployment** | **str**|  | 
 **cluster** | **str**|  | 
 **desired** | [**ClusterTemplate**](ClusterTemplate.md)|  | 

### Return type

void (empty response body)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_administration_settings**
> update_administration_settings(environment, deployment, cluster, administration_settings)

Update administration settings for a cluster



### Example
```python
from __future__ import print_function
import time
import cloudera.director
from cloudera.director.rest import ApiException
from pprint import pprint

# Configure HTTP basic authorization: basic
configuration = cloudera.director.Configuration()
configuration.username = 'YOUR_USERNAME'
configuration.password = 'YOUR_PASSWORD'

# create an instance of the API class
api_instance = cloudera.director.ClustersApi(cloudera.director.ApiClient(configuration))
environment = 'environment_example' # str | 
deployment = 'deployment_example' # str | 
cluster = 'cluster_example' # str | 
administration_settings = cloudera.director.ClusterAdministrationSettings() # ClusterAdministrationSettings | 

try:
    # Update administration settings for a cluster
    api_instance.update_administration_settings(environment, deployment, cluster, administration_settings)
except ApiException as e:
    print("Exception when calling ClustersApi->update_administration_settings: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **environment** | **str**|  | 
 **deployment** | **str**|  | 
 **cluster** | **str**|  | 
 **administration_settings** | [**ClusterAdministrationSettings**](ClusterAdministrationSettings.md)|  | 

### Return type

void (empty response body)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

