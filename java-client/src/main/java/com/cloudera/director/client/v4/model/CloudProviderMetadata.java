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

package com.cloudera.director.client.v4.model;

import java.util.ArrayList;
import java.util.List;

public class CloudProviderMetadata {
  /* Cloud provider configuration properties */
  private List<ConfigurationProperty> configurationProperties;
  /* Credential configuration properties */
  private List<ConfigurationProperty> credentialsProperties;
  /* Cloud provider description */
  private String description;
  /* Cloud provider metadata ID */
  private String id;
  /* Cloud provider name */
  private String name;
  /* Resource providers */
  private List<ResourceProviderMetadata> resourceProviders;
  public CloudProviderMetadata() { }

  private CloudProviderMetadata(List<ConfigurationProperty> configurationProperties, List<ConfigurationProperty> credentialsProperties, String description, String id, String name, List<ResourceProviderMetadata> resourceProviders) {
    this.configurationProperties = configurationProperties;
    this.credentialsProperties = credentialsProperties;
    this.description = description;
    this.id = id;
    this.name = name;
    this.resourceProviders = resourceProviders;
  }

  private CloudProviderMetadata(CloudProviderMetadataBuilder builder) {
    this.configurationProperties = builder.configurationProperties;
    this.credentialsProperties = builder.credentialsProperties;
    this.description = builder.description;
    this.id = builder.id;
    this.name = builder.name;
    this.resourceProviders = builder.resourceProviders;
  }

  public static CloudProviderMetadataBuilder builder() {
    return new CloudProviderMetadataBuilder();
  }

  public static class CloudProviderMetadataBuilder {
    private List<ConfigurationProperty> configurationProperties = new ArrayList<ConfigurationProperty>();
    private List<ConfigurationProperty> credentialsProperties = new ArrayList<ConfigurationProperty>();
    private String description = null;
    private String id = null;
    private String name = null;
    private List<ResourceProviderMetadata> resourceProviders = new ArrayList<ResourceProviderMetadata>();

    public CloudProviderMetadataBuilder configurationProperties(List<ConfigurationProperty> configurationProperties) {
      this.configurationProperties = configurationProperties;
      return this;
    }

    public CloudProviderMetadataBuilder credentialsProperties(List<ConfigurationProperty> credentialsProperties) {
      this.credentialsProperties = credentialsProperties;
      return this;
    }

    public CloudProviderMetadataBuilder description(String description) {
      this.description = description;
      return this;
    }

    public CloudProviderMetadataBuilder id(String id) {
      this.id = id;
      return this;
    }

    public CloudProviderMetadataBuilder name(String name) {
      this.name = name;
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
      .configurationProperties(configurationProperties)
      .credentialsProperties(credentialsProperties)
      .description(description)
      .id(id)
      .name(name)
      .resourceProviders(resourceProviders)
      ;
  }
  public List<ConfigurationProperty> getConfigurationProperties() {
    return configurationProperties;
  }
  public void setConfigurationProperties(List<ConfigurationProperty> configurationProperties) {
    this.configurationProperties = configurationProperties;
  }

  public List<ConfigurationProperty> getCredentialsProperties() {
    return credentialsProperties;
  }
  public void setCredentialsProperties(List<ConfigurationProperty> credentialsProperties) {
    this.credentialsProperties = credentialsProperties;
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

  public List<ResourceProviderMetadata> getResourceProviders() {
    return resourceProviders;
  }
  public void setResourceProviders(List<ResourceProviderMetadata> resourceProviders) {
    this.resourceProviders = resourceProviders;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    CloudProviderMetadata other = (CloudProviderMetadata) o; // NOPMD

    if (configurationProperties != null ?
        !configurationProperties.equals(other.configurationProperties) :
        other.configurationProperties != null) return false;
    if (credentialsProperties != null ?
        !credentialsProperties.equals(other.credentialsProperties) :
        other.credentialsProperties != null) return false;
    if (description != null ?
        !description.equals(other.description) :
        other.description != null) return false;
    if (id != null ?
        !id.equals(other.id) :
        other.id != null) return false;
    if (name != null ?
        !name.equals(other.name) :
        other.name != null) return false;
    if (resourceProviders != null ?
        !resourceProviders.equals(other.resourceProviders) :
        other.resourceProviders != null) return false;
    return true;
  }

  @Override
  public int hashCode() {
    int result = 0;
    result = 31 * result + (configurationProperties != null ? configurationProperties.hashCode() : 0);
    result = 31 * result + (credentialsProperties != null ? credentialsProperties.hashCode() : 0);
    result = 31 * result + (description != null ? description.hashCode() : 0);
    result = 31 * result + (id != null ? id.hashCode() : 0);
    result = 31 * result + (name != null ? name.hashCode() : 0);
    result = 31 * result + (resourceProviders != null ? resourceProviders.hashCode() : 0);
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    String newLine = System.getProperty("line.separator");
    sb.append("class CloudProviderMetadata {" + newLine);
    sb.append("  configurationProperties: ").append(configurationProperties).append(newLine);
    sb.append("  credentialsProperties: ").append(credentialsProperties).append(newLine);
    sb.append("  description: ").append(description).append(newLine);
    sb.append("  id: ").append(id).append(newLine);
    sb.append("  name: ").append(name).append(newLine);
    sb.append("  resourceProviders: ").append(resourceProviders).append(newLine);
    sb.append("}" + newLine);
    return sb.toString();
  }
}

