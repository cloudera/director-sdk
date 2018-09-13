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


package com.cloudera.director.client.v11.model;

import java.util.Objects;
import com.cloudera.director.client.v11.model.ErrorInfo;
import com.cloudera.director.client.v11.model.WarningInfo;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ValidationResult
 */

public class ValidationResult {
  @SerializedName("errors")
  private List<ErrorInfo> errors = new ArrayList<ErrorInfo>();
  @SerializedName("warnings")
  private List<WarningInfo> warnings = new ArrayList<WarningInfo>();

  public ValidationResult() {
    // Do nothing
  }

  private ValidationResult(ValidationResultBuilder builder) {
      this.errors = builder.errors;
      this.warnings = builder.warnings;
    }

  public static ValidationResultBuilder builder() {
    return new ValidationResultBuilder();
  }

  public static class ValidationResultBuilder {
      private List<ErrorInfo> errors = new ArrayList<ErrorInfo>();
      private List<WarningInfo> warnings = new ArrayList<WarningInfo>();
  

    public ValidationResultBuilder errors(List<ErrorInfo> errors) {
      this.errors = errors;
      return this;
    }


    public ValidationResultBuilder warnings(List<WarningInfo> warnings) {
      this.warnings = warnings;
      return this;
    }


    public ValidationResult build() {
      return new ValidationResult(this);
    }
  }

  public ValidationResultBuilder toBuilder() {
    return builder()
      .errors(errors)
            .warnings(warnings)
      ;
  }

  public ValidationResult errors(List<ErrorInfo> errors) {
    this.errors = errors;
    return this;
  }

  public ValidationResult addErrorsItem(ErrorInfo errorsItem) {
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * Validation Errors
   * @return errors
  **/
  @ApiModelProperty(required = true, value = "Validation Errors")
  public List<ErrorInfo> getErrors() {
    return errors;
  }

  public void setErrors(List<ErrorInfo> errors) {
    this.errors = errors;
  }

  public ValidationResult warnings(List<WarningInfo> warnings) {
    this.warnings = warnings;
    return this;
  }

  public ValidationResult addWarningsItem(WarningInfo warningsItem) {
    this.warnings.add(warningsItem);
    return this;
  }

   /**
   * Validation Warnings
   * @return warnings
  **/
  @ApiModelProperty(required = true, value = "Validation Warnings")
  public List<WarningInfo> getWarnings() {
    return warnings;
  }

  public void setWarnings(List<WarningInfo> warnings) {
    this.warnings = warnings;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValidationResult validationResult = (ValidationResult) o;
    return Objects.equals(this.errors, validationResult.errors) &&
        Objects.equals(this.warnings, validationResult.warnings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors, warnings);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidationResult {\n");
    
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    warnings: ").append(toIndentedString(warnings)).append("\n");
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

