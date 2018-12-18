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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Configuration for how normalization is performed on new instances
 */
@ApiModel(description = "Configuration for how normalization is performed on new instances")

public class NormalizationConfiguration {
  @SerializedName("prewarmDirectory")
  private Boolean prewarmDirectory = null;
  @SerializedName("installPackages")
  private Boolean installPackages = null;
  @SerializedName("miscellaneousServiceAdjustment")
  private Boolean miscellaneousServiceAdjustment = null;
  @SerializedName("minimizeSwappiness")
  private Boolean minimizeSwappiness = null;
  @SerializedName("increaseMaxNumberOfOpenFiles")
  private Boolean increaseMaxNumberOfOpenFiles = null;
  @SerializedName("resizeRootPartition")
  private Boolean resizeRootPartition = null;
  @SerializedName("mountAllUnmountedDisks")
  private Boolean mountAllUnmountedDisks = null;

  public NormalizationConfiguration() {
    // Do nothing
  }

  private NormalizationConfiguration(NormalizationConfigurationBuilder builder) {
      this.prewarmDirectory = builder.prewarmDirectory;
      this.installPackages = builder.installPackages;
      this.miscellaneousServiceAdjustment = builder.miscellaneousServiceAdjustment;
      this.minimizeSwappiness = builder.minimizeSwappiness;
      this.increaseMaxNumberOfOpenFiles = builder.increaseMaxNumberOfOpenFiles;
      this.resizeRootPartition = builder.resizeRootPartition;
      this.mountAllUnmountedDisks = builder.mountAllUnmountedDisks;
    }

  public static NormalizationConfigurationBuilder builder() {
    return new NormalizationConfigurationBuilder();
  }

  public static class NormalizationConfigurationBuilder {
      private Boolean prewarmDirectory = null;
      private Boolean installPackages = null;
      private Boolean miscellaneousServiceAdjustment = null;
      private Boolean minimizeSwappiness = null;
      private Boolean increaseMaxNumberOfOpenFiles = null;
      private Boolean resizeRootPartition = null;
      private Boolean mountAllUnmountedDisks = null;
  

    public NormalizationConfigurationBuilder prewarmDirectory(Boolean prewarmDirectory) {
      this.prewarmDirectory = prewarmDirectory;
      return this;
    }


    public NormalizationConfigurationBuilder installPackages(Boolean installPackages) {
      this.installPackages = installPackages;
      return this;
    }


    public NormalizationConfigurationBuilder miscellaneousServiceAdjustment(Boolean miscellaneousServiceAdjustment) {
      this.miscellaneousServiceAdjustment = miscellaneousServiceAdjustment;
      return this;
    }


    public NormalizationConfigurationBuilder minimizeSwappiness(Boolean minimizeSwappiness) {
      this.minimizeSwappiness = minimizeSwappiness;
      return this;
    }


    public NormalizationConfigurationBuilder increaseMaxNumberOfOpenFiles(Boolean increaseMaxNumberOfOpenFiles) {
      this.increaseMaxNumberOfOpenFiles = increaseMaxNumberOfOpenFiles;
      return this;
    }


    public NormalizationConfigurationBuilder resizeRootPartition(Boolean resizeRootPartition) {
      this.resizeRootPartition = resizeRootPartition;
      return this;
    }


    public NormalizationConfigurationBuilder mountAllUnmountedDisks(Boolean mountAllUnmountedDisks) {
      this.mountAllUnmountedDisks = mountAllUnmountedDisks;
      return this;
    }


    public NormalizationConfiguration build() {
      return new NormalizationConfiguration(this);
    }
  }

  public NormalizationConfigurationBuilder toBuilder() {
    return builder()
      .prewarmDirectory(prewarmDirectory)
            .installPackages(installPackages)
            .miscellaneousServiceAdjustment(miscellaneousServiceAdjustment)
            .minimizeSwappiness(minimizeSwappiness)
            .increaseMaxNumberOfOpenFiles(increaseMaxNumberOfOpenFiles)
            .resizeRootPartition(resizeRootPartition)
            .mountAllUnmountedDisks(mountAllUnmountedDisks)
      ;
  }

  public NormalizationConfiguration prewarmDirectory(Boolean prewarmDirectory) {
    this.prewarmDirectory = prewarmDirectory;
    return this;
  }

   /**
   * Whether prewarming should be performed during normalization
   * @return prewarmDirectory
  **/
  @ApiModelProperty(value = "Whether prewarming should be performed during normalization")
  public Boolean isPrewarmDirectory() {
    return prewarmDirectory;
  }

  public void setPrewarmDirectory(Boolean prewarmDirectory) {
    this.prewarmDirectory = prewarmDirectory;
  }

  public NormalizationConfiguration installPackages(Boolean installPackages) {
    this.installPackages = installPackages;
    return this;
  }

   /**
   * Whether packages should be installed during normalization
   * @return installPackages
  **/
  @ApiModelProperty(value = "Whether packages should be installed during normalization")
  public Boolean isInstallPackages() {
    return installPackages;
  }

  public void setInstallPackages(Boolean installPackages) {
    this.installPackages = installPackages;
  }

