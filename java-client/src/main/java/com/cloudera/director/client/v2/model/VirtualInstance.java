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

package com.cloudera.director.client.v2.model;


public class VirtualInstance {
  /* Virtual instance id */
  private String id;
  /* Instance template */
  private InstanceTemplate template;
  public VirtualInstance() { }

  private VirtualInstance(String id, InstanceTemplate template) {
    this.id = id;
    this.template = template;
  }

  private VirtualInstance(VirtualInstanceBuilder builder) {
    this.id = builder.id;
    this.template = builder.template;
  }

  public static VirtualInstanceBuilder builder() {
    return new VirtualInstanceBuilder();
  }

  public static class VirtualInstanceBuilder {
    private String id = null;
    private InstanceTemplate template = null;

    public VirtualInstanceBuilder id(String id) {
      this.id = id;
      return this;
    }

    public VirtualInstanceBuilder template(InstanceTemplate template) {
      this.template = template;
      return this;
    }

    public VirtualInstance build() {
      return new VirtualInstance(this);
    }
  }

  public VirtualInstanceBuilder toBuilder() {
    return builder()
      .id(id)
      .template(template)
      ;
  }
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  public InstanceTemplate getTemplate() {
    return template;
  }
  public void setTemplate(InstanceTemplate template) {
    this.template = template;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    VirtualInstance other = (VirtualInstance) o; // NOPMD

    if (id != null ?
        !id.equals(other.id) :
        other.id != null) return false;
    if (template != null ?
        !template.equals(other.template) :
        other.template != null) return false;
    return true;
  }

  @Override
  public int hashCode() {
    int result = 0;
    result = 31 * result + (id != null ? id.hashCode() : 0);
    result = 31 * result + (template != null ? template.hashCode() : 0);
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    String newLine = System.getProperty("line.separator");
    sb.append("class VirtualInstance {" + newLine);
    sb.append("  id: ").append(id).append(newLine);
    sb.append("  template: ").append(template).append(newLine);
    sb.append("}" + newLine);
    return sb.toString();
  }
}

