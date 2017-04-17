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

package com.cloudera.director.client.v8.model;


public class TimeSeriesAggregateStatistics {
  /* Count */
  private Long count;
  /* Cross-entity metadata */
  private TimeSeriesCrossEntityMetadata crossEntityMetadata;
  /* Maximum value */
  private Double max;
  /* Timestamp for maximum value */
  private Long maxTime;
  /* Mean */
  private Double mean;
  /* Minimum value */
  private Double min;
  /* Timestamp for minimum value */
  private Long minTime;
  /* Sample time */
  private Long sampleTime;
  /* Sample value */
  private Double sampleValue;
  /* Standard deviation */
  private Double stdDev;
  public TimeSeriesAggregateStatistics() { }

  private TimeSeriesAggregateStatistics(Long count, TimeSeriesCrossEntityMetadata crossEntityMetadata, Double max, Long maxTime, Double mean, Double min, Long minTime, Long sampleTime, Double sampleValue, Double stdDev) {
    this.count = count;
    this.crossEntityMetadata = crossEntityMetadata;
    this.max = max;
    this.maxTime = maxTime;
    this.mean = mean;
    this.min = min;
    this.minTime = minTime;
    this.sampleTime = sampleTime;
    this.sampleValue = sampleValue;
    this.stdDev = stdDev;
  }

  private TimeSeriesAggregateStatistics(TimeSeriesAggregateStatisticsBuilder builder) {
    this.count = builder.count;
    this.crossEntityMetadata = builder.crossEntityMetadata;
    this.max = builder.max;
    this.maxTime = builder.maxTime;
    this.mean = builder.mean;
    this.min = builder.min;
    this.minTime = builder.minTime;
    this.sampleTime = builder.sampleTime;
    this.sampleValue = builder.sampleValue;
    this.stdDev = builder.stdDev;
  }

  public static TimeSeriesAggregateStatisticsBuilder builder() {
    return new TimeSeriesAggregateStatisticsBuilder();
  }

  public static class TimeSeriesAggregateStatisticsBuilder {
    private Long count = null;
    private TimeSeriesCrossEntityMetadata crossEntityMetadata = null;
    private Double max = null;
    private Long maxTime = null;
    private Double mean = null;
    private Double min = null;
    private Long minTime = null;
    private Long sampleTime = null;
    private Double sampleValue = null;
    private Double stdDev = null;

    public TimeSeriesAggregateStatisticsBuilder count(Long count) {
      this.count = count;
      return this;
    }

    public TimeSeriesAggregateStatisticsBuilder crossEntityMetadata(TimeSeriesCrossEntityMetadata crossEntityMetadata) {
      this.crossEntityMetadata = crossEntityMetadata;
      return this;
    }

    public TimeSeriesAggregateStatisticsBuilder max(Double max) {
      this.max = max;
      return this;
    }

    public TimeSeriesAggregateStatisticsBuilder maxTime(Long maxTime) {
      this.maxTime = maxTime;
      return this;
    }

    public TimeSeriesAggregateStatisticsBuilder mean(Double mean) {
      this.mean = mean;
      return this;
    }

    public TimeSeriesAggregateStatisticsBuilder min(Double min) {
      this.min = min;
      return this;
    }

    public TimeSeriesAggregateStatisticsBuilder minTime(Long minTime) {
      this.minTime = minTime;
      return this;
    }

    public TimeSeriesAggregateStatisticsBuilder sampleTime(Long sampleTime) {
      this.sampleTime = sampleTime;
      return this;
    }

    public TimeSeriesAggregateStatisticsBuilder sampleValue(Double sampleValue) {
      this.sampleValue = sampleValue;
      return this;
    }

    public TimeSeriesAggregateStatisticsBuilder stdDev(Double stdDev) {
      this.stdDev = stdDev;
      return this;
    }

    public TimeSeriesAggregateStatistics build() {
      return new TimeSeriesAggregateStatistics(this);
    }
  }

  public TimeSeriesAggregateStatisticsBuilder toBuilder() {
    return builder()
      .count(count)
      .crossEntityMetadata(crossEntityMetadata)
      .max(max)
      .maxTime(maxTime)
      .mean(mean)
      .min(min)
      .minTime(minTime)
      .sampleTime(sampleTime)
      .sampleValue(sampleValue)
      .stdDev(stdDev)
      ;
  }
  public Long getCount() {
    return count;
  }
  public void setCount(Long count) {
    this.count = count;
  }

