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

package com.cloudera.director.client.v5.model;

import java.util.ArrayList;
import java.util.List;

public class TimeSeriesResponseList {
  /* Responses */
  private List<TimeSeriesResponse> responses;
  /* Rows */
  private List<TimeSeriesRow> rows;
  public TimeSeriesResponseList() { }

  private TimeSeriesResponseList(List<TimeSeriesResponse> responses, List<TimeSeriesRow> rows) {
    this.responses = responses;
    this.rows = rows;
  }

  private TimeSeriesResponseList(TimeSeriesResponseListBuilder builder) {
    this.responses = builder.responses;
    this.rows = builder.rows;
  }

  public static TimeSeriesResponseListBuilder builder() {
    return new TimeSeriesResponseListBuilder();
  }

  public static class TimeSeriesResponseListBuilder {
    private List<TimeSeriesResponse> responses = new ArrayList<TimeSeriesResponse>();
    private List<TimeSeriesRow> rows = new ArrayList<TimeSeriesRow>();

    public TimeSeriesResponseListBuilder responses(List<TimeSeriesResponse> responses) {
      this.responses = responses;
      return this;
    }

    public TimeSeriesResponseListBuilder rows(List<TimeSeriesRow> rows) {
      this.rows = rows;
      return this;
    }

    public TimeSeriesResponseList build() {
      return new TimeSeriesResponseList(this);
    }
  }

  public TimeSeriesResponseListBuilder toBuilder() {
    return builder()
      .responses(responses)
      .rows(rows)
      ;
  }
  public List<TimeSeriesResponse> getResponses() {
    return responses;
  }
  public void setResponses(List<TimeSeriesResponse> responses) {
    this.responses = responses;
  }

  public List<TimeSeriesRow> getRows() {
    return rows;
  }
  public void setRows(List<TimeSeriesRow> rows) {
    this.rows = rows;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    TimeSeriesResponseList other = (TimeSeriesResponseList) o; // NOPMD

    if (responses != null ?
        !responses.equals(other.responses) :
        other.responses != null) return false;
    if (rows != null ?
        !rows.equals(other.rows) :
        other.rows != null) return false;
    return true;
  }

  @Override
  public int hashCode() {
    int result = 0;
    result = 31 * result + (responses != null ? responses.hashCode() : 0);
    result = 31 * result + (rows != null ? rows.hashCode() : 0);
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    String newLine = System.getProperty("line.separator");
    sb.append("class TimeSeriesResponseList {" + newLine);
    sb.append("  responses: ").append(responses).append(newLine);
    sb.append("  rows: ").append(rows).append(newLine);
    sb.append("}" + newLine);
    return sb.toString();
  }
}

