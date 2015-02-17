
Cloudera Director Java API Client
=================================

This repository contains the source of the Cloudera Director java-client that can be used to
interact with the Director server API. This can be used to bootstrap, grow, shrink and
terminate CDH clusters managed by Cloudera Manager on a cloud infrastructure.

Getting Started
---------------

To use the client you can either build from source from this repository or add it
as a Maven dependency:

```
<dependencies>
    <dependency>
        <groupId>com.cloudera.director</groupId>
        <artifactId>java-client</artifactId>
        <version>1.1.0</version>
    </dependency>

    [...]

</dependencies>

<repositories>
  <repository>
    <id>cloudera.repo</id>
    <url>https://repository.cloudera.com/artifactory/cloudera-repos</url>
    <name>Cloudera Repository</name>
  </repository>
  [...]
</repositories>
```

Basic Usage
-----------

Let's go through a quick example that shows how to list all of the environments:

```java
import com.cloudera.director.client.latest.api.AuthenticationApi;
import com.cloudera.director.client.latest.api.EnvironmentsApi;
import com.cloudera.director.client.latest.common.ApiClient;
import com.cloudera.director.client.latest.common.ApiException;
import com.cloudera.director.client.latest.model.Environment;
import com.cloudera.director.client.latest.model.Login;

// Cloudera Director server runs at http://127.0.0.1:7189

ApiClient client = new ApiClient("http://127.0.0.1:7189");

new AuthenticationApi(client).login(
    Login.builder().username("admin").password("admin").build());

EnvironmentsApi envApi = new EnvironmentsApi(client);

List<String> environments = envApi.list();
```

Another example on how to create and delete a user account:

```java
import com.cloudera.director.client.latest.api.AuthenticationApi;
import com.cloudera.director.client.latest.api.UsersApi;
import com.cloudera.director.client.latest.common.ApiClient;
import com.cloudera.director.client.latest.common.ApiException;
import com.cloudera.director.client.latest.model.Login;
import com.cloudera.director.client.latest.model.User;

// Cloudera Director server runs at http://127.0.0.1:7189

ApiClient client = new ApiClient("http://127.0.0.1:7189");

new AuthenticationApi(client).login(
    Login.builder().username("admin").password("admin").build());

UsersApi usersApi = new UsersApi(client);

User newUser = User.builder()
    .username("user01")
    .password("pass01")
    .enabled(true)
    .roles(new HashSet<String>(Arrays.asList("ROLE_READONLY")))
    .build();

usersApi.create(newUser);
usersApi.delete("user01")
```

More samples
------------

You can find more code examples under the `java-client-samples` directory.
