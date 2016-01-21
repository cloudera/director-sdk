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


class EnvironmentsApi(object):

    def __init__(self, apiClient):
      self.apiClient = apiClient

    

    def create(self, body, **kwargs):
        """Create a new environment

        Args:
            body, cloudera.director.v4.models.Environment: environment (required)

            

        Returns: 
        """

        allParams = ['body']

        params = locals()
        for (key, val) in params['kwargs'].iteritems():
            if key not in allParams:
                raise TypeError("Got an unexpected keyword argument '%s' to method create" % key)
            params[key] = val
        del params['kwargs']

        resourcePath = '/api/v4/environments'
        resourcePath = resourcePath.replace('{format}', 'json')
        method = 'POST'

        queryParams = {}
        headerParams = {}

        postData = body

        contentTypes = ["application/json"]
        if len(contentTypes) != 1:
            raise ValueError("An API client expects a single content type. Got: %s" % contentTypes)

        response = self.apiClient.callAPI(resourcePath, method, queryParams,
                                          postData, headerParams, contentTypes[0])

        

        

    def delete(self, name, **kwargs):
        """Delete an environment by name

        Args:
            name, str: environmentName (required)

            

        Returns: 
        """

        allParams = ['name']

        params = locals()
        for (key, val) in params['kwargs'].iteritems():
            if key not in allParams:
                raise TypeError("Got an unexpected keyword argument '%s' to method delete" % key)
            params[key] = val
        del params['kwargs']

        resourcePath = '/api/v4/environments/{name}'
        resourcePath = resourcePath.replace('{format}', 'json')
        method = 'DELETE'

        queryParams = {}
        headerParams = {}

        if ('name' in params):
            replacement = str(self.apiClient.toPathValue(params['name']))
            resourcePath = resourcePath.replace('{' + 'name' + '}',
                                                replacement)
        postData = None

        contentTypes = ["application/json"]
        if len(contentTypes) != 1:
            raise ValueError("An API client expects a single content type. Got: %s" % contentTypes)

        response = self.apiClient.callAPI(resourcePath, method, queryParams,
                                          postData, headerParams, contentTypes[0])

        

        

    def getRedacted(self, name, **kwargs):
        """Get an environment by name

        Args:
            name, str: name (required)

            

        Returns: cloudera.director.v4.models.Environment
        """

        allParams = ['name']

        params = locals()
        for (key, val) in params['kwargs'].iteritems():
            if key not in allParams:
                raise TypeError("Got an unexpected keyword argument '%s' to method getRedacted" % key)
            params[key] = val
        del params['kwargs']

        resourcePath = '/api/v4/environments/{name}'
        resourcePath = resourcePath.replace('{format}', 'json')
        method = 'GET'

        queryParams = {}
        headerParams = {}

        if ('name' in params):
            replacement = str(self.apiClient.toPathValue(params['name']))
            resourcePath = resourcePath.replace('{' + 'name' + '}',
                                                replacement)
        postData = None

        contentTypes = ["application/json"]
        if len(contentTypes) != 1:
            raise ValueError("An API client expects a single content type. Got: %s" % contentTypes)

        response = self.apiClient.callAPI(resourcePath, method, queryParams,
                                          postData, headerParams, contentTypes[0])

        if not response:
            return None

        responseObject = self.apiClient.deserialize(response, 'cloudera.director.v4.models.Environment')
        return responseObject
        

        

    def list(self, **kwargs):
        """List all environments

        Args:
            

        Returns: list[str]
        """

        allParams = []

        params = locals()
        for (key, val) in params['kwargs'].iteritems():
            if key not in allParams:
                raise TypeError("Got an unexpected keyword argument '%s' to method list" % key)
            params[key] = val
        del params['kwargs']

        resourcePath = '/api/v4/environments'
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

        responseObject = self.apiClient.deserialize(response, 'list[str]')
        return responseObject
        

        

    def update(self, name, body, **kwargs):
        """Update an existing environment

        Args:
            name, str: environmentName (required)

            body, cloudera.director.v4.models.Environment: environment (required)

            

        Returns: 
        """

        allParams = ['name', 'body']

        params = locals()
        for (key, val) in params['kwargs'].iteritems():
            if key not in allParams:
                raise TypeError("Got an unexpected keyword argument '%s' to method update" % key)
            params[key] = val
        del params['kwargs']

        resourcePath = '/api/v4/environments/{name}'
        resourcePath = resourcePath.replace('{format}', 'json')
        method = 'PUT'

        queryParams = {}
        headerParams = {}

        if ('name' in params):
            replacement = str(self.apiClient.toPathValue(params['name']))
            resourcePath = resourcePath.replace('{' + 'name' + '}',
                                                replacement)
        postData = body

        contentTypes = ["application/json"]
        if len(contentTypes) != 1:
            raise ValueError("An API client expects a single content type. Got: %s" % contentTypes)

        response = self.apiClient.callAPI(resourcePath, method, queryParams,
                                          postData, headerParams, contentTypes[0])

        

        

    def updateProviderCredentials(self, name, body, **kwargs):
        """Update provider credentials for a specific environment

        Args:
            name, str: environmentName (required)

            body, dict[str,str]: credentials (required)

            

        Returns: 
        """

        allParams = ['name', 'body']

        params = locals()
        for (key, val) in params['kwargs'].iteritems():
            if key not in allParams:
                raise TypeError("Got an unexpected keyword argument '%s' to method updateProviderCredentials" % key)
            params[key] = val
        del params['kwargs']

        resourcePath = '/api/v4/environments/{name}/provider/credentials'
        resourcePath = resourcePath.replace('{format}', 'json')
        method = 'PUT'

        queryParams = {}
        headerParams = {}

        if ('name' in params):
            replacement = str(self.apiClient.toPathValue(params['name']))
            resourcePath = resourcePath.replace('{' + 'name' + '}',
                                                replacement)
        postData = body

        contentTypes = ["application/json"]
        if len(contentTypes) != 1:
            raise ValueError("An API client expects a single content type. Got: %s" % contentTypes)

        response = self.apiClient.callAPI(resourcePath, method, queryParams,
                                          postData, headerParams, contentTypes[0])

        

        

    




