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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Details on users of an external database server
 */
@ApiModel(description = "Details on users of an external database server")

public class ExternalDatabaseServerUsage {
  @SerializedName("deployments")
  private List<String> deployments = null;
  @SerializedName("clusters")
  private Map<String, List<String>> clusters = null;

  public ExternalDatabaseServerUsage() {
    // Do nothing
  }

  private ExternalDatabaseServerUsage(ExternalDatabaseServerUsageBuilder builder) {
      this.deployments = builder.deployments;
      this.clusters = builder.clusters;
    }

  public static ExternalDatabaseServerUsageBuilder builder() {
    return new ExternalDatabaseServerUsageBuilder();
  }

  public static class ExternalDatabaseServerUsageBuilder {
      private List<String> deployments = new ArrayList<String>();
      private Map<String, List<String>> clusters = new HashMap<String, List<String>>();
  

    public ExternalDatabaseServerUsageBuilder deployments(List<String> deployments) {
      this.deployments = deployments;
      return this;
    }


    public ExternalDatabaseServerUsageBuilder clusters(Map<String, List<String>> clusters) {
      this.clusters = clusters;
      return this;
    }


    public ExternalDatabaseServerUsage build() {
      return new ExternalDatabaseServerUsage(this);
    }
  }

  public ExternalDatabaseServerUsageBuilder toBuilder() {
    return builder()
      .deployments(deployments)
            .clusters(clusters)
      ;
  }

  public ExternalDatabaseServerUsage deployments(List<String> deployments) {
    this.deployments = deployments;
    return this;
  }

  public ExternalDatabaseServerUsage addDeploymentsItem(String deploymentsItem) {
    if (this.deployments == null) {
      this.deployments = new ArrayList<String>();
    }
    this.deployments.add(deploymentsItem);
    return this;
  }

   /**
   * Deployments that use the specified database server
   * @return deployments
  **/
  @ApiModelProperty(value = "Deployments that use the specified database server")
  public List<String> getDeployments() {
    return deployments;
  }

  public void setDeployments(List<String> deployments) {
    this.deployments = deployments;
  }

  public ExternalDatabaseServerUsage clusters(Map<String, List<String>> clusters) {
    this.clusters = clusters;
    return this;
  }

  public ExternalDatabaseServerUsage putClustersItem(String key, List<String> clustersItem) {
    if (this.clusters == null) {
      this.clusters = new HashMap<String, List<String>>();
    }
    this.clusters.put(key, clustersItem);
    return this;
  }

   /**
   * Clusters that use the specified database server, by deployment
   * @return clusters
  **/
  @ApiModelProperty(value = "Clusters that use the specified database server, by deployment")
  public Map<String, List<String>> getClusters() {
    return clusters;
  }

  public void setClusters(Map<String, List<String>> clusters) {
    this.clusters = clusters;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExternalDatabaseServerUsage externalDatabaseServerUsage = (ExternalDatabaseServerUsage) o;
    return Objects.equals(this.deployments, externalDatabaseServerUsage.deployments) &&
        Objects.equals(this.clusters, externalDatabaseServerUsage.clusters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deployments, clusters);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalDatabaseServerUsage {\n");
    
    sb.append("    deployments: ").append(toIndentedString(deployments)).append("\n");
    sb.append("    clusters: ").append(toIndentedString(clusters)).append("\n");
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

