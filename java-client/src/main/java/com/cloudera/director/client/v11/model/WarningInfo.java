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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Warning information
 */
@ApiModel(description = "Warning information")

public class WarningInfo {
  @SerializedName("properties")
  private Map<String, String> properties = new HashMap<String, String>();
  /**
   * Warning code
   */
  @JsonAdapter(WarningCodeEnum.Adapter.class)
  public enum WarningCodeEnum {
    UNKNOWN_SERVICE_TYPE("UNKNOWN_SERVICE_TYPE"),
    
    UNKNOWN_ROLE_TYPE_FOR_SERVICE_TYPE("UNKNOWN_ROLE_TYPE_FOR_SERVICE_TYPE"),
    
    ROLE_ASSIGNMENT_DIFFERENCE("ROLE_ASSIGNMENT_DIFFERENCE"),
    
    ROLE_CONFIGURATION_DIFFERENCE("ROLE_CONFIGURATION_DIFFERENCE"),
    
    ROLE_CONFIGURATION_VALUE_DIFFERENCE("ROLE_CONFIGURATION_VALUE_DIFFERENCE"),
    
    INSTANCE_CONFIGURATION_DIFFERENCE("INSTANCE_CONFIGURATION_DIFFERENCE"),
    
    INSTANCE_CONFIGURATION_VALUE_DIFFERENCE("INSTANCE_CONFIGURATION_VALUE_DIFFERENCE"),
    
    UNDEFINED("UNDEFINED");

    private String value;

    WarningCodeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static WarningCodeEnum fromValue(String text) {
      for (WarningCodeEnum b : WarningCodeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<WarningCodeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final WarningCodeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public WarningCodeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return WarningCodeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("warningCode")
  private WarningCodeEnum warningCode = null;
  /**
   * Warning type
   */
  @JsonAdapter(WarningTypeEnum.Adapter.class)
  public enum WarningTypeEnum {
    CLIENT("CLIENT"),
    
    SERVICE("SERVICE"),
    
    UNKNOWN("UNKNOWN");

    private String value;

    WarningTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static WarningTypeEnum fromValue(String text) {
      for (WarningTypeEnum b : WarningTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<WarningTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final WarningTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public WarningTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return WarningTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("warningType")
  private WarningTypeEnum warningType = null;

  public WarningInfo() {
    // Do nothing
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
      private WarningCodeEnum warningCode = null;
      private WarningTypeEnum warningType = null;
  

    public WarningInfoBuilder properties(Map<String, String> properties) {
      this.properties = properties;
      return this;
    }


    public WarningInfoBuilder warningCode(WarningCodeEnum warningCode) {
      this.warningCode = warningCode;
      return this;
    }


    public WarningInfoBuilder warningType(WarningTypeEnum warningType) {
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

  public WarningInfo properties(Map<String, String> properties) {
    this.properties = properties;
    return this;
  }

  public WarningInfo putPropertiesItem(String key, String propertiesItem) {
    this.properties.put(key, propertiesItem);
    return this;
  }

   /**
   * Properties associated with the error
   * @return properties
  **/
  @ApiModelProperty(required = true, value = "Properties associated with the error")
  public Map<String, String> getProperties() {
    return properties;
  }

  public void setProperties(Map<String, String> properties) {
    this.properties = properties;
  }

  public WarningInfo warningCode(WarningCodeEnum warningCode) {
    this.warningCode = warningCode;
    return this;
  }

   /**
   * Warning code
   * @return warningCode
  **/
  @ApiModelProperty(required = true, value = "Warning code")
  public WarningCodeEnum getWarningCode() {
    return warningCode;
  }

  public void setWarningCode(WarningCodeEnum warningCode) {
    this.warningCode = warningCode;
  }

  public WarningInfo warningType(WarningTypeEnum warningType) {
    this.warningType = warningType;
    return this;
  }

   /**
   * Warning type
   * @return warningType
  **/
  @ApiModelProperty(required = true, value = "Warning type")
  public WarningTypeEnum getWarningType() {
    return warningType;
  }

  public void setWarningType(WarningTypeEnum warningType) {
    this.warningType = warningType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WarningInfo warningInfo = (WarningInfo) o;
    return Objects.equals(this.properties, warningInfo.properties) &&
        Objects.equals(this.warningCode, warningInfo.warningCode) &&
        Objects.equals(this.warningType, warningInfo.warningType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(properties, warningCode, warningType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WarningInfo {\n");
    
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    warningCode: ").append(toIndentedString(warningCode)).append("\n");
    sb.append("    warningType: ").append(toIndentedString(warningType)).append("\n");
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

