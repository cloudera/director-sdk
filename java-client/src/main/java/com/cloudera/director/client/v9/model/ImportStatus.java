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


package com.cloudera.director.client.v9.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * The current status of an import operation for an entity
 */
@ApiModel(description = "The current status of an import operation for an entity")

public class ImportStatus {
  @SerializedName("name")
  private String name = null;
  @SerializedName("skipped")
  private Boolean skipped = null;

  public ImportStatus() {
    // Do nothing
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

  public ImportStatus name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the imported entity
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name of the imported entity")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ImportStatus skipped(Boolean skipped) {
    this.skipped = skipped;
    return this;
  }

   /**
   * Skipped or not during import
   * @return skipped
  **/
  @ApiModelProperty(example = "false", value = "Skipped or not during import")
  public Boolean isSkipped() {
    return skipped;
  }

  public void setSkipped(Boolean skipped) {
    this.skipped = skipped;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImportStatus importStatus = (ImportStatus) o;
    return Objects.equals(this.name, importStatus.name) &&
        Objects.equals(this.skipped, importStatus.skipped);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, skipped);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImportStatus {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    skipped: ").append(toIndentedString(skipped)).append("\n");
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

