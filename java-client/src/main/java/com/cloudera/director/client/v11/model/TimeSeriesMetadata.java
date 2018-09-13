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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * TimeSeriesMetadata
 */

public class TimeSeriesMetadata {
  @SerializedName("alias")
  private String alias = null;
  @SerializedName("attributes")
  private Map<String, String> attributes = null;
  @SerializedName("endTime")
  private Long endTime = null;
  @SerializedName("entityName")
  private String entityName = null;
  @SerializedName("expression")
  private String expression = null;
  @SerializedName("metricCollectionFrequencyMs")
  private Long metricCollectionFrequencyMs = null;
  @SerializedName("metricName")
  private String metricName = null;
  @SerializedName("rollupUsed")
  private String rollupUsed = null;
  @SerializedName("startTime")
  private Long startTime = null;
  @SerializedName("unitDenominators")
  private List<String> unitDenominators = null;
  @SerializedName("unitNumerators")
  private List<String> unitNumerators = null;

  public TimeSeriesMetadata() {
    // Do nothing
  }

  private TimeSeriesMetadata(TimeSeriesMetadataBuilder builder) {
      this.alias = builder.alias;
      this.attributes = builder.attributes;
      this.endTime = builder.endTime;
      this.entityName = builder.entityName;
      this.expression = builder.expression;
      this.metricCollectionFrequencyMs = builder.metricCollectionFrequencyMs;
      this.metricName = builder.metricName;
      this.rollupUsed = builder.rollupUsed;
      this.startTime = builder.startTime;
      this.unitDenominators = builder.unitDenominators;
      this.unitNumerators = builder.unitNumerators;
    }

  public static TimeSeriesMetadataBuilder builder() {
    return new TimeSeriesMetadataBuilder();
  }

  public static class TimeSeriesMetadataBuilder {
      private String alias = null;
      private Map<String, String> attributes = new HashMap<String, String>();
      private Long endTime = null;
      private String entityName = null;
      private String expression = null;
      private Long metricCollectionFrequencyMs = null;
      private String metricName = null;
      private String rollupUsed = null;
      private Long startTime = null;
      private List<String> unitDenominators = new ArrayList<String>();
      private List<String> unitNumerators = new ArrayList<String>();
  

    public TimeSeriesMetadataBuilder alias(String alias) {
      this.alias = alias;
      return this;
    }


    public TimeSeriesMetadataBuilder attributes(Map<String, String> attributes) {
      this.attributes = attributes;
      return this;
    }


    public TimeSeriesMetadataBuilder endTime(Long endTime) {
      this.endTime = endTime;
      return this;
    }


    public TimeSeriesMetadataBuilder entityName(String entityName) {
      this.entityName = entityName;
      return this;
    }


    public TimeSeriesMetadataBuilder expression(String expression) {
      this.expression = expression;
      return this;
    }


    public TimeSeriesMetadataBuilder metricCollectionFrequencyMs(Long metricCollectionFrequencyMs) {
      this.metricCollectionFrequencyMs = metricCollectionFrequencyMs;
      return this;
    }


    public TimeSeriesMetadataBuilder metricName(String metricName) {
      this.metricName = metricName;
      return this;
    }


    public TimeSeriesMetadataBuilder rollupUsed(String rollupUsed) {
      this.rollupUsed = rollupUsed;
      return this;
    }


    public TimeSeriesMetadataBuilder startTime(Long startTime) {
      this.startTime = startTime;
      return this;
    }


    public TimeSeriesMetadataBuilder unitDenominators(List<String> unitDenominators) {
      this.unitDenominators = unitDenominators;
      return this;
    }


    public TimeSeriesMetadataBuilder unitNumerators(List<String> unitNumerators) {
      this.unitNumerators = unitNumerators;
      return this;
    }


    public TimeSeriesMetadata build() {
      return new TimeSeriesMetadata(this);
    }
  }

  public TimeSeriesMetadataBuilder toBuilder() {
    return builder()
      .alias(alias)
            .attributes(attributes)
            .endTime(endTime)
            .entityName(entityName)
            .expression(expression)
            .metricCollectionFrequencyMs(metricCollectionFrequencyMs)
            .metricName(metricName)
            .rollupUsed(rollupUsed)
            .startTime(startTime)
            .unitDenominators(unitDenominators)
            .unitNumerators(unitNumerators)
      ;
  }

  public TimeSeriesMetadata alias(String alias) {
    this.alias = alias;
    return this;
  }

   /**
   * Alias
   * @return alias
  **/
  @ApiModelProperty(value = "Alias")
  public String getAlias() {
    return alias;
  }

  public void setAlias(String alias) {
    this.alias = alias;
  }

  public TimeSeriesMetadata attributes(Map<String, String> attributes) {
    this.attributes = attributes;
    return this;
  }

  public TimeSeriesMetadata putAttributesItem(String key, String attributesItem) {
    if (this.attributes == null) {
      this.attributes = new HashMap<String, String>();
    }
    this.attributes.put(key, attributesItem);
    return this;
  }

   /**
   * Attributes
   * @return attributes
  **/
  @ApiModelProperty(value = "Attributes")
  public Map<String, String> getAttributes() {
    return attributes;
  }

  public void setAttributes(Map<String, String> attributes) {
    this.attributes = attributes;
  }

  public TimeSeriesMetadata endTime(Long endTime) {
    this.endTime = endTime;
    return this;
  }

   /**
   * End time
   * @return endTime
  **/
  @ApiModelProperty(required = true, value = "End time")
  public Long getEndTime() {
    return endTime;
  }

  public void setEndTime(Long endTime) {
    this.endTime = endTime;
  }

  public TimeSeriesMetadata entityName(String entityName) {
    this.entityName = entityName;
    return this;
  }

