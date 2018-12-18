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


package com.cloudera.director.client.d6_1.model;

import java.util.Objects;
import com.cloudera.director.client.d6_1.model.MigratingGroup;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Information about a role migration
 */
@ApiModel(description = "Information about a role migration")

public class Migration {
  @SerializedName("fromGroup")
  private MigratingGroup fromGroup = null;
  @SerializedName("toGroup")
  private MigratingGroup toGroup = null;

  public Migration() {
    // Do nothing
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

  public Migration fromGroup(MigratingGroup fromGroup) {
    this.fromGroup = fromGroup;
    return this;
  }

   /**
   * Description of virtual instances from which to migrate roles
   * @return fromGroup
  **/
  @ApiModelProperty(required = true, value = "Description of virtual instances from which to migrate roles")
  public MigratingGroup getFromGroup() {
    return fromGroup;
  }

  public void setFromGroup(MigratingGroup fromGroup) {
    this.fromGroup = fromGroup;
  }

  public Migration toGroup(MigratingGroup toGroup) {
    this.toGroup = toGroup;
    return this;
  }

   /**
   * Description of virtual instances to which to migrate roles
   * @return toGroup
  **/
  @ApiModelProperty(required = true, value = "Description of virtual instances to which to migrate roles")
  public MigratingGroup getToGroup() {
    return toGroup;
  }

  public void setToGroup(MigratingGroup toGroup) {
    this.toGroup = toGroup;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Migration migration = (Migration) o;
    return Objects.equals(this.fromGroup, migration.fromGroup) &&
        Objects.equals(this.toGroup, migration.toGroup);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fromGroup, toGroup);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Migration {\n");
    
    sb.append("    fromGroup: ").append(toIndentedString(fromGroup)).append("\n");
    sb.append("    toGroup: ").append(toIndentedString(toGroup)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

