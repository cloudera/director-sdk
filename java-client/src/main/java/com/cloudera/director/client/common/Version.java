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

package com.cloudera.director.client.common;

import java.util.List;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

public class Version {
  private static final DateTimeFormatter SERVER_TIME_FORMAT =
      DateTimeFormat.forPattern("YYYY-MMM-dd HH:mm:ss zzz");

  /* Director's product version */
  private String productVersion;

  /* List of API versions */
  private List<String> apiVersions;

  /* Current time on the server */
  private DateTime currentServerTime;

  public void setProductVersion(String productVersion) {
    this.productVersion = productVersion;
  }
  public String getProductVersion() {
    return productVersion;
  }

  public void setApiVersions(List<String> apiVersions) {
    this.apiVersions = apiVersions;
  }
  public List<String> getApiVersions() {
    return apiVersions;
  }

  public void setCurrentServerTime(String currentServerTime) {
    this.currentServerTime = DateTime.parse(currentServerTime, SERVER_TIME_FORMAT);
  }
  public DateTime getCurrentServerTime() {
    return currentServerTime;
  }
}