   /**
   * Entity name
   * @return entityName
  **/
  @ApiModelProperty(required = true, value = "Entity name")
  public String getEntityName() {
    return entityName;
  }

  public void setEntityName(String entityName) {
    this.entityName = entityName;
  }

  public TimeSeriesMetadata expression(String expression) {
    this.expression = expression;
    return this;
  }

   /**
   * Expression
   * @return expression
  **/
  @ApiModelProperty(required = true, value = "Expression")
  public String getExpression() {
    return expression;
  }

  public void setExpression(String expression) {
    this.expression = expression;
  }

  public TimeSeriesMetadata metricCollectionFrequencyMs(Long metricCollectionFrequencyMs) {
    this.metricCollectionFrequencyMs = metricCollectionFrequencyMs;
    return this;
  }

   /**
   * Metric collection frequency in milliseconds
   * @return metricCollectionFrequencyMs
  **/
  @ApiModelProperty(value = "Metric collection frequency in milliseconds")
  public Long getMetricCollectionFrequencyMs() {
    return metricCollectionFrequencyMs;
  }

  public void setMetricCollectionFrequencyMs(Long metricCollectionFrequencyMs) {
    this.metricCollectionFrequencyMs = metricCollectionFrequencyMs;
  }

  public TimeSeriesMetadata metricName(String metricName) {
    this.metricName = metricName;
    return this;
  }

   /**
   * Metric name
   * @return metricName
  **/
  @ApiModelProperty(required = true, value = "Metric name")
  public String getMetricName() {
    return metricName;
  }

  public void setMetricName(String metricName) {
    this.metricName = metricName;
  }

  public TimeSeriesMetadata rollupUsed(String rollupUsed) {
    this.rollupUsed = rollupUsed;
    return this;
  }

   /**
   * Rollup used
   * @return rollupUsed
  **/
  @ApiModelProperty(required = true, value = "Rollup used")
  public String getRollupUsed() {
    return rollupUsed;
  }

  public void setRollupUsed(String rollupUsed) {
    this.rollupUsed = rollupUsed;
  }

  public TimeSeriesMetadata startTime(Long startTime) {
    this.startTime = startTime;
    return this;
  }

   /**
   * Start time
   * @return startTime
  **/
  @ApiModelProperty(required = true, value = "Start time")
  public Long getStartTime() {
    return startTime;
  }

  public void setStartTime(Long startTime) {
    this.startTime = startTime;
  }

  public TimeSeriesMetadata unitDenominators(List<String> unitDenominators) {
    this.unitDenominators = unitDenominators;
    return this;
  }

  public TimeSeriesMetadata addUnitDenominatorsItem(String unitDenominatorsItem) {
    if (this.unitDenominators == null) {
      this.unitDenominators = new ArrayList<String>();
    }
    this.unitDenominators.add(unitDenominatorsItem);
    return this;
  }

   /**
   * Unit denominators
   * @return unitDenominators
  **/
  @ApiModelProperty(value = "Unit denominators")
  public List<String> getUnitDenominators() {
    return unitDenominators;
  }

  public void setUnitDenominators(List<String> unitDenominators) {
    this.unitDenominators = unitDenominators;
  }

  public TimeSeriesMetadata unitNumerators(List<String> unitNumerators) {
    this.unitNumerators = unitNumerators;
    return this;
  }

  public TimeSeriesMetadata addUnitNumeratorsItem(String unitNumeratorsItem) {
    if (this.unitNumerators == null) {
      this.unitNumerators = new ArrayList<String>();
    }
    this.unitNumerators.add(unitNumeratorsItem);
    return this;
  }

   /**
   * Unit numerators
   * @return unitNumerators
  **/
  @ApiModelProperty(value = "Unit numerators")
  public List<String> getUnitNumerators() {
    return unitNumerators;
  }

  public void setUnitNumerators(List<String> unitNumerators) {
    this.unitNumerators = unitNumerators;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeSeriesMetadata timeSeriesMetadata = (TimeSeriesMetadata) o;
    return Objects.equals(this.alias, timeSeriesMetadata.alias) &&
        Objects.equals(this.attributes, timeSeriesMetadata.attributes) &&
        Objects.equals(this.endTime, timeSeriesMetadata.endTime) &&
        Objects.equals(this.entityName, timeSeriesMetadata.entityName) &&
        Objects.equals(this.expression, timeSeriesMetadata.expression) &&
        Objects.equals(this.metricCollectionFrequencyMs, timeSeriesMetadata.metricCollectionFrequencyMs) &&
        Objects.equals(this.metricName, timeSeriesMetadata.metricName) &&
        Objects.equals(this.rollupUsed, timeSeriesMetadata.rollupUsed) &&
        Objects.equals(this.startTime, timeSeriesMetadata.startTime) &&
        Objects.equals(this.unitDenominators, timeSeriesMetadata.unitDenominators) &&
        Objects.equals(this.unitNumerators, timeSeriesMetadata.unitNumerators);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alias, attributes, endTime, entityName, expression, metricCollectionFrequencyMs, metricName, rollupUsed, startTime, unitDenominators, unitNumerators);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeSeriesMetadata {\n");
    
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    entityName: ").append(toIndentedString(entityName)).append("\n");
    sb.append("    expression: ").append(toIndentedString(expression)).append("\n");
    sb.append("    metricCollectionFrequencyMs: ").append(toIndentedString(metricCollectionFrequencyMs)).append("\n");
    sb.append("    metricName: ").append(toIndentedString(metricName)).append("\n");
    sb.append("    rollupUsed: ").append(toIndentedString(rollupUsed)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    unitDenominators: ").append(toIndentedString(unitDenominators)).append("\n");
    sb.append("    unitNumerators: ").append(toIndentedString(unitNumerators)).append("\n");
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

