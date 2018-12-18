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


package com.cloudera.director.client.d6_0.model;

import java.util.Objects;
import com.cloudera.director.client.d6_0.model.NormalizationConfiguration;
import com.cloudera.director.client.d6_0.model.Script;
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
  @SerializedName("rackId")
  private String rackId = null;
  @SerializedName("config")
  private Map<String, String> config = null;
  @SerializedName("tags")
  private Map<String, String> tags = null;
  @SerializedName("normalizeInstance")
  private Boolean normalizeInstance = null;
  @SerializedName("normalizationConfig")
  private NormalizationConfiguration normalizationConfig = null;
  @SerializedName("sshUsername")
  private String sshUsername = null;
  @SerializedName("bootstrapScripts")
  private List<Script> bootstrapScripts = null;
  /**
   * SSH host key retrieval type
   */
  @JsonAdapter(SshHostKeyRetrievalTypeEnum.Adapter.class)
  public enum SshHostKeyRetrievalTypeEnum {
    NONE("NONE"),
    
    INSTANCE("INSTANCE"),
    
    PROVIDER("PROVIDER"),
    
    FALLBACK("FALLBACK");

    private String value;

    SshHostKeyRetrievalTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SshHostKeyRetrievalTypeEnum fromValue(String text) {
      for (SshHostKeyRetrievalTypeEnum b : SshHostKeyRetrievalTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<SshHostKeyRetrievalTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SshHostKeyRetrievalTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SshHostKeyRetrievalTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return SshHostKeyRetrievalTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("sshHostKeyRetrievalType")
  private SshHostKeyRetrievalTypeEnum sshHostKeyRetrievalType = null;

  public InstanceTemplate() {
    // Do nothing
  }

  private InstanceTemplate(InstanceTemplateBuilder builder) {
      this.name = builder.name;
      this.type = builder.type;
      this.image = builder.image;
      this.rackId = builder.rackId;
      this.config = builder.config;
      this.tags = builder.tags;
      this.normalizeInstance = builder.normalizeInstance;
      this.normalizationConfig = builder.normalizationConfig;
      this.sshUsername = builder.sshUsername;
      this.bootstrapScripts = builder.bootstrapScripts;
      this.sshHostKeyRetrievalType = builder.sshHostKeyRetrievalType;
    }

  public static InstanceTemplateBuilder builder() {
    return new InstanceTemplateBuilder();
  }

  public static class InstanceTemplateBuilder {
      private String name = null;
      private String type = null;
      private String image = null;
      private String rackId = null;
      private Map<String, String> config = new HashMap<String, String>();
      private Map<String, String> tags = new HashMap<String, String>();
      private Boolean normalizeInstance = null;
      private NormalizationConfiguration normalizationConfig = null;
      private String sshUsername = null;
      private List<Script> bootstrapScripts = new ArrayList<Script>();
      private SshHostKeyRetrievalTypeEnum sshHostKeyRetrievalType = null;
  

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


    public InstanceTemplateBuilder rackId(String rackId) {
      this.rackId = rackId;
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


    public InstanceTemplateBuilder normalizationConfig(NormalizationConfiguration normalizationConfig) {
      this.normalizationConfig = normalizationConfig;
      return this;
    }


    public InstanceTemplateBuilder sshUsername(String sshUsername) {
      this.sshUsername = sshUsername;
      return this;
    }


    public InstanceTemplateBuilder bootstrapScripts(List<Script> bootstrapScripts) {
      this.bootstrapScripts = bootstrapScripts;
      return this;
    }


    public InstanceTemplateBuilder sshHostKeyRetrievalType(SshHostKeyRetrievalTypeEnum sshHostKeyRetrievalType) {
      this.sshHostKeyRetrievalType = sshHostKeyRetrievalType;
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
            .rackId(rackId)
            .config(config)
            .tags(tags)
            .normalizeInstance(normalizeInstance)
            .normalizationConfig(normalizationConfig)
            .sshUsername(sshUsername)
            .bootstrapScripts(bootstrapScripts)
            .sshHostKeyRetrievalType(sshHostKeyRetrievalType)
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

  public InstanceTemplate rackId(String rackId) {
    this.rackId = rackId;
    return this;
  }

   /**
   * Instance virtual rack ID
   * @return rackId
  **/
  @ApiModelProperty(value = "Instance virtual rack ID")
  public String getRackId() {
    return rackId;
  }

  public void setRackId(String rackId) {
    this.rackId = rackId;
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

  public InstanceTemplate normalizationConfig(NormalizationConfiguration normalizationConfig) {
    this.normalizationConfig = normalizationConfig;
    return this;
  }

   /**
   * Normalization configuration
   * @return normalizationConfig
  **/
  @ApiModelProperty(value = "Normalization configuration")
  public NormalizationConfiguration getNormalizationConfig() {
    return normalizationConfig;
  }

  public void setNormalizationConfig(NormalizationConfiguration normalizationConfig) {
    this.normalizationConfig = normalizationConfig;
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

  public InstanceTemplate bootstrapScripts(List<Script> bootstrapScripts) {
    this.bootstrapScripts = bootstrapScripts;
    return this;
  }

  public InstanceTemplate addBootstrapScriptsItem(Script bootstrapScriptsItem) {
    if (this.bootstrapScripts == null) {
      this.bootstrapScripts = new ArrayList<Script>();
    }
    this.bootstrapScripts.add(bootstrapScriptsItem);
    return this;
  }

   /**
   * List of instance bootstrap scripts
   * @return bootstrapScripts
  **/
  @ApiModelProperty(value = "List of instance bootstrap scripts")
  public List<Script> getBootstrapScripts() {
    return bootstrapScripts;
  }

  public void setBootstrapScripts(List<Script> bootstrapScripts) {
    this.bootstrapScripts = bootstrapScripts;
  }

  public InstanceTemplate sshHostKeyRetrievalType(SshHostKeyRetrievalTypeEnum sshHostKeyRetrievalType) {
    this.sshHostKeyRetrievalType = sshHostKeyRetrievalType;
    return this;
  }

   /**
   * SSH host key retrieval type
   * @return sshHostKeyRetrievalType
  **/
  @ApiModelProperty(value = "SSH host key retrieval type")
  public SshHostKeyRetrievalTypeEnum getSshHostKeyRetrievalType() {
    return sshHostKeyRetrievalType;
  }

  public void setSshHostKeyRetrievalType(SshHostKeyRetrievalTypeEnum sshHostKeyRetrievalType) {
    this.sshHostKeyRetrievalType = sshHostKeyRetrievalType;
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
        Objects.equals(this.rackId, instanceTemplate.rackId) &&
        Objects.equals(this.config, instanceTemplate.config) &&
        Objects.equals(this.tags, instanceTemplate.tags) &&
        Objects.equals(this.normalizeInstance, instanceTemplate.normalizeInstance) &&
        Objects.equals(this.normalizationConfig, instanceTemplate.normalizationConfig) &&
        Objects.equals(this.sshUsername, instanceTemplate.sshUsername) &&
        Objects.equals(this.bootstrapScripts, instanceTemplate.bootstrapScripts) &&
        Objects.equals(this.sshHostKeyRetrievalType, instanceTemplate.sshHostKeyRetrievalType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, type, image, rackId, config, tags, normalizeInstance, normalizationConfig, sshUsername, bootstrapScripts, sshHostKeyRetrievalType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstanceTemplate {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    rackId: ").append(toIndentedString(rackId)).append("\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    normalizeInstance: ").append(toIndentedString(normalizeInstance)).append("\n");
    sb.append("    normalizationConfig: ").append(toIndentedString(normalizationConfig)).append("\n");
    sb.append("    sshUsername: ").append(toIndentedString(sshUsername)).append("\n");
    sb.append("    bootstrapScripts: ").append(toIndentedString(bootstrapScripts)).append("\n");
    sb.append("    sshHostKeyRetrievalType: ").append(toIndentedString(sshHostKeyRetrievalType)).append("\n");
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

