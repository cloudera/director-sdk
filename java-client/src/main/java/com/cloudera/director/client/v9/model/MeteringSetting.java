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

package com.cloudera.director.client.v9.model;


public class MeteringSetting {
  /* BillingId for Cloudera Manager [redacted on read] */
  private String billingId;
  public MeteringSetting() { }

  public MeteringSetting(String billingId) {
    this.billingId = billingId;
  }
public String getBillingId() {
    return billingId;
  }
  public void setBillingId(String billingId) {
    this.billingId = billingId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    MeteringSetting other = (MeteringSetting) o; // NOPMD

    return true;
  }

  @Override
  public int hashCode() {
    int result = 0;
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    String newLine = System.getProperty("line.separator");
    sb.append("class MeteringSetting {" + newLine);
    sb.append("  billingId: ").append("REDACTED").append(newLine);
    sb.append("}" + newLine);
    return sb.toString();
  }
}

