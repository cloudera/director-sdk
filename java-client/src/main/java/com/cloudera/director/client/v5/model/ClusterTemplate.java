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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ClusterTemplate {
  /* Optional external database templates */
  private Map<String, ExternalDatabaseTemplate> externalDatabaseTemplates;
  /* Optional external databases */
  private Map<String, ExternalDatabase> externalDatabases;
  /* A description of current manual migrations (read only) */
  private Set<Migration> migrations;
  /* Cluster name */
  private String name;
  /* Optional list of cluster parcel repositories */
  private Set<String> parcelRepositories;
  /* A list of scripts to be run after cluster creation */
  private List<String> postCreateScripts;
  /* A list of scripts to be run before cluster termination */
  private List<String> preTerminateScripts;
  /* Versions for cluster components */
  private Map<String, String> productVersions;
  /* Whether to redeploy client configuration on cluster update */
  private Boolean redeployClientConfigsOnUpdate;
  /* Whether to restart the cluster on cluster update */
  private Boolean restartClusterOnUpdate;
  /* Cluster services */
  private List<String> services;
  /* Cluster services configurations */
  private Map<String, Map<String, String>> servicesConfigs;
  /* List of virtual instances */
  private Map<String, VirtualInstanceGroup> virtualInstanceGroups;
  public ClusterTemplate() { }

  private ClusterTemplate(Map<String, ExternalDatabaseTemplate> externalDatabaseTemplates, Map<String, ExternalDatabase> externalDatabases, Set<Migration> migrations, String name, Set<String> parcelRepositories, List<String> postCreateScripts, List<String> preTerminateScripts, Map<String, String> productVersions, Boolean redeployClientConfigsOnUpdate, Boolean restartClusterOnUpdate, List<String> services, Map<String, Map<String, String>> servicesConfigs, Map<String, VirtualInstanceGroup> virtualInstanceGroups) {
    this.externalDatabaseTemplates = externalDatabaseTemplates;
    this.externalDatabases = externalDatabases;
    this.migrations = migrations;
    this.name = name;
    this.parcelRepositories = parcelRepositories;
    this.postCreateScripts = postCreateScripts;
    this.preTerminateScripts = preTerminateScripts;
    this.productVersions = productVersions;
    this.redeployClientConfigsOnUpdate = redeployClientConfigsOnUpdate;
    this.restartClusterOnUpdate = restartClusterOnUpdate;
    this.services = services;
    this.servicesConfigs = servicesConfigs;
    this.virtualInstanceGroups = virtualInstanceGroups;
  }

  private ClusterTemplate(ClusterTemplateBuilder builder) {
    this.externalDatabaseTemplates = builder.externalDatabaseTemplates;
    this.externalDatabases = builder.externalDatabases;
    this.migrations = builder.migrations;
    this.name = builder.name;
    this.parcelRepositories = builder.parcelRepositories;
    this.postCreateScripts = builder.postCreateScripts;
    this.preTerminateScripts = builder.preTerminateScripts;
    this.productVersions = builder.productVersions;
    this.redeployClientConfigsOnUpdate = builder.redeployClientConfigsOnUpdate;
    this.restartClusterOnUpdate = builder.restartClusterOnUpdate;
    this.services = builder.services;
    this.servicesConfigs = builder.servicesConfigs;
    this.virtualInstanceGroups = builder.virtualInstanceGroups;
  }

  public static ClusterTemplateBuilder builder() {
    return new ClusterTemplateBuilder();
  }

  public static class ClusterTemplateBuilder {
    private Map<String, ExternalDatabaseTemplate> externalDatabaseTemplates = new HashMap<String, ExternalDatabaseTemplate>();
    private Map<String, ExternalDatabase> externalDatabases = new HashMap<String, ExternalDatabase>();
    private Set<Migration> migrations = null;
    private String name = null;
    private Set<String> parcelRepositories = null;
    private List<String> postCreateScripts = new ArrayList<String>();
    private List<String> preTerminateScripts = new ArrayList<String>();
    private Map<String, String> productVersions = new HashMap<String, String>();
    private Boolean redeployClientConfigsOnUpdate = null;
    private Boolean restartClusterOnUpdate = null;
    private List<String> services = new ArrayList<String>();
    private Map<String, Map<String, String>> servicesConfigs = new HashMap<String, Map<String, String>>();
    private Map<String, VirtualInstanceGroup> virtualInstanceGroups = new HashMap<String, VirtualInstanceGroup>();

    public ClusterTemplateBuilder externalDatabaseTemplates(Map<String, ExternalDatabaseTemplate> externalDatabaseTemplates) {
      this.externalDatabaseTemplates = externalDatabaseTemplates;
      return this;
    }

    public ClusterTemplateBuilder externalDatabases(Map<String, ExternalDatabase> externalDatabases) {
      this.externalDatabases = externalDatabases;
      return this;
    }

    public ClusterTemplateBuilder migrations(Set<Migration> migrations) {
      this.migrations = migrations;
      return this;
    }

    public ClusterTemplateBuilder name(String name) {
      this.name = name;
      return this;
    }

    public ClusterTemplateBuilder parcelRepositories(Set<String> parcelRepositories) {
      this.parcelRepositories = parcelRepositories;
      return this;
    }

    public ClusterTemplateBuilder postCreateScripts(List<String> postCreateScripts) {
      this.postCreateScripts = postCreateScripts;
      return this;
    }

    public ClusterTemplateBuilder preTerminateScripts(List<String> preTerminateScripts) {
      this.preTerminateScripts = preTerminateScripts;
      return this;
    }

    public ClusterTemplateBuilder productVersions(Map<String, String> productVersions) {
      this.productVersions = productVersions;
      return this;
    }

    public ClusterTemplateBuilder redeployClientConfigsOnUpdate(Boolean redeployClientConfigsOnUpdate) {
      this.redeployClientConfigsOnUpdate = redeployClientConfigsOnUpdate;
      return this;
    }

    public ClusterTemplateBuilder restartClusterOnUpdate(Boolean restartClusterOnUpdate) {
      this.restartClusterOnUpdate = restartClusterOnUpdate;
      return this;
    }

    public ClusterTemplateBuilder services(List<String> services) {
      this.services = services;
      return this;
    }

    public ClusterTemplateBuilder servicesConfigs(Map<String, Map<String, String>> servicesConfigs) {
      this.servicesConfigs = servicesConfigs;
      return this;
    }

    public ClusterTemplateBuilder virtualInstanceGroups(Map<String, VirtualInstanceGroup> virtualInstanceGroups) {
      this.virtualInstanceGroups = virtualInstanceGroups;
      return this;
    }

    public ClusterTemplate build() {
      return new ClusterTemplate(this);
    }
  }

  public ClusterTemplateBuilder toBuilder() {
    return builder()
      .externalDatabaseTemplates(externalDatabaseTemplates)
      .externalDatabases(externalDatabases)
      .migrations(migrations)
      .name(name)
      .parcelRepositories(parcelRepositories)
      .postCreateScripts(postCreateScripts)
      .preTerminateScripts(preTerminateScripts)
      .productVersions(productVersions)
      .redeployClientConfigsOnUpdate(redeployClientConfigsOnUpdate)
      .restartClusterOnUpdate(restartClusterOnUpdate)
      .services(services)
      .servicesConfigs(servicesConfigs)
      .virtualInstanceGroups(virtualInstanceGroups)
      ;
  }
  public Map<String, ExternalDatabaseTemplate> getExternalDatabaseTemplates() {
    return externalDatabaseTemplates;
  }
  public void setExternalDatabaseTemplates(Map<String, ExternalDatabaseTemplate> externalDatabaseTemplates) {
    this.externalDatabaseTemplates = externalDatabaseTemplates;
  }

  public Map<String, ExternalDatabase> getExternalDatabases() {
    return externalDatabases;
  }
  public void setExternalDatabases(Map<String, ExternalDatabase> externalDatabases) {
    this.externalDatabases = externalDatabases;
  }

  public Set<Migration> getMigrations() {
    return migrations;
  }
  public void setMigrations(Set<Migration> migrations) {
    this.migrations = migrations;
  }

  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  public Set<String> getParcelRepositories() {
    return parcelRepositories;
  }
  public void setParcelRepositories(Set<String> parcelRepositories) {
    this.parcelRepositories = parcelRepositories;
  }

  public List<String> getPostCreateScripts() {
    return postCreateScripts;
  }
  public void setPostCreateScripts(List<String> postCreateScripts) {
    this.postCreateScripts = postCreateScripts;
  }

  public List<String> getPreTerminateScripts() {
    return preTerminateScripts;
  }
  public void setPreTerminateScripts(List<String> preTerminateScripts) {
    this.preTerminateScripts = preTerminateScripts;
  }

  public Map<String, String> getProductVersions() {
    return productVersions;
  }
  public void setProductVersions(Map<String, String> productVersions) {
    this.productVersions = productVersions;
  }

  public Boolean getRedeployClientConfigsOnUpdate() {
    return redeployClientConfigsOnUpdate;
  }
  public void setRedeployClientConfigsOnUpdate(Boolean redeployClientConfigsOnUpdate) {
    this.redeployClientConfigsOnUpdate = redeployClientConfigsOnUpdate;
  }

  public Boolean getRestartClusterOnUpdate() {
    return restartClusterOnUpdate;
  }
  public void setRestartClusterOnUpdate(Boolean restartClusterOnUpdate) {
    this.restartClusterOnUpdate = restartClusterOnUpdate;
  }

  public List<String> getServices() {
    return services;
  }
  public void setServices(List<String> services) {
    this.services = services;
  }

  public Map<String, Map<String, String>> getServicesConfigs() {
    return servicesConfigs;
  }
  public void setServicesConfigs(Map<String, Map<String, String>> servicesConfigs) {
    this.servicesConfigs = servicesConfigs;
  }

  public Map<String, VirtualInstanceGroup> getVirtualInstanceGroups() {
    return virtualInstanceGroups;
  }
  public void setVirtualInstanceGroups(Map<String, VirtualInstanceGroup> virtualInstanceGroups) {
    this.virtualInstanceGroups = virtualInstanceGroups;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    ClusterTemplate other = (ClusterTemplate) o; // NOPMD

    if (externalDatabaseTemplates != null ?
        !externalDatabaseTemplates.equals(other.externalDatabaseTemplates) :
        other.externalDatabaseTemplates != null) return false;
    if (externalDatabases != null ?
        !externalDatabases.equals(other.externalDatabases) :
        other.externalDatabases != null) return false;
    if (migrations != null ?
        !migrations.equals(other.migrations) :
        other.migrations != null) return false;
    if (name != null ?
        !name.equals(other.name) :
        other.name != null) return false;
    if (parcelRepositories != null ?
        !parcelRepositories.equals(other.parcelRepositories) :
        other.parcelRepositories != null) return false;
    if (postCreateScripts != null ?
        !postCreateScripts.equals(other.postCreateScripts) :
        other.postCreateScripts != null) return false;
    if (preTerminateScripts != null ?
        !preTerminateScripts.equals(other.preTerminateScripts) :
        other.preTerminateScripts != null) return false;
    if (productVersions != null ?
        !productVersions.equals(other.productVersions) :
        other.productVersions != null) return false;
    if (redeployClientConfigsOnUpdate != null ?
        !redeployClientConfigsOnUpdate.equals(other.redeployClientConfigsOnUpdate) :
        other.redeployClientConfigsOnUpdate != null) return false;
    if (restartClusterOnUpdate != null ?
        !restartClusterOnUpdate.equals(other.restartClusterOnUpdate) :
        other.restartClusterOnUpdate != null) return false;
    if (services != null ?
        !services.equals(other.services) :
        other.services != null) return false;
    if (servicesConfigs != null ?
        !servicesConfigs.equals(other.servicesConfigs) :
        other.servicesConfigs != null) return false;
    if (virtualInstanceGroups != null ?
        !virtualInstanceGroups.equals(other.virtualInstanceGroups) :
        other.virtualInstanceGroups != null) return false;
    return true;
  }

  @Override
  public int hashCode() {
    int result = 0;
    result = 31 * result + (externalDatabaseTemplates != null ? externalDatabaseTemplates.hashCode() : 0);
    result = 31 * result + (externalDatabases != null ? externalDatabases.hashCode() : 0);
    result = 31 * result + (migrations != null ? migrations.hashCode() : 0);
    result = 31 * result + (name != null ? name.hashCode() : 0);
    result = 31 * result + (parcelRepositories != null ? parcelRepositories.hashCode() : 0);
    result = 31 * result + (postCreateScripts != null ? postCreateScripts.hashCode() : 0);
    result = 31 * result + (preTerminateScripts != null ? preTerminateScripts.hashCode() : 0);
    result = 31 * result + (productVersions != null ? productVersions.hashCode() : 0);
    result = 31 * result + (redeployClientConfigsOnUpdate != null ? redeployClientConfigsOnUpdate.hashCode() : 0);
    result = 31 * result + (restartClusterOnUpdate != null ? restartClusterOnUpdate.hashCode() : 0);
    result = 31 * result + (services != null ? services.hashCode() : 0);
    result = 31 * result + (servicesConfigs != null ? servicesConfigs.hashCode() : 0);
    result = 31 * result + (virtualInstanceGroups != null ? virtualInstanceGroups.hashCode() : 0);
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    String newLine = System.getProperty("line.separator");
    sb.append("class ClusterTemplate {" + newLine);
    sb.append("  externalDatabaseTemplates: ").append(externalDatabaseTemplates).append(newLine);
    sb.append("  externalDatabases: ").append(externalDatabases).append(newLine);
    sb.append("  migrations: ").append(migrations).append(newLine);
    sb.append("  name: ").append(name).append(newLine);
    sb.append("  parcelRepositories: ").append(parcelRepositories).append(newLine);
    sb.append("  postCreateScripts: ").append(postCreateScripts).append(newLine);
    sb.append("  preTerminateScripts: ").append(preTerminateScripts).append(newLine);
    sb.append("  productVersions: ").append(productVersions).append(newLine);
    sb.append("  redeployClientConfigsOnUpdate: ").append(redeployClientConfigsOnUpdate).append(newLine);
    sb.append("  restartClusterOnUpdate: ").append(restartClusterOnUpdate).append(newLine);
    sb.append("  services: ").append(services).append(newLine);
    sb.append("  servicesConfigs: ").append(servicesConfigs).append(newLine);
    sb.append("  virtualInstanceGroups: ").append(virtualInstanceGroups).append(newLine);
    sb.append("}" + newLine);
    return sb.toString();
  }
}

