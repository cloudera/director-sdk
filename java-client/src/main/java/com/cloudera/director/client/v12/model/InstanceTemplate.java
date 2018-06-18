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

package com.cloudera.director.client.v12.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InstanceTemplate {
  /* List of instance bootstrap scripts. */
  private List<String> bootstrapScripts;
  /* Instance configuration properties */
  private Map<String, String> config;
  /* Operating system image */
  private String image;
  /* Instance template name */
  private String name;
  /* Normalization configuration */
  private NormalizationConfiguration normalizationConfig;
  /* Flag indicating whether to normalize the instance */
  private Boolean normalizeInstance;
  /* Instance virtual rack ID */
  private String rackId;
  /* The SSH Host Key Retrieval Type  */
  private String sshHostKeyRetrievalType;
  /* Optional SSH username to override username specified in environment */
  private String sshUsername;
  /* Instance tags */
  private Map<String, String> tags;
  /* Instance type */
  private String type;
  public interface SshHostKeyRetrievalType {
    String NONE = "NONE";
    String INSTANCE = "INSTANCE";
    String PROVIDER = "PROVIDER";
    String FALLBACK = "FALLBACK";
  }
  public InstanceTemplate() { }

  private InstanceTemplate(List<String> bootstrapScripts, Map<String, String> config, String image, String name, NormalizationConfiguration normalizationConfig, Boolean normalizeInstance, String rackId, String sshHostKeyRetrievalType, String sshUsername, Map<String, String> tags, String type) {
    this.bootstrapScripts = bootstrapScripts;
    this.config = config;
    this.image = image;
    this.name = name;
    this.normalizationConfig = normalizationConfig;
    this.normalizeInstance = normalizeInstance;
    this.rackId = rackId;
    this.sshHostKeyRetrievalType = sshHostKeyRetrievalType;
    this.sshUsername = sshUsername;
    this.tags = tags;
    this.type = type;
  }

  private InstanceTemplate(InstanceTemplateBuilder builder) {
    this.bootstrapScripts = builder.bootstrapScripts;
    this.config = builder.config;
    this.image = builder.image;
    this.name = builder.name;
    this.normalizationConfig = builder.normalizationConfig;
    this.normalizeInstance = builder.normalizeInstance;
    this.rackId = builder.rackId;
    this.sshHostKeyRetrievalType = builder.sshHostKeyRetrievalType;
    this.sshUsername = builder.sshUsername;
    this.tags = builder.tags;
    this.type = builder.type;
  }

  public static InstanceTemplateBuilder builder() {
    return new InstanceTemplateBuilder();
  }

  public static class InstanceTemplateBuilder {
    private List<String> bootstrapScripts = new ArrayList<String>();
    private Map<String, String> config = new HashMap<String, String>();
    private String image = null;
    private String name = null;
    private NormalizationConfiguration normalizationConfig = null;
    private Boolean normalizeInstance = null;
    private String rackId = null;
    private String sshHostKeyRetrievalType = null;
    private String sshUsername = null;
    private Map<String, String> tags = new HashMap<String, String>();
    private String type = null;

    public InstanceTemplateBuilder bootstrapScripts(List<String> bootstrapScripts) {
      this.bootstrapScripts = bootstrapScripts;
      return this;
    }

    public InstanceTemplateBuilder config(Map<String, String> config) {
      this.config = config;
      return this;
    }

    public InstanceTemplateBuilder image(String image) {
      this.image = image;
      return this;
    }

    public InstanceTemplateBuilder name(String name) {
      this.name = name;
      return this;
    }

    public InstanceTemplateBuilder normalizationConfig(NormalizationConfiguration normalizationConfig) {
      this.normalizationConfig = normalizationConfig;
      return this;
    }

    public InstanceTemplateBuilder normalizeInstance(Boolean normalizeInstance) {
      this.normalizeInstance = normalizeInstance;
      return this;
    }

    public InstanceTemplateBuilder rackId(String rackId) {
      this.rackId = rackId;
      return this;
    }

    public InstanceTemplateBuilder sshHostKeyRetrievalType(String sshHostKeyRetrievalType) {
      this.sshHostKeyRetrievalType = sshHostKeyRetrievalType;
      return this;
    }

    public InstanceTemplateBuilder sshUsername(String sshUsername) {
      this.sshUsername = sshUsername;
      return this;
    }

    public InstanceTemplateBuilder tags(Map<String, String> tags) {
      this.tags = tags;
      return this;
    }

    public InstanceTemplateBuilder type(String type) {
      this.type = type;
      return this;
    }

    public InstanceTemplate build() {
      return new InstanceTemplate(this);
    }
  }

  public InstanceTemplateBuilder toBuilder() {
    return builder()
      .bootstrapScripts(bootstrapScripts)
      .config(config)
      .image(image)
      .name(name)
      .normalizationConfig(normalizationConfig)
      .normalizeInstance(normalizeInstance)
      .rackId(rackId)
      .sshHostKeyRetrievalType(sshHostKeyRetrievalType)
      .sshUsername(sshUsername)
      .tags(tags)
      .type(type)
      ;
  }
  public List<String> getBootstrapScripts() {
    return bootstrapScripts;
  }
  public void setBootstrapScripts(List<String> bootstrapScripts) {
    this.bootstrapScripts = bootstrapScripts;
  }

  public Map<String, String> getConfig() {
    return config;
  }
  public void setConfig(Map<String, String> config) {
    this.config = config;
  }

  public String getImage() {
    return image;
  }
  public void setImage(String image) {
    this.image = image;
  }

  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  public NormalizationConfiguration getNormalizationConfig() {
    return normalizationConfig;
  }
  public void setNormalizationConfig(NormalizationConfiguration normalizationConfig) {
    this.normalizationConfig = normalizationConfig;
  }

  public Boolean getNormalizeInstance() {
    return normalizeInstance;
  }
  public void setNormalizeInstance(Boolean normalizeInstance) {
    this.normalizeInstance = normalizeInstance;
  }

  public String getRackId() {
    return rackId;
  }
  public void setRackId(String rackId) {
    this.rackId = rackId;
  }

  public String getSshHostKeyRetrievalType() {
    return sshHostKeyRetrievalType;
  }
  public void setSshHostKeyRetrievalType(String sshHostKeyRetrievalType) {
    this.sshHostKeyRetrievalType = sshHostKeyRetrievalType;
  }

  public String getSshUsername() {
    return sshUsername;
  }
  public void setSshUsername(String sshUsername) {
    this.sshUsername = sshUsername;
  }

  public Map<String, String> getTags() {
    return tags;
  }
  public void setTags(Map<String, String> tags) {
    this.tags = tags;
  }

  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    InstanceTemplate other = (InstanceTemplate) o; // NOPMD

    if (bootstrapScripts != null ?
        !bootstrapScripts.equals(other.bootstrapScripts) :
        other.bootstrapScripts != null) return false;
    if (config != null ?
        !config.equals(other.config) :
        other.config != null) return false;
    if (image != null ?
        !image.equals(other.image) :
        other.image != null) return false;
    if (name != null ?
        !name.equals(other.name) :
        other.name != null) return false;
    if (normalizationConfig != null ?
        !normalizationConfig.equals(other.normalizationConfig) :
        other.normalizationConfig != null) return false;
    if (normalizeInstance != null ?
        !normalizeInstance.equals(other.normalizeInstance) :
        other.normalizeInstance != null) return false;
    if (rackId != null ?
        !rackId.equals(other.rackId) :
        other.rackId != null) return false;
    if (sshHostKeyRetrievalType != null ?
        !sshHostKeyRetrievalType.equals(other.sshHostKeyRetrievalType) :
        other.sshHostKeyRetrievalType != null) return false;
    if (sshUsername != null ?
        !sshUsername.equals(other.sshUsername) :
        other.sshUsername != null) return false;
    if (tags != null ?
        !tags.equals(other.tags) :
        other.tags != null) return false;
    if (type != null ?
        !type.equals(other.type) :
        other.type != null) return false;
    return true;
  }

  @Override
  public int hashCode() {
    int result = 0;
    result = 31 * result + (bootstrapScripts != null ? bootstrapScripts.hashCode() : 0);
    result = 31 * result + (config != null ? config.hashCode() : 0);
    result = 31 * result + (image != null ? image.hashCode() : 0);
    result = 31 * result + (name != null ? name.hashCode() : 0);
    result = 31 * result + (normalizationConfig != null ? normalizationConfig.hashCode() : 0);
    result = 31 * result + (normalizeInstance != null ? normalizeInstance.hashCode() : 0);
    result = 31 * result + (rackId != null ? rackId.hashCode() : 0);
    result = 31 * result + (sshHostKeyRetrievalType != null ? sshHostKeyRetrievalType.hashCode() : 0);
    result = 31 * result + (sshUsername != null ? sshUsername.hashCode() : 0);
    result = 31 * result + (tags != null ? tags.hashCode() : 0);
    result = 31 * result + (type != null ? type.hashCode() : 0);
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    String newLine = System.getProperty("line.separator");
    sb.append("class InstanceTemplate {" + newLine);
    sb.append("  bootstrapScripts: ").append(bootstrapScripts).append(newLine);
    sb.append("  config: ").append(config).append(newLine);
    sb.append("  image: ").append(image).append(newLine);
    sb.append("  name: ").append(name).append(newLine);
    sb.append("  normalizationConfig: ").append(normalizationConfig).append(newLine);
    sb.append("  normalizeInstance: ").append(normalizeInstance).append(newLine);
    sb.append("  rackId: ").append(rackId).append(newLine);
    sb.append("  sshHostKeyRetrievalType: ").append(sshHostKeyRetrievalType).append(newLine);
    sb.append("  sshUsername: ").append(sshUsername).append(newLine);
    sb.append("  tags: ").append(tags).append(newLine);
    sb.append("  type: ").append(type).append(newLine);
    sb.append("}" + newLine);
    return sb.toString();
  }
}

