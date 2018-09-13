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


package com.cloudera.director.client.d6_0.model;

import java.util.Objects;
import com.cloudera.director.client.d6_0.model.Health;
import com.cloudera.director.client.d6_0.model.HealthCheck;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * A service running in a cluster
 */
@ApiModel(description = "A service running in a cluster")

public class Service {
  @SerializedName("health")
  private Health health = null;
  @SerializedName("healthChecks")
  private List<HealthCheck> healthChecks = null;
  @SerializedName("roleInstancesUrl")
  private String roleInstancesUrl = null;
  @SerializedName("serviceName")
  private String serviceName = null;
  @SerializedName("url")
  private String url = null;

  public Service() {
    // Do nothing
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

  public Service health(Health health) {
    this.health = health;
    return this;
  }

   /**
   * Service health
   * @return health
  **/
  @ApiModelProperty(value = "Service health")
  public Health getHealth() {
    return health;
  }

  public void setHealth(Health health) {
    this.health = health;
  }

  public Service healthChecks(List<HealthCheck> healthChecks) {
    this.healthChecks = healthChecks;
    return this;
  }

  public Service addHealthChecksItem(HealthCheck healthChecksItem) {
    if (this.healthChecks == null) {
      this.healthChecks = new ArrayList<HealthCheck>();
    }
    this.healthChecks.add(healthChecksItem);
    return this;
  }

   /**
   * Health checks performed on service
   * @return healthChecks
  **/
  @ApiModelProperty(value = "Health checks performed on service")
  public List<HealthCheck> getHealthChecks() {
    return healthChecks;
  }

  public void setHealthChecks(List<HealthCheck> healthChecks) {
    this.healthChecks = healthChecks;
  }

  public Service roleInstancesUrl(String roleInstancesUrl) {
    this.roleInstancesUrl = roleInstancesUrl;
    return this;
  }

   /**
   * URL for service instances
   * @return roleInstancesUrl
  **/
  @ApiModelProperty(value = "URL for service instances")
  public String getRoleInstancesUrl() {
    return roleInstancesUrl;
  }

  public void setRoleInstancesUrl(String roleInstancesUrl) {
    this.roleInstancesUrl = roleInstancesUrl;
  }

  public Service serviceName(String serviceName) {
    this.serviceName = serviceName;
    return this;
  }

   /**
   * Service name
   * @return serviceName
  **/
  @ApiModelProperty(required = true, value = "Service name")
  public String getServiceName() {
    return serviceName;
  }

  public void setServiceName(String serviceName) {
    this.serviceName = serviceName;
  }

  public Service url(String url) {
    this.url = url;
    return this;
  }

   /**
   * URL for service
   * @return url
  **/
  @ApiModelProperty(value = "URL for service")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Service service = (Service) o;
    return Objects.equals(this.health, service.health) &&
        Objects.equals(this.healthChecks, service.healthChecks) &&
        Objects.equals(this.roleInstancesUrl, service.roleInstancesUrl) &&
        Objects.equals(this.serviceName, service.serviceName) &&
        Objects.equals(this.url, service.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(health, healthChecks, roleInstancesUrl, serviceName, url);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Service {\n");
    
    sb.append("    health: ").append(toIndentedString(health)).append("\n");
    sb.append("    healthChecks: ").append(toIndentedString(healthChecks)).append("\n");
    sb.append("    roleInstancesUrl: ").append(toIndentedString(roleInstancesUrl)).append("\n");
    sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

