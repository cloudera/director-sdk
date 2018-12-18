# UsersApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create**](UsersApi.md#create) | **POST** /api/d6.1/users | Create a new user
[**currentRedacted**](UsersApi.md#currentRedacted) | **GET** /api/d6.1/users/current | Get the current user
[**delete**](UsersApi.md#delete) | **DELETE** /api/d6.1/users/{username} | Delete a user by username
[**getRedacted**](UsersApi.md#getRedacted) | **GET** /api/d6.1/users/{username} | Get a user by username
[**getUserManagementStatus**](UsersApi.md#getUserManagementStatus) | **GET** /api/d6.1/users/managementStatus | Gets user management status
[**list**](UsersApi.md#list) | **GET** /api/d6.1/users | List all users
[**update**](UsersApi.md#update) | **PUT** /api/d6.1/users/{username} | Update an existing user
[**updatePassword**](UsersApi.md#updatePassword) | **PUT** /api/d6.1/users/{username}/password | Update the password of an existing user


<a name="create"></a>
# **create**
> create(user)

Create a new user



### Example
```java
// Import classes:
//import com.cloudera.director.client.common.ApiClient;
//import com.cloudera.director.client.common.ApiException;
//import com.cloudera.director.client.common.Configuration;
//import com.cloudera.director.client.common.auth.*;
//import com.cloudera.director.client.latest.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

UsersApi apiInstance = new UsersApi();
User user = new User(); // User | 
try {
    apiInstance.create(user);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#create");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user** | [**User**](User.md)|  |

### Return type

null (empty response body)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="currentRedacted"></a>
# **currentRedacted**
> User currentRedacted()

Get the current user



### Example
```java
// Import classes:
//import com.cloudera.director.client.common.ApiClient;
//import com.cloudera.director.client.common.ApiException;
//import com.cloudera.director.client.common.Configuration;
//import com.cloudera.director.client.common.auth.*;
//import com.cloudera.director.client.latest.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

UsersApi apiInstance = new UsersApi();
try {
    User result = apiInstance.currentRedacted();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#currentRedacted");
    e.printStackTrace();
}
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

<a name="delete"></a>
# **delete**
> delete(username)

Delete a user by username



### Example
```java
// Import classes:
//import com.cloudera.director.client.common.ApiClient;
//import com.cloudera.director.client.common.ApiException;
//import com.cloudera.director.client.common.Configuration;
//import com.cloudera.director.client.common.auth.*;
//import com.cloudera.director.client.latest.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

UsersApi apiInstance = new UsersApi();
String username = "username_example"; // String | 
try {
    apiInstance.delete(username);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#delete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**|  |

### Return type

null (empty response body)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getRedacted"></a>
# **getRedacted**
> User getRedacted(username)

Get a user by username



### Example
```java
// Import classes:
//import com.cloudera.director.client.common.ApiClient;
//import com.cloudera.director.client.common.ApiException;
//import com.cloudera.director.client.common.Configuration;
//import com.cloudera.director.client.common.auth.*;
//import com.cloudera.director.client.latest.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

UsersApi apiInstance = new UsersApi();
String username = "username_example"; // String | 
try {
    User result = apiInstance.getRedacted(username);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getRedacted");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**|  |

### Return type

[**User**](User.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUserManagementStatus"></a>
# **getUserManagementStatus**
> UserManagementStatus getUserManagementStatus()

Gets user management status



### Example
```java
// Import classes:
//import com.cloudera.director.client.common.ApiClient;
//import com.cloudera.director.client.common.ApiException;
//import com.cloudera.director.client.common.Configuration;
//import com.cloudera.director.client.common.auth.*;
//import com.cloudera.director.client.latest.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

UsersApi apiInstance = new UsersApi();
try {
    UserManagementStatus result = apiInstance.getUserManagementStatus();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getUserManagementStatus");
    e.printStackTrace();
}
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

<a name="list"></a>
# **list**
> List&lt;String&gt; list()

List all users



### Example
```java
// Import classes:
//import com.cloudera.director.client.common.ApiClient;
//import com.cloudera.director.client.common.ApiException;
//import com.cloudera.director.client.common.Configuration;
//import com.cloudera.director.client.common.auth.*;
//import com.cloudera.director.client.latest.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

UsersApi apiInstance = new UsersApi();
try {
    List<String> result = apiInstance.list();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#list");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**List&lt;String&gt;**

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="update"></a>
# **update**
> update(username, user)

Update an existing user



### Example
```java
// Import classes:
//import com.cloudera.director.client.common.ApiClient;
//import com.cloudera.director.client.common.ApiException;
//import com.cloudera.director.client.common.Configuration;
//import com.cloudera.director.client.common.auth.*;
//import com.cloudera.director.client.latest.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

UsersApi apiInstance = new UsersApi();
String username = "username_example"; // String | 
User user = new User(); // User | 
try {
    apiInstance.update(username, user);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#update");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**|  |
 **user** | [**User**](User.md)|  |

### Return type

null (empty response body)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updatePassword"></a>
# **updatePassword**
> updatePassword(username, passwords)

Update the password of an existing user



### Example
```java
// Import classes:
//import com.cloudera.director.client.common.ApiClient;
//import com.cloudera.director.client.common.ApiException;
//import com.cloudera.director.client.common.Configuration;
//import com.cloudera.director.client.common.auth.*;
//import com.cloudera.director.client.latest.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

UsersApi apiInstance = new UsersApi();
String username = "username_example"; // String | 
PasswordChange passwords = new PasswordChange(); // PasswordChange | 
try {
    apiInstance.updatePassword(username, passwords);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#updatePassword");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**|  |
 **passwords** | [**PasswordChange**](PasswordChange.md)|  |

### Return type

null (empty response body)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

