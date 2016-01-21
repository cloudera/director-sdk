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


class ProviderMetadataApi(object):

    def __init__(self, apiClient):
      self.apiClient = apiClient

    

    def get(self, providerId, **kwargs):
        """Get a provider by name

        Args:
            providerId, str: providerId (required)

            

        Returns: cloudera.director.v4.models.CloudProviderMetadata
        """

        allParams = ['providerId']

        params = locals()
        for (key, val) in params['kwargs'].iteritems():
            if key not in allParams:
                raise TypeError("Got an unexpected keyword argument '%s' to method get" % key)
            params[key] = val
        del params['kwargs']

        resourcePath = '/api/v4/metadata/providers/{providerId}'
        resourcePath = resourcePath.replace('{format}', 'json')
        method = 'GET'

        queryParams = {}
        headerParams = {}

        if ('providerId' in params):
            replacement = str(self.apiClient.toPathValue(params['providerId']))
            resourcePath = resourcePath.replace('{' + 'providerId' + '}',
                                                replacement)
        postData = None

        contentTypes = ["application/json"]
        if len(contentTypes) != 1:
            raise ValueError("An API client expects a single content type. Got: %s" % contentTypes)

        response = self.apiClient.callAPI(resourcePath, method, queryParams,
                                          postData, headerParams, contentTypes[0])

        if not response:
            return None

        responseObject = self.apiClient.deserialize(response, 'cloudera.director.v4.models.CloudProviderMetadata')
        return responseObject
        

        

    def list(self, **kwargs):
        """List all provider metadata

        Args:
            

        Returns: list[cloudera.director.v4.models.CloudProviderMetadata]
        """

        allParams = []

        params = locals()
        for (key, val) in params['kwargs'].iteritems():
            if key not in allParams:
                raise TypeError("Got an unexpected keyword argument '%s' to method list" % key)
            params[key] = val
        del params['kwargs']

        resourcePath = '/api/v4/metadata/providers'
        resourcePath = resourcePath.replace('{format}', 'json')
        method = 'GET'

        queryParams = {}
        headerParams = {}

        postData = None

        contentTypes = ["application/json"]
        if len(contentTypes) != 1:
            raise ValueError("An API client expects a single content type. Got: %s" % contentTypes)

        response = self.apiClient.callAPI(resourcePath, method, queryParams,
                                          postData, headerParams, contentTypes[0])

        if not response:
            return None

        responseObject = self.apiClient.deserialize(response, 'list[cloudera.director.v4.models.CloudProviderMetadata]')
        return responseObject
        

        

    




