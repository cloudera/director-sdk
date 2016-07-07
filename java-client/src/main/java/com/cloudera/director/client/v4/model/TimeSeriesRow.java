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

package com.cloudera.director.client.v4.model;


public class TimeSeriesRow {
  /* Entity name */
  private String entityName;
  /* Metric name */
  private String metricName;
  /* Timestamp */
  private Long timestamp;
  /* Value */
  private Double value;
  public TimeSeriesRow() { }

  private TimeSeriesRow(String entityName, String metricName, Long timestamp, Double value) {
    this.entityName = entityName;
    this.metricName = metricName;
    this.timestamp = timestamp;
    this.value = value;
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
    private Long timestamp = null;
    private Double value = null;

    public TimeSeriesRowBuilder entityName(String entityName) {
      this.entityName = entityName;
      return this;
    }

    public TimeSeriesRowBuilder metricName(String metricName) {
      this.metricName = metricName;
      return this;
    }

    public TimeSeriesRowBuilder timestamp(Long timestamp) {
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
  public String getEntityName() {
    return entityName;
  }
  public void setEntityName(String entityName) {
    this.entityName = entityName;
  }

  public String getMetricName() {
    return metricName;
  }
  public void setMetricName(String metricName) {
    this.metricName = metricName;
  }

  public Long getTimestamp() {
    return timestamp;
  }
  public void setTimestamp(Long timestamp) {
    this.timestamp = timestamp;
  }

  public Double getValue() {
    return value;
  }
  public void setValue(Double value) {
    this.value = value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    TimeSeriesRow other = (TimeSeriesRow) o; // NOPMD

    if (entityName != null ?
        !entityName.equals(other.entityName) :
        other.entityName != null) return false;
    if (metricName != null ?
        !metricName.equals(other.metricName) :
        other.metricName != null) return false;
    if (timestamp != null ?
        !timestamp.equals(other.timestamp) :
        other.timestamp != null) return false;
    if (value != null ?
        !value.equals(other.value) :
        other.value != null) return false;
    return true;
  }

  @Override
  public int hashCode() {
    int result = 0;
    result = 31 * result + (entityName != null ? entityName.hashCode() : 0);
    result = 31 * result + (metricName != null ? metricName.hashCode() : 0);
    result = 31 * result + (timestamp != null ? timestamp.hashCode() : 0);
    result = 31 * result + (value != null ? value.hashCode() : 0);
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    String newLine = System.getProperty("line.separator");
    sb.append("class TimeSeriesRow {" + newLine);
    sb.append("  entityName: ").append(entityName).append(newLine);
    sb.append("  metricName: ").append(metricName).append(newLine);
    sb.append("  timestamp: ").append(timestamp).append(newLine);
    sb.append("  value: ").append(value).append(newLine);
    sb.append("}" + newLine);
    return sb.toString();
  }
}

