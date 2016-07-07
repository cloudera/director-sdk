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

package com.cloudera.director.client.v4.model;


public class Login {
  /* Login password [redacted on read] */
  private String password;
  /* Login username */
  private String username;
  public Login() { }

  private Login(String password, String username) {
    this.password = password;
    this.username = username;
  }

  private Login(LoginBuilder builder) {
    this.password = builder.password;
    this.username = builder.username;
  }

  public static LoginBuilder builder() {
    return new LoginBuilder();
  }

  public static class LoginBuilder {
    private String password = null;
    private String username = null;

    public LoginBuilder password(String password) {
      this.password = password;
      return this;
    }

    public LoginBuilder username(String username) {
      this.username = username;
      return this;
    }

    public Login build() {
      return new Login(this);
    }
  }

  public LoginBuilder toBuilder() {
    return builder()
      .password(password)
      .username(username)
      ;
  }
  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
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

    Login other = (Login) o; // NOPMD

    if (username != null ?
        !username.equals(other.username) :
        other.username != null) return false;
    return true;
  }

  @Override
  public int hashCode() {
    int result = 0;
    result = 31 * result + (username != null ? username.hashCode() : 0);
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    String newLine = System.getProperty("line.separator");
    sb.append("class Login {" + newLine);
    sb.append("  password: ").append("REDACTED").append(newLine);
    sb.append("  username: ").append(username).append(newLine);
    sb.append("}" + newLine);
    return sb.toString();
  }
}

