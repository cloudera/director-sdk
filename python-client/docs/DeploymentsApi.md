# cloudera.director.DeploymentsApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**collect_diagnostic_data**](DeploymentsApi.md#collect_diagnostic_data) | **POST** /api/d6.2/environments/{environment}/deployments/{deployment}/diagnosticData | Collects diagnostic data
[**create**](DeploymentsApi.md#create) | **POST** /api/d6.2/environments/{environment}/deployments | Create a new deployment
[**delete**](DeploymentsApi.md#delete) | **DELETE** /api/d6.2/environments/{environment}/deployments/{deployment} | Delete a deployment by name
[**get_redacted**](DeploymentsApi.md#get_redacted) | **GET** /api/d6.2/environments/{environment}/deployments/{deployment} | Get a deployment by name
[**get_status**](DeploymentsApi.md#get_status) | **GET** /api/d6.2/environments/{environment}/deployments/{deployment}/status | Get a deployment status by name
[**get_template_redacted**](DeploymentsApi.md#get_template_redacted) | **GET** /api/d6.2/environments/{environment}/deployments/{deployment}/template | Get a deployment template by name
[**list**](DeploymentsApi.md#list) | **GET** /api/d6.2/environments/{environment}/deployments | List all deployments
[**update**](DeploymentsApi.md#update) | **PUT** /api/d6.2/environments/{environment}/deployments/{deployment} | Update an existing deployment template
[**update_metering_setting**](DeploymentsApi.md#update_metering_setting) | **PUT** /api/d6.2/environments/{environment}/deployments/{deployment}/metering | Update billing ID for an existing deployment


# **collect_diagnostic_data**
> collect_diagnostic_data(environment, deployment)

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
api_instance = cloudera.director.DeploymentsApi(cloudera.director.ApiClient(configuration))
environment = 'environment_example' # str | 
deployment = 'deployment_example' # str | 

try:
    # Collects diagnostic data
    api_instance.collect_diagnostic_data(environment, deployment)
except ApiException as e:
    print("Exception when calling DeploymentsApi->collect_diagnostic_data: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **environment** | **str**|  | 
 **deployment** | **str**|  | 

### Return type

void (empty response body)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create**
> create(environment, deployment_template)

Create a new deployment



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
api_instance = cloudera.director.DeploymentsApi(cloudera.director.ApiClient(configuration))
environment = 'environment_example' # str | 
deployment_template = cloudera.director.DeploymentTemplate() # DeploymentTemplate | 

try:
    # Create a new deployment
    api_instance.create(environment, deployment_template)
except ApiException as e:
    print("Exception when calling DeploymentsApi->create: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **environment** | **str**|  | 
 **deployment_template** | [**DeploymentTemplate**](DeploymentTemplate.md)|  | 

### Return type

void (empty response body)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete**
> delete(environment, deployment)

Delete a deployment by name



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
api_instance = cloudera.director.DeploymentsApi(cloudera.director.ApiClient(configuration))
environment = 'environment_example' # str | 
deployment = 'deployment_example' # str | 

try:
    # Delete a deployment by name
    api_instance.delete(environment, deployment)
except ApiException as e:
    print("Exception when calling DeploymentsApi->delete: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **environment** | **str**|  | 
 **deployment** | **str**|  | 

### Return type

void (empty response body)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_redacted**
> Deployment get_redacted(environment, deployment)

Get a deployment by name



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
api_instance = cloudera.director.DeploymentsApi(cloudera.director.ApiClient(configuration))
environment = 'environment_example' # str | 
deployment = 'deployment_example' # str | 

try:
    # Get a deployment by name
    api_response = api_instance.get_redacted(environment, deployment)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling DeploymentsApi->get_redacted: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **environment** | **str**|  | 
 **deployment** | **str**|  | 

### Return type

[**Deployment**](Deployment.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_status**
> Status get_status(environment, deployment)

Get a deployment status by name



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
api_instance = cloudera.director.DeploymentsApi(cloudera.director.ApiClient(configuration))
environment = 'environment_example' # str | 
deployment = 'deployment_example' # str | 

try:
    # Get a deployment status by name
    api_response = api_instance.get_status(environment, deployment)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling DeploymentsApi->get_status: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **environment** | **str**|  | 
 **deployment** | **str**|  | 

### Return type

[**Status**](Status.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_template_redacted**
> DeploymentTemplate get_template_redacted(environment, deployment)

Get a deployment template by name



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
api_instance = cloudera.director.DeploymentsApi(cloudera.director.ApiClient(configuration))
environment = 'environment_example' # str | 
deployment = 'deployment_example' # str | 

try:
    # Get a deployment template by name
    api_response = api_instance.get_template_redacted(environment, deployment)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling DeploymentsApi->get_template_redacted: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **environment** | **str**|  | 
 **deployment** | **str**|  | 

### Return type

[**DeploymentTemplate**](DeploymentTemplate.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list**
> list[str] list(environment)

List all deployments



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
api_instance = cloudera.director.DeploymentsApi(cloudera.director.ApiClient(configuration))
environment = 'environment_example' # str | 

try:
    # List all deployments
    api_response = api_instance.list(environment)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling DeploymentsApi->list: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **environment** | **str**|  | 

### Return type

**list[str]**

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update**
> update(environment, deployment, updated_template)

Update an existing deployment template



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
api_instance = cloudera.director.DeploymentsApi(cloudera.director.ApiClient(configuration))
environment = 'environment_example' # str | 
deployment = 'deployment_example' # str | 
updated_template = cloudera.director.DeploymentTemplate() # DeploymentTemplate | 

try:
    # Update an existing deployment template
    api_instance.update(environment, deployment, updated_template)
except ApiException as e:
    print("Exception when calling DeploymentsApi->update: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **environment** | **str**|  | 
 **deployment** | **str**|  | 
 **updated_template** | [**DeploymentTemplate**](DeploymentTemplate.md)|  | 

### Return type

void (empty response body)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_metering_setting**
> update_metering_setting(environment, deployment, metering_setting)

Update billing ID for an existing deployment



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
api_instance = cloudera.director.DeploymentsApi(cloudera.director.ApiClient(configuration))
environment = 'environment_example' # str | 
deployment = 'deployment_example' # str | 
metering_setting = cloudera.director.MeteringSetting() # MeteringSetting | 

try:
    # Update billing ID for an existing deployment
    api_instance.update_metering_setting(environment, deployment, metering_setting)
except ApiException as e:
    print("Exception when calling DeploymentsApi->update_metering_setting: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **environment** | **str**|  | 
 **deployment** | **str**|  | 
 **metering_setting** | [**MeteringSetting**](MeteringSetting.md)|  | 

### Return type

void (empty response body)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

