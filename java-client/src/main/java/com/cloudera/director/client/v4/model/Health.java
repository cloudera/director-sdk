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


public class Health {
  private Long lastReported;
  private String status;
  public interface Status {
    String DISABLED = "DISABLED";
    String NOT_AVAILABLE = "NOT_AVAILABLE";
    String GOOD = "GOOD";
    String CONCERNING = "CONCERNING";
    String BAD = "BAD";
  }
  public Health() { }

  private Health(Long lastReported, String status) {
    this.lastReported = lastReported;
    this.status = status;
  }

  private Health(HealthBuilder builder) {
    this.lastReported = builder.lastReported;
    this.status = builder.status;
  }

  public static HealthBuilder builder() {
    return new HealthBuilder();
  }

  public static class HealthBuilder {
    private Long lastReported = null;
    private String status = null;

    public HealthBuilder lastReported(Long lastReported) {
      this.lastReported = lastReported;
      return this;
    }

    public HealthBuilder status(String status) {
      this.status = status;
      return this;
    }

    public Health build() {
      return new Health(this);
    }
  }

  public HealthBuilder toBuilder() {
    return builder()
      .lastReported(lastReported)
      .status(status)
      ;
  }
  public Long getLastReported() {
    return lastReported;
  }
  public void setLastReported(Long lastReported) {
    this.lastReported = lastReported;
  }

  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Health other = (Health) o; // NOPMD

    if (lastReported != null ?
        !lastReported.equals(other.lastReported) :
        other.lastReported != null) return false;
    if (status != null ?
        !status.equals(other.status) :
        other.status != null) return false;
    return true;
  }

  @Override
  public int hashCode() {
    int result = 0;
    result = 31 * result + (lastReported != null ? lastReported.hashCode() : 0);
    result = 31 * result + (status != null ? status.hashCode() : 0);
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    String newLine = System.getProperty("line.separator");
    sb.append("class Health {" + newLine);
    sb.append("  lastReported: ").append(lastReported).append(newLine);
    sb.append("  status: ").append(status).append(newLine);
    sb.append("}" + newLine);
    return sb.toString();
  }
}

