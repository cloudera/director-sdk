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


public class ImportStatus {
  /* Name of the imported entity */
  private String name;
  /* Skipped or not during import */
  private Boolean skipped;
  public ImportStatus() { }

  private ImportStatus(String name, Boolean skipped) {
    this.name = name;
    this.skipped = skipped;
  }

  private ImportStatus(ImportStatusBuilder builder) {
    this.name = builder.name;
    this.skipped = builder.skipped;
  }

  public static ImportStatusBuilder builder() {
    return new ImportStatusBuilder();
  }

  public static class ImportStatusBuilder {
    private String name = null;
    private Boolean skipped = null;

    public ImportStatusBuilder name(String name) {
      this.name = name;
      return this;
    }

    public ImportStatusBuilder skipped(Boolean skipped) {
      this.skipped = skipped;
      return this;
    }

    public ImportStatus build() {
      return new ImportStatus(this);
    }
  }

  public ImportStatusBuilder toBuilder() {
    return builder()
      .name(name)
      .skipped(skipped)
      ;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  public Boolean getSkipped() {
    return skipped;
  }
  public void setSkipped(Boolean skipped) {
    this.skipped = skipped;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    ImportStatus other = (ImportStatus) o; // NOPMD

    if (name != null ?
        !name.equals(other.name) :
        other.name != null) return false;
    if (skipped != null ?
        !skipped.equals(other.skipped) :
        other.skipped != null) return false;
    return true;
  }

  @Override
  public int hashCode() {
    int result = 0;
    result = 31 * result + (name != null ? name.hashCode() : 0);
    result = 31 * result + (skipped != null ? skipped.hashCode() : 0);
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    String newLine = System.getProperty("line.separator");
    sb.append("class ImportStatus {" + newLine);
    sb.append("  name: ").append(name).append(newLine);
    sb.append("  skipped: ").append(skipped).append(newLine);
    sb.append("}" + newLine);
    return sb.toString();
  }
}