  public TimeSeriesCrossEntityMetadata getCrossEntityMetadata() {
    return crossEntityMetadata;
  }
  public void setCrossEntityMetadata(TimeSeriesCrossEntityMetadata crossEntityMetadata) {
    this.crossEntityMetadata = crossEntityMetadata;
  }

  public Double getMax() {
    return max;
  }
  public void setMax(Double max) {
    this.max = max;
  }

  public Long getMaxTime() {
    return maxTime;
  }
  public void setMaxTime(Long maxTime) {
    this.maxTime = maxTime;
  }

  public Double getMean() {
    return mean;
  }
  public void setMean(Double mean) {
    this.mean = mean;
  }

  public Double getMin() {
    return min;
  }
  public void setMin(Double min) {
    this.min = min;
  }

  public Long getMinTime() {
    return minTime;
  }
  public void setMinTime(Long minTime) {
    this.minTime = minTime;
  }

  public Long getSampleTime() {
    return sampleTime;
  }
  public void setSampleTime(Long sampleTime) {
    this.sampleTime = sampleTime;
  }

  public Double getSampleValue() {
    return sampleValue;
  }
  public void setSampleValue(Double sampleValue) {
    this.sampleValue = sampleValue;
  }

  public Double getStdDev() {
    return stdDev;
  }
  public void setStdDev(Double stdDev) {
    this.stdDev = stdDev;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    TimeSeriesAggregateStatistics other = (TimeSeriesAggregateStatistics) o; // NOPMD

    if (count != null ?
        !count.equals(other.count) :
        other.count != null) return false;
    if (crossEntityMetadata != null ?
        !crossEntityMetadata.equals(other.crossEntityMetadata) :
        other.crossEntityMetadata != null) return false;
    if (max != null ?
        !max.equals(other.max) :
        other.max != null) return false;
    if (maxTime != null ?
        !maxTime.equals(other.maxTime) :
        other.maxTime != null) return false;
    if (mean != null ?
        !mean.equals(other.mean) :
        other.mean != null) return false;
    if (min != null ?
        !min.equals(other.min) :
        other.min != null) return false;
    if (minTime != null ?
        !minTime.equals(other.minTime) :
        other.minTime != null) return false;
    if (sampleTime != null ?
        !sampleTime.equals(other.sampleTime) :
        other.sampleTime != null) return false;
    if (sampleValue != null ?
        !sampleValue.equals(other.sampleValue) :
        other.sampleValue != null) return false;
    if (stdDev != null ?
        !stdDev.equals(other.stdDev) :
        other.stdDev != null) return false;
    return true;
  }

  @Override
  public int hashCode() {
    int result = 0;
    result = 31 * result + (count != null ? count.hashCode() : 0);
    result = 31 * result + (crossEntityMetadata != null ? crossEntityMetadata.hashCode() : 0);
    result = 31 * result + (max != null ? max.hashCode() : 0);
    result = 31 * result + (maxTime != null ? maxTime.hashCode() : 0);
    result = 31 * result + (mean != null ? mean.hashCode() : 0);
    result = 31 * result + (min != null ? min.hashCode() : 0);
    result = 31 * result + (minTime != null ? minTime.hashCode() : 0);
    result = 31 * result + (sampleTime != null ? sampleTime.hashCode() : 0);
    result = 31 * result + (sampleValue != null ? sampleValue.hashCode() : 0);
    result = 31 * result + (stdDev != null ? stdDev.hashCode() : 0);
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    String newLine = System.getProperty("line.separator");
    sb.append("class TimeSeriesAggregateStatistics {" + newLine);
    sb.append("  count: ").append(count).append(newLine);
    sb.append("  crossEntityMetadata: ").append(crossEntityMetadata).append(newLine);
    sb.append("  max: ").append(max).append(newLine);
    sb.append("  maxTime: ").append(maxTime).append(newLine);
    sb.append("  mean: ").append(mean).append(newLine);
    sb.append("  min: ").append(min).append(newLine);
    sb.append("  minTime: ").append(minTime).append(newLine);
    sb.append("  sampleTime: ").append(sampleTime).append(newLine);
    sb.append("  sampleValue: ").append(sampleValue).append(newLine);
    sb.append("  stdDev: ").append(stdDev).append(newLine);
    sb.append("}" + newLine);
    return sb.toString();
  }
}

