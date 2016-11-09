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

package com.cloudera.director.client.v6.model;


public class ExternalDatabaseTemplate {
  /* External database name prefix */
  private String databaseNamePrefix;
  /* External database server name */
  private String databaseServerName;
  /* External database name */
  private String name;
  /* External database username prefix */
  private String usernamePrefix;
  public ExternalDatabaseTemplate() { }

  private ExternalDatabaseTemplate(String databaseNamePrefix, String databaseServerName, String name, String usernamePrefix) {
    this.databaseNamePrefix = databaseNamePrefix;
    this.databaseServerName = databaseServerName;
    this.name = name;
    this.usernamePrefix = usernamePrefix;
  }

  private ExternalDatabaseTemplate(ExternalDatabaseTemplateBuilder builder) {
    this.databaseNamePrefix = builder.databaseNamePrefix;
    this.databaseServerName = builder.databaseServerName;
    this.name = builder.name;
    this.usernamePrefix = builder.usernamePrefix;
  }

  public static ExternalDatabaseTemplateBuilder builder() {
    return new ExternalDatabaseTemplateBuilder();
  }

  public static class ExternalDatabaseTemplateBuilder {
    private String databaseNamePrefix = null;
    private String databaseServerName = null;
    private String name = null;
    private String usernamePrefix = null;

    public ExternalDatabaseTemplateBuilder databaseNamePrefix(String databaseNamePrefix) {
      this.databaseNamePrefix = databaseNamePrefix;
      return this;
    }

    public ExternalDatabaseTemplateBuilder databaseServerName(String databaseServerName) {
      this.databaseServerName = databaseServerName;
      return this;
    }

    public ExternalDatabaseTemplateBuilder name(String name) {
      this.name = name;
      return this;
    }

    public ExternalDatabaseTemplateBuilder usernamePrefix(String usernamePrefix) {
      this.usernamePrefix = usernamePrefix;
      return this;
    }

    public ExternalDatabaseTemplate build() {
      return new ExternalDatabaseTemplate(this);
    }
  }

  public ExternalDatabaseTemplateBuilder toBuilder() {
    return builder()
      .databaseNamePrefix(databaseNamePrefix)
      .databaseServerName(databaseServerName)
      .name(name)
      .usernamePrefix(usernamePrefix)
      ;
  }
  public String getDatabaseNamePrefix() {
    return databaseNamePrefix;
  }
  public void setDatabaseNamePrefix(String databaseNamePrefix) {
    this.databaseNamePrefix = databaseNamePrefix;
  }

  public String getDatabaseServerName() {
    return databaseServerName;
  }
  public void setDatabaseServerName(String databaseServerName) {
    this.databaseServerName = databaseServerName;
  }

  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  public String getUsernamePrefix() {
    return usernamePrefix;
  }
  public void setUsernamePrefix(String usernamePrefix) {
    this.usernamePrefix = usernamePrefix;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    ExternalDatabaseTemplate other = (ExternalDatabaseTemplate) o; // NOPMD

    if (databaseNamePrefix != null ?
        !databaseNamePrefix.equals(other.databaseNamePrefix) :
        other.databaseNamePrefix != null) return false;
    if (databaseServerName != null ?
        !databaseServerName.equals(other.databaseServerName) :
        other.databaseServerName != null) return false;
    if (name != null ?
        !name.equals(other.name) :
        other.name != null) return false;
    if (usernamePrefix != null ?
        !usernamePrefix.equals(other.usernamePrefix) :
        other.usernamePrefix != null) return false;
    return true;
  }

  @Override
  public int hashCode() {
    int result = 0;
    result = 31 * result + (databaseNamePrefix != null ? databaseNamePrefix.hashCode() : 0);
    result = 31 * result + (databaseServerName != null ? databaseServerName.hashCode() : 0);
    result = 31 * result + (name != null ? name.hashCode() : 0);
    result = 31 * result + (usernamePrefix != null ? usernamePrefix.hashCode() : 0);
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    String newLine = System.getProperty("line.separator");
    sb.append("class ExternalDatabaseTemplate {" + newLine);
    sb.append("  databaseNamePrefix: ").append(databaseNamePrefix).append(newLine);
    sb.append("  databaseServerName: ").append(databaseServerName).append(newLine);
    sb.append("  name: ").append(name).append(newLine);
    sb.append("  usernamePrefix: ").append(usernamePrefix).append(newLine);
    sb.append("}" + newLine);
    return sb.toString();
  }
}

