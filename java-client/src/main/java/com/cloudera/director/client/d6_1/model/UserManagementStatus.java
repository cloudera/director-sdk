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


package com.cloudera.director.client.d6_1.model;

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
 * UserManagementStatus
 */

public class UserManagementStatus {
  @SerializedName("localUserManagementEnabled")
  private Boolean localUserManagementEnabled = null;
  @SerializedName("userSource")
  private String userSource = null;

  public UserManagementStatus() {
    // Do nothing
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

  public UserManagementStatus localUserManagementEnabled(Boolean localUserManagementEnabled) {
    this.localUserManagementEnabled = localUserManagementEnabled;
    return this;
  }

   /**
   * Whether local user management is enabled
   * @return localUserManagementEnabled
  **/
  @ApiModelProperty(required = true, value = "Whether local user management is enabled")
  public Boolean isLocalUserManagementEnabled() {
    return localUserManagementEnabled;
  }

  public void setLocalUserManagementEnabled(Boolean localUserManagementEnabled) {
    this.localUserManagementEnabled = localUserManagementEnabled;
  }

  public UserManagementStatus userSource(String userSource) {
    this.userSource = userSource;
    return this;
  }

   /**
   * User source
   * @return userSource
  **/
  @ApiModelProperty(required = true, value = "User source")
  public String getUserSource() {
    return userSource;
  }

  public void setUserSource(String userSource) {
    this.userSource = userSource;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserManagementStatus userManagementStatus = (UserManagementStatus) o;
    return Objects.equals(this.localUserManagementEnabled, userManagementStatus.localUserManagementEnabled) &&
        Objects.equals(this.userSource, userManagementStatus.userSource);
  }

  @Override
  public int hashCode() {
    return Objects.hash(localUserManagementEnabled, userSource);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserManagementStatus {\n");
    
    sb.append("    localUserManagementEnabled: ").append(toIndentedString(localUserManagementEnabled)).append("\n");
    sb.append("    userSource: ").append(toIndentedString(userSource)).append("\n");
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

