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


package com.cloudera.director.client.v6.model;

import java.util.Objects;
import com.cloudera.director.client.v6.model.InstanceProviderConfig;
import com.cloudera.director.client.v6.model.SshCredentials;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * A cloud provider environment
 */
@ApiModel(description = "A cloud provider environment")

public class Environment {
  @SerializedName("name")
  private String name = null;
  @SerializedName("provider")
  private InstanceProviderConfig provider = null;
  @SerializedName("credentials")
  private SshCredentials credentials = null;

  public Environment() {
    // Do nothing
  }

  private Environment(EnvironmentBuilder builder) {
      this.name = builder.name;
      this.provider = builder.provider;
      this.credentials = builder.credentials;
    }

  public static EnvironmentBuilder builder() {
    return new EnvironmentBuilder();
  }

  public static class EnvironmentBuilder {
      private String name = null;
      private InstanceProviderConfig provider = null;
      private SshCredentials credentials = null;
  

    public EnvironmentBuilder name(String name) {
      this.name = name;
      return this;
    }


    public EnvironmentBuilder provider(InstanceProviderConfig provider) {
      this.provider = provider;
      return this;
    }


    public EnvironmentBuilder credentials(SshCredentials credentials) {
      this.credentials = credentials;
      return this;
    }


    public Environment build() {
      return new Environment(this);
    }
  }

  public EnvironmentBuilder toBuilder() {
    return builder()
      .name(name)
            .provider(provider)
            .credentials(credentials)
      ;
  }

  public Environment name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Environment name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Environment name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Environment provider(InstanceProviderConfig provider) {
    this.provider = provider;
    return this;
  }

   /**
   * Cloud provider configuration
   * @return provider
  **/
  @ApiModelProperty(required = true, value = "Cloud provider configuration")
  public InstanceProviderConfig getProvider() {
    return provider;
  }

  public void setProvider(InstanceProviderConfig provider) {
    this.provider = provider;
  }

  public Environment credentials(SshCredentials credentials) {
    this.credentials = credentials;
    return this;
  }

   /**
   * SSH credentials for instance access
   * @return credentials
  **/
  @ApiModelProperty(required = true, value = "SSH credentials for instance access")
  public SshCredentials getCredentials() {
    return credentials;
  }

  public void setCredentials(SshCredentials credentials) {
    this.credentials = credentials;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Environment environment = (Environment) o;
    return Objects.equals(this.name, environment.name) &&
        Objects.equals(this.provider, environment.provider) &&
        Objects.equals(this.credentials, environment.credentials);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, provider, credentials);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Environment {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    credentials: ").append(toIndentedString(credentials)).append("\n");
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

