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


package com.cloudera.director.client.v11.model;

import java.util.Objects;
import com.cloudera.director.client.v11.model.ExternalDatabase;
import com.cloudera.director.client.v11.model.Health;
import com.cloudera.director.client.v11.model.Instance;
import com.cloudera.director.client.v11.model.Service;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * A cluster running in a cloud provider
 */
@ApiModel(description = "A cluster running in a cloud provider")

public class Cluster {
  @SerializedName("name")
  private String name = null;
  @SerializedName("instances")
  private List<Instance> instances = null;
  @SerializedName("services")
  private List<Service> services = null;
  @SerializedName("url")
  private String url = null;
  @SerializedName("instancesUrl")
  private String instancesUrl = null;
  @SerializedName("health")
  private Health health = null;
  /**
   * Gets or Sets inner
   */
  @JsonAdapter(InnerEnum.Adapter.class)
  public enum InnerEnum {
    UNKNOWN("UNKNOWN"),
    
    UNAVAILABLE("UNAVAILABLE"),
    
    AVAILABLE("AVAILABLE");

    private String value;

    InnerEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static InnerEnum fromValue(String text) {
      for (InnerEnum b : InnerEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<InnerEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final InnerEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public InnerEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return InnerEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("featureAvailability")
  private Map<String, InnerEnum> featureAvailability = null;
  @SerializedName("createdExternalDatabases")
  private List<ExternalDatabase> createdExternalDatabases = null;

  public Cluster() {
    // Do nothing
  }

  private Cluster(ClusterBuilder builder) {
      this.name = builder.name;
      this.instances = builder.instances;
      this.services = builder.services;
      this.url = builder.url;
      this.instancesUrl = builder.instancesUrl;
      this.health = builder.health;
      this.featureAvailability = builder.featureAvailability;
      this.createdExternalDatabases = builder.createdExternalDatabases;
    }

  public static ClusterBuilder builder() {
    return new ClusterBuilder();
  }

  public static class ClusterBuilder {
      private String name = null;
      private List<Instance> instances = new ArrayList<Instance>();
      private List<Service> services = new ArrayList<Service>();
      private String url = null;
      private String instancesUrl = null;
      private Health health = null;
      private Map<String, InnerEnum> featureAvailability = new HashMap<String, InnerEnum>();
      private List<ExternalDatabase> createdExternalDatabases = new ArrayList<ExternalDatabase>();
  

    public ClusterBuilder name(String name) {
      this.name = name;
      return this;
    }


    public ClusterBuilder instances(List<Instance> instances) {
      this.instances = instances;
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


    public ClusterBuilder instancesUrl(String instancesUrl) {
      this.instancesUrl = instancesUrl;
      return this;
    }


    public ClusterBuilder health(Health health) {
      this.health = health;
      return this;
    }


    public ClusterBuilder featureAvailability(Map<String, InnerEnum> featureAvailability) {
      this.featureAvailability = featureAvailability;
      return this;
    }


    public ClusterBuilder createdExternalDatabases(List<ExternalDatabase> createdExternalDatabases) {
      this.createdExternalDatabases = createdExternalDatabases;
      return this;
    }


    public Cluster build() {
      return new Cluster(this);
    }
  }

  public ClusterBuilder toBuilder() {
    return builder()
      .name(name)
            .instances(instances)
            .services(services)
            .url(url)
            .instancesUrl(instancesUrl)
            .health(health)
            .featureAvailability(featureAvailability)
            .createdExternalDatabases(createdExternalDatabases)
      ;
  }

  public Cluster name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Cluster name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Cluster name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Cluster instances(List<Instance> instances) {
    this.instances = instances;
    return this;
  }

  public Cluster addInstancesItem(Instance instancesItem) {
    if (this.instances == null) {
      this.instances = new ArrayList<Instance>();
    }
    this.instances.add(instancesItem);
    return this;
  }

   /**
   * Instances making this cluster
   * @return instances
  **/
  @ApiModelProperty(value = "Instances making this cluster")
  public List<Instance> getInstances() {
    return instances;
  }

  public void setInstances(List<Instance> instances) {
    this.instances = instances;
  }

  public Cluster services(List<Service> services) {
    this.services = services;
    return this;
  }

  public Cluster addServicesItem(Service servicesItem) {
    if (this.services == null) {
      this.services = new ArrayList<Service>();
    }
    this.services.add(servicesItem);
    return this;
  }

   /**
   * Services that belong to this cluster
   * @return services
  **/
  @ApiModelProperty(value = "Services that belong to this cluster")
  public List<Service> getServices() {
    return services;
  }

  public void setServices(List<Service> services) {
    this.services = services;
  }

  public Cluster url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Optional URL for cluster in Cloudera Manager
   * @return url
  **/
  @ApiModelProperty(value = "Optional URL for cluster in Cloudera Manager")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public Cluster instancesUrl(String instancesUrl) {
    this.instancesUrl = instancesUrl;
    return this;
  }

   /**
   * Optional URL for cluster instances in Cloudera Manager
   * @return instancesUrl
  **/
  @ApiModelProperty(value = "Optional URL for cluster instances in Cloudera Manager")
  public String getInstancesUrl() {
    return instancesUrl;
  }

  public void setInstancesUrl(String instancesUrl) {
    this.instancesUrl = instancesUrl;
  }

  public Cluster health(Health health) {
    this.health = health;
    return this;
  }

   /**
   * Overall cluster health
   * @return health
  **/
  @ApiModelProperty(value = "Overall cluster health")
  public Health getHealth() {
    return health;
  }

  public void setHealth(Health health) {
    this.health = health;
  }

  public Cluster featureAvailability(Map<String, InnerEnum> featureAvailability) {
    this.featureAvailability = featureAvailability;
    return this;
  }

  public Cluster putFeatureAvailabilityItem(String key, InnerEnum featureAvailabilityItem) {
    if (this.featureAvailability == null) {
      this.featureAvailability = new HashMap<String, InnerEnum>();
    }
    this.featureAvailability.put(key, featureAvailabilityItem);
    return this;
  }

   /**
   * Availability information for features
   * @return featureAvailability
  **/
  @ApiModelProperty(value = "Availability information for features")
  public Map<String, InnerEnum> getFeatureAvailability() {
    return featureAvailability;
  }

  public void setFeatureAvailability(Map<String, InnerEnum> featureAvailability) {
    this.featureAvailability = featureAvailability;
  }

  public Cluster createdExternalDatabases(List<ExternalDatabase> createdExternalDatabases) {
    this.createdExternalDatabases = createdExternalDatabases;
    return this;
  }

  public Cluster addCreatedExternalDatabasesItem(ExternalDatabase createdExternalDatabasesItem) {
    if (this.createdExternalDatabases == null) {
      this.createdExternalDatabases = new ArrayList<ExternalDatabase>();
    }
    this.createdExternalDatabases.add(createdExternalDatabasesItem);
    return this;
  }

   /**
   * External databases created for this cluster
   * @return createdExternalDatabases
  **/
  @ApiModelProperty(value = "External databases created for this cluster")
  public List<ExternalDatabase> getCreatedExternalDatabases() {
    return createdExternalDatabases;
  }

  public void setCreatedExternalDatabases(List<ExternalDatabase> createdExternalDatabases) {
    this.createdExternalDatabases = createdExternalDatabases;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Cluster cluster = (Cluster) o;
    return Objects.equals(this.name, cluster.name) &&
        Objects.equals(this.instances, cluster.instances) &&
        Objects.equals(this.services, cluster.services) &&
        Objects.equals(this.url, cluster.url) &&
        Objects.equals(this.instancesUrl, cluster.instancesUrl) &&
        Objects.equals(this.health, cluster.health) &&
        Objects.equals(this.featureAvailability, cluster.featureAvailability) &&
        Objects.equals(this.createdExternalDatabases, cluster.createdExternalDatabases);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, instances, services, url, instancesUrl, health, featureAvailability, createdExternalDatabases);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Cluster {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    instances: ").append(toIndentedString(instances)).append("\n");
    sb.append("    services: ").append(toIndentedString(services)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    instancesUrl: ").append(toIndentedString(instancesUrl)).append("\n");
    sb.append("    health: ").append(toIndentedString(health)).append("\n");
    sb.append("    featureAvailability: ").append(toIndentedString(featureAvailability)).append("\n");
    sb.append("    createdExternalDatabases: ").append(toIndentedString(createdExternalDatabases)).append("\n");
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

