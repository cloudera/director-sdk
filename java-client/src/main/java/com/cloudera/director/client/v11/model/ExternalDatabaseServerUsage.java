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

package com.cloudera.director.client.v11.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ExternalDatabaseServerUsage {
  /* Clusters that use the specified database */
  private Map<String, List<String>> clusters;
  /* Deployments that use the specified database */
  private Set<String> deployments;
  public ExternalDatabaseServerUsage() { }

  private ExternalDatabaseServerUsage(Map<String, List<String>> clusters, Set<String> deployments) {
    this.clusters = clusters;
    this.deployments = deployments;
  }

  private ExternalDatabaseServerUsage(ExternalDatabaseServerUsageBuilder builder) {
    this.clusters = builder.clusters;
    this.deployments = builder.deployments;
  }

  public static ExternalDatabaseServerUsageBuilder builder() {
    return new ExternalDatabaseServerUsageBuilder();
  }

  public static class ExternalDatabaseServerUsageBuilder {
    private Map<String, List<String>> clusters = new HashMap<String, List<String>>();
    private Set<String> deployments = null;

    public ExternalDatabaseServerUsageBuilder clusters(Map<String, List<String>> clusters) {
      this.clusters = clusters;
      return this;
    }

    public ExternalDatabaseServerUsageBuilder deployments(Set<String> deployments) {
      this.deployments = deployments;
      return this;
    }

    public ExternalDatabaseServerUsage build() {
      return new ExternalDatabaseServerUsage(this);
    }
  }

  public ExternalDatabaseServerUsageBuilder toBuilder() {
    return builder()
      .clusters(clusters)
      .deployments(deployments)
      ;
  }
  public Map<String, List<String>> getClusters() {
    return clusters;
  }
  public void setClusters(Map<String, List<String>> clusters) {
    this.clusters = clusters;
  }

  public Set<String> getDeployments() {
    return deployments;
  }
  public void setDeployments(Set<String> deployments) {
    this.deployments = deployments;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    ExternalDatabaseServerUsage other = (ExternalDatabaseServerUsage) o; // NOPMD

    if (clusters != null ?
        !clusters.equals(other.clusters) :
        other.clusters != null) return false;
    if (deployments != null ?
        !deployments.equals(other.deployments) :
        other.deployments != null) return false;
    return true;
  }

  @Override
  public int hashCode() {
    int result = 0;
    result = 31 * result + (clusters != null ? clusters.hashCode() : 0);
    result = 31 * result + (deployments != null ? deployments.hashCode() : 0);
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    String newLine = System.getProperty("line.separator");
    sb.append("class ExternalDatabaseServerUsage {" + newLine);
    sb.append("  clusters: ").append(clusters).append(newLine);
    sb.append("  deployments: ").append(deployments).append(newLine);
    sb.append("}" + newLine);
    return sb.toString();
  }
}

