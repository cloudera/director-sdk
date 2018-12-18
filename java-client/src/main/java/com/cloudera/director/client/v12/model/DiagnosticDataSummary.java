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


package com.cloudera.director.client.v12.model;

import java.util.Objects;
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
 * Information about Cloudera Manager diagnostic data
 */
@ApiModel(description = "Information about Cloudera Manager diagnostic data")

public class DiagnosticDataSummary {
  /**
   * Status of the collection effort
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    COLLECTING("COLLECTING"),
    
    READY("READY"),
    
    FAILED("FAILED");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StatusEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("status")
  private StatusEnum status = null;
  @SerializedName("collectionTime")
  private Long collectionTime = null;
  @SerializedName("localFilePath")
  private String localFilePath = null;
  @SerializedName("details")
  private List<String> details = null;
  @SerializedName("diagnosticDataCollected")
  private Boolean diagnosticDataCollected = null;
  @SerializedName("diagnosticDataDownloaded")
  private Boolean diagnosticDataDownloaded = null;
  @SerializedName("clouderaManagerLogsDownloaded")
  private Boolean clouderaManagerLogsDownloaded = null;

  public DiagnosticDataSummary() {
    // Do nothing
  }

  private DiagnosticDataSummary(DiagnosticDataSummaryBuilder builder) {
      this.status = builder.status;
      this.collectionTime = builder.collectionTime;
      this.localFilePath = builder.localFilePath;
      this.details = builder.details;
      this.diagnosticDataCollected = builder.diagnosticDataCollected;
      this.diagnosticDataDownloaded = builder.diagnosticDataDownloaded;
      this.clouderaManagerLogsDownloaded = builder.clouderaManagerLogsDownloaded;
    }

  public static DiagnosticDataSummaryBuilder builder() {
    return new DiagnosticDataSummaryBuilder();
  }

  public static class DiagnosticDataSummaryBuilder {
      private StatusEnum status = null;
      private Long collectionTime = null;
      private String localFilePath = null;
      private List<String> details = new ArrayList<String>();
      private Boolean diagnosticDataCollected = null;
      private Boolean diagnosticDataDownloaded = null;
      private Boolean clouderaManagerLogsDownloaded = null;
  

    public DiagnosticDataSummaryBuilder status(StatusEnum status) {
      this.status = status;
      return this;
    }


    public DiagnosticDataSummaryBuilder collectionTime(Long collectionTime) {
      this.collectionTime = collectionTime;
      return this;
    }


    public DiagnosticDataSummaryBuilder localFilePath(String localFilePath) {
      this.localFilePath = localFilePath;
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


    public DiagnosticDataSummaryBuilder clouderaManagerLogsDownloaded(Boolean clouderaManagerLogsDownloaded) {
      this.clouderaManagerLogsDownloaded = clouderaManagerLogsDownloaded;
      return this;
    }


    public DiagnosticDataSummary build() {
      return new DiagnosticDataSummary(this);
    }
  }

  public DiagnosticDataSummaryBuilder toBuilder() {
    return builder()
      .status(status)
            .collectionTime(collectionTime)
            .localFilePath(localFilePath)
            .details(details)
            .diagnosticDataCollected(diagnosticDataCollected)
            .diagnosticDataDownloaded(diagnosticDataDownloaded)
            .clouderaManagerLogsDownloaded(clouderaManagerLogsDownloaded)
      ;
  }

  public DiagnosticDataSummary status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Status of the collection effort
   * @return status
  **/
  @ApiModelProperty(required = true, value = "Status of the collection effort")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public DiagnosticDataSummary collectionTime(Long collectionTime) {
    this.collectionTime = collectionTime;
    return this;
  }

   /**
   * Time of collection
   * @return collectionTime
  **/
  @ApiModelProperty(required = true, value = "Time of collection")
  public Long getCollectionTime() {
    return collectionTime;
  }

  public void setCollectionTime(Long collectionTime) {
    this.collectionTime = collectionTime;
  }

  public DiagnosticDataSummary localFilePath(String localFilePath) {
    this.localFilePath = localFilePath;
    return this;
  }

   /**
   * Local path to the diagnostic data file
   * @return localFilePath
  **/
  @ApiModelProperty(value = "Local path to the diagnostic data file")
  public String getLocalFilePath() {
    return localFilePath;
  }

