// Licensed to Cloudera, Inc. under one
// or more contributor license agreements.  See the NOTICE file
// distributed with this work for additional information
// regarding copyright ownership.  Cloudera, Inc. licenses this file
// to you under the Apache License, Version 2.0 (the
// "License"); you may not use this file except in compliance
// with the License.  You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

// Note: This file is auto generated. Do not edit manually.

package com.cloudera.director.client.v8.model;

import java.util.Set;

public class User {
  /* Enabled */
  private Boolean enabled;
  /* Password [redacted on read] */
  private String password;
  /* Roles */
  private Set<String> roles;
  /* User name */
  private String username;
  public User() { }

  private User(Boolean enabled, String password, Set<String> roles, String username) {
    this.enabled = enabled;
    this.password = password;
    this.roles = roles;
    this.username = username;
  }

  private User(UserBuilder builder) {
    this.enabled = builder.enabled;
    this.password = builder.password;
    this.roles = builder.roles;
    this.username = builder.username;
  }

  public static UserBuilder builder() {
    return new UserBuilder();
  }

  public static class UserBuilder {
    private Boolean enabled = null;
    private String password = null;
    private Set<String> roles = null;
    private String username = null;

    public UserBuilder enabled(Boolean enabled) {
      this.enabled = enabled;
      return this;
    }

    public UserBuilder password(String password) {
      this.password = password;
      return this;
    }

    public UserBuilder roles(Set<String> roles) {
      this.roles = roles;
      return this;
    }

    public UserBuilder username(String username) {
      this.username = username;
      return this;
    }

    public User build() {
      return new User(this);
    }
  }

  public UserBuilder toBuilder() {
    return builder()
      .enabled(enabled)
      .password(password)
      .roles(roles)
      .username(username)
      ;
  }
  public Boolean getEnabled() {
    return enabled;
  }
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }

  public Set<String> getRoles() {
    return roles;
  }
  public void setRoles(Set<String> roles) {
    this.roles = roles;
  }

  public String getUsername() {
    return username;
  }
  public void setUsername(String username) {
    this.username = username;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    User other = (User) o; // NOPMD

    if (enabled != null ?
        !enabled.equals(other.enabled) :
        other.enabled != null) return false;
    if (roles != null ?
        !roles.equals(other.roles) :
        other.roles != null) return false;
    if (username != null ?
        !username.equals(other.username) :
        other.username != null) return false;
    return true;
  }

  @Override
  public int hashCode() {
    int result = 0;
    result = 31 * result + (enabled != null ? enabled.hashCode() : 0);
    result = 31 * result + (roles != null ? roles.hashCode() : 0);
    result = 31 * result + (username != null ? username.hashCode() : 0);
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    String newLine = System.getProperty("line.separator");
    sb.append("class User {" + newLine);
    sb.append("  enabled: ").append(enabled).append(newLine);
    sb.append("  password: ").append("REDACTED").append(newLine);
    sb.append("  roles: ").append(roles).append(newLine);
    sb.append("  username: ").append(username).append(newLine);
    sb.append("}" + newLine);
    return sb.toString();
  }
}

