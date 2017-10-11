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


public class HealthCheck {
  /* Health check name */
  private String checkName;
  /* Explanation for health status */
  private String explanation;
  /* Health status */
  private String healthStatus;
  /* Check suppression flag */
  private Boolean suppressed;
  public interface HealthStatus {
    String DISABLED = "DISABLED";
    String NOT_AVAILABLE = "NOT_AVAILABLE";
    String STARTING = "STARTING";
    String STOPPING = "STOPPING";
    String STOPPED = "STOPPED";
    String GOOD = "GOOD";
    String CONCERNING = "CONCERNING";
    String BAD = "BAD";
  }
  public HealthCheck() { }

  private HealthCheck(String checkName, String explanation, String healthStatus, Boolean suppressed) {
    this.checkName = checkName;
    this.explanation = explanation;
    this.healthStatus = healthStatus;
    this.suppressed = suppressed;
  }

  private HealthCheck(HealthCheckBuilder builder) {
    this.checkName = builder.checkName;
    this.explanation = builder.explanation;
    this.healthStatus = builder.healthStatus;
    this.suppressed = builder.suppressed;
  }

  public static HealthCheckBuilder builder() {
    return new HealthCheckBuilder();
  }

  public static class HealthCheckBuilder {
    private String checkName = null;
    private String explanation = null;
    private String healthStatus = null;
    private Boolean suppressed = null;

    public HealthCheckBuilder checkName(String checkName) {
      this.checkName = checkName;
      return this;
    }

    public HealthCheckBuilder explanation(String explanation) {
      this.explanation = explanation;
      return this;
    }

    public HealthCheckBuilder healthStatus(String healthStatus) {
      this.healthStatus = healthStatus;
      return this;
    }

    public HealthCheckBuilder suppressed(Boolean suppressed) {
      this.suppressed = suppressed;
      return this;
    }

    public HealthCheck build() {
      return new HealthCheck(this);
    }
  }

  public HealthCheckBuilder toBuilder() {
    return builder()
      .checkName(checkName)
      .explanation(explanation)
      .healthStatus(healthStatus)
      .suppressed(suppressed)
      ;
  }
  public String getCheckName() {
    return checkName;
  }
  public void setCheckName(String checkName) {
    this.checkName = checkName;
  }

  public String getExplanation() {
    return explanation;
  }
  public void setExplanation(String explanation) {
    this.explanation = explanation;
  }

  public String getHealthStatus() {
    return healthStatus;
  }
  public void setHealthStatus(String healthStatus) {
    this.healthStatus = healthStatus;
  }

  public Boolean getSuppressed() {
    return suppressed;
  }
  public void setSuppressed(Boolean suppressed) {
    this.suppressed = suppressed;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    HealthCheck other = (HealthCheck) o; // NOPMD

    if (checkName != null ?
        !checkName.equals(other.checkName) :
        other.checkName != null) return false;
    if (explanation != null ?
        !explanation.equals(other.explanation) :
        other.explanation != null) return false;
    if (healthStatus != null ?
        !healthStatus.equals(other.healthStatus) :
        other.healthStatus != null) return false;
    if (suppressed != null ?
        !suppressed.equals(other.suppressed) :
        other.suppressed != null) return false;
    return true;
  }

  @Override
  public int hashCode() {
    int result = 0;
    result = 31 * result + (checkName != null ? checkName.hashCode() : 0);
    result = 31 * result + (explanation != null ? explanation.hashCode() : 0);
    result = 31 * result + (healthStatus != null ? healthStatus.hashCode() : 0);
    result = 31 * result + (suppressed != null ? suppressed.hashCode() : 0);
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    String newLine = System.getProperty("line.separator");
    sb.append("class HealthCheck {" + newLine);
    sb.append("  checkName: ").append(checkName).append(newLine);
    sb.append("  explanation: ").append(explanation).append(newLine);
    sb.append("  healthStatus: ").append(healthStatus).append(newLine);
    sb.append("  suppressed: ").append(suppressed).append(newLine);
    sb.append("}" + newLine);
    return sb.toString();
  }
}

