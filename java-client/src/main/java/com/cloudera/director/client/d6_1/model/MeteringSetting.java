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


package com.cloudera.director.client.d6_1.model;

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
 * Settings for usage-based billing
 */
@ApiModel(description = "Settings for usage-based billing")

public class MeteringSetting {
  @SerializedName("billingId")
  private String billingId = null;

  public MeteringSetting() {
    // Do nothing
  }

  private MeteringSetting(MeteringSettingBuilder builder) {
      this.billingId = builder.billingId;
    }

  public static MeteringSettingBuilder builder() {
    return new MeteringSettingBuilder();
  }

  public static class MeteringSettingBuilder {
      private String billingId = null;
  

    public MeteringSettingBuilder billingId(String billingId) {
      this.billingId = billingId;
      return this;
    }


    public MeteringSetting build() {
      return new MeteringSetting(this);
    }
  }

  public MeteringSettingBuilder toBuilder() {
    return builder()
      .billingId(billingId)
      ;
  }

  public MeteringSetting billingId(String billingId) {
    this.billingId = billingId;
    return this;
  }

   /**
   * Billing ID for usage-based billing [redacted on read]
   * @return billingId
  **/
  @ApiModelProperty(value = "Billing ID for usage-based billing [redacted on read]")
  public String getBillingId() {
    return billingId;
  }

  public void setBillingId(String billingId) {
    this.billingId = billingId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MeteringSetting meteringSetting = (MeteringSetting) o;
    return Objects.equals(this.billingId, meteringSetting.billingId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(billingId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MeteringSetting {\n");
    
    sb.append("    billingId: ").append(toIndentedString(billingId)).append("\n");
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

