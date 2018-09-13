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
 * A password change request for a Cloudera Altus Director user
 */
@ApiModel(description = "A password change request for a Cloudera Altus Director user")

public class PasswordChange {
  @SerializedName("newPassword")
  private String newPassword = null;
  @SerializedName("oldPassword")
  private String oldPassword = null;

  public PasswordChange() {
    // Do nothing
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

  public PasswordChange newPassword(String newPassword) {
    this.newPassword = newPassword;
    return this;
  }

   /**
   * New password [redacted on read]
   * @return newPassword
  **/
  @ApiModelProperty(required = true, value = "New password [redacted on read]")
  public String getNewPassword() {
    return newPassword;
  }

  public void setNewPassword(String newPassword) {
    this.newPassword = newPassword;
  }

  public PasswordChange oldPassword(String oldPassword) {
    this.oldPassword = oldPassword;
    return this;
  }

   /**
   * Old password [redacted on read]
   * @return oldPassword
  **/
  @ApiModelProperty(value = "Old password [redacted on read]")
  public String getOldPassword() {
    return oldPassword;
  }

  public void setOldPassword(String oldPassword) {
    this.oldPassword = oldPassword;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PasswordChange passwordChange = (PasswordChange) o;
    return Objects.equals(this.newPassword, passwordChange.newPassword) &&
        Objects.equals(this.oldPassword, passwordChange.oldPassword);
  }

  @Override
  public int hashCode() {
    return Objects.hash(newPassword, oldPassword);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PasswordChange {\n");
    
    sb.append("    newPassword: ").append(toIndentedString(newPassword)).append("\n");
    sb.append("    oldPassword: ").append(toIndentedString(oldPassword)).append("\n");
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

