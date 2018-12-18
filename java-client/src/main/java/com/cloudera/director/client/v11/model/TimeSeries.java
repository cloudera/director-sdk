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


package com.cloudera.director.client.v11.model;

import java.util.Objects;
import com.cloudera.director.client.v11.model.TimeSeriesData;
import com.cloudera.director.client.v11.model.TimeSeriesMetadata;
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
 * TimeSeries
 */

public class TimeSeries {
  @SerializedName("metadata")
  private TimeSeriesMetadata metadata = null;
  @SerializedName("data")
  private List<TimeSeriesData> data = null;

  public TimeSeries() {
    // Do nothing
  }

  private TimeSeries(TimeSeriesBuilder builder) {
      this.metadata = builder.metadata;
      this.data = builder.data;
    }

  public static TimeSeriesBuilder builder() {
    return new TimeSeriesBuilder();
  }

  public static class TimeSeriesBuilder {
      private TimeSeriesMetadata metadata = null;
      private List<TimeSeriesData> data = new ArrayList<TimeSeriesData>();
  

    public TimeSeriesBuilder metadata(TimeSeriesMetadata metadata) {
      this.metadata = metadata;
      return this;
    }


    public TimeSeriesBuilder data(List<TimeSeriesData> data) {
      this.data = data;
      return this;
    }


    public TimeSeries build() {
      return new TimeSeries(this);
    }
  }

  public TimeSeriesBuilder toBuilder() {
    return builder()
      .metadata(metadata)
            .data(data)
      ;
  }

  public TimeSeries metadata(TimeSeriesMetadata metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Time series metadata
   * @return metadata
  **/
  @ApiModelProperty(required = true, value = "Time series metadata")
  public TimeSeriesMetadata getMetadata() {
    return metadata;
  }

  public void setMetadata(TimeSeriesMetadata metadata) {
    this.metadata = metadata;
  }

  public TimeSeries data(List<TimeSeriesData> data) {
    this.data = data;
    return this;
  }

  public TimeSeries addDataItem(TimeSeriesData dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<TimeSeriesData>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * Time series data
   * @return data
  **/
  @ApiModelProperty(value = "Time series data")
  public List<TimeSeriesData> getData() {
    return data;
  }

  public void setData(List<TimeSeriesData> data) {
    this.data = data;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeSeries timeSeries = (TimeSeries) o;
    return Objects.equals(this.metadata, timeSeries.metadata) &&
        Objects.equals(this.data, timeSeries.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metadata, data);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeSeries {\n");
    
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

