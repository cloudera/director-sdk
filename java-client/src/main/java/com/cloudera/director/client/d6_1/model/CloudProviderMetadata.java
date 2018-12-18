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


package com.cloudera.director.client.d6_1.model;

import java.util.Objects;
import com.cloudera.director.client.d6_1.model.ConfigurationProperty;
import com.cloudera.director.client.d6_1.model.ResourceProviderMetadata;
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
 * Metadata about a cloud provider
 */
@ApiModel(description = "Metadata about a cloud provider")

public class CloudProviderMetadata {
  @SerializedName("id")
  private String id = null;
  @SerializedName("name")
  private String name = null;
  @SerializedName("description")
  private String description = null;
  @SerializedName("configurationProperties")
  private List<ConfigurationProperty> configurationProperties = null;
  @SerializedName("credentialsProperties")
  private List<ConfigurationProperty> credentialsProperties = null;
  @SerializedName("resourceProviders")
  private List<ResourceProviderMetadata> resourceProviders = null;

  public CloudProviderMetadata() {
    // Do nothing
  }

  private CloudProviderMetadata(CloudProviderMetadataBuilder builder) {
      this.id = builder.id;
      this.name = builder.name;
      this.description = builder.description;
      this.configurationProperties = builder.configurationProperties;
      this.credentialsProperties = builder.credentialsProperties;
      this.resourceProviders = builder.resourceProviders;
    }

  public static CloudProviderMetadataBuilder builder() {
    return new CloudProviderMetadataBuilder();
  }

  public static class CloudProviderMetadataBuilder {
      private String id = null;
      private String name = null;
      private String description = null;
      private List<ConfigurationProperty> configurationProperties = new ArrayList<ConfigurationProperty>();
      private List<ConfigurationProperty> credentialsProperties = new ArrayList<ConfigurationProperty>();
      private List<ResourceProviderMetadata> resourceProviders = new ArrayList<ResourceProviderMetadata>();
  

    public CloudProviderMetadataBuilder id(String id) {
      this.id = id;
      return this;
    }


    public CloudProviderMetadataBuilder name(String name) {
      this.name = name;
      return this;
    }


    public CloudProviderMetadataBuilder description(String description) {
      this.description = description;
      return this;
    }


    public CloudProviderMetadataBuilder configurationProperties(List<ConfigurationProperty> configurationProperties) {
      this.configurationProperties = configurationProperties;
      return this;
    }


    public CloudProviderMetadataBuilder credentialsProperties(List<ConfigurationProperty> credentialsProperties) {
      this.credentialsProperties = credentialsProperties;
      return this;
    }


    public CloudProviderMetadataBuilder resourceProviders(List<ResourceProviderMetadata> resourceProviders) {
      this.resourceProviders = resourceProviders;
      return this;
    }


    public CloudProviderMetadata build() {
      return new CloudProviderMetadata(this);
    }
  }

  public CloudProviderMetadataBuilder toBuilder() {
    return builder()
      .id(id)
            .name(name)
            .description(description)
            .configurationProperties(configurationProperties)
            .credentialsProperties(credentialsProperties)
            .resourceProviders(resourceProviders)
      ;
  }

  public CloudProviderMetadata id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Cloud provider metadata ID
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Cloud provider metadata ID")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CloudProviderMetadata name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Cloud provider name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Cloud provider name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CloudProviderMetadata description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Cloud provider description
   * @return description
  **/
  @ApiModelProperty(required = true, value = "Cloud provider description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CloudProviderMetadata configurationProperties(List<ConfigurationProperty> configurationProperties) {
    this.configurationProperties = configurationProperties;
    return this;
  }

  public CloudProviderMetadata addConfigurationPropertiesItem(ConfigurationProperty configurationPropertiesItem) {
    if (this.configurationProperties == null) {
      this.configurationProperties = new ArrayList<ConfigurationProperty>();
    }
    this.configurationProperties.add(configurationPropertiesItem);
    return this;
  }

   /**
   * Cloud provider configuration properties
   * @return configurationProperties
  **/
  @ApiModelProperty(value = "Cloud provider configuration properties")
  public List<ConfigurationProperty> getConfigurationProperties() {
    return configurationProperties;
  }

  public void setConfigurationProperties(List<ConfigurationProperty> configurationProperties) {
    this.configurationProperties = configurationProperties;
  }

  public CloudProviderMetadata credentialsProperties(List<ConfigurationProperty> credentialsProperties) {
    this.credentialsProperties = credentialsProperties;
    return this;
  }

  public CloudProviderMetadata addCredentialsPropertiesItem(ConfigurationProperty credentialsPropertiesItem) {
    if (this.credentialsProperties == null) {
      this.credentialsProperties = new ArrayList<ConfigurationProperty>();
    }
    this.credentialsProperties.add(credentialsPropertiesItem);
    return this;
  }

   /**
   * Credential configuration properties
   * @return credentialsProperties
  **/
  @ApiModelProperty(value = "Credential configuration properties")
  public List<ConfigurationProperty> getCredentialsProperties() {
    return credentialsProperties;
  }

  public void setCredentialsProperties(List<ConfigurationProperty> credentialsProperties) {
    this.credentialsProperties = credentialsProperties;
  }

  public CloudProviderMetadata resourceProviders(List<ResourceProviderMetadata> resourceProviders) {
    this.resourceProviders = resourceProviders;
    return this;
  }

  public CloudProviderMetadata addResourceProvidersItem(ResourceProviderMetadata resourceProvidersItem) {
    if (this.resourceProviders == null) {
      this.resourceProviders = new ArrayList<ResourceProviderMetadata>();
    }
    this.resourceProviders.add(resourceProvidersItem);
    return this;
  }

   /**
   * Resource provider metadata
   * @return resourceProviders
  **/
  @ApiModelProperty(value = "Resource provider metadata")
  public List<ResourceProviderMetadata> getResourceProviders() {
    return resourceProviders;
  }

  public void setResourceProviders(List<ResourceProviderMetadata> resourceProviders) {
    this.resourceProviders = resourceProviders;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CloudProviderMetadata cloudProviderMetadata = (CloudProviderMetadata) o;
    return Objects.equals(this.id, cloudProviderMetadata.id) &&
        Objects.equals(this.name, cloudProviderMetadata.name) &&
        Objects.equals(this.description, cloudProviderMetadata.description) &&
        Objects.equals(this.configurationProperties, cloudProviderMetadata.configurationProperties) &&
        Objects.equals(this.credentialsProperties, cloudProviderMetadata.credentialsProperties) &&
        Objects.equals(this.resourceProviders, cloudProviderMetadata.resourceProviders);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, configurationProperties, credentialsProperties, resourceProviders);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloudProviderMetadata {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    configurationProperties: ").append(toIndentedString(configurationProperties)).append("\n");
    sb.append("    credentialsProperties: ").append(toIndentedString(credentialsProperties)).append("\n");
    sb.append("    resourceProviders: ").append(toIndentedString(resourceProviders)).append("\n");
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

