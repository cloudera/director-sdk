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


package com.cloudera.director.client.v7.model;

import java.util.Objects;
import com.cloudera.director.client.v7.model.Capabilities;
import com.cloudera.director.client.v7.model.Health;
import com.cloudera.director.client.v7.model.VirtualInstance;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * An instance in a cloud provider
 */
@ApiModel(description = "An instance in a cloud provider")

public class Instance {
  @SerializedName("capabilities")
  private Capabilities capabilities = null;
  @SerializedName("health")
  private Health health = null;
  @SerializedName("ipAddress")
  private String ipAddress = null;
  @SerializedName("properties")
  private Map<String, String> properties = null;
  @SerializedName("virtualInstance")
  private VirtualInstance virtualInstance = null;

  public Instance() {
    // Do nothing
  }

  private Instance(InstanceBuilder builder) {
      this.capabilities = builder.capabilities;
      this.health = builder.health;
      this.ipAddress = builder.ipAddress;
      this.properties = builder.properties;
      this.virtualInstance = builder.virtualInstance;
    }

  public static InstanceBuilder builder() {
    return new InstanceBuilder();
  }

  public static class InstanceBuilder {
      private Capabilities capabilities = null;
      private Health health = null;
      private String ipAddress = null;
      private Map<String, String> properties = new HashMap<String, String>();
      private VirtualInstance virtualInstance = null;
  

    public InstanceBuilder capabilities(Capabilities capabilities) {
      this.capabilities = capabilities;
      return this;
    }


    public InstanceBuilder health(Health health) {
      this.health = health;
      return this;
    }


    public InstanceBuilder ipAddress(String ipAddress) {
      this.ipAddress = ipAddress;
      return this;
    }


    public InstanceBuilder properties(Map<String, String> properties) {
      this.properties = properties;
      return this;
    }


    public InstanceBuilder virtualInstance(VirtualInstance virtualInstance) {
      this.virtualInstance = virtualInstance;
      return this;
    }


    public Instance build() {
      return new Instance(this);
    }
  }

  public InstanceBuilder toBuilder() {
    return builder()
      .capabilities(capabilities)
            .health(health)
            .ipAddress(ipAddress)
            .properties(properties)
            .virtualInstance(virtualInstance)
      ;
  }

  public Instance capabilities(Capabilities capabilities) {
    this.capabilities = capabilities;
    return this;
  }

   /**
   * Optional instance capabilities
   * @return capabilities
  **/
  @ApiModelProperty(value = "Optional instance capabilities")
  public Capabilities getCapabilities() {
    return capabilities;
  }

  public void setCapabilities(Capabilities capabilities) {
    this.capabilities = capabilities;
  }

  public Instance health(Health health) {
    this.health = health;
    return this;
  }

   /**
   * Instance health
   * @return health
  **/
  @ApiModelProperty(value = "Instance health")
  public Health getHealth() {
    return health;
  }

  public void setHealth(Health health) {
    this.health = health;
  }

  public Instance ipAddress(String ipAddress) {
    this.ipAddress = ipAddress;
    return this;
  }

   /**
   * IP address of instance
   * @return ipAddress
  **/
  @ApiModelProperty(required = true, value = "IP address of instance")
  public String getIpAddress() {
    return ipAddress;
  }

  public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
  }

  public Instance properties(Map<String, String> properties) {
    this.properties = properties;
    return this;
  }

  public Instance putPropertiesItem(String key, String propertiesItem) {
    if (this.properties == null) {
      this.properties = new HashMap<String, String>();
    }
    this.properties.put(key, propertiesItem);
    return this;
  }

   /**
   * Instance properties
   * @return properties
  **/
  @ApiModelProperty(value = "Instance properties")
  public Map<String, String> getProperties() {
    return properties;
  }

  public void setProperties(Map<String, String> properties) {
    this.properties = properties;
  }

  public Instance virtualInstance(VirtualInstance virtualInstance) {
    this.virtualInstance = virtualInstance;
    return this;
  }

   /**
   * Virtual instance mapping to this instance
   * @return virtualInstance
  **/
  @ApiModelProperty(required = true, value = "Virtual instance mapping to this instance")
  public VirtualInstance getVirtualInstance() {
    return virtualInstance;
  }

  public void setVirtualInstance(VirtualInstance virtualInstance) {
    this.virtualInstance = virtualInstance;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Instance instance = (Instance) o;
    return Objects.equals(this.capabilities, instance.capabilities) &&
        Objects.equals(this.health, instance.health) &&
        Objects.equals(this.ipAddress, instance.ipAddress) &&
        Objects.equals(this.properties, instance.properties) &&
        Objects.equals(this.virtualInstance, instance.virtualInstance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(capabilities, health, ipAddress, properties, virtualInstance);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Instance {\n");
    
    sb.append("    capabilities: ").append(toIndentedString(capabilities)).append("\n");
    sb.append("    health: ").append(toIndentedString(health)).append("\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    virtualInstance: ").append(toIndentedString(virtualInstance)).append("\n");
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

