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

package com.cloudera.director.client.v11.model;


public class TimeSeriesData {
  /* Aggregate statistics */
  private TimeSeriesAggregateStatistics aggregateStatistics;
  /* Timestamp */
  private Long timestamp;
  /* Type */
  private String type;
  /* Value */
  private Double value;
  public TimeSeriesData() { }

  private TimeSeriesData(TimeSeriesAggregateStatistics aggregateStatistics, Long timestamp, String type, Double value) {
    this.aggregateStatistics = aggregateStatistics;
    this.timestamp = timestamp;
    this.type = type;
    this.value = value;
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
  public TimeSeriesAggregateStatistics getAggregateStatistics() {
    return aggregateStatistics;
  }
  public void setAggregateStatistics(TimeSeriesAggregateStatistics aggregateStatistics) {
    this.aggregateStatistics = aggregateStatistics;
  }

  public Long getTimestamp() {
    return timestamp;
  }
  public void setTimestamp(Long timestamp) {
    this.timestamp = timestamp;
  }

  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
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

    TimeSeriesData other = (TimeSeriesData) o; // NOPMD

    if (aggregateStatistics != null ?
        !aggregateStatistics.equals(other.aggregateStatistics) :
        other.aggregateStatistics != null) return false;
    if (timestamp != null ?
        !timestamp.equals(other.timestamp) :
        other.timestamp != null) return false;
    if (type != null ?
        !type.equals(other.type) :
        other.type != null) return false;
    if (value != null ?
        !value.equals(other.value) :
        other.value != null) return false;
    return true;
  }

  @Override
  public int hashCode() {
    int result = 0;
    result = 31 * result + (aggregateStatistics != null ? aggregateStatistics.hashCode() : 0);
    result = 31 * result + (timestamp != null ? timestamp.hashCode() : 0);
    result = 31 * result + (type != null ? type.hashCode() : 0);
    result = 31 * result + (value != null ? value.hashCode() : 0);
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    String newLine = System.getProperty("line.separator");
    sb.append("class TimeSeriesData {" + newLine);
    sb.append("  aggregateStatistics: ").append(aggregateStatistics).append(newLine);
    sb.append("  timestamp: ").append(timestamp).append(newLine);
    sb.append("  type: ").append(type).append(newLine);
    sb.append("  value: ").append(value).append(newLine);
    sb.append("}" + newLine);
    return sb.toString();
  }
}

