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


class ResourceProviderMetadata(object):
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
        'type': 'str',
        'name': 'str',
        'description': 'str',
        'configuration_properties': 'list[ConfigurationProperty]',
        'template_properties': 'list[ConfigurationProperty]',
        'resource_display_properties': 'list[DisplayProperty]'
    }

    attribute_map = {
        'id': 'id',
        'type': 'type',
        'name': 'name',
        'description': 'description',
        'configuration_properties': 'configurationProperties',
        'template_properties': 'templateProperties',
        'resource_display_properties': 'resourceDisplayProperties'
    }

    def __init__(self, id=None, type=None, name=None, description=None, configuration_properties=None, template_properties=None, resource_display_properties=None):  # noqa: E501
        """ResourceProviderMetadata - a model defined in Swagger"""  # noqa: E501

        self._id = None
        self._type = None
        self._name = None
        self._description = None
        self._configuration_properties = None
        self._template_properties = None
        self._resource_display_properties = None
        self.discriminator = None

        self.id = id
        self.type = type
        self.name = name
        self.description = description
        if configuration_properties is not None:
            self.configuration_properties = configuration_properties
        if template_properties is not None:
            self.template_properties = template_properties
        if resource_display_properties is not None:
            self.resource_display_properties = resource_display_properties

    @property
    def id(self):
        """Gets the id of this ResourceProviderMetadata.  # noqa: E501

        Resource provider metadata ID  # noqa: E501

        :return: The id of this ResourceProviderMetadata.  # noqa: E501
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this ResourceProviderMetadata.

        Resource provider metadata ID  # noqa: E501

        :param id: The id of this ResourceProviderMetadata.  # noqa: E501
        :type: str
        """
        if id is None:
            raise ValueError("Invalid value for `id`, must not be `None`")  # noqa: E501

        self._id = id

    @property
    def type(self):
        """Gets the type of this ResourceProviderMetadata.  # noqa: E501

        Resource provider metadata type  # noqa: E501

        :return: The type of this ResourceProviderMetadata.  # noqa: E501
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type):
        """Sets the type of this ResourceProviderMetadata.

        Resource provider metadata type  # noqa: E501

        :param type: The type of this ResourceProviderMetadata.  # noqa: E501
        :type: str
        """
        if type is None:
            raise ValueError("Invalid value for `type`, must not be `None`")  # noqa: E501
        allowed_values = ["COMPUTE", "DATABASE", "UNKNOWN"]  # noqa: E501
        if type not in allowed_values:
            raise ValueError(
                "Invalid value for `type` ({0}), must be one of {1}"  # noqa: E501
                .format(type, allowed_values)
            )

        self._type = type

    @property
    def name(self):
        """Gets the name of this ResourceProviderMetadata.  # noqa: E501

        Resource provider name  # noqa: E501

        :return: The name of this ResourceProviderMetadata.  # noqa: E501
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """Sets the name of this ResourceProviderMetadata.

        Resource provider name  # noqa: E501

        :param name: The name of this ResourceProviderMetadata.  # noqa: E501
        :type: str
        """
        if name is None:
            raise ValueError("Invalid value for `name`, must not be `None`")  # noqa: E501

        self._name = name

    @property
    def description(self):
        """Gets the description of this ResourceProviderMetadata.  # noqa: E501

        Resource provider description  # noqa: E501

        :return: The description of this ResourceProviderMetadata.  # noqa: E501
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description):
        """Sets the description of this ResourceProviderMetadata.

        Resource provider description  # noqa: E501

        :param description: The description of this ResourceProviderMetadata.  # noqa: E501
        :type: str
        """
        if description is None:
            raise ValueError("Invalid value for `description`, must not be `None`")  # noqa: E501

        self._description = description

    @property
    def configuration_properties(self):
        """Gets the configuration_properties of this ResourceProviderMetadata.  # noqa: E501

        Resource provider configuration properties  # noqa: E501

        :return: The configuration_properties of this ResourceProviderMetadata.  # noqa: E501
        :rtype: list[ConfigurationProperty]
        """
        return self._configuration_properties

    @configuration_properties.setter
    def configuration_properties(self, configuration_properties):
        """Sets the configuration_properties of this ResourceProviderMetadata.

        Resource provider configuration properties  # noqa: E501

        :param configuration_properties: The configuration_properties of this ResourceProviderMetadata.  # noqa: E501
        :type: list[ConfigurationProperty]
        """

        self._configuration_properties = configuration_properties

    @property
    def template_properties(self):
        """Gets the template_properties of this ResourceProviderMetadata.  # noqa: E501

        Template configuration properties  # noqa: E501

        :return: The template_properties of this ResourceProviderMetadata.  # noqa: E501
        :rtype: list[ConfigurationProperty]
        """
        return self._template_properties

    @template_properties.setter
    def template_properties(self, template_properties):
        """Sets the template_properties of this ResourceProviderMetadata.

        Template configuration properties  # noqa: E501

        :param template_properties: The template_properties of this ResourceProviderMetadata.  # noqa: E501
        :type: list[ConfigurationProperty]
        """

        self._template_properties = template_properties

    @property
    def resource_display_properties(self):
        """Gets the resource_display_properties of this ResourceProviderMetadata.  # noqa: E501

        Resource provider display properties  # noqa: E501

        :return: The resource_display_properties of this ResourceProviderMetadata.  # noqa: E501
        :rtype: list[DisplayProperty]
        """
        return self._resource_display_properties

    @resource_display_properties.setter
    def resource_display_properties(self, resource_display_properties):
        """Sets the resource_display_properties of this ResourceProviderMetadata.

        Resource provider display properties  # noqa: E501

        :param resource_display_properties: The resource_display_properties of this ResourceProviderMetadata.  # noqa: E501
        :type: list[DisplayProperty]
        """

        self._resource_display_properties = resource_display_properties

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
        if not isinstance(other, ResourceProviderMetadata):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
