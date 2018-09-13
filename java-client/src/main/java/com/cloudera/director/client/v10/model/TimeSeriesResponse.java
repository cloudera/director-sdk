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


package com.cloudera.director.client.v10.model;

import java.util.Objects;
import com.cloudera.director.client.v10.model.TimeSeries;
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
 * TimeSeriesResponse
 */

public class TimeSeriesResponse {
  @SerializedName("timeSeries")
  private List<TimeSeries> timeSeries = null;
  @SerializedName("timeSeriesQuery")
  private String timeSeriesQuery = null;
  @SerializedName("warnings")
  private List<String> warnings = null;

  public TimeSeriesResponse() {
    // Do nothing
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

  public TimeSeriesResponse timeSeries(List<TimeSeries> timeSeries) {
    this.timeSeries = timeSeries;
    return this;
  }

  public TimeSeriesResponse addTimeSeriesItem(TimeSeries timeSeriesItem) {
    if (this.timeSeries == null) {
      this.timeSeries = new ArrayList<TimeSeries>();
    }
    this.timeSeries.add(timeSeriesItem);
    return this;
  }

   /**
   * Time series
   * @return timeSeries
  **/
  @ApiModelProperty(value = "Time series")
  public List<TimeSeries> getTimeSeries() {
    return timeSeries;
  }

  public void setTimeSeries(List<TimeSeries> timeSeries) {
    this.timeSeries = timeSeries;
  }

  public TimeSeriesResponse timeSeriesQuery(String timeSeriesQuery) {
    this.timeSeriesQuery = timeSeriesQuery;
    return this;
  }

   /**
   * Time series query
   * @return timeSeriesQuery
  **/
  @ApiModelProperty(required = true, value = "Time series query")
  public String getTimeSeriesQuery() {
    return timeSeriesQuery;
  }

  public void setTimeSeriesQuery(String timeSeriesQuery) {
    this.timeSeriesQuery = timeSeriesQuery;
  }

  public TimeSeriesResponse warnings(List<String> warnings) {
    this.warnings = warnings;
    return this;
  }

  public TimeSeriesResponse addWarningsItem(String warningsItem) {
    if (this.warnings == null) {
      this.warnings = new ArrayList<String>();
    }
    this.warnings.add(warningsItem);
    return this;
  }

   /**
   * Warnings
   * @return warnings
  **/
  @ApiModelProperty(value = "Warnings")
  public List<String> getWarnings() {
    return warnings;
  }

  public void setWarnings(List<String> warnings) {
    this.warnings = warnings;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeSeriesResponse timeSeriesResponse = (TimeSeriesResponse) o;
    return Objects.equals(this.timeSeries, timeSeriesResponse.timeSeries) &&
        Objects.equals(this.timeSeriesQuery, timeSeriesResponse.timeSeriesQuery) &&
        Objects.equals(this.warnings, timeSeriesResponse.warnings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timeSeries, timeSeriesQuery, warnings);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeSeriesResponse {\n");
    
    sb.append("    timeSeries: ").append(toIndentedString(timeSeries)).append("\n");
    sb.append("    timeSeriesQuery: ").append(toIndentedString(timeSeriesQuery)).append("\n");
    sb.append("    warnings: ").append(toIndentedString(warnings)).append("\n");
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

