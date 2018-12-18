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
 * Display property associated with provider metadata
 */
@ApiModel(description = "Display property associated with provider metadata")

public class DisplayProperty {
  @SerializedName("displayKey")
  private String displayKey = null;
  @SerializedName("name")
  private String name = null;
  @SerializedName("description")
  private String description = null;
  @SerializedName("sensitive")
  private Boolean sensitive = null;
  /**
   * Display property type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    BOOLEAN("BOOLEAN"),
    
    INTEGER("INTEGER"),
    
    DOUBLE("DOUBLE"),
    
    STRING("STRING");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("type")
  private TypeEnum type = null;
  /**
   * Widget used to display this property
   */
  @JsonAdapter(WidgetEnum.Adapter.class)
  public enum WidgetEnum {
    RADIO("RADIO"),
    
    CHECKBOX("CHECKBOX"),
    
    TEXT("TEXT"),
    
    PASSWORD("PASSWORD"),
    
    NUMBER("NUMBER"),
    
    TEXTAREA("TEXTAREA"),
    
    FILE("FILE"),
    
    LIST("LIST"),
    
    OPENLIST("OPENLIST"),
    
    MULTI("MULTI"),
    
    OPENMULTI("OPENMULTI");

    private String value;

    WidgetEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static WidgetEnum fromValue(String text) {
      for (WidgetEnum b : WidgetEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<WidgetEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final WidgetEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public WidgetEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return WidgetEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("widget")
  private WidgetEnum widget = null;
  @SerializedName("backingConfigKey")
  private String backingConfigKey = null;

  public DisplayProperty() {
    // Do nothing
  }

  private DisplayProperty(DisplayPropertyBuilder builder) {
      this.displayKey = builder.displayKey;
      this.name = builder.name;
      this.description = builder.description;
      this.sensitive = builder.sensitive;
      this.type = builder.type;
      this.widget = builder.widget;
      this.backingConfigKey = builder.backingConfigKey;
    }

  public static DisplayPropertyBuilder builder() {
    return new DisplayPropertyBuilder();
  }

  public static class DisplayPropertyBuilder {
      private String displayKey = null;
      private String name = null;
      private String description = null;
      private Boolean sensitive = null;
      private TypeEnum type = null;
      private WidgetEnum widget = null;
      private String backingConfigKey = null;
  

    public DisplayPropertyBuilder displayKey(String displayKey) {
      this.displayKey = displayKey;
      return this;
    }


    public DisplayPropertyBuilder name(String name) {
      this.name = name;
      return this;
    }


    public DisplayPropertyBuilder description(String description) {
      this.description = description;
      return this;
    }


    public DisplayPropertyBuilder sensitive(Boolean sensitive) {
      this.sensitive = sensitive;
      return this;
    }


    public DisplayPropertyBuilder type(TypeEnum type) {
      this.type = type;
      return this;
    }


    public DisplayPropertyBuilder widget(WidgetEnum widget) {
      this.widget = widget;
      return this;
    }


    public DisplayPropertyBuilder backingConfigKey(String backingConfigKey) {
      this.backingConfigKey = backingConfigKey;
      return this;
    }


    public DisplayProperty build() {
      return new DisplayProperty(this);
    }
  }

  public DisplayPropertyBuilder toBuilder() {
    return builder()
      .displayKey(displayKey)
            .name(name)
            .description(description)
            .sensitive(sensitive)
            .type(type)
            .widget(widget)
            .backingConfigKey(backingConfigKey)
      ;
  }

  public DisplayProperty displayKey(String displayKey) {
    this.displayKey = displayKey;
    return this;
  }

   /**
   * Display property key
   * @return displayKey
  **/
  @ApiModelProperty(required = true, value = "Display property key")
  public String getDisplayKey() {
    return displayKey;
  }

  public void setDisplayKey(String displayKey) {
    this.displayKey = displayKey;
  }

  public DisplayProperty name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Display property name
   * @return name
  **/
  @ApiModelProperty(value = "Display property name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DisplayProperty description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Display property description
   * @return description
  **/
  @ApiModelProperty(value = "Display property description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public DisplayProperty sensitive(Boolean sensitive) {
    this.sensitive = sensitive;
    return this;
  }

   /**
   * Whether this property is sensitive
   * @return sensitive
  **/
  @ApiModelProperty(value = "Whether this property is sensitive")
  public Boolean isSensitive() {
    return sensitive;
  }

  public void setSensitive(Boolean sensitive) {
    this.sensitive = sensitive;
  }

  public DisplayProperty type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Display property type
   * @return type
  **/
  @ApiModelProperty(value = "Display property type")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public DisplayProperty widget(WidgetEnum widget) {
    this.widget = widget;
    return this;
  }

   /**
   * Widget used to display this property
   * @return widget
  **/
  @ApiModelProperty(value = "Widget used to display this property")
  public WidgetEnum getWidget() {
    return widget;
  }

  public void setWidget(WidgetEnum widget) {
    this.widget = widget;
  }

  public DisplayProperty backingConfigKey(String backingConfigKey) {
    this.backingConfigKey = backingConfigKey;
    return this;
  }

   /**
   * Backing configuration property key
   * @return backingConfigKey
  **/
  @ApiModelProperty(value = "Backing configuration property key")
  public String getBackingConfigKey() {
    return backingConfigKey;
  }

  public void setBackingConfigKey(String backingConfigKey) {
    this.backingConfigKey = backingConfigKey;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DisplayProperty displayProperty = (DisplayProperty) o;
    return Objects.equals(this.displayKey, displayProperty.displayKey) &&
        Objects.equals(this.name, displayProperty.name) &&
        Objects.equals(this.description, displayProperty.description) &&
        Objects.equals(this.sensitive, displayProperty.sensitive) &&
        Objects.equals(this.type, displayProperty.type) &&
        Objects.equals(this.widget, displayProperty.widget) &&
        Objects.equals(this.backingConfigKey, displayProperty.backingConfigKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayKey, name, description, sensitive, type, widget, backingConfigKey);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DisplayProperty {\n");
    
    sb.append("    displayKey: ").append(toIndentedString(displayKey)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    sensitive: ").append(toIndentedString(sensitive)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    widget: ").append(toIndentedString(widget)).append("\n");
    sb.append("    backingConfigKey: ").append(toIndentedString(backingConfigKey)).append("\n");
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

