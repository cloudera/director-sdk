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

package com.cloudera.director.client.v6.model;

import java.util.Set;

public class MigratingGroup {
  /* Name of virtual instance group to which these virtual instances belong */
  private String virtualInstanceGroupName;
  /* Virtual instance ids in this group */
  private Set<String> virtualInstanceIds;
  public MigratingGroup() { }

  private MigratingGroup(String virtualInstanceGroupName, Set<String> virtualInstanceIds) {
    this.virtualInstanceGroupName = virtualInstanceGroupName;
    this.virtualInstanceIds = virtualInstanceIds;
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
    private Set<String> virtualInstanceIds = null;

    public MigratingGroupBuilder virtualInstanceGroupName(String virtualInstanceGroupName) {
      this.virtualInstanceGroupName = virtualInstanceGroupName;
      return this;
    }

    public MigratingGroupBuilder virtualInstanceIds(Set<String> virtualInstanceIds) {
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
  public String getVirtualInstanceGroupName() {
    return virtualInstanceGroupName;
  }
  public void setVirtualInstanceGroupName(String virtualInstanceGroupName) {
    this.virtualInstanceGroupName = virtualInstanceGroupName;
  }

  public Set<String> getVirtualInstanceIds() {
    return virtualInstanceIds;
  }
  public void setVirtualInstanceIds(Set<String> virtualInstanceIds) {
    this.virtualInstanceIds = virtualInstanceIds;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    MigratingGroup other = (MigratingGroup) o; // NOPMD

    if (virtualInstanceGroupName != null ?
        !virtualInstanceGroupName.equals(other.virtualInstanceGroupName) :
        other.virtualInstanceGroupName != null) return false;
    if (virtualInstanceIds != null ?
        !virtualInstanceIds.equals(other.virtualInstanceIds) :
        other.virtualInstanceIds != null) return false;
    return true;
  }

  @Override
  public int hashCode() {
    int result = 0;
    result = 31 * result + (virtualInstanceGroupName != null ? virtualInstanceGroupName.hashCode() : 0);
    result = 31 * result + (virtualInstanceIds != null ? virtualInstanceIds.hashCode() : 0);
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    String newLine = System.getProperty("line.separator");
    sb.append("class MigratingGroup {" + newLine);
    sb.append("  virtualInstanceGroupName: ").append(virtualInstanceGroupName).append(newLine);
    sb.append("  virtualInstanceIds: ").append(virtualInstanceIds).append(newLine);
    sb.append("}" + newLine);
    return sb.toString();
  }
}

