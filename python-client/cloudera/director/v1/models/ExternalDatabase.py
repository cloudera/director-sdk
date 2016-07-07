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

class ExternalDatabase:

    def __init__(self, **kwargs):
        self.swaggerTypes = {
            'host': 'str',
            'name': 'str',
            'password': 'str',
            'port': 'int',
            'type': 'str',
            'user': 'str'

        }


        self.host = kwargs.get('host',None) # str
        self.name = kwargs.get('name',None) # str
        #password [redacted on read]
        self.password = kwargs.get('password',None) # str
        self.port = kwargs.get('port',None) # int
        self.type = kwargs.get('type',None) # str
        self.user = kwargs.get('user',None) # str
        
