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
import com.cloudera.director.client.v9.model.ConfigurationPropertyValue;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * A configuration property associated with provider metadata
 */
@ApiModel(description = "A configuration property associated with provider metadata")

public class ConfigurationProperty {
  @SerializedName("configKey")
  private String configKey = null;
  @SerializedName("name")
  private String name = null;
  @SerializedName("description")
  private String description = null;
  @SerializedName("sensitive")
  private Boolean sensitive = null;
  @SerializedName("required")
  private Boolean required = null;
  @SerializedName("basic")
  private Boolean basic = null;
  /**
   * Configuration property type
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
  @SerializedName("defaultValue")
  private String defaultValue = null;
  @SerializedName("listSeparator")
  private String listSeparator = null;
  @SerializedName("placeholder")
  private String placeholder = null;
  @SerializedName("validValues")
  private List<ConfigurationPropertyValue> validValues = null;

  public ConfigurationProperty() {
    // Do nothing
  }

  private ConfigurationProperty(ConfigurationPropertyBuilder builder) {
      this.configKey = builder.configKey;
      this.name = builder.name;
      this.description = builder.description;
      this.sensitive = builder.sensitive;
      this.required = builder.required;
      this.basic = builder.basic;
      this.type = builder.type;
      this.widget = builder.widget;
      this.defaultValue = builder.defaultValue;
      this.listSeparator = builder.listSeparator;
      this.placeholder = builder.placeholder;
      this.validValues = builder.validValues;
    }

  public static ConfigurationPropertyBuilder builder() {
    return new ConfigurationPropertyBuilder();
  }

  public static class ConfigurationPropertyBuilder {
      private String configKey = null;
      private String name = null;
      private String description = null;
      private Boolean sensitive = null;
      private Boolean required = null;
      private Boolean basic = null;
      private TypeEnum type = null;
      private WidgetEnum widget = null;
      private String defaultValue = null;
      private String listSeparator = null;
      private String placeholder = null;
      private List<ConfigurationPropertyValue> validValues = new ArrayList<ConfigurationPropertyValue>();
  

    public ConfigurationPropertyBuilder configKey(String configKey) {
      this.configKey = configKey;
      return this;
    }


    public ConfigurationPropertyBuilder name(String name) {
      this.name = name;
      return this;
    }


    public ConfigurationPropertyBuilder description(String description) {
      this.description = description;
      return this;
    }


    public ConfigurationPropertyBuilder sensitive(Boolean sensitive) {
      this.sensitive = sensitive;
      return this;
    }


    public ConfigurationPropertyBuilder required(Boolean required) {
      this.required = required;
      return this;
    }


    public ConfigurationPropertyBuilder basic(Boolean basic) {
      this.basic = basic;
      return this;
    }


    public ConfigurationPropertyBuilder type(TypeEnum type) {
      this.type = type;
      return this;
    }


    public ConfigurationPropertyBuilder widget(WidgetEnum widget) {
      this.widget = widget;
      return this;
    }


    public ConfigurationPropertyBuilder defaultValue(String defaultValue) {
      this.defaultValue = defaultValue;
      return this;
    }


    public ConfigurationPropertyBuilder listSeparator(String listSeparator) {
      this.listSeparator = listSeparator;
      return this;
    }


    public ConfigurationPropertyBuilder placeholder(String placeholder) {
      this.placeholder = placeholder;
      return this;
    }


    public ConfigurationPropertyBuilder validValues(List<ConfigurationPropertyValue> validValues) {
      this.validValues = validValues;
      return this;
    }


    public ConfigurationProperty build() {
      return new ConfigurationProperty(this);
    }
  }

  public ConfigurationPropertyBuilder toBuilder() {
    return builder()
      .configKey(configKey)
            .name(name)
            .description(description)
            .sensitive(sensitive)
            .required(required)
            .basic(basic)
            .type(type)
            .widget(widget)
            .defaultValue(defaultValue)
            .listSeparator(listSeparator)
            .placeholder(placeholder)
            .validValues(validValues)
      ;
  }

  public ConfigurationProperty configKey(String configKey) {
    this.configKey = configKey;
    return this;
  }

   /**
   * Configuration property key
   * @return configKey
  **/
  @ApiModelProperty(required = true, value = "Configuration property key")
  public String getConfigKey() {
    return configKey;
  }

  public void setConfigKey(String configKey) {
    this.configKey = configKey;
  }

