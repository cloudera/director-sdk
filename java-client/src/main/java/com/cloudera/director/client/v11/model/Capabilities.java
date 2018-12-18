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


package com.cloudera.director.client.v11.model;

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
 * Information about installed and available capabilities of an instance
 */
@ApiModel(description = "Information about installed and available capabilities of an instance")

public class Capabilities {
  /**
   * Operating system type
   */
  @JsonAdapter(OperatingSystemTypeEnum.Adapter.class)
  public enum OperatingSystemTypeEnum {
    REDHAT_COMPATIBLE("REDHAT_COMPATIBLE"),
    
    SLES("SLES"),
    
    DEBIAN("DEBIAN"),
    
    UBUNTU("UBUNTU"),
    
    UNKNOWN("UNKNOWN");

    private String value;

    OperatingSystemTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static OperatingSystemTypeEnum fromValue(String text) {
      for (OperatingSystemTypeEnum b : OperatingSystemTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<OperatingSystemTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final OperatingSystemTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public OperatingSystemTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return OperatingSystemTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("operatingSystemType")
  private OperatingSystemTypeEnum operatingSystemType = null;
  /**
   * Operating system version
   */
  @JsonAdapter(OperatingSystemVersionEnum.Adapter.class)
  public enum OperatingSystemVersionEnum {
    REDHAT_COMPATIBLE_5("REDHAT_COMPATIBLE_5"),
    
    REDHAT_COMPATIBLE_6("REDHAT_COMPATIBLE_6"),
    
    REDHAT_COMPATIBLE_7("REDHAT_COMPATIBLE_7"),
    
    SLES_11_SP1("SLES_11_SP1"),
    
    SLES_11_SP2("SLES_11_SP2"),
    
    SLES_11_SP3("SLES_11_SP3"),
    
    DEBIAN_SQUEEZE("DEBIAN_SQUEEZE"),
    
    DEBIAN_WHEEZY("DEBIAN_WHEEZY"),
    
    UBUNTU_LUCID("UBUNTU_LUCID"),
    
    UBUNTU_PRECISE("UBUNTU_PRECISE"),
    
    UBUNTU_TRUSTY("UBUNTU_TRUSTY"),
    
    UNKNOWN("UNKNOWN");

    private String value;

    OperatingSystemVersionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static OperatingSystemVersionEnum fromValue(String text) {
      for (OperatingSystemVersionEnum b : OperatingSystemVersionEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<OperatingSystemVersionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final OperatingSystemVersionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public OperatingSystemVersionEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return OperatingSystemVersionEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("operatingSystemVersion")
  private OperatingSystemVersionEnum operatingSystemVersion = null;
  /**
   * Virtualization type
   */
  @JsonAdapter(VirtualizationTypeEnum.Adapter.class)
  public enum VirtualizationTypeEnum {
    PARAVIRTUALIZATION("PARAVIRTUALIZATION"),
    
    HARDWARE_ASSISTED("HARDWARE_ASSISTED"),
    
    UNKNOWN("UNKNOWN");

    private String value;

    VirtualizationTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static VirtualizationTypeEnum fromValue(String text) {
      for (VirtualizationTypeEnum b : VirtualizationTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<VirtualizationTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final VirtualizationTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public VirtualizationTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return VirtualizationTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("virtualizationType")
  private VirtualizationTypeEnum virtualizationType = null;
  /**
   * Package manager used
   */
  @JsonAdapter(PackageManagerEnum.Adapter.class)
  public enum PackageManagerEnum {
    APT("APT"),
    
    YUM("YUM"),
    
    ZYPPER("ZYPPER"),
    
    UNKNOWN("UNKNOWN");

    private String value;

    PackageManagerEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PackageManagerEnum fromValue(String text) {
      for (PackageManagerEnum b : PackageManagerEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<PackageManagerEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PackageManagerEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PackageManagerEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return PackageManagerEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("packageManager")
  private PackageManagerEnum packageManager = null;
  /**
   * Vendor of installed JDK/JRE
   */
  @JsonAdapter(JavaVendorEnum.Adapter.class)
  public enum JavaVendorEnum {
    OPENJDK("OPENJDK"),
    
    ORACLE("ORACLE"),
    
    UNKNOWN("UNKNOWN");

    private String value;

    JavaVendorEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static JavaVendorEnum fromValue(String text) {
      for (JavaVendorEnum b : JavaVendorEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<JavaVendorEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final JavaVendorEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public JavaVendorEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return JavaVendorEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("javaVendor")
  private JavaVendorEnum javaVendor = null;
  @SerializedName("javaVersion")
  private String javaVersion = null;
  @SerializedName("pythonVersion")
  private String pythonVersion = null;
  @SerializedName("passwordlessSudoEnabled")
  private Boolean passwordlessSudoEnabled = null;
  @SerializedName("selinuxEnabled")
  private Boolean selinuxEnabled = null;
  @SerializedName("iptablesEnabled")
  private Boolean iptablesEnabled = null;

  public Capabilities() {
    // Do nothing
  }

  private Capabilities(CapabilitiesBuilder builder) {
      this.operatingSystemType = builder.operatingSystemType;
      this.operatingSystemVersion = builder.operatingSystemVersion;
      this.virtualizationType = builder.virtualizationType;
      this.packageManager = builder.packageManager;
      this.javaVendor = builder.javaVendor;
      this.javaVersion = builder.javaVersion;
      this.pythonVersion = builder.pythonVersion;
      this.passwordlessSudoEnabled = builder.passwordlessSudoEnabled;
      this.selinuxEnabled = builder.selinuxEnabled;
      this.iptablesEnabled = builder.iptablesEnabled;
    }

  public static CapabilitiesBuilder builder() {
    return new CapabilitiesBuilder();
  }

  public static class CapabilitiesBuilder {
      private OperatingSystemTypeEnum operatingSystemType = null;
      private OperatingSystemVersionEnum operatingSystemVersion = null;
      private VirtualizationTypeEnum virtualizationType = null;
      private PackageManagerEnum packageManager = null;
      private JavaVendorEnum javaVendor = null;
      private String javaVersion = null;
      private String pythonVersion = null;
      private Boolean passwordlessSudoEnabled = null;
      private Boolean selinuxEnabled = null;
      private Boolean iptablesEnabled = null;
  

    public CapabilitiesBuilder operatingSystemType(OperatingSystemTypeEnum operatingSystemType) {
      this.operatingSystemType = operatingSystemType;
      return this;
    }


    public CapabilitiesBuilder operatingSystemVersion(OperatingSystemVersionEnum operatingSystemVersion) {
      this.operatingSystemVersion = operatingSystemVersion;
      return this;
    }


    public CapabilitiesBuilder virtualizationType(VirtualizationTypeEnum virtualizationType) {
      this.virtualizationType = virtualizationType;
      return this;
    }


    public CapabilitiesBuilder packageManager(PackageManagerEnum packageManager) {
      this.packageManager = packageManager;
      return this;
    }


    public CapabilitiesBuilder javaVendor(JavaVendorEnum javaVendor) {
      this.javaVendor = javaVendor;
      return this;
    }


    public CapabilitiesBuilder javaVersion(String javaVersion) {
      this.javaVersion = javaVersion;
      return this;
    }


    public CapabilitiesBuilder pythonVersion(String pythonVersion) {
      this.pythonVersion = pythonVersion;
      return this;
    }


    public CapabilitiesBuilder passwordlessSudoEnabled(Boolean passwordlessSudoEnabled) {
      this.passwordlessSudoEnabled = passwordlessSudoEnabled;
      return this;
    }


    public CapabilitiesBuilder selinuxEnabled(Boolean selinuxEnabled) {
      this.selinuxEnabled = selinuxEnabled;
      return this;
    }


    public CapabilitiesBuilder iptablesEnabled(Boolean iptablesEnabled) {
      this.iptablesEnabled = iptablesEnabled;
      return this;
    }


    public Capabilities build() {
      return new Capabilities(this);
    }
  }

  public CapabilitiesBuilder toBuilder() {
    return builder()
      .operatingSystemType(operatingSystemType)
            .operatingSystemVersion(operatingSystemVersion)
            .virtualizationType(virtualizationType)
            .packageManager(packageManager)
            .javaVendor(javaVendor)
            .javaVersion(javaVersion)
            .pythonVersion(pythonVersion)
            .passwordlessSudoEnabled(passwordlessSudoEnabled)
            .selinuxEnabled(selinuxEnabled)
            .iptablesEnabled(iptablesEnabled)
      ;
  }

  public Capabilities operatingSystemType(OperatingSystemTypeEnum operatingSystemType) {
    this.operatingSystemType = operatingSystemType;
    return this;
  }

   /**
   * Operating system type
   * @return operatingSystemType
  **/
  @ApiModelProperty(required = true, value = "Operating system type")
  public OperatingSystemTypeEnum getOperatingSystemType() {
    return operatingSystemType;
  }

  public void setOperatingSystemType(OperatingSystemTypeEnum operatingSystemType) {
    this.operatingSystemType = operatingSystemType;
  }

  public Capabilities operatingSystemVersion(OperatingSystemVersionEnum operatingSystemVersion) {
    this.operatingSystemVersion = operatingSystemVersion;
    return this;
  }

   /**
   * Operating system version
   * @return operatingSystemVersion
  **/
  @ApiModelProperty(required = true, value = "Operating system version")
  public OperatingSystemVersionEnum getOperatingSystemVersion() {
    return operatingSystemVersion;
  }

  public void setOperatingSystemVersion(OperatingSystemVersionEnum operatingSystemVersion) {
    this.operatingSystemVersion = operatingSystemVersion;
  }

  public Capabilities virtualizationType(VirtualizationTypeEnum virtualizationType) {
    this.virtualizationType = virtualizationType;
    return this;
  }

   /**
   * Virtualization type
   * @return virtualizationType
  **/
  @ApiModelProperty(required = true, value = "Virtualization type")
  public VirtualizationTypeEnum getVirtualizationType() {
    return virtualizationType;
  }

  public void setVirtualizationType(VirtualizationTypeEnum virtualizationType) {
    this.virtualizationType = virtualizationType;
  }

  public Capabilities packageManager(PackageManagerEnum packageManager) {
    this.packageManager = packageManager;
    return this;
  }

   /**
   * Package manager used
   * @return packageManager
  **/
  @ApiModelProperty(value = "Package manager used")
  public PackageManagerEnum getPackageManager() {
    return packageManager;
  }

  public void setPackageManager(PackageManagerEnum packageManager) {
    this.packageManager = packageManager;
  }

  public Capabilities javaVendor(JavaVendorEnum javaVendor) {
    this.javaVendor = javaVendor;
    return this;
  }

   /**
   * Vendor of installed JDK/JRE
   * @return javaVendor
  **/
  @ApiModelProperty(value = "Vendor of installed JDK/JRE")
  public JavaVendorEnum getJavaVendor() {
    return javaVendor;
  }

  public void setJavaVendor(JavaVendorEnum javaVendor) {
    this.javaVendor = javaVendor;
  }

  public Capabilities javaVersion(String javaVersion) {
    this.javaVersion = javaVersion;
    return this;
  }

   /**
   * Version of installed JDK/JRE
   * @return javaVersion
  **/
  @ApiModelProperty(value = "Version of installed JDK/JRE")
  public String getJavaVersion() {
    return javaVersion;
  }

  public void setJavaVersion(String javaVersion) {
    this.javaVersion = javaVersion;
  }

  public Capabilities pythonVersion(String pythonVersion) {
    this.pythonVersion = pythonVersion;
    return this;
  }

   /**
   * Version of installed Python
   * @return pythonVersion
  **/
  @ApiModelProperty(value = "Version of installed Python")
  public String getPythonVersion() {
    return pythonVersion;
  }

  public void setPythonVersion(String pythonVersion) {
    this.pythonVersion = pythonVersion;
  }

  public Capabilities passwordlessSudoEnabled(Boolean passwordlessSudoEnabled) {
    this.passwordlessSudoEnabled = passwordlessSudoEnabled;
    return this;
  }

   /**
   * Whether the default login can use passwordless sudo
   * @return passwordlessSudoEnabled
  **/
  @ApiModelProperty(required = true, value = "Whether the default login can use passwordless sudo")
  public Boolean isPasswordlessSudoEnabled() {
    return passwordlessSudoEnabled;
  }

  public void setPasswordlessSudoEnabled(Boolean passwordlessSudoEnabled) {
    this.passwordlessSudoEnabled = passwordlessSudoEnabled;
  }

  public Capabilities selinuxEnabled(Boolean selinuxEnabled) {
    this.selinuxEnabled = selinuxEnabled;
    return this;
  }

   /**
   * Whether SELinux is enabled
   * @return selinuxEnabled
  **/
  @ApiModelProperty(required = true, value = "Whether SELinux is enabled")
  public Boolean isSelinuxEnabled() {
    return selinuxEnabled;
  }

  public void setSelinuxEnabled(Boolean selinuxEnabled) {
    this.selinuxEnabled = selinuxEnabled;
  }

  public Capabilities iptablesEnabled(Boolean iptablesEnabled) {
    this.iptablesEnabled = iptablesEnabled;
    return this;
  }

   /**
   * Whether iptables is enabled
   * @return iptablesEnabled
  **/
  @ApiModelProperty(required = true, value = "Whether iptables is enabled")
  public Boolean isIptablesEnabled() {
    return iptablesEnabled;
  }

  public void setIptablesEnabled(Boolean iptablesEnabled) {
    this.iptablesEnabled = iptablesEnabled;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Capabilities capabilities = (Capabilities) o;
    return Objects.equals(this.operatingSystemType, capabilities.operatingSystemType) &&
        Objects.equals(this.operatingSystemVersion, capabilities.operatingSystemVersion) &&
        Objects.equals(this.virtualizationType, capabilities.virtualizationType) &&
        Objects.equals(this.packageManager, capabilities.packageManager) &&
        Objects.equals(this.javaVendor, capabilities.javaVendor) &&
        Objects.equals(this.javaVersion, capabilities.javaVersion) &&
        Objects.equals(this.pythonVersion, capabilities.pythonVersion) &&
        Objects.equals(this.passwordlessSudoEnabled, capabilities.passwordlessSudoEnabled) &&
        Objects.equals(this.selinuxEnabled, capabilities.selinuxEnabled) &&
        Objects.equals(this.iptablesEnabled, capabilities.iptablesEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operatingSystemType, operatingSystemVersion, virtualizationType, packageManager, javaVendor, javaVersion, pythonVersion, passwordlessSudoEnabled, selinuxEnabled, iptablesEnabled);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Capabilities {\n");
    
    sb.append("    operatingSystemType: ").append(toIndentedString(operatingSystemType)).append("\n");
    sb.append("    operatingSystemVersion: ").append(toIndentedString(operatingSystemVersion)).append("\n");
    sb.append("    virtualizationType: ").append(toIndentedString(virtualizationType)).append("\n");
    sb.append("    packageManager: ").append(toIndentedString(packageManager)).append("\n");
    sb.append("    javaVendor: ").append(toIndentedString(javaVendor)).append("\n");
    sb.append("    javaVersion: ").append(toIndentedString(javaVersion)).append("\n");
    sb.append("    pythonVersion: ").append(toIndentedString(pythonVersion)).append("\n");
    sb.append("    passwordlessSudoEnabled: ").append(toIndentedString(passwordlessSudoEnabled)).append("\n");
    sb.append("    selinuxEnabled: ").append(toIndentedString(selinuxEnabled)).append("\n");
    sb.append("    iptablesEnabled: ").append(toIndentedString(iptablesEnabled)).append("\n");
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

