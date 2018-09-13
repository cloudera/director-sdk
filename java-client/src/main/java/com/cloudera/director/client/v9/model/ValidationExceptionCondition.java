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
 * A condition that caused a validation exception
 */
@ApiModel(description = "A condition that caused a validation exception")

public class ValidationExceptionCondition {
  @SerializedName("key")
  private String key = null;
  @SerializedName("message")
  private String message = null;
  @SerializedName("scope")
  private String scope = null;
  /**
   * The type of condition
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    ERROR("ERROR"),
    
    WARNING("WARNING");

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

  public ValidationExceptionCondition() {
    // Do nothing
  }

  private ValidationExceptionCondition(ValidationExceptionConditionBuilder builder) {
      this.key = builder.key;
      this.message = builder.message;
      this.scope = builder.scope;
      this.type = builder.type;
    }

  public static ValidationExceptionConditionBuilder builder() {
    return new ValidationExceptionConditionBuilder();
  }

  public static class ValidationExceptionConditionBuilder {
      private String key = null;
      private String message = null;
      private String scope = null;
      private TypeEnum type = null;
  

    public ValidationExceptionConditionBuilder key(String key) {
      this.key = key;
      return this;
    }


    public ValidationExceptionConditionBuilder message(String message) {
      this.message = message;
      return this;
    }


    public ValidationExceptionConditionBuilder scope(String scope) {
      this.scope = scope;
      return this;
    }


    public ValidationExceptionConditionBuilder type(TypeEnum type) {
      this.type = type;
      return this;
    }


    public ValidationExceptionCondition build() {
      return new ValidationExceptionCondition(this);
    }
  }

  public ValidationExceptionConditionBuilder toBuilder() {
    return builder()
      .key(key)
            .message(message)
            .scope(scope)
            .type(type)
      ;
  }

  public ValidationExceptionCondition key(String key) {
    this.key = key;
    return this;
  }

   /**
   * The optional key of the condition
   * @return key
  **/
  @ApiModelProperty(value = "The optional key of the condition")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public ValidationExceptionCondition message(String message) {
    this.message = message;
    return this;
  }

   /**
   * The message of the condition
   * @return message
  **/
  @ApiModelProperty(required = true, value = "The message of the condition")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public ValidationExceptionCondition scope(String scope) {
    this.scope = scope;
    return this;
  }

   /**
   * The scope of the condition
   * @return scope
  **/
  @ApiModelProperty(required = true, value = "The scope of the condition")
  public String getScope() {
    return scope;
  }

  public void setScope(String scope) {
    this.scope = scope;
  }

  public ValidationExceptionCondition type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * The type of condition
   * @return type
  **/
  @ApiModelProperty(required = true, value = "The type of condition")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValidationExceptionCondition validationExceptionCondition = (ValidationExceptionCondition) o;
    return Objects.equals(this.key, validationExceptionCondition.key) &&
        Objects.equals(this.message, validationExceptionCondition.message) &&
        Objects.equals(this.scope, validationExceptionCondition.scope) &&
        Objects.equals(this.type, validationExceptionCondition.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, message, scope, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidationExceptionCondition {\n");
    
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

