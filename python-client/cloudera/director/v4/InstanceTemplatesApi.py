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


class InstanceTemplatesApi(object):

    def __init__(self, apiClient):
      self.apiClient = apiClient

    

    def create(self, environment, body, **kwargs):
        """Create a new instance template

        Args:
            environment, str: environmentName (required)

            body, cloudera.director.v4.models.InstanceTemplate: instanceTemplate (required)

            

        Returns: 
        """

        allParams = ['environment', 'body']

        params = locals()
        for (key, val) in params['kwargs'].iteritems():
            if key not in allParams:
                raise TypeError("Got an unexpected keyword argument '%s' to method create" % key)
            params[key] = val
        del params['kwargs']

        resourcePath = '/api/v4/environments/{environment}/templates/instances'
        resourcePath = resourcePath.replace('{format}', 'json')
        method = 'POST'

        queryParams = {}
        headerParams = {}

        if ('environment' in params):
            replacement = str(self.apiClient.toPathValue(params['environment']))
            resourcePath = resourcePath.replace('{' + 'environment' + '}',
                                                replacement)
        postData = body

        contentTypes = ["application/json"]
        if len(contentTypes) != 1:
            raise ValueError("An API client expects a single content type. Got: %s" % contentTypes)

        response = self.apiClient.callAPI(resourcePath, method, queryParams,
                                          postData, headerParams, contentTypes[0])

        

        

    def delete(self, environment, template, **kwargs):
        """Delete an instance template by name

        Args:
            environment, str: environmentName (required)

            template, str: templateName (required)

            

        Returns: 
        """

        allParams = ['environment', 'template']

        params = locals()
        for (key, val) in params['kwargs'].iteritems():
            if key not in allParams:
                raise TypeError("Got an unexpected keyword argument '%s' to method delete" % key)
            params[key] = val
        del params['kwargs']

        resourcePath = '/api/v4/environments/{environment}/templates/instances/{template}'
        resourcePath = resourcePath.replace('{format}', 'json')
        method = 'DELETE'

        queryParams = {}
        headerParams = {}

        if ('environment' in params):
            replacement = str(self.apiClient.toPathValue(params['environment']))
            resourcePath = resourcePath.replace('{' + 'environment' + '}',
                                                replacement)
        if ('template' in params):
            replacement = str(self.apiClient.toPathValue(params['template']))
            resourcePath = resourcePath.replace('{' + 'template' + '}',
                                                replacement)
        postData = None

        contentTypes = ["application/json"]
        if len(contentTypes) != 1:
            raise ValueError("An API client expects a single content type. Got: %s" % contentTypes)

        response = self.apiClient.callAPI(resourcePath, method, queryParams,
                                          postData, headerParams, contentTypes[0])

        

        

    def get(self, environment, template, **kwargs):
        """Get an instance template by name

        Args:
            environment, str: environmentName (required)

            template, str: templateName (required)

            

        Returns: cloudera.director.v4.models.InstanceTemplate
        """

        allParams = ['environment', 'template']

        params = locals()
        for (key, val) in params['kwargs'].iteritems():
            if key not in allParams:
                raise TypeError("Got an unexpected keyword argument '%s' to method get" % key)
            params[key] = val
        del params['kwargs']

        resourcePath = '/api/v4/environments/{environment}/templates/instances/{template}'
        resourcePath = resourcePath.replace('{format}', 'json')
        method = 'GET'

        queryParams = {}
        headerParams = {}

        if ('environment' in params):
            replacement = str(self.apiClient.toPathValue(params['environment']))
            resourcePath = resourcePath.replace('{' + 'environment' + '}',
                                                replacement)
        if ('template' in params):
            replacement = str(self.apiClient.toPathValue(params['template']))
            resourcePath = resourcePath.replace('{' + 'template' + '}',
                                                replacement)
        postData = None

        contentTypes = ["application/json"]
        if len(contentTypes) != 1:
            raise ValueError("An API client expects a single content type. Got: %s" % contentTypes)

        response = self.apiClient.callAPI(resourcePath, method, queryParams,
                                          postData, headerParams, contentTypes[0])

        if not response:
            return None

        responseObject = self.apiClient.deserialize(response, 'cloudera.director.v4.models.InstanceTemplate')
        return responseObject
        

        

    def list(self, environment, **kwargs):
        """List all instance templates

        Args:
            environment, str: environmentName (required)

            

        Returns: list[str]
        """

        allParams = ['environment']

        params = locals()
        for (key, val) in params['kwargs'].iteritems():
            if key not in allParams:
                raise TypeError("Got an unexpected keyword argument '%s' to method list" % key)
            params[key] = val
        del params['kwargs']

        resourcePath = '/api/v4/environments/{environment}/templates/instances'
        resourcePath = resourcePath.replace('{format}', 'json')
        method = 'GET'

        queryParams = {}
        headerParams = {}

        if ('environment' in params):
            replacement = str(self.apiClient.toPathValue(params['environment']))
            resourcePath = resourcePath.replace('{' + 'environment' + '}',
                                                replacement)
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
        

        

    def update(self, environment, template, body, **kwargs):
        """Update an existing instance template

        Args:
            environment, str: environmentName (required)

            template, str: templateName (required)

            body, cloudera.director.v4.models.InstanceTemplate: instanceTemplate (required)

            

        Returns: 
        """

        allParams = ['environment', 'template', 'body']

        params = locals()
        for (key, val) in params['kwargs'].iteritems():
            if key not in allParams:
                raise TypeError("Got an unexpected keyword argument '%s' to method update" % key)
            params[key] = val
        del params['kwargs']

        resourcePath = '/api/v4/environments/{environment}/templates/instances/{template}'
        resourcePath = resourcePath.replace('{format}', 'json')
        method = 'PUT'

        queryParams = {}
        headerParams = {}

        if ('environment' in params):
            replacement = str(self.apiClient.toPathValue(params['environment']))
            resourcePath = resourcePath.replace('{' + 'environment' + '}',
                                                replacement)
        if ('template' in params):
            replacement = str(self.apiClient.toPathValue(params['template']))
            resourcePath = resourcePath.replace('{' + 'template' + '}',
                                                replacement)
        postData = body

        contentTypes = ["application/json"]
        if len(contentTypes) != 1:
            raise ValueError("An API client expects a single content type. Got: %s" % contentTypes)

        response = self.apiClient.callAPI(resourcePath, method, queryParams,
                                          postData, headerParams, contentTypes[0])

        

        

    




