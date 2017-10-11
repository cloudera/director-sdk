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

package com.cloudera.director.client.v10.model;

import java.util.HashMap;
import java.util.Map;

public class ExternalDatabaseServerTemplate {
  private Map<String, String> config;
  /* Hostname for existing external database server */
  private String hostname;
  /* External database server name */
  private String name;
  /* Database password for administrative access [redacted on read] */
  private String password;
  /* Port for an existing external database server */
  private Integer port;
  private Map<String, String> tags;
  /* External database server type */
  private String type;
  /* Database username for administrative access */
  private String username;
  public interface Type {
    String POSTGRESQL = "POSTGRESQL";
    String MYSQL = "MYSQL";
    String ORACLE = "ORACLE";
  }
  public ExternalDatabaseServerTemplate() { }

  private ExternalDatabaseServerTemplate(Map<String, String> config, String hostname, String name, String password, Integer port, Map<String, String> tags, String type, String username) {
    this.config = config;
    this.hostname = hostname;
    this.name = name;
    this.password = password;
    this.port = port;
    this.tags = tags;
    this.type = type;
    this.username = username;
  }

  private ExternalDatabaseServerTemplate(ExternalDatabaseServerTemplateBuilder builder) {
    this.config = builder.config;
    this.hostname = builder.hostname;
    this.name = builder.name;
    this.password = builder.password;
    this.port = builder.port;
    this.tags = builder.tags;
    this.type = builder.type;
    this.username = builder.username;
  }

  public static ExternalDatabaseServerTemplateBuilder builder() {
    return new ExternalDatabaseServerTemplateBuilder();
  }

  public static class ExternalDatabaseServerTemplateBuilder {
    private Map<String, String> config = new HashMap<String, String>();
    private String hostname = null;
    private String name = null;
    private String password = null;
    private Integer port = null;
    private Map<String, String> tags = new HashMap<String, String>();
    private String type = null;
    private String username = null;

    public ExternalDatabaseServerTemplateBuilder config(Map<String, String> config) {
      this.config = config;
      return this;
    }

    public ExternalDatabaseServerTemplateBuilder hostname(String hostname) {
      this.hostname = hostname;
      return this;
    }

    public ExternalDatabaseServerTemplateBuilder name(String name) {
      this.name = name;
      return this;
    }

    public ExternalDatabaseServerTemplateBuilder password(String password) {
      this.password = password;
      return this;
    }

    public ExternalDatabaseServerTemplateBuilder port(Integer port) {
      this.port = port;
      return this;
    }

    public ExternalDatabaseServerTemplateBuilder tags(Map<String, String> tags) {
      this.tags = tags;
      return this;
    }

    public ExternalDatabaseServerTemplateBuilder type(String type) {
      this.type = type;
      return this;
    }

    public ExternalDatabaseServerTemplateBuilder username(String username) {
      this.username = username;
      return this;
    }

    public ExternalDatabaseServerTemplate build() {
      return new ExternalDatabaseServerTemplate(this);
    }
  }

  public ExternalDatabaseServerTemplateBuilder toBuilder() {
    return builder()
      .config(config)
      .hostname(hostname)
      .name(name)
      .password(password)
      .port(port)
      .tags(tags)
      .type(type)
      .username(username)
      ;
  }
  public Map<String, String> getConfig() {
    return config;
  }
  public void setConfig(Map<String, String> config) {
    this.config = config;
  }

  public String getHostname() {
    return hostname;
  }
  public void setHostname(String hostname) {
    this.hostname = hostname;
  }

  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }

  public Integer getPort() {
    return port;
  }
  public void setPort(Integer port) {
    this.port = port;
  }

  public Map<String, String> getTags() {
    return tags;
  }
  public void setTags(Map<String, String> tags) {
    this.tags = tags;
  }

  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  public String getUsername() {
    return username;
  }
  public void setUsername(String username) {
    this.username = username;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    ExternalDatabaseServerTemplate other = (ExternalDatabaseServerTemplate) o; // NOPMD

    if (config != null ?
        !config.equals(other.config) :
        other.config != null) return false;
    if (hostname != null ?
        !hostname.equals(other.hostname) :
        other.hostname != null) return false;
    if (name != null ?
        !name.equals(other.name) :
        other.name != null) return false;
    if (port != null ?
        !port.equals(other.port) :
        other.port != null) return false;
    if (tags != null ?
        !tags.equals(other.tags) :
        other.tags != null) return false;
    if (type != null ?
        !type.equals(other.type) :
        other.type != null) return false;
    if (username != null ?
        !username.equals(other.username) :
        other.username != null) return false;
    return true;
  }

  @Override
  public int hashCode() {
    int result = 0;
    result = 31 * result + (config != null ? config.hashCode() : 0);
    result = 31 * result + (hostname != null ? hostname.hashCode() : 0);
    result = 31 * result + (name != null ? name.hashCode() : 0);
    result = 31 * result + (port != null ? port.hashCode() : 0);
    result = 31 * result + (tags != null ? tags.hashCode() : 0);
    result = 31 * result + (type != null ? type.hashCode() : 0);
    result = 31 * result + (username != null ? username.hashCode() : 0);
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    String newLine = System.getProperty("line.separator");
    sb.append("class ExternalDatabaseServerTemplate {" + newLine);
    sb.append("  config: ").append(config).append(newLine);
    sb.append("  hostname: ").append(hostname).append(newLine);
    sb.append("  name: ").append(name).append(newLine);
    sb.append("  password: ").append("REDACTED").append(newLine);
    sb.append("  port: ").append(port).append(newLine);
    sb.append("  tags: ").append(tags).append(newLine);
    sb.append("  type: ").append(type).append(newLine);
    sb.append("  username: ").append(username).append(newLine);
    sb.append("}" + newLine);
    return sb.toString();
  }
}

