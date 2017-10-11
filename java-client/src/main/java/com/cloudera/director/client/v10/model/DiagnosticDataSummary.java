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

import java.util.ArrayList;
import java.util.List;

public class DiagnosticDataSummary {
  private Boolean clouderaManagerLogsDownloaded;
  private Long collectionTime;
  private List<String> details;
  private Boolean diagnosticDataCollected;
  private Boolean diagnosticDataDownloaded;
  private String localFilePath;
  private String status;
  public interface Status {
    String COLLECTING = "COLLECTING";
    String READY = "READY";
    String FAILED = "FAILED";
  }
  public DiagnosticDataSummary() { }

  private DiagnosticDataSummary(Boolean clouderaManagerLogsDownloaded, Long collectionTime, List<String> details, Boolean diagnosticDataCollected, Boolean diagnosticDataDownloaded, String localFilePath, String status) {
    this.clouderaManagerLogsDownloaded = clouderaManagerLogsDownloaded;
    this.collectionTime = collectionTime;
    this.details = details;
    this.diagnosticDataCollected = diagnosticDataCollected;
    this.diagnosticDataDownloaded = diagnosticDataDownloaded;
    this.localFilePath = localFilePath;
    this.status = status;
  }

  private DiagnosticDataSummary(DiagnosticDataSummaryBuilder builder) {
    this.clouderaManagerLogsDownloaded = builder.clouderaManagerLogsDownloaded;
    this.collectionTime = builder.collectionTime;
    this.details = builder.details;
    this.diagnosticDataCollected = builder.diagnosticDataCollected;
    this.diagnosticDataDownloaded = builder.diagnosticDataDownloaded;
    this.localFilePath = builder.localFilePath;
    this.status = builder.status;
  }

  public static DiagnosticDataSummaryBuilder builder() {
    return new DiagnosticDataSummaryBuilder();
  }

  public static class DiagnosticDataSummaryBuilder {
    private Boolean clouderaManagerLogsDownloaded = null;
    private Long collectionTime = null;
    private List<String> details = new ArrayList<String>();
    private Boolean diagnosticDataCollected = null;
    private Boolean diagnosticDataDownloaded = null;
    private String localFilePath = null;
    private String status = null;

    public DiagnosticDataSummaryBuilder clouderaManagerLogsDownloaded(Boolean clouderaManagerLogsDownloaded) {
      this.clouderaManagerLogsDownloaded = clouderaManagerLogsDownloaded;
      return this;
    }

    public DiagnosticDataSummaryBuilder collectionTime(Long collectionTime) {
      this.collectionTime = collectionTime;
      return this;
    }

    public DiagnosticDataSummaryBuilder details(List<String> details) {
      this.details = details;
      return this;
    }

    public DiagnosticDataSummaryBuilder diagnosticDataCollected(Boolean diagnosticDataCollected) {
      this.diagnosticDataCollected = diagnosticDataCollected;
      return this;
    }

    public DiagnosticDataSummaryBuilder diagnosticDataDownloaded(Boolean diagnosticDataDownloaded) {
      this.diagnosticDataDownloaded = diagnosticDataDownloaded;
      return this;
    }

    public DiagnosticDataSummaryBuilder localFilePath(String localFilePath) {
      this.localFilePath = localFilePath;
      return this;
    }

    public DiagnosticDataSummaryBuilder status(String status) {
      this.status = status;
      return this;
    }

    public DiagnosticDataSummary build() {
      return new DiagnosticDataSummary(this);
    }
  }

  public DiagnosticDataSummaryBuilder toBuilder() {
    return builder()
      .clouderaManagerLogsDownloaded(clouderaManagerLogsDownloaded)
      .collectionTime(collectionTime)
      .details(details)
      .diagnosticDataCollected(diagnosticDataCollected)
      .diagnosticDataDownloaded(diagnosticDataDownloaded)
      .localFilePath(localFilePath)
      .status(status)
      ;
  }
  public Boolean getClouderaManagerLogsDownloaded() {
    return clouderaManagerLogsDownloaded;
  }
  public void setClouderaManagerLogsDownloaded(Boolean clouderaManagerLogsDownloaded) {
    this.clouderaManagerLogsDownloaded = clouderaManagerLogsDownloaded;
  }

