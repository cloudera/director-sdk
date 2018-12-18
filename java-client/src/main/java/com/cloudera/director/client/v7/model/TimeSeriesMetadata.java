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


package com.cloudera.director.client.v7.model;

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
import org.joda.time.DateTime;

/**
 * TimeSeriesMetadata
 */

public class TimeSeriesMetadata {
  @SerializedName("metricName")
  private String metricName = null;
  @SerializedName("entityName")
  private String entityName = null;
  @SerializedName("startTime")
  private DateTime startTime = null;
  @SerializedName("endTime")
  private DateTime endTime = null;
  @SerializedName("attributes")
  private Map<String, String> attributes = null;
  @SerializedName("unitNumerators")
  private List<String> unitNumerators = null;
  @SerializedName("unitDenominators")
  private List<String> unitDenominators = null;
  @SerializedName("expression")
  private String expression = null;
  @SerializedName("alias")
  private String alias = null;
  @SerializedName("metricCollectionFrequencyMs")
  private Long metricCollectionFrequencyMs = null;
  @SerializedName("rollupUsed")
  private String rollupUsed = null;

  public TimeSeriesMetadata() {
    // Do nothing
  }

  private TimeSeriesMetadata(TimeSeriesMetadataBuilder builder) {
      this.metricName = builder.metricName;
      this.entityName = builder.entityName;
      this.startTime = builder.startTime;
      this.endTime = builder.endTime;
      this.attributes = builder.attributes;
      this.unitNumerators = builder.unitNumerators;
      this.unitDenominators = builder.unitDenominators;
      this.expression = builder.expression;
      this.alias = builder.alias;
      this.metricCollectionFrequencyMs = builder.metricCollectionFrequencyMs;
      this.rollupUsed = builder.rollupUsed;
    }

  public static TimeSeriesMetadataBuilder builder() {
    return new TimeSeriesMetadataBuilder();
  }

  public static class TimeSeriesMetadataBuilder {
      private String metricName = null;
      private String entityName = null;
      private DateTime startTime = null;
      private DateTime endTime = null;
      private Map<String, String> attributes = new HashMap<String, String>();
      private List<String> unitNumerators = new ArrayList<String>();
      private List<String> unitDenominators = new ArrayList<String>();
      private String expression = null;
      private String alias = null;
      private Long metricCollectionFrequencyMs = null;
      private String rollupUsed = null;
  

    public TimeSeriesMetadataBuilder metricName(String metricName) {
      this.metricName = metricName;
      return this;
    }


    public TimeSeriesMetadataBuilder entityName(String entityName) {
      this.entityName = entityName;
      return this;
    }


    public TimeSeriesMetadataBuilder startTime(DateTime startTime) {
      this.startTime = startTime;
      return this;
    }


    public TimeSeriesMetadataBuilder endTime(DateTime endTime) {
      this.endTime = endTime;
      return this;
    }


    public TimeSeriesMetadataBuilder attributes(Map<String, String> attributes) {
      this.attributes = attributes;
      return this;
    }


    public TimeSeriesMetadataBuilder unitNumerators(List<String> unitNumerators) {
      this.unitNumerators = unitNumerators;
      return this;
    }


    public TimeSeriesMetadataBuilder unitDenominators(List<String> unitDenominators) {
      this.unitDenominators = unitDenominators;
      return this;
    }


    public TimeSeriesMetadataBuilder expression(String expression) {
      this.expression = expression;
      return this;
    }


    public TimeSeriesMetadataBuilder alias(String alias) {
      this.alias = alias;
      return this;
    }


    public TimeSeriesMetadataBuilder metricCollectionFrequencyMs(Long metricCollectionFrequencyMs) {
      this.metricCollectionFrequencyMs = metricCollectionFrequencyMs;
      return this;
    }


    public TimeSeriesMetadataBuilder rollupUsed(String rollupUsed) {
      this.rollupUsed = rollupUsed;
      return this;
    }


    public TimeSeriesMetadata build() {
      return new TimeSeriesMetadata(this);
    }
  }

  public TimeSeriesMetadataBuilder toBuilder() {
    return builder()
      .metricName(metricName)
            .entityName(entityName)
            .startTime(startTime)
            .endTime(endTime)
            .attributes(attributes)
            .unitNumerators(unitNumerators)
            .unitDenominators(unitDenominators)
            .expression(expression)
            .alias(alias)
            .metricCollectionFrequencyMs(metricCollectionFrequencyMs)
            .rollupUsed(rollupUsed)
      ;
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

  public TimeSeriesMetadata startTime(DateTime startTime) {
    this.startTime = startTime;
    return this;
  }

   /**
   * Start time
   * @return startTime
  **/
  @ApiModelProperty(required = true, value = "Start time")
  public DateTime getStartTime() {
    return startTime;
  }

  public void setStartTime(DateTime startTime) {
    this.startTime = startTime;
  }

  public TimeSeriesMetadata endTime(DateTime endTime) {
    this.endTime = endTime;
    return this;
  }

   /**
   * End time
   * @return endTime
  **/
  @ApiModelProperty(required = true, value = "End time")
  public DateTime getEndTime() {
    return endTime;
  }

  public void setEndTime(DateTime endTime) {
    this.endTime = endTime;
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeSeriesMetadata timeSeriesMetadata = (TimeSeriesMetadata) o;
    return Objects.equals(this.metricName, timeSeriesMetadata.metricName) &&
        Objects.equals(this.entityName, timeSeriesMetadata.entityName) &&
        Objects.equals(this.startTime, timeSeriesMetadata.startTime) &&
        Objects.equals(this.endTime, timeSeriesMetadata.endTime) &&
        Objects.equals(this.attributes, timeSeriesMetadata.attributes) &&
        Objects.equals(this.unitNumerators, timeSeriesMetadata.unitNumerators) &&
        Objects.equals(this.unitDenominators, timeSeriesMetadata.unitDenominators) &&
        Objects.equals(this.expression, timeSeriesMetadata.expression) &&
        Objects.equals(this.alias, timeSeriesMetadata.alias) &&
        Objects.equals(this.metricCollectionFrequencyMs, timeSeriesMetadata.metricCollectionFrequencyMs) &&
        Objects.equals(this.rollupUsed, timeSeriesMetadata.rollupUsed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metricName, entityName, startTime, endTime, attributes, unitNumerators, unitDenominators, expression, alias, metricCollectionFrequencyMs, rollupUsed);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeSeriesMetadata {\n");
    
    sb.append("    metricName: ").append(toIndentedString(metricName)).append("\n");
    sb.append("    entityName: ").append(toIndentedString(entityName)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    unitNumerators: ").append(toIndentedString(unitNumerators)).append("\n");
    sb.append("    unitDenominators: ").append(toIndentedString(unitDenominators)).append("\n");
    sb.append("    expression: ").append(toIndentedString(expression)).append("\n");
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
    sb.append("    metricCollectionFrequencyMs: ").append(toIndentedString(metricCollectionFrequencyMs)).append("\n");
    sb.append("    rollupUsed: ").append(toIndentedString(rollupUsed)).append("\n");
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

