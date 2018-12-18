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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * A database server external to Cloudera Altus Director and Cloudera Manager
 */
@ApiModel(description = "A database server external to Cloudera Altus Director and Cloudera Manager")

public class ExternalDatabaseServer {
  @SerializedName("name")
  private String name = null;
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
  @SerializedName("hostname")
  private String hostname = null;
  @SerializedName("port")
  private Integer port = null;
  @SerializedName("username")
  private String username = null;
  @SerializedName("password")
  private String password = null;
  @SerializedName("properties")
  private Map<String, String> properties = null;

  public ExternalDatabaseServer() {
    // Do nothing
  }

  private ExternalDatabaseServer(ExternalDatabaseServerBuilder builder) {
      this.name = builder.name;
      this.type = builder.type;
      this.hostname = builder.hostname;
      this.port = builder.port;
      this.username = builder.username;
      this.password = builder.password;
      this.properties = builder.properties;
    }

  public static ExternalDatabaseServerBuilder builder() {
    return new ExternalDatabaseServerBuilder();
  }

  public static class ExternalDatabaseServerBuilder {
      private String name = null;
      private TypeEnum type = null;
      private String hostname = null;
      private Integer port = null;
      private String username = null;
      private String password = null;
      private Map<String, String> properties = new HashMap<String, String>();
  

    public ExternalDatabaseServerBuilder name(String name) {
      this.name = name;
      return this;
    }


    public ExternalDatabaseServerBuilder type(TypeEnum type) {
      this.type = type;
      return this;
    }


    public ExternalDatabaseServerBuilder hostname(String hostname) {
      this.hostname = hostname;
      return this;
    }


    public ExternalDatabaseServerBuilder port(Integer port) {
      this.port = port;
      return this;
    }


    public ExternalDatabaseServerBuilder username(String username) {
      this.username = username;
      return this;
    }


    public ExternalDatabaseServerBuilder password(String password) {
      this.password = password;
      return this;
    }


    public ExternalDatabaseServerBuilder properties(Map<String, String> properties) {
      this.properties = properties;
      return this;
    }


    public ExternalDatabaseServer build() {
      return new ExternalDatabaseServer(this);
    }
  }

  public ExternalDatabaseServerBuilder toBuilder() {
    return builder()
      .name(name)
            .type(type)
            .hostname(hostname)
            .port(port)
            .username(username)
            .password(password)
            .properties(properties)
      ;
  }

  public ExternalDatabaseServer name(String name) {
    this.name = name;
    return this;
  }

   /**
   * External database server name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "External database server name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ExternalDatabaseServer type(TypeEnum type) {
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

  public ExternalDatabaseServer hostname(String hostname) {
    this.hostname = hostname;
    return this;
  }

   /**
   * External database server hostname
   * @return hostname
  **/
  @ApiModelProperty(required = true, value = "External database server hostname")
  public String getHostname() {
    return hostname;
  }

  public void setHostname(String hostname) {
    this.hostname = hostname;
  }

  public ExternalDatabaseServer port(Integer port) {
    this.port = port;
    return this;
  }

   /**
   * External database server port
   * @return port
  **/
  @ApiModelProperty(required = true, value = "External database server port")
  public Integer getPort() {
    return port;
  }

  public void setPort(Integer port) {
    this.port = port;
  }

  public ExternalDatabaseServer username(String username) {
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

  public ExternalDatabaseServer password(String password) {
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

  public ExternalDatabaseServer properties(Map<String, String> properties) {
    this.properties = properties;
    return this;
  }

  public ExternalDatabaseServer putPropertiesItem(String key, String propertiesItem) {
    if (this.properties == null) {
      this.properties = new HashMap<String, String>();
    }
    this.properties.put(key, propertiesItem);
    return this;
  }

   /**
   * External database server display properties
   * @return properties
  **/
  @ApiModelProperty(value = "External database server display properties")
  public Map<String, String> getProperties() {
    return properties;
  }

  public void setProperties(Map<String, String> properties) {
    this.properties = properties;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExternalDatabaseServer externalDatabaseServer = (ExternalDatabaseServer) o;
    return Objects.equals(this.name, externalDatabaseServer.name) &&
        Objects.equals(this.type, externalDatabaseServer.type) &&
        Objects.equals(this.hostname, externalDatabaseServer.hostname) &&
        Objects.equals(this.port, externalDatabaseServer.port) &&
        Objects.equals(this.username, externalDatabaseServer.username) &&
        Objects.equals(this.password, externalDatabaseServer.password) &&
        Objects.equals(this.properties, externalDatabaseServer.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, type, hostname, port, username, password, properties);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalDatabaseServer {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
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

