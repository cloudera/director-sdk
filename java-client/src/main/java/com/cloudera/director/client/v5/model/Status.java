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

package com.cloudera.director.client.v5.model;

import java.util.ArrayList;
import java.util.List;

public class Status {
  private Integer completedSteps;
  private String description;
  private List<String> descriptionDetails;
  private Health health;
  private Integer remainingSteps;
  private String stage;
  public interface Stage {
    String BOOTSTRAPPING = "BOOTSTRAPPING";
    String BOOTSTRAP_FAILED = "BOOTSTRAP_FAILED";
    String READY = "READY";
    String UPDATING = "UPDATING";
    String UPDATE_FAILED = "UPDATE_FAILED";
    String TERMINATING = "TERMINATING";
    String TERMINATE_FAILED = "TERMINATE_FAILED";
    String TERMINATED = "TERMINATED";
    String UNKNOWN = "UNKNOWN";
  }
  public Status() { }

  private Status(Integer completedSteps, String description, List<String> descriptionDetails, Health health, Integer remainingSteps, String stage) {
    this.completedSteps = completedSteps;
    this.description = description;
    this.descriptionDetails = descriptionDetails;
    this.health = health;
    this.remainingSteps = remainingSteps;
    this.stage = stage;
  }

  private Status(StatusBuilder builder) {
    this.completedSteps = builder.completedSteps;
    this.description = builder.description;
    this.descriptionDetails = builder.descriptionDetails;
    this.health = builder.health;
    this.remainingSteps = builder.remainingSteps;
    this.stage = builder.stage;
  }

  public static StatusBuilder builder() {
    return new StatusBuilder();
  }

  public static class StatusBuilder {
    private Integer completedSteps = null;
    private String description = null;
    private List<String> descriptionDetails = new ArrayList<String>();
    private Health health = null;
    private Integer remainingSteps = null;
    private String stage = null;

    public StatusBuilder completedSteps(Integer completedSteps) {
      this.completedSteps = completedSteps;
      return this;
    }

    public StatusBuilder description(String description) {
      this.description = description;
      return this;
    }

    public StatusBuilder descriptionDetails(List<String> descriptionDetails) {
      this.descriptionDetails = descriptionDetails;
      return this;
    }

    public StatusBuilder health(Health health) {
      this.health = health;
      return this;
    }

    public StatusBuilder remainingSteps(Integer remainingSteps) {
      this.remainingSteps = remainingSteps;
      return this;
    }

    public StatusBuilder stage(String stage) {
      this.stage = stage;
      return this;
    }

    public Status build() {
      return new Status(this);
    }
  }

  public StatusBuilder toBuilder() {
    return builder()
      .completedSteps(completedSteps)
      .description(description)
      .descriptionDetails(descriptionDetails)
      .health(health)
      .remainingSteps(remainingSteps)
      .stage(stage)
      ;
  }
  public Integer getCompletedSteps() {
    return completedSteps;
  }
  public void setCompletedSteps(Integer completedSteps) {
    this.completedSteps = completedSteps;
  }

  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  public List<String> getDescriptionDetails() {
    return descriptionDetails;
  }
  public void setDescriptionDetails(List<String> descriptionDetails) {
    this.descriptionDetails = descriptionDetails;
  }

  public Health getHealth() {
    return health;
  }
  public void setHealth(Health health) {
    this.health = health;
  }

  public Integer getRemainingSteps() {
    return remainingSteps;
  }
  public void setRemainingSteps(Integer remainingSteps) {
    this.remainingSteps = remainingSteps;
  }

  public String getStage() {
    return stage;
  }
  public void setStage(String stage) {
    this.stage = stage;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Status other = (Status) o; // NOPMD

    if (completedSteps != null ?
        !completedSteps.equals(other.completedSteps) :
        other.completedSteps != null) return false;
    if (description != null ?
        !description.equals(other.description) :
        other.description != null) return false;
    if (descriptionDetails != null ?
        !descriptionDetails.equals(other.descriptionDetails) :
        other.descriptionDetails != null) return false;
    if (health != null ?
        !health.equals(other.health) :
        other.health != null) return false;
    if (remainingSteps != null ?
        !remainingSteps.equals(other.remainingSteps) :
        other.remainingSteps != null) return false;
    if (stage != null ?
        !stage.equals(other.stage) :
        other.stage != null) return false;
    return true;
  }

  @Override
  public int hashCode() {
    int result = 0;
    result = 31 * result + (completedSteps != null ? completedSteps.hashCode() : 0);
    result = 31 * result + (description != null ? description.hashCode() : 0);
    result = 31 * result + (descriptionDetails != null ? descriptionDetails.hashCode() : 0);
    result = 31 * result + (health != null ? health.hashCode() : 0);
    result = 31 * result + (remainingSteps != null ? remainingSteps.hashCode() : 0);
    result = 31 * result + (stage != null ? stage.hashCode() : 0);
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    String newLine = System.getProperty("line.separator");
    sb.append("class Status {" + newLine);
    sb.append("  completedSteps: ").append(completedSteps).append(newLine);
    sb.append("  description: ").append(description).append(newLine);
    sb.append("  descriptionDetails: ").append(descriptionDetails).append(newLine);
    sb.append("  health: ").append(health).append(newLine);
    sb.append("  remainingSteps: ").append(remainingSteps).append(newLine);
    sb.append("  stage: ").append(stage).append(newLine);
    sb.append("}" + newLine);
    return sb.toString();
  }
}

