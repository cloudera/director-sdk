# cloudera.director.DatabaseServersApi

All URIs are relative to *https://localhost:7189*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create**](DatabaseServersApi.md#create) | **POST** /api/d6.0/environments/{environment}/databaseServers | Create a new external database server
[**delete**](DatabaseServersApi.md#delete) | **DELETE** /api/d6.0/environments/{environment}/databaseServers/{externalDatabaseServer} | Delete an external database server by name
[**get_database_server_usage**](DatabaseServersApi.md#get_database_server_usage) | **GET** /api/d6.0/environments/{environment}/databaseServers/{externalDatabaseServer}/usage | Get an external database server usage by name
[**get_redacted**](DatabaseServersApi.md#get_redacted) | **GET** /api/d6.0/environments/{environment}/databaseServers/{externalDatabaseServer} | Get an external database server by name
[**get_status**](DatabaseServersApi.md#get_status) | **GET** /api/d6.0/environments/{environment}/databaseServers/{externalDatabaseServer}/status | Get an external database server status by name
[**get_template_redacted**](DatabaseServersApi.md#get_template_redacted) | **GET** /api/d6.0/environments/{environment}/databaseServers/{externalDatabaseServer}/template | Get an external database server template by name
[**list**](DatabaseServersApi.md#list) | **GET** /api/d6.0/environments/{environment}/databaseServers | List all externalDatabaseServers
[**update**](DatabaseServersApi.md#update) | **PUT** /api/d6.0/environments/{environment}/databaseServers/{externalDatabaseServer} | Update an existing external database server (unsupported)


# **create**
> create(environment, external_database_server_template)

Create a new external database server

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
api_instance = cloudera.director.DatabaseServersApi(cloudera.director.ApiClient(configuration))
environment = 'environment_example' # str | environment
external_database_server_template = cloudera.director.ExternalDatabaseServerTemplate() # ExternalDatabaseServerTemplate | externalDatabaseServerTemplate

try:
    # Create a new external database server
    api_instance.create(environment, external_database_server_template)
except ApiException as e:
    print("Exception when calling DatabaseServersApi->create: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **environment** | **str**| environment | 
 **external_database_server_template** | [**ExternalDatabaseServerTemplate**](ExternalDatabaseServerTemplate.md)| externalDatabaseServerTemplate | 

### Return type

void (empty response body)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete**
> delete(environment, external_database_server)

Delete an external database server by name

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
api_instance = cloudera.director.DatabaseServersApi(cloudera.director.ApiClient(configuration))
environment = 'environment_example' # str | environment
external_database_server = 'external_database_server_example' # str | externalDatabaseServer

try:
    # Delete an external database server by name
    api_instance.delete(environment, external_database_server)
except ApiException as e:
    print("Exception when calling DatabaseServersApi->delete: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **environment** | **str**| environment | 
 **external_database_server** | **str**| externalDatabaseServer | 

### Return type

void (empty response body)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_database_server_usage**
> ExternalDatabaseServerUsage get_database_server_usage(environment, external_database_server)

Get an external database server usage by name

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
api_instance = cloudera.director.DatabaseServersApi(cloudera.director.ApiClient(configuration))
environment = 'environment_example' # str | environment
external_database_server = 'external_database_server_example' # str | externalDatabaseServer

try:
    # Get an external database server usage by name
    api_response = api_instance.get_database_server_usage(environment, external_database_server)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling DatabaseServersApi->get_database_server_usage: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **environment** | **str**| environment | 
 **external_database_server** | **str**| externalDatabaseServer | 

### Return type

[**ExternalDatabaseServerUsage**](ExternalDatabaseServerUsage.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_redacted**
> ExternalDatabaseServer get_redacted(environment, external_database_server)

Get an external database server by name

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
api_instance = cloudera.director.DatabaseServersApi(cloudera.director.ApiClient(configuration))
environment = 'environment_example' # str | environment
external_database_server = 'external_database_server_example' # str | externalDatabaseServer

try:
    # Get an external database server by name
    api_response = api_instance.get_redacted(environment, external_database_server)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling DatabaseServersApi->get_redacted: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **environment** | **str**| environment | 
 **external_database_server** | **str**| externalDatabaseServer | 

### Return type

[**ExternalDatabaseServer**](ExternalDatabaseServer.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_status**
> Status get_status(environment, external_database_server)

Get an external database server status by name

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
api_instance = cloudera.director.DatabaseServersApi(cloudera.director.ApiClient(configuration))
environment = 'environment_example' # str | environment
external_database_server = 'external_database_server_example' # str | externalDatabaseServer

try:
    # Get an external database server status by name
    api_response = api_instance.get_status(environment, external_database_server)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling DatabaseServersApi->get_status: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **environment** | **str**| environment | 
 **external_database_server** | **str**| externalDatabaseServer | 

### Return type

[**Status**](Status.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_template_redacted**
> ExternalDatabaseServerTemplate get_template_redacted(environment, external_database_server)

Get an external database server template by name

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
api_instance = cloudera.director.DatabaseServersApi(cloudera.director.ApiClient(configuration))
environment = 'environment_example' # str | environment
external_database_server = 'external_database_server_example' # str | externalDatabaseServer

try:
    # Get an external database server template by name
    api_response = api_instance.get_template_redacted(environment, external_database_server)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling DatabaseServersApi->get_template_redacted: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **environment** | **str**| environment | 
 **external_database_server** | **str**| externalDatabaseServer | 

### Return type

[**ExternalDatabaseServerTemplate**](ExternalDatabaseServerTemplate.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list**
> list[str] list(environment)

List all externalDatabaseServers

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
api_instance = cloudera.director.DatabaseServersApi(cloudera.director.ApiClient(configuration))
environment = 'environment_example' # str | environment

try:
    # List all externalDatabaseServers
    api_response = api_instance.list(environment)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling DatabaseServersApi->list: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **environment** | **str**| environment | 

### Return type

**list[str]**

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update**
> update(environment, external_database_server, updated_template)

Update an existing external database server (unsupported)

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
api_instance = cloudera.director.DatabaseServersApi(cloudera.director.ApiClient(configuration))
environment = 'environment_example' # str | environment
external_database_server = 'external_database_server_example' # str | externalDatabaseServer
updated_template = cloudera.director.ExternalDatabaseServerTemplate() # ExternalDatabaseServerTemplate | updatedTemplate

try:
    # Update an existing external database server (unsupported)
    api_instance.update(environment, external_database_server, updated_template)
except ApiException as e:
    print("Exception when calling DatabaseServersApi->update: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **environment** | **str**| environment | 
 **external_database_server** | **str**| externalDatabaseServer | 
 **updated_template** | [**ExternalDatabaseServerTemplate**](ExternalDatabaseServerTemplate.md)| updatedTemplate | 

### Return type

void (empty response body)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

