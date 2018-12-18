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


package com.cloudera.director.client.v11.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Login credentials
 */
@ApiModel(description = "Login credentials")

public class Login {
  @SerializedName("username")
  private String username = null;
  @SerializedName("password")
  private String password = null;

  public Login() {
    // Do nothing
  }

  private Login(LoginBuilder builder) {
      this.username = builder.username;
      this.password = builder.password;
    }

  public static LoginBuilder builder() {
    return new LoginBuilder();
  }

  public static class LoginBuilder {
      private String username = null;
      private String password = null;
  

    public LoginBuilder username(String username) {
      this.username = username;
      return this;
    }


    public LoginBuilder password(String password) {
      this.password = password;
      return this;
    }


    public Login build() {
      return new Login(this);
    }
  }

  public LoginBuilder toBuilder() {
    return builder()
      .username(username)
            .password(password)
      ;
  }

  public Login username(String username) {
    this.username = username;
    return this;
  }

   /**
   * Login username
   * @return username
  **/
  @ApiModelProperty(required = true, value = "Login username")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public Login password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Login password [redacted on read]
   * @return password
  **/
  @ApiModelProperty(required = true, value = "Login password [redacted on read]")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Login login = (Login) o;
    return Objects.equals(this.username, login.username) &&
        Objects.equals(this.password, login.password);
  }

  @Override
  public int hashCode() {
    return Objects.hash(username, password);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Login {\n");
    
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
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

