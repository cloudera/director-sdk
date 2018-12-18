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


class SshCredentials(object):
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
        'username': 'str',
        'password': 'str',
        'private_key': 'str',
        'passphrase': 'str',
        'port': 'int',
        'host_key_fingerprint': 'str'
    }

    attribute_map = {
        'username': 'username',
        'password': 'password',
        'private_key': 'privateKey',
        'passphrase': 'passphrase',
        'port': 'port',
        'host_key_fingerprint': 'hostKeyFingerprint'
    }

    def __init__(self, username=None, password=None, private_key=None, passphrase=None, port=None, host_key_fingerprint=None):  # noqa: E501
        """SshCredentials - a model defined in Swagger"""  # noqa: E501

        self._username = None
        self._password = None
        self._private_key = None
        self._passphrase = None
        self._port = None
        self._host_key_fingerprint = None
        self.discriminator = None

        self.username = username
        if password is not None:
            self.password = password
        if private_key is not None:
            self.private_key = private_key
        if passphrase is not None:
            self.passphrase = passphrase
        self.port = port
        if host_key_fingerprint is not None:
            self.host_key_fingerprint = host_key_fingerprint

    @property
    def username(self):
        """Gets the username of this SshCredentials.  # noqa: E501

        SSH user  # noqa: E501

        :return: The username of this SshCredentials.  # noqa: E501
        :rtype: str
        """
        return self._username

    @username.setter
    def username(self, username):
        """Sets the username of this SshCredentials.

        SSH user  # noqa: E501

        :param username: The username of this SshCredentials.  # noqa: E501
        :type: str
        """
        if username is None:
            raise ValueError("Invalid value for `username`, must not be `None`")  # noqa: E501

        self._username = username

    @property
    def password(self):
        """Gets the password of this SshCredentials.  # noqa: E501

        Optional SSH password [redacted on read]  # noqa: E501

        :return: The password of this SshCredentials.  # noqa: E501
        :rtype: str
        """
        return self._password

    @password.setter
    def password(self, password):
        """Sets the password of this SshCredentials.

        Optional SSH password [redacted on read]  # noqa: E501

        :param password: The password of this SshCredentials.  # noqa: E501
        :type: str
        """

        self._password = password

    @property
    def private_key(self):
        """Gets the private_key of this SshCredentials.  # noqa: E501

        Optional SSH PKCS8 private key [redacted on read]  # noqa: E501

        :return: The private_key of this SshCredentials.  # noqa: E501
        :rtype: str
        """
        return self._private_key

    @private_key.setter
    def private_key(self, private_key):
        """Sets the private_key of this SshCredentials.

        Optional SSH PKCS8 private key [redacted on read]  # noqa: E501

        :param private_key: The private_key of this SshCredentials.  # noqa: E501
        :type: str
        """

        self._private_key = private_key

    @property
    def passphrase(self):
        """Gets the passphrase of this SshCredentials.  # noqa: E501

        Optional private key passphrase [redacted on read]  # noqa: E501

        :return: The passphrase of this SshCredentials.  # noqa: E501
        :rtype: str
        """
        return self._passphrase

    @passphrase.setter
    def passphrase(self, passphrase):
        """Sets the passphrase of this SshCredentials.

        Optional private key passphrase [redacted on read]  # noqa: E501

        :param passphrase: The passphrase of this SshCredentials.  # noqa: E501
        :type: str
        """

        self._passphrase = passphrase

    @property
    def port(self):
        """Gets the port of this SshCredentials.  # noqa: E501

        SSH server port  # noqa: E501

        :return: The port of this SshCredentials.  # noqa: E501
        :rtype: int
        """
        return self._port

    @port.setter
    def port(self, port):
        """Sets the port of this SshCredentials.

        SSH server port  # noqa: E501

        :param port: The port of this SshCredentials.  # noqa: E501
        :type: int
        """
        if port is None:
            raise ValueError("Invalid value for `port`, must not be `None`")  # noqa: E501

        self._port = port

    @property
    def host_key_fingerprint(self):
        """Gets the host_key_fingerprint of this SshCredentials.  # noqa: E501

        SSH server host key fingerprint  # noqa: E501

        :return: The host_key_fingerprint of this SshCredentials.  # noqa: E501
        :rtype: str
        """
        return self._host_key_fingerprint

    @host_key_fingerprint.setter
    def host_key_fingerprint(self, host_key_fingerprint):
        """Sets the host_key_fingerprint of this SshCredentials.

        SSH server host key fingerprint  # noqa: E501

        :param host_key_fingerprint: The host_key_fingerprint of this SshCredentials.  # noqa: E501
        :type: str
        """

        self._host_key_fingerprint = host_key_fingerprint

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
        if not isinstance(other, SshCredentials):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
