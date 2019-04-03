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
import com.cloudera.director.client.d6_2.model.TimeSeriesResponse;
import com.cloudera.director.client.d6_2.model.TimeSeriesRow;
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
 * TimeSeriesResponseList
 */

public class TimeSeriesResponseList {
  @SerializedName("responses")
  private List<TimeSeriesResponse> responses = null;
  @SerializedName("rows")
  private List<TimeSeriesRow> rows = null;

  public TimeSeriesResponseList() {
    // Do nothing
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

  public TimeSeriesResponseList responses(List<TimeSeriesResponse> responses) {
    this.responses = responses;
    return this;
  }

  public TimeSeriesResponseList addResponsesItem(TimeSeriesResponse responsesItem) {
    if (this.responses == null) {
      this.responses = new ArrayList<TimeSeriesResponse>();
    }
    this.responses.add(responsesItem);
    return this;
  }

   /**
   * Responses
   * @return responses
  **/
  @ApiModelProperty(value = "Responses")
  public List<TimeSeriesResponse> getResponses() {
    return responses;
  }

  public void setResponses(List<TimeSeriesResponse> responses) {
    this.responses = responses;
  }

  public TimeSeriesResponseList rows(List<TimeSeriesRow> rows) {
    this.rows = rows;
    return this;
  }

  public TimeSeriesResponseList addRowsItem(TimeSeriesRow rowsItem) {
    if (this.rows == null) {
      this.rows = new ArrayList<TimeSeriesRow>();
    }
    this.rows.add(rowsItem);
    return this;
  }

   /**
   * Rows
   * @return rows
  **/
  @ApiModelProperty(value = "Rows")
  public List<TimeSeriesRow> getRows() {
    return rows;
  }

  public void setRows(List<TimeSeriesRow> rows) {
    this.rows = rows;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeSeriesResponseList timeSeriesResponseList = (TimeSeriesResponseList) o;
    return Objects.equals(this.responses, timeSeriesResponseList.responses) &&
        Objects.equals(this.rows, timeSeriesResponseList.rows);
  }

  @Override
  public int hashCode() {
    return Objects.hash(responses, rows);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeSeriesResponseList {\n");
    
    sb.append("    responses: ").append(toIndentedString(responses)).append("\n");
    sb.append("    rows: ").append(toIndentedString(rows)).append("\n");
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

