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


class UsersApi(object):

    def __init__(self, apiClient):
      self.apiClient = apiClient

    

    def create(self, body, **kwargs):
        """Create a new user

        Args:
            body, cloudera.director.v2.models.User: user (required)

            

        Returns: 
        """

        allParams = ['body']

        params = locals()
        for (key, val) in params['kwargs'].iteritems():
            if key not in allParams:
                raise TypeError("Got an unexpected keyword argument '%s' to method create" % key)
            params[key] = val
        del params['kwargs']

        resourcePath = '/api/v2/users'
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

        

        

    def currentRedacted(self, **kwargs):
        """Get the current user

        Args:
            

        Returns: cloudera.director.v2.models.User
        """

        allParams = []

        params = locals()
        for (key, val) in params['kwargs'].iteritems():
            if key not in allParams:
                raise TypeError("Got an unexpected keyword argument '%s' to method currentRedacted" % key)
            params[key] = val
        del params['kwargs']

        resourcePath = '/api/v2/users/current'
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

        responseObject = self.apiClient.deserialize(response, 'cloudera.director.v2.models.User')
        return responseObject
        

        

    def delete(self, username, **kwargs):
        """Delete a user by username

        Args:
            username, str: username (required)

            

        Returns: 
        """

        allParams = ['username']

        params = locals()
        for (key, val) in params['kwargs'].iteritems():
            if key not in allParams:
                raise TypeError("Got an unexpected keyword argument '%s' to method delete" % key)
            params[key] = val
        del params['kwargs']

        resourcePath = '/api/v2/users/{username}'
        resourcePath = resourcePath.replace('{format}', 'json')
        method = 'DELETE'

        queryParams = {}
        headerParams = {}

        if ('username' in params):
            replacement = str(self.apiClient.toPathValue(params['username']))
            resourcePath = resourcePath.replace('{' + 'username' + '}',
                                                replacement)
        postData = None

        contentTypes = ["application/json"]
        if len(contentTypes) != 1:
            raise ValueError("An API client expects a single content type. Got: %s" % contentTypes)

        response = self.apiClient.callAPI(resourcePath, method, queryParams,
                                          postData, headerParams, contentTypes[0])

        

        

    def getRedacted(self, username, **kwargs):
        """Get a user by username

        Args:
            username, str: username (required)

            

        Returns: cloudera.director.v2.models.User
        """

        allParams = ['username']

        params = locals()
        for (key, val) in params['kwargs'].iteritems():
            if key not in allParams:
                raise TypeError("Got an unexpected keyword argument '%s' to method getRedacted" % key)
            params[key] = val
        del params['kwargs']

        resourcePath = '/api/v2/users/{username}'
        resourcePath = resourcePath.replace('{format}', 'json')
        method = 'GET'

        queryParams = {}
        headerParams = {}

        if ('username' in params):
            replacement = str(self.apiClient.toPathValue(params['username']))
            resourcePath = resourcePath.replace('{' + 'username' + '}',
                                                replacement)
        postData = None

        contentTypes = ["application/json"]
        if len(contentTypes) != 1:
            raise ValueError("An API client expects a single content type. Got: %s" % contentTypes)

        response = self.apiClient.callAPI(resourcePath, method, queryParams,
                                          postData, headerParams, contentTypes[0])

        if not response:
            return None

        responseObject = self.apiClient.deserialize(response, 'cloudera.director.v2.models.User')
        return responseObject
        

        

    def list(self, **kwargs):
        """List all users

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

        resourcePath = '/api/v2/users'
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
        

        

    def update(self, username, body, **kwargs):
        """Update an existing user

        Args:
            username, str: username (required)

            body, cloudera.director.v2.models.User: user (required)

            

        Returns: 
        """

        allParams = ['username', 'body']

        params = locals()
        for (key, val) in params['kwargs'].iteritems():
            if key not in allParams:
                raise TypeError("Got an unexpected keyword argument '%s' to method update" % key)
            params[key] = val
        del params['kwargs']

        resourcePath = '/api/v2/users/{username}'
        resourcePath = resourcePath.replace('{format}', 'json')
        method = 'PUT'

        queryParams = {}
        headerParams = {}

        if ('username' in params):
            replacement = str(self.apiClient.toPathValue(params['username']))
            resourcePath = resourcePath.replace('{' + 'username' + '}',
                                                replacement)
        postData = body

        contentTypes = ["application/json"]
        if len(contentTypes) != 1:
            raise ValueError("An API client expects a single content type. Got: %s" % contentTypes)

        response = self.apiClient.callAPI(resourcePath, method, queryParams,
                                          postData, headerParams, contentTypes[0])

        

        

    def updatePassword(self, username, body, **kwargs):
        """Update the password of an existing user

        Args:
            username, str: username (required)

            body, cloudera.director.v2.models.PasswordChange: passwords (required)

            

        Returns: 
        """

        allParams = ['username', 'body']

        params = locals()
        for (key, val) in params['kwargs'].iteritems():
            if key not in allParams:
                raise TypeError("Got an unexpected keyword argument '%s' to method updatePassword" % key)
            params[key] = val
        del params['kwargs']

        resourcePath = '/api/v2/users/{username}/password'
        resourcePath = resourcePath.replace('{format}', 'json')
        method = 'PUT'

        queryParams = {}
        headerParams = {}

        if ('username' in params):
            replacement = str(self.apiClient.toPathValue(params['username']))
            resourcePath = resourcePath.replace('{' + 'username' + '}',
                                                replacement)
        postData = body

        contentTypes = ["application/json"]
        if len(contentTypes) != 1:
            raise ValueError("An API client expects a single content type. Got: %s" % contentTypes)

        response = self.apiClient.callAPI(resourcePath, method, queryParams,
                                          postData, headerParams, contentTypes[0])

        

        

    




