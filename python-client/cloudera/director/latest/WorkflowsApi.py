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


class WorkflowsApi(object):

    def __init__(self, apiClient):
      self.apiClient = apiClient

    

    def describe(self, environment, deployment, cluster, workflowUuid, **kwargs):
        """Describe an Oozie workflow

        Args:
            environment, str: environmentName (required)

            deployment, str: deploymentName (required)

            cluster, str: clusterName (required)

            workflowUuid, str: workflowUuid (required)

            

        Returns: cloudera.director.latest.models.WorkflowStatus
        """

        allParams = ['environment', 'deployment', 'cluster', 'workflowUuid']

        params = locals()
        for (key, val) in params['kwargs'].iteritems():
            if key not in allParams:
                raise TypeError("Got an unexpected keyword argument '%s' to method describe" % key)
            params[key] = val
        del params['kwargs']

        resourcePath = '/api/v6/environments/{environment}/deployments/{deployment}/clusters/{cluster}/workflows/{workflowUuid}'
        resourcePath = resourcePath.replace('{format}', 'json')
        method = 'GET'

        queryParams = {}
        headerParams = {}

        if ('environment' in params):
            replacement = str(self.apiClient.toPathValue(params['environment']))
            resourcePath = resourcePath.replace('{' + 'environment' + '}',
                                                replacement)
        if ('deployment' in params):
            replacement = str(self.apiClient.toPathValue(params['deployment']))
            resourcePath = resourcePath.replace('{' + 'deployment' + '}',
                                                replacement)
        if ('cluster' in params):
            replacement = str(self.apiClient.toPathValue(params['cluster']))
            resourcePath = resourcePath.replace('{' + 'cluster' + '}',
                                                replacement)
        if ('workflowUuid' in params):
            replacement = str(self.apiClient.toPathValue(params['workflowUuid']))
            resourcePath = resourcePath.replace('{' + 'workflowUuid' + '}',
                                                replacement)
        postData = None

        contentTypes = ["application/json"]
        if len(contentTypes) != 1:
            raise ValueError("An API client expects a single content type. Got: %s" % contentTypes)

        response = self.apiClient.callAPI(resourcePath, method, queryParams,
                                          postData, headerParams, contentTypes[0])

        if not response:
            return None

        responseObject = self.apiClient.deserialize(response, 'cloudera.director.latest.models.WorkflowStatus')
        return responseObject
        

        

    def dispatch(self, body, environment, deployment, cluster, workflowUuid, **kwargs):
        """Run a new Oozie workflow

        Args:
            body, cloudera.director.latest.models.Workflow: workflow (required)

            environment, str: environmentName (required)

            deployment, str: deploymentName (required)

            cluster, str: clusterName (required)

            workflowUuid, str: workflowUuid (required)

            

        Returns: 
        """

        allParams = ['body', 'environment', 'deployment', 'cluster', 'workflowUuid']

        params = locals()
        for (key, val) in params['kwargs'].iteritems():
            if key not in allParams:
                raise TypeError("Got an unexpected keyword argument '%s' to method dispatch" % key)
            params[key] = val
        del params['kwargs']

        resourcePath = '/api/v6/environments/{environment}/deployments/{deployment}/clusters/{cluster}/workflows/{workflowUuid}'
        resourcePath = resourcePath.replace('{format}', 'json')
        method = 'POST'

        queryParams = {}
        headerParams = {}

        if ('environment' in params):
            replacement = str(self.apiClient.toPathValue(params['environment']))
            resourcePath = resourcePath.replace('{' + 'environment' + '}',
                                                replacement)
        if ('deployment' in params):
            replacement = str(self.apiClient.toPathValue(params['deployment']))
            resourcePath = resourcePath.replace('{' + 'deployment' + '}',
                                                replacement)
        if ('cluster' in params):
            replacement = str(self.apiClient.toPathValue(params['cluster']))
            resourcePath = resourcePath.replace('{' + 'cluster' + '}',
                                                replacement)
        if ('workflowUuid' in params):
            replacement = str(self.apiClient.toPathValue(params['workflowUuid']))
            resourcePath = resourcePath.replace('{' + 'workflowUuid' + '}',
                                                replacement)
        postData = body

        contentTypes = ["application/json"]
        if len(contentTypes) != 1:
            raise ValueError("An API client expects a single content type. Got: %s" % contentTypes)

        response = self.apiClient.callAPI(resourcePath, method, queryParams,
                                          postData, headerParams, contentTypes[0])

        

        

    def terminate(self, environment, deployment, cluster, workflowUuid, **kwargs):
        """Terminate an Oozie workflow

        Args:
            environment, str: environmentName (required)

            deployment, str: deploymentName (required)

            cluster, str: clusterName (required)

            workflowUuid, str: workflowUuid (required)

            

        Returns: 
        """

        allParams = ['environment', 'deployment', 'cluster', 'workflowUuid']

        params = locals()
        for (key, val) in params['kwargs'].iteritems():
            if key not in allParams:
                raise TypeError("Got an unexpected keyword argument '%s' to method terminate" % key)
            params[key] = val
        del params['kwargs']

        resourcePath = '/api/v6/environments/{environment}/deployments/{deployment}/clusters/{cluster}/workflows/{workflowUuid}'
        resourcePath = resourcePath.replace('{format}', 'json')
        method = 'DELETE'

        queryParams = {}
        headerParams = {}

        if ('environment' in params):
            replacement = str(self.apiClient.toPathValue(params['environment']))
            resourcePath = resourcePath.replace('{' + 'environment' + '}',
                                                replacement)
        if ('deployment' in params):
            replacement = str(self.apiClient.toPathValue(params['deployment']))
            resourcePath = resourcePath.replace('{' + 'deployment' + '}',
                                                replacement)
        if ('cluster' in params):
            replacement = str(self.apiClient.toPathValue(params['cluster']))
            resourcePath = resourcePath.replace('{' + 'cluster' + '}',
                                                replacement)
        if ('workflowUuid' in params):
            replacement = str(self.apiClient.toPathValue(params['workflowUuid']))
            resourcePath = resourcePath.replace('{' + 'workflowUuid' + '}',
                                                replacement)
        postData = None

        contentTypes = ["application/json"]
        if len(contentTypes) != 1:
            raise ValueError("An API client expects a single content type. Got: %s" % contentTypes)

        response = self.apiClient.callAPI(resourcePath, method, queryParams,
                                          postData, headerParams, contentTypes[0])

        

        

    




