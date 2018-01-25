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

package com.cloudera.director.client.v11.model;


public class ValidationExceptionCondition {
  /* The optional key of the condition */
  private String key;
  /* The message of the condition */
  private String message;
  /* The scope of the condition */
  private String scope;
  /* The type of condition */
  private String type;
  public interface Type {
    String ERROR = "ERROR";
    String WARNING = "WARNING";
  }
  public ValidationExceptionCondition() { }

  private ValidationExceptionCondition(String key, String message, String scope, String type) {
    this.key = key;
    this.message = message;
    this.scope = scope;
    this.type = type;
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
    private String type = null;

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

    public ValidationExceptionConditionBuilder type(String type) {
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
  public String getKey() {
    return key;
  }
  public void setKey(String key) {
    this.key = key;
  }

  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }

  public String getScope() {
    return scope;
  }
  public void setScope(String scope) {
    this.scope = scope;
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

    ValidationExceptionCondition other = (ValidationExceptionCondition) o; // NOPMD

    if (key != null ?
        !key.equals(other.key) :
        other.key != null) return false;
    if (message != null ?
        !message.equals(other.message) :
        other.message != null) return false;
    if (scope != null ?
        !scope.equals(other.scope) :
        other.scope != null) return false;
    if (type != null ?
        !type.equals(other.type) :
        other.type != null) return false;
    return true;
  }

  @Override
  public int hashCode() {
    int result = 0;
    result = 31 * result + (key != null ? key.hashCode() : 0);
    result = 31 * result + (message != null ? message.hashCode() : 0);
    result = 31 * result + (scope != null ? scope.hashCode() : 0);
    result = 31 * result + (type != null ? type.hashCode() : 0);
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    String newLine = System.getProperty("line.separator");
    sb.append("class ValidationExceptionCondition {" + newLine);
    sb.append("  key: ").append(key).append(newLine);
    sb.append("  message: ").append(message).append(newLine);
    sb.append("  scope: ").append(scope).append(newLine);
    sb.append("  type: ").append(type).append(newLine);
    sb.append("}" + newLine);
    return sb.toString();
  }
}

