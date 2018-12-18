# cloudera.director.VersionsApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_latest_version**](VersionsApi.md#get_latest_version) | **GET** /api/versions/latest | 
[**get_versions**](VersionsApi.md#get_versions) | **GET** /api/versions | 


# **get_latest_version**
> str get_latest_version()



### Example
```python
from __future__ import print_function
import time
import cloudera.director
from cloudera.director.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = cloudera.director.VersionsApi()

try:
    api_response = api_instance.get_latest_version()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling VersionsApi->get_latest_version: %s\n" % e)
```

### Parameters
This endpoint does not need any parameter.

### Return type

**str**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_versions**
> Version get_versions()



### Example
```python
from __future__ import print_function
import time
import cloudera.director
from cloudera.director.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = cloudera.director.VersionsApi()

try:
    api_response = api_instance.get_versions()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling VersionsApi->get_versions: %s\n" % e)
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Version**](Version.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

