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


package com.cloudera.director.client.latest.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * A script to be run on a cloud instance
 */
@ApiModel(description = "A script to be run on a cloud instance")

public class Script {
  @SerializedName("id")
  private String id = null;
  @SerializedName("env")
  private Map<String, String> env = null;
  @SerializedName("content")
  private String content = null;

  public Script() {
    // Do nothing
  }

  private Script(ScriptBuilder builder) {
      this.id = builder.id;
      this.env = builder.env;
      this.content = builder.content;
    }

  public static ScriptBuilder builder() {
    return new ScriptBuilder();
  }

  public static class ScriptBuilder {
      private String id = null;
      private Map<String, String> env = new HashMap<String, String>();
      private String content = null;
  

    public ScriptBuilder id(String id) {
      this.id = id;
      return this;
    }


    public ScriptBuilder env(Map<String, String> env) {
      this.env = env;
      return this;
    }


    public ScriptBuilder content(String content) {
      this.content = content;
      return this;
    }


    public Script build() {
      return new Script(this);
    }
  }

  public ScriptBuilder toBuilder() {
    return builder()
      .id(id)
            .env(env)
            .content(content)
      ;
  }

  public Script id(String id) {
    this.id = id;
    return this;
  }

   /**
   * An optional id to identify the script
   * @return id
  **/
  @ApiModelProperty(value = "An optional id to identify the script")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Script env(Map<String, String> env) {
    this.env = env;
    return this;
  }

  public Script putEnvItem(String key, String envItem) {
    if (this.env == null) {
      this.env = new HashMap<String, String>();
    }
    this.env.put(key, envItem);
    return this;
  }

   /**
   * Environment variables to set when running the script
   * @return env
  **/
  @ApiModelProperty(value = "Environment variables to set when running the script")
  public Map<String, String> getEnv() {
    return env;
  }

  public void setEnv(Map<String, String> env) {
    this.env = env;
  }

  public Script content(String content) {
    this.content = content;
    return this;
  }

   /**
   * The content of the script
   * @return content
  **/
  @ApiModelProperty(required = true, value = "The content of the script")
  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Script script = (Script) o;
    return Objects.equals(this.id, script.id) &&
        Objects.equals(this.env, script.env) &&
        Objects.equals(this.content, script.content);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, env, content);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Script {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    env: ").append(toIndentedString(env)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
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

