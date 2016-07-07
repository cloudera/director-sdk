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

class TimeSeriesRow:

    def __init__(self, **kwargs):
        self.swaggerTypes = {
            'entityName': 'str',
            'metricName': 'str',
            'timestamp': 'long',
            'value': 'float'

        }


        #Entity name
        self.entityName = kwargs.get('entityName',None) # str
        #Metric name
        self.metricName = kwargs.get('metricName',None) # str
        #Timestamp
        self.timestamp = kwargs.get('timestamp',0L) # long
        #Value
        self.value = kwargs.get('value',None) # float
        
