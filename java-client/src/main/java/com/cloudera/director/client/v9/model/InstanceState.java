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


public class InstanceState {
  private Long lastChecked;
  private Long lastReported;
  private String status;
  public interface Status {
    String PENDING = "PENDING";
    String RUNNING = "RUNNING";
    String STOPPING = "STOPPING";
    String STOPPED = "STOPPED";
    String DELETING = "DELETING";
    String DELETED = "DELETED";
    String FAILED = "FAILED";
    String UNKNOWN = "UNKNOWN";
    String MISSING = "MISSING";
  }
  public InstanceState() { }

  private InstanceState(Long lastChecked, Long lastReported, String status) {
    this.lastChecked = lastChecked;
    this.lastReported = lastReported;
    this.status = status;
  }

  private InstanceState(InstanceStateBuilder builder) {
    this.lastChecked = builder.lastChecked;
    this.lastReported = builder.lastReported;
    this.status = builder.status;
  }

  public static InstanceStateBuilder builder() {
    return new InstanceStateBuilder();
  }

  public static class InstanceStateBuilder {
    private Long lastChecked = null;
    private Long lastReported = null;
    private String status = null;

    public InstanceStateBuilder lastChecked(Long lastChecked) {
      this.lastChecked = lastChecked;
      return this;
    }

    public InstanceStateBuilder lastReported(Long lastReported) {
      this.lastReported = lastReported;
      return this;
    }

    public InstanceStateBuilder status(String status) {
      this.status = status;
      return this;
    }

    public InstanceState build() {
      return new InstanceState(this);
    }
  }

  public InstanceStateBuilder toBuilder() {
    return builder()
      .lastChecked(lastChecked)
      .lastReported(lastReported)
      .status(status)
      ;
  }
  public Long getLastChecked() {
    return lastChecked;
  }
  public void setLastChecked(Long lastChecked) {
    this.lastChecked = lastChecked;
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

    InstanceState other = (InstanceState) o; // NOPMD

    if (lastChecked != null ?
        !lastChecked.equals(other.lastChecked) :
        other.lastChecked != null) return false;
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
    result = 31 * result + (lastChecked != null ? lastChecked.hashCode() : 0);
    result = 31 * result + (lastReported != null ? lastReported.hashCode() : 0);
    result = 31 * result + (status != null ? status.hashCode() : 0);
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    String newLine = System.getProperty("line.separator");
    sb.append("class InstanceState {" + newLine);
    sb.append("  lastChecked: ").append(lastChecked).append(newLine);
    sb.append("  lastReported: ").append(lastReported).append(newLine);
    sb.append("  status: ").append(status).append(newLine);
    sb.append("}" + newLine);
    return sb.toString();
  }
}

