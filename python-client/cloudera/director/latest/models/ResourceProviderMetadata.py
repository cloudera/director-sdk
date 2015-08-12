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

class ResourceProviderMetadata:

    def __init__(self, **kwargs):
        self.swaggerTypes = {
            'configurationProperties': 'list[cloudera.director.latest.models.ConfigurationProperty]',
            'description': 'str',
            'id': 'str',
            'name': 'str',
            'resourceDisplayProperties': 'list[cloudera.director.latest.models.DisplayProperty]',
            'templateProperties': 'list[cloudera.director.latest.models.ConfigurationProperty]',
            'type': 'str'

        }


        #A list of configuration properties for the resource provider
        self.configurationProperties = kwargs.get('configurationProperties',[]) # list[cloudera.director.latest.models.ConfigurationProperty]
        #A description for the resource provider
        self.description = kwargs.get('description',None) # str
        #The ID for the resource provider metadata
        self.id = kwargs.get('id',None) # str
        #The name of the resource provider
        self.name = kwargs.get('name',None) # str
        #A list of resource display properties for the resource provider
        self.resourceDisplayProperties = kwargs.get('resourceDisplayProperties',[]) # list[cloudera.director.latest.models.DisplayProperty]
        #A list of template configuration properties for the resource provider
        self.templateProperties = kwargs.get('templateProperties',[]) # list[cloudera.director.latest.models.ConfigurationProperty]
        #The type of resource provider
        self.type = kwargs.get('type',None) # str
        
