# cloudera.director.VersionsApi

All URIs are relative to *https://localhost:7189*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_latest_version**](VersionsApi.md#get_latest_version) | **GET** /api/versions/latest | getLatestVersion
[**get_versions**](VersionsApi.md#get_versions) | **GET** /api/versions | getVersions


# **get_latest_version**
> str get_latest_version()

getLatestVersion

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
api_instance = cloudera.director.VersionsApi(cloudera.director.ApiClient(configuration))

try:
    # getLatestVersion
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

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_versions**
> Version get_versions()

getVersions

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
api_instance = cloudera.director.VersionsApi(cloudera.director.ApiClient(configuration))

try:
    # getVersions
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

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