  public NormalizationConfiguration miscellaneousServiceAdjustment(Boolean miscellaneousServiceAdjustment) {
    this.miscellaneousServiceAdjustment = miscellaneousServiceAdjustment;
    return this;
  }

   /**
   * Whether services should be adjusted during normalization
   * @return miscellaneousServiceAdjustment
  **/
  @ApiModelProperty(value = "Whether services should be adjusted during normalization")
  public Boolean isMiscellaneousServiceAdjustment() {
    return miscellaneousServiceAdjustment;
  }

  public void setMiscellaneousServiceAdjustment(Boolean miscellaneousServiceAdjustment) {
    this.miscellaneousServiceAdjustment = miscellaneousServiceAdjustment;
  }

  public NormalizationConfiguration minimizeSwappiness(Boolean minimizeSwappiness) {
    this.minimizeSwappiness = minimizeSwappiness;
    return this;
  }

   /**
   * Whether swappiness should be minimized during normalization
   * @return minimizeSwappiness
  **/
  @ApiModelProperty(value = "Whether swappiness should be minimized during normalization")
  public Boolean isMinimizeSwappiness() {
    return minimizeSwappiness;
  }

  public void setMinimizeSwappiness(Boolean minimizeSwappiness) {
    this.minimizeSwappiness = minimizeSwappiness;
  }

  public NormalizationConfiguration increaseMaxNumberOfOpenFiles(Boolean increaseMaxNumberOfOpenFiles) {
    this.increaseMaxNumberOfOpenFiles = increaseMaxNumberOfOpenFiles;
    return this;
  }

   /**
   * Whether the max number of files should be increased during normalization
   * @return increaseMaxNumberOfOpenFiles
  **/
  @ApiModelProperty(value = "Whether the max number of files should be increased during normalization")
  public Boolean isIncreaseMaxNumberOfOpenFiles() {
    return increaseMaxNumberOfOpenFiles;
  }

  public void setIncreaseMaxNumberOfOpenFiles(Boolean increaseMaxNumberOfOpenFiles) {
    this.increaseMaxNumberOfOpenFiles = increaseMaxNumberOfOpenFiles;
  }

  public NormalizationConfiguration resizeRootPartition(Boolean resizeRootPartition) {
    this.resizeRootPartition = resizeRootPartition;
    return this;
  }

   /**
   * Whether the root partition should be resized during normalization
   * @return resizeRootPartition
  **/
  @ApiModelProperty(value = "Whether the root partition should be resized during normalization")
  public Boolean isResizeRootPartition() {
    return resizeRootPartition;
  }

  public void setResizeRootPartition(Boolean resizeRootPartition) {
    this.resizeRootPartition = resizeRootPartition;
  }

  public NormalizationConfiguration mountAllUnmountedDisks(Boolean mountAllUnmountedDisks) {
    this.mountAllUnmountedDisks = mountAllUnmountedDisks;
    return this;
  }

   /**
   * Whether unmounted disks should be mounted during normalization
   * @return mountAllUnmountedDisks
  **/
  @ApiModelProperty(value = "Whether unmounted disks should be mounted during normalization")
  public Boolean isMountAllUnmountedDisks() {
    return mountAllUnmountedDisks;
  }

  public void setMountAllUnmountedDisks(Boolean mountAllUnmountedDisks) {
    this.mountAllUnmountedDisks = mountAllUnmountedDisks;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NormalizationConfiguration normalizationConfiguration = (NormalizationConfiguration) o;
    return Objects.equals(this.prewarmDirectory, normalizationConfiguration.prewarmDirectory) &&
        Objects.equals(this.installPackages, normalizationConfiguration.installPackages) &&
        Objects.equals(this.miscellaneousServiceAdjustment, normalizationConfiguration.miscellaneousServiceAdjustment) &&
        Objects.equals(this.minimizeSwappiness, normalizationConfiguration.minimizeSwappiness) &&
        Objects.equals(this.increaseMaxNumberOfOpenFiles, normalizationConfiguration.increaseMaxNumberOfOpenFiles) &&
        Objects.equals(this.resizeRootPartition, normalizationConfiguration.resizeRootPartition) &&
        Objects.equals(this.mountAllUnmountedDisks, normalizationConfiguration.mountAllUnmountedDisks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(prewarmDirectory, installPackages, miscellaneousServiceAdjustment, minimizeSwappiness, increaseMaxNumberOfOpenFiles, resizeRootPartition, mountAllUnmountedDisks);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NormalizationConfiguration {\n");
    
    sb.append("    prewarmDirectory: ").append(toIndentedString(prewarmDirectory)).append("\n");
    sb.append("    installPackages: ").append(toIndentedString(installPackages)).append("\n");
    sb.append("    miscellaneousServiceAdjustment: ").append(toIndentedString(miscellaneousServiceAdjustment)).append("\n");
    sb.append("    minimizeSwappiness: ").append(toIndentedString(minimizeSwappiness)).append("\n");
    sb.append("    increaseMaxNumberOfOpenFiles: ").append(toIndentedString(increaseMaxNumberOfOpenFiles)).append("\n");
    sb.append("    resizeRootPartition: ").append(toIndentedString(resizeRootPartition)).append("\n");
    sb.append("    mountAllUnmountedDisks: ").append(toIndentedString(mountAllUnmountedDisks)).append("\n");
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

