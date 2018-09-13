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
import com.cloudera.director.client.v7.model.TimeSeriesAggregateStatistics;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * TimeSeriesData
 */

public class TimeSeriesData {
  @SerializedName("aggregateStatistics")
  private TimeSeriesAggregateStatistics aggregateStatistics = null;
  @SerializedName("timestamp")
  private Long timestamp = null;
  @SerializedName("type")
  private String type = null;
  @SerializedName("value")
  private Double value = null;

  public TimeSeriesData() {
    // Do nothing
  }

  private TimeSeriesData(TimeSeriesDataBuilder builder) {
      this.aggregateStatistics = builder.aggregateStatistics;
      this.timestamp = builder.timestamp;
      this.type = builder.type;
      this.value = builder.value;
    }

  public static TimeSeriesDataBuilder builder() {
    return new TimeSeriesDataBuilder();
  }

  public static class TimeSeriesDataBuilder {
      private TimeSeriesAggregateStatistics aggregateStatistics = null;
      private Long timestamp = null;
      private String type = null;
      private Double value = null;
  

    public TimeSeriesDataBuilder aggregateStatistics(TimeSeriesAggregateStatistics aggregateStatistics) {
      this.aggregateStatistics = aggregateStatistics;
      return this;
    }


    public TimeSeriesDataBuilder timestamp(Long timestamp) {
      this.timestamp = timestamp;
      return this;
    }


    public TimeSeriesDataBuilder type(String type) {
      this.type = type;
      return this;
    }


    public TimeSeriesDataBuilder value(Double value) {
      this.value = value;
      return this;
    }


    public TimeSeriesData build() {
      return new TimeSeriesData(this);
    }
  }

  public TimeSeriesDataBuilder toBuilder() {
    return builder()
      .aggregateStatistics(aggregateStatistics)
            .timestamp(timestamp)
            .type(type)
            .value(value)
      ;
  }

  public TimeSeriesData aggregateStatistics(TimeSeriesAggregateStatistics aggregateStatistics) {
    this.aggregateStatistics = aggregateStatistics;
    return this;
  }

   /**
   * Aggregate statistics
   * @return aggregateStatistics
  **/
  @ApiModelProperty(value = "Aggregate statistics")
  public TimeSeriesAggregateStatistics getAggregateStatistics() {
    return aggregateStatistics;
  }

  public void setAggregateStatistics(TimeSeriesAggregateStatistics aggregateStatistics) {
    this.aggregateStatistics = aggregateStatistics;
  }

  public TimeSeriesData timestamp(Long timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Timestamp
   * @return timestamp
  **/
  @ApiModelProperty(required = true, value = "Timestamp")
  public Long getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(Long timestamp) {
    this.timestamp = timestamp;
  }

  public TimeSeriesData type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Type
   * @return type
  **/
  @ApiModelProperty(required = true, value = "Type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public TimeSeriesData value(Double value) {
    this.value = value;
    return this;
  }

   /**
   * Value
   * @return value
  **/
  @ApiModelProperty(required = true, value = "Value")
  public Double getValue() {
    return value;
  }

  public void setValue(Double value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeSeriesData timeSeriesData = (TimeSeriesData) o;
    return Objects.equals(this.aggregateStatistics, timeSeriesData.aggregateStatistics) &&
        Objects.equals(this.timestamp, timeSeriesData.timestamp) &&
        Objects.equals(this.type, timeSeriesData.type) &&
        Objects.equals(this.value, timeSeriesData.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aggregateStatistics, timestamp, type, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeSeriesData {\n");
    
    sb.append("    aggregateStatistics: ").append(toIndentedString(aggregateStatistics)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

