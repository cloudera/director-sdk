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


package com.cloudera.director.client.v9.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * A Cloudera Altus Director user
 */
@ApiModel(description = "A Cloudera Altus Director user")

public class User {
  @SerializedName("username")
  private String username = null;
  @SerializedName("password")
  private String password = null;
  @SerializedName("enabled")
  private Boolean enabled = null;
  @SerializedName("roles")
  private List<String> roles = null;

  public User() {
    // Do nothing
  }

  private User(UserBuilder builder) {
      this.username = builder.username;
      this.password = builder.password;
      this.enabled = builder.enabled;
      this.roles = builder.roles;
    }

  public static UserBuilder builder() {
    return new UserBuilder();
  }

  public static class UserBuilder {
      private String username = null;
      private String password = null;
      private Boolean enabled = null;
      private List<String> roles = new ArrayList<String>();
  

    public UserBuilder username(String username) {
      this.username = username;
      return this;
    }


    public UserBuilder password(String password) {
      this.password = password;
      return this;
    }


    public UserBuilder enabled(Boolean enabled) {
      this.enabled = enabled;
      return this;
    }


    public UserBuilder roles(List<String> roles) {
      this.roles = roles;
      return this;
    }


    public User build() {
      return new User(this);
    }
  }

  public UserBuilder toBuilder() {
    return builder()
      .username(username)
            .password(password)
            .enabled(enabled)
            .roles(roles)
      ;
  }

  public User username(String username) {
    this.username = username;
    return this;
  }

   /**
   * User name
   * @return username
  **/
  @ApiModelProperty(required = true, value = "User name")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public User password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Password [redacted on read]
   * @return password
  **/
  @ApiModelProperty(required = true, value = "Password [redacted on read]")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public User enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Whether the user is enabled
   * @return enabled
  **/
  @ApiModelProperty(required = true, value = "Whether the user is enabled")
  public Boolean isEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public User roles(List<String> roles) {
    this.roles = roles;
    return this;
  }

  public User addRolesItem(String rolesItem) {
    if (this.roles == null) {
      this.roles = new ArrayList<String>();
    }
    this.roles.add(rolesItem);
    return this;
  }

   /**
   * Roles assigned to the user
   * @return roles
  **/
  @ApiModelProperty(value = "Roles assigned to the user")
  public List<String> getRoles() {
    return roles;
  }

  public void setRoles(List<String> roles) {
    this.roles = roles;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    User user = (User) o;
    return Objects.equals(this.username, user.username) &&
        Objects.equals(this.password, user.password) &&
        Objects.equals(this.enabled, user.enabled) &&
        Objects.equals(this.roles, user.roles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(username, password, enabled, roles);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

