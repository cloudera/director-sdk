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

class TimeSeriesCrossEntityMetadata:

    def __init__(self, **kwargs):
        self.swaggerTypes = {
            'maxEntityDisplayName': 'str',
            'maxEntityName': 'str',
            'minEntityDisplayName': 'str',
            'minEntityName': 'str',
            'numEntities': 'float'

        }


        #Display name for maximum entity
        self.maxEntityDisplayName = kwargs.get('maxEntityDisplayName',None) # str
        #Name for maximum entity
        self.maxEntityName = kwargs.get('maxEntityName',None) # str
        #Display name for minimum entity
        self.minEntityDisplayName = kwargs.get('minEntityDisplayName',None) # str
        #Name for minimum entity
        self.minEntityName = kwargs.get('minEntityName',None) # str
        #Number of entities
        self.numEntities = kwargs.get('numEntities',None) # float
        
