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


class DatabaseServersApi(object):

    def __init__(self, apiClient):
      self.apiClient = apiClient

    

    def create(self, environment, body, **kwargs):
        """Create a new external database server

        Args:
            environment, str: environmentName (required)

            body, cloudera.director.v4.models.ExternalDatabaseServerTemplate: externalDatabaseServerTemplate (required)

            

        Returns: 
        """

        allParams = ['environment', 'body']

        params = locals()
        for (key, val) in params['kwargs'].iteritems():
            if key not in allParams:
                raise TypeError("Got an unexpected keyword argument '%s' to method create" % key)
            params[key] = val
        del params['kwargs']

        resourcePath = '/api/v4/environments/{environment}/databaseServers'
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

        

        

    def delete(self, environment, externalDatabaseServer, **kwargs):
        """Delete an external database server by name

        Args:
            environment, str: environmentName (required)

            externalDatabaseServer, str: externalDatabaseServerName (required)

            

        Returns: 
        """

        allParams = ['environment', 'externalDatabaseServer']

        params = locals()
        for (key, val) in params['kwargs'].iteritems():
            if key not in allParams:
                raise TypeError("Got an unexpected keyword argument '%s' to method delete" % key)
            params[key] = val
        del params['kwargs']

        resourcePath = '/api/v4/environments/{environment}/databaseServers/{externalDatabaseServer}'
        resourcePath = resourcePath.replace('{format}', 'json')
        method = 'DELETE'

        queryParams = {}
        headerParams = {}

        if ('environment' in params):
            replacement = str(self.apiClient.toPathValue(params['environment']))
            resourcePath = resourcePath.replace('{' + 'environment' + '}',
                                                replacement)
        if ('externalDatabaseServer' in params):
            replacement = str(self.apiClient.toPathValue(params['externalDatabaseServer']))
            resourcePath = resourcePath.replace('{' + 'externalDatabaseServer' + '}',
                                                replacement)
        postData = None

        contentTypes = ["application/json"]
        if len(contentTypes) != 1:
            raise ValueError("An API client expects a single content type. Got: %s" % contentTypes)

        response = self.apiClient.callAPI(resourcePath, method, queryParams,
                                          postData, headerParams, contentTypes[0])

        

        

    def getDatabaseServerUsage(self, environment, externalDatabaseServer, **kwargs):
        """Get an external database server usage by name

        Args:
            environment, str: environmentName (required)

            externalDatabaseServer, str: externalDatabaseServerName (required)

            

        Returns: cloudera.director.v4.models.ExternalDatabaseServerUsage
        """

        allParams = ['environment', 'externalDatabaseServer']

        params = locals()
        for (key, val) in params['kwargs'].iteritems():
            if key not in allParams:
                raise TypeError("Got an unexpected keyword argument '%s' to method getDatabaseServerUsage" % key)
            params[key] = val
        del params['kwargs']

        resourcePath = '/api/v4/environments/{environment}/databaseServers/{externalDatabaseServer}/usage'
        resourcePath = resourcePath.replace('{format}', 'json')
        method = 'GET'

        queryParams = {}
        headerParams = {}

        if ('environment' in params):
            replacement = str(self.apiClient.toPathValue(params['environment']))
            resourcePath = resourcePath.replace('{' + 'environment' + '}',
                                                replacement)
        if ('externalDatabaseServer' in params):
            replacement = str(self.apiClient.toPathValue(params['externalDatabaseServer']))
            resourcePath = resourcePath.replace('{' + 'externalDatabaseServer' + '}',
                                                replacement)
        postData = None

        contentTypes = ["application/json"]
        if len(contentTypes) != 1:
            raise ValueError("An API client expects a single content type. Got: %s" % contentTypes)

        response = self.apiClient.callAPI(resourcePath, method, queryParams,
                                          postData, headerParams, contentTypes[0])

        if not response:
            return None

        responseObject = self.apiClient.deserialize(response, 'cloudera.director.v4.models.ExternalDatabaseServerUsage')
        return responseObject
        

        

    def getRedacted(self, environment, externalDatabaseServer, **kwargs):
        """Get an external database server by name

        Args:
            environment, str: environmentName (required)

            externalDatabaseServer, str: externalDatabaseServerName (required)

            

        Returns: cloudera.director.v4.models.ExternalDatabaseServer
        """

        allParams = ['environment', 'externalDatabaseServer']

        params = locals()
        for (key, val) in params['kwargs'].iteritems():
            if key not in allParams:
                raise TypeError("Got an unexpected keyword argument '%s' to method getRedacted" % key)
            params[key] = val
        del params['kwargs']

        resourcePath = '/api/v4/environments/{environment}/databaseServers/{externalDatabaseServer}'
        resourcePath = resourcePath.replace('{format}', 'json')
        method = 'GET'

        queryParams = {}
        headerParams = {}

        if ('environment' in params):
            replacement = str(self.apiClient.toPathValue(params['environment']))
            resourcePath = resourcePath.replace('{' + 'environment' + '}',
                                                replacement)
        if ('externalDatabaseServer' in params):
            replacement = str(self.apiClient.toPathValue(params['externalDatabaseServer']))
            resourcePath = resourcePath.replace('{' + 'externalDatabaseServer' + '}',
                                                replacement)
        postData = None

        contentTypes = ["application/json"]
        if len(contentTypes) != 1:
            raise ValueError("An API client expects a single content type. Got: %s" % contentTypes)

        response = self.apiClient.callAPI(resourcePath, method, queryParams,
                                          postData, headerParams, contentTypes[0])

        if not response:
            return None

        responseObject = self.apiClient.deserialize(response, 'cloudera.director.v4.models.ExternalDatabaseServer')
        return responseObject
        

        

    def getStatus(self, environment, externalDatabaseServer, **kwargs):
        """Get an external database server status by name

        Args:
            environment, str: environmentName (required)

            externalDatabaseServer, str: externalDatabaseServerName (required)

            

        Returns: cloudera.director.v4.models.Status
        """

        allParams = ['environment', 'externalDatabaseServer']

        params = locals()
        for (key, val) in params['kwargs'].iteritems():
            if key not in allParams:
                raise TypeError("Got an unexpected keyword argument '%s' to method getStatus" % key)
            params[key] = val
        del params['kwargs']

        resourcePath = '/api/v4/environments/{environment}/databaseServers/{externalDatabaseServer}/status'
        resourcePath = resourcePath.replace('{format}', 'json')
        method = 'GET'

        queryParams = {}
        headerParams = {}

        if ('environment' in params):
            replacement = str(self.apiClient.toPathValue(params['environment']))
            resourcePath = resourcePath.replace('{' + 'environment' + '}',
                                                replacement)
        if ('externalDatabaseServer' in params):
            replacement = str(self.apiClient.toPathValue(params['externalDatabaseServer']))
            resourcePath = resourcePath.replace('{' + 'externalDatabaseServer' + '}',
                                                replacement)
        postData = None

        contentTypes = ["application/json"]
        if len(contentTypes) != 1:
            raise ValueError("An API client expects a single content type. Got: %s" % contentTypes)

        response = self.apiClient.callAPI(resourcePath, method, queryParams,
                                          postData, headerParams, contentTypes[0])

        if not response:
            return None

        responseObject = self.apiClient.deserialize(response, 'cloudera.director.v4.models.Status')
        return responseObject
        

        

    def getTemplateRedacted(self, environment, externalDatabaseServer, **kwargs):
        """Get an external database server template by name

        Args:
            environment, str: environmentName (required)

            externalDatabaseServer, str: externalDatabaseServerName (required)

            

        Returns: cloudera.director.v4.models.ExternalDatabaseServerTemplate
        """

        allParams = ['environment', 'externalDatabaseServer']

        params = locals()
        for (key, val) in params['kwargs'].iteritems():
            if key not in allParams:
                raise TypeError("Got an unexpected keyword argument '%s' to method getTemplateRedacted" % key)
            params[key] = val
        del params['kwargs']

        resourcePath = '/api/v4/environments/{environment}/databaseServers/{externalDatabaseServer}/template'
        resourcePath = resourcePath.replace('{format}', 'json')
        method = 'GET'

        queryParams = {}
        headerParams = {}

        if ('environment' in params):
            replacement = str(self.apiClient.toPathValue(params['environment']))
            resourcePath = resourcePath.replace('{' + 'environment' + '}',
                                                replacement)
        if ('externalDatabaseServer' in params):
            replacement = str(self.apiClient.toPathValue(params['externalDatabaseServer']))
            resourcePath = resourcePath.replace('{' + 'externalDatabaseServer' + '}',
                                                replacement)
        postData = None

        contentTypes = ["application/json"]
        if len(contentTypes) != 1:
            raise ValueError("An API client expects a single content type. Got: %s" % contentTypes)

        response = self.apiClient.callAPI(resourcePath, method, queryParams,
                                          postData, headerParams, contentTypes[0])

        if not response:
            return None

        responseObject = self.apiClient.deserialize(response, 'cloudera.director.v4.models.ExternalDatabaseServerTemplate')
        return responseObject
        

        

    def list(self, environment, **kwargs):
        """List all externalDatabaseServers

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

        resourcePath = '/api/v4/environments/{environment}/databaseServers'
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
        

        

    def update(self, environment, externalDatabaseServer, body, **kwargs):
        """Update an existing external database server (unsupported)

        Args:
            environment, str: environmentName (required)

            externalDatabaseServer, str: externalDatabaseServerName (required)

            body, cloudera.director.v4.models.ExternalDatabaseServerTemplate: updatedTemplate (required)

            

        Returns: 
        """

        allParams = ['environment', 'externalDatabaseServer', 'body']

        params = locals()
        for (key, val) in params['kwargs'].iteritems():
            if key not in allParams:
                raise TypeError("Got an unexpected keyword argument '%s' to method update" % key)
            params[key] = val
        del params['kwargs']

        resourcePath = '/api/v4/environments/{environment}/databaseServers/{externalDatabaseServer}'
        resourcePath = resourcePath.replace('{format}', 'json')
        method = 'PUT'

        queryParams = {}
        headerParams = {}

        if ('environment' in params):
            replacement = str(self.apiClient.toPathValue(params['environment']))
            resourcePath = resourcePath.replace('{' + 'environment' + '}',
                                                replacement)
        if ('externalDatabaseServer' in params):
            replacement = str(self.apiClient.toPathValue(params['externalDatabaseServer']))
            resourcePath = resourcePath.replace('{' + 'externalDatabaseServer' + '}',
                                                replacement)
        postData = body

        contentTypes = ["application/json"]
        if len(contentTypes) != 1:
            raise ValueError("An API client expects a single content type. Got: %s" % contentTypes)

        response = self.apiClient.callAPI(resourcePath, method, queryParams,
                                          postData, headerParams, contentTypes[0])

        

        

    




