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

class ErrorInfo:

    def __init__(self, **kwargs):
        self.swaggerTypes = {
            'causes': 'set[cloudera.director.v11.models.ErrorInfo]',
            'errorCode': 'str',
            'errorType': 'str',
            'properties': 'dict[str,str]',
            'retryable': 'bool'

        }


        #Causes
        self.causes = kwargs.get('causes',set()) # set[cloudera.director.v11.models.ErrorInfo]
        #Error code
        self.errorCode = kwargs.get('errorCode',None) # str
        #Error type
        self.errorType = kwargs.get('errorType',None) # str
        #Properties
        self.properties = kwargs.get('properties',{}) # dict[str,str]
        #Retryable
        self.retryable = kwargs.get('retryable',None) # bool
        
