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


package com.cloudera.director.client.v6.model;

import java.util.Objects;
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
 * MigratingGroup
 */

public class MigratingGroup {
  @SerializedName("virtualInstanceGroupName")
  private String virtualInstanceGroupName = null;
  @SerializedName("virtualInstanceIds")
  private List<String> virtualInstanceIds = null;

  public MigratingGroup() {
    // Do nothing
  }

  private MigratingGroup(MigratingGroupBuilder builder) {
      this.virtualInstanceGroupName = builder.virtualInstanceGroupName;
      this.virtualInstanceIds = builder.virtualInstanceIds;
    }

  public static MigratingGroupBuilder builder() {
    return new MigratingGroupBuilder();
  }

  public static class MigratingGroupBuilder {
      private String virtualInstanceGroupName = null;
      private List<String> virtualInstanceIds = new ArrayList<String>();
  

    public MigratingGroupBuilder virtualInstanceGroupName(String virtualInstanceGroupName) {
      this.virtualInstanceGroupName = virtualInstanceGroupName;
      return this;
    }


    public MigratingGroupBuilder virtualInstanceIds(List<String> virtualInstanceIds) {
      this.virtualInstanceIds = virtualInstanceIds;
      return this;
    }


    public MigratingGroup build() {
      return new MigratingGroup(this);
    }
  }

  public MigratingGroupBuilder toBuilder() {
    return builder()
      .virtualInstanceGroupName(virtualInstanceGroupName)
            .virtualInstanceIds(virtualInstanceIds)
      ;
  }

  public MigratingGroup virtualInstanceGroupName(String virtualInstanceGroupName) {
    this.virtualInstanceGroupName = virtualInstanceGroupName;
    return this;
  }

   /**
   * Name of virtual instance group to which these virtual instances belong
   * @return virtualInstanceGroupName
  **/
  @ApiModelProperty(required = true, value = "Name of virtual instance group to which these virtual instances belong")
  public String getVirtualInstanceGroupName() {
    return virtualInstanceGroupName;
  }

  public void setVirtualInstanceGroupName(String virtualInstanceGroupName) {
    this.virtualInstanceGroupName = virtualInstanceGroupName;
  }

  public MigratingGroup virtualInstanceIds(List<String> virtualInstanceIds) {
    this.virtualInstanceIds = virtualInstanceIds;
    return this;
  }

  public MigratingGroup addVirtualInstanceIdsItem(String virtualInstanceIdsItem) {
    if (this.virtualInstanceIds == null) {
      this.virtualInstanceIds = new ArrayList<String>();
    }
    this.virtualInstanceIds.add(virtualInstanceIdsItem);
    return this;
  }

   /**
   * Virtual instance ids in this group
   * @return virtualInstanceIds
  **/
  @ApiModelProperty(value = "Virtual instance ids in this group")
  public List<String> getVirtualInstanceIds() {
    return virtualInstanceIds;
  }

  public void setVirtualInstanceIds(List<String> virtualInstanceIds) {
    this.virtualInstanceIds = virtualInstanceIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MigratingGroup migratingGroup = (MigratingGroup) o;
    return Objects.equals(this.virtualInstanceGroupName, migratingGroup.virtualInstanceGroupName) &&
        Objects.equals(this.virtualInstanceIds, migratingGroup.virtualInstanceIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(virtualInstanceGroupName, virtualInstanceIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MigratingGroup {\n");
    
    sb.append("    virtualInstanceGroupName: ").append(toIndentedString(virtualInstanceGroupName)).append("\n");
    sb.append("    virtualInstanceIds: ").append(toIndentedString(virtualInstanceIds)).append("\n");
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

