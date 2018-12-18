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


package com.cloudera.director.client.d6_1.model;

import java.util.Objects;
import com.cloudera.director.client.d6_1.model.TimeSeriesCrossEntityMetadata;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * TimeSeriesAggregateStatistics
 */

public class TimeSeriesAggregateStatistics {
  @SerializedName("sampleTime")
  private Long sampleTime = null;
  @SerializedName("sampleValue")
  private Double sampleValue = null;
  @SerializedName("count")
  private Long count = null;
  @SerializedName("min")
  private Double min = null;
  @SerializedName("minTime")
  private Long minTime = null;
  @SerializedName("max")
  private Double max = null;
  @SerializedName("maxTime")
  private Long maxTime = null;
  @SerializedName("mean")
  private Double mean = null;
  @SerializedName("stdDev")
  private Double stdDev = null;
  @SerializedName("crossEntityMetadata")
  private TimeSeriesCrossEntityMetadata crossEntityMetadata = null;

  public TimeSeriesAggregateStatistics() {
    // Do nothing
  }

  private TimeSeriesAggregateStatistics(TimeSeriesAggregateStatisticsBuilder builder) {
      this.sampleTime = builder.sampleTime;
      this.sampleValue = builder.sampleValue;
      this.count = builder.count;
      this.min = builder.min;
      this.minTime = builder.minTime;
      this.max = builder.max;
      this.maxTime = builder.maxTime;
      this.mean = builder.mean;
      this.stdDev = builder.stdDev;
      this.crossEntityMetadata = builder.crossEntityMetadata;
    }

  public static TimeSeriesAggregateStatisticsBuilder builder() {
    return new TimeSeriesAggregateStatisticsBuilder();
  }

  public static class TimeSeriesAggregateStatisticsBuilder {
      private Long sampleTime = null;
      private Double sampleValue = null;
      private Long count = null;
      private Double min = null;
      private Long minTime = null;
      private Double max = null;
      private Long maxTime = null;
      private Double mean = null;
      private Double stdDev = null;
      private TimeSeriesCrossEntityMetadata crossEntityMetadata = null;
  

    public TimeSeriesAggregateStatisticsBuilder sampleTime(Long sampleTime) {
      this.sampleTime = sampleTime;
      return this;
    }


    public TimeSeriesAggregateStatisticsBuilder sampleValue(Double sampleValue) {
      this.sampleValue = sampleValue;
      return this;
    }


    public TimeSeriesAggregateStatisticsBuilder count(Long count) {
      this.count = count;
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


    public TimeSeriesAggregateStatisticsBuilder stdDev(Double stdDev) {
      this.stdDev = stdDev;
      return this;
    }


    public TimeSeriesAggregateStatisticsBuilder crossEntityMetadata(TimeSeriesCrossEntityMetadata crossEntityMetadata) {
      this.crossEntityMetadata = crossEntityMetadata;
      return this;
    }


    public TimeSeriesAggregateStatistics build() {
      return new TimeSeriesAggregateStatistics(this);
    }
  }

  public TimeSeriesAggregateStatisticsBuilder toBuilder() {
    return builder()
      .sampleTime(sampleTime)
            .sampleValue(sampleValue)
            .count(count)
            .min(min)
            .minTime(minTime)
            .max(max)
            .maxTime(maxTime)
            .mean(mean)
            .stdDev(stdDev)
            .crossEntityMetadata(crossEntityMetadata)
      ;
  }

  public TimeSeriesAggregateStatistics sampleTime(Long sampleTime) {
    this.sampleTime = sampleTime;
    return this;
  }

   /**
   * Sample time
   * @return sampleTime
  **/
  @ApiModelProperty(required = true, value = "Sample time")
  public Long getSampleTime() {
    return sampleTime;
  }

  public void setSampleTime(Long sampleTime) {
    this.sampleTime = sampleTime;
  }

  public TimeSeriesAggregateStatistics sampleValue(Double sampleValue) {
    this.sampleValue = sampleValue;
    return this;
  }

   /**
   * Sample value
   * @return sampleValue
  **/
  @ApiModelProperty(required = true, value = "Sample value")
  public Double getSampleValue() {
    return sampleValue;
  }

  public void setSampleValue(Double sampleValue) {
    this.sampleValue = sampleValue;
  }

  public TimeSeriesAggregateStatistics count(Long count) {
    this.count = count;
    return this;
  }

   /**
   * Count
   * @return count
  **/
  @ApiModelProperty(required = true, value = "Count")
  public Long getCount() {
    return count;
  }

  public void setCount(Long count) {
    this.count = count;
  }

  public TimeSeriesAggregateStatistics min(Double min) {
    this.min = min;
    return this;
  }

