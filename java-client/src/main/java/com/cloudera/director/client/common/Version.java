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


package com.cloudera.director.client.common;

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
 * Version
 */

public class Version {
  @SerializedName("productVersion")
  private String productVersion = null;
  @SerializedName("apiVersions")
  private List<String> apiVersions = null;
  @SerializedName("currentServerTime")
  private String currentServerTime = null;

  public Version() {
    // Do nothing
  }

  private Version(VersionBuilder builder) {
      this.productVersion = builder.productVersion;
      this.apiVersions = builder.apiVersions;
      this.currentServerTime = builder.currentServerTime;
    }

  public static VersionBuilder builder() {
    return new VersionBuilder();
  }

  public static class VersionBuilder {
      private String productVersion = null;
      private List<String> apiVersions = new ArrayList<String>();
      private String currentServerTime = null;
  

    public VersionBuilder productVersion(String productVersion) {
      this.productVersion = productVersion;
      return this;
    }


    public VersionBuilder apiVersions(List<String> apiVersions) {
      this.apiVersions = apiVersions;
      return this;
    }


    public VersionBuilder currentServerTime(String currentServerTime) {
      this.currentServerTime = currentServerTime;
      return this;
    }


    public Version build() {
      return new Version(this);
    }
  }

  public VersionBuilder toBuilder() {
    return builder()
      .productVersion(productVersion)
            .apiVersions(apiVersions)
            .currentServerTime(currentServerTime)
      ;
  }

   /**
   * Current version of Director
   * @return productVersion
  **/
  @ApiModelProperty(value = "Current version of Director")
  public String getProductVersion() {
    return productVersion;
  }

  public Version apiVersions(List<String> apiVersions) {
    this.apiVersions = apiVersions;
    return this;
  }

  public Version addApiVersionsItem(String apiVersionsItem) {
    if (this.apiVersions == null) {
      this.apiVersions = new ArrayList<String>();
    }
    this.apiVersions.add(apiVersionsItem);
    return this;
  }

   /**
   * The list of supported API versions
   * @return apiVersions
  **/
  @ApiModelProperty(value = "The list of supported API versions")
  public List<String> getApiVersions() {
    return apiVersions;
  }

  public void setApiVersions(List<String> apiVersions) {
    this.apiVersions = apiVersions;
  }

   /**
   * The current server time
   * @return currentServerTime
  **/
  @ApiModelProperty(value = "The current server time")
  public String getCurrentServerTime() {
    return currentServerTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Version version = (Version) o;
    return Objects.equals(this.productVersion, version.productVersion) &&
        Objects.equals(this.apiVersions, version.apiVersions) &&
        Objects.equals(this.currentServerTime, version.currentServerTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productVersion, apiVersions, currentServerTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Version {\n");
    
    sb.append("    productVersion: ").append(toIndentedString(productVersion)).append("\n");
    sb.append("    apiVersions: ").append(toIndentedString(apiVersions)).append("\n");
    sb.append("    currentServerTime: ").append(toIndentedString(currentServerTime)).append("\n");
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

