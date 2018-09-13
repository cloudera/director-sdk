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


package com.cloudera.director.client.v12.model;

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
 * The health of an entity
 */
@ApiModel(description = "The health of an entity")

public class Health {
  @SerializedName("lastReported")
  private Long lastReported = null;
  /**
   * Health status value
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    DISABLED("DISABLED"),
    
    NOT_AVAILABLE("NOT_AVAILABLE"),
    
    STARTING("STARTING"),
    
    STOPPING("STOPPING"),
    
    STOPPED("STOPPED"),
    
    GOOD("GOOD"),
    
    CONCERNING("CONCERNING"),
    
    BAD("BAD");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StatusEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("status")
  private StatusEnum status = null;

  public Health() {
    // Do nothing
  }

  private Health(HealthBuilder builder) {
      this.lastReported = builder.lastReported;
      this.status = builder.status;
    }

  public static HealthBuilder builder() {
    return new HealthBuilder();
  }

  public static class HealthBuilder {
      private Long lastReported = null;
      private StatusEnum status = null;
  

    public HealthBuilder lastReported(Long lastReported) {
      this.lastReported = lastReported;
      return this;
    }


    public HealthBuilder status(StatusEnum status) {
      this.status = status;
      return this;
    }


    public Health build() {
      return new Health(this);
    }
  }

  public HealthBuilder toBuilder() {
    return builder()
      .lastReported(lastReported)
            .status(status)
      ;
  }

  public Health lastReported(Long lastReported) {
    this.lastReported = lastReported;
    return this;
  }

   /**
   * Time when health status was reported
   * @return lastReported
  **/
  @ApiModelProperty(required = true, value = "Time when health status was reported")
  public Long getLastReported() {
    return lastReported;
  }

  public void setLastReported(Long lastReported) {
    this.lastReported = lastReported;
  }

  public Health status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Health status value
   * @return status
  **/
  @ApiModelProperty(required = true, value = "Health status value")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Health health = (Health) o;
    return Objects.equals(this.lastReported, health.lastReported) &&
        Objects.equals(this.status, health.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastReported, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Health {\n");
    
    sb.append("    lastReported: ").append(toIndentedString(lastReported)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

