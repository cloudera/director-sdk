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
 * A database residing on an external database server
 */
@ApiModel(description = "A database residing on an external database server")

public class ExternalDatabase {
  @SerializedName("host")
  private String host = null;
  @SerializedName("name")
  private String name = null;
  @SerializedName("password")
  private String password = null;
  @SerializedName("port")
  private Integer port = null;
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
  @SerializedName("user")
  private String user = null;

  public ExternalDatabase() {
    // Do nothing
  }

  private ExternalDatabase(ExternalDatabaseBuilder builder) {
      this.host = builder.host;
      this.name = builder.name;
      this.password = builder.password;
      this.port = builder.port;
      this.type = builder.type;
      this.user = builder.user;
    }

  public static ExternalDatabaseBuilder builder() {
    return new ExternalDatabaseBuilder();
  }

  public static class ExternalDatabaseBuilder {
      private String host = null;
      private String name = null;
      private String password = null;
      private Integer port = null;
      private TypeEnum type = null;
      private String user = null;
  

    public ExternalDatabaseBuilder host(String host) {
      this.host = host;
      return this;
    }


    public ExternalDatabaseBuilder name(String name) {
      this.name = name;
      return this;
    }


    public ExternalDatabaseBuilder password(String password) {
      this.password = password;
      return this;
    }


    public ExternalDatabaseBuilder port(Integer port) {
      this.port = port;
      return this;
    }


    public ExternalDatabaseBuilder type(TypeEnum type) {
      this.type = type;
      return this;
    }


    public ExternalDatabaseBuilder user(String user) {
      this.user = user;
      return this;
    }


    public ExternalDatabase build() {
      return new ExternalDatabase(this);
    }
  }

  public ExternalDatabaseBuilder toBuilder() {
    return builder()
      .host(host)
            .name(name)
            .password(password)
            .port(port)
            .type(type)
            .user(user)
      ;
  }

  public ExternalDatabase host(String host) {
    this.host = host;
    return this;
  }

   /**
   * External database server host
   * @return host
  **/
  @ApiModelProperty(required = true, value = "External database server host")
  public String getHost() {
    return host;
  }

  public void setHost(String host) {
    this.host = host;
  }

  public ExternalDatabase name(String name) {
    this.name = name;
    return this;
  }

   /**
   * External database name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "External database name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ExternalDatabase password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Password for access to database [redacted on read]
   * @return password
  **/
  @ApiModelProperty(required = true, value = "Password for access to database [redacted on read]")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public ExternalDatabase port(Integer port) {
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

  public ExternalDatabase type(TypeEnum type) {
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

  public ExternalDatabase user(String user) {
    this.user = user;
    return this;
  }

   /**
   * User name for access to database
   * @return user
  **/
  @ApiModelProperty(required = true, value = "User name for access to database")
  public String getUser() {
    return user;
  }

  public void setUser(String user) {
    this.user = user;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExternalDatabase externalDatabase = (ExternalDatabase) o;
    return Objects.equals(this.host, externalDatabase.host) &&
        Objects.equals(this.name, externalDatabase.name) &&
        Objects.equals(this.password, externalDatabase.password) &&
        Objects.equals(this.port, externalDatabase.port) &&
        Objects.equals(this.type, externalDatabase.type) &&
        Objects.equals(this.user, externalDatabase.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(host, name, password, port, type, user);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalDatabase {\n");
    
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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

