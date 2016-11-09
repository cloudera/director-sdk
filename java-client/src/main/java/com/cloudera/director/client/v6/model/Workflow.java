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

import java.util.HashMap;
import java.util.Map;

public class Workflow {
  /* Additional Oozie job configuration properties */
  private Map<String, String> properties;
  /* Map with the content of additional text files that are referenced by the workflow XML document */
  private Map<String, String> textFiles;
  /* Workflow XML document */
  private String workflowXml;
  public Workflow() { }

  private Workflow(Map<String, String> properties, Map<String, String> textFiles, String workflowXml) {
    this.properties = properties;
    this.textFiles = textFiles;
    this.workflowXml = workflowXml;
  }

  private Workflow(WorkflowBuilder builder) {
    this.properties = builder.properties;
    this.textFiles = builder.textFiles;
    this.workflowXml = builder.workflowXml;
  }

  public static WorkflowBuilder builder() {
    return new WorkflowBuilder();
  }

  public static class WorkflowBuilder {
    private Map<String, String> properties = new HashMap<String, String>();
    private Map<String, String> textFiles = new HashMap<String, String>();
    private String workflowXml = null;

    public WorkflowBuilder properties(Map<String, String> properties) {
      this.properties = properties;
      return this;
    }

    public WorkflowBuilder textFiles(Map<String, String> textFiles) {
      this.textFiles = textFiles;
      return this;
    }

    public WorkflowBuilder workflowXml(String workflowXml) {
      this.workflowXml = workflowXml;
      return this;
    }

    public Workflow build() {
      return new Workflow(this);
    }
  }

  public WorkflowBuilder toBuilder() {
    return builder()
      .properties(properties)
      .textFiles(textFiles)
      .workflowXml(workflowXml)
      ;
  }
  public Map<String, String> getProperties() {
    return properties;
  }
  public void setProperties(Map<String, String> properties) {
    this.properties = properties;
  }

  public Map<String, String> getTextFiles() {
    return textFiles;
  }
  public void setTextFiles(Map<String, String> textFiles) {
    this.textFiles = textFiles;
  }

  public String getWorkflowXml() {
    return workflowXml;
  }
  public void setWorkflowXml(String workflowXml) {
    this.workflowXml = workflowXml;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Workflow other = (Workflow) o; // NOPMD

    if (properties != null ?
        !properties.equals(other.properties) :
        other.properties != null) return false;
    if (textFiles != null ?
        !textFiles.equals(other.textFiles) :
        other.textFiles != null) return false;
    if (workflowXml != null ?
        !workflowXml.equals(other.workflowXml) :
        other.workflowXml != null) return false;
    return true;
  }

  @Override
  public int hashCode() {
    int result = 0;
    result = 31 * result + (properties != null ? properties.hashCode() : 0);
    result = 31 * result + (textFiles != null ? textFiles.hashCode() : 0);
    result = 31 * result + (workflowXml != null ? workflowXml.hashCode() : 0);
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    String newLine = System.getProperty("line.separator");
    sb.append("class Workflow {" + newLine);
    sb.append("  properties: ").append(properties).append(newLine);
    sb.append("  textFiles: ").append(textFiles).append(newLine);
    sb.append("  workflowXml: ").append(workflowXml).append(newLine);
    sb.append("}" + newLine);
    return sb.toString();
  }
}

