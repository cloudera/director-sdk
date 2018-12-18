# coding: utf-8

"""
Licensed to Cloudera, Inc. under one
or more contributor license agreements.  See the NOTICE file
distributed with this work for additional information
regarding copyright ownership.  Cloudera, Inc. licenses this file
to you under the Apache License, Version 2.0 (the
"License"); you may not use this file except in compliance
with the License.  You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
"""


import pprint
import re  # noqa: F401

import six


class Capabilities(object):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    """
    Attributes:
      swagger_types (dict): The key is attribute name
                            and the value is attribute type.
      attribute_map (dict): The key is attribute name
                            and the value is json key in definition.
    """
    swagger_types = {
        'operating_system_type': 'str',
        'operating_system_version': 'str',
        'virtualization_type': 'str',
        'package_manager': 'str',
        'java_vendor': 'str',
        'java_version': 'str',
        'python_version': 'str',
        'passwordless_sudo_enabled': 'bool',
        'selinux_enabled': 'bool',
        'iptables_enabled': 'bool'
    }

    attribute_map = {
        'operating_system_type': 'operatingSystemType',
        'operating_system_version': 'operatingSystemVersion',
        'virtualization_type': 'virtualizationType',
        'package_manager': 'packageManager',
        'java_vendor': 'javaVendor',
        'java_version': 'javaVersion',
        'python_version': 'pythonVersion',
        'passwordless_sudo_enabled': 'passwordlessSudoEnabled',
        'selinux_enabled': 'selinuxEnabled',
        'iptables_enabled': 'iptablesEnabled'
    }

    def __init__(self, operating_system_type=None, operating_system_version=None, virtualization_type=None, package_manager=None, java_vendor=None, java_version=None, python_version=None, passwordless_sudo_enabled=None, selinux_enabled=None, iptables_enabled=None):  # noqa: E501
        """Capabilities - a model defined in Swagger"""  # noqa: E501

        self._operating_system_type = None
        self._operating_system_version = None
        self._virtualization_type = None
        self._package_manager = None
        self._java_vendor = None
        self._java_version = None
        self._python_version = None
        self._passwordless_sudo_enabled = None
        self._selinux_enabled = None
        self._iptables_enabled = None
        self.discriminator = None

        self.operating_system_type = operating_system_type
        self.operating_system_version = operating_system_version
        self.virtualization_type = virtualization_type
        if package_manager is not None:
            self.package_manager = package_manager
        if java_vendor is not None:
            self.java_vendor = java_vendor
        if java_version is not None:
            self.java_version = java_version
        if python_version is not None:
            self.python_version = python_version
        self.passwordless_sudo_enabled = passwordless_sudo_enabled
        self.selinux_enabled = selinux_enabled
        self.iptables_enabled = iptables_enabled

    @property
    def operating_system_type(self):
        """Gets the operating_system_type of this Capabilities.  # noqa: E501

        Operating system type  # noqa: E501

        :return: The operating_system_type of this Capabilities.  # noqa: E501
        :rtype: str
        """
        return self._operating_system_type

    @operating_system_type.setter
    def operating_system_type(self, operating_system_type):
        """Sets the operating_system_type of this Capabilities.

        Operating system type  # noqa: E501

        :param operating_system_type: The operating_system_type of this Capabilities.  # noqa: E501
        :type: str
        """
        if operating_system_type is None:
            raise ValueError("Invalid value for `operating_system_type`, must not be `None`")  # noqa: E501
        allowed_values = ["REDHAT_COMPATIBLE", "SLES", "DEBIAN", "UBUNTU", "UNKNOWN"]  # noqa: E501
        if operating_system_type not in allowed_values:
            raise ValueError(
                "Invalid value for `operating_system_type` ({0}), must be one of {1}"  # noqa: E501
                .format(operating_system_type, allowed_values)
            )

        self._operating_system_type = operating_system_type

    @property
    def operating_system_version(self):
        """Gets the operating_system_version of this Capabilities.  # noqa: E501

        Operating system version  # noqa: E501

        :return: The operating_system_version of this Capabilities.  # noqa: E501
        :rtype: str
        """
        return self._operating_system_version

    @operating_system_version.setter
    def operating_system_version(self, operating_system_version):
        """Sets the operating_system_version of this Capabilities.

        Operating system version  # noqa: E501

        :param operating_system_version: The operating_system_version of this Capabilities.  # noqa: E501
        :type: str
        """
        if operating_system_version is None:
            raise ValueError("Invalid value for `operating_system_version`, must not be `None`")  # noqa: E501
        allowed_values = ["REDHAT_COMPATIBLE_5", "REDHAT_COMPATIBLE_6", "REDHAT_COMPATIBLE_7", "SLES_11_SP1", "SLES_11_SP2", "SLES_11_SP3", "DEBIAN_SQUEEZE", "DEBIAN_WHEEZY", "UBUNTU_LUCID", "UBUNTU_PRECISE", "UBUNTU_TRUSTY", "UNKNOWN"]  # noqa: E501
        if operating_system_version not in allowed_values:
            raise ValueError(
                "Invalid value for `operating_system_version` ({0}), must be one of {1}"  # noqa: E501
                .format(operating_system_version, allowed_values)
            )

        self._operating_system_version = operating_system_version

    @property
    def virtualization_type(self):
        """Gets the virtualization_type of this Capabilities.  # noqa: E501

        Virtualization type  # noqa: E501

        :return: The virtualization_type of this Capabilities.  # noqa: E501
        :rtype: str
        """
        return self._virtualization_type

    @virtualization_type.setter
    def virtualization_type(self, virtualization_type):
        """Sets the virtualization_type of this Capabilities.

        Virtualization type  # noqa: E501

        :param virtualization_type: The virtualization_type of this Capabilities.  # noqa: E501
        :type: str
        """
        if virtualization_type is None:
            raise ValueError("Invalid value for `virtualization_type`, must not be `None`")  # noqa: E501
        allowed_values = ["PARAVIRTUALIZATION", "HARDWARE_ASSISTED", "UNKNOWN"]  # noqa: E501
        if virtualization_type not in allowed_values:
            raise ValueError(
                "Invalid value for `virtualization_type` ({0}), must be one of {1}"  # noqa: E501
                .format(virtualization_type, allowed_values)
            )

        self._virtualization_type = virtualization_type

    @property
    def package_manager(self):
        """Gets the package_manager of this Capabilities.  # noqa: E501

        Package manager used  # noqa: E501

        :return: The package_manager of this Capabilities.  # noqa: E501
        :rtype: str
        """
        return self._package_manager

    @package_manager.setter
    def package_manager(self, package_manager):
        """Sets the package_manager of this Capabilities.

        Package manager used  # noqa: E501

        :param package_manager: The package_manager of this Capabilities.  # noqa: E501
        :type: str
        """
        allowed_values = ["APT", "YUM", "ZYPPER", "UNKNOWN"]  # noqa: E501
        if package_manager not in allowed_values:
            raise ValueError(
                "Invalid value for `package_manager` ({0}), must be one of {1}"  # noqa: E501
                .format(package_manager, allowed_values)
            )

        self._package_manager = package_manager

    @property
    def java_vendor(self):
        """Gets the java_vendor of this Capabilities.  # noqa: E501

        Vendor of installed JDK/JRE  # noqa: E501

        :return: The java_vendor of this Capabilities.  # noqa: E501
        :rtype: str
        """
        return self._java_vendor

    @java_vendor.setter
    def java_vendor(self, java_vendor):
        """Sets the java_vendor of this Capabilities.

        Vendor of installed JDK/JRE  # noqa: E501

        :param java_vendor: The java_vendor of this Capabilities.  # noqa: E501
        :type: str
        """
        allowed_values = ["OPENJDK", "ORACLE", "UNKNOWN"]  # noqa: E501
        if java_vendor not in allowed_values:
            raise ValueError(
                "Invalid value for `java_vendor` ({0}), must be one of {1}"  # noqa: E501
                .format(java_vendor, allowed_values)
            )

        self._java_vendor = java_vendor

    @property
    def java_version(self):
        """Gets the java_version of this Capabilities.  # noqa: E501

        Version of installed JDK/JRE  # noqa: E501

        :return: The java_version of this Capabilities.  # noqa: E501
        :rtype: str
        """
        return self._java_version

    @java_version.setter
    def java_version(self, java_version):
        """Sets the java_version of this Capabilities.

        Version of installed JDK/JRE  # noqa: E501

        :param java_version: The java_version of this Capabilities.  # noqa: E501
        :type: str
        """

        self._java_version = java_version

    @property
    def python_version(self):
        """Gets the python_version of this Capabilities.  # noqa: E501

        Version of installed Python  # noqa: E501

        :return: The python_version of this Capabilities.  # noqa: E501
        :rtype: str
        """
        return self._python_version

    @python_version.setter
    def python_version(self, python_version):
        """Sets the python_version of this Capabilities.

        Version of installed Python  # noqa: E501

        :param python_version: The python_version of this Capabilities.  # noqa: E501
        :type: str
        """

        self._python_version = python_version

    @property
    def passwordless_sudo_enabled(self):
        """Gets the passwordless_sudo_enabled of this Capabilities.  # noqa: E501

        Whether the default login can use passwordless sudo  # noqa: E501

        :return: The passwordless_sudo_enabled of this Capabilities.  # noqa: E501
        :rtype: bool
        """
        return self._passwordless_sudo_enabled

    @passwordless_sudo_enabled.setter
    def passwordless_sudo_enabled(self, passwordless_sudo_enabled):
        """Sets the passwordless_sudo_enabled of this Capabilities.

        Whether the default login can use passwordless sudo  # noqa: E501

        :param passwordless_sudo_enabled: The passwordless_sudo_enabled of this Capabilities.  # noqa: E501
        :type: bool
        """
        if passwordless_sudo_enabled is None:
            raise ValueError("Invalid value for `passwordless_sudo_enabled`, must not be `None`")  # noqa: E501

        self._passwordless_sudo_enabled = passwordless_sudo_enabled

    @property
    def selinux_enabled(self):
        """Gets the selinux_enabled of this Capabilities.  # noqa: E501

        Whether SELinux is enabled  # noqa: E501

        :return: The selinux_enabled of this Capabilities.  # noqa: E501
        :rtype: bool
        """
        return self._selinux_enabled

    @selinux_enabled.setter
    def selinux_enabled(self, selinux_enabled):
        """Sets the selinux_enabled of this Capabilities.

        Whether SELinux is enabled  # noqa: E501

        :param selinux_enabled: The selinux_enabled of this Capabilities.  # noqa: E501
        :type: bool
        """
        if selinux_enabled is None:
            raise ValueError("Invalid value for `selinux_enabled`, must not be `None`")  # noqa: E501

        self._selinux_enabled = selinux_enabled

    @property
    def iptables_enabled(self):
        """Gets the iptables_enabled of this Capabilities.  # noqa: E501

        Whether iptables is enabled  # noqa: E501

        :return: The iptables_enabled of this Capabilities.  # noqa: E501
        :rtype: bool
        """
        return self._iptables_enabled

    @iptables_enabled.setter
    def iptables_enabled(self, iptables_enabled):
        """Sets the iptables_enabled of this Capabilities.

        Whether iptables is enabled  # noqa: E501

        :param iptables_enabled: The iptables_enabled of this Capabilities.  # noqa: E501
        :type: bool
        """
        if iptables_enabled is None:
            raise ValueError("Invalid value for `iptables_enabled`, must not be `None`")  # noqa: E501

        self._iptables_enabled = iptables_enabled

    def to_dict(self):
        """Returns the model properties as a dict"""
        result = {}

        for attr, _ in six.iteritems(self.swagger_types):
            value = getattr(self, attr)
            if isinstance(value, list):
                result[attr] = list(map(
                    lambda x: x.to_dict() if hasattr(x, "to_dict") else x,
                    value
                ))
            elif hasattr(value, "to_dict"):
                result[attr] = value.to_dict()
            elif isinstance(value, dict):
                result[attr] = dict(map(
                    lambda item: (item[0], item[1].to_dict())
                    if hasattr(item[1], "to_dict") else item,
                    value.items()
                ))
            else:
                result[attr] = value

        return result

    def to_str(self):
        """Returns the string representation of the model"""
        return pprint.pformat(self.to_dict())

    def __repr__(self):
        """For `print` and `pprint`"""
        return self.to_str()

    def __eq__(self, other):
        """Returns true if both objects are equal"""
        if not isinstance(other, Capabilities):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
