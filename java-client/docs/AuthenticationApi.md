# AuthenticationApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**login**](AuthenticationApi.md#login) | **POST** /api/d6.2/login | Log in to the API
[**logout**](AuthenticationApi.md#logout) | **POST** /api/d6.2/logout | Log out from the API


<a name="login"></a>
# **login**
> User login(login)

Log in to the API



### Example
```java
// Import classes:
//import com.cloudera.director.client.common.ApiException;
//import com.cloudera.director.client.latest.api.AuthenticationApi;


AuthenticationApi apiInstance = new AuthenticationApi();
Login login = new Login(); // Login | 
try {
    User result = apiInstance.login(login);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthenticationApi#login");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **login** | [**Login**](Login.md)|  |

### Return type

[**User**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="logout"></a>
# **logout**
> Boolean logout()

Log out from the API



### Example
```java
// Import classes:
//import com.cloudera.director.client.common.ApiException;
//import com.cloudera.director.client.latest.api.AuthenticationApi;


AuthenticationApi apiInstance = new AuthenticationApi();
try {
    Boolean result = apiInstance.logout();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthenticationApi#logout");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**Boolean**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

