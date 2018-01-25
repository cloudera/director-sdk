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


public class NormalizationConfiguration {
  /* Whether the max number of files should be increased during normalization */
  private Boolean increaseMaxNumberOfOpenFiles;
  /* Whether packages should be installed during normalization */
  private Boolean installPackages;
  /* Whether swappiness should be minimized during normalization */
  private Boolean minimizeSwappiness;
  /* Whether services should be adjusted during normalization */
  private Boolean miscellaneousServiceAdjustment;
  /* Whether unmounted disks should be mounted during normalization */
  private Boolean mountAllUnmountedDisks;
  /* Whether prewarming should be performed during normalization */
  private Boolean prewarmDirectory;
  /* Whether the root partition should be resized during normalization */
  private Boolean resizeRootPartition;
  public NormalizationConfiguration() { }

  private NormalizationConfiguration(Boolean increaseMaxNumberOfOpenFiles, Boolean installPackages, Boolean minimizeSwappiness, Boolean miscellaneousServiceAdjustment, Boolean mountAllUnmountedDisks, Boolean prewarmDirectory, Boolean resizeRootPartition) {
    this.increaseMaxNumberOfOpenFiles = increaseMaxNumberOfOpenFiles;
    this.installPackages = installPackages;
    this.minimizeSwappiness = minimizeSwappiness;
    this.miscellaneousServiceAdjustment = miscellaneousServiceAdjustment;
    this.mountAllUnmountedDisks = mountAllUnmountedDisks;
    this.prewarmDirectory = prewarmDirectory;
    this.resizeRootPartition = resizeRootPartition;
  }

  private NormalizationConfiguration(NormalizationConfigurationBuilder builder) {
    this.increaseMaxNumberOfOpenFiles = builder.increaseMaxNumberOfOpenFiles;
    this.installPackages = builder.installPackages;
    this.minimizeSwappiness = builder.minimizeSwappiness;
    this.miscellaneousServiceAdjustment = builder.miscellaneousServiceAdjustment;
    this.mountAllUnmountedDisks = builder.mountAllUnmountedDisks;
    this.prewarmDirectory = builder.prewarmDirectory;
    this.resizeRootPartition = builder.resizeRootPartition;
  }

  public static NormalizationConfigurationBuilder builder() {
    return new NormalizationConfigurationBuilder();
  }

  public static class NormalizationConfigurationBuilder {
    private Boolean increaseMaxNumberOfOpenFiles = null;
    private Boolean installPackages = null;
    private Boolean minimizeSwappiness = null;
    private Boolean miscellaneousServiceAdjustment = null;
    private Boolean mountAllUnmountedDisks = null;
    private Boolean prewarmDirectory = null;
    private Boolean resizeRootPartition = null;

    public NormalizationConfigurationBuilder increaseMaxNumberOfOpenFiles(Boolean increaseMaxNumberOfOpenFiles) {
      this.increaseMaxNumberOfOpenFiles = increaseMaxNumberOfOpenFiles;
      return this;
    }

    public NormalizationConfigurationBuilder installPackages(Boolean installPackages) {
      this.installPackages = installPackages;
      return this;
    }

    public NormalizationConfigurationBuilder minimizeSwappiness(Boolean minimizeSwappiness) {
      this.minimizeSwappiness = minimizeSwappiness;
      return this;
    }

    public NormalizationConfigurationBuilder miscellaneousServiceAdjustment(Boolean miscellaneousServiceAdjustment) {
      this.miscellaneousServiceAdjustment = miscellaneousServiceAdjustment;
      return this;
    }

    public NormalizationConfigurationBuilder mountAllUnmountedDisks(Boolean mountAllUnmountedDisks) {
      this.mountAllUnmountedDisks = mountAllUnmountedDisks;
      return this;
    }

    public NormalizationConfigurationBuilder prewarmDirectory(Boolean prewarmDirectory) {
      this.prewarmDirectory = prewarmDirectory;
      return this;
    }

    public NormalizationConfigurationBuilder resizeRootPartition(Boolean resizeRootPartition) {
      this.resizeRootPartition = resizeRootPartition;
      return this;
    }

    public NormalizationConfiguration build() {
      return new NormalizationConfiguration(this);
    }
  }

  public NormalizationConfigurationBuilder toBuilder() {
    return builder()
      .increaseMaxNumberOfOpenFiles(increaseMaxNumberOfOpenFiles)
      .installPackages(installPackages)
      .minimizeSwappiness(minimizeSwappiness)
      .miscellaneousServiceAdjustment(miscellaneousServiceAdjustment)
      .mountAllUnmountedDisks(mountAllUnmountedDisks)
      .prewarmDirectory(prewarmDirectory)
      .resizeRootPartition(resizeRootPartition)
      ;
  }
  public Boolean getIncreaseMaxNumberOfOpenFiles() {
    return increaseMaxNumberOfOpenFiles;
  }
  public void setIncreaseMaxNumberOfOpenFiles(Boolean increaseMaxNumberOfOpenFiles) {
    this.increaseMaxNumberOfOpenFiles = increaseMaxNumberOfOpenFiles;
  }

