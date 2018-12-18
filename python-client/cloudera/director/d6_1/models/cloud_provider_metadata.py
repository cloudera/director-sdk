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


class CloudProviderMetadata(object):
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
        'id': 'str',
        'name': 'str',
        'description': 'str',
        'configuration_properties': 'list[ConfigurationProperty]',
        'credentials_properties': 'list[ConfigurationProperty]',
        'resource_providers': 'list[ResourceProviderMetadata]'
    }

    attribute_map = {
        'id': 'id',
        'name': 'name',
        'description': 'description',
        'configuration_properties': 'configurationProperties',
        'credentials_properties': 'credentialsProperties',
        'resource_providers': 'resourceProviders'
    }

    def __init__(self, id=None, name=None, description=None, configuration_properties=None, credentials_properties=None, resource_providers=None):  # noqa: E501
        """CloudProviderMetadata - a model defined in Swagger"""  # noqa: E501

        self._id = None
        self._name = None
        self._description = None
        self._configuration_properties = None
        self._credentials_properties = None
        self._resource_providers = None
        self.discriminator = None

        self.id = id
        self.name = name
        self.description = description
        if configuration_properties is not None:
            self.configuration_properties = configuration_properties
        if credentials_properties is not None:
            self.credentials_properties = credentials_properties
        if resource_providers is not None:
            self.resource_providers = resource_providers

    @property
    def id(self):
        """Gets the id of this CloudProviderMetadata.  # noqa: E501

        Cloud provider metadata ID  # noqa: E501

        :return: The id of this CloudProviderMetadata.  # noqa: E501
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this CloudProviderMetadata.

        Cloud provider metadata ID  # noqa: E501

        :param id: The id of this CloudProviderMetadata.  # noqa: E501
        :type: str
        """
        if id is None:
            raise ValueError("Invalid value for `id`, must not be `None`")  # noqa: E501

        self._id = id

    @property
    def name(self):
        """Gets the name of this CloudProviderMetadata.  # noqa: E501

        Cloud provider name  # noqa: E501

        :return: The name of this CloudProviderMetadata.  # noqa: E501
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """Sets the name of this CloudProviderMetadata.

        Cloud provider name  # noqa: E501

        :param name: The name of this CloudProviderMetadata.  # noqa: E501
        :type: str
        """
        if name is None:
            raise ValueError("Invalid value for `name`, must not be `None`")  # noqa: E501

        self._name = name

    @property
    def description(self):
        """Gets the description of this CloudProviderMetadata.  # noqa: E501

        Cloud provider description  # noqa: E501

        :return: The description of this CloudProviderMetadata.  # noqa: E501
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description):
        """Sets the description of this CloudProviderMetadata.

        Cloud provider description  # noqa: E501

        :param description: The description of this CloudProviderMetadata.  # noqa: E501
        :type: str
        """
        if description is None:
            raise ValueError("Invalid value for `description`, must not be `None`")  # noqa: E501

        self._description = description

    @property
    def configuration_properties(self):
        """Gets the configuration_properties of this CloudProviderMetadata.  # noqa: E501

        Cloud provider configuration properties  # noqa: E501

        :return: The configuration_properties of this CloudProviderMetadata.  # noqa: E501
        :rtype: list[ConfigurationProperty]
        """
        return self._configuration_properties

    @configuration_properties.setter
    def configuration_properties(self, configuration_properties):
        """Sets the configuration_properties of this CloudProviderMetadata.

        Cloud provider configuration properties  # noqa: E501

        :param configuration_properties: The configuration_properties of this CloudProviderMetadata.  # noqa: E501
        :type: list[ConfigurationProperty]
        """

        self._configuration_properties = configuration_properties

    @property
    def credentials_properties(self):
        """Gets the credentials_properties of this CloudProviderMetadata.  # noqa: E501

        Credential configuration properties  # noqa: E501

        :return: The credentials_properties of this CloudProviderMetadata.  # noqa: E501
        :rtype: list[ConfigurationProperty]
        """
        return self._credentials_properties

    @credentials_properties.setter
    def credentials_properties(self, credentials_properties):
        """Sets the credentials_properties of this CloudProviderMetadata.

        Credential configuration properties  # noqa: E501

        :param credentials_properties: The credentials_properties of this CloudProviderMetadata.  # noqa: E501
        :type: list[ConfigurationProperty]
        """

        self._credentials_properties = credentials_properties

    @property
    def resource_providers(self):
        """Gets the resource_providers of this CloudProviderMetadata.  # noqa: E501

        Resource provider metadata  # noqa: E501

        :return: The resource_providers of this CloudProviderMetadata.  # noqa: E501
        :rtype: list[ResourceProviderMetadata]
        """
        return self._resource_providers

    @resource_providers.setter
    def resource_providers(self, resource_providers):
        """Sets the resource_providers of this CloudProviderMetadata.

        Resource provider metadata  # noqa: E501

        :param resource_providers: The resource_providers of this CloudProviderMetadata.  # noqa: E501
        :type: list[ResourceProviderMetadata]
        """

        self._resource_providers = resource_providers

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
        if not isinstance(other, CloudProviderMetadata):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
