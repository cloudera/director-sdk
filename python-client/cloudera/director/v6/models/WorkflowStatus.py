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

class WorkflowStatus:

    def __init__(self, **kwargs):
        self.swaggerTypes = {
            'createdTime': 'long',
            'endTime': 'long',
            'stage': 'str',
            'startTime': 'long'

        }


        #The time when the workflow was created in the Oozie database
        self.createdTime = kwargs.get('createdTime',0L) # long
        #The time when the job ended
        self.endTime = kwargs.get('endTime',0L) # long
        #Workflow stage
        self.stage = kwargs.get('stage',None) # str
        #The time when the workflow was started by Oozie
        self.startTime = kwargs.get('startTime',0L) # long
        
