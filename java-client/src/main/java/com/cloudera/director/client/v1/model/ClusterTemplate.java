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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ClusterTemplate {
  /* Optional external databases */
  private Map<String, ExternalDatabase> externalDatabases;
  /* Cluster name */
  private String name;
  /* Optional list of cluster parcel repositories */
  private Set<String> parcelRepositories;
  /* Versions for cluster components */
  private Map<String, String> productVersions;
  /* Cluster services */
  private List<String> services;
  /* Cluster services configurations */
  private Map<String, Map<String, String>> servicesConfigs;
  /* List of virtual instances */
  private Map<String, VirtualInstanceGroup> virtualInstanceGroups;
  public ClusterTemplate() { }

  private ClusterTemplate(Map<String, ExternalDatabase> externalDatabases, String name, Set<String> parcelRepositories, Map<String, String> productVersions, List<String> services, Map<String, Map<String, String>> servicesConfigs, Map<String, VirtualInstanceGroup> virtualInstanceGroups) {
    this.externalDatabases = externalDatabases;
    this.name = name;
    this.parcelRepositories = parcelRepositories;
    this.productVersions = productVersions;
    this.services = services;
    this.servicesConfigs = servicesConfigs;
    this.virtualInstanceGroups = virtualInstanceGroups;
  }

  private ClusterTemplate(ClusterTemplateBuilder builder) {
    this.externalDatabases = builder.externalDatabases;
    this.name = builder.name;
    this.parcelRepositories = builder.parcelRepositories;
    this.productVersions = builder.productVersions;
    this.services = builder.services;
    this.servicesConfigs = builder.servicesConfigs;
    this.virtualInstanceGroups = builder.virtualInstanceGroups;
  }

  public static ClusterTemplateBuilder builder() {
    return new ClusterTemplateBuilder();
  }

  public static class ClusterTemplateBuilder {
    private Map<String, ExternalDatabase> externalDatabases = new HashMap<String, ExternalDatabase>();
    private String name = null;
    private Set<String> parcelRepositories = null;
    private Map<String, String> productVersions = new HashMap<String, String>();
    private List<String> services = new ArrayList<String>();
    private Map<String, Map<String, String>> servicesConfigs = new HashMap<String, Map<String, String>>();
    private Map<String, VirtualInstanceGroup> virtualInstanceGroups = new HashMap<String, VirtualInstanceGroup>();

    public ClusterTemplateBuilder externalDatabases(Map<String, ExternalDatabase> externalDatabases) {
      this.externalDatabases = externalDatabases;
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

    public ClusterTemplateBuilder productVersions(Map<String, String> productVersions) {
      this.productVersions = productVersions;
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
      .externalDatabases(externalDatabases)
      .name(name)
      .parcelRepositories(parcelRepositories)
      .productVersions(productVersions)
      .services(services)
      .servicesConfigs(servicesConfigs)
      .virtualInstanceGroups(virtualInstanceGroups)
      ;
  }
  public Map<String, ExternalDatabase> getExternalDatabases() {
    return externalDatabases;
  }
  public void setExternalDatabases(Map<String, ExternalDatabase> externalDatabases) {
    this.externalDatabases = externalDatabases;
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

  public Map<String, String> getProductVersions() {
    return productVersions;
  }
  public void setProductVersions(Map<String, String> productVersions) {
    this.productVersions = productVersions;
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

    if (externalDatabases != null ?
        !externalDatabases.equals(other.externalDatabases) :
        other.externalDatabases != null) return false;
    if (name != null ?
        !name.equals(other.name) :
        other.name != null) return false;
    if (parcelRepositories != null ?
        !parcelRepositories.equals(other.parcelRepositories) :
        other.parcelRepositories != null) return false;
    if (productVersions != null ?
        !productVersions.equals(other.productVersions) :
        other.productVersions != null) return false;
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
    result = 31 * result + (externalDatabases != null ? externalDatabases.hashCode() : 0);
    result = 31 * result + (name != null ? name.hashCode() : 0);
    result = 31 * result + (parcelRepositories != null ? parcelRepositories.hashCode() : 0);
    result = 31 * result + (productVersions != null ? productVersions.hashCode() : 0);
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
    sb.append("  externalDatabases: ").append(externalDatabases).append(newLine);
    sb.append("  name: ").append(name).append(newLine);
    sb.append("  parcelRepositories: ").append(parcelRepositories).append(newLine);
    sb.append("  productVersions: ").append(productVersions).append(newLine);
    sb.append("  services: ").append(services).append(newLine);
    sb.append("  servicesConfigs: ").append(servicesConfigs).append(newLine);
    sb.append("  virtualInstanceGroups: ").append(virtualInstanceGroups).append(newLine);
    sb.append("}" + newLine);
    return sb.toString();
  }
}

