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

package com.cloudera.director.client.v4.model;


public class ConfigurationPropertyValue {
  private String label;
  private String value;
  public ConfigurationPropertyValue() { }

  private ConfigurationPropertyValue(String label, String value) {
    this.label = label;
    this.value = value;
  }

  private ConfigurationPropertyValue(ConfigurationPropertyValueBuilder builder) {
    this.label = builder.label;
    this.value = builder.value;
  }

  public static ConfigurationPropertyValueBuilder builder() {
    return new ConfigurationPropertyValueBuilder();
  }

  public static class ConfigurationPropertyValueBuilder {
    private String label = null;
    private String value = null;

    public ConfigurationPropertyValueBuilder label(String label) {
      this.label = label;
      return this;
    }

    public ConfigurationPropertyValueBuilder value(String value) {
      this.value = value;
      return this;
    }

    public ConfigurationPropertyValue build() {
      return new ConfigurationPropertyValue(this);
    }
  }

  public ConfigurationPropertyValueBuilder toBuilder() {
    return builder()
      .label(label)
      .value(value)
      ;
  }
  public String getLabel() {
    return label;
  }
  public void setLabel(String label) {
    this.label = label;
  }

  public String getValue() {
    return value;
  }
  public void setValue(String value) {
    this.value = value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    ConfigurationPropertyValue other = (ConfigurationPropertyValue) o; // NOPMD

    if (label != null ?
        !label.equals(other.label) :
        other.label != null) return false;
    if (value != null ?
        !value.equals(other.value) :
        other.value != null) return false;
    return true;
  }

  @Override
  public int hashCode() {
    int result = 0;
    result = 31 * result + (label != null ? label.hashCode() : 0);
    result = 31 * result + (value != null ? value.hashCode() : 0);
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    String newLine = System.getProperty("line.separator");
    sb.append("class ConfigurationPropertyValue {" + newLine);
    sb.append("  label: ").append(label).append(newLine);
    sb.append("  value: ").append(value).append(newLine);
    sb.append("}" + newLine);
    return sb.toString();
  }
}

