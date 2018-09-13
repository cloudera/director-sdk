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


package com.cloudera.director.client.latest.model;

import java.util.Objects;
import com.cloudera.director.client.latest.model.VirtualInstance;
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
 * A group of virtual instances sharing common roles and configurations
 */
@ApiModel(description = "A group of virtual instances sharing common roles and configurations")

public class VirtualInstanceGroup {
  @SerializedName("minCount")
  private Integer minCount = null;
  @SerializedName("name")
  private String name = null;
  @SerializedName("roleTypesConfigs")
  private Map<String, Map<String, Map<String, String>>> roleTypesConfigs = null;
  @SerializedName("serviceTypeToRoleTypes")
  private Map<String, List<String>> serviceTypeToRoleTypes = null;
  @SerializedName("virtualInstances")
  private List<VirtualInstance> virtualInstances = new ArrayList<VirtualInstance>();

  public VirtualInstanceGroup() {
    // Do nothing
  }

  private VirtualInstanceGroup(VirtualInstanceGroupBuilder builder) {
      this.minCount = builder.minCount;
      this.name = builder.name;
      this.roleTypesConfigs = builder.roleTypesConfigs;
      this.serviceTypeToRoleTypes = builder.serviceTypeToRoleTypes;
      this.virtualInstances = builder.virtualInstances;
    }

  public static VirtualInstanceGroupBuilder builder() {
    return new VirtualInstanceGroupBuilder();
  }

  public static class VirtualInstanceGroupBuilder {
      private Integer minCount = null;
      private String name = null;
      private Map<String, Map<String, Map<String, String>>> roleTypesConfigs = new HashMap<String, Map<String, Map<String, String>>>();
      private Map<String, List<String>> serviceTypeToRoleTypes = new HashMap<String, List<String>>();
      private List<VirtualInstance> virtualInstances = new ArrayList<VirtualInstance>();
  

    public VirtualInstanceGroupBuilder minCount(Integer minCount) {
      this.minCount = minCount;
      return this;
    }


    public VirtualInstanceGroupBuilder name(String name) {
      this.name = name;
      return this;
    }


    public VirtualInstanceGroupBuilder roleTypesConfigs(Map<String, Map<String, Map<String, String>>> roleTypesConfigs) {
      this.roleTypesConfigs = roleTypesConfigs;
      return this;
    }


    public VirtualInstanceGroupBuilder serviceTypeToRoleTypes(Map<String, List<String>> serviceTypeToRoleTypes) {
      this.serviceTypeToRoleTypes = serviceTypeToRoleTypes;
      return this;
    }


    public VirtualInstanceGroupBuilder virtualInstances(List<VirtualInstance> virtualInstances) {
      this.virtualInstances = virtualInstances;
      return this;
    }


    public VirtualInstanceGroup build() {
      return new VirtualInstanceGroup(this);
    }
  }

  public VirtualInstanceGroupBuilder toBuilder() {
    return builder()
      .minCount(minCount)
            .name(name)
            .roleTypesConfigs(roleTypesConfigs)
            .serviceTypeToRoleTypes(serviceTypeToRoleTypes)
            .virtualInstances(virtualInstances)
      ;
  }

  public VirtualInstanceGroup minCount(Integer minCount) {
    this.minCount = minCount;
    return this;
  }

   /**
   * Minimum acceptable number of instances in this group
   * @return minCount
  **/
  @ApiModelProperty(required = true, value = "Minimum acceptable number of instances in this group")
  public Integer getMinCount() {
    return minCount;
  }

  public void setMinCount(Integer minCount) {
    this.minCount = minCount;
  }

  public VirtualInstanceGroup name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Virtual instance group name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Virtual instance group name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public VirtualInstanceGroup roleTypesConfigs(Map<String, Map<String, Map<String, String>>> roleTypesConfigs) {
    this.roleTypesConfigs = roleTypesConfigs;
    return this;
  }

