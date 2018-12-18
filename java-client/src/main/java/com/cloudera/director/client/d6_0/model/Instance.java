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
import com.cloudera.director.client.d6_0.model.Capabilities;
import com.cloudera.director.client.d6_0.model.Health;
import com.cloudera.director.client.d6_0.model.InstanceState;
import com.cloudera.director.client.d6_0.model.ValidationExceptionCondition;
import com.cloudera.director.client.d6_0.model.VirtualInstance;
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
 * An instance in a cloud provider
 */
@ApiModel(description = "An instance in a cloud provider")

public class Instance {
  @SerializedName("ipAddress")
  private String ipAddress = null;
  @SerializedName("properties")
  private Map<String, String> properties = null;
  @SerializedName("virtualInstance")
  private VirtualInstance virtualInstance = null;
  @SerializedName("capabilities")
  private Capabilities capabilities = null;
  @SerializedName("cmHostId")
  private String cmHostId = null;
  @SerializedName("cmHostUrl")
  private String cmHostUrl = null;
  @SerializedName("hostKeyFingerprints")
  private List<String> hostKeyFingerprints = null;
  @SerializedName("state")
  private InstanceState state = null;
  @SerializedName("validationConditions")
  private List<ValidationExceptionCondition> validationConditions = null;
  @SerializedName("health")
  private Health health = null;

  public Instance() {
    // Do nothing
  }

  private Instance(InstanceBuilder builder) {
      this.ipAddress = builder.ipAddress;
      this.properties = builder.properties;
      this.virtualInstance = builder.virtualInstance;
      this.capabilities = builder.capabilities;
      this.cmHostId = builder.cmHostId;
      this.cmHostUrl = builder.cmHostUrl;
      this.hostKeyFingerprints = builder.hostKeyFingerprints;
      this.state = builder.state;
      this.validationConditions = builder.validationConditions;
      this.health = builder.health;
    }

  public static InstanceBuilder builder() {
    return new InstanceBuilder();
  }

  public static class InstanceBuilder {
      private String ipAddress = null;
      private Map<String, String> properties = new HashMap<String, String>();
      private VirtualInstance virtualInstance = null;
      private Capabilities capabilities = null;
      private String cmHostId = null;
      private String cmHostUrl = null;
      private List<String> hostKeyFingerprints = new ArrayList<String>();
      private InstanceState state = null;
      private List<ValidationExceptionCondition> validationConditions = new ArrayList<ValidationExceptionCondition>();
      private Health health = null;
  

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


    public InstanceBuilder capabilities(Capabilities capabilities) {
      this.capabilities = capabilities;
      return this;
    }


    public InstanceBuilder cmHostId(String cmHostId) {
      this.cmHostId = cmHostId;
      return this;
    }


    public InstanceBuilder cmHostUrl(String cmHostUrl) {
      this.cmHostUrl = cmHostUrl;
      return this;
    }


    public InstanceBuilder hostKeyFingerprints(List<String> hostKeyFingerprints) {
      this.hostKeyFingerprints = hostKeyFingerprints;
      return this;
    }


    public InstanceBuilder state(InstanceState state) {
      this.state = state;
      return this;
    }


    public InstanceBuilder validationConditions(List<ValidationExceptionCondition> validationConditions) {
      this.validationConditions = validationConditions;
      return this;
    }


    public InstanceBuilder health(Health health) {
      this.health = health;
      return this;
    }


    public Instance build() {
      return new Instance(this);
    }
  }

