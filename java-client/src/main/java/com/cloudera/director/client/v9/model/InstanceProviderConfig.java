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

package com.cloudera.director.client.v9.model;

import java.util.HashMap;
import java.util.Map;

public class InstanceProviderConfig {
  /* Provider specific configurations [redacted on read] */
  private Map<String, String> config;
  /* Provider type */
  private String type;
  public interface Type {
    String AWS = "aws";
    String BYON = "byon";
  }
  public InstanceProviderConfig() { }

  private InstanceProviderConfig(Map<String, String> config, String type) {
    this.config = config;
    this.type = type;
  }

  private InstanceProviderConfig(InstanceProviderConfigBuilder builder) {
    this.config = builder.config;
    this.type = builder.type;
  }

  public static InstanceProviderConfigBuilder builder() {
    return new InstanceProviderConfigBuilder();
  }

  public static class InstanceProviderConfigBuilder {
    private Map<String, String> config = new HashMap<String, String>();
    private String type = null;

    public InstanceProviderConfigBuilder config(Map<String, String> config) {
      this.config = config;
      return this;
    }

    public InstanceProviderConfigBuilder type(String type) {
      this.type = type;
      return this;
    }

    public InstanceProviderConfig build() {
      return new InstanceProviderConfig(this);
    }
  }

  public InstanceProviderConfigBuilder toBuilder() {
    return builder()
      .config(config)
      .type(type)
      ;
  }
  public Map<String, String> getConfig() {
    return config;
  }
  public void setConfig(Map<String, String> config) {
    this.config = config;
  }

  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    InstanceProviderConfig other = (InstanceProviderConfig) o; // NOPMD

    if (type != null ?
        !type.equals(other.type) :
        other.type != null) return false;
    return true;
  }

  @Override
  public int hashCode() {
    int result = 0;
    result = 31 * result + (type != null ? type.hashCode() : 0);
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    String newLine = System.getProperty("line.separator");
    sb.append("class InstanceProviderConfig {" + newLine);
    sb.append("  config: ").append("REDACTED").append(newLine);
    sb.append("  type: ").append(type).append(newLine);
    sb.append("}" + newLine);
    return sb.toString();
  }
}

