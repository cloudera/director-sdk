# NotificationsApi

All URIs are relative to *https://localhost:7189*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get**](NotificationsApi.md#get) | **GET** /api/d6.0/notifications | Get system notification messages


<a name="get"></a>
# **get**
> List&lt;Notification&gt; get()

Get system notification messages

### Example
```java
// Import classes:
//import com.cloudera.director.client.common.ApiClient;
//import com.cloudera.director.client.common.ApiException;
//import com.cloudera.director.client.common.Configuration;
//import com.cloudera.director.client.common.auth.*;
//import com.cloudera.director.client.latest.api.NotificationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

NotificationsApi apiInstance = new NotificationsApi();
try {
    List<Notification> result = apiInstance.get();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NotificationsApi#get");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Notification&gt;**](Notification.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

