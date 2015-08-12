#!/usr/bin/env python

# Licensed to Cloudera, Inc. under one
# or more contributor license agreements.  See the NOTICE file
# distributed with this work for additional information
# regarding copyright ownership.  Cloudera, Inc. licenses this file
# to you under the Apache License, Version 2.0 (the
# "License"); you may not use this file except in compliance
# with the License.  You may obtain a copy of the License at
#
#     http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.

import json
import urllib2

from cloudera.director.common.Version import Version


class VersionsApi(object):

    def __init__(self, apiClient):
        self.apiClient = apiClient


    def get(self):
        """Returns the current version information.

        Args:


        Returns: Version
        """
        response = self.__getResponse('/api/versions')

        if not response:
            return None

        version_json = json.loads(response)
        version = Version(productVersion=str(version_json['productVersion']),
                          apiVersions=map(str, version_json['apiVersions']),
                          currentServerTime=str(version_json['currentServerTime']))
        return version

    def getLatestVersion(self):
        """Returns the latest API version supported by director.

        Args:


        Returns: str
        """

        response = self.__getResponse('/api/versions/latest')

        if not response:
            return None

        return response

    def __getResponse(self, resourcePath):
        return self.apiClient.callAPIAndGetRawString(resourcePath, "GET", None, None)

