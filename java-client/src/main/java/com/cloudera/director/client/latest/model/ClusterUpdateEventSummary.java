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
 * Description of an update event for a cluster
 */
@ApiModel(description = "Description of an update event for a cluster")

public class ClusterUpdateEventSummary {
  @SerializedName("instancesAdded")
  private Integer instancesAdded = null;
  @SerializedName("instancesRemoved")
  private Integer instancesRemoved = null;
  @SerializedName("instancesReplaced")
  private Integer instancesReplaced = null;
  @SerializedName("occurredAt")
  private Long occurredAt = null;
  @SerializedName("servicesAdded")
  private List<String> servicesAdded = new ArrayList<String>();
  @SerializedName("servicesRemoved")
  private List<String> servicesRemoved = new ArrayList<String>();

  public ClusterUpdateEventSummary() {
    // Do nothing
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
      private List<String> servicesAdded = new ArrayList<String>();
      private List<String> servicesRemoved = new ArrayList<String>();
  

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


    public ClusterUpdateEventSummaryBuilder servicesAdded(List<String> servicesAdded) {
      this.servicesAdded = servicesAdded;
      return this;
    }


    public ClusterUpdateEventSummaryBuilder servicesRemoved(List<String> servicesRemoved) {
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

  public ClusterUpdateEventSummary instancesAdded(Integer instancesAdded) {
    this.instancesAdded = instancesAdded;
    return this;
  }

   /**
   * The number of instances added
   * @return instancesAdded
  **/
  @ApiModelProperty(required = true, value = "The number of instances added")
  public Integer getInstancesAdded() {
    return instancesAdded;
  }

  public void setInstancesAdded(Integer instancesAdded) {
    this.instancesAdded = instancesAdded;
  }

  public ClusterUpdateEventSummary instancesRemoved(Integer instancesRemoved) {
    this.instancesRemoved = instancesRemoved;
    return this;
  }

   /**
   * The number of instances removed
   * @return instancesRemoved
  **/
  @ApiModelProperty(required = true, value = "The number of instances removed")
  public Integer getInstancesRemoved() {
    return instancesRemoved;
  }

  public void setInstancesRemoved(Integer instancesRemoved) {
    this.instancesRemoved = instancesRemoved;
  }

  public ClusterUpdateEventSummary instancesReplaced(Integer instancesReplaced) {
    this.instancesReplaced = instancesReplaced;
    return this;
  }

   /**
   * The number of instances replaced
   * @return instancesReplaced
  **/
  @ApiModelProperty(required = true, value = "The number of instances replaced")
  public Integer getInstancesReplaced() {
    return instancesReplaced;
  }

  public void setInstancesReplaced(Integer instancesReplaced) {
    this.instancesReplaced = instancesReplaced;
  }

  public ClusterUpdateEventSummary occurredAt(Long occurredAt) {
    this.occurredAt = occurredAt;
    return this;
  }

   /**
   * The time when this event occurred
   * @return occurredAt
  **/
  @ApiModelProperty(required = true, value = "The time when this event occurred")
  public Long getOccurredAt() {
    return occurredAt;
  }

  public void setOccurredAt(Long occurredAt) {
    this.occurredAt = occurredAt;
  }

  public ClusterUpdateEventSummary servicesAdded(List<String> servicesAdded) {
    this.servicesAdded = servicesAdded;
    return this;
  }

  public ClusterUpdateEventSummary addServicesAddedItem(String servicesAddedItem) {
    this.servicesAdded.add(servicesAddedItem);
    return this;
  }

   /**
   * Services that were added
   * @return servicesAdded
  **/
  @ApiModelProperty(required = true, value = "Services that were added")
  public List<String> getServicesAdded() {
    return servicesAdded;
  }

  public void setServicesAdded(List<String> servicesAdded) {
    this.servicesAdded = servicesAdded;
  }

  public ClusterUpdateEventSummary servicesRemoved(List<String> servicesRemoved) {
    this.servicesRemoved = servicesRemoved;
    return this;
  }

  public ClusterUpdateEventSummary addServicesRemovedItem(String servicesRemovedItem) {
    this.servicesRemoved.add(servicesRemovedItem);
    return this;
  }

   /**
   * Services that were removed
   * @return servicesRemoved
  **/
  @ApiModelProperty(required = true, value = "Services that were removed")
  public List<String> getServicesRemoved() {
    return servicesRemoved;
  }

  public void setServicesRemoved(List<String> servicesRemoved) {
    this.servicesRemoved = servicesRemoved;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClusterUpdateEventSummary clusterUpdateEventSummary = (ClusterUpdateEventSummary) o;
    return Objects.equals(this.instancesAdded, clusterUpdateEventSummary.instancesAdded) &&
        Objects.equals(this.instancesRemoved, clusterUpdateEventSummary.instancesRemoved) &&
        Objects.equals(this.instancesReplaced, clusterUpdateEventSummary.instancesReplaced) &&
        Objects.equals(this.occurredAt, clusterUpdateEventSummary.occurredAt) &&
        Objects.equals(this.servicesAdded, clusterUpdateEventSummary.servicesAdded) &&
        Objects.equals(this.servicesRemoved, clusterUpdateEventSummary.servicesRemoved);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instancesAdded, instancesRemoved, instancesReplaced, occurredAt, servicesAdded, servicesRemoved);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClusterUpdateEventSummary {\n");
    
    sb.append("    instancesAdded: ").append(toIndentedString(instancesAdded)).append("\n");
    sb.append("    instancesRemoved: ").append(toIndentedString(instancesRemoved)).append("\n");
    sb.append("    instancesReplaced: ").append(toIndentedString(instancesReplaced)).append("\n");
    sb.append("    occurredAt: ").append(toIndentedString(occurredAt)).append("\n");
    sb.append("    servicesAdded: ").append(toIndentedString(servicesAdded)).append("\n");
    sb.append("    servicesRemoved: ").append(toIndentedString(servicesRemoved)).append("\n");
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

