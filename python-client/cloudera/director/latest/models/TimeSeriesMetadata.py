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

class TimeSeriesMetadata:

    def __init__(self, **kwargs):
        self.swaggerTypes = {
            'alias': 'str',
            'attributes': 'dict[str,str]',
            'endTime': 'long',
            'entityName': 'str',
            'expression': 'str',
            'metricCollectionFrequencyMs': 'long',
            'metricName': 'str',
            'rollupUsed': 'str',
            'startTime': 'long',
            'unitDenominators': 'list[str]',
            'unitNumerators': 'list[str]'

        }


        #Alias
        self.alias = kwargs.get('alias',None) # str
        #Attributes
        self.attributes = kwargs.get('attributes',{}) # dict[str,str]
        #End time
        self.endTime = kwargs.get('endTime',0L) # long
        #Entity name
        self.entityName = kwargs.get('entityName',None) # str
        #Expression
        self.expression = kwargs.get('expression',None) # str
        #Metric collection frequency in milliseconds
        self.metricCollectionFrequencyMs = kwargs.get('metricCollectionFrequencyMs',0L) # long
        #Metric name
        self.metricName = kwargs.get('metricName',None) # str
        #Rollup used
        self.rollupUsed = kwargs.get('rollupUsed',None) # str
        #Start time
        self.startTime = kwargs.get('startTime',0L) # long
        #Unit denominators
        self.unitDenominators = kwargs.get('unitDenominators',[]) # list[str]
        #Unit numerators
        self.unitNumerators = kwargs.get('unitNumerators',[]) # list[str]
        
