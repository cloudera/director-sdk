# cloudera.director.UsersApi

All URIs are relative to *https://localhost:7189*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create**](UsersApi.md#create) | **POST** /api/d6.0/users | Create a new user
[**current_redacted**](UsersApi.md#current_redacted) | **GET** /api/d6.0/users/current | Get the current user
[**delete**](UsersApi.md#delete) | **DELETE** /api/d6.0/users/{username} | Delete a user by username
[**get_redacted**](UsersApi.md#get_redacted) | **GET** /api/d6.0/users/{username} | Get a user by username
[**get_user_management_status**](UsersApi.md#get_user_management_status) | **GET** /api/d6.0/users/managementStatus | Gets user management status
[**list**](UsersApi.md#list) | **GET** /api/d6.0/users | List all users
[**update**](UsersApi.md#update) | **PUT** /api/d6.0/users/{username} | Update an existing user
[**update_password**](UsersApi.md#update_password) | **PUT** /api/d6.0/users/{username}/password | Update the password of an existing user


# **create**
> create(user)

Create a new user

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
api_instance = cloudera.director.UsersApi(cloudera.director.ApiClient(configuration))
user = cloudera.director.User() # User | user

try:
    # Create a new user
    api_instance.create(user)
except ApiException as e:
    print("Exception when calling UsersApi->create: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user** | [**User**](User.md)| user | 

### Return type

void (empty response body)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **current_redacted**
> User current_redacted()

Get the current user

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
api_instance = cloudera.director.UsersApi(cloudera.director.ApiClient(configuration))

try:
    # Get the current user
    api_response = api_instance.current_redacted()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling UsersApi->current_redacted: %s\n" % e)
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**User**](User.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete**
> delete(username)

Delete a user by username

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
api_instance = cloudera.director.UsersApi(cloudera.director.ApiClient(configuration))
username = 'username_example' # str | username

try:
    # Delete a user by username
    api_instance.delete(username)
except ApiException as e:
    print("Exception when calling UsersApi->delete: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **str**| username | 

### Return type

void (empty response body)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_redacted**
> User get_redacted(username)

Get a user by username

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
api_instance = cloudera.director.UsersApi(cloudera.director.ApiClient(configuration))
username = 'username_example' # str | username

try:
    # Get a user by username
    api_response = api_instance.get_redacted(username)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling UsersApi->get_redacted: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **str**| username | 

### Return type

[**User**](User.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_user_management_status**
> UserManagementStatus get_user_management_status()

Gets user management status

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
api_instance = cloudera.director.UsersApi(cloudera.director.ApiClient(configuration))

try:
    # Gets user management status
    api_response = api_instance.get_user_management_status()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling UsersApi->get_user_management_status: %s\n" % e)
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**UserManagementStatus**](UserManagementStatus.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list**
> list[str] list()

List all users

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
api_instance = cloudera.director.UsersApi(cloudera.director.ApiClient(configuration))

try:
    # List all users
    api_response = api_instance.list()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling UsersApi->list: %s\n" % e)
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
> update(username, user)

Update an existing user

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
api_instance = cloudera.director.UsersApi(cloudera.director.ApiClient(configuration))
username = 'username_example' # str | username
user = cloudera.director.User() # User | user

try:
    # Update an existing user
    api_instance.update(username, user)
except ApiException as e:
    print("Exception when calling UsersApi->update: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **str**| username | 
 **user** | [**User**](User.md)| user | 

### Return type

void (empty response body)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_password**
> update_password(username, passwords)

Update the password of an existing user

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
api_instance = cloudera.director.UsersApi(cloudera.director.ApiClient(configuration))
username = 'username_example' # str | username
passwords = cloudera.director.PasswordChange() # PasswordChange | passwords

try:
    # Update the password of an existing user
    api_instance.update_password(username, passwords)
except ApiException as e:
    print("Exception when calling UsersApi->update_password: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **str**| username | 
 **passwords** | [**PasswordChange**](PasswordChange.md)| passwords | 

### Return type

void (empty response body)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

