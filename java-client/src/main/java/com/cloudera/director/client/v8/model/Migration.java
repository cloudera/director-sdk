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

package com.cloudera.director.client.v8.model;


public class Migration {
  /* Description of virtual instances from which to migrate roles */
  private MigratingGroup fromGroup;
  /* Description of virtual instances to which to migrate roles */
  private MigratingGroup toGroup;
  public Migration() { }

  private Migration(MigratingGroup fromGroup, MigratingGroup toGroup) {
    this.fromGroup = fromGroup;
    this.toGroup = toGroup;
  }

  private Migration(MigrationBuilder builder) {
    this.fromGroup = builder.fromGroup;
    this.toGroup = builder.toGroup;
  }

  public static MigrationBuilder builder() {
    return new MigrationBuilder();
  }

  public static class MigrationBuilder {
    private MigratingGroup fromGroup = null;
    private MigratingGroup toGroup = null;

    public MigrationBuilder fromGroup(MigratingGroup fromGroup) {
      this.fromGroup = fromGroup;
      return this;
    }

    public MigrationBuilder toGroup(MigratingGroup toGroup) {
      this.toGroup = toGroup;
      return this;
    }

    public Migration build() {
      return new Migration(this);
    }
  }

  public MigrationBuilder toBuilder() {
    return builder()
      .fromGroup(fromGroup)
      .toGroup(toGroup)
      ;
  }
  public MigratingGroup getFromGroup() {
    return fromGroup;
  }
  public void setFromGroup(MigratingGroup fromGroup) {
    this.fromGroup = fromGroup;
  }

  public MigratingGroup getToGroup() {
    return toGroup;
  }
  public void setToGroup(MigratingGroup toGroup) {
    this.toGroup = toGroup;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Migration other = (Migration) o; // NOPMD

    if (fromGroup != null ?
        !fromGroup.equals(other.fromGroup) :
        other.fromGroup != null) return false;
    if (toGroup != null ?
        !toGroup.equals(other.toGroup) :
        other.toGroup != null) return false;
    return true;
  }

  @Override
  public int hashCode() {
    int result = 0;
    result = 31 * result + (fromGroup != null ? fromGroup.hashCode() : 0);
    result = 31 * result + (toGroup != null ? toGroup.hashCode() : 0);
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    String newLine = System.getProperty("line.separator");
    sb.append("class Migration {" + newLine);
    sb.append("  fromGroup: ").append(fromGroup).append(newLine);
    sb.append("  toGroup: ").append(toGroup).append(newLine);
    sb.append("}" + newLine);
    return sb.toString();
  }
}

