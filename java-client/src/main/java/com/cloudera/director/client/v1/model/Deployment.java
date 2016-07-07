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

package com.cloudera.director.client.v1.model;

import java.util.HashMap;
import java.util.Map;

public class Deployment {
  private Map<String, String> config;
  /* Hostname for existing Cloudera Manager installation */
  private String hostname;
  private Instance managerInstance;
  /* Deployment name */
  private String name;
  /* Password for API access [redacted on read] */
  private String password;
  /* API port for an existing Cloudera Manager installation */
  private Integer port;
  /* Username for API access */
  private String username;
  public Deployment() { }

  private Deployment(Map<String, String> config, String hostname, Instance managerInstance, String name, String password, Integer port, String username) {
    this.config = config;
    this.hostname = hostname;
    this.managerInstance = managerInstance;
    this.name = name;
    this.password = password;
    this.port = port;
    this.username = username;
  }

  private Deployment(DeploymentBuilder builder) {
    this.config = builder.config;
    this.hostname = builder.hostname;
    this.managerInstance = builder.managerInstance;
    this.name = builder.name;
    this.password = builder.password;
    this.port = builder.port;
    this.username = builder.username;
  }

  public static DeploymentBuilder builder() {
    return new DeploymentBuilder();
  }

  public static class DeploymentBuilder {
    private Map<String, String> config = new HashMap<String, String>();
    private String hostname = null;
    private Instance managerInstance = null;
    private String name = null;
    private String password = null;
    private Integer port = null;
    private String username = null;

    public DeploymentBuilder config(Map<String, String> config) {
      this.config = config;
      return this;
    }

    public DeploymentBuilder hostname(String hostname) {
      this.hostname = hostname;
      return this;
    }

    public DeploymentBuilder managerInstance(Instance managerInstance) {
      this.managerInstance = managerInstance;
      return this;
    }

    public DeploymentBuilder name(String name) {
      this.name = name;
      return this;
    }

    public DeploymentBuilder password(String password) {
      this.password = password;
      return this;
    }

    public DeploymentBuilder port(Integer port) {
      this.port = port;
      return this;
    }

    public DeploymentBuilder username(String username) {
      this.username = username;
      return this;
    }

    public Deployment build() {
      return new Deployment(this);
    }
  }

  public DeploymentBuilder toBuilder() {
    return builder()
      .config(config)
      .hostname(hostname)
      .managerInstance(managerInstance)
      .name(name)
      .password(password)
      .port(port)
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

  public Instance getManagerInstance() {
    return managerInstance;
  }
  public void setManagerInstance(Instance managerInstance) {
    this.managerInstance = managerInstance;
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

    Deployment other = (Deployment) o; // NOPMD

    if (config != null ?
        !config.equals(other.config) :
        other.config != null) return false;
    if (hostname != null ?
        !hostname.equals(other.hostname) :
        other.hostname != null) return false;
    if (managerInstance != null ?
        !managerInstance.equals(other.managerInstance) :
        other.managerInstance != null) return false;
    if (name != null ?
        !name.equals(other.name) :
        other.name != null) return false;
    if (port != null ?
        !port.equals(other.port) :
        other.port != null) return false;
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
    result = 31 * result + (managerInstance != null ? managerInstance.hashCode() : 0);
    result = 31 * result + (name != null ? name.hashCode() : 0);
    result = 31 * result + (port != null ? port.hashCode() : 0);
    result = 31 * result + (username != null ? username.hashCode() : 0);
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    String newLine = System.getProperty("line.separator");
    sb.append("class Deployment {" + newLine);
    sb.append("  config: ").append(config).append(newLine);
    sb.append("  hostname: ").append(hostname).append(newLine);
    sb.append("  managerInstance: ").append(managerInstance).append(newLine);
    sb.append("  name: ").append(name).append(newLine);
    sb.append("  password: ").append("REDACTED").append(newLine);
    sb.append("  port: ").append(port).append(newLine);
    sb.append("  username: ").append(username).append(newLine);
    sb.append("}" + newLine);
    return sb.toString();
  }
}

