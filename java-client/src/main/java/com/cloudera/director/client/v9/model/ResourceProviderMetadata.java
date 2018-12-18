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
import com.cloudera.director.client.v9.model.ConfigurationProperty;
import com.cloudera.director.client.v9.model.DisplayProperty;
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
 * Metadata about a cloud resource provider
 */
@ApiModel(description = "Metadata about a cloud resource provider")

public class ResourceProviderMetadata {
  @SerializedName("id")
  private String id = null;
  /**
   * Resource provider metadata type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    COMPUTE("COMPUTE"),
    
    DATABASE("DATABASE"),
    
    UNKNOWN("UNKNOWN");

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
  @SerializedName("name")
  private String name = null;
  @SerializedName("description")
  private String description = null;
  @SerializedName("configurationProperties")
  private List<ConfigurationProperty> configurationProperties = null;
  @SerializedName("templateProperties")
  private List<ConfigurationProperty> templateProperties = null;
  @SerializedName("resourceDisplayProperties")
  private List<DisplayProperty> resourceDisplayProperties = null;

  public ResourceProviderMetadata() {
    // Do nothing
  }

  private ResourceProviderMetadata(ResourceProviderMetadataBuilder builder) {
      this.id = builder.id;
      this.type = builder.type;
      this.name = builder.name;
      this.description = builder.description;
      this.configurationProperties = builder.configurationProperties;
      this.templateProperties = builder.templateProperties;
      this.resourceDisplayProperties = builder.resourceDisplayProperties;
    }

  public static ResourceProviderMetadataBuilder builder() {
    return new ResourceProviderMetadataBuilder();
  }

  public static class ResourceProviderMetadataBuilder {
      private String id = null;
      private TypeEnum type = null;
      private String name = null;
      private String description = null;
      private List<ConfigurationProperty> configurationProperties = new ArrayList<ConfigurationProperty>();
      private List<ConfigurationProperty> templateProperties = new ArrayList<ConfigurationProperty>();
      private List<DisplayProperty> resourceDisplayProperties = new ArrayList<DisplayProperty>();
  

    public ResourceProviderMetadataBuilder id(String id) {
      this.id = id;
      return this;
    }


    public ResourceProviderMetadataBuilder type(TypeEnum type) {
      this.type = type;
      return this;
    }


    public ResourceProviderMetadataBuilder name(String name) {
      this.name = name;
      return this;
    }


    public ResourceProviderMetadataBuilder description(String description) {
      this.description = description;
      return this;
    }


    public ResourceProviderMetadataBuilder configurationProperties(List<ConfigurationProperty> configurationProperties) {
      this.configurationProperties = configurationProperties;
      return this;
    }


    public ResourceProviderMetadataBuilder templateProperties(List<ConfigurationProperty> templateProperties) {
      this.templateProperties = templateProperties;
      return this;
    }


    public ResourceProviderMetadataBuilder resourceDisplayProperties(List<DisplayProperty> resourceDisplayProperties) {
      this.resourceDisplayProperties = resourceDisplayProperties;
      return this;
    }


    public ResourceProviderMetadata build() {
      return new ResourceProviderMetadata(this);
    }
  }

  public ResourceProviderMetadataBuilder toBuilder() {
    return builder()
      .id(id)
            .type(type)
            .name(name)
            .description(description)
            .configurationProperties(configurationProperties)
            .templateProperties(templateProperties)
            .resourceDisplayProperties(resourceDisplayProperties)
      ;
  }

  public ResourceProviderMetadata id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Resource provider metadata ID
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Resource provider metadata ID")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ResourceProviderMetadata type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Resource provider metadata type
   * @return type
  **/
  @ApiModelProperty(required = true, value = "Resource provider metadata type")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public ResourceProviderMetadata name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Resource provider name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Resource provider name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ResourceProviderMetadata description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Resource provider description
   * @return description
  **/
  @ApiModelProperty(required = true, value = "Resource provider description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ResourceProviderMetadata configurationProperties(List<ConfigurationProperty> configurationProperties) {
    this.configurationProperties = configurationProperties;
    return this;
  }

  public ResourceProviderMetadata addConfigurationPropertiesItem(ConfigurationProperty configurationPropertiesItem) {
    if (this.configurationProperties == null) {
      this.configurationProperties = new ArrayList<ConfigurationProperty>();
    }
    this.configurationProperties.add(configurationPropertiesItem);
    return this;
  }

   /**
   * Resource provider configuration properties
   * @return configurationProperties
  **/
  @ApiModelProperty(value = "Resource provider configuration properties")
  public List<ConfigurationProperty> getConfigurationProperties() {
    return configurationProperties;
  }

  public void setConfigurationProperties(List<ConfigurationProperty> configurationProperties) {
    this.configurationProperties = configurationProperties;
  }

  public ResourceProviderMetadata templateProperties(List<ConfigurationProperty> templateProperties) {
    this.templateProperties = templateProperties;
    return this;
  }

  public ResourceProviderMetadata addTemplatePropertiesItem(ConfigurationProperty templatePropertiesItem) {
    if (this.templateProperties == null) {
      this.templateProperties = new ArrayList<ConfigurationProperty>();
    }
    this.templateProperties.add(templatePropertiesItem);
    return this;
  }

   /**
   * Template configuration properties
   * @return templateProperties
  **/
  @ApiModelProperty(value = "Template configuration properties")
  public List<ConfigurationProperty> getTemplateProperties() {
    return templateProperties;
  }

  public void setTemplateProperties(List<ConfigurationProperty> templateProperties) {
    this.templateProperties = templateProperties;
  }

  public ResourceProviderMetadata resourceDisplayProperties(List<DisplayProperty> resourceDisplayProperties) {
    this.resourceDisplayProperties = resourceDisplayProperties;
    return this;
  }

  public ResourceProviderMetadata addResourceDisplayPropertiesItem(DisplayProperty resourceDisplayPropertiesItem) {
    if (this.resourceDisplayProperties == null) {
      this.resourceDisplayProperties = new ArrayList<DisplayProperty>();
    }
    this.resourceDisplayProperties.add(resourceDisplayPropertiesItem);
    return this;
  }

   /**
   * Resource provider display properties
   * @return resourceDisplayProperties
  **/
  @ApiModelProperty(value = "Resource provider display properties")
  public List<DisplayProperty> getResourceDisplayProperties() {
    return resourceDisplayProperties;
  }

  public void setResourceDisplayProperties(List<DisplayProperty> resourceDisplayProperties) {
    this.resourceDisplayProperties = resourceDisplayProperties;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResourceProviderMetadata resourceProviderMetadata = (ResourceProviderMetadata) o;
    return Objects.equals(this.id, resourceProviderMetadata.id) &&
        Objects.equals(this.type, resourceProviderMetadata.type) &&
        Objects.equals(this.name, resourceProviderMetadata.name) &&
        Objects.equals(this.description, resourceProviderMetadata.description) &&
        Objects.equals(this.configurationProperties, resourceProviderMetadata.configurationProperties) &&
        Objects.equals(this.templateProperties, resourceProviderMetadata.templateProperties) &&
        Objects.equals(this.resourceDisplayProperties, resourceProviderMetadata.resourceDisplayProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, name, description, configurationProperties, templateProperties, resourceDisplayProperties);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceProviderMetadata {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    configurationProperties: ").append(toIndentedString(configurationProperties)).append("\n");
    sb.append("    templateProperties: ").append(toIndentedString(templateProperties)).append("\n");
    sb.append("    resourceDisplayProperties: ").append(toIndentedString(resourceDisplayProperties)).append("\n");
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

