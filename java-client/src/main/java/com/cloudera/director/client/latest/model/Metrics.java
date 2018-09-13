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


package com.cloudera.director.client.latest.model;

import java.util.Objects;
import com.cloudera.director.client.latest.model.TimeSeriesResponseList;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Cluster metrics
 */
@ApiModel(description = "Cluster metrics")

public class Metrics {
  @SerializedName("clusterName")
  private String clusterName = null;
  @SerializedName("timeSeriesMetrics")
  private Map<String, TimeSeriesResponseList> timeSeriesMetrics = null;

  public Metrics() {
    // Do nothing
  }

  private Metrics(MetricsBuilder builder) {
      this.clusterName = builder.clusterName;
      this.timeSeriesMetrics = builder.timeSeriesMetrics;
    }

  public static MetricsBuilder builder() {
    return new MetricsBuilder();
  }

  public static class MetricsBuilder {
      private String clusterName = null;
      private Map<String, TimeSeriesResponseList> timeSeriesMetrics = new HashMap<String, TimeSeriesResponseList>();
  

    public MetricsBuilder clusterName(String clusterName) {
      this.clusterName = clusterName;
      return this;
    }


    public MetricsBuilder timeSeriesMetrics(Map<String, TimeSeriesResponseList> timeSeriesMetrics) {
      this.timeSeriesMetrics = timeSeriesMetrics;
      return this;
    }


    public Metrics build() {
      return new Metrics(this);
    }
  }

  public MetricsBuilder toBuilder() {
    return builder()
      .clusterName(clusterName)
            .timeSeriesMetrics(timeSeriesMetrics)
      ;
  }

  public Metrics clusterName(String clusterName) {
    this.clusterName = clusterName;
    return this;
  }

   /**
   * Cluster name
   * @return clusterName
  **/
  @ApiModelProperty(required = true, value = "Cluster name")
  public String getClusterName() {
    return clusterName;
  }

  public void setClusterName(String clusterName) {
    this.clusterName = clusterName;
  }

  public Metrics timeSeriesMetrics(Map<String, TimeSeriesResponseList> timeSeriesMetrics) {
    this.timeSeriesMetrics = timeSeriesMetrics;
    return this;
  }

  public Metrics putTimeSeriesMetricsItem(String key, TimeSeriesResponseList timeSeriesMetricsItem) {
    if (this.timeSeriesMetrics == null) {
      this.timeSeriesMetrics = new HashMap<String, TimeSeriesResponseList>();
    }
    this.timeSeriesMetrics.put(key, timeSeriesMetricsItem);
    return this;
  }

   /**
   * Named metrics tracked for this cluster
   * @return timeSeriesMetrics
  **/
  @ApiModelProperty(value = "Named metrics tracked for this cluster")
  public Map<String, TimeSeriesResponseList> getTimeSeriesMetrics() {
    return timeSeriesMetrics;
  }

  public void setTimeSeriesMetrics(Map<String, TimeSeriesResponseList> timeSeriesMetrics) {
    this.timeSeriesMetrics = timeSeriesMetrics;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Metrics metrics = (Metrics) o;
    return Objects.equals(this.clusterName, metrics.clusterName) &&
        Objects.equals(this.timeSeriesMetrics, metrics.timeSeriesMetrics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterName, timeSeriesMetrics);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Metrics {\n");
    
    sb.append("    clusterName: ").append(toIndentedString(clusterName)).append("\n");
    sb.append("    timeSeriesMetrics: ").append(toIndentedString(timeSeriesMetrics)).append("\n");
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

