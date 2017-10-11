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

package com.cloudera.director.client.v10.model;

import java.util.Set;

public class ValidationResult {
  /* Validation Errors */
  private Set<ErrorInfo> errors;
  /* Validation Warnings */
  private Set<WarningInfo> warnings;
  public ValidationResult() { }

  private ValidationResult(Set<ErrorInfo> errors, Set<WarningInfo> warnings) {
    this.errors = errors;
    this.warnings = warnings;
  }

  private ValidationResult(ValidationResultBuilder builder) {
    this.errors = builder.errors;
    this.warnings = builder.warnings;
  }

  public static ValidationResultBuilder builder() {
    return new ValidationResultBuilder();
  }

  public static class ValidationResultBuilder {
    private Set<ErrorInfo> errors = null;
    private Set<WarningInfo> warnings = null;

    public ValidationResultBuilder errors(Set<ErrorInfo> errors) {
      this.errors = errors;
      return this;
    }

    public ValidationResultBuilder warnings(Set<WarningInfo> warnings) {
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
  public Set<ErrorInfo> getErrors() {
    return errors;
  }
  public void setErrors(Set<ErrorInfo> errors) {
    this.errors = errors;
  }

  public Set<WarningInfo> getWarnings() {
    return warnings;
  }
  public void setWarnings(Set<WarningInfo> warnings) {
    this.warnings = warnings;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    ValidationResult other = (ValidationResult) o; // NOPMD

    if (errors != null ?
        !errors.equals(other.errors) :
        other.errors != null) return false;
    if (warnings != null ?
        !warnings.equals(other.warnings) :
        other.warnings != null) return false;
    return true;
  }

  @Override
  public int hashCode() {
    int result = 0;
    result = 31 * result + (errors != null ? errors.hashCode() : 0);
    result = 31 * result + (warnings != null ? warnings.hashCode() : 0);
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    String newLine = System.getProperty("line.separator");
    sb.append("class ValidationResult {" + newLine);
    sb.append("  errors: ").append(errors).append(newLine);
    sb.append("  warnings: ").append(warnings).append(newLine);
    sb.append("}" + newLine);
    return sb.toString();
  }
}

