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


package com.cloudera.director.client.v7.model;

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
 * Information about EULA acceptance
 */
@ApiModel(description = "Information about EULA acceptance")

public class Eula {
  @SerializedName("accepted")
  private Boolean accepted = null;

  public Eula() {
    // Do nothing
  }

  private Eula(EulaBuilder builder) {
      this.accepted = builder.accepted;
    }

  public static EulaBuilder builder() {
    return new EulaBuilder();
  }

  public static class EulaBuilder {
      private Boolean accepted = null;
  

    public EulaBuilder accepted(Boolean accepted) {
      this.accepted = accepted;
      return this;
    }


    public Eula build() {
      return new Eula(this);
    }
  }

  public EulaBuilder toBuilder() {
    return builder()
      .accepted(accepted)
      ;
  }

  public Eula accepted(Boolean accepted) {
    this.accepted = accepted;
    return this;
  }

   /**
   * If the Eula is accepted
   * @return accepted
  **/
  @ApiModelProperty(required = true, value = "If the Eula is accepted")
  public Boolean isAccepted() {
    return accepted;
  }

  public void setAccepted(Boolean accepted) {
    this.accepted = accepted;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Eula eula = (Eula) o;
    return Objects.equals(this.accepted, eula.accepted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accepted);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Eula {\n");
    
    sb.append("    accepted: ").append(toIndentedString(accepted)).append("\n");
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

