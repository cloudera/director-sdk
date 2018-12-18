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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Cloud instance provider configuration
 */
@ApiModel(description = "Cloud instance provider configuration")

public class InstanceProviderConfig {
  @SerializedName("type")
  private String type = null;
  @SerializedName("config")
  private Map<String, String> config = new HashMap<String, String>();

  public InstanceProviderConfig() {
    // Do nothing
  }

  private InstanceProviderConfig(InstanceProviderConfigBuilder builder) {
      this.type = builder.type;
      this.config = builder.config;
    }

  public static InstanceProviderConfigBuilder builder() {
    return new InstanceProviderConfigBuilder();
  }

  public static class InstanceProviderConfigBuilder {
      private String type = null;
      private Map<String, String> config = new HashMap<String, String>();
  

    public InstanceProviderConfigBuilder type(String type) {
      this.type = type;
      return this;
    }


    public InstanceProviderConfigBuilder config(Map<String, String> config) {
      this.config = config;
      return this;
    }


    public InstanceProviderConfig build() {
      return new InstanceProviderConfig(this);
    }
  }

  public InstanceProviderConfigBuilder toBuilder() {
    return builder()
      .type(type)
            .config(config)
      ;
  }

  public InstanceProviderConfig type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Provider type
   * @return type
  **/
  @ApiModelProperty(required = true, value = "Provider type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public InstanceProviderConfig config(Map<String, String> config) {
    this.config = config;
    return this;
  }

  public InstanceProviderConfig putConfigItem(String key, String configItem) {
    this.config.put(key, configItem);
    return this;
  }

   /**
   * Provider specific configurations [redacted on read]
   * @return config
  **/
  @ApiModelProperty(required = true, value = "Provider specific configurations [redacted on read]")
  public Map<String, String> getConfig() {
    return config;
  }

  public void setConfig(Map<String, String> config) {
    this.config = config;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstanceProviderConfig instanceProviderConfig = (InstanceProviderConfig) o;
    return Objects.equals(this.type, instanceProviderConfig.type) &&
        Objects.equals(this.config, instanceProviderConfig.config);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, config);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstanceProviderConfig {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
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

