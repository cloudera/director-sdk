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

class CloudProviderMetadata:

    def __init__(self, **kwargs):
        self.swaggerTypes = {
            'configurationProperties': 'list[cloudera.director.v5.models.ConfigurationProperty]',
            'credentialsProperties': 'list[cloudera.director.v5.models.ConfigurationProperty]',
            'description': 'str',
            'id': 'str',
            'name': 'str',
            'resourceProviders': 'list[cloudera.director.v5.models.ResourceProviderMetadata]'

        }


        #Cloud provider configuration properties
        self.configurationProperties = kwargs.get('configurationProperties',[]) # list[cloudera.director.v5.models.ConfigurationProperty]
        #Credential configuration properties
        self.credentialsProperties = kwargs.get('credentialsProperties',[]) # list[cloudera.director.v5.models.ConfigurationProperty]
        #Cloud provider description
        self.description = kwargs.get('description',None) # str
        #Cloud provider metadata ID
        self.id = kwargs.get('id',None) # str
        #Cloud provider name
        self.name = kwargs.get('name',None) # str
        #Resource providers
        self.resourceProviders = kwargs.get('resourceProviders',[]) # list[cloudera.director.v5.models.ResourceProviderMetadata]
        
