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


class Health(object):
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
        'status': 'str',
        'last_reported': 'int'
    }

    attribute_map = {
        'status': 'status',
        'last_reported': 'lastReported'
    }

    def __init__(self, status=None, last_reported=None):  # noqa: E501
        """Health - a model defined in Swagger"""  # noqa: E501

        self._status = None
        self._last_reported = None
        self.discriminator = None

        self.status = status
        self.last_reported = last_reported

    @property
    def status(self):
        """Gets the status of this Health.  # noqa: E501

        Health status value  # noqa: E501

        :return: The status of this Health.  # noqa: E501
        :rtype: str
        """
        return self._status

    @status.setter
    def status(self, status):
        """Sets the status of this Health.

        Health status value  # noqa: E501

        :param status: The status of this Health.  # noqa: E501
        :type: str
        """
        if status is None:
            raise ValueError("Invalid value for `status`, must not be `None`")  # noqa: E501
        allowed_values = ["DISABLED", "NOT_AVAILABLE", "STARTING", "STOPPING", "STOPPED", "GOOD", "CONCERNING", "BAD"]  # noqa: E501
        if status not in allowed_values:
            raise ValueError(
                "Invalid value for `status` ({0}), must be one of {1}"  # noqa: E501
                .format(status, allowed_values)
            )

        self._status = status

    @property
    def last_reported(self):
        """Gets the last_reported of this Health.  # noqa: E501

        Time when health status was reported  # noqa: E501

        :return: The last_reported of this Health.  # noqa: E501
        :rtype: int
        """
        return self._last_reported

    @last_reported.setter
    def last_reported(self, last_reported):
        """Sets the last_reported of this Health.

        Time when health status was reported  # noqa: E501

        :param last_reported: The last_reported of this Health.  # noqa: E501
        :type: int
        """
        if last_reported is None:
            raise ValueError("Invalid value for `last_reported`, must not be `None`")  # noqa: E501

        self._last_reported = last_reported

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
        if not isinstance(other, Health):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
