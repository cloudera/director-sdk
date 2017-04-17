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

package com.cloudera.director.client.v6.model;

import java.util.HashMap;
import java.util.Map;

public class InstanceTemplate {
  /* Custom script executed before anything else */
  private String bootstrapScript;
  /* Instance configuration properties */
  private Map<String, String> config;
  /* Operating system image */
  private String image;
  /* Instance template name */
  private String name;
  /* Flag indicating whether to normalize the instance */
  private Boolean normalizeInstance;
  /* Optional SSH username to override username specified in environment */
  private String sshUsername;
  /* Instance tags */
  private Map<String, String> tags;
  /* Instance type */
  private String type;
  public InstanceTemplate() { }

  private InstanceTemplate(String bootstrapScript, Map<String, String> config, String image, String name, Boolean normalizeInstance, String sshUsername, Map<String, String> tags, String type) {
    this.bootstrapScript = bootstrapScript;
    this.config = config;
    this.image = image;
    this.name = name;
    this.normalizeInstance = normalizeInstance;
    this.sshUsername = sshUsername;
    this.tags = tags;
    this.type = type;
  }

  private InstanceTemplate(InstanceTemplateBuilder builder) {
    this.bootstrapScript = builder.bootstrapScript;
    this.config = builder.config;
    this.image = builder.image;
    this.name = builder.name;
    this.normalizeInstance = builder.normalizeInstance;
    this.sshUsername = builder.sshUsername;
    this.tags = builder.tags;
    this.type = builder.type;
  }

  public static InstanceTemplateBuilder builder() {
    return new InstanceTemplateBuilder();
  }

  public static class InstanceTemplateBuilder {
    private String bootstrapScript = null;
    private Map<String, String> config = new HashMap<String, String>();
    private String image = null;
    private String name = null;
    private Boolean normalizeInstance = null;
    private String sshUsername = null;
    private Map<String, String> tags = new HashMap<String, String>();
    private String type = null;

    public InstanceTemplateBuilder bootstrapScript(String bootstrapScript) {
      this.bootstrapScript = bootstrapScript;
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

    public InstanceTemplateBuilder normalizeInstance(Boolean normalizeInstance) {
      this.normalizeInstance = normalizeInstance;
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
      .bootstrapScript(bootstrapScript)
      .config(config)
      .image(image)
      .name(name)
      .normalizeInstance(normalizeInstance)
      .sshUsername(sshUsername)
      .tags(tags)
      .type(type)
      ;
  }
  public String getBootstrapScript() {
    return bootstrapScript;
  }
  public void setBootstrapScript(String bootstrapScript) {
    this.bootstrapScript = bootstrapScript;
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

  public Boolean getNormalizeInstance() {
    return normalizeInstance;
  }
  public void setNormalizeInstance(Boolean normalizeInstance) {
    this.normalizeInstance = normalizeInstance;
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

    if (bootstrapScript != null ?
        !bootstrapScript.equals(other.bootstrapScript) :
        other.bootstrapScript != null) return false;
    if (config != null ?
        !config.equals(other.config) :
        other.config != null) return false;
    if (image != null ?
        !image.equals(other.image) :
        other.image != null) return false;
    if (name != null ?
        !name.equals(other.name) :
        other.name != null) return false;
    if (normalizeInstance != null ?
        !normalizeInstance.equals(other.normalizeInstance) :
        other.normalizeInstance != null) return false;
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
    result = 31 * result + (bootstrapScript != null ? bootstrapScript.hashCode() : 0);
    result = 31 * result + (config != null ? config.hashCode() : 0);
    result = 31 * result + (image != null ? image.hashCode() : 0);
    result = 31 * result + (name != null ? name.hashCode() : 0);
    result = 31 * result + (normalizeInstance != null ? normalizeInstance.hashCode() : 0);
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
    sb.append("  bootstrapScript: ").append(bootstrapScript).append(newLine);
    sb.append("  config: ").append(config).append(newLine);
    sb.append("  image: ").append(image).append(newLine);
    sb.append("  name: ").append(name).append(newLine);
    sb.append("  normalizeInstance: ").append(normalizeInstance).append(newLine);
    sb.append("  sshUsername: ").append(sshUsername).append(newLine);
    sb.append("  tags: ").append(tags).append(newLine);
    sb.append("  type: ").append(type).append(newLine);
    sb.append("}" + newLine);
    return sb.toString();
  }
}