  public Long getCollectionTime() {
    return collectionTime;
  }
  public void setCollectionTime(Long collectionTime) {
    this.collectionTime = collectionTime;
  }

  public List<String> getDetails() {
    return details;
  }
  public void setDetails(List<String> details) {
    this.details = details;
  }

  public Boolean getDiagnosticDataCollected() {
    return diagnosticDataCollected;
  }
  public void setDiagnosticDataCollected(Boolean diagnosticDataCollected) {
    this.diagnosticDataCollected = diagnosticDataCollected;
  }

  public Boolean getDiagnosticDataDownloaded() {
    return diagnosticDataDownloaded;
  }
  public void setDiagnosticDataDownloaded(Boolean diagnosticDataDownloaded) {
    this.diagnosticDataDownloaded = diagnosticDataDownloaded;
  }

  public String getLocalFilePath() {
    return localFilePath;
  }
  public void setLocalFilePath(String localFilePath) {
    this.localFilePath = localFilePath;
  }

  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    DiagnosticDataSummary other = (DiagnosticDataSummary) o; // NOPMD

    if (clouderaManagerLogsDownloaded != null ?
        !clouderaManagerLogsDownloaded.equals(other.clouderaManagerLogsDownloaded) :
        other.clouderaManagerLogsDownloaded != null) return false;
    if (collectionTime != null ?
        !collectionTime.equals(other.collectionTime) :
        other.collectionTime != null) return false;
    if (details != null ?
        !details.equals(other.details) :
        other.details != null) return false;
    if (diagnosticDataCollected != null ?
        !diagnosticDataCollected.equals(other.diagnosticDataCollected) :
        other.diagnosticDataCollected != null) return false;
    if (diagnosticDataDownloaded != null ?
        !diagnosticDataDownloaded.equals(other.diagnosticDataDownloaded) :
        other.diagnosticDataDownloaded != null) return false;
    if (localFilePath != null ?
        !localFilePath.equals(other.localFilePath) :
        other.localFilePath != null) return false;
    if (status != null ?
        !status.equals(other.status) :
        other.status != null) return false;
    return true;
  }

  @Override
  public int hashCode() {
    int result = 0;
    result = 31 * result + (clouderaManagerLogsDownloaded != null ? clouderaManagerLogsDownloaded.hashCode() : 0);
    result = 31 * result + (collectionTime != null ? collectionTime.hashCode() : 0);
    result = 31 * result + (details != null ? details.hashCode() : 0);
    result = 31 * result + (diagnosticDataCollected != null ? diagnosticDataCollected.hashCode() : 0);
    result = 31 * result + (diagnosticDataDownloaded != null ? diagnosticDataDownloaded.hashCode() : 0);
    result = 31 * result + (localFilePath != null ? localFilePath.hashCode() : 0);
    result = 31 * result + (status != null ? status.hashCode() : 0);
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    String newLine = System.getProperty("line.separator");
    sb.append("class DiagnosticDataSummary {" + newLine);
    sb.append("  clouderaManagerLogsDownloaded: ").append(clouderaManagerLogsDownloaded).append(newLine);
    sb.append("  collectionTime: ").append(collectionTime).append(newLine);
    sb.append("  details: ").append(details).append(newLine);
    sb.append("  diagnosticDataCollected: ").append(diagnosticDataCollected).append(newLine);
    sb.append("  diagnosticDataDownloaded: ").append(diagnosticDataDownloaded).append(newLine);
    sb.append("  localFilePath: ").append(localFilePath).append(newLine);
    sb.append("  status: ").append(status).append(newLine);
    sb.append("}" + newLine);
    return sb.toString();
  }
}

