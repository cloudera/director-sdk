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

/**
 * A notification to be presented to a Cloudera Altus Director user
 */
@ApiModel(description = "A notification to be presented to a Cloudera Altus Director user")

public class Notification {
  /**
   * Notification type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    WARNING("WARNING"),
    
    CRITICAL("CRITICAL");

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
  @SerializedName("message")
  private String message = null;
  @SerializedName("description")
  private String description = null;

  public Notification() {
    // Do nothing
  }

  private Notification(NotificationBuilder builder) {
      this.type = builder.type;
      this.message = builder.message;
      this.description = builder.description;
    }

  public static NotificationBuilder builder() {
    return new NotificationBuilder();
  }

  public static class NotificationBuilder {
      private TypeEnum type = null;
      private String message = null;
      private String description = null;
  

    public NotificationBuilder type(TypeEnum type) {
      this.type = type;
      return this;
    }


    public NotificationBuilder message(String message) {
      this.message = message;
      return this;
    }


    public NotificationBuilder description(String description) {
      this.description = description;
      return this;
    }


    public Notification build() {
      return new Notification(this);
    }
  }

  public NotificationBuilder toBuilder() {
    return builder()
      .type(type)
            .message(message)
            .description(description)
      ;
  }

  public Notification type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Notification type
   * @return type
  **/
  @ApiModelProperty(required = true, value = "Notification type")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public Notification message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Notification message
   * @return message
  **/
  @ApiModelProperty(required = true, value = "Notification message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public Notification description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Notification description
   * @return description
  **/
  @ApiModelProperty(value = "Notification description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Notification notification = (Notification) o;
    return Objects.equals(this.type, notification.type) &&
        Objects.equals(this.message, notification.message) &&
        Objects.equals(this.description, notification.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, message, description);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Notification {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