  public Boolean getInstallPackages() {
    return installPackages;
  }
  public void setInstallPackages(Boolean installPackages) {
    this.installPackages = installPackages;
  }

  public Boolean getMinimizeSwappiness() {
    return minimizeSwappiness;
  }
  public void setMinimizeSwappiness(Boolean minimizeSwappiness) {
    this.minimizeSwappiness = minimizeSwappiness;
  }

  public Boolean getMiscellaneousServiceAdjustment() {
    return miscellaneousServiceAdjustment;
  }
  public void setMiscellaneousServiceAdjustment(Boolean miscellaneousServiceAdjustment) {
    this.miscellaneousServiceAdjustment = miscellaneousServiceAdjustment;
  }

  public Boolean getMountAllUnmountedDisks() {
    return mountAllUnmountedDisks;
  }
  public void setMountAllUnmountedDisks(Boolean mountAllUnmountedDisks) {
    this.mountAllUnmountedDisks = mountAllUnmountedDisks;
  }

  public Boolean getPrewarmDirectory() {
    return prewarmDirectory;
  }
  public void setPrewarmDirectory(Boolean prewarmDirectory) {
    this.prewarmDirectory = prewarmDirectory;
  }

  public Boolean getResizeRootPartition() {
    return resizeRootPartition;
  }
  public void setResizeRootPartition(Boolean resizeRootPartition) {
    this.resizeRootPartition = resizeRootPartition;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    NormalizationConfiguration other = (NormalizationConfiguration) o; // NOPMD

    if (increaseMaxNumberOfOpenFiles != null ?
        !increaseMaxNumberOfOpenFiles.equals(other.increaseMaxNumberOfOpenFiles) :
        other.increaseMaxNumberOfOpenFiles != null) return false;
    if (installPackages != null ?
        !installPackages.equals(other.installPackages) :
        other.installPackages != null) return false;
    if (minimizeSwappiness != null ?
        !minimizeSwappiness.equals(other.minimizeSwappiness) :
        other.minimizeSwappiness != null) return false;
    if (miscellaneousServiceAdjustment != null ?
        !miscellaneousServiceAdjustment.equals(other.miscellaneousServiceAdjustment) :
        other.miscellaneousServiceAdjustment != null) return false;
    if (mountAllUnmountedDisks != null ?
        !mountAllUnmountedDisks.equals(other.mountAllUnmountedDisks) :
        other.mountAllUnmountedDisks != null) return false;
    if (prewarmDirectory != null ?
        !prewarmDirectory.equals(other.prewarmDirectory) :
        other.prewarmDirectory != null) return false;
    if (resizeRootPartition != null ?
        !resizeRootPartition.equals(other.resizeRootPartition) :
        other.resizeRootPartition != null) return false;
    return true;
  }

  @Override
  public int hashCode() {
    int result = 0;
    result = 31 * result + (increaseMaxNumberOfOpenFiles != null ? increaseMaxNumberOfOpenFiles.hashCode() : 0);
    result = 31 * result + (installPackages != null ? installPackages.hashCode() : 0);
    result = 31 * result + (minimizeSwappiness != null ? minimizeSwappiness.hashCode() : 0);
    result = 31 * result + (miscellaneousServiceAdjustment != null ? miscellaneousServiceAdjustment.hashCode() : 0);
    result = 31 * result + (mountAllUnmountedDisks != null ? mountAllUnmountedDisks.hashCode() : 0);
    result = 31 * result + (prewarmDirectory != null ? prewarmDirectory.hashCode() : 0);
    result = 31 * result + (resizeRootPartition != null ? resizeRootPartition.hashCode() : 0);
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    String newLine = System.getProperty("line.separator");
    sb.append("class NormalizationConfiguration {" + newLine);
    sb.append("  increaseMaxNumberOfOpenFiles: ").append(increaseMaxNumberOfOpenFiles).append(newLine);
    sb.append("  installPackages: ").append(installPackages).append(newLine);
    sb.append("  minimizeSwappiness: ").append(minimizeSwappiness).append(newLine);
    sb.append("  miscellaneousServiceAdjustment: ").append(miscellaneousServiceAdjustment).append(newLine);
    sb.append("  mountAllUnmountedDisks: ").append(mountAllUnmountedDisks).append(newLine);
    sb.append("  prewarmDirectory: ").append(prewarmDirectory).append(newLine);
    sb.append("  resizeRootPartition: ").append(resizeRootPartition).append(newLine);
    sb.append("}" + newLine);
    return sb.toString();
  }
}