   /**
   * Minimum value
   * @return min
  **/
  @ApiModelProperty(required = true, value = "Minimum value")
  public Double getMin() {
    return min;
  }

  public void setMin(Double min) {
    this.min = min;
  }

  public TimeSeriesAggregateStatistics minTime(Long minTime) {
    this.minTime = minTime;
    return this;
  }

   /**
   * Timestamp for minimum value
   * @return minTime
  **/
  @ApiModelProperty(required = true, value = "Timestamp for minimum value")
  public Long getMinTime() {
    return minTime;
  }

  public void setMinTime(Long minTime) {
    this.minTime = minTime;
  }

  public TimeSeriesAggregateStatistics max(Double max) {
    this.max = max;
    return this;
  }

   /**
   * Maximum value
   * @return max
  **/
  @ApiModelProperty(required = true, value = "Maximum value")
  public Double getMax() {
    return max;
  }

  public void setMax(Double max) {
    this.max = max;
  }

  public TimeSeriesAggregateStatistics maxTime(Long maxTime) {
    this.maxTime = maxTime;
    return this;
  }

   /**
   * Timestamp for maximum value
   * @return maxTime
  **/
  @ApiModelProperty(required = true, value = "Timestamp for maximum value")
  public Long getMaxTime() {
    return maxTime;
  }

  public void setMaxTime(Long maxTime) {
    this.maxTime = maxTime;
  }

  public TimeSeriesAggregateStatistics mean(Double mean) {
    this.mean = mean;
    return this;
  }

   /**
   * Mean
   * @return mean
  **/
  @ApiModelProperty(required = true, value = "Mean")
  public Double getMean() {
    return mean;
  }

  public void setMean(Double mean) {
    this.mean = mean;
  }

  public TimeSeriesAggregateStatistics stdDev(Double stdDev) {
    this.stdDev = stdDev;
    return this;
  }

   /**
   * Standard deviation
   * @return stdDev
  **/
  @ApiModelProperty(required = true, value = "Standard deviation")
  public Double getStdDev() {
    return stdDev;
  }

  public void setStdDev(Double stdDev) {
    this.stdDev = stdDev;
  }

  public TimeSeriesAggregateStatistics crossEntityMetadata(TimeSeriesCrossEntityMetadata crossEntityMetadata) {
    this.crossEntityMetadata = crossEntityMetadata;
    return this;
  }

   /**
   * Cross-entity metadata
   * @return crossEntityMetadata
  **/
  @ApiModelProperty(value = "Cross-entity metadata")
  public TimeSeriesCrossEntityMetadata getCrossEntityMetadata() {
    return crossEntityMetadata;
  }

  public void setCrossEntityMetadata(TimeSeriesCrossEntityMetadata crossEntityMetadata) {
    this.crossEntityMetadata = crossEntityMetadata;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeSeriesAggregateStatistics timeSeriesAggregateStatistics = (TimeSeriesAggregateStatistics) o;
    return Objects.equals(this.sampleTime, timeSeriesAggregateStatistics.sampleTime) &&
        Objects.equals(this.sampleValue, timeSeriesAggregateStatistics.sampleValue) &&
        Objects.equals(this.count, timeSeriesAggregateStatistics.count) &&
        Objects.equals(this.min, timeSeriesAggregateStatistics.min) &&
        Objects.equals(this.minTime, timeSeriesAggregateStatistics.minTime) &&
        Objects.equals(this.max, timeSeriesAggregateStatistics.max) &&
        Objects.equals(this.maxTime, timeSeriesAggregateStatistics.maxTime) &&
        Objects.equals(this.mean, timeSeriesAggregateStatistics.mean) &&
        Objects.equals(this.stdDev, timeSeriesAggregateStatistics.stdDev) &&
        Objects.equals(this.crossEntityMetadata, timeSeriesAggregateStatistics.crossEntityMetadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sampleTime, sampleValue, count, min, minTime, max, maxTime, mean, stdDev, crossEntityMetadata);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeSeriesAggregateStatistics {\n");
    
    sb.append("    sampleTime: ").append(toIndentedString(sampleTime)).append("\n");
    sb.append("    sampleValue: ").append(toIndentedString(sampleValue)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    min: ").append(toIndentedString(min)).append("\n");
    sb.append("    minTime: ").append(toIndentedString(minTime)).append("\n");
    sb.append("    max: ").append(toIndentedString(max)).append("\n");
    sb.append("    maxTime: ").append(toIndentedString(maxTime)).append("\n");
    sb.append("    mean: ").append(toIndentedString(mean)).append("\n");
    sb.append("    stdDev: ").append(toIndentedString(stdDev)).append("\n");
    sb.append("    crossEntityMetadata: ").append(toIndentedString(crossEntityMetadata)).append("\n");
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

