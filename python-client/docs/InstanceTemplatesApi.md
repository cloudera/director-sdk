# cloudera.director.InstanceTemplatesApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create**](InstanceTemplatesApi.md#create) | **POST** /api/d6.1/environments/{environment}/templates/instances | Create a new instance template
[**delete**](InstanceTemplatesApi.md#delete) | **DELETE** /api/d6.1/environments/{environment}/templates/instances/{template} | Delete an instance template by name
[**get**](InstanceTemplatesApi.md#get) | **GET** /api/d6.1/environments/{environment}/templates/instances/{template} | Get an instance template by name
[**list**](InstanceTemplatesApi.md#list) | **GET** /api/d6.1/environments/{environment}/templates/instances | List all instance templates
[**update**](InstanceTemplatesApi.md#update) | **PUT** /api/d6.1/environments/{environment}/templates/instances/{template} | Update an existing instance template


# **create**
> create(environment, instance_template)

Create a new instance template



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
api_instance = cloudera.director.InstanceTemplatesApi(cloudera.director.ApiClient(configuration))
environment = 'environment_example' # str | 
instance_template = cloudera.director.InstanceTemplate() # InstanceTemplate | 

try:
    # Create a new instance template
    api_instance.create(environment, instance_template)
except ApiException as e:
    print("Exception when calling InstanceTemplatesApi->create: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **environment** | **str**|  | 
 **instance_template** | [**InstanceTemplate**](InstanceTemplate.md)|  | 

### Return type

void (empty response body)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete**
> delete(environment, template)

Delete an instance template by name



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
api_instance = cloudera.director.InstanceTemplatesApi(cloudera.director.ApiClient(configuration))
environment = 'environment_example' # str | 
template = 'template_example' # str | 

try:
    # Delete an instance template by name
    api_instance.delete(environment, template)
except ApiException as e:
    print("Exception when calling InstanceTemplatesApi->delete: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **environment** | **str**|  | 
 **template** | **str**|  | 

### Return type

void (empty response body)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get**
> InstanceTemplate get(environment, template)

Get an instance template by name



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
api_instance = cloudera.director.InstanceTemplatesApi(cloudera.director.ApiClient(configuration))
environment = 'environment_example' # str | 
template = 'template_example' # str | 

try:
    # Get an instance template by name
    api_response = api_instance.get(environment, template)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling InstanceTemplatesApi->get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **environment** | **str**|  | 
 **template** | **str**|  | 

### Return type

[**InstanceTemplate**](InstanceTemplate.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list**
> list[str] list(environment)

List all instance templates



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
api_instance = cloudera.director.InstanceTemplatesApi(cloudera.director.ApiClient(configuration))
environment = 'environment_example' # str | 

try:
    # List all instance templates
    api_response = api_instance.list(environment)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling InstanceTemplatesApi->list: %s\n" % e)
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
> update(environment, template, instance_template)

Update an existing instance template



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
api_instance = cloudera.director.InstanceTemplatesApi(cloudera.director.ApiClient(configuration))
environment = 'environment_example' # str | 
template = 'template_example' # str | 
instance_template = cloudera.director.InstanceTemplate() # InstanceTemplate | 

try:
    # Update an existing instance template
    api_instance.update(environment, template, instance_template)
except ApiException as e:
    print("Exception when calling InstanceTemplatesApi->update: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **environment** | **str**|  | 
 **template** | **str**|  | 
 **instance_template** | [**InstanceTemplate**](InstanceTemplate.md)|  | 

### Return type

void (empty response body)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

