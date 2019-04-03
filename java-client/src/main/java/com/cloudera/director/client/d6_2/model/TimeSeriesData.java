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


package com.cloudera.director.client.d6_2.model;

import java.util.Objects;
import com.cloudera.director.client.d6_2.model.TimeSeriesAggregateStatistics;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.joda.time.DateTime;

/**
 * TimeSeriesData
 */

public class TimeSeriesData {
  @SerializedName("timestamp")
  private DateTime timestamp = null;
  @SerializedName("value")
  private Double value = null;
  @SerializedName("type")
  private String type = null;
  @SerializedName("aggregateStatistics")
  private TimeSeriesAggregateStatistics aggregateStatistics = null;

  public TimeSeriesData() {
    // Do nothing
  }

  private TimeSeriesData(TimeSeriesDataBuilder builder) {
      this.timestamp = builder.timestamp;
      this.value = builder.value;
      this.type = builder.type;
      this.aggregateStatistics = builder.aggregateStatistics;
    }

  public static TimeSeriesDataBuilder builder() {
    return new TimeSeriesDataBuilder();
  }

  public static class TimeSeriesDataBuilder {
      private DateTime timestamp = null;
      private Double value = null;
      private String type = null;
      private TimeSeriesAggregateStatistics aggregateStatistics = null;
  

    public TimeSeriesDataBuilder timestamp(DateTime timestamp) {
      this.timestamp = timestamp;
      return this;
    }


    public TimeSeriesDataBuilder value(Double value) {
      this.value = value;
      return this;
    }


    public TimeSeriesDataBuilder type(String type) {
      this.type = type;
      return this;
    }


    public TimeSeriesDataBuilder aggregateStatistics(TimeSeriesAggregateStatistics aggregateStatistics) {
      this.aggregateStatistics = aggregateStatistics;
      return this;
    }


    public TimeSeriesData build() {
      return new TimeSeriesData(this);
    }
  }

  public TimeSeriesDataBuilder toBuilder() {
    return builder()
      .timestamp(timestamp)
            .value(value)
            .type(type)
            .aggregateStatistics(aggregateStatistics)
      ;
  }

  public TimeSeriesData timestamp(DateTime timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Timestamp
   * @return timestamp
  **/
  @ApiModelProperty(required = true, value = "Timestamp")
  public DateTime getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(DateTime timestamp) {
    this.timestamp = timestamp;
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeSeriesData timeSeriesData = (TimeSeriesData) o;
    return Objects.equals(this.timestamp, timeSeriesData.timestamp) &&
        Objects.equals(this.value, timeSeriesData.value) &&
        Objects.equals(this.type, timeSeriesData.type) &&
        Objects.equals(this.aggregateStatistics, timeSeriesData.aggregateStatistics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timestamp, value, type, aggregateStatistics);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeSeriesData {\n");
    
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    aggregateStatistics: ").append(toIndentedString(aggregateStatistics)).append("\n");
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

