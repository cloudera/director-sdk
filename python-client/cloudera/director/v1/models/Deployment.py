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

class Deployment:

    def __init__(self, **kwargs):
        self.swaggerTypes = {
            'config': 'dict[str,str]',
            'hostname': 'str',
            'managerInstance': 'cloudera.director.v1.models.Instance',
            'name': 'str',
            'password': 'str',
            'port': 'int',
            'username': 'str'

        }


        self.config = kwargs.get('config',{}) # dict[str,str]
        #Hostname for existing Cloudera Manager installation
        self.hostname = kwargs.get('hostname',None) # str
        self.managerInstance = kwargs.get('managerInstance',None) # cloudera.director.v1.models.Instance
        #Deployment name
        self.name = kwargs.get('name',None) # str
        #Password for API access [redacted on read]
        self.password = kwargs.get('password',None) # str
        #API port for an existing Cloudera Manager installation
        self.port = kwargs.get('port',None) # int
        #Username for API access
        self.username = kwargs.get('username',None) # str
        
