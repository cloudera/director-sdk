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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TimeSeriesMetadata {
  /* Alias */
  private String alias;
  /* Attributes */
  private Map<String, String> attributes;
  /* End time */
  private Long endTime;
  /* Entity name */
  private String entityName;
  /* Expression */
  private String expression;
  /* Metric collection frequency in milliseconds */
  private Long metricCollectionFrequencyMs;
  /* Metric name */
  private String metricName;
  /* Rollup used */
  private String rollupUsed;
  /* Start time */
  private Long startTime;
  /* Unit denominators */
  private List<String> unitDenominators;
  /* Unit numerators */
  private List<String> unitNumerators;
  public TimeSeriesMetadata() { }

  private TimeSeriesMetadata(String alias, Map<String, String> attributes, Long endTime, String entityName, String expression, Long metricCollectionFrequencyMs, String metricName, String rollupUsed, Long startTime, List<String> unitDenominators, List<String> unitNumerators) {
    this.alias = alias;
    this.attributes = attributes;
    this.endTime = endTime;
    this.entityName = entityName;
    this.expression = expression;
    this.metricCollectionFrequencyMs = metricCollectionFrequencyMs;
    this.metricName = metricName;
    this.rollupUsed = rollupUsed;
    this.startTime = startTime;
    this.unitDenominators = unitDenominators;
    this.unitNumerators = unitNumerators;
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
  public String getAlias() {
    return alias;
  }
  public void setAlias(String alias) {
    this.alias = alias;
  }

  public Map<String, String> getAttributes() {
    return attributes;
  }
  public void setAttributes(Map<String, String> attributes) {
    this.attributes = attributes;
  }

  public Long getEndTime() {
    return endTime;
  }
  public void setEndTime(Long endTime) {
    this.endTime = endTime;
  }

  public String getEntityName() {
    return entityName;
  }
  public void setEntityName(String entityName) {
    this.entityName = entityName;
  }

  public String getExpression() {
    return expression;
  }
  public void setExpression(String expression) {
    this.expression = expression;
  }

  public Long getMetricCollectionFrequencyMs() {
    return metricCollectionFrequencyMs;
  }
  public void setMetricCollectionFrequencyMs(Long metricCollectionFrequencyMs) {
    this.metricCollectionFrequencyMs = metricCollectionFrequencyMs;
  }

  public String getMetricName() {
    return metricName;
  }
  public void setMetricName(String metricName) {
    this.metricName = metricName;
  }

  public String getRollupUsed() {
    return rollupUsed;
  }
  public void setRollupUsed(String rollupUsed) {
    this.rollupUsed = rollupUsed;
  }

  public Long getStartTime() {
    return startTime;
  }
  public void setStartTime(Long startTime) {
    this.startTime = startTime;
  }

  public List<String> getUnitDenominators() {
    return unitDenominators;
  }
  public void setUnitDenominators(List<String> unitDenominators) {
    this.unitDenominators = unitDenominators;
  }

  public List<String> getUnitNumerators() {
    return unitNumerators;
  }
  public void setUnitNumerators(List<String> unitNumerators) {
    this.unitNumerators = unitNumerators;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    TimeSeriesMetadata other = (TimeSeriesMetadata) o; // NOPMD

    if (alias != null ?
        !alias.equals(other.alias) :
        other.alias != null) return false;
    if (attributes != null ?
        !attributes.equals(other.attributes) :
        other.attributes != null) return false;
    if (endTime != null ?
        !endTime.equals(other.endTime) :
        other.endTime != null) return false;
    if (entityName != null ?
        !entityName.equals(other.entityName) :
        other.entityName != null) return false;
    if (expression != null ?
        !expression.equals(other.expression) :
        other.expression != null) return false;
    if (metricCollectionFrequencyMs != null ?
        !metricCollectionFrequencyMs.equals(other.metricCollectionFrequencyMs) :
        other.metricCollectionFrequencyMs != null) return false;
    if (metricName != null ?
        !metricName.equals(other.metricName) :
        other.metricName != null) return false;
    if (rollupUsed != null ?
        !rollupUsed.equals(other.rollupUsed) :
        other.rollupUsed != null) return false;
    if (startTime != null ?
        !startTime.equals(other.startTime) :
        other.startTime != null) return false;
    if (unitDenominators != null ?
        !unitDenominators.equals(other.unitDenominators) :
        other.unitDenominators != null) return false;
    if (unitNumerators != null ?
        !unitNumerators.equals(other.unitNumerators) :
        other.unitNumerators != null) return false;
    return true;
  }

  @Override
  public int hashCode() {
    int result = 0;
    result = 31 * result + (alias != null ? alias.hashCode() : 0);
    result = 31 * result + (attributes != null ? attributes.hashCode() : 0);
    result = 31 * result + (endTime != null ? endTime.hashCode() : 0);
    result = 31 * result + (entityName != null ? entityName.hashCode() : 0);
    result = 31 * result + (expression != null ? expression.hashCode() : 0);
    result = 31 * result + (metricCollectionFrequencyMs != null ? metricCollectionFrequencyMs.hashCode() : 0);
    result = 31 * result + (metricName != null ? metricName.hashCode() : 0);
    result = 31 * result + (rollupUsed != null ? rollupUsed.hashCode() : 0);
    result = 31 * result + (startTime != null ? startTime.hashCode() : 0);
    result = 31 * result + (unitDenominators != null ? unitDenominators.hashCode() : 0);
    result = 31 * result + (unitNumerators != null ? unitNumerators.hashCode() : 0);
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    String newLine = System.getProperty("line.separator");
    sb.append("class TimeSeriesMetadata {" + newLine);
    sb.append("  alias: ").append(alias).append(newLine);
    sb.append("  attributes: ").append(attributes).append(newLine);
    sb.append("  endTime: ").append(endTime).append(newLine);
    sb.append("  entityName: ").append(entityName).append(newLine);
    sb.append("  expression: ").append(expression).append(newLine);
    sb.append("  metricCollectionFrequencyMs: ").append(metricCollectionFrequencyMs).append(newLine);
    sb.append("  metricName: ").append(metricName).append(newLine);
    sb.append("  rollupUsed: ").append(rollupUsed).append(newLine);
    sb.append("  startTime: ").append(startTime).append(newLine);
    sb.append("  unitDenominators: ").append(unitDenominators).append(newLine);
    sb.append("  unitNumerators: ").append(unitNumerators).append(newLine);
    sb.append("}" + newLine);
    return sb.toString();
  }
}

