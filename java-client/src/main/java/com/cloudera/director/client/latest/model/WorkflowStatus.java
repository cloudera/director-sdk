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

package com.cloudera.director.client.latest.model;

import java.util.Date;

public class WorkflowStatus {
  /* The time when the workflow was created in the Oozie database */
  private Date createdTime;
  /* The time when the job ended */
  private Date endTime;
  /* Workflow stage */
  private String stage;
  /* The time when the workflow was started by Oozie */
  private Date startTime;
  public interface Stage {
    String PREPARING = "PREPARING";
    String RUNNING = "RUNNING";
    String SUCCEEDED = "SUCCEEDED";
    String KILLED = "KILLED";
    String FAILED = "FAILED";
  }
  public WorkflowStatus() { }

  private WorkflowStatus(Date createdTime, Date endTime, String stage, Date startTime) {
    this.createdTime = createdTime;
    this.endTime = endTime;
    this.stage = stage;
    this.startTime = startTime;
  }

  private WorkflowStatus(WorkflowStatusBuilder builder) {
    this.createdTime = builder.createdTime;
    this.endTime = builder.endTime;
    this.stage = builder.stage;
    this.startTime = builder.startTime;
  }

  public static WorkflowStatusBuilder builder() {
    return new WorkflowStatusBuilder();
  }

  public static class WorkflowStatusBuilder {
    private Date createdTime = null;
    private Date endTime = null;
    private String stage = null;
    private Date startTime = null;

    public WorkflowStatusBuilder createdTime(Date createdTime) {
      this.createdTime = createdTime;
      return this;
    }

    public WorkflowStatusBuilder endTime(Date endTime) {
      this.endTime = endTime;
      return this;
    }

    public WorkflowStatusBuilder stage(String stage) {
      this.stage = stage;
      return this;
    }

    public WorkflowStatusBuilder startTime(Date startTime) {
      this.startTime = startTime;
      return this;
    }

    public WorkflowStatus build() {
      return new WorkflowStatus(this);
    }
  }

  public WorkflowStatusBuilder toBuilder() {
    return builder()
      .createdTime(createdTime)
      .endTime(endTime)
      .stage(stage)
      .startTime(startTime)
      ;
  }
  public Date getCreatedTime() {
    return createdTime;
  }
  public void setCreatedTime(Date createdTime) {
    this.createdTime = createdTime;
  }

  public Date getEndTime() {
    return endTime;
  }
  public void setEndTime(Date endTime) {
    this.endTime = endTime;
  }

  public String getStage() {
    return stage;
  }
  public void setStage(String stage) {
    this.stage = stage;
  }

  public Date getStartTime() {
    return startTime;
  }
  public void setStartTime(Date startTime) {
    this.startTime = startTime;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    WorkflowStatus other = (WorkflowStatus) o; // NOPMD

    if (createdTime != null ?
        !createdTime.equals(other.createdTime) :
        other.createdTime != null) return false;
    if (endTime != null ?
        !endTime.equals(other.endTime) :
        other.endTime != null) return false;
    if (stage != null ?
        !stage.equals(other.stage) :
        other.stage != null) return false;
    if (startTime != null ?
        !startTime.equals(other.startTime) :
        other.startTime != null) return false;
    return true;
  }

  @Override
  public int hashCode() {
    int result = 0;
    result = 31 * result + (createdTime != null ? createdTime.hashCode() : 0);
    result = 31 * result + (endTime != null ? endTime.hashCode() : 0);
    result = 31 * result + (stage != null ? stage.hashCode() : 0);
    result = 31 * result + (startTime != null ? startTime.hashCode() : 0);
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    String newLine = System.getProperty("line.separator");
    sb.append("class WorkflowStatus {" + newLine);
    sb.append("  createdTime: ").append(createdTime).append(newLine);
    sb.append("  endTime: ").append(endTime).append(newLine);
    sb.append("  stage: ").append(stage).append(newLine);
    sb.append("  startTime: ").append(startTime).append(newLine);
    sb.append("}" + newLine);
    return sb.toString();
  }
}

