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

package com.cloudera.director.client.v7.model;

import java.util.HashMap;
import java.util.Map;

public class ExternalDatabaseServer {
  /* Hostname for existing external database server */
  private String hostname;
  /* External database server name */
  private String name;
  /* Database password for administrative access [redacted on read] */
  private String password;
  /* Port for an existing external database server */
  private Integer port;
  /* External database display properties */
  private Map<String, String> properties;
  /* External database server type */
  private String type;
  /* Database username for administrative access */
  private String username;
  public interface Type {
    String POSTGRESQL = "POSTGRESQL";
    String MYSQL = "MYSQL";
    String ORACLE = "ORACLE";
  }
  public ExternalDatabaseServer() { }

  private ExternalDatabaseServer(String hostname, String name, String password, Integer port, Map<String, String> properties, String type, String username) {
    this.hostname = hostname;
    this.name = name;
    this.password = password;
    this.port = port;
    this.properties = properties;
    this.type = type;
    this.username = username;
  }

  private ExternalDatabaseServer(ExternalDatabaseServerBuilder builder) {
    this.hostname = builder.hostname;
    this.name = builder.name;
    this.password = builder.password;
    this.port = builder.port;
    this.properties = builder.properties;
    this.type = builder.type;
    this.username = builder.username;
  }

  public static ExternalDatabaseServerBuilder builder() {
    return new ExternalDatabaseServerBuilder();
  }

  public static class ExternalDatabaseServerBuilder {
    private String hostname = null;
    private String name = null;
    private String password = null;
    private Integer port = null;
    private Map<String, String> properties = new HashMap<String, String>();
    private String type = null;
    private String username = null;

    public ExternalDatabaseServerBuilder hostname(String hostname) {
      this.hostname = hostname;
      return this;
    }

    public ExternalDatabaseServerBuilder name(String name) {
      this.name = name;
      return this;
    }

    public ExternalDatabaseServerBuilder password(String password) {
      this.password = password;
      return this;
    }

    public ExternalDatabaseServerBuilder port(Integer port) {
      this.port = port;
      return this;
    }

    public ExternalDatabaseServerBuilder properties(Map<String, String> properties) {
      this.properties = properties;
      return this;
    }

    public ExternalDatabaseServerBuilder type(String type) {
      this.type = type;
      return this;
    }

    public ExternalDatabaseServerBuilder username(String username) {
      this.username = username;
      return this;
    }

    public ExternalDatabaseServer build() {
      return new ExternalDatabaseServer(this);
    }
  }

  public ExternalDatabaseServerBuilder toBuilder() {
    return builder()
      .hostname(hostname)
      .name(name)
      .password(password)
      .port(port)
      .properties(properties)
      .type(type)
      .username(username)
      ;
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

  public Map<String, String> getProperties() {
    return properties;
  }
  public void setProperties(Map<String, String> properties) {
    this.properties = properties;
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

    ExternalDatabaseServer other = (ExternalDatabaseServer) o; // NOPMD

    if (hostname != null ?
        !hostname.equals(other.hostname) :
        other.hostname != null) return false;
    if (name != null ?
        !name.equals(other.name) :
        other.name != null) return false;
    if (port != null ?
        !port.equals(other.port) :
        other.port != null) return false;
    if (properties != null ?
        !properties.equals(other.properties) :
        other.properties != null) return false;
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
    result = 31 * result + (hostname != null ? hostname.hashCode() : 0);
    result = 31 * result + (name != null ? name.hashCode() : 0);
    result = 31 * result + (port != null ? port.hashCode() : 0);
    result = 31 * result + (properties != null ? properties.hashCode() : 0);
    result = 31 * result + (type != null ? type.hashCode() : 0);
    result = 31 * result + (username != null ? username.hashCode() : 0);
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    String newLine = System.getProperty("line.separator");
    sb.append("class ExternalDatabaseServer {" + newLine);
    sb.append("  hostname: ").append(hostname).append(newLine);
    sb.append("  name: ").append(name).append(newLine);
    sb.append("  password: ").append("REDACTED").append(newLine);
    sb.append("  port: ").append(port).append(newLine);
    sb.append("  properties: ").append(properties).append(newLine);
    sb.append("  type: ").append(type).append(newLine);
    sb.append("  username: ").append(username).append(newLine);
    sb.append("}" + newLine);
    return sb.toString();
  }
}

