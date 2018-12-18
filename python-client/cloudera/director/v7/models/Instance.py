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


class Instance(object):
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
        'ip_address': 'str',
        'properties': 'dict(str, str)',
        'virtual_instance': 'VirtualInstance',
        'capabilities': 'Capabilities',
        'health': 'Health'
    }

    attribute_map = {
        'ip_address': 'ipAddress',
        'properties': 'properties',
        'virtual_instance': 'virtualInstance',
        'capabilities': 'capabilities',
        'health': 'health'
    }

    def __init__(self, ip_address=None, properties=None, virtual_instance=None, capabilities=None, health=None):  # noqa: E501
        """Instance - a model defined in Swagger"""  # noqa: E501

        self._ip_address = None
        self._properties = None
        self._virtual_instance = None
        self._capabilities = None
        self._health = None
        self.discriminator = None

        self.ip_address = ip_address
        if properties is not None:
            self.properties = properties
        self.virtual_instance = virtual_instance
        if capabilities is not None:
            self.capabilities = capabilities
        if health is not None:
            self.health = health

    @property
    def ip_address(self):
        """Gets the ip_address of this Instance.  # noqa: E501

        IP address of instance  # noqa: E501

        :return: The ip_address of this Instance.  # noqa: E501
        :rtype: str
        """
        return self._ip_address

    @ip_address.setter
    def ip_address(self, ip_address):
        """Sets the ip_address of this Instance.

        IP address of instance  # noqa: E501

        :param ip_address: The ip_address of this Instance.  # noqa: E501
        :type: str
        """
        if ip_address is None:
            raise ValueError("Invalid value for `ip_address`, must not be `None`")  # noqa: E501

        self._ip_address = ip_address

    @property
    def properties(self):
        """Gets the properties of this Instance.  # noqa: E501

        Instance properties  # noqa: E501

        :return: The properties of this Instance.  # noqa: E501
        :rtype: dict(str, str)
        """
        return self._properties

    @properties.setter
    def properties(self, properties):
        """Sets the properties of this Instance.

        Instance properties  # noqa: E501

        :param properties: The properties of this Instance.  # noqa: E501
        :type: dict(str, str)
        """

        self._properties = properties

    @property
    def virtual_instance(self):
        """Gets the virtual_instance of this Instance.  # noqa: E501

        Virtual instance mapping to this instance  # noqa: E501

        :return: The virtual_instance of this Instance.  # noqa: E501
        :rtype: VirtualInstance
        """
        return self._virtual_instance

    @virtual_instance.setter
    def virtual_instance(self, virtual_instance):
        """Sets the virtual_instance of this Instance.

        Virtual instance mapping to this instance  # noqa: E501

        :param virtual_instance: The virtual_instance of this Instance.  # noqa: E501
        :type: VirtualInstance
        """
        if virtual_instance is None:
            raise ValueError("Invalid value for `virtual_instance`, must not be `None`")  # noqa: E501

        self._virtual_instance = virtual_instance

    @property
    def capabilities(self):
        """Gets the capabilities of this Instance.  # noqa: E501

        Optional instance capabilities  # noqa: E501

        :return: The capabilities of this Instance.  # noqa: E501
        :rtype: Capabilities
        """
        return self._capabilities

    @capabilities.setter
    def capabilities(self, capabilities):
        """Sets the capabilities of this Instance.

        Optional instance capabilities  # noqa: E501

        :param capabilities: The capabilities of this Instance.  # noqa: E501
        :type: Capabilities
        """

        self._capabilities = capabilities

    @property
    def health(self):
        """Gets the health of this Instance.  # noqa: E501

        Instance health  # noqa: E501

        :return: The health of this Instance.  # noqa: E501
        :rtype: Health
        """
        return self._health

    @health.setter
    def health(self, health):
        """Sets the health of this Instance.

        Instance health  # noqa: E501

        :param health: The health of this Instance.  # noqa: E501
        :type: Health
        """

        self._health = health

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
        if not isinstance(other, Instance):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
