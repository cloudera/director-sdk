/*
 * Copyright (c) 2015 Cloudera, Inc. All rights reserved.
 */

package com.cloudera.director.samples;

import com.beust.jcommander.Parameter;

/**
 * A common list of parameters for all commands that need to talk
 * with a Cloudera Director Server over the public API.
 */
public class CommonParameters {

  @Parameter(names = "--admin-username",
      description = "Name of an user with administrative access")
  private String adminUsername = "admin";

  @Parameter(names = "--admin-password",
      description = "Password for the administrative user", password = true)
  private String adminPassword = "admin";

  @Parameter(names = "--server", description = "Cloudera Director server URL")
  private String serverUrl = "http://localhost:7189";

  public String getAdminUsername() {
    return adminUsername;
  }

  public String getAdminPassword() {
    return adminPassword;
  }

  public String getServerUrl() {
    return serverUrl;
  }
}
