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


package com.cloudera.director.client.v9.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Settings for Cloudera Altus Director cluster administration
 */
@ApiModel(description = "Settings for Cloudera Altus Director cluster administration")

public class ClusterAdministrationSettings {
  @SerializedName("autoRepairEnabled")
  private Boolean autoRepairEnabled = null;
  @SerializedName("autoRepairCooldownPeriodInSeconds")
  private Long autoRepairCooldownPeriodInSeconds = null;

  public ClusterAdministrationSettings() {
    // Do nothing
  }

  private ClusterAdministrationSettings(ClusterAdministrationSettingsBuilder builder) {
      this.autoRepairEnabled = builder.autoRepairEnabled;
      this.autoRepairCooldownPeriodInSeconds = builder.autoRepairCooldownPeriodInSeconds;
    }

  public static ClusterAdministrationSettingsBuilder builder() {
    return new ClusterAdministrationSettingsBuilder();
  }

  public static class ClusterAdministrationSettingsBuilder {
      private Boolean autoRepairEnabled = null;
      private Long autoRepairCooldownPeriodInSeconds = null;
  

    public ClusterAdministrationSettingsBuilder autoRepairEnabled(Boolean autoRepairEnabled) {
      this.autoRepairEnabled = autoRepairEnabled;
      return this;
    }


    public ClusterAdministrationSettingsBuilder autoRepairCooldownPeriodInSeconds(Long autoRepairCooldownPeriodInSeconds) {
      this.autoRepairCooldownPeriodInSeconds = autoRepairCooldownPeriodInSeconds;
      return this;
    }


    public ClusterAdministrationSettings build() {
      return new ClusterAdministrationSettings(this);
    }
  }

  public ClusterAdministrationSettingsBuilder toBuilder() {
    return builder()
      .autoRepairEnabled(autoRepairEnabled)
            .autoRepairCooldownPeriodInSeconds(autoRepairCooldownPeriodInSeconds)
      ;
  }

  public ClusterAdministrationSettings autoRepairEnabled(Boolean autoRepairEnabled) {
    this.autoRepairEnabled = autoRepairEnabled;
    return this;
  }

   /**
   * Whether auto-repair is enabled
   * @return autoRepairEnabled
  **/
  @ApiModelProperty(required = true, value = "Whether auto-repair is enabled")
  public Boolean isAutoRepairEnabled() {
    return autoRepairEnabled;
  }

  public void setAutoRepairEnabled(Boolean autoRepairEnabled) {
    this.autoRepairEnabled = autoRepairEnabled;
  }

  public ClusterAdministrationSettings autoRepairCooldownPeriodInSeconds(Long autoRepairCooldownPeriodInSeconds) {
    this.autoRepairCooldownPeriodInSeconds = autoRepairCooldownPeriodInSeconds;
    return this;
  }

   /**
   * Delay after a modification before auto-repair will execute
   * @return autoRepairCooldownPeriodInSeconds
  **/
  @ApiModelProperty(required = true, value = "Delay after a modification before auto-repair will execute")
  public Long getAutoRepairCooldownPeriodInSeconds() {
    return autoRepairCooldownPeriodInSeconds;
  }

  public void setAutoRepairCooldownPeriodInSeconds(Long autoRepairCooldownPeriodInSeconds) {
    this.autoRepairCooldownPeriodInSeconds = autoRepairCooldownPeriodInSeconds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClusterAdministrationSettings clusterAdministrationSettings = (ClusterAdministrationSettings) o;
    return Objects.equals(this.autoRepairEnabled, clusterAdministrationSettings.autoRepairEnabled) &&
        Objects.equals(this.autoRepairCooldownPeriodInSeconds, clusterAdministrationSettings.autoRepairCooldownPeriodInSeconds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoRepairEnabled, autoRepairCooldownPeriodInSeconds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClusterAdministrationSettings {\n");
    
    sb.append("    autoRepairEnabled: ").append(toIndentedString(autoRepairEnabled)).append("\n");
    sb.append("    autoRepairCooldownPeriodInSeconds: ").append(toIndentedString(autoRepairCooldownPeriodInSeconds)).append("\n");
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

