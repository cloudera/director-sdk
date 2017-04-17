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

class ValidationExceptionCondition:

    def __init__(self, **kwargs):
        self.swaggerTypes = {
            'key': 'str',
            'message': 'str',
            'scope': 'str',
            'type': 'str'

        }


        #The optional key of the condition
        self.key = kwargs.get('key',None) # str
        #The message of the condition
        self.message = kwargs.get('message',None) # str
        #The scope of the condition
        self.scope = kwargs.get('scope',None) # str
        #The type of condition
        self.type = kwargs.get('type',None) # str
        
