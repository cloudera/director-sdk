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

package com.cloudera.director.client.v7.model;

import java.util.ArrayList;
import java.util.List;

public class ResourceProviderMetadata {
  /* A list of configuration properties for the resource provider */
  private List<ConfigurationProperty> configurationProperties;
  /* A description for the resource provider */
  private String description;
  /* The ID for the resource provider metadata */
  private String id;
  /* The name of the resource provider */
  private String name;
  /* A list of resource display properties for the resource provider */
  private List<DisplayProperty> resourceDisplayProperties;
  /* A list of template configuration properties for the resource provider */
  private List<ConfigurationProperty> templateProperties;
  /* The type of resource provider */
  private String type;
  public interface Type {
    String COMPUTE = "COMPUTE";
    String DATABASE = "DATABASE";
    String UNKNOWN = "UNKNOWN";
  }
  public ResourceProviderMetadata() { }

  private ResourceProviderMetadata(List<ConfigurationProperty> configurationProperties, String description, String id, String name, List<DisplayProperty> resourceDisplayProperties, List<ConfigurationProperty> templateProperties, String type) {
    this.configurationProperties = configurationProperties;
    this.description = description;
    this.id = id;
    this.name = name;
    this.resourceDisplayProperties = resourceDisplayProperties;
    this.templateProperties = templateProperties;
    this.type = type;
  }

  private ResourceProviderMetadata(ResourceProviderMetadataBuilder builder) {
    this.configurationProperties = builder.configurationProperties;
    this.description = builder.description;
    this.id = builder.id;
    this.name = builder.name;
    this.resourceDisplayProperties = builder.resourceDisplayProperties;
    this.templateProperties = builder.templateProperties;
    this.type = builder.type;
  }

  public static ResourceProviderMetadataBuilder builder() {
    return new ResourceProviderMetadataBuilder();
  }

  public static class ResourceProviderMetadataBuilder {
    private List<ConfigurationProperty> configurationProperties = new ArrayList<ConfigurationProperty>();
    private String description = null;
    private String id = null;
    private String name = null;
    private List<DisplayProperty> resourceDisplayProperties = new ArrayList<DisplayProperty>();
    private List<ConfigurationProperty> templateProperties = new ArrayList<ConfigurationProperty>();
    private String type = null;

    public ResourceProviderMetadataBuilder configurationProperties(List<ConfigurationProperty> configurationProperties) {
      this.configurationProperties = configurationProperties;
      return this;
    }

    public ResourceProviderMetadataBuilder description(String description) {
      this.description = description;
      return this;
    }

    public ResourceProviderMetadataBuilder id(String id) {
      this.id = id;
      return this;
    }

    public ResourceProviderMetadataBuilder name(String name) {
      this.name = name;
      return this;
    }

    public ResourceProviderMetadataBuilder resourceDisplayProperties(List<DisplayProperty> resourceDisplayProperties) {
      this.resourceDisplayProperties = resourceDisplayProperties;
      return this;
    }

    public ResourceProviderMetadataBuilder templateProperties(List<ConfigurationProperty> templateProperties) {
      this.templateProperties = templateProperties;
      return this;
    }

    public ResourceProviderMetadataBuilder type(String type) {
      this.type = type;
      return this;
    }

    public ResourceProviderMetadata build() {
      return new ResourceProviderMetadata(this);
    }
  }

  public ResourceProviderMetadataBuilder toBuilder() {
    return builder()
      .configurationProperties(configurationProperties)
      .description(description)
      .id(id)
      .name(name)
      .resourceDisplayProperties(resourceDisplayProperties)
      .templateProperties(templateProperties)
      .type(type)
      ;
  }
  public List<ConfigurationProperty> getConfigurationProperties() {
    return configurationProperties;
  }
  public void setConfigurationProperties(List<ConfigurationProperty> configurationProperties) {
    this.configurationProperties = configurationProperties;
  }

  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  public List<DisplayProperty> getResourceDisplayProperties() {
    return resourceDisplayProperties;
  }
  public void setResourceDisplayProperties(List<DisplayProperty> resourceDisplayProperties) {
    this.resourceDisplayProperties = resourceDisplayProperties;
  }

  public List<ConfigurationProperty> getTemplateProperties() {
    return templateProperties;
  }
  public void setTemplateProperties(List<ConfigurationProperty> templateProperties) {
    this.templateProperties = templateProperties;
  }

  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    ResourceProviderMetadata other = (ResourceProviderMetadata) o; // NOPMD

    if (configurationProperties != null ?
        !configurationProperties.equals(other.configurationProperties) :
        other.configurationProperties != null) return false;
    if (description != null ?
        !description.equals(other.description) :
        other.description != null) return false;
    if (id != null ?
        !id.equals(other.id) :
        other.id != null) return false;
    if (name != null ?
        !name.equals(other.name) :
        other.name != null) return false;
    if (resourceDisplayProperties != null ?
        !resourceDisplayProperties.equals(other.resourceDisplayProperties) :
        other.resourceDisplayProperties != null) return false;
    if (templateProperties != null ?
        !templateProperties.equals(other.templateProperties) :
        other.templateProperties != null) return false;
    if (type != null ?
        !type.equals(other.type) :
        other.type != null) return false;
    return true;
  }

  @Override
  public int hashCode() {
    int result = 0;
    result = 31 * result + (configurationProperties != null ? configurationProperties.hashCode() : 0);
    result = 31 * result + (description != null ? description.hashCode() : 0);
    result = 31 * result + (id != null ? id.hashCode() : 0);
    result = 31 * result + (name != null ? name.hashCode() : 0);
    result = 31 * result + (resourceDisplayProperties != null ? resourceDisplayProperties.hashCode() : 0);
    result = 31 * result + (templateProperties != null ? templateProperties.hashCode() : 0);
    result = 31 * result + (type != null ? type.hashCode() : 0);
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    String newLine = System.getProperty("line.separator");
    sb.append("class ResourceProviderMetadata {" + newLine);
    sb.append("  configurationProperties: ").append(configurationProperties).append(newLine);
    sb.append("  description: ").append(description).append(newLine);
    sb.append("  id: ").append(id).append(newLine);
    sb.append("  name: ").append(name).append(newLine);
    sb.append("  resourceDisplayProperties: ").append(resourceDisplayProperties).append(newLine);
    sb.append("  templateProperties: ").append(templateProperties).append(newLine);
    sb.append("  type: ").append(type).append(newLine);
    sb.append("}" + newLine);
    return sb.toString();
  }
}

