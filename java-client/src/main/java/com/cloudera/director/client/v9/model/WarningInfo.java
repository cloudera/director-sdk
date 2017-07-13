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

package com.cloudera.director.client.v9.model;

import java.util.HashMap;
import java.util.Map;

public class WarningInfo {
  /* Properties */
  private Map<String, String> properties;
  /* Warning code */
  private String warningCode;
  /* Warning type */
  private String warningType;
  public interface WarningCode {
    String UNKNOWN_SERVICE_TYPE = "UNKNOWN_SERVICE_TYPE";
    String UNKNOWN_ROLE_TYPE_FOR_SERVICE_TYPE = "UNKNOWN_ROLE_TYPE_FOR_SERVICE_TYPE";
    String ROLE_ASSIGNMENT_DIFFERENCE = "ROLE_ASSIGNMENT_DIFFERENCE";
    String ROLE_CONFIGURATION_DIFFERENCE = "ROLE_CONFIGURATION_DIFFERENCE";
    String ROLE_CONFIGURATION_VALUE_DIFFERENCE = "ROLE_CONFIGURATION_VALUE_DIFFERENCE";
    String INSTANCE_CONFIGURATION_DIFFERENCE = "INSTANCE_CONFIGURATION_DIFFERENCE";
    String INSTANCE_CONFIGURATION_VALUE_DIFFERENCE = "INSTANCE_CONFIGURATION_VALUE_DIFFERENCE";
    String UNDEFINED = "UNDEFINED";
  }
  public interface WarningType {
    String CLIENT = "CLIENT";
    String SERVICE = "SERVICE";
    String UNKNOWN = "UNKNOWN";
  }
  public WarningInfo() { }

  private WarningInfo(Map<String, String> properties, String warningCode, String warningType) {
    this.properties = properties;
    this.warningCode = warningCode;
    this.warningType = warningType;
  }

  private WarningInfo(WarningInfoBuilder builder) {
    this.properties = builder.properties;
    this.warningCode = builder.warningCode;
    this.warningType = builder.warningType;
  }

  public static WarningInfoBuilder builder() {
    return new WarningInfoBuilder();
  }

  public static class WarningInfoBuilder {
    private Map<String, String> properties = new HashMap<String, String>();
    private String warningCode = null;
    private String warningType = null;

    public WarningInfoBuilder properties(Map<String, String> properties) {
      this.properties = properties;
      return this;
    }

    public WarningInfoBuilder warningCode(String warningCode) {
      this.warningCode = warningCode;
      return this;
    }

    public WarningInfoBuilder warningType(String warningType) {
      this.warningType = warningType;
      return this;
    }

    public WarningInfo build() {
      return new WarningInfo(this);
    }
  }

  public WarningInfoBuilder toBuilder() {
    return builder()
      .properties(properties)
      .warningCode(warningCode)
      .warningType(warningType)
      ;
  }
  public Map<String, String> getProperties() {
    return properties;
  }
  public void setProperties(Map<String, String> properties) {
    this.properties = properties;
  }

  public String getWarningCode() {
    return warningCode;
  }
  public void setWarningCode(String warningCode) {
    this.warningCode = warningCode;
  }

  public String getWarningType() {
    return warningType;
  }
  public void setWarningType(String warningType) {
    this.warningType = warningType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    WarningInfo other = (WarningInfo) o; // NOPMD

    if (properties != null ?
        !properties.equals(other.properties) :
        other.properties != null) return false;
    if (warningCode != null ?
        !warningCode.equals(other.warningCode) :
        other.warningCode != null) return false;
    if (warningType != null ?
        !warningType.equals(other.warningType) :
        other.warningType != null) return false;
    return true;
  }

  @Override
  public int hashCode() {
    int result = 0;
    result = 31 * result + (properties != null ? properties.hashCode() : 0);
    result = 31 * result + (warningCode != null ? warningCode.hashCode() : 0);
    result = 31 * result + (warningType != null ? warningType.hashCode() : 0);
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    String newLine = System.getProperty("line.separator");
    sb.append("class WarningInfo {" + newLine);
    sb.append("  properties: ").append(properties).append(newLine);
    sb.append("  warningCode: ").append(warningCode).append(newLine);
    sb.append("  warningType: ").append(warningType).append(newLine);
    sb.append("}" + newLine);
    return sb.toString();
  }
}

