# java-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>com.cloudera.director</groupId>
    <artifactId>java-client</artifactId>
    <version>6.2.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.cloudera.director:java-client:6.2.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/java-client-6.2.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import com.cloudera.director.client.common.*;
import com.cloudera.director.client.common.auth.*;
import com.cloudera.director.client.common.*;
import com.cloudera.director.client.common.VersionsApi;

import java.io.File;
import java.util.*;

public class VersionsApiExample {

    public static void main(String[] args) {
        
        VersionsApi apiInstance = new VersionsApi();
        try {
            String result = apiInstance.getLatestVersion();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VersionsApi#getLatestVersion");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://localhost*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*VersionsApi* | [**getLatestVersion**](docs/VersionsApi.md#getLatestVersion) | **GET** /api/versions/latest | 
*VersionsApi* | [**getVersions**](docs/VersionsApi.md#getVersions) | **GET** /api/versions | 


## Documentation for Models

 - [Version](docs/Version.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### basic

- **Type**: HTTP basic authentication


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



