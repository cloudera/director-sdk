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

package com.cloudera.director.client.v2.model;


public class PasswordChange {
  /* New password [redacted on read] */
  private String newPassword;
  /* Old password [redacted on read] */
  private String oldPassword;
  public PasswordChange() { }

  private PasswordChange(String newPassword, String oldPassword) {
    this.newPassword = newPassword;
    this.oldPassword = oldPassword;
  }

  private PasswordChange(PasswordChangeBuilder builder) {
    this.newPassword = builder.newPassword;
    this.oldPassword = builder.oldPassword;
  }

  public static PasswordChangeBuilder builder() {
    return new PasswordChangeBuilder();
  }

  public static class PasswordChangeBuilder {
    private String newPassword = null;
    private String oldPassword = null;

    public PasswordChangeBuilder newPassword(String newPassword) {
      this.newPassword = newPassword;
      return this;
    }

    public PasswordChangeBuilder oldPassword(String oldPassword) {
      this.oldPassword = oldPassword;
      return this;
    }

    public PasswordChange build() {
      return new PasswordChange(this);
    }
  }

  public PasswordChangeBuilder toBuilder() {
    return builder()
      .newPassword(newPassword)
      .oldPassword(oldPassword)
      ;
  }
  public String getNewPassword() {
    return newPassword;
  }
  public void setNewPassword(String newPassword) {
    this.newPassword = newPassword;
  }

  public String getOldPassword() {
    return oldPassword;
  }
  public void setOldPassword(String oldPassword) {
    this.oldPassword = oldPassword;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    PasswordChange other = (PasswordChange) o; // NOPMD

    return true;
  }

  @Override
  public int hashCode() {
    int result = 0;
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    String newLine = System.getProperty("line.separator");
    sb.append("class PasswordChange {" + newLine);
    sb.append("  newPassword: ").append("REDACTED").append(newLine);
    sb.append("  oldPassword: ").append("REDACTED").append(newLine);
    sb.append("}" + newLine);
    return sb.toString();
  }
}

