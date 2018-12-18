# cloudera.director.ImportClientConfigApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**convert_simple**](ImportClientConfigApi.md#convert_simple) | **POST** /api/d6.1/import/clientConfig/convertSimple | Convert Simple Configuration
[**import_client_config**](ImportClientConfigApi.md#import_client_config) | **POST** /api/d6.1/import | Import Client Config
[**validate**](ImportClientConfigApi.md#validate) | **POST** /api/d6.1/import/clientConfig/validate | Validate Client Config


# **convert_simple**
> str convert_simple(simple_client_config, include_origin_comments=include_origin_comments)

Convert Simple Configuration



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
api_instance = cloudera.director.ImportClientConfigApi(cloudera.director.ApiClient(configuration))
simple_client_config = 'simple_client_config_example' # str | 
include_origin_comments = true # bool |  (optional)

try:
    # Convert Simple Configuration
    api_response = api_instance.convert_simple(simple_client_config, include_origin_comments=include_origin_comments)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ImportClientConfigApi->convert_simple: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **simple_client_config** | **str**|  | 
 **include_origin_comments** | **bool**|  | [optional] 

### Return type

**str**

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/hocon
 - **Accept**: application/hocon

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **import_client_config**
> ImportResult import_client_config(client_config, cluster_name=cluster_name, deployment_name=deployment_name, environment_name=environment_name)

Import Client Config



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
api_instance = cloudera.director.ImportClientConfigApi(cloudera.director.ApiClient(configuration))
client_config = 'client_config_example' # str | 
cluster_name = 'cluster_name_example' # str |  (optional)
deployment_name = 'deployment_name_example' # str |  (optional)
environment_name = 'environment_name_example' # str |  (optional)

try:
    # Import Client Config
    api_response = api_instance.import_client_config(client_config, cluster_name=cluster_name, deployment_name=deployment_name, environment_name=environment_name)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ImportClientConfigApi->import_client_config: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client_config** | **str**|  | 
 **cluster_name** | **str**|  | [optional] 
 **deployment_name** | **str**|  | [optional] 
 **environment_name** | **str**|  | [optional] 

### Return type

[**ImportResult**](ImportResult.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/hocon
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **validate**
> ValidationResults validate(client_config, cluster_name=cluster_name, deployment_name=deployment_name, environment_name=environment_name)

Validate Client Config



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
api_instance = cloudera.director.ImportClientConfigApi(cloudera.director.ApiClient(configuration))
client_config = 'client_config_example' # str | 
cluster_name = 'cluster_name_example' # str |  (optional)
deployment_name = 'deployment_name_example' # str |  (optional)
environment_name = 'environment_name_example' # str |  (optional)

try:
    # Validate Client Config
    api_response = api_instance.validate(client_config, cluster_name=cluster_name, deployment_name=deployment_name, environment_name=environment_name)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ImportClientConfigApi->validate: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client_config** | **str**|  | 
 **cluster_name** | **str**|  | [optional] 
 **deployment_name** | **str**|  | [optional] 
 **environment_name** | **str**|  | [optional] 

### Return type

[**ValidationResults**](ValidationResults.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/hocon
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

