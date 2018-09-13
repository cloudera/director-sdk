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

/**
 * Instance state as reported by a cloud provider
 */
@ApiModel(description = "Instance state as reported by a cloud provider")

public class InstanceState {
  @SerializedName("lastChecked")
  private Long lastChecked = null;
  @SerializedName("lastReported")
  private Long lastReported = null;
  /**
   * Instance status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    PENDING("PENDING"),
    
    RUNNING("RUNNING"),
    
    STOPPING("STOPPING"),
    
    STOPPED("STOPPED"),
    
    DELETING("DELETING"),
    
    DELETED("DELETED"),
    
    FAILED("FAILED"),
    
    UNKNOWN("UNKNOWN"),
    
    MISSING("MISSING");

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

  public InstanceState() {
    // Do nothing
  }

  private InstanceState(InstanceStateBuilder builder) {
      this.lastChecked = builder.lastChecked;
      this.lastReported = builder.lastReported;
      this.status = builder.status;
    }

  public static InstanceStateBuilder builder() {
    return new InstanceStateBuilder();
  }

  public static class InstanceStateBuilder {
      private Long lastChecked = null;
      private Long lastReported = null;
      private StatusEnum status = null;
  

    public InstanceStateBuilder lastChecked(Long lastChecked) {
      this.lastChecked = lastChecked;
      return this;
    }


    public InstanceStateBuilder lastReported(Long lastReported) {
      this.lastReported = lastReported;
      return this;
    }


    public InstanceStateBuilder status(StatusEnum status) {
      this.status = status;
      return this;
    }


    public InstanceState build() {
      return new InstanceState(this);
    }
  }

  public InstanceStateBuilder toBuilder() {
    return builder()
      .lastChecked(lastChecked)
            .lastReported(lastReported)
            .status(status)
      ;
  }

  public InstanceState lastChecked(Long lastChecked) {
    this.lastChecked = lastChecked;
    return this;
  }

   /**
   * Last time that instance state was checked
   * @return lastChecked
  **/
  @ApiModelProperty(required = true, value = "Last time that instance state was checked")
  public Long getLastChecked() {
    return lastChecked;
  }

  public void setLastChecked(Long lastChecked) {
    this.lastChecked = lastChecked;
  }

  public InstanceState lastReported(Long lastReported) {
    this.lastReported = lastReported;
    return this;
  }

   /**
   * Last time that instance state was reported
   * @return lastReported
  **/
  @ApiModelProperty(required = true, value = "Last time that instance state was reported")
  public Long getLastReported() {
    return lastReported;
  }

  public void setLastReported(Long lastReported) {
    this.lastReported = lastReported;
  }

  public InstanceState status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Instance status
   * @return status
  **/
  @ApiModelProperty(required = true, value = "Instance status")
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
    InstanceState instanceState = (InstanceState) o;
    return Objects.equals(this.lastChecked, instanceState.lastChecked) &&
        Objects.equals(this.lastReported, instanceState.lastReported) &&
        Objects.equals(this.status, instanceState.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastChecked, lastReported, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstanceState {\n");
    
    sb.append("    lastChecked: ").append(toIndentedString(lastChecked)).append("\n");
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

