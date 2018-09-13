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

/**
 * Results from a health check on a service
 */
@ApiModel(description = "Results from a health check on a service")

public class HealthCheck {
  @SerializedName("checkName")
  private String checkName = null;
  @SerializedName("explanation")
  private String explanation = null;
  /**
   * Health status value
   */
  @JsonAdapter(HealthStatusEnum.Adapter.class)
  public enum HealthStatusEnum {
    DISABLED("DISABLED"),
    
    NOT_AVAILABLE("NOT_AVAILABLE"),
    
    STARTING("STARTING"),
    
    STOPPING("STOPPING"),
    
    STOPPED("STOPPED"),
    
    GOOD("GOOD"),
    
    CONCERNING("CONCERNING"),
    
    BAD("BAD");

    private String value;

    HealthStatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static HealthStatusEnum fromValue(String text) {
      for (HealthStatusEnum b : HealthStatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<HealthStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final HealthStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public HealthStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return HealthStatusEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("healthStatus")
  private HealthStatusEnum healthStatus = null;
  @SerializedName("suppressed")
  private Boolean suppressed = null;

  public HealthCheck() {
    // Do nothing
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
      private HealthStatusEnum healthStatus = null;
      private Boolean suppressed = null;
  

    public HealthCheckBuilder checkName(String checkName) {
      this.checkName = checkName;
      return this;
    }


    public HealthCheckBuilder explanation(String explanation) {
      this.explanation = explanation;
      return this;
    }


    public HealthCheckBuilder healthStatus(HealthStatusEnum healthStatus) {
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

  public HealthCheck checkName(String checkName) {
    this.checkName = checkName;
    return this;
  }

   /**
   * Health check name
   * @return checkName
  **/
  @ApiModelProperty(required = true, value = "Health check name")
  public String getCheckName() {
    return checkName;
  }

  public void setCheckName(String checkName) {
    this.checkName = checkName;
  }

  public HealthCheck explanation(String explanation) {
    this.explanation = explanation;
    return this;
  }

   /**
   * Explanation for health status
   * @return explanation
  **/
  @ApiModelProperty(value = "Explanation for health status")
  public String getExplanation() {
    return explanation;
  }

  public void setExplanation(String explanation) {
    this.explanation = explanation;
  }

  public HealthCheck healthStatus(HealthStatusEnum healthStatus) {
    this.healthStatus = healthStatus;
    return this;
  }

   /**
   * Health status value
   * @return healthStatus
  **/
  @ApiModelProperty(required = true, value = "Health status value")
  public HealthStatusEnum getHealthStatus() {
    return healthStatus;
  }

  public void setHealthStatus(HealthStatusEnum healthStatus) {
    this.healthStatus = healthStatus;
  }

  public HealthCheck suppressed(Boolean suppressed) {
    this.suppressed = suppressed;
    return this;
  }

   /**
   * Check suppression flag
   * @return suppressed
  **/
  @ApiModelProperty(example = "false", value = "Check suppression flag")
  public Boolean isSuppressed() {
    return suppressed;
  }

  public void setSuppressed(Boolean suppressed) {
    this.suppressed = suppressed;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HealthCheck healthCheck = (HealthCheck) o;
    return Objects.equals(this.checkName, healthCheck.checkName) &&
        Objects.equals(this.explanation, healthCheck.explanation) &&
        Objects.equals(this.healthStatus, healthCheck.healthStatus) &&
        Objects.equals(this.suppressed, healthCheck.suppressed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(checkName, explanation, healthStatus, suppressed);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HealthCheck {\n");
    
    sb.append("    checkName: ").append(toIndentedString(checkName)).append("\n");
    sb.append("    explanation: ").append(toIndentedString(explanation)).append("\n");
    sb.append("    healthStatus: ").append(toIndentedString(healthStatus)).append("\n");
    sb.append("    suppressed: ").append(toIndentedString(suppressed)).append("\n");
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

