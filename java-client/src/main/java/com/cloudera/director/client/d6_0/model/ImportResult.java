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


package com.cloudera.director.client.d6_0.model;

import java.util.Objects;
import com.cloudera.director.client.d6_0.model.ImportStatus;
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
 * Results for an import operation
 */
@ApiModel(description = "Results for an import operation")

public class ImportResult {
  @SerializedName("environment")
  private ImportStatus environment = null;
  @SerializedName("deployment")
  private ImportStatus deployment = null;
  @SerializedName("cluster")
  private ImportStatus cluster = null;
  @SerializedName("databaseSevers")
  private List<ImportStatus> databaseSevers = null;

  public ImportResult() {
    // Do nothing
  }

  private ImportResult(ImportResultBuilder builder) {
      this.environment = builder.environment;
      this.deployment = builder.deployment;
      this.cluster = builder.cluster;
      this.databaseSevers = builder.databaseSevers;
    }

  public static ImportResultBuilder builder() {
    return new ImportResultBuilder();
  }

  public static class ImportResultBuilder {
      private ImportStatus environment = null;
      private ImportStatus deployment = null;
      private ImportStatus cluster = null;
      private List<ImportStatus> databaseSevers = new ArrayList<ImportStatus>();
  

    public ImportResultBuilder environment(ImportStatus environment) {
      this.environment = environment;
      return this;
    }


    public ImportResultBuilder deployment(ImportStatus deployment) {
      this.deployment = deployment;
      return this;
    }


    public ImportResultBuilder cluster(ImportStatus cluster) {
      this.cluster = cluster;
      return this;
    }


    public ImportResultBuilder databaseSevers(List<ImportStatus> databaseSevers) {
      this.databaseSevers = databaseSevers;
      return this;
    }


    public ImportResult build() {
      return new ImportResult(this);
    }
  }

  public ImportResultBuilder toBuilder() {
    return builder()
      .environment(environment)
            .deployment(deployment)
            .cluster(cluster)
            .databaseSevers(databaseSevers)
      ;
  }

  public ImportResult environment(ImportStatus environment) {
    this.environment = environment;
    return this;
  }

   /**
   * Environment import status
   * @return environment
  **/
  @ApiModelProperty(required = true, value = "Environment import status")
  public ImportStatus getEnvironment() {
    return environment;
  }

  public void setEnvironment(ImportStatus environment) {
    this.environment = environment;
  }

  public ImportResult deployment(ImportStatus deployment) {
    this.deployment = deployment;
    return this;
  }

   /**
   * Deployment import status
   * @return deployment
  **/
  @ApiModelProperty(required = true, value = "Deployment import status")
  public ImportStatus getDeployment() {
    return deployment;
  }

  public void setDeployment(ImportStatus deployment) {
    this.deployment = deployment;
  }

  public ImportResult cluster(ImportStatus cluster) {
    this.cluster = cluster;
    return this;
  }

   /**
   * Cluster import status
   * @return cluster
  **/
  @ApiModelProperty(required = true, value = "Cluster import status")
  public ImportStatus getCluster() {
    return cluster;
  }

  public void setCluster(ImportStatus cluster) {
    this.cluster = cluster;
  }

  public ImportResult databaseSevers(List<ImportStatus> databaseSevers) {
    this.databaseSevers = databaseSevers;
    return this;
  }

  public ImportResult addDatabaseSeversItem(ImportStatus databaseSeversItem) {
    if (this.databaseSevers == null) {
      this.databaseSevers = new ArrayList<ImportStatus>();
    }
    this.databaseSevers.add(databaseSeversItem);
    return this;
  }

   /**
   * Database servers import statuses
   * @return databaseSevers
  **/
  @ApiModelProperty(value = "Database servers import statuses")
  public List<ImportStatus> getDatabaseSevers() {
    return databaseSevers;
  }

  public void setDatabaseSevers(List<ImportStatus> databaseSevers) {
    this.databaseSevers = databaseSevers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImportResult importResult = (ImportResult) o;
    return Objects.equals(this.environment, importResult.environment) &&
        Objects.equals(this.deployment, importResult.deployment) &&
        Objects.equals(this.cluster, importResult.cluster) &&
        Objects.equals(this.databaseSevers, importResult.databaseSevers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(environment, deployment, cluster, databaseSevers);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImportResult {\n");
    
    sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
    sb.append("    deployment: ").append(toIndentedString(deployment)).append("\n");
    sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
    sb.append("    databaseSevers: ").append(toIndentedString(databaseSevers)).append("\n");
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

