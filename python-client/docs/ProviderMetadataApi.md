# cloudera.director.ProviderMetadataApi

All URIs are relative to *https://localhost:7189*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get**](ProviderMetadataApi.md#get) | **GET** /api/d6.0/metadata/providers/{providerId} | Get a provider by name
[**list**](ProviderMetadataApi.md#list) | **GET** /api/d6.0/metadata/providers | List all provider metadata


# **get**
> CloudProviderMetadata get(provider_id)

Get a provider by name

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
api_instance = cloudera.director.ProviderMetadataApi(cloudera.director.ApiClient(configuration))
provider_id = 'provider_id_example' # str | providerId

try:
    # Get a provider by name
    api_response = api_instance.get(provider_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ProviderMetadataApi->get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **provider_id** | **str**| providerId | 

### Return type

[**CloudProviderMetadata**](CloudProviderMetadata.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list**
> list[CloudProviderMetadata] list()

List all provider metadata

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
api_instance = cloudera.director.ProviderMetadataApi(cloudera.director.ApiClient(configuration))

try:
    # List all provider metadata
    api_response = api_instance.list()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ProviderMetadataApi->list: %s\n" % e)
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**list[CloudProviderMetadata]**](CloudProviderMetadata.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

