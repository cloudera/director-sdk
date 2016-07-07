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

package com.cloudera.director.client.v3.model;

import java.util.ArrayList;
import java.util.List;

public class Cluster {
  /* All instances making this cluster */
  private List<Instance> instances;
  /* Cluster name */
  private String name;
  /* The services that belong to this cluster */
  private List<Service> services;
  public Cluster() { }

  private Cluster(List<Instance> instances, String name, List<Service> services) {
    this.instances = instances;
    this.name = name;
    this.services = services;
  }

  private Cluster(ClusterBuilder builder) {
    this.instances = builder.instances;
    this.name = builder.name;
    this.services = builder.services;
  }

  public static ClusterBuilder builder() {
    return new ClusterBuilder();
  }

  public static class ClusterBuilder {
    private List<Instance> instances = new ArrayList<Instance>();
    private String name = null;
    private List<Service> services = new ArrayList<Service>();

    public ClusterBuilder instances(List<Instance> instances) {
      this.instances = instances;
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

    public Cluster build() {
      return new Cluster(this);
    }
  }

  public ClusterBuilder toBuilder() {
    return builder()
      .instances(instances)
      .name(name)
      .services(services)
      ;
  }
  public List<Instance> getInstances() {
    return instances;
  }
  public void setInstances(List<Instance> instances) {
    this.instances = instances;
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

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Cluster other = (Cluster) o; // NOPMD

    if (instances != null ?
        !instances.equals(other.instances) :
        other.instances != null) return false;
    if (name != null ?
        !name.equals(other.name) :
        other.name != null) return false;
    if (services != null ?
        !services.equals(other.services) :
        other.services != null) return false;
    return true;
  }

  @Override
  public int hashCode() {
    int result = 0;
    result = 31 * result + (instances != null ? instances.hashCode() : 0);
    result = 31 * result + (name != null ? name.hashCode() : 0);
    result = 31 * result + (services != null ? services.hashCode() : 0);
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    String newLine = System.getProperty("line.separator");
    sb.append("class Cluster {" + newLine);
    sb.append("  instances: ").append(instances).append(newLine);
    sb.append("  name: ").append(name).append(newLine);
    sb.append("  services: ").append(services).append(newLine);
    sb.append("}" + newLine);
    return sb.toString();
  }
}

