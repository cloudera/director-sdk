# cloudera.director.EnvironmentsApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create**](EnvironmentsApi.md#create) | **POST** /api/d6.1/environments | Create a new environment
[**delete**](EnvironmentsApi.md#delete) | **DELETE** /api/d6.1/environments/{name} | Delete an environment by name
[**get_redacted**](EnvironmentsApi.md#get_redacted) | **GET** /api/d6.1/environments/{name} | Get an environment by name
[**list**](EnvironmentsApi.md#list) | **GET** /api/d6.1/environments | List all environments
[**update**](EnvironmentsApi.md#update) | **PUT** /api/d6.1/environments/{name} | Update an existing environment
[**update_provider_credentials**](EnvironmentsApi.md#update_provider_credentials) | **PUT** /api/d6.1/environments/{name}/provider/credentials | Update provider credentials for a specific environment


# **create**
> create(environment)

Create a new environment



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
api_instance = cloudera.director.EnvironmentsApi(cloudera.director.ApiClient(configuration))
environment = cloudera.director.Environment() # Environment | 

try:
    # Create a new environment
    api_instance.create(environment)
except ApiException as e:
    print("Exception when calling EnvironmentsApi->create: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **environment** | [**Environment**](Environment.md)|  | 

### Return type

void (empty response body)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete**
> delete(name)

Delete an environment by name



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
api_instance = cloudera.director.EnvironmentsApi(cloudera.director.ApiClient(configuration))
name = 'name_example' # str | 

try:
    # Delete an environment by name
    api_instance.delete(name)
except ApiException as e:
    print("Exception when calling EnvironmentsApi->delete: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **str**|  | 

### Return type

void (empty response body)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_redacted**
> Environment get_redacted(name)

Get an environment by name



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
api_instance = cloudera.director.EnvironmentsApi(cloudera.director.ApiClient(configuration))
name = 'name_example' # str | 

try:
    # Get an environment by name
    api_response = api_instance.get_redacted(name)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling EnvironmentsApi->get_redacted: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **str**|  | 

### Return type

[**Environment**](Environment.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list**
> list[str] list()

List all environments



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
api_instance = cloudera.director.EnvironmentsApi(cloudera.director.ApiClient(configuration))

try:
    # List all environments
    api_response = api_instance.list()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling EnvironmentsApi->list: %s\n" % e)
```

### Parameters
This endpoint does not need any parameter.

### Return type

**list[str]**

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update**
> update(name, environment)

Update an existing environment



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
api_instance = cloudera.director.EnvironmentsApi(cloudera.director.ApiClient(configuration))
name = 'name_example' # str | 
environment = cloudera.director.Environment() # Environment | 

try:
    # Update an existing environment
    api_instance.update(name, environment)
except ApiException as e:
    print("Exception when calling EnvironmentsApi->update: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **str**|  | 
 **environment** | [**Environment**](Environment.md)|  | 

### Return type

void (empty response body)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_provider_credentials**
> update_provider_credentials(name, credentials)

Update provider credentials for a specific environment



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
api_instance = cloudera.director.EnvironmentsApi(cloudera.director.ApiClient(configuration))
name = 'name_example' # str | 
credentials = NULL # object | 

try:
    # Update provider credentials for a specific environment
    api_instance.update_provider_credentials(name, credentials)
except ApiException as e:
    print("Exception when calling EnvironmentsApi->update_provider_credentials: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **str**|  | 
 **credentials** | **object**|  | 

### Return type

void (empty response body)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

