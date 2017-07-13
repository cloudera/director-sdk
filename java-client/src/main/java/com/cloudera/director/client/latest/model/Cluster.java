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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Cluster {
  /* Availability information for features */
  private Map<String, String> featureAvailability;
  /* Overall cluster health */
  private Health health;
  /* All instances making this cluster */
  private List<Instance> instances;
  /* Optional URL for cluster instances in Cloudera Manager */
  private String instancesUrl;
  /* Cluster name */
  private String name;
  /* The services that belong to this cluster */
  private List<Service> services;
  /* Optional URL for cluster in Cloudera Manager */
  private String url;
  public Cluster() { }

  private Cluster(Map<String, String> featureAvailability, Health health, List<Instance> instances, String instancesUrl, String name, List<Service> services, String url) {
    this.featureAvailability = featureAvailability;
    this.health = health;
    this.instances = instances;
    this.instancesUrl = instancesUrl;
    this.name = name;
    this.services = services;
    this.url = url;
  }

  private Cluster(ClusterBuilder builder) {
    this.featureAvailability = builder.featureAvailability;
    this.health = builder.health;
    this.instances = builder.instances;
    this.instancesUrl = builder.instancesUrl;
    this.name = builder.name;
    this.services = builder.services;
    this.url = builder.url;
  }

  public static ClusterBuilder builder() {
    return new ClusterBuilder();
  }

  public static class ClusterBuilder {
    private Map<String, String> featureAvailability = new HashMap<String, String>();
    private Health health = null;
    private List<Instance> instances = new ArrayList<Instance>();
    private String instancesUrl = null;
    private String name = null;
    private List<Service> services = new ArrayList<Service>();
    private String url = null;

    public ClusterBuilder featureAvailability(Map<String, String> featureAvailability) {
      this.featureAvailability = featureAvailability;
      return this;
    }

    public ClusterBuilder health(Health health) {
      this.health = health;
      return this;
    }

    public ClusterBuilder instances(List<Instance> instances) {
      this.instances = instances;
      return this;
    }

    public ClusterBuilder instancesUrl(String instancesUrl) {
      this.instancesUrl = instancesUrl;
      return this;
    }

    public ClusterBuilder name(String name) {
      this.name = name;
      return this;
    }

    public ClusterBuilder services(List<Service> services) {
      this.services = services;
      return this;
    }

    public ClusterBuilder url(String url) {
      this.url = url;
      return this;
    }

    public Cluster build() {
      return new Cluster(this);
    }
  }

  public ClusterBuilder toBuilder() {
    return builder()
      .featureAvailability(featureAvailability)
      .health(health)
      .instances(instances)
      .instancesUrl(instancesUrl)
      .name(name)
      .services(services)
      .url(url)
      ;
  }
  public Map<String, String> getFeatureAvailability() {
    return featureAvailability;
  }
  public void setFeatureAvailability(Map<String, String> featureAvailability) {
    this.featureAvailability = featureAvailability;
  }

  public Health getHealth() {
    return health;
  }
  public void setHealth(Health health) {
    this.health = health;
  }

  public List<Instance> getInstances() {
    return instances;
  }
  public void setInstances(List<Instance> instances) {
    this.instances = instances;
  }

  public String getInstancesUrl() {
    return instancesUrl;
  }
  public void setInstancesUrl(String instancesUrl) {
    this.instancesUrl = instancesUrl;
  }

  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  public List<Service> getServices() {
    return services;
  }
  public void setServices(List<Service> services) {
    this.services = services;
  }

  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Cluster other = (Cluster) o; // NOPMD

    if (featureAvailability != null ?
        !featureAvailability.equals(other.featureAvailability) :
        other.featureAvailability != null) return false;
    if (health != null ?
        !health.equals(other.health) :
        other.health != null) return false;
    if (instances != null ?
        !instances.equals(other.instances) :
        other.instances != null) return false;
    if (instancesUrl != null ?
        !instancesUrl.equals(other.instancesUrl) :
        other.instancesUrl != null) return false;
    if (name != null ?
        !name.equals(other.name) :
        other.name != null) return false;
    if (services != null ?
        !services.equals(other.services) :
        other.services != null) return false;
    if (url != null ?
        !url.equals(other.url) :
        other.url != null) return false;
    return true;
  }

  @Override
  public int hashCode() {
    int result = 0;
    result = 31 * result + (featureAvailability != null ? featureAvailability.hashCode() : 0);
    result = 31 * result + (health != null ? health.hashCode() : 0);
    result = 31 * result + (instances != null ? instances.hashCode() : 0);
    result = 31 * result + (instancesUrl != null ? instancesUrl.hashCode() : 0);
    result = 31 * result + (name != null ? name.hashCode() : 0);
    result = 31 * result + (services != null ? services.hashCode() : 0);
    result = 31 * result + (url != null ? url.hashCode() : 0);
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    String newLine = System.getProperty("line.separator");
    sb.append("class Cluster {" + newLine);
    sb.append("  featureAvailability: ").append(featureAvailability).append(newLine);
    sb.append("  health: ").append(health).append(newLine);
    sb.append("  instances: ").append(instances).append(newLine);
    sb.append("  instancesUrl: ").append(instancesUrl).append(newLine);
    sb.append("  name: ").append(name).append(newLine);
    sb.append("  services: ").append(services).append(newLine);
    sb.append("  url: ").append(url).append(newLine);
    sb.append("}" + newLine);
    return sb.toString();
  }
}

