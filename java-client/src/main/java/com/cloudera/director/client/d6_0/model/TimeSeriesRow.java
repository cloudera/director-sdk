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
 * TimeSeriesRow
 */

public class TimeSeriesRow {
  @SerializedName("entityName")
  private String entityName = null;
  @SerializedName("metricName")
  private String metricName = null;
  @SerializedName("timestamp")
  private DateTime timestamp = null;
  @SerializedName("value")
  private Double value = null;

  public TimeSeriesRow() {
    // Do nothing
  }

  private TimeSeriesRow(TimeSeriesRowBuilder builder) {
      this.entityName = builder.entityName;
      this.metricName = builder.metricName;
      this.timestamp = builder.timestamp;
      this.value = builder.value;
    }

  public static TimeSeriesRowBuilder builder() {
    return new TimeSeriesRowBuilder();
  }

  public static class TimeSeriesRowBuilder {
      private String entityName = null;
      private String metricName = null;
      private DateTime timestamp = null;
      private Double value = null;
  

    public TimeSeriesRowBuilder entityName(String entityName) {
      this.entityName = entityName;
      return this;
    }


    public TimeSeriesRowBuilder metricName(String metricName) {
      this.metricName = metricName;
      return this;
    }


    public TimeSeriesRowBuilder timestamp(DateTime timestamp) {
      this.timestamp = timestamp;
      return this;
    }


    public TimeSeriesRowBuilder value(Double value) {
      this.value = value;
      return this;
    }


    public TimeSeriesRow build() {
      return new TimeSeriesRow(this);
    }
  }

  public TimeSeriesRowBuilder toBuilder() {
    return builder()
      .entityName(entityName)
            .metricName(metricName)
            .timestamp(timestamp)
            .value(value)
      ;
  }

  public TimeSeriesRow entityName(String entityName) {
    this.entityName = entityName;
    return this;
  }

   /**
   * Entity name
   * @return entityName
  **/
  @ApiModelProperty(required = true, value = "Entity name")
  public String getEntityName() {
    return entityName;
  }

  public void setEntityName(String entityName) {
    this.entityName = entityName;
  }

  public TimeSeriesRow metricName(String metricName) {
    this.metricName = metricName;
    return this;
  }

   /**
   * Metric name
   * @return metricName
  **/
  @ApiModelProperty(required = true, value = "Metric name")
  public String getMetricName() {
    return metricName;
  }

  public void setMetricName(String metricName) {
    this.metricName = metricName;
  }

  public TimeSeriesRow timestamp(DateTime timestamp) {
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

  public TimeSeriesRow value(Double value) {
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
    TimeSeriesRow timeSeriesRow = (TimeSeriesRow) o;
    return Objects.equals(this.entityName, timeSeriesRow.entityName) &&
        Objects.equals(this.metricName, timeSeriesRow.metricName) &&
        Objects.equals(this.timestamp, timeSeriesRow.timestamp) &&
        Objects.equals(this.value, timeSeriesRow.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entityName, metricName, timestamp, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeSeriesRow {\n");
    
    sb.append("    entityName: ").append(toIndentedString(entityName)).append("\n");
    sb.append("    metricName: ").append(toIndentedString(metricName)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
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

