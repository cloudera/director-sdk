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

package com.cloudera.director.client.latest.model;

import java.util.HashMap;
import java.util.Map;

public class ExternalAccount {
  /* External account configurations [redacted on read] */
  private Map<String, String> configs;
  /* External account name */
  private String name;
  /* External account type */
  private String type;
  public ExternalAccount() { }

  private ExternalAccount(Map<String, String> configs, String name, String type) {
    this.configs = configs;
    this.name = name;
    this.type = type;
  }

  private ExternalAccount(ExternalAccountBuilder builder) {
    this.configs = builder.configs;
    this.name = builder.name;
    this.type = builder.type;
  }

  public static ExternalAccountBuilder builder() {
    return new ExternalAccountBuilder();
  }

  public static class ExternalAccountBuilder {
    private Map<String, String> configs = new HashMap<String, String>();
    private String name = null;
    private String type = null;

    public ExternalAccountBuilder configs(Map<String, String> configs) {
      this.configs = configs;
      return this;
    }

    public ExternalAccountBuilder name(String name) {
      this.name = name;
      return this;
    }

    public ExternalAccountBuilder type(String type) {
      this.type = type;
      return this;
    }

    public ExternalAccount build() {
      return new ExternalAccount(this);
    }
  }

  public ExternalAccountBuilder toBuilder() {
    return builder()
      .configs(configs)
      .name(name)
      .type(type)
      ;
  }
  public Map<String, String> getConfigs() {
    return configs;
  }
  public void setConfigs(Map<String, String> configs) {
    this.configs = configs;
  }

  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
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

    ExternalAccount other = (ExternalAccount) o; // NOPMD

    if (name != null ?
        !name.equals(other.name) :
        other.name != null) return false;
    if (type != null ?
        !type.equals(other.type) :
        other.type != null) return false;
    return true;
  }

  @Override
  public int hashCode() {
    int result = 0;
    result = 31 * result + (name != null ? name.hashCode() : 0);
    result = 31 * result + (type != null ? type.hashCode() : 0);
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    String newLine = System.getProperty("line.separator");
    sb.append("class ExternalAccount {" + newLine);
    sb.append("  configs: ").append("REDACTED").append(newLine);
    sb.append("  name: ").append(name).append(newLine);
    sb.append("  type: ").append(type).append(newLine);
    sb.append("}" + newLine);
    return sb.toString();
  }
}

