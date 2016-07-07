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

public class DeploymentTemplate {
  private Map<String, String> config;
  private Map<String, ExternalDatabase> externalDatabases;
  /* Instance definition for a Cloudera Manager instance created from scratch */
  private VirtualInstance managerVirtualInstance;
  /* Deployment name */
  private String name;
  public DeploymentTemplate() { }

  private DeploymentTemplate(Map<String, String> config, Map<String, ExternalDatabase> externalDatabases, VirtualInstance managerVirtualInstance, String name) {
    this.config = config;
    this.externalDatabases = externalDatabases;
    this.managerVirtualInstance = managerVirtualInstance;
    this.name = name;
  }

  private DeploymentTemplate(DeploymentTemplateBuilder builder) {
    this.config = builder.config;
    this.externalDatabases = builder.externalDatabases;
    this.managerVirtualInstance = builder.managerVirtualInstance;
    this.name = builder.name;
  }

  public static DeploymentTemplateBuilder builder() {
    return new DeploymentTemplateBuilder();
  }

  public static class DeploymentTemplateBuilder {
    private Map<String, String> config = new HashMap<String, String>();
    private Map<String, ExternalDatabase> externalDatabases = new HashMap<String, ExternalDatabase>();
    private VirtualInstance managerVirtualInstance = null;
    private String name = null;

    public DeploymentTemplateBuilder config(Map<String, String> config) {
      this.config = config;
      return this;
    }

    public DeploymentTemplateBuilder externalDatabases(Map<String, ExternalDatabase> externalDatabases) {
      this.externalDatabases = externalDatabases;
      return this;
    }

    public DeploymentTemplateBuilder managerVirtualInstance(VirtualInstance managerVirtualInstance) {
      this.managerVirtualInstance = managerVirtualInstance;
      return this;
    }

    public DeploymentTemplateBuilder name(String name) {
      this.name = name;
      return this;
    }

    public DeploymentTemplate build() {
      return new DeploymentTemplate(this);
    }
  }

  public DeploymentTemplateBuilder toBuilder() {
    return builder()
      .config(config)
      .externalDatabases(externalDatabases)
      .managerVirtualInstance(managerVirtualInstance)
      .name(name)
      ;
  }
  public Map<String, String> getConfig() {
    return config;
  }
  public void setConfig(Map<String, String> config) {
    this.config = config;
  }

  public Map<String, ExternalDatabase> getExternalDatabases() {
    return externalDatabases;
  }
  public void setExternalDatabases(Map<String, ExternalDatabase> externalDatabases) {
    this.externalDatabases = externalDatabases;
  }

  public VirtualInstance getManagerVirtualInstance() {
    return managerVirtualInstance;
  }
  public void setManagerVirtualInstance(VirtualInstance managerVirtualInstance) {
    this.managerVirtualInstance = managerVirtualInstance;
  }

  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    DeploymentTemplate other = (DeploymentTemplate) o; // NOPMD

    if (config != null ?
        !config.equals(other.config) :
        other.config != null) return false;
    if (externalDatabases != null ?
        !externalDatabases.equals(other.externalDatabases) :
        other.externalDatabases != null) return false;
    if (managerVirtualInstance != null ?
        !managerVirtualInstance.equals(other.managerVirtualInstance) :
        other.managerVirtualInstance != null) return false;
    if (name != null ?
        !name.equals(other.name) :
        other.name != null) return false;
    return true;
  }

  @Override
  public int hashCode() {
    int result = 0;
    result = 31 * result + (config != null ? config.hashCode() : 0);
    result = 31 * result + (externalDatabases != null ? externalDatabases.hashCode() : 0);
    result = 31 * result + (managerVirtualInstance != null ? managerVirtualInstance.hashCode() : 0);
    result = 31 * result + (name != null ? name.hashCode() : 0);
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    String newLine = System.getProperty("line.separator");
    sb.append("class DeploymentTemplate {" + newLine);
    sb.append("  config: ").append(config).append(newLine);
    sb.append("  externalDatabases: ").append(externalDatabases).append(newLine);
    sb.append("  managerVirtualInstance: ").append(managerVirtualInstance).append(newLine);
    sb.append("  name: ").append(name).append(newLine);
    sb.append("}" + newLine);
    return sb.toString();
  }
}

