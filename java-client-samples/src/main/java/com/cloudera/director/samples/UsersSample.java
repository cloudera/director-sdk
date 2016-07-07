/*
 * Copyright (c) 2015 Cloudera, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.cloudera.director.samples;

import com.beust.jcommander.JCommander;
import com.beust.jcommander.Parameter;
import com.beust.jcommander.Parameters;
import com.cloudera.director.client.common.ApiClient;
import com.cloudera.director.client.common.ApiException;
import com.cloudera.director.client.latest.api.AuthenticationApi;
import com.cloudera.director.client.latest.api.UsersApi;
import com.cloudera.director.client.latest.model.Login;
import com.cloudera.director.client.latest.model.User;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Example code on how to use the API to manage user accounts.
 */
public class UsersSample {

  private static ApiClient newAuthenticatedApiClient(CommonParameters common) throws ApiException {
    ApiClient client = new ApiClient(common.getServerUrl());

    Login login = Login.builder()
        .username(common.getAdminUsername())
        .password(common.getAdminPassword())
        .build();

    new AuthenticationApi(client).login(login);

    return client;
  }

  /**
   * A command to list all the user accounts.
   */
  @Parameters(commandDescription = "List all the user accounts")
  public static class ListCommand implements Command {

    @Override
    public void run(CommonParameters common) throws ApiException {
      ApiClient client = newAuthenticatedApiClient(common);
      UsersApi usersApi = new UsersApi(client);

      System.out.println("Listing all user accounts:");
      for (String user : usersApi.list()) {
        System.out.println(user);
      }
    }
  }

  /**
   * A command that will create a new user with admin rights.
   */
  @Parameters(commandDescription = "Create a new user with admin rights")
  public static class AddCommand implements Command {

    @Parameter(names = "--username", description = "A name for the new user", required = true)
    private String username;

    @Parameter(names = "--password",
        description = "A password for the new user", required = true, password = true)
    private String password;

    @Override
    public void run(CommonParameters common) throws Exception {
      ApiClient client = newAuthenticatedApiClient(common);
      UsersApi usersApi = new UsersApi(client);

      Set<String> roles = new HashSet<String>();
      roles.add("ROLE_ADMIN");
      roles.add("ROLE_READONLY");

      User user = User.builder()
          .username(username)
          .password(password)
          .enabled(true)
          .roles(roles)
          .build();

      try {
        usersApi.create(user);
        System.out.printf("Created a new user with name '%s'.%n", username);

      } catch (ApiException e) {
        if (e.getCode() == 302 /* found */) {
          System.err.printf("Cannot create duplicate user '%s'.%n", username);
        }
        throw e;
      }
    }
  }

  /**
   * A command that will delete an existing user account.
   */
  @Parameters(commandDescription = "Delete a user account by name")
  public static class DeleteCommand implements Command {

    @Parameter(names = "--username", description = "Name of the user to be deleted", required = true)
    private String username;

    @Override
    public void run(CommonParameters common) throws Exception {
      ApiClient client = newAuthenticatedApiClient(common);

      UsersApi usersApi = new UsersApi(client);
      usersApi.delete(username);

      System.out.printf("Deleted user with name '%s'.%n", username);
    }
  }

  public static void main(String[] args) throws Exception {
    Map<String, Command> commands = new HashMap<String, Command>();
    commands.put("list", new ListCommand());
    commands.put("add", new AddCommand());
    commands.put("delete", new DeleteCommand());

    CommonParameters common = new CommonParameters();
    JCommander jc = new JCommander(common);
    jc.setProgramName("UsersSample");

    for (Map.Entry<String, Command> current : commands.entrySet()) {
      jc.addCommand(current.getKey(), current.getValue());
    }

    jc.parse(args);

    if (commands.containsKey(jc.getParsedCommand())) {
      commands.get(jc.getParsedCommand()).run(common);

    } else {
      jc.usage();
      System.exit(1);
    }
  }
}
