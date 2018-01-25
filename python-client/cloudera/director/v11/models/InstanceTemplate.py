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

class InstanceTemplate:

    def __init__(self, **kwargs):
        self.swaggerTypes = {
            'bootstrapScripts': 'list[str]',
            'config': 'dict[str,str]',
            'image': 'str',
            'name': 'str',
            'normalizationConfig': 'cloudera.director.v11.models.NormalizationConfiguration',
            'normalizeInstance': 'bool',
            'rackId': 'str',
            'sshHostKeyRetrievalType': 'str',
            'sshUsername': 'str',
            'tags': 'dict[str,str]',
            'type': 'str'

        }


        #List of instance bootstrap scripts.
        self.bootstrapScripts = kwargs.get('bootstrapScripts',[]) # list[str]
        #Instance configuration properties
        self.config = kwargs.get('config',{}) # dict[str,str]
        #Operating system image
        self.image = kwargs.get('image',None) # str
        #Instance template name
        self.name = kwargs.get('name',None) # str
        #Normalization configuration
        self.normalizationConfig = kwargs.get('normalizationConfig',None) # cloudera.director.v11.models.NormalizationConfiguration
        #Flag indicating whether to normalize the instance
        self.normalizeInstance = kwargs.get('normalizeInstance',None) # bool
        #Instance virtual rack ID
        self.rackId = kwargs.get('rackId',None) # str
        #The SSH Host Key Retrieval Type 
        self.sshHostKeyRetrievalType = kwargs.get('sshHostKeyRetrievalType',None) # str
        #Optional SSH username to override username specified in environment
        self.sshUsername = kwargs.get('sshUsername',None) # str
        #Instance tags
        self.tags = kwargs.get('tags',{}) # dict[str,str]
        #Instance type
        self.type = kwargs.get('type',None) # str
        
