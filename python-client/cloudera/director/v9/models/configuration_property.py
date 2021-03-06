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


class ConfigurationProperty(object):
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
        'config_key': 'str',
        'name': 'str',
        'description': 'str',
        'sensitive': 'bool',
        'required': 'bool',
        'basic': 'bool',
        'type': 'str',
        'widget': 'str',
        'default_value': 'str',
        'list_separator': 'str',
        'placeholder': 'str',
        'valid_values': 'list[ConfigurationPropertyValue]'
    }

    attribute_map = {
        'config_key': 'configKey',
        'name': 'name',
        'description': 'description',
        'sensitive': 'sensitive',
        'required': 'required',
        'basic': 'basic',
        'type': 'type',
        'widget': 'widget',
        'default_value': 'defaultValue',
        'list_separator': 'listSeparator',
        'placeholder': 'placeholder',
        'valid_values': 'validValues'
    }

    def __init__(self, config_key=None, name=None, description=None, sensitive=None, required=None, basic=None, type=None, widget=None, default_value=None, list_separator=None, placeholder=None, valid_values=None):  # noqa: E501
        """ConfigurationProperty - a model defined in Swagger"""  # noqa: E501

        self._config_key = None
        self._name = None
        self._description = None
        self._sensitive = None
        self._required = None
        self._basic = None
        self._type = None
        self._widget = None
        self._default_value = None
        self._list_separator = None
        self._placeholder = None
        self._valid_values = None
        self.discriminator = None

        self.config_key = config_key
        if name is not None:
            self.name = name
        if description is not None:
            self.description = description
        if sensitive is not None:
            self.sensitive = sensitive
        if required is not None:
            self.required = required
        if basic is not None:
            self.basic = basic
        if type is not None:
            self.type = type
        if widget is not None:
            self.widget = widget
        if default_value is not None:
            self.default_value = default_value
        if list_separator is not None:
            self.list_separator = list_separator
        if placeholder is not None:
            self.placeholder = placeholder
        if valid_values is not None:
            self.valid_values = valid_values

    @property
    def config_key(self):
        """Gets the config_key of this ConfigurationProperty.  # noqa: E501

        Configuration property key  # noqa: E501

        :return: The config_key of this ConfigurationProperty.  # noqa: E501
        :rtype: str
        """
        return self._config_key

    @config_key.setter
    def config_key(self, config_key):
        """Sets the config_key of this ConfigurationProperty.

        Configuration property key  # noqa: E501

        :param config_key: The config_key of this ConfigurationProperty.  # noqa: E501
        :type: str
        """
        if config_key is None:
            raise ValueError("Invalid value for `config_key`, must not be `None`")  # noqa: E501

        self._config_key = config_key

    @property
    def name(self):
        """Gets the name of this ConfigurationProperty.  # noqa: E501

        Configuration property name  # noqa: E501

        :return: The name of this ConfigurationProperty.  # noqa: E501
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """Sets the name of this ConfigurationProperty.

        Configuration property name  # noqa: E501

        :param name: The name of this ConfigurationProperty.  # noqa: E501
        :type: str
        """

        self._name = name

    @property
    def description(self):
        """Gets the description of this ConfigurationProperty.  # noqa: E501

        Configuration property description  # noqa: E501

        :return: The description of this ConfigurationProperty.  # noqa: E501
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description):
        """Sets the description of this ConfigurationProperty.

        Configuration property description  # noqa: E501

        :param description: The description of this ConfigurationProperty.  # noqa: E501
        :type: str
        """

        self._description = description

    @property
    def sensitive(self):
        """Gets the sensitive of this ConfigurationProperty.  # noqa: E501

        Whether this property is sensitive  # noqa: E501

        :return: The sensitive of this ConfigurationProperty.  # noqa: E501
        :rtype: bool
        """
        return self._sensitive

    @sensitive.setter
    def sensitive(self, sensitive):
        """Sets the sensitive of this ConfigurationProperty.

        Whether this property is sensitive  # noqa: E501

        :param sensitive: The sensitive of this ConfigurationProperty.  # noqa: E501
        :type: bool
        """

        self._sensitive = sensitive

    @property
    def required(self):
        """Gets the required of this ConfigurationProperty.  # noqa: E501

        Whether this property is required  # noqa: E501

        :return: The required of this ConfigurationProperty.  # noqa: E501
        :rtype: bool
        """
        return self._required

    @required.setter
    def required(self, required):
        """Sets the required of this ConfigurationProperty.

        Whether this property is required  # noqa: E501

        :param required: The required of this ConfigurationProperty.  # noqa: E501
        :type: bool
        """

        self._required = required

    @property
    def basic(self):
        """Gets the basic of this ConfigurationProperty.  # noqa: E501

        Whether this property is basic  # noqa: E501

        :return: The basic of this ConfigurationProperty.  # noqa: E501
        :rtype: bool
        """
        return self._basic

    @basic.setter
    def basic(self, basic):
        """Sets the basic of this ConfigurationProperty.

        Whether this property is basic  # noqa: E501

        :param basic: The basic of this ConfigurationProperty.  # noqa: E501
        :type: bool
        """

        self._basic = basic

    @property
    def type(self):
        """Gets the type of this ConfigurationProperty.  # noqa: E501

        Configuration property type  # noqa: E501

        :return: The type of this ConfigurationProperty.  # noqa: E501
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type):
        """Sets the type of this ConfigurationProperty.

        Configuration property type  # noqa: E501

        :param type: The type of this ConfigurationProperty.  # noqa: E501
        :type: str
        """
        allowed_values = ["BOOLEAN", "INTEGER", "DOUBLE", "STRING"]  # noqa: E501
        if type not in allowed_values:
            raise ValueError(
                "Invalid value for `type` ({0}), must be one of {1}"  # noqa: E501
                .format(type, allowed_values)
            )

        self._type = type

    @property
    def widget(self):
        """Gets the widget of this ConfigurationProperty.  # noqa: E501

        Widget used to display this property  # noqa: E501

        :return: The widget of this ConfigurationProperty.  # noqa: E501
        :rtype: str
        """
        return self._widget

    @widget.setter
    def widget(self, widget):
        """Sets the widget of this ConfigurationProperty.

        Widget used to display this property  # noqa: E501

        :param widget: The widget of this ConfigurationProperty.  # noqa: E501
        :type: str
        """
        allowed_values = ["RADIO", "CHECKBOX", "TEXT", "PASSWORD", "NUMBER", "TEXTAREA", "FILE", "LIST", "OPENLIST", "MULTI", "OPENMULTI"]  # noqa: E501
        if widget not in allowed_values:
            raise ValueError(
                "Invalid value for `widget` ({0}), must be one of {1}"  # noqa: E501
                .format(widget, allowed_values)
            )

        self._widget = widget

    @property
    def default_value(self):
        """Gets the default_value of this ConfigurationProperty.  # noqa: E501

        Default value for this property  # noqa: E501

        :return: The default_value of this ConfigurationProperty.  # noqa: E501
        :rtype: str
        """
        return self._default_value

    @default_value.setter
    def default_value(self, default_value):
        """Sets the default_value of this ConfigurationProperty.

        Default value for this property  # noqa: E501

        :param default_value: The default_value of this ConfigurationProperty.  # noqa: E501
        :type: str
        """

        self._default_value = default_value

    @property
    def list_separator(self):
        """Gets the list_separator of this ConfigurationProperty.  # noqa: E501

        Character to use to separate lists  # noqa: E501

        :return: The list_separator of this ConfigurationProperty.  # noqa: E501
        :rtype: str
        """
        return self._list_separator

    @list_separator.setter
    def list_separator(self, list_separator):
        """Sets the list_separator of this ConfigurationProperty.

        Character to use to separate lists  # noqa: E501

        :param list_separator: The list_separator of this ConfigurationProperty.  # noqa: E501
        :type: str
        """

        self._list_separator = list_separator

    @property
    def placeholder(self):
        """Gets the placeholder of this ConfigurationProperty.  # noqa: E501

        Placeholder value to use if the value is unset  # noqa: E501

        :return: The placeholder of this ConfigurationProperty.  # noqa: E501
        :rtype: str
        """
        return self._placeholder

    @placeholder.setter
    def placeholder(self, placeholder):
        """Sets the placeholder of this ConfigurationProperty.

        Placeholder value to use if the value is unset  # noqa: E501

        :param placeholder: The placeholder of this ConfigurationProperty.  # noqa: E501
        :type: str
        """

        self._placeholder = placeholder

    @property
    def valid_values(self):
        """Gets the valid_values of this ConfigurationProperty.  # noqa: E501

        List of all valid values for this property  # noqa: E501

        :return: The valid_values of this ConfigurationProperty.  # noqa: E501
        :rtype: list[ConfigurationPropertyValue]
        """
        return self._valid_values

    @valid_values.setter
    def valid_values(self, valid_values):
        """Sets the valid_values of this ConfigurationProperty.

        List of all valid values for this property  # noqa: E501

        :param valid_values: The valid_values of this ConfigurationProperty.  # noqa: E501
        :type: list[ConfigurationPropertyValue]
        """

        self._valid_values = valid_values

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
        if not isinstance(other, ConfigurationProperty):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
