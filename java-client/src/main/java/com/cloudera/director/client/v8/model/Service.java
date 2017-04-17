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

package com.cloudera.director.client.v8.model;

import java.util.ArrayList;
import java.util.List;

public class Service {
  /* Service health */
  private Health health;
  /* Health checks performed on service */
  private List<HealthCheck> healthChecks;
  /* URL for service instances */
  private String roleInstancesUrl;
  /* Service name */
  private String serviceName;
  /* URL for service */
  private String url;
  public Service() { }

  private Service(Health health, List<HealthCheck> healthChecks, String roleInstancesUrl, String serviceName, String url) {
    this.health = health;
    this.healthChecks = healthChecks;
    this.roleInstancesUrl = roleInstancesUrl;
    this.serviceName = serviceName;
    this.url = url;
  }

  private Service(ServiceBuilder builder) {
    this.health = builder.health;
    this.healthChecks = builder.healthChecks;
    this.roleInstancesUrl = builder.roleInstancesUrl;
    this.serviceName = builder.serviceName;
    this.url = builder.url;
  }

  public static ServiceBuilder builder() {
    return new ServiceBuilder();
  }

  public static class ServiceBuilder {
    private Health health = null;
    private List<HealthCheck> healthChecks = new ArrayList<HealthCheck>();
    private String roleInstancesUrl = null;
    private String serviceName = null;
    private String url = null;

    public ServiceBuilder health(Health health) {
      this.health = health;
      return this;
    }

    public ServiceBuilder healthChecks(List<HealthCheck> healthChecks) {
      this.healthChecks = healthChecks;
      return this;
    }

    public ServiceBuilder roleInstancesUrl(String roleInstancesUrl) {
      this.roleInstancesUrl = roleInstancesUrl;
      return this;
    }

    public ServiceBuilder serviceName(String serviceName) {
      this.serviceName = serviceName;
      return this;
    }

    public ServiceBuilder url(String url) {
      this.url = url;
      return this;
    }

    public Service build() {
      return new Service(this);
    }
  }

  public ServiceBuilder toBuilder() {
    return builder()
      .health(health)
      .healthChecks(healthChecks)
      .roleInstancesUrl(roleInstancesUrl)
      .serviceName(serviceName)
      .url(url)
      ;
  }
  public Health getHealth() {
    return health;
  }
  public void setHealth(Health health) {
    this.health = health;
  }

  public List<HealthCheck> getHealthChecks() {
    return healthChecks;
  }
  public void setHealthChecks(List<HealthCheck> healthChecks) {
    this.healthChecks = healthChecks;
  }

  public String getRoleInstancesUrl() {
    return roleInstancesUrl;
  }
  public void setRoleInstancesUrl(String roleInstancesUrl) {
    this.roleInstancesUrl = roleInstancesUrl;
  }

  public String getServiceName() {
    return serviceName;
  }
  public void setServiceName(String serviceName) {
    this.serviceName = serviceName;
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

    Service other = (Service) o; // NOPMD

    if (health != null ?
        !health.equals(other.health) :
        other.health != null) return false;
    if (healthChecks != null ?
        !healthChecks.equals(other.healthChecks) :
        other.healthChecks != null) return false;
    if (roleInstancesUrl != null ?
        !roleInstancesUrl.equals(other.roleInstancesUrl) :
        other.roleInstancesUrl != null) return false;
    if (serviceName != null ?
        !serviceName.equals(other.serviceName) :
        other.serviceName != null) return false;
    if (url != null ?
        !url.equals(other.url) :
        other.url != null) return false;
    return true;
  }

  @Override
  public int hashCode() {
    int result = 0;
    result = 31 * result + (health != null ? health.hashCode() : 0);
    result = 31 * result + (healthChecks != null ? healthChecks.hashCode() : 0);
    result = 31 * result + (roleInstancesUrl != null ? roleInstancesUrl.hashCode() : 0);
    result = 31 * result + (serviceName != null ? serviceName.hashCode() : 0);
    result = 31 * result + (url != null ? url.hashCode() : 0);
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    String newLine = System.getProperty("line.separator");
    sb.append("class Service {" + newLine);
    sb.append("  health: ").append(health).append(newLine);
    sb.append("  healthChecks: ").append(healthChecks).append(newLine);
    sb.append("  roleInstancesUrl: ").append(roleInstancesUrl).append(newLine);
    sb.append("  serviceName: ").append(serviceName).append(newLine);
    sb.append("  url: ").append(url).append(newLine);
    sb.append("}" + newLine);
    return sb.toString();
  }
}

