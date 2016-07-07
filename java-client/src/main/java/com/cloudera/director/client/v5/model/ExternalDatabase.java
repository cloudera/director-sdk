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

package com.cloudera.director.client.v5.model;


public class ExternalDatabase {
  private String host;
  private String name;
  /* password [redacted on read] */
  private String password;
  private Integer port;
  private String type;
  private String user;
  public interface Type {
    String POSTGRESQL = "POSTGRESQL";
    String MYSQL = "MYSQL";
    String ORACLE = "ORACLE";
  }
  public ExternalDatabase() { }

  private ExternalDatabase(String host, String name, String password, Integer port, String type, String user) {
    this.host = host;
    this.name = name;
    this.password = password;
    this.port = port;
    this.type = type;
    this.user = user;
  }

  private ExternalDatabase(ExternalDatabaseBuilder builder) {
    this.host = builder.host;
    this.name = builder.name;
    this.password = builder.password;
    this.port = builder.port;
    this.type = builder.type;
    this.user = builder.user;
  }

  public static ExternalDatabaseBuilder builder() {
    return new ExternalDatabaseBuilder();
  }

  public static class ExternalDatabaseBuilder {
    private String host = null;
    private String name = null;
    private String password = null;
    private Integer port = null;
    private String type = null;
    private String user = null;

    public ExternalDatabaseBuilder host(String host) {
      this.host = host;
      return this;
    }

    public ExternalDatabaseBuilder name(String name) {
      this.name = name;
      return this;
    }

    public ExternalDatabaseBuilder password(String password) {
      this.password = password;
      return this;
    }

    public ExternalDatabaseBuilder port(Integer port) {
      this.port = port;
      return this;
    }

    public ExternalDatabaseBuilder type(String type) {
      this.type = type;
      return this;
    }

    public ExternalDatabaseBuilder user(String user) {
      this.user = user;
      return this;
    }

    public ExternalDatabase build() {
      return new ExternalDatabase(this);
    }
  }

  public ExternalDatabaseBuilder toBuilder() {
    return builder()
      .host(host)
      .name(name)
      .password(password)
      .port(port)
      .type(type)
      .user(user)
      ;
  }
  public String getHost() {
    return host;
  }
  public void setHost(String host) {
    this.host = host;
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

  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  public String getUser() {
    return user;
  }
  public void setUser(String user) {
    this.user = user;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    ExternalDatabase other = (ExternalDatabase) o; // NOPMD

    if (host != null ?
        !host.equals(other.host) :
        other.host != null) return false;
    if (name != null ?
        !name.equals(other.name) :
        other.name != null) return false;
    if (port != null ?
        !port.equals(other.port) :
        other.port != null) return false;
    if (type != null ?
        !type.equals(other.type) :
        other.type != null) return false;
    if (user != null ?
        !user.equals(other.user) :
        other.user != null) return false;
    return true;
  }

  @Override
  public int hashCode() {
    int result = 0;
    result = 31 * result + (host != null ? host.hashCode() : 0);
    result = 31 * result + (name != null ? name.hashCode() : 0);
    result = 31 * result + (port != null ? port.hashCode() : 0);
    result = 31 * result + (type != null ? type.hashCode() : 0);
    result = 31 * result + (user != null ? user.hashCode() : 0);
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    String newLine = System.getProperty("line.separator");
    sb.append("class ExternalDatabase {" + newLine);
    sb.append("  host: ").append(host).append(newLine);
    sb.append("  name: ").append(name).append(newLine);
    sb.append("  password: ").append("REDACTED").append(newLine);
    sb.append("  port: ").append(port).append(newLine);
    sb.append("  type: ").append(type).append(newLine);
    sb.append("  user: ").append(user).append(newLine);
    sb.append("}" + newLine);
    return sb.toString();
  }
}

