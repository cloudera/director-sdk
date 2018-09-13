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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * A template for a database server external to Cloudera Altus Director and Cloudera Manager
 */
@ApiModel(description = "A template for a database server external to Cloudera Altus Director and Cloudera Manager")

public class ExternalDatabaseServerTemplate {
  @SerializedName("config")
  private Map<String, String> config = null;
  @SerializedName("hostname")
  private String hostname = null;
  @SerializedName("name")
  private String name = null;
  @SerializedName("password")
  private String password = null;
  @SerializedName("port")
  private Integer port = null;
  @SerializedName("tags")
  private Map<String, String> tags = null;
  /**
   * External database server type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    POSTGRESQL("POSTGRESQL"),
    
    MYSQL("MYSQL"),
    
    ORACLE("ORACLE");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("type")
  private TypeEnum type = null;
  @SerializedName("username")
  private String username = null;

  public ExternalDatabaseServerTemplate() {
    // Do nothing
  }

  private ExternalDatabaseServerTemplate(ExternalDatabaseServerTemplateBuilder builder) {
      this.config = builder.config;
      this.hostname = builder.hostname;
      this.name = builder.name;
      this.password = builder.password;
      this.port = builder.port;
      this.tags = builder.tags;
      this.type = builder.type;
      this.username = builder.username;
    }

  public static ExternalDatabaseServerTemplateBuilder builder() {
    return new ExternalDatabaseServerTemplateBuilder();
  }

  public static class ExternalDatabaseServerTemplateBuilder {
      private Map<String, String> config = new HashMap<String, String>();
      private String hostname = null;
      private String name = null;
      private String password = null;
      private Integer port = null;
      private Map<String, String> tags = new HashMap<String, String>();
      private TypeEnum type = null;
      private String username = null;
  

    public ExternalDatabaseServerTemplateBuilder config(Map<String, String> config) {
      this.config = config;
      return this;
    }


    public ExternalDatabaseServerTemplateBuilder hostname(String hostname) {
      this.hostname = hostname;
      return this;
    }


    public ExternalDatabaseServerTemplateBuilder name(String name) {
      this.name = name;
      return this;
    }


    public ExternalDatabaseServerTemplateBuilder password(String password) {
      this.password = password;
      return this;
    }


    public ExternalDatabaseServerTemplateBuilder port(Integer port) {
      this.port = port;
      return this;
    }


    public ExternalDatabaseServerTemplateBuilder tags(Map<String, String> tags) {
      this.tags = tags;
      return this;
    }


    public ExternalDatabaseServerTemplateBuilder type(TypeEnum type) {
      this.type = type;
      return this;
    }


    public ExternalDatabaseServerTemplateBuilder username(String username) {
      this.username = username;
      return this;
    }


    public ExternalDatabaseServerTemplate build() {
      return new ExternalDatabaseServerTemplate(this);
    }
  }

  public ExternalDatabaseServerTemplateBuilder toBuilder() {
    return builder()
      .config(config)
            .hostname(hostname)
            .name(name)
            .password(password)
            .port(port)
            .tags(tags)
            .type(type)
            .username(username)
      ;
  }

  public ExternalDatabaseServerTemplate config(Map<String, String> config) {
    this.config = config;
    return this;
  }

  public ExternalDatabaseServerTemplate putConfigItem(String key, String configItem) {
    if (this.config == null) {
      this.config = new HashMap<String, String>();
    }
    this.config.put(key, configItem);
    return this;
  }

   /**
   * Provider-specific configuration properties for creating a new external database server
   * @return config
  **/
  @ApiModelProperty(value = "Provider-specific configuration properties for creating a new external database server")
  public Map<String, String> getConfig() {
    return config;
  }

  public void setConfig(Map<String, String> config) {
    this.config = config;
  }

  public ExternalDatabaseServerTemplate hostname(String hostname) {
    this.hostname = hostname;
    return this;
  }

   /**
   * If server already exists, external database server hostname
   * @return hostname
  **/
  @ApiModelProperty(value = "If server already exists, external database server hostname")
  public String getHostname() {
    return hostname;
  }

  public void setHostname(String hostname) {
    this.hostname = hostname;
  }

  public ExternalDatabaseServerTemplate name(String name) {
    this.name = name;
    return this;
  }

   /**
   * External database server template name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "External database server template name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ExternalDatabaseServerTemplate password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Password for administrative access to external database server [redacted on read]
   * @return password
  **/
  @ApiModelProperty(required = true, value = "Password for administrative access to external database server [redacted on read]")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public ExternalDatabaseServerTemplate port(Integer port) {
    this.port = port;
    return this;
  }

   /**
   * If server already exists, external database server port
   * @return port
  **/
  @ApiModelProperty(value = "If server already exists, external database server port")
  public Integer getPort() {
    return port;
  }

  public void setPort(Integer port) {
    this.port = port;
  }

  public ExternalDatabaseServerTemplate tags(Map<String, String> tags) {
    this.tags = tags;
    return this;
  }

  public ExternalDatabaseServerTemplate putTagsItem(String key, String tagsItem) {
    if (this.tags == null) {
      this.tags = new HashMap<String, String>();
    }
    this.tags.put(key, tagsItem);
    return this;
  }

   /**
   * Tags to associate with a new external database server
   * @return tags
  **/
  @ApiModelProperty(value = "Tags to associate with a new external database server")
  public Map<String, String> getTags() {
    return tags;
  }

  public void setTags(Map<String, String> tags) {
    this.tags = tags;
  }

  public ExternalDatabaseServerTemplate type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * External database server type
   * @return type
  **/
  @ApiModelProperty(required = true, value = "External database server type")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public ExternalDatabaseServerTemplate username(String username) {
    this.username = username;
    return this;
  }

   /**
   * User name for administrative access to external database server
   * @return username
  **/
  @ApiModelProperty(required = true, value = "User name for administrative access to external database server")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExternalDatabaseServerTemplate externalDatabaseServerTemplate = (ExternalDatabaseServerTemplate) o;
    return Objects.equals(this.config, externalDatabaseServerTemplate.config) &&
        Objects.equals(this.hostname, externalDatabaseServerTemplate.hostname) &&
        Objects.equals(this.name, externalDatabaseServerTemplate.name) &&
        Objects.equals(this.password, externalDatabaseServerTemplate.password) &&
        Objects.equals(this.port, externalDatabaseServerTemplate.port) &&
        Objects.equals(this.tags, externalDatabaseServerTemplate.tags) &&
        Objects.equals(this.type, externalDatabaseServerTemplate.type) &&
        Objects.equals(this.username, externalDatabaseServerTemplate.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(config, hostname, name, password, port, tags, type, username);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalDatabaseServerTemplate {\n");
    
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
    sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
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

