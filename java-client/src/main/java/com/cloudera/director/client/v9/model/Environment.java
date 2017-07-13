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

package com.cloudera.director.client.v9.model;


public class Environment {
  /* SSH credentials */
  private SshCredentials credentials;
  /* Environment name */
  private String name;
  /* IaaS provider config */
  private InstanceProviderConfig provider;
  public Environment() { }

  private Environment(SshCredentials credentials, String name, InstanceProviderConfig provider) {
    this.credentials = credentials;
    this.name = name;
    this.provider = provider;
  }

  private Environment(EnvironmentBuilder builder) {
    this.credentials = builder.credentials;
    this.name = builder.name;
    this.provider = builder.provider;
  }

  public static EnvironmentBuilder builder() {
    return new EnvironmentBuilder();
  }

  public static class EnvironmentBuilder {
    private SshCredentials credentials = null;
    private String name = null;
    private InstanceProviderConfig provider = null;

    public EnvironmentBuilder credentials(SshCredentials credentials) {
      this.credentials = credentials;
      return this;
    }

    public EnvironmentBuilder name(String name) {
      this.name = name;
      return this;
    }

    public EnvironmentBuilder provider(InstanceProviderConfig provider) {
      this.provider = provider;
      return this;
    }

    public Environment build() {
      return new Environment(this);
    }
  }

  public EnvironmentBuilder toBuilder() {
    return builder()
      .credentials(credentials)
      .name(name)
      .provider(provider)
      ;
  }
  public SshCredentials getCredentials() {
    return credentials;
  }
  public void setCredentials(SshCredentials credentials) {
    this.credentials = credentials;
  }

  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  public InstanceProviderConfig getProvider() {
    return provider;
  }
  public void setProvider(InstanceProviderConfig provider) {
    this.provider = provider;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Environment other = (Environment) o; // NOPMD

    if (credentials != null ?
        !credentials.equals(other.credentials) :
        other.credentials != null) return false;
    if (name != null ?
        !name.equals(other.name) :
        other.name != null) return false;
    if (provider != null ?
        !provider.equals(other.provider) :
        other.provider != null) return false;
    return true;
  }

  @Override
  public int hashCode() {
    int result = 0;
    result = 31 * result + (credentials != null ? credentials.hashCode() : 0);
    result = 31 * result + (name != null ? name.hashCode() : 0);
    result = 31 * result + (provider != null ? provider.hashCode() : 0);
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    String newLine = System.getProperty("line.separator");
    sb.append("class Environment {" + newLine);
    sb.append("  credentials: ").append(credentials).append(newLine);
    sb.append("  name: ").append(name).append(newLine);
    sb.append("  provider: ").append(provider).append(newLine);
    sb.append("}" + newLine);
    return sb.toString();
  }
}

