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

import java.util.HashMap;
import java.util.Map;

public class Metrics {
  /* Cluster name */
  private String clusterName;
  /* Metrics tracked for this cluster */
  private Map<String, TimeSeriesResponseList> timeSeriesMetrics;
  public Metrics() { }

  private Metrics(String clusterName, Map<String, TimeSeriesResponseList> timeSeriesMetrics) {
    this.clusterName = clusterName;
    this.timeSeriesMetrics = timeSeriesMetrics;
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
  public String getClusterName() {
    return clusterName;
  }
  public void setClusterName(String clusterName) {
    this.clusterName = clusterName;
  }

  public Map<String, TimeSeriesResponseList> getTimeSeriesMetrics() {
    return timeSeriesMetrics;
  }
  public void setTimeSeriesMetrics(Map<String, TimeSeriesResponseList> timeSeriesMetrics) {
    this.timeSeriesMetrics = timeSeriesMetrics;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Metrics other = (Metrics) o; // NOPMD

    if (clusterName != null ?
        !clusterName.equals(other.clusterName) :
        other.clusterName != null) return false;
    if (timeSeriesMetrics != null ?
        !timeSeriesMetrics.equals(other.timeSeriesMetrics) :
        other.timeSeriesMetrics != null) return false;
    return true;
  }

  @Override
  public int hashCode() {
    int result = 0;
    result = 31 * result + (clusterName != null ? clusterName.hashCode() : 0);
    result = 31 * result + (timeSeriesMetrics != null ? timeSeriesMetrics.hashCode() : 0);
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    String newLine = System.getProperty("line.separator");
    sb.append("class Metrics {" + newLine);
    sb.append("  clusterName: ").append(clusterName).append(newLine);
    sb.append("  timeSeriesMetrics: ").append(timeSeriesMetrics).append(newLine);
    sb.append("}" + newLine);
    return sb.toString();
  }
}

