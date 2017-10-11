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

package com.cloudera.director.client.v10.model;

import java.util.Set;

public class ClusterUpdateEventSummary {
  /* The number of instances added */
  private Integer instancesAdded;
  /* The number of instances removed */
  private Integer instancesRemoved;
  /* The number of instances replaced */
  private Integer instancesReplaced;
  /* The time when this event occurred */
  private Long occurredAt;
  /* Services that were added */
  private Set<String> servicesAdded;
  /* Services that were removed */
  private Set<String> servicesRemoved;
  public ClusterUpdateEventSummary() { }

  private ClusterUpdateEventSummary(Integer instancesAdded, Integer instancesRemoved, Integer instancesReplaced, Long occurredAt, Set<String> servicesAdded, Set<String> servicesRemoved) {
    this.instancesAdded = instancesAdded;
    this.instancesRemoved = instancesRemoved;
    this.instancesReplaced = instancesReplaced;
    this.occurredAt = occurredAt;
    this.servicesAdded = servicesAdded;
    this.servicesRemoved = servicesRemoved;
  }

  private ClusterUpdateEventSummary(ClusterUpdateEventSummaryBuilder builder) {
    this.instancesAdded = builder.instancesAdded;
    this.instancesRemoved = builder.instancesRemoved;
    this.instancesReplaced = builder.instancesReplaced;
    this.occurredAt = builder.occurredAt;
    this.servicesAdded = builder.servicesAdded;
    this.servicesRemoved = builder.servicesRemoved;
  }

  public static ClusterUpdateEventSummaryBuilder builder() {
    return new ClusterUpdateEventSummaryBuilder();
  }

  public static class ClusterUpdateEventSummaryBuilder {
    private Integer instancesAdded = null;
    private Integer instancesRemoved = null;
    private Integer instancesReplaced = null;
    private Long occurredAt = null;
    private Set<String> servicesAdded = null;
    private Set<String> servicesRemoved = null;

    public ClusterUpdateEventSummaryBuilder instancesAdded(Integer instancesAdded) {
      this.instancesAdded = instancesAdded;
      return this;
    }

    public ClusterUpdateEventSummaryBuilder instancesRemoved(Integer instancesRemoved) {
      this.instancesRemoved = instancesRemoved;
      return this;
    }

    public ClusterUpdateEventSummaryBuilder instancesReplaced(Integer instancesReplaced) {
      this.instancesReplaced = instancesReplaced;
      return this;
    }

    public ClusterUpdateEventSummaryBuilder occurredAt(Long occurredAt) {
      this.occurredAt = occurredAt;
      return this;
    }

    public ClusterUpdateEventSummaryBuilder servicesAdded(Set<String> servicesAdded) {
      this.servicesAdded = servicesAdded;
      return this;
    }

    public ClusterUpdateEventSummaryBuilder servicesRemoved(Set<String> servicesRemoved) {
      this.servicesRemoved = servicesRemoved;
      return this;
    }

    public ClusterUpdateEventSummary build() {
      return new ClusterUpdateEventSummary(this);
    }
  }

  public ClusterUpdateEventSummaryBuilder toBuilder() {
    return builder()
      .instancesAdded(instancesAdded)
      .instancesRemoved(instancesRemoved)
      .instancesReplaced(instancesReplaced)
      .occurredAt(occurredAt)
      .servicesAdded(servicesAdded)
      .servicesRemoved(servicesRemoved)
      ;
  }
  public Integer getInstancesAdded() {
    return instancesAdded;
  }
  public void setInstancesAdded(Integer instancesAdded) {
    this.instancesAdded = instancesAdded;
  }

  public Integer getInstancesRemoved() {
    return instancesRemoved;
  }
  public void setInstancesRemoved(Integer instancesRemoved) {
    this.instancesRemoved = instancesRemoved;
  }

  public Integer getInstancesReplaced() {
    return instancesReplaced;
  }
  public void setInstancesReplaced(Integer instancesReplaced) {
    this.instancesReplaced = instancesReplaced;
  }

  public Long getOccurredAt() {
    return occurredAt;
  }
  public void setOccurredAt(Long occurredAt) {
    this.occurredAt = occurredAt;
  }

  public Set<String> getServicesAdded() {
    return servicesAdded;
  }
  public void setServicesAdded(Set<String> servicesAdded) {
    this.servicesAdded = servicesAdded;
  }

  public Set<String> getServicesRemoved() {
    return servicesRemoved;
  }
  public void setServicesRemoved(Set<String> servicesRemoved) {
    this.servicesRemoved = servicesRemoved;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    ClusterUpdateEventSummary other = (ClusterUpdateEventSummary) o; // NOPMD

    if (instancesAdded != null ?
        !instancesAdded.equals(other.instancesAdded) :
        other.instancesAdded != null) return false;
    if (instancesRemoved != null ?
        !instancesRemoved.equals(other.instancesRemoved) :
        other.instancesRemoved != null) return false;
    if (instancesReplaced != null ?
        !instancesReplaced.equals(other.instancesReplaced) :
        other.instancesReplaced != null) return false;
    if (occurredAt != null ?
        !occurredAt.equals(other.occurredAt) :
        other.occurredAt != null) return false;
    if (servicesAdded != null ?
        !servicesAdded.equals(other.servicesAdded) :
        other.servicesAdded != null) return false;
    if (servicesRemoved != null ?
        !servicesRemoved.equals(other.servicesRemoved) :
        other.servicesRemoved != null) return false;
    return true;
  }

  @Override
  public int hashCode() {
    int result = 0;
    result = 31 * result + (instancesAdded != null ? instancesAdded.hashCode() : 0);
    result = 31 * result + (instancesRemoved != null ? instancesRemoved.hashCode() : 0);
    result = 31 * result + (instancesReplaced != null ? instancesReplaced.hashCode() : 0);
    result = 31 * result + (occurredAt != null ? occurredAt.hashCode() : 0);
    result = 31 * result + (servicesAdded != null ? servicesAdded.hashCode() : 0);
    result = 31 * result + (servicesRemoved != null ? servicesRemoved.hashCode() : 0);
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    String newLine = System.getProperty("line.separator");
    sb.append("class ClusterUpdateEventSummary {" + newLine);
    sb.append("  instancesAdded: ").append(instancesAdded).append(newLine);
    sb.append("  instancesRemoved: ").append(instancesRemoved).append(newLine);
    sb.append("  instancesReplaced: ").append(instancesReplaced).append(newLine);
    sb.append("  occurredAt: ").append(occurredAt).append(newLine);
    sb.append("  servicesAdded: ").append(servicesAdded).append(newLine);
    sb.append("  servicesRemoved: ").append(servicesRemoved).append(newLine);
    sb.append("}" + newLine);
    return sb.toString();
  }
}

