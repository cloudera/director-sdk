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

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Instance {
  /* Optional instance capabilities */
  private Capabilities capabilities;
  /* Optional Cloudera Manager HostId */
  private String cmHostId;
  /* Instance health */
  private Health health;
  /* IP address of instance */
  private String ipAddress;
  /* Instance properties */
  private Map<String, String> properties;
  /* Instance state */
  private InstanceState state;
  /* Validation conditions */
  private Set<ValidationExceptionCondition> validationConditions;
  /* Virtual instance */
  private VirtualInstance virtualInstance;
  public Instance() { }

  private Instance(Capabilities capabilities, String cmHostId, Health health, String ipAddress, Map<String, String> properties, InstanceState state, Set<ValidationExceptionCondition> validationConditions, VirtualInstance virtualInstance) {
    this.capabilities = capabilities;
    this.cmHostId = cmHostId;
    this.health = health;
    this.ipAddress = ipAddress;
    this.properties = properties;
    this.state = state;
    this.validationConditions = validationConditions;
    this.virtualInstance = virtualInstance;
  }

  private Instance(InstanceBuilder builder) {
    this.capabilities = builder.capabilities;
    this.cmHostId = builder.cmHostId;
    this.health = builder.health;
    this.ipAddress = builder.ipAddress;
    this.properties = builder.properties;
    this.state = builder.state;
    this.validationConditions = builder.validationConditions;
    this.virtualInstance = builder.virtualInstance;
  }

  public static InstanceBuilder builder() {
    return new InstanceBuilder();
  }

  public static class InstanceBuilder {
    private Capabilities capabilities = null;
    private String cmHostId = null;
    private Health health = null;
    private String ipAddress = null;
    private Map<String, String> properties = new HashMap<String, String>();
    private InstanceState state = null;
    private Set<ValidationExceptionCondition> validationConditions = null;
    private VirtualInstance virtualInstance = null;

    public InstanceBuilder capabilities(Capabilities capabilities) {
      this.capabilities = capabilities;
      return this;
    }

    public InstanceBuilder cmHostId(String cmHostId) {
      this.cmHostId = cmHostId;
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

    public InstanceBuilder state(InstanceState state) {
      this.state = state;
      return this;
    }

    public InstanceBuilder validationConditions(Set<ValidationExceptionCondition> validationConditions) {
      this.validationConditions = validationConditions;
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
      .cmHostId(cmHostId)
      .health(health)
      .ipAddress(ipAddress)
      .properties(properties)
      .state(state)
      .validationConditions(validationConditions)
      .virtualInstance(virtualInstance)
      ;
  }
  public Capabilities getCapabilities() {
    return capabilities;
  }
  public void setCapabilities(Capabilities capabilities) {
    this.capabilities = capabilities;
  }

  public String getCmHostId() {
    return cmHostId;
  }
  public void setCmHostId(String cmHostId) {
    this.cmHostId = cmHostId;
  }

  public Health getHealth() {
    return health;
  }
  public void setHealth(Health health) {
    this.health = health;
  }

  public String getIpAddress() {
    return ipAddress;
  }
  public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
  }

  public Map<String, String> getProperties() {
    return properties;
  }
  public void setProperties(Map<String, String> properties) {
    this.properties = properties;
  }

  public InstanceState getState() {
    return state;
  }
  public void setState(InstanceState state) {
    this.state = state;
  }

  public Set<ValidationExceptionCondition> getValidationConditions() {
    return validationConditions;
  }
  public void setValidationConditions(Set<ValidationExceptionCondition> validationConditions) {
    this.validationConditions = validationConditions;
  }

  public VirtualInstance getVirtualInstance() {
    return virtualInstance;
  }
  public void setVirtualInstance(VirtualInstance virtualInstance) {
    this.virtualInstance = virtualInstance;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Instance other = (Instance) o; // NOPMD

    if (capabilities != null ?
        !capabilities.equals(other.capabilities) :
        other.capabilities != null) return false;
    if (cmHostId != null ?
        !cmHostId.equals(other.cmHostId) :
        other.cmHostId != null) return false;
    if (health != null ?
        !health.equals(other.health) :
        other.health != null) return false;
    if (ipAddress != null ?
        !ipAddress.equals(other.ipAddress) :
        other.ipAddress != null) return false;
    if (properties != null ?
        !properties.equals(other.properties) :
        other.properties != null) return false;
    if (state != null ?
        !state.equals(other.state) :
        other.state != null) return false;
    if (validationConditions != null ?
        !validationConditions.equals(other.validationConditions) :
        other.validationConditions != null) return false;
    if (virtualInstance != null ?
        !virtualInstance.equals(other.virtualInstance) :
        other.virtualInstance != null) return false;
    return true;
  }

  @Override
  public int hashCode() {
    int result = 0;
    result = 31 * result + (capabilities != null ? capabilities.hashCode() : 0);
    result = 31 * result + (cmHostId != null ? cmHostId.hashCode() : 0);
    result = 31 * result + (health != null ? health.hashCode() : 0);
    result = 31 * result + (ipAddress != null ? ipAddress.hashCode() : 0);
    result = 31 * result + (properties != null ? properties.hashCode() : 0);
    result = 31 * result + (state != null ? state.hashCode() : 0);
    result = 31 * result + (validationConditions != null ? validationConditions.hashCode() : 0);
    result = 31 * result + (virtualInstance != null ? virtualInstance.hashCode() : 0);
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    String newLine = System.getProperty("line.separator");
    sb.append("class Instance {" + newLine);
    sb.append("  capabilities: ").append(capabilities).append(newLine);
    sb.append("  cmHostId: ").append(cmHostId).append(newLine);
    sb.append("  health: ").append(health).append(newLine);
    sb.append("  ipAddress: ").append(ipAddress).append(newLine);
    sb.append("  properties: ").append(properties).append(newLine);
    sb.append("  state: ").append(state).append(newLine);
    sb.append("  validationConditions: ").append(validationConditions).append(newLine);
    sb.append("  virtualInstance: ").append(virtualInstance).append(newLine);
    sb.append("}" + newLine);
    return sb.toString();
  }
}

