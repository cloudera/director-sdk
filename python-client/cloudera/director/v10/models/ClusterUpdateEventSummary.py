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

class ClusterUpdateEventSummary:

    def __init__(self, **kwargs):
        self.swaggerTypes = {
            'instancesAdded': 'int',
            'instancesRemoved': 'int',
            'instancesReplaced': 'int',
            'occurredAt': 'long',
            'servicesAdded': 'set[str]',
            'servicesRemoved': 'set[str]'

        }


        #The number of instances added
        self.instancesAdded = kwargs.get('instancesAdded',None) # int
        #The number of instances removed
        self.instancesRemoved = kwargs.get('instancesRemoved',None) # int
        #The number of instances replaced
        self.instancesReplaced = kwargs.get('instancesReplaced',None) # int
        #The time when this event occurred
        self.occurredAt = kwargs.get('occurredAt',0L) # long
        #Services that were added
        self.servicesAdded = kwargs.get('servicesAdded',set()) # set[str]
        #Services that were removed
        self.servicesRemoved = kwargs.get('servicesRemoved',set()) # set[str]
        
