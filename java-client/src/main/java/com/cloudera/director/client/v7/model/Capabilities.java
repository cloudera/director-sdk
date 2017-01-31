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

package com.cloudera.director.client.v7.model;


public class Capabilities {
  private Boolean iptablesEnabled;
  private String javaVendor;
  private String javaVersion;
  private String operatingSystemType;
  private String operatingSystemVersion;
  private String packageManager;
  private Boolean passwordlessSudoEnabled;
  private String pythonVersion;
  private String virtualizationType;
  public interface JavaVendor {
    String OPENJDK = "OPENJDK";
    String ORACLE = "ORACLE";
    String UNKNOWN = "UNKNOWN";
  }
  public interface OperatingSystemType {
    String REDHAT_COMPATIBLE = "REDHAT_COMPATIBLE";
    String SLES = "SLES";
    String DEBIAN = "DEBIAN";
    String UBUNTU = "UBUNTU";
    String UNKNOWN = "UNKNOWN";
  }
  public interface OperatingSystemVersion {
    String REDHAT_COMPATIBLE_5 = "REDHAT_COMPATIBLE_5";
    String REDHAT_COMPATIBLE_6 = "REDHAT_COMPATIBLE_6";
    String REDHAT_COMPATIBLE_7 = "REDHAT_COMPATIBLE_7";
    String SLES_11_SP1 = "SLES_11_SP1";
    String SLES_11_SP2 = "SLES_11_SP2";
    String SLES_11_SP3 = "SLES_11_SP3";
    String DEBIAN_SQUEEZE = "DEBIAN_SQUEEZE";
    String DEBIAN_WHEEZY = "DEBIAN_WHEEZY";
    String UBUNTU_LUCID = "UBUNTU_LUCID";
    String UBUNTU_PRECISE = "UBUNTU_PRECISE";
    String UBUNTU_TRUSTY = "UBUNTU_TRUSTY";
    String UNKNOWN = "UNKNOWN";
  }
  public interface PackageManager {
    String APT = "APT";
    String YUM = "YUM";
    String ZYPPER = "ZYPPER";
    String UNKNOWN = "UNKNOWN";
  }
  public interface VirtualizationType {
    String PARAVIRTUALIZATION = "PARAVIRTUALIZATION";
    String HARDWARE_ASSISTED = "HARDWARE_ASSISTED";
    String UNKNOWN = "UNKNOWN";
  }
  public Capabilities() { }

  private Capabilities(Boolean iptablesEnabled, String javaVendor, String javaVersion, String operatingSystemType, String operatingSystemVersion, String packageManager, Boolean passwordlessSudoEnabled, String pythonVersion, String virtualizationType) {
    this.iptablesEnabled = iptablesEnabled;
    this.javaVendor = javaVendor;
    this.javaVersion = javaVersion;
    this.operatingSystemType = operatingSystemType;
    this.operatingSystemVersion = operatingSystemVersion;
    this.packageManager = packageManager;
    this.passwordlessSudoEnabled = passwordlessSudoEnabled;
    this.pythonVersion = pythonVersion;
    this.virtualizationType = virtualizationType;
  }

  private Capabilities(CapabilitiesBuilder builder) {
    this.iptablesEnabled = builder.iptablesEnabled;
    this.javaVendor = builder.javaVendor;
    this.javaVersion = builder.javaVersion;
    this.operatingSystemType = builder.operatingSystemType;
    this.operatingSystemVersion = builder.operatingSystemVersion;
    this.packageManager = builder.packageManager;
    this.passwordlessSudoEnabled = builder.passwordlessSudoEnabled;
    this.pythonVersion = builder.pythonVersion;
    this.virtualizationType = builder.virtualizationType;
  }

  public static CapabilitiesBuilder builder() {
    return new CapabilitiesBuilder();
  }

  public static class CapabilitiesBuilder {
    private Boolean iptablesEnabled = null;
    private String javaVendor = null;
    private String javaVersion = null;
    private String operatingSystemType = null;
    private String operatingSystemVersion = null;
    private String packageManager = null;
    private Boolean passwordlessSudoEnabled = null;
    private String pythonVersion = null;
    private String virtualizationType = null;

    public CapabilitiesBuilder iptablesEnabled(Boolean iptablesEnabled) {
      this.iptablesEnabled = iptablesEnabled;
      return this;
    }

    public CapabilitiesBuilder javaVendor(String javaVendor) {
      this.javaVendor = javaVendor;
      return this;
    }

    public CapabilitiesBuilder javaVersion(String javaVersion) {
      this.javaVersion = javaVersion;
      return this;
    }

    public CapabilitiesBuilder operatingSystemType(String operatingSystemType) {
      this.operatingSystemType = operatingSystemType;
      return this;
    }

    public CapabilitiesBuilder operatingSystemVersion(String operatingSystemVersion) {
      this.operatingSystemVersion = operatingSystemVersion;
      return this;
    }

    public CapabilitiesBuilder packageManager(String packageManager) {
      this.packageManager = packageManager;
      return this;
    }

    public CapabilitiesBuilder passwordlessSudoEnabled(Boolean passwordlessSudoEnabled) {
      this.passwordlessSudoEnabled = passwordlessSudoEnabled;
      return this;
    }

    public CapabilitiesBuilder pythonVersion(String pythonVersion) {
      this.pythonVersion = pythonVersion;
      return this;
    }

    public CapabilitiesBuilder virtualizationType(String virtualizationType) {
      this.virtualizationType = virtualizationType;
      return this;
    }

