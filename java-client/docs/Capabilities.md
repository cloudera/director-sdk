
# Capabilities

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**iptablesEnabled** | **Boolean** | Whether iptables is enabled | 
**javaVendor** | [**JavaVendorEnum**](#JavaVendorEnum) | Vendor of installed JDK/JRE |  [optional]
**javaVersion** | **String** | Version of installed JDK/JRE |  [optional]
**operatingSystemType** | [**OperatingSystemTypeEnum**](#OperatingSystemTypeEnum) | Operating system type | 
**operatingSystemVersion** | [**OperatingSystemVersionEnum**](#OperatingSystemVersionEnum) | Operating system version | 
**packageManager** | [**PackageManagerEnum**](#PackageManagerEnum) | Package manager used |  [optional]
**passwordlessSudoEnabled** | **Boolean** | Whether the default login can use passwordless sudo | 
**pythonVersion** | **String** | Version of installed Python |  [optional]
**selinuxEnabled** | **Boolean** | Whether SELinux is enabled | 
**virtualizationType** | [**VirtualizationTypeEnum**](#VirtualizationTypeEnum) | Virtualization type | 


<a name="JavaVendorEnum"></a>
## Enum: JavaVendorEnum
Name | Value
---- | -----
OPENJDK | &quot;OPENJDK&quot;
ORACLE | &quot;ORACLE&quot;
UNKNOWN | &quot;UNKNOWN&quot;


<a name="OperatingSystemTypeEnum"></a>
## Enum: OperatingSystemTypeEnum
Name | Value
---- | -----
REDHAT_COMPATIBLE | &quot;REDHAT_COMPATIBLE&quot;
SLES | &quot;SLES&quot;
DEBIAN | &quot;DEBIAN&quot;
UBUNTU | &quot;UBUNTU&quot;
UNKNOWN | &quot;UNKNOWN&quot;


<a name="OperatingSystemVersionEnum"></a>
## Enum: OperatingSystemVersionEnum
Name | Value
---- | -----
REDHAT_COMPATIBLE_5 | &quot;REDHAT_COMPATIBLE_5&quot;
REDHAT_COMPATIBLE_6 | &quot;REDHAT_COMPATIBLE_6&quot;
REDHAT_COMPATIBLE_7 | &quot;REDHAT_COMPATIBLE_7&quot;
SLES_11_SP1 | &quot;SLES_11_SP1&quot;
SLES_11_SP2 | &quot;SLES_11_SP2&quot;
SLES_11_SP3 | &quot;SLES_11_SP3&quot;
DEBIAN_SQUEEZE | &quot;DEBIAN_SQUEEZE&quot;
DEBIAN_WHEEZY | &quot;DEBIAN_WHEEZY&quot;
UBUNTU_LUCID | &quot;UBUNTU_LUCID&quot;
UBUNTU_PRECISE | &quot;UBUNTU_PRECISE&quot;
UBUNTU_TRUSTY | &quot;UBUNTU_TRUSTY&quot;
UNKNOWN | &quot;UNKNOWN&quot;


<a name="PackageManagerEnum"></a>
## Enum: PackageManagerEnum
Name | Value
---- | -----
APT | &quot;APT&quot;
YUM | &quot;YUM&quot;
ZYPPER | &quot;ZYPPER&quot;
UNKNOWN | &quot;UNKNOWN&quot;


<a name="VirtualizationTypeEnum"></a>
## Enum: VirtualizationTypeEnum
Name | Value
---- | -----
PARAVIRTUALIZATION | &quot;PARAVIRTUALIZATION&quot;
HARDWARE_ASSISTED | &quot;HARDWARE_ASSISTED&quot;
UNKNOWN | &quot;UNKNOWN&quot;



