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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Information for an account or service outside Cloudera Manager or any cluster
 */
@ApiModel(description = "Information for an account or service outside Cloudera Manager or any cluster")

public class ExternalAccount {
  @SerializedName("name")
  private String name = null;
  @SerializedName("type")
  private String type = null;
  @SerializedName("configs")
  private Map<String, String> configs = null;

  public ExternalAccount() {
    // Do nothing
  }

  private ExternalAccount(ExternalAccountBuilder builder) {
      this.name = builder.name;
      this.type = builder.type;
      this.configs = builder.configs;
    }

  public static ExternalAccountBuilder builder() {
    return new ExternalAccountBuilder();
  }

  public static class ExternalAccountBuilder {
      private String name = null;
      private String type = null;
      private Map<String, String> configs = new HashMap<String, String>();
  

    public ExternalAccountBuilder name(String name) {
      this.name = name;
      return this;
    }


    public ExternalAccountBuilder type(String type) {
      this.type = type;
      return this;
    }


    public ExternalAccountBuilder configs(Map<String, String> configs) {
      this.configs = configs;
      return this;
    }


    public ExternalAccount build() {
      return new ExternalAccount(this);
    }
  }

  public ExternalAccountBuilder toBuilder() {
    return builder()
      .name(name)
            .type(type)
            .configs(configs)
      ;
  }

  public ExternalAccount name(String name) {
    this.name = name;
    return this;
  }

   /**
   * External account name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "External account name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ExternalAccount type(String type) {
    this.type = type;
    return this;
  }

   /**
   * External account type
   * @return type
  **/
  @ApiModelProperty(required = true, value = "External account type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public ExternalAccount configs(Map<String, String> configs) {
    this.configs = configs;
    return this;
  }

  public ExternalAccount putConfigsItem(String key, String configsItem) {
    if (this.configs == null) {
      this.configs = new HashMap<String, String>();
    }
    this.configs.put(key, configsItem);
    return this;
  }

   /**
   * External account configurations [redacted on read]
   * @return configs
  **/
  @ApiModelProperty(value = "External account configurations [redacted on read]")
  public Map<String, String> getConfigs() {
    return configs;
  }

  public void setConfigs(Map<String, String> configs) {
    this.configs = configs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExternalAccount externalAccount = (ExternalAccount) o;
    return Objects.equals(this.name, externalAccount.name) &&
        Objects.equals(this.type, externalAccount.type) &&
        Objects.equals(this.configs, externalAccount.configs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, type, configs);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalAccount {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    configs: ").append(toIndentedString(configs)).append("\n");
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

