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

package com.cloudera.director.client.v12.model;


public class UserManagementStatus {
  /* Whether local user management is enabled */
  private Boolean localUserManagementEnabled;
  /* User source */
  private String userSource;
  public UserManagementStatus() { }

  private UserManagementStatus(Boolean localUserManagementEnabled, String userSource) {
    this.localUserManagementEnabled = localUserManagementEnabled;
    this.userSource = userSource;
  }

  private UserManagementStatus(UserManagementStatusBuilder builder) {
    this.localUserManagementEnabled = builder.localUserManagementEnabled;
    this.userSource = builder.userSource;
  }

  public static UserManagementStatusBuilder builder() {
    return new UserManagementStatusBuilder();
  }

  public static class UserManagementStatusBuilder {
    private Boolean localUserManagementEnabled = null;
    private String userSource = null;

    public UserManagementStatusBuilder localUserManagementEnabled(Boolean localUserManagementEnabled) {
      this.localUserManagementEnabled = localUserManagementEnabled;
      return this;
    }

    public UserManagementStatusBuilder userSource(String userSource) {
      this.userSource = userSource;
      return this;
    }

    public UserManagementStatus build() {
      return new UserManagementStatus(this);
    }
  }

  public UserManagementStatusBuilder toBuilder() {
    return builder()
      .localUserManagementEnabled(localUserManagementEnabled)
      .userSource(userSource)
      ;
  }
  public Boolean getLocalUserManagementEnabled() {
    return localUserManagementEnabled;
  }
  public void setLocalUserManagementEnabled(Boolean localUserManagementEnabled) {
    this.localUserManagementEnabled = localUserManagementEnabled;
  }

  public String getUserSource() {
    return userSource;
  }
  public void setUserSource(String userSource) {
    this.userSource = userSource;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    UserManagementStatus other = (UserManagementStatus) o; // NOPMD

    if (localUserManagementEnabled != null ?
        !localUserManagementEnabled.equals(other.localUserManagementEnabled) :
        other.localUserManagementEnabled != null) return false;
    if (userSource != null ?
        !userSource.equals(other.userSource) :
        other.userSource != null) return false;
    return true;
  }

  @Override
  public int hashCode() {
    int result = 0;
    result = 31 * result + (localUserManagementEnabled != null ? localUserManagementEnabled.hashCode() : 0);
    result = 31 * result + (userSource != null ? userSource.hashCode() : 0);
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    String newLine = System.getProperty("line.separator");
    sb.append("class UserManagementStatus {" + newLine);
    sb.append("  localUserManagementEnabled: ").append(localUserManagementEnabled).append(newLine);
    sb.append("  userSource: ").append(userSource).append(newLine);
    sb.append("}" + newLine);
    return sb.toString();
  }
}

