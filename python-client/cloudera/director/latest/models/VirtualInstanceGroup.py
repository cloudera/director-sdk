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

class VirtualInstanceGroup:

    def __init__(self, **kwargs):
        self.swaggerTypes = {
            'minCount': 'int',
            'name': 'str',
            'roleTypesConfigs': 'dict[str,dict[str,dict[str,str]]]',
            'serviceTypeToRoleTypes': 'dict[str,list[str]]',
            'virtualInstances': 'list[cloudera.director.latest.models.VirtualInstance]'

        }


        self.minCount = kwargs.get('minCount',None) # int
        self.name = kwargs.get('name',None) # str
        self.roleTypesConfigs = kwargs.get('roleTypesConfigs',{}) # dict[str,dict[str,dict[str,str]]]
        self.serviceTypeToRoleTypes = kwargs.get('serviceTypeToRoleTypes',{}) # dict[str,list[str]]
        self.virtualInstances = kwargs.get('virtualInstances',[]) # list[cloudera.director.latest.models.VirtualInstance]
        
