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

import java.util.ArrayList;
import java.util.List;

public class TimeSeriesResponse {
  /* Time series */
  private List<TimeSeries> timeSeries;
  /* Time series query */
  private String timeSeriesQuery;
  /* Warnings */
  private List<String> warnings;
  public TimeSeriesResponse() { }

  private TimeSeriesResponse(List<TimeSeries> timeSeries, String timeSeriesQuery, List<String> warnings) {
    this.timeSeries = timeSeries;
    this.timeSeriesQuery = timeSeriesQuery;
    this.warnings = warnings;
  }

  private TimeSeriesResponse(TimeSeriesResponseBuilder builder) {
    this.timeSeries = builder.timeSeries;
    this.timeSeriesQuery = builder.timeSeriesQuery;
    this.warnings = builder.warnings;
  }

  public static TimeSeriesResponseBuilder builder() {
    return new TimeSeriesResponseBuilder();
  }

  public static class TimeSeriesResponseBuilder {
    private List<TimeSeries> timeSeries = new ArrayList<TimeSeries>();
    private String timeSeriesQuery = null;
    private List<String> warnings = new ArrayList<String>();

    public TimeSeriesResponseBuilder timeSeries(List<TimeSeries> timeSeries) {
      this.timeSeries = timeSeries;
      return this;
    }

    public TimeSeriesResponseBuilder timeSeriesQuery(String timeSeriesQuery) {
      this.timeSeriesQuery = timeSeriesQuery;
      return this;
    }

    public TimeSeriesResponseBuilder warnings(List<String> warnings) {
      this.warnings = warnings;
      return this;
    }

    public TimeSeriesResponse build() {
      return new TimeSeriesResponse(this);
    }
  }

  public TimeSeriesResponseBuilder toBuilder() {
    return builder()
      .timeSeries(timeSeries)
      .timeSeriesQuery(timeSeriesQuery)
      .warnings(warnings)
      ;
  }
  public List<TimeSeries> getTimeSeries() {
    return timeSeries;
  }
  public void setTimeSeries(List<TimeSeries> timeSeries) {
    this.timeSeries = timeSeries;
  }

  public String getTimeSeriesQuery() {
    return timeSeriesQuery;
  }
  public void setTimeSeriesQuery(String timeSeriesQuery) {
    this.timeSeriesQuery = timeSeriesQuery;
  }

  public List<String> getWarnings() {
    return warnings;
  }
  public void setWarnings(List<String> warnings) {
    this.warnings = warnings;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    TimeSeriesResponse other = (TimeSeriesResponse) o; // NOPMD

    if (timeSeries != null ?
        !timeSeries.equals(other.timeSeries) :
        other.timeSeries != null) return false;
    if (timeSeriesQuery != null ?
        !timeSeriesQuery.equals(other.timeSeriesQuery) :
        other.timeSeriesQuery != null) return false;
    if (warnings != null ?
        !warnings.equals(other.warnings) :
        other.warnings != null) return false;
    return true;
  }

  @Override
  public int hashCode() {
    int result = 0;
    result = 31 * result + (timeSeries != null ? timeSeries.hashCode() : 0);
    result = 31 * result + (timeSeriesQuery != null ? timeSeriesQuery.hashCode() : 0);
    result = 31 * result + (warnings != null ? warnings.hashCode() : 0);
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    String newLine = System.getProperty("line.separator");
    sb.append("class TimeSeriesResponse {" + newLine);
    sb.append("  timeSeries: ").append(timeSeries).append(newLine);
    sb.append("  timeSeriesQuery: ").append(timeSeriesQuery).append(newLine);
    sb.append("  warnings: ").append(warnings).append(newLine);
    sb.append("}" + newLine);
    return sb.toString();
  }
}

