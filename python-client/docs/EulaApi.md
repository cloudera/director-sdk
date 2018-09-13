# cloudera.director.EulaApi

All URIs are relative to *https://localhost:7189*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get**](EulaApi.md#get) | **GET** /api/d6.0/eula | Get the EULA
[**update**](EulaApi.md#update) | **PUT** /api/d6.0/eula | Update the EULA


# **get**
> Eula get()

Get the EULA

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
api_instance = cloudera.director.EulaApi(cloudera.director.ApiClient(configuration))

try:
    # Get the EULA
    api_response = api_instance.get()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling EulaApi->get: %s\n" % e)
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Eula**](Eula.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update**
> update(eula)

Update the EULA

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
api_instance = cloudera.director.EulaApi(cloudera.director.ApiClient(configuration))
eula = cloudera.director.Eula() # Eula | eula

try:
    # Update the EULA
    api_instance.update(eula)
except ApiException as e:
    print("Exception when calling EulaApi->update: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eula** | [**Eula**](Eula.md)| eula | 

### Return type

void (empty response body)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

