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


package com.cloudera.director.client.d6_0.model;

import java.util.Objects;
import com.cloudera.director.client.d6_0.model.ValidationResult;
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
 * A collection of validation results by component
 */
@ApiModel(description = "A collection of validation results by component")

public class ValidationResults {
  @SerializedName("results")
  private Map<String, ValidationResult> results = new HashMap<String, ValidationResult>();

  public ValidationResults() {
    // Do nothing
  }

  private ValidationResults(ValidationResultsBuilder builder) {
      this.results = builder.results;
    }

  public static ValidationResultsBuilder builder() {
    return new ValidationResultsBuilder();
  }

  public static class ValidationResultsBuilder {
      private Map<String, ValidationResult> results = new HashMap<String, ValidationResult>();
  

    public ValidationResultsBuilder results(Map<String, ValidationResult> results) {
      this.results = results;
      return this;
    }


    public ValidationResults build() {
      return new ValidationResults(this);
    }
  }

  public ValidationResultsBuilder toBuilder() {
    return builder()
      .results(results)
      ;
  }

  public ValidationResults results(Map<String, ValidationResult> results) {
    this.results = results;
    return this;
  }

  public ValidationResults putResultsItem(String key, ValidationResult resultsItem) {
    this.results.put(key, resultsItem);
    return this;
  }

   /**
   * A map of validation results by component
   * @return results
  **/
  @ApiModelProperty(required = true, value = "A map of validation results by component")
  public Map<String, ValidationResult> getResults() {
    return results;
  }

  public void setResults(Map<String, ValidationResult> results) {
    this.results = results;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValidationResults validationResults = (ValidationResults) o;
    return Objects.equals(this.results, validationResults.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(results);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidationResults {\n");
    
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
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

