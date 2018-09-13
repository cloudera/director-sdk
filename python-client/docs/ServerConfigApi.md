# cloudera.director.ServerConfigApi

All URIs are relative to *https://localhost:7189*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get**](ServerConfigApi.md#get) | **GET** /api/d6.0/serverConfigs | Get server configuration
[**metadata**](ServerConfigApi.md#metadata) | **GET** /api/d6.0/serverConfigs/metadata | Retrieves the metadata for server configuration
[**update_configs**](ServerConfigApi.md#update_configs) | **POST** /api/d6.0/serverConfigs | Get server configuration


# **get**
> dict(str, str) get()

Get server configuration

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
api_instance = cloudera.director.ServerConfigApi(cloudera.director.ApiClient(configuration))

try:
    # Get server configuration
    api_response = api_instance.get()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ServerConfigApi->get: %s\n" % e)
```

### Parameters
This endpoint does not need any parameter.

### Return type

**dict(str, str)**

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **metadata**
> list[ConfigurationProperty] metadata()

Retrieves the metadata for server configuration

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
api_instance = cloudera.director.ServerConfigApi(cloudera.director.ApiClient(configuration))

try:
    # Retrieves the metadata for server configuration
    api_response = api_instance.metadata()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ServerConfigApi->metadata: %s\n" % e)
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**list[ConfigurationProperty]**](ConfigurationProperty.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_configs**
> update_configs(server_configs)

Get server configuration

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
api_instance = cloudera.director.ServerConfigApi(cloudera.director.ApiClient(configuration))
server_configs = NULL # object | serverConfigs

try:
    # Get server configuration
    api_instance.update_configs(server_configs)
except ApiException as e:
    print("Exception when calling ServerConfigApi->update_configs: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **server_configs** | **object**| serverConfigs | 

### Return type

void (empty response body)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

