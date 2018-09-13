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


package com.cloudera.director.client.v8.model;

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
 * A valid value and label for a configuration property
 */
@ApiModel(description = "A valid value and label for a configuration property")

public class ConfigurationPropertyValue {
  @SerializedName("label")
  private String label = null;
  @SerializedName("value")
  private String value = null;

  public ConfigurationPropertyValue() {
    // Do nothing
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

  public ConfigurationPropertyValue label(String label) {
    this.label = label;
    return this;
  }

   /**
   * Label associated with value
   * @return label
  **/
  @ApiModelProperty(required = true, value = "Label associated with value")
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public ConfigurationPropertyValue value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Valid value
   * @return value
  **/
  @ApiModelProperty(required = true, value = "Valid value")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfigurationPropertyValue configurationPropertyValue = (ConfigurationPropertyValue) o;
    return Objects.equals(this.label, configurationPropertyValue.label) &&
        Objects.equals(this.value, configurationPropertyValue.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(label, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfigurationPropertyValue {\n");
    
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

