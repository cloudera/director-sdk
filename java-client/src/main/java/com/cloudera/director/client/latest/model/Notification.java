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

package com.cloudera.director.client.latest.model;


public class Notification {
  /* description */
  private String description;
  /* message */
  private String message;
  /* type */
  private String type;
  public interface Type {
    String WARNING = "WARNING";
    String CRITICAL = "CRITICAL";
  }
  public Notification() { }

  private Notification(String description, String message, String type) {
    this.description = description;
    this.message = message;
    this.type = type;
  }

  private Notification(NotificationBuilder builder) {
    this.description = builder.description;
    this.message = builder.message;
    this.type = builder.type;
  }

  public static NotificationBuilder builder() {
    return new NotificationBuilder();
  }

  public static class NotificationBuilder {
    private String description = null;
    private String message = null;
    private String type = null;

    public NotificationBuilder description(String description) {
      this.description = description;
      return this;
    }

    public NotificationBuilder message(String message) {
      this.message = message;
      return this;
    }

    public NotificationBuilder type(String type) {
      this.type = type;
      return this;
    }

    public Notification build() {
      return new Notification(this);
    }
  }

  public NotificationBuilder toBuilder() {
    return builder()
      .description(description)
      .message(message)
      .type(type)
      ;
  }
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
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

    Notification other = (Notification) o; // NOPMD

    if (description != null ?
        !description.equals(other.description) :
        other.description != null) return false;
    if (message != null ?
        !message.equals(other.message) :
        other.message != null) return false;
    if (type != null ?
        !type.equals(other.type) :
        other.type != null) return false;
    return true;
  }

  @Override
  public int hashCode() {
    int result = 0;
    result = 31 * result + (description != null ? description.hashCode() : 0);
    result = 31 * result + (message != null ? message.hashCode() : 0);
    result = 31 * result + (type != null ? type.hashCode() : 0);
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    String newLine = System.getProperty("line.separator");
    sb.append("class Notification {" + newLine);
    sb.append("  description: ").append(description).append(newLine);
    sb.append("  message: ").append(message).append(newLine);
    sb.append("  type: ").append(type).append(newLine);
    sb.append("}" + newLine);
    return sb.toString();
  }
}

