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

import java.util.ArrayList;
import java.util.List;

public class ImportResult {
  /* Cluster import status */
  private ImportStatus cluster;
  /* Database servers import status */
  private List<ImportStatus> databaseSevers;
  /* Deployment import status */
  private ImportStatus deployment;
  /* Environment import status */
  private ImportStatus environment;
  public ImportResult() { }

  private ImportResult(ImportStatus cluster, List<ImportStatus> databaseSevers, ImportStatus deployment, ImportStatus environment) {
    this.cluster = cluster;
    this.databaseSevers = databaseSevers;
    this.deployment = deployment;
    this.environment = environment;
  }

  private ImportResult(ImportResultBuilder builder) {
    this.cluster = builder.cluster;
    this.databaseSevers = builder.databaseSevers;
    this.deployment = builder.deployment;
    this.environment = builder.environment;
  }

  public static ImportResultBuilder builder() {
    return new ImportResultBuilder();
  }

  public static class ImportResultBuilder {
    private ImportStatus cluster = null;
    private List<ImportStatus> databaseSevers = new ArrayList<ImportStatus>();
    private ImportStatus deployment = null;
    private ImportStatus environment = null;

    public ImportResultBuilder cluster(ImportStatus cluster) {
      this.cluster = cluster;
      return this;
    }

    public ImportResultBuilder databaseSevers(List<ImportStatus> databaseSevers) {
      this.databaseSevers = databaseSevers;
      return this;
    }

    public ImportResultBuilder deployment(ImportStatus deployment) {
      this.deployment = deployment;
      return this;
    }

    public ImportResultBuilder environment(ImportStatus environment) {
      this.environment = environment;
      return this;
    }

    public ImportResult build() {
      return new ImportResult(this);
    }
  }

  public ImportResultBuilder toBuilder() {
    return builder()
      .cluster(cluster)
      .databaseSevers(databaseSevers)
      .deployment(deployment)
      .environment(environment)
      ;
  }
  public ImportStatus getCluster() {
    return cluster;
  }
  public void setCluster(ImportStatus cluster) {
    this.cluster = cluster;
  }

  public List<ImportStatus> getDatabaseSevers() {
    return databaseSevers;
  }
  public void setDatabaseSevers(List<ImportStatus> databaseSevers) {
    this.databaseSevers = databaseSevers;
  }

  public ImportStatus getDeployment() {
    return deployment;
  }
  public void setDeployment(ImportStatus deployment) {
    this.deployment = deployment;
  }

  public ImportStatus getEnvironment() {
    return environment;
  }
  public void setEnvironment(ImportStatus environment) {
    this.environment = environment;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    ImportResult other = (ImportResult) o; // NOPMD

    if (cluster != null ?
        !cluster.equals(other.cluster) :
        other.cluster != null) return false;
    if (databaseSevers != null ?
        !databaseSevers.equals(other.databaseSevers) :
        other.databaseSevers != null) return false;
    if (deployment != null ?
        !deployment.equals(other.deployment) :
        other.deployment != null) return false;
    if (environment != null ?
        !environment.equals(other.environment) :
        other.environment != null) return false;
    return true;
  }

  @Override
  public int hashCode() {
    int result = 0;
    result = 31 * result + (cluster != null ? cluster.hashCode() : 0);
    result = 31 * result + (databaseSevers != null ? databaseSevers.hashCode() : 0);
    result = 31 * result + (deployment != null ? deployment.hashCode() : 0);
    result = 31 * result + (environment != null ? environment.hashCode() : 0);
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    String newLine = System.getProperty("line.separator");
    sb.append("class ImportResult {" + newLine);
    sb.append("  cluster: ").append(cluster).append(newLine);
    sb.append("  databaseSevers: ").append(databaseSevers).append(newLine);
    sb.append("  deployment: ").append(deployment).append(newLine);
    sb.append("  environment: ").append(environment).append(newLine);
    sb.append("}" + newLine);
    return sb.toString();
  }
}