  public InstanceBuilder toBuilder() {
    return builder()
      .ipAddress(ipAddress)
            .properties(properties)
            .virtualInstance(virtualInstance)
            .capabilities(capabilities)
            .cmHostId(cmHostId)
            .cmHostUrl(cmHostUrl)
            .hostKeyFingerprints(hostKeyFingerprints)
            .state(state)
            .validationConditions(validationConditions)
            .health(health)
      ;
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

  public Instance cmHostId(String cmHostId) {
    this.cmHostId = cmHostId;
    return this;
  }

   /**
   * Optional Cloudera Manager HostId
   * @return cmHostId
  **/
  @ApiModelProperty(value = "Optional Cloudera Manager HostId")
  public String getCmHostId() {
    return cmHostId;
  }

  public void setCmHostId(String cmHostId) {
    this.cmHostId = cmHostId;
  }

  public Instance cmHostUrl(String cmHostUrl) {
    this.cmHostUrl = cmHostUrl;
    return this;
  }

   /**
   * Optional Cloudera Manager Host URL
   * @return cmHostUrl
  **/
  @ApiModelProperty(value = "Optional Cloudera Manager Host URL")
  public String getCmHostUrl() {
    return cmHostUrl;
  }

  public void setCmHostUrl(String cmHostUrl) {
    this.cmHostUrl = cmHostUrl;
  }

  public Instance hostKeyFingerprints(List<String> hostKeyFingerprints) {
    this.hostKeyFingerprints = hostKeyFingerprints;
    return this;
  }

  public Instance addHostKeyFingerprintsItem(String hostKeyFingerprintsItem) {
    if (this.hostKeyFingerprints == null) {
      this.hostKeyFingerprints = new ArrayList<String>();
    }
    this.hostKeyFingerprints.add(hostKeyFingerprintsItem);
    return this;
  }

   /**
   * Optional Host Key Fingerprints
   * @return hostKeyFingerprints
  **/
  @ApiModelProperty(value = "Optional Host Key Fingerprints")
  public List<String> getHostKeyFingerprints() {
    return hostKeyFingerprints;
  }

  public void setHostKeyFingerprints(List<String> hostKeyFingerprints) {
    this.hostKeyFingerprints = hostKeyFingerprints;
  }

  public Instance state(InstanceState state) {
    this.state = state;
    return this;
  }

   /**
   * Instance state
   * @return state
  **/
  @ApiModelProperty(value = "Instance state")
  public InstanceState getState() {
    return state;
  }

  public void setState(InstanceState state) {
    this.state = state;
  }

  public Instance validationConditions(List<ValidationExceptionCondition> validationConditions) {
    this.validationConditions = validationConditions;
    return this;
  }

  public Instance addValidationConditionsItem(ValidationExceptionCondition validationConditionsItem) {
    if (this.validationConditions == null) {
      this.validationConditions = new ArrayList<ValidationExceptionCondition>();
    }
    this.validationConditions.add(validationConditionsItem);
    return this;
  }

   /**
   * Validation conditions
   * @return validationConditions
  **/
  @ApiModelProperty(value = "Validation conditions")
  public List<ValidationExceptionCondition> getValidationConditions() {
    return validationConditions;
  }

  public void setValidationConditions(List<ValidationExceptionCondition> validationConditions) {
    this.validationConditions = validationConditions;
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Instance instance = (Instance) o;
    return Objects.equals(this.ipAddress, instance.ipAddress) &&
        Objects.equals(this.properties, instance.properties) &&
        Objects.equals(this.virtualInstance, instance.virtualInstance) &&
        Objects.equals(this.capabilities, instance.capabilities) &&
        Objects.equals(this.cmHostId, instance.cmHostId) &&
        Objects.equals(this.cmHostUrl, instance.cmHostUrl) &&
        Objects.equals(this.hostKeyFingerprints, instance.hostKeyFingerprints) &&
        Objects.equals(this.state, instance.state) &&
        Objects.equals(this.validationConditions, instance.validationConditions) &&
        Objects.equals(this.health, instance.health);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ipAddress, properties, virtualInstance, capabilities, cmHostId, cmHostUrl, hostKeyFingerprints, state, validationConditions, health);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Instance {\n");
    
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    virtualInstance: ").append(toIndentedString(virtualInstance)).append("\n");
    sb.append("    capabilities: ").append(toIndentedString(capabilities)).append("\n");
    sb.append("    cmHostId: ").append(toIndentedString(cmHostId)).append("\n");
    sb.append("    cmHostUrl: ").append(toIndentedString(cmHostUrl)).append("\n");
    sb.append("    hostKeyFingerprints: ").append(toIndentedString(hostKeyFingerprints)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    validationConditions: ").append(toIndentedString(validationConditions)).append("\n");
    sb.append("    health: ").append(toIndentedString(health)).append("\n");
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

