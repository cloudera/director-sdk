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

package com.cloudera.director.client.v10.model;


public class TimeSeriesCrossEntityMetadata {
  /* Display name for maximum entity */
  private String maxEntityDisplayName;
  /* Name for maximum entity */
  private String maxEntityName;
  /* Display name for minimum entity */
  private String minEntityDisplayName;
  /* Name for minimum entity */
  private String minEntityName;
  /* Number of entities */
  private Double numEntities;
  public TimeSeriesCrossEntityMetadata() { }

  private TimeSeriesCrossEntityMetadata(String maxEntityDisplayName, String maxEntityName, String minEntityDisplayName, String minEntityName, Double numEntities) {
    this.maxEntityDisplayName = maxEntityDisplayName;
    this.maxEntityName = maxEntityName;
    this.minEntityDisplayName = minEntityDisplayName;
    this.minEntityName = minEntityName;
    this.numEntities = numEntities;
  }

  private TimeSeriesCrossEntityMetadata(TimeSeriesCrossEntityMetadataBuilder builder) {
    this.maxEntityDisplayName = builder.maxEntityDisplayName;
    this.maxEntityName = builder.maxEntityName;
    this.minEntityDisplayName = builder.minEntityDisplayName;
    this.minEntityName = builder.minEntityName;
    this.numEntities = builder.numEntities;
  }

  public static TimeSeriesCrossEntityMetadataBuilder builder() {
    return new TimeSeriesCrossEntityMetadataBuilder();
  }

  public static class TimeSeriesCrossEntityMetadataBuilder {
    private String maxEntityDisplayName = null;
    private String maxEntityName = null;
    private String minEntityDisplayName = null;
    private String minEntityName = null;
    private Double numEntities = null;

    public TimeSeriesCrossEntityMetadataBuilder maxEntityDisplayName(String maxEntityDisplayName) {
      this.maxEntityDisplayName = maxEntityDisplayName;
      return this;
    }

    public TimeSeriesCrossEntityMetadataBuilder maxEntityName(String maxEntityName) {
      this.maxEntityName = maxEntityName;
      return this;
    }

    public TimeSeriesCrossEntityMetadataBuilder minEntityDisplayName(String minEntityDisplayName) {
      this.minEntityDisplayName = minEntityDisplayName;
      return this;
    }

    public TimeSeriesCrossEntityMetadataBuilder minEntityName(String minEntityName) {
      this.minEntityName = minEntityName;
      return this;
    }

    public TimeSeriesCrossEntityMetadataBuilder numEntities(Double numEntities) {
      this.numEntities = numEntities;
      return this;
    }

    public TimeSeriesCrossEntityMetadata build() {
      return new TimeSeriesCrossEntityMetadata(this);
    }
  }

  public TimeSeriesCrossEntityMetadataBuilder toBuilder() {
    return builder()
      .maxEntityDisplayName(maxEntityDisplayName)
      .maxEntityName(maxEntityName)
      .minEntityDisplayName(minEntityDisplayName)
      .minEntityName(minEntityName)
      .numEntities(numEntities)
      ;
  }
  public String getMaxEntityDisplayName() {
    return maxEntityDisplayName;
  }
  public void setMaxEntityDisplayName(String maxEntityDisplayName) {
    this.maxEntityDisplayName = maxEntityDisplayName;
  }

  public String getMaxEntityName() {
    return maxEntityName;
  }
  public void setMaxEntityName(String maxEntityName) {
    this.maxEntityName = maxEntityName;
  }

  public String getMinEntityDisplayName() {
    return minEntityDisplayName;
  }
  public void setMinEntityDisplayName(String minEntityDisplayName) {
    this.minEntityDisplayName = minEntityDisplayName;
  }

  public String getMinEntityName() {
    return minEntityName;
  }
  public void setMinEntityName(String minEntityName) {
    this.minEntityName = minEntityName;
  }

  public Double getNumEntities() {
    return numEntities;
  }
  public void setNumEntities(Double numEntities) {
    this.numEntities = numEntities;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    TimeSeriesCrossEntityMetadata other = (TimeSeriesCrossEntityMetadata) o; // NOPMD

    if (maxEntityDisplayName != null ?
        !maxEntityDisplayName.equals(other.maxEntityDisplayName) :
        other.maxEntityDisplayName != null) return false;
    if (maxEntityName != null ?
        !maxEntityName.equals(other.maxEntityName) :
        other.maxEntityName != null) return false;
    if (minEntityDisplayName != null ?
        !minEntityDisplayName.equals(other.minEntityDisplayName) :
        other.minEntityDisplayName != null) return false;
    if (minEntityName != null ?
        !minEntityName.equals(other.minEntityName) :
        other.minEntityName != null) return false;
    if (numEntities != null ?
        !numEntities.equals(other.numEntities) :
        other.numEntities != null) return false;
    return true;
  }

  @Override
  public int hashCode() {
    int result = 0;
    result = 31 * result + (maxEntityDisplayName != null ? maxEntityDisplayName.hashCode() : 0);
    result = 31 * result + (maxEntityName != null ? maxEntityName.hashCode() : 0);
    result = 31 * result + (minEntityDisplayName != null ? minEntityDisplayName.hashCode() : 0);
    result = 31 * result + (minEntityName != null ? minEntityName.hashCode() : 0);
    result = 31 * result + (numEntities != null ? numEntities.hashCode() : 0);
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    String newLine = System.getProperty("line.separator");
    sb.append("class TimeSeriesCrossEntityMetadata {" + newLine);
    sb.append("  maxEntityDisplayName: ").append(maxEntityDisplayName).append(newLine);
    sb.append("  maxEntityName: ").append(maxEntityName).append(newLine);
    sb.append("  minEntityDisplayName: ").append(minEntityDisplayName).append(newLine);
    sb.append("  minEntityName: ").append(minEntityName).append(newLine);
    sb.append("  numEntities: ").append(numEntities).append(newLine);
    sb.append("}" + newLine);
    return sb.toString();
  }
}