  public VirtualInstanceGroup putRoleTypesConfigsItem(String key, Map<String, Map<String, String>> roleTypesConfigsItem) {
    if (this.roleTypesConfigs == null) {
      this.roleTypesConfigs = new HashMap<String, Map<String, Map<String, String>>>();
    }
    this.roleTypesConfigs.put(key, roleTypesConfigsItem);
    return this;
  }

   /**
   * Custom role configurations
   * @return roleTypesConfigs
  **/
  @ApiModelProperty(value = "Custom role configurations")
  public Map<String, Map<String, Map<String, String>>> getRoleTypesConfigs() {
    return roleTypesConfigs;
  }

  public void setRoleTypesConfigs(Map<String, Map<String, Map<String, String>>> roleTypesConfigs) {
    this.roleTypesConfigs = roleTypesConfigs;
  }

  public VirtualInstanceGroup serviceTypeToRoleTypes(Map<String, List<String>> serviceTypeToRoleTypes) {
    this.serviceTypeToRoleTypes = serviceTypeToRoleTypes;
    return this;
  }

  public VirtualInstanceGroup putServiceTypeToRoleTypesItem(String key, List<String> serviceTypeToRoleTypesItem) {
    if (this.serviceTypeToRoleTypes == null) {
      this.serviceTypeToRoleTypes = new HashMap<String, List<String>>();
    }
    this.serviceTypeToRoleTypes.put(key, serviceTypeToRoleTypesItem);
    return this;
  }

   /**
   * Role assignments
   * @return serviceTypeToRoleTypes
  **/
  @ApiModelProperty(value = "Role assignments")
  public Map<String, List<String>> getServiceTypeToRoleTypes() {
    return serviceTypeToRoleTypes;
  }

  public void setServiceTypeToRoleTypes(Map<String, List<String>> serviceTypeToRoleTypes) {
    this.serviceTypeToRoleTypes = serviceTypeToRoleTypes;
  }

  public VirtualInstanceGroup virtualInstances(List<VirtualInstance> virtualInstances) {
    this.virtualInstances = virtualInstances;
    return this;
  }

  public VirtualInstanceGroup addVirtualInstancesItem(VirtualInstance virtualInstancesItem) {
    this.virtualInstances.add(virtualInstancesItem);
    return this;
  }

   /**
   * List of virtual instances in this group
   * @return virtualInstances
  **/
  @ApiModelProperty(required = true, value = "List of virtual instances in this group")
  public List<VirtualInstance> getVirtualInstances() {
    return virtualInstances;
  }

  public void setVirtualInstances(List<VirtualInstance> virtualInstances) {
    this.virtualInstances = virtualInstances;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VirtualInstanceGroup virtualInstanceGroup = (VirtualInstanceGroup) o;
    return Objects.equals(this.minCount, virtualInstanceGroup.minCount) &&
        Objects.equals(this.name, virtualInstanceGroup.name) &&
        Objects.equals(this.roleTypesConfigs, virtualInstanceGroup.roleTypesConfigs) &&
        Objects.equals(this.serviceTypeToRoleTypes, virtualInstanceGroup.serviceTypeToRoleTypes) &&
        Objects.equals(this.virtualInstances, virtualInstanceGroup.virtualInstances);
  }

  @Override
  public int hashCode() {
    return Objects.hash(minCount, name, roleTypesConfigs, serviceTypeToRoleTypes, virtualInstances);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VirtualInstanceGroup {\n");
    
    sb.append("    minCount: ").append(toIndentedString(minCount)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    roleTypesConfigs: ").append(toIndentedString(roleTypesConfigs)).append("\n");
    sb.append("    serviceTypeToRoleTypes: ").append(toIndentedString(serviceTypeToRoleTypes)).append("\n");
    sb.append("    virtualInstances: ").append(toIndentedString(virtualInstances)).append("\n");
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

