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

class TimeSeriesAggregateStatistics:

    def __init__(self, **kwargs):
        self.swaggerTypes = {
            'count': 'long',
            'crossEntityMetadata': 'cloudera.director.v5.models.TimeSeriesCrossEntityMetadata',
            'max': 'float',
            'maxTime': 'long',
            'mean': 'float',
            'min': 'float',
            'minTime': 'long',
            'sampleTime': 'long',
            'sampleValue': 'float',
            'stdDev': 'float'

        }


        #Count
        self.count = kwargs.get('count',0L) # long
        #Cross-entity metadata
        self.crossEntityMetadata = kwargs.get('crossEntityMetadata',None) # cloudera.director.v5.models.TimeSeriesCrossEntityMetadata
        #Maximum value
        self.max = kwargs.get('max',None) # float
        #Timestamp for maximum value
        self.maxTime = kwargs.get('maxTime',0L) # long
        #Mean
        self.mean = kwargs.get('mean',None) # float
        #Minimum value
        self.min = kwargs.get('min',None) # float
        #Timestamp for minimum value
        self.minTime = kwargs.get('minTime',0L) # long
        #Sample time
        self.sampleTime = kwargs.get('sampleTime',0L) # long
        #Sample value
        self.sampleValue = kwargs.get('sampleValue',None) # float
        #Standard deviation
        self.stdDev = kwargs.get('stdDev',None) # float
        