  public ConfigurationProperty name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Configuration property name
   * @return name
  **/
  @ApiModelProperty(value = "Configuration property name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ConfigurationProperty description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Configuration property description
   * @return description
  **/
  @ApiModelProperty(value = "Configuration property description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ConfigurationProperty sensitive(Boolean sensitive) {
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

  public ConfigurationProperty required(Boolean required) {
    this.required = required;
    return this;
  }

   /**
   * Whether this property is required
   * @return required
  **/
  @ApiModelProperty(value = "Whether this property is required")
  public Boolean isRequired() {
    return required;
  }

  public void setRequired(Boolean required) {
    this.required = required;
  }

  public ConfigurationProperty basic(Boolean basic) {
    this.basic = basic;
    return this;
  }

   /**
   * Whether this property is basic
   * @return basic
  **/
  @ApiModelProperty(value = "Whether this property is basic")
  public Boolean isBasic() {
    return basic;
  }

  public void setBasic(Boolean basic) {
    this.basic = basic;
  }

  public ConfigurationProperty type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Configuration property type
   * @return type
  **/
  @ApiModelProperty(value = "Configuration property type")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public ConfigurationProperty widget(WidgetEnum widget) {
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

  public ConfigurationProperty defaultValue(String defaultValue) {
    this.defaultValue = defaultValue;
    return this;
  }

   /**
   * Default value for this property
   * @return defaultValue
  **/
  @ApiModelProperty(value = "Default value for this property")
  public String getDefaultValue() {
    return defaultValue;
  }

  public void setDefaultValue(String defaultValue) {
    this.defaultValue = defaultValue;
  }

  public ConfigurationProperty listSeparator(String listSeparator) {
    this.listSeparator = listSeparator;
    return this;
  }

   /**
   * Character to use to separate lists
   * @return listSeparator
  **/
  @ApiModelProperty(value = "Character to use to separate lists")
  public String getListSeparator() {
    return listSeparator;
  }

  public void setListSeparator(String listSeparator) {
    this.listSeparator = listSeparator;
  }

  public ConfigurationProperty placeholder(String placeholder) {
    this.placeholder = placeholder;
    return this;
  }

   /**
   * Placeholder value to use if the value is unset
   * @return placeholder
  **/
  @ApiModelProperty(value = "Placeholder value to use if the value is unset")
  public String getPlaceholder() {
    return placeholder;
  }

  public void setPlaceholder(String placeholder) {
    this.placeholder = placeholder;
  }

  public ConfigurationProperty validValues(List<ConfigurationPropertyValue> validValues) {
    this.validValues = validValues;
    return this;
  }

  public ConfigurationProperty addValidValuesItem(ConfigurationPropertyValue validValuesItem) {
    if (this.validValues == null) {
      this.validValues = new ArrayList<ConfigurationPropertyValue>();
    }
    this.validValues.add(validValuesItem);
    return this;
  }

   /**
   * List of all valid values for this property
   * @return validValues
  **/
  @ApiModelProperty(value = "List of all valid values for this property")
  public List<ConfigurationPropertyValue> getValidValues() {
    return validValues;
  }

  public void setValidValues(List<ConfigurationPropertyValue> validValues) {
    this.validValues = validValues;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfigurationProperty configurationProperty = (ConfigurationProperty) o;
    return Objects.equals(this.configKey, configurationProperty.configKey) &&
        Objects.equals(this.name, configurationProperty.name) &&
        Objects.equals(this.description, configurationProperty.description) &&
        Objects.equals(this.sensitive, configurationProperty.sensitive) &&
        Objects.equals(this.required, configurationProperty.required) &&
        Objects.equals(this.basic, configurationProperty.basic) &&
        Objects.equals(this.type, configurationProperty.type) &&
        Objects.equals(this.widget, configurationProperty.widget) &&
        Objects.equals(this.defaultValue, configurationProperty.defaultValue) &&
        Objects.equals(this.listSeparator, configurationProperty.listSeparator) &&
        Objects.equals(this.placeholder, configurationProperty.placeholder) &&
        Objects.equals(this.validValues, configurationProperty.validValues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(configKey, name, description, sensitive, required, basic, type, widget, defaultValue, listSeparator, placeholder, validValues);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfigurationProperty {\n");
    
    sb.append("    configKey: ").append(toIndentedString(configKey)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    sensitive: ").append(toIndentedString(sensitive)).append("\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
    sb.append("    basic: ").append(toIndentedString(basic)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    widget: ").append(toIndentedString(widget)).append("\n");
    sb.append("    defaultValue: ").append(toIndentedString(defaultValue)).append("\n");
    sb.append("    listSeparator: ").append(toIndentedString(listSeparator)).append("\n");
    sb.append("    placeholder: ").append(toIndentedString(placeholder)).append("\n");
    sb.append("    validValues: ").append(toIndentedString(validValues)).append("\n");
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