    public Capabilities build() {
      return new Capabilities(this);
    }
  }

  public CapabilitiesBuilder toBuilder() {
    return builder()
      .iptablesEnabled(iptablesEnabled)
      .javaVendor(javaVendor)
      .javaVersion(javaVersion)
      .operatingSystemType(operatingSystemType)
      .operatingSystemVersion(operatingSystemVersion)
      .packageManager(packageManager)
      .passwordlessSudoEnabled(passwordlessSudoEnabled)
      .pythonVersion(pythonVersion)
      .virtualizationType(virtualizationType)
      ;
  }
  public Boolean getIptablesEnabled() {
    return iptablesEnabled;
  }
  public void setIptablesEnabled(Boolean iptablesEnabled) {
    this.iptablesEnabled = iptablesEnabled;
  }

  public String getJavaVendor() {
    return javaVendor;
  }
  public void setJavaVendor(String javaVendor) {
    this.javaVendor = javaVendor;
  }

  public String getJavaVersion() {
    return javaVersion;
  }
  public void setJavaVersion(String javaVersion) {
    this.javaVersion = javaVersion;
  }

  public String getOperatingSystemType() {
    return operatingSystemType;
  }
  public void setOperatingSystemType(String operatingSystemType) {
    this.operatingSystemType = operatingSystemType;
  }

  public String getOperatingSystemVersion() {
    return operatingSystemVersion;
  }
  public void setOperatingSystemVersion(String operatingSystemVersion) {
    this.operatingSystemVersion = operatingSystemVersion;
  }

  public String getPackageManager() {
    return packageManager;
  }
  public void setPackageManager(String packageManager) {
    this.packageManager = packageManager;
  }

  public Boolean getPasswordlessSudoEnabled() {
    return passwordlessSudoEnabled;
  }
  public void setPasswordlessSudoEnabled(Boolean passwordlessSudoEnabled) {
    this.passwordlessSudoEnabled = passwordlessSudoEnabled;
  }

  public String getPythonVersion() {
    return pythonVersion;
  }
  public void setPythonVersion(String pythonVersion) {
    this.pythonVersion = pythonVersion;
  }

  public String getVirtualizationType() {
    return virtualizationType;
  }
  public void setVirtualizationType(String virtualizationType) {
    this.virtualizationType = virtualizationType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Capabilities other = (Capabilities) o; // NOPMD

    if (iptablesEnabled != null ?
        !iptablesEnabled.equals(other.iptablesEnabled) :
        other.iptablesEnabled != null) return false;
    if (javaVendor != null ?
        !javaVendor.equals(other.javaVendor) :
        other.javaVendor != null) return false;
    if (javaVersion != null ?
        !javaVersion.equals(other.javaVersion) :
        other.javaVersion != null) return false;
    if (operatingSystemType != null ?
        !operatingSystemType.equals(other.operatingSystemType) :
        other.operatingSystemType != null) return false;
    if (operatingSystemVersion != null ?
        !operatingSystemVersion.equals(other.operatingSystemVersion) :
        other.operatingSystemVersion != null) return false;
    if (packageManager != null ?
        !packageManager.equals(other.packageManager) :
        other.packageManager != null) return false;
    if (passwordlessSudoEnabled != null ?
        !passwordlessSudoEnabled.equals(other.passwordlessSudoEnabled) :
        other.passwordlessSudoEnabled != null) return false;
    if (pythonVersion != null ?
        !pythonVersion.equals(other.pythonVersion) :
        other.pythonVersion != null) return false;
    if (virtualizationType != null ?
        !virtualizationType.equals(other.virtualizationType) :
        other.virtualizationType != null) return false;
    return true;
  }

  @Override
  public int hashCode() {
    int result = 0;
    result = 31 * result + (iptablesEnabled != null ? iptablesEnabled.hashCode() : 0);
    result = 31 * result + (javaVendor != null ? javaVendor.hashCode() : 0);
    result = 31 * result + (javaVersion != null ? javaVersion.hashCode() : 0);
    result = 31 * result + (operatingSystemType != null ? operatingSystemType.hashCode() : 0);
    result = 31 * result + (operatingSystemVersion != null ? operatingSystemVersion.hashCode() : 0);
    result = 31 * result + (packageManager != null ? packageManager.hashCode() : 0);
    result = 31 * result + (passwordlessSudoEnabled != null ? passwordlessSudoEnabled.hashCode() : 0);
    result = 31 * result + (pythonVersion != null ? pythonVersion.hashCode() : 0);
    result = 31 * result + (virtualizationType != null ? virtualizationType.hashCode() : 0);
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    String newLine = System.getProperty("line.separator");
    sb.append("class Capabilities {" + newLine);
    sb.append("  iptablesEnabled: ").append(iptablesEnabled).append(newLine);
    sb.append("  javaVendor: ").append(javaVendor).append(newLine);
    sb.append("  javaVersion: ").append(javaVersion).append(newLine);
    sb.append("  operatingSystemType: ").append(operatingSystemType).append(newLine);
    sb.append("  operatingSystemVersion: ").append(operatingSystemVersion).append(newLine);
    sb.append("  packageManager: ").append(packageManager).append(newLine);
    sb.append("  passwordlessSudoEnabled: ").append(passwordlessSudoEnabled).append(newLine);
    sb.append("  pythonVersion: ").append(pythonVersion).append(newLine);
    sb.append("  virtualizationType: ").append(virtualizationType).append(newLine);
    sb.append("}" + newLine);
    return sb.toString();
  }
}

