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
import com.cloudera.director.client.v7.model.InstanceTemplate;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * An abstract representation of an instance that nominally corresponds to an actual instance in a cloud provider
 */
@ApiModel(description = "An abstract representation of an instance that nominally corresponds to an actual instance in a cloud provider")

public class VirtualInstance {
  @SerializedName("id")
  private String id = null;
  @SerializedName("template")
  private InstanceTemplate template = null;

  public VirtualInstance() {
    // Do nothing
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

  public VirtualInstance id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Virtual instance id
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Virtual instance id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public VirtualInstance template(InstanceTemplate template) {
    this.template = template;
    return this;
  }

   /**
   * Instance template
   * @return template
  **/
  @ApiModelProperty(required = true, value = "Instance template")
  public InstanceTemplate getTemplate() {
    return template;
  }

  public void setTemplate(InstanceTemplate template) {
    this.template = template;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VirtualInstance virtualInstance = (VirtualInstance) o;
    return Objects.equals(this.id, virtualInstance.id) &&
        Objects.equals(this.template, virtualInstance.template);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, template);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VirtualInstance {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
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

