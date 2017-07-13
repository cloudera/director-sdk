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

package com.cloudera.director.client.v9.model;

import java.util.ArrayList;
import java.util.List;

public class TimeSeries {
  /* Time series data */
  private List<TimeSeriesData> data;
  /* Time series metadata */
  private TimeSeriesMetadata metadata;
  public TimeSeries() { }

  private TimeSeries(List<TimeSeriesData> data, TimeSeriesMetadata metadata) {
    this.data = data;
    this.metadata = metadata;
  }

  private TimeSeries(TimeSeriesBuilder builder) {
    this.data = builder.data;
    this.metadata = builder.metadata;
  }

  public static TimeSeriesBuilder builder() {
    return new TimeSeriesBuilder();
  }

  public static class TimeSeriesBuilder {
    private List<TimeSeriesData> data = new ArrayList<TimeSeriesData>();
    private TimeSeriesMetadata metadata = null;

    public TimeSeriesBuilder data(List<TimeSeriesData> data) {
      this.data = data;
      return this;
    }

    public TimeSeriesBuilder metadata(TimeSeriesMetadata metadata) {
      this.metadata = metadata;
      return this;
    }

    public TimeSeries build() {
      return new TimeSeries(this);
    }
  }

  public TimeSeriesBuilder toBuilder() {
    return builder()
      .data(data)
      .metadata(metadata)
      ;
  }
  public List<TimeSeriesData> getData() {
    return data;
  }
  public void setData(List<TimeSeriesData> data) {
    this.data = data;
  }

  public TimeSeriesMetadata getMetadata() {
    return metadata;
  }
  public void setMetadata(TimeSeriesMetadata metadata) {
    this.metadata = metadata;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    TimeSeries other = (TimeSeries) o; // NOPMD

    if (data != null ?
        !data.equals(other.data) :
        other.data != null) return false;
    if (metadata != null ?
        !metadata.equals(other.metadata) :
        other.metadata != null) return false;
    return true;
  }

  @Override
  public int hashCode() {
    int result = 0;
    result = 31 * result + (data != null ? data.hashCode() : 0);
    result = 31 * result + (metadata != null ? metadata.hashCode() : 0);
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    String newLine = System.getProperty("line.separator");
    sb.append("class TimeSeries {" + newLine);
    sb.append("  data: ").append(data).append(newLine);
    sb.append("  metadata: ").append(metadata).append(newLine);
    sb.append("}" + newLine);
    return sb.toString();
  }
}

