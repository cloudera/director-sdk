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

# Note: This file is auto generated. Do not edit manually.

import sys
import os


class ImportClientConfigApi(object):

    def __init__(self, apiClient):
      self.apiClient = apiClient

    

    def importClientConfig(self, body, **kwargs):
        """Import Client Config

        Args:
            body, str: clientConfig (required)

            clusterName, str: clusterName (optional)

            deploymentName, str: deploymentName (optional)

            environmentName, str: environmentName (optional)

            

        Returns: cloudera.director.latest.models.ImportResult
        """

        allParams = ['body', 'clusterName', 'deploymentName', 'environmentName']

        params = locals()
        for (key, val) in params['kwargs'].iteritems():
            if key not in allParams:
                raise TypeError("Got an unexpected keyword argument '%s' to method importClientConfig" % key)
            params[key] = val
        del params['kwargs']

        resourcePath = '/api/v5/import'
        resourcePath = resourcePath.replace('{format}', 'json')
        method = 'POST'

        queryParams = {}
        headerParams = {}

        if ('clusterName' in params):
            queryParams['clusterName'] = self.apiClient.toPathValue(params['clusterName'])
        if ('deploymentName' in params):
            queryParams['deploymentName'] = self.apiClient.toPathValue(params['deploymentName'])
        if ('environmentName' in params):
            queryParams['environmentName'] = self.apiClient.toPathValue(params['environmentName'])
        postData = body

        contentTypes = ["text/plain"]
        if len(contentTypes) != 1:
            raise ValueError("An API client expects a single content type. Got: %s" % contentTypes)

        response = self.apiClient.callAPI(resourcePath, method, queryParams,
                                          postData, headerParams, contentTypes[0])

        if not response:
            return None

        responseObject = self.apiClient.deserialize(response, 'cloudera.director.latest.models.ImportResult')
        return responseObject
        

        

    




