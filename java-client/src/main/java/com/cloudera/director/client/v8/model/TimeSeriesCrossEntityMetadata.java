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


package com.cloudera.director.client.v8.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * TimeSeriesCrossEntityMetadata
 */

public class TimeSeriesCrossEntityMetadata {
  @SerializedName("maxEntityDisplayName")
  private String maxEntityDisplayName = null;
  @SerializedName("maxEntityName")
  private String maxEntityName = null;
  @SerializedName("minEntityDisplayName")
  private String minEntityDisplayName = null;
  @SerializedName("minEntityName")
  private String minEntityName = null;
  @SerializedName("numEntities")
  private Double numEntities = null;

  public TimeSeriesCrossEntityMetadata() {
    // Do nothing
  }

  private TimeSeriesCrossEntityMetadata(TimeSeriesCrossEntityMetadataBuilder builder) {
      this.maxEntityDisplayName = builder.maxEntityDisplayName;
      this.maxEntityName = builder.maxEntityName;
      this.minEntityDisplayName = builder.minEntityDisplayName;
      this.minEntityName = builder.minEntityName;
      this.numEntities = builder.numEntities;
    }

  public static TimeSeriesCrossEntityMetadataBuilder builder() {
    return new TimeSeriesCrossEntityMetadataBuilder();
  }

  public static class TimeSeriesCrossEntityMetadataBuilder {
      private String maxEntityDisplayName = null;
      private String maxEntityName = null;
      private String minEntityDisplayName = null;
      private String minEntityName = null;
      private Double numEntities = null;
  

    public TimeSeriesCrossEntityMetadataBuilder maxEntityDisplayName(String maxEntityDisplayName) {
      this.maxEntityDisplayName = maxEntityDisplayName;
      return this;
    }


    public TimeSeriesCrossEntityMetadataBuilder maxEntityName(String maxEntityName) {
      this.maxEntityName = maxEntityName;
      return this;
    }


    public TimeSeriesCrossEntityMetadataBuilder minEntityDisplayName(String minEntityDisplayName) {
      this.minEntityDisplayName = minEntityDisplayName;
      return this;
    }


    public TimeSeriesCrossEntityMetadataBuilder minEntityName(String minEntityName) {
      this.minEntityName = minEntityName;
      return this;
    }


    public TimeSeriesCrossEntityMetadataBuilder numEntities(Double numEntities) {
      this.numEntities = numEntities;
      return this;
    }


    public TimeSeriesCrossEntityMetadata build() {
      return new TimeSeriesCrossEntityMetadata(this);
    }
  }

  public TimeSeriesCrossEntityMetadataBuilder toBuilder() {
    return builder()
      .maxEntityDisplayName(maxEntityDisplayName)
            .maxEntityName(maxEntityName)
            .minEntityDisplayName(minEntityDisplayName)
            .minEntityName(minEntityName)
            .numEntities(numEntities)
      ;
  }

  public TimeSeriesCrossEntityMetadata maxEntityDisplayName(String maxEntityDisplayName) {
    this.maxEntityDisplayName = maxEntityDisplayName;
    return this;
  }

   /**
   * Display name for maximum entity
   * @return maxEntityDisplayName
  **/
  @ApiModelProperty(required = true, value = "Display name for maximum entity")
  public String getMaxEntityDisplayName() {
    return maxEntityDisplayName;
  }

  public void setMaxEntityDisplayName(String maxEntityDisplayName) {
    this.maxEntityDisplayName = maxEntityDisplayName;
  }

  public TimeSeriesCrossEntityMetadata maxEntityName(String maxEntityName) {
    this.maxEntityName = maxEntityName;
    return this;
  }

   /**
   * Name for maximum entity
   * @return maxEntityName
  **/
  @ApiModelProperty(value = "Name for maximum entity")
  public String getMaxEntityName() {
    return maxEntityName;
  }

  public void setMaxEntityName(String maxEntityName) {
    this.maxEntityName = maxEntityName;
  }

  public TimeSeriesCrossEntityMetadata minEntityDisplayName(String minEntityDisplayName) {
    this.minEntityDisplayName = minEntityDisplayName;
    return this;
  }

   /**
   * Display name for minimum entity
   * @return minEntityDisplayName
  **/
  @ApiModelProperty(required = true, value = "Display name for minimum entity")
  public String getMinEntityDisplayName() {
    return minEntityDisplayName;
  }

  public void setMinEntityDisplayName(String minEntityDisplayName) {
    this.minEntityDisplayName = minEntityDisplayName;
  }

  public TimeSeriesCrossEntityMetadata minEntityName(String minEntityName) {
    this.minEntityName = minEntityName;
    return this;
  }

   /**
   * Name for minimum entity
   * @return minEntityName
  **/
  @ApiModelProperty(value = "Name for minimum entity")
  public String getMinEntityName() {
    return minEntityName;
  }

  public void setMinEntityName(String minEntityName) {
    this.minEntityName = minEntityName;
  }

  public TimeSeriesCrossEntityMetadata numEntities(Double numEntities) {
    this.numEntities = numEntities;
    return this;
  }

   /**
   * Number of entities
   * @return numEntities
  **/
  @ApiModelProperty(required = true, value = "Number of entities")
  public Double getNumEntities() {
    return numEntities;
  }

  public void setNumEntities(Double numEntities) {
    this.numEntities = numEntities;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeSeriesCrossEntityMetadata timeSeriesCrossEntityMetadata = (TimeSeriesCrossEntityMetadata) o;
    return Objects.equals(this.maxEntityDisplayName, timeSeriesCrossEntityMetadata.maxEntityDisplayName) &&
        Objects.equals(this.maxEntityName, timeSeriesCrossEntityMetadata.maxEntityName) &&
        Objects.equals(this.minEntityDisplayName, timeSeriesCrossEntityMetadata.minEntityDisplayName) &&
        Objects.equals(this.minEntityName, timeSeriesCrossEntityMetadata.minEntityName) &&
        Objects.equals(this.numEntities, timeSeriesCrossEntityMetadata.numEntities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxEntityDisplayName, maxEntityName, minEntityDisplayName, minEntityName, numEntities);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeSeriesCrossEntityMetadata {\n");
    
    sb.append("    maxEntityDisplayName: ").append(toIndentedString(maxEntityDisplayName)).append("\n");
    sb.append("    maxEntityName: ").append(toIndentedString(maxEntityName)).append("\n");
    sb.append("    minEntityDisplayName: ").append(toIndentedString(minEntityDisplayName)).append("\n");
    sb.append("    minEntityName: ").append(toIndentedString(minEntityName)).append("\n");
    sb.append("    numEntities: ").append(toIndentedString(numEntities)).append("\n");
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