  public void setLocalFilePath(String localFilePath) {
    this.localFilePath = localFilePath;
  }

  public DiagnosticDataSummary details(List<String> details) {
    this.details = details;
    return this;
  }

  public DiagnosticDataSummary addDetailsItem(String detailsItem) {
    if (this.details == null) {
      this.details = new ArrayList<String>();
    }
    this.details.add(detailsItem);
    return this;
  }

   /**
   * Details on the collection effort
   * @return details
  **/
  @ApiModelProperty(value = "Details on the collection effort")
  public List<String> getDetails() {
    return details;
  }

  public void setDetails(List<String> details) {
    this.details = details;
  }

  public DiagnosticDataSummary diagnosticDataCollected(Boolean diagnosticDataCollected) {
    this.diagnosticDataCollected = diagnosticDataCollected;
    return this;
  }

   /**
   * Whether diagnostic data was collected successfully by Cloudera Manager
   * @return diagnosticDataCollected
  **/
  @ApiModelProperty(value = "Whether diagnostic data was collected successfully by Cloudera Manager")
  public Boolean isDiagnosticDataCollected() {
    return diagnosticDataCollected;
  }

  public void setDiagnosticDataCollected(Boolean diagnosticDataCollected) {
    this.diagnosticDataCollected = diagnosticDataCollected;
  }

  public DiagnosticDataSummary diagnosticDataDownloaded(Boolean diagnosticDataDownloaded) {
    this.diagnosticDataDownloaded = diagnosticDataDownloaded;
    return this;
  }

   /**
   * Whether diagnostic data was downloaded successfully from Cloudera Manager
   * @return diagnosticDataDownloaded
  **/
  @ApiModelProperty(value = "Whether diagnostic data was downloaded successfully from Cloudera Manager")
  public Boolean isDiagnosticDataDownloaded() {
    return diagnosticDataDownloaded;
  }

  public void setDiagnosticDataDownloaded(Boolean diagnosticDataDownloaded) {
    this.diagnosticDataDownloaded = diagnosticDataDownloaded;
  }

  public DiagnosticDataSummary clouderaManagerLogsDownloaded(Boolean clouderaManagerLogsDownloaded) {
    this.clouderaManagerLogsDownloaded = clouderaManagerLogsDownloaded;
    return this;
  }

   /**
   * Whether Cloudera Manager logs were also downloaded from Cloudera Manager
   * @return clouderaManagerLogsDownloaded
  **/
  @ApiModelProperty(value = "Whether Cloudera Manager logs were also downloaded from Cloudera Manager")
  public Boolean isClouderaManagerLogsDownloaded() {
    return clouderaManagerLogsDownloaded;
  }

  public void setClouderaManagerLogsDownloaded(Boolean clouderaManagerLogsDownloaded) {
    this.clouderaManagerLogsDownloaded = clouderaManagerLogsDownloaded;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DiagnosticDataSummary diagnosticDataSummary = (DiagnosticDataSummary) o;
    return Objects.equals(this.status, diagnosticDataSummary.status) &&
        Objects.equals(this.collectionTime, diagnosticDataSummary.collectionTime) &&
        Objects.equals(this.localFilePath, diagnosticDataSummary.localFilePath) &&
        Objects.equals(this.details, diagnosticDataSummary.details) &&
        Objects.equals(this.diagnosticDataCollected, diagnosticDataSummary.diagnosticDataCollected) &&
        Objects.equals(this.diagnosticDataDownloaded, diagnosticDataSummary.diagnosticDataDownloaded) &&
        Objects.equals(this.clouderaManagerLogsDownloaded, diagnosticDataSummary.clouderaManagerLogsDownloaded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, collectionTime, localFilePath, details, diagnosticDataCollected, diagnosticDataDownloaded, clouderaManagerLogsDownloaded);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DiagnosticDataSummary {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    collectionTime: ").append(toIndentedString(collectionTime)).append("\n");
    sb.append("    localFilePath: ").append(toIndentedString(localFilePath)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    diagnosticDataCollected: ").append(toIndentedString(diagnosticDataCollected)).append("\n");
    sb.append("    diagnosticDataDownloaded: ").append(toIndentedString(diagnosticDataDownloaded)).append("\n");
    sb.append("    clouderaManagerLogsDownloaded: ").append(toIndentedString(clouderaManagerLogsDownloaded)).append("\n");
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

