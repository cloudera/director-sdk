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


package com.cloudera.director.client.v6.model;

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
 * A template for an database residing on an external database server
 */
@ApiModel(description = "A template for an database residing on an external database server")

public class ExternalDatabaseTemplate {
  @SerializedName("databaseNamePrefix")
  private String databaseNamePrefix = null;
  @SerializedName("databaseServerName")
  private String databaseServerName = null;
  @SerializedName("name")
  private String name = null;
  @SerializedName("usernamePrefix")
  private String usernamePrefix = null;

  public ExternalDatabaseTemplate() {
    // Do nothing
  }

  private ExternalDatabaseTemplate(ExternalDatabaseTemplateBuilder builder) {
      this.databaseNamePrefix = builder.databaseNamePrefix;
      this.databaseServerName = builder.databaseServerName;
      this.name = builder.name;
      this.usernamePrefix = builder.usernamePrefix;
    }

  public static ExternalDatabaseTemplateBuilder builder() {
    return new ExternalDatabaseTemplateBuilder();
  }

  public static class ExternalDatabaseTemplateBuilder {
      private String databaseNamePrefix = null;
      private String databaseServerName = null;
      private String name = null;
      private String usernamePrefix = null;
  

    public ExternalDatabaseTemplateBuilder databaseNamePrefix(String databaseNamePrefix) {
      this.databaseNamePrefix = databaseNamePrefix;
      return this;
    }


    public ExternalDatabaseTemplateBuilder databaseServerName(String databaseServerName) {
      this.databaseServerName = databaseServerName;
      return this;
    }


    public ExternalDatabaseTemplateBuilder name(String name) {
      this.name = name;
      return this;
    }


    public ExternalDatabaseTemplateBuilder usernamePrefix(String usernamePrefix) {
      this.usernamePrefix = usernamePrefix;
      return this;
    }


    public ExternalDatabaseTemplate build() {
      return new ExternalDatabaseTemplate(this);
    }
  }

  public ExternalDatabaseTemplateBuilder toBuilder() {
    return builder()
      .databaseNamePrefix(databaseNamePrefix)
            .databaseServerName(databaseServerName)
            .name(name)
            .usernamePrefix(usernamePrefix)
      ;
  }

  public ExternalDatabaseTemplate databaseNamePrefix(String databaseNamePrefix) {
    this.databaseNamePrefix = databaseNamePrefix;
    return this;
  }

   /**
   * Prefix to use when generating external database name
   * @return databaseNamePrefix
  **/
  @ApiModelProperty(required = true, value = "Prefix to use when generating external database name")
  public String getDatabaseNamePrefix() {
    return databaseNamePrefix;
  }

  public void setDatabaseNamePrefix(String databaseNamePrefix) {
    this.databaseNamePrefix = databaseNamePrefix;
  }

  public ExternalDatabaseTemplate databaseServerName(String databaseServerName) {
    this.databaseServerName = databaseServerName;
    return this;
  }

   /**
   * External database server name
   * @return databaseServerName
  **/
  @ApiModelProperty(required = true, value = "External database server name")
  public String getDatabaseServerName() {
    return databaseServerName;
  }

  public void setDatabaseServerName(String databaseServerName) {
    this.databaseServerName = databaseServerName;
  }

  public ExternalDatabaseTemplate name(String name) {
    this.name = name;
    return this;
  }

   /**
   * External database template name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "External database template name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ExternalDatabaseTemplate usernamePrefix(String usernamePrefix) {
    this.usernamePrefix = usernamePrefix;
    return this;
  }

   /**
   * Prefix to use when generating user name for access to database
   * @return usernamePrefix
  **/
  @ApiModelProperty(value = "Prefix to use when generating user name for access to database")
  public String getUsernamePrefix() {
    return usernamePrefix;
  }

  public void setUsernamePrefix(String usernamePrefix) {
    this.usernamePrefix = usernamePrefix;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExternalDatabaseTemplate externalDatabaseTemplate = (ExternalDatabaseTemplate) o;
    return Objects.equals(this.databaseNamePrefix, externalDatabaseTemplate.databaseNamePrefix) &&
        Objects.equals(this.databaseServerName, externalDatabaseTemplate.databaseServerName) &&
        Objects.equals(this.name, externalDatabaseTemplate.name) &&
        Objects.equals(this.usernamePrefix, externalDatabaseTemplate.usernamePrefix);
  }

  @Override
  public int hashCode() {
    return Objects.hash(databaseNamePrefix, databaseServerName, name, usernamePrefix);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalDatabaseTemplate {\n");
    
    sb.append("    databaseNamePrefix: ").append(toIndentedString(databaseNamePrefix)).append("\n");
    sb.append("    databaseServerName: ").append(toIndentedString(databaseServerName)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    usernamePrefix: ").append(toIndentedString(usernamePrefix)).append("\n");
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

