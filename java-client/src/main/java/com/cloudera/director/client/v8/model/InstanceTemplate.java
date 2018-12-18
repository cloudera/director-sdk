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


package com.cloudera.director.client.v8.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Requirements for the construction of an instance
 */
@ApiModel(description = "Requirements for the construction of an instance")

public class InstanceTemplate {
  @SerializedName("name")
  private String name = null;
  @SerializedName("type")
  private String type = null;
  @SerializedName("image")
  private String image = null;
  @SerializedName("config")
  private Map<String, String> config = null;
  @SerializedName("tags")
  private Map<String, String> tags = null;
  @SerializedName("normalizeInstance")
  private Boolean normalizeInstance = null;
  @SerializedName("sshUsername")
  private String sshUsername = null;
  @SerializedName("bootstrapScripts")
  private List<String> bootstrapScripts = null;

  public InstanceTemplate() {
    // Do nothing
  }

  private InstanceTemplate(InstanceTemplateBuilder builder) {
      this.name = builder.name;
      this.type = builder.type;
      this.image = builder.image;
      this.config = builder.config;
      this.tags = builder.tags;
      this.normalizeInstance = builder.normalizeInstance;
      this.sshUsername = builder.sshUsername;
      this.bootstrapScripts = builder.bootstrapScripts;
    }

  public static InstanceTemplateBuilder builder() {
    return new InstanceTemplateBuilder();
  }

  public static class InstanceTemplateBuilder {
      private String name = null;
      private String type = null;
      private String image = null;
      private Map<String, String> config = new HashMap<String, String>();
      private Map<String, String> tags = new HashMap<String, String>();
      private Boolean normalizeInstance = null;
      private String sshUsername = null;
      private List<String> bootstrapScripts = new ArrayList<String>();
  

    public InstanceTemplateBuilder name(String name) {
      this.name = name;
      return this;
    }


    public InstanceTemplateBuilder type(String type) {
      this.type = type;
      return this;
    }


    public InstanceTemplateBuilder image(String image) {
      this.image = image;
      return this;
    }


    public InstanceTemplateBuilder config(Map<String, String> config) {
      this.config = config;
      return this;
    }


    public InstanceTemplateBuilder tags(Map<String, String> tags) {
      this.tags = tags;
      return this;
    }


    public InstanceTemplateBuilder normalizeInstance(Boolean normalizeInstance) {
      this.normalizeInstance = normalizeInstance;
      return this;
    }


    public InstanceTemplateBuilder sshUsername(String sshUsername) {
      this.sshUsername = sshUsername;
      return this;
    }


    public InstanceTemplateBuilder bootstrapScripts(List<String> bootstrapScripts) {
      this.bootstrapScripts = bootstrapScripts;
      return this;
    }


    public InstanceTemplate build() {
      return new InstanceTemplate(this);
    }
  }

  public InstanceTemplateBuilder toBuilder() {
    return builder()
      .name(name)
            .type(type)
            .image(image)
            .config(config)
            .tags(tags)
            .normalizeInstance(normalizeInstance)
            .sshUsername(sshUsername)
            .bootstrapScripts(bootstrapScripts)
      ;
  }

  public InstanceTemplate name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Instance template name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Instance template name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public InstanceTemplate type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Instance type
   * @return type
  **/
  @ApiModelProperty(required = true, value = "Instance type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public InstanceTemplate image(String image) {
    this.image = image;
    return this;
  }

   /**
   * Operating system image
   * @return image
  **/
  @ApiModelProperty(required = true, value = "Operating system image")
  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }

  public InstanceTemplate config(Map<String, String> config) {
    this.config = config;
    return this;
  }

  public InstanceTemplate putConfigItem(String key, String configItem) {
    if (this.config == null) {
      this.config = new HashMap<String, String>();
    }
    this.config.put(key, configItem);
    return this;
  }

   /**
   * Instance configuration properties
   * @return config
  **/
  @ApiModelProperty(value = "Instance configuration properties")
  public Map<String, String> getConfig() {
    return config;
  }

  public void setConfig(Map<String, String> config) {
    this.config = config;
  }

  public InstanceTemplate tags(Map<String, String> tags) {
    this.tags = tags;
    return this;
  }

  public InstanceTemplate putTagsItem(String key, String tagsItem) {
    if (this.tags == null) {
      this.tags = new HashMap<String, String>();
    }
    this.tags.put(key, tagsItem);
    return this;
  }

   /**
   * Instance tags
   * @return tags
  **/
  @ApiModelProperty(value = "Instance tags")
  public Map<String, String> getTags() {
    return tags;
  }

  public void setTags(Map<String, String> tags) {
    this.tags = tags;
  }

  public InstanceTemplate normalizeInstance(Boolean normalizeInstance) {
    this.normalizeInstance = normalizeInstance;
    return this;
  }

   /**
   * Flag indicating whether to normalize the instance
   * @return normalizeInstance
  **/
  @ApiModelProperty(value = "Flag indicating whether to normalize the instance")
  public Boolean isNormalizeInstance() {
    return normalizeInstance;
  }

  public void setNormalizeInstance(Boolean normalizeInstance) {
    this.normalizeInstance = normalizeInstance;
  }

  public InstanceTemplate sshUsername(String sshUsername) {
    this.sshUsername = sshUsername;
    return this;
  }

   /**
   * Optional SSH username to override username specified in environment
   * @return sshUsername
  **/
  @ApiModelProperty(value = "Optional SSH username to override username specified in environment")
  public String getSshUsername() {
    return sshUsername;
  }

  public void setSshUsername(String sshUsername) {
    this.sshUsername = sshUsername;
  }

  public InstanceTemplate bootstrapScripts(List<String> bootstrapScripts) {
    this.bootstrapScripts = bootstrapScripts;
    return this;
  }

  public InstanceTemplate addBootstrapScriptsItem(String bootstrapScriptsItem) {
    if (this.bootstrapScripts == null) {
      this.bootstrapScripts = new ArrayList<String>();
    }
    this.bootstrapScripts.add(bootstrapScriptsItem);
    return this;
  }

   /**
   * List of instance bootstrap scripts
   * @return bootstrapScripts
  **/
  @ApiModelProperty(value = "List of instance bootstrap scripts")
  public List<String> getBootstrapScripts() {
    return bootstrapScripts;
  }

  public void setBootstrapScripts(List<String> bootstrapScripts) {
    this.bootstrapScripts = bootstrapScripts;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstanceTemplate instanceTemplate = (InstanceTemplate) o;
    return Objects.equals(this.name, instanceTemplate.name) &&
        Objects.equals(this.type, instanceTemplate.type) &&
        Objects.equals(this.image, instanceTemplate.image) &&
        Objects.equals(this.config, instanceTemplate.config) &&
        Objects.equals(this.tags, instanceTemplate.tags) &&
        Objects.equals(this.normalizeInstance, instanceTemplate.normalizeInstance) &&
        Objects.equals(this.sshUsername, instanceTemplate.sshUsername) &&
        Objects.equals(this.bootstrapScripts, instanceTemplate.bootstrapScripts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, type, image, config, tags, normalizeInstance, sshUsername, bootstrapScripts);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstanceTemplate {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    normalizeInstance: ").append(toIndentedString(normalizeInstance)).append("\n");
    sb.append("    sshUsername: ").append(toIndentedString(sshUsername)).append("\n");
    sb.append("    bootstrapScripts: ").append(toIndentedString(bootstrapScripts)).append("\n");
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

