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


public class ClusterAdministrationSettings {
  /* Delay after a modification before auto-repair will execute */
  private Long autoRepairCooldownPeriodInSeconds;
  /* Whether auto-repair is enabled */
  private Boolean autoRepairEnabled;
  public ClusterAdministrationSettings() { }

  private ClusterAdministrationSettings(Long autoRepairCooldownPeriodInSeconds, Boolean autoRepairEnabled) {
    this.autoRepairCooldownPeriodInSeconds = autoRepairCooldownPeriodInSeconds;
    this.autoRepairEnabled = autoRepairEnabled;
  }

  private ClusterAdministrationSettings(ClusterAdministrationSettingsBuilder builder) {
    this.autoRepairCooldownPeriodInSeconds = builder.autoRepairCooldownPeriodInSeconds;
    this.autoRepairEnabled = builder.autoRepairEnabled;
  }

  public static ClusterAdministrationSettingsBuilder builder() {
    return new ClusterAdministrationSettingsBuilder();
  }

  public static class ClusterAdministrationSettingsBuilder {
    private Long autoRepairCooldownPeriodInSeconds = null;
    private Boolean autoRepairEnabled = null;

    public ClusterAdministrationSettingsBuilder autoRepairCooldownPeriodInSeconds(Long autoRepairCooldownPeriodInSeconds) {
      this.autoRepairCooldownPeriodInSeconds = autoRepairCooldownPeriodInSeconds;
      return this;
    }

    public ClusterAdministrationSettingsBuilder autoRepairEnabled(Boolean autoRepairEnabled) {
      this.autoRepairEnabled = autoRepairEnabled;
      return this;
    }

    public ClusterAdministrationSettings build() {
      return new ClusterAdministrationSettings(this);
    }
  }

  public ClusterAdministrationSettingsBuilder toBuilder() {
    return builder()
      .autoRepairCooldownPeriodInSeconds(autoRepairCooldownPeriodInSeconds)
      .autoRepairEnabled(autoRepairEnabled)
      ;
  }
  public Long getAutoRepairCooldownPeriodInSeconds() {
    return autoRepairCooldownPeriodInSeconds;
  }
  public void setAutoRepairCooldownPeriodInSeconds(Long autoRepairCooldownPeriodInSeconds) {
    this.autoRepairCooldownPeriodInSeconds = autoRepairCooldownPeriodInSeconds;
  }

  public Boolean getAutoRepairEnabled() {
    return autoRepairEnabled;
  }
  public void setAutoRepairEnabled(Boolean autoRepairEnabled) {
    this.autoRepairEnabled = autoRepairEnabled;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    ClusterAdministrationSettings other = (ClusterAdministrationSettings) o; // NOPMD

    if (autoRepairCooldownPeriodInSeconds != null ?
        !autoRepairCooldownPeriodInSeconds.equals(other.autoRepairCooldownPeriodInSeconds) :
        other.autoRepairCooldownPeriodInSeconds != null) return false;
    if (autoRepairEnabled != null ?
        !autoRepairEnabled.equals(other.autoRepairEnabled) :
        other.autoRepairEnabled != null) return false;
    return true;
  }

  @Override
  public int hashCode() {
    int result = 0;
    result = 31 * result + (autoRepairCooldownPeriodInSeconds != null ? autoRepairCooldownPeriodInSeconds.hashCode() : 0);
    result = 31 * result + (autoRepairEnabled != null ? autoRepairEnabled.hashCode() : 0);
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    String newLine = System.getProperty("line.separator");
    sb.append("class ClusterAdministrationSettings {" + newLine);
    sb.append("  autoRepairCooldownPeriodInSeconds: ").append(autoRepairCooldownPeriodInSeconds).append(newLine);
    sb.append("  autoRepairEnabled: ").append(autoRepairEnabled).append(newLine);
    sb.append("}" + newLine);
    return sb.toString();
  }
}

