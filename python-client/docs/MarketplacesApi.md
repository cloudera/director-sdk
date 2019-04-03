# cloudera.director.MarketplacesApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_cdh_images**](MarketplacesApi.md#get_cdh_images) | **GET** /api/d6.2/marketplaces/images/CDH | Get CDH marketplace images
[**get_cm_images**](MarketplacesApi.md#get_cm_images) | **GET** /api/d6.2/marketplaces/images/CM | Get CM marketplace images


# **get_cdh_images**
> list[MarketplaceImage] get_cdh_images()

Get CDH marketplace images



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
api_instance = cloudera.director.MarketplacesApi(cloudera.director.ApiClient(configuration))

try:
    # Get CDH marketplace images
    api_response = api_instance.get_cdh_images()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling MarketplacesApi->get_cdh_images: %s\n" % e)
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**list[MarketplaceImage]**](MarketplaceImage.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_cm_images**
> list[MarketplaceImage] get_cm_images()

Get CM marketplace images



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
api_instance = cloudera.director.MarketplacesApi(cloudera.director.ApiClient(configuration))

try:
    # Get CM marketplace images
    api_response = api_instance.get_cm_images()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling MarketplacesApi->get_cm_images: %s\n" % e)
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**list[MarketplaceImage]**](MarketplaceImage.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

