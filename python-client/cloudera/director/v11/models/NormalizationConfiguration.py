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

class NormalizationConfiguration:

    def __init__(self, **kwargs):
        self.swaggerTypes = {
            'increaseMaxNumberOfOpenFiles': 'bool',
            'installPackages': 'bool',
            'minimizeSwappiness': 'bool',
            'miscellaneousServiceAdjustment': 'bool',
            'mountAllUnmountedDisks': 'bool',
            'prewarmDirectory': 'bool',
            'resizeRootPartition': 'bool'

        }


        #Whether the max number of files should be increased during normalization
        self.increaseMaxNumberOfOpenFiles = kwargs.get('increaseMaxNumberOfOpenFiles',None) # bool
        #Whether packages should be installed during normalization
        self.installPackages = kwargs.get('installPackages',None) # bool
        #Whether swappiness should be minimized during normalization
        self.minimizeSwappiness = kwargs.get('minimizeSwappiness',None) # bool
        #Whether services should be adjusted during normalization
        self.miscellaneousServiceAdjustment = kwargs.get('miscellaneousServiceAdjustment',None) # bool
        #Whether unmounted disks should be mounted during normalization
        self.mountAllUnmountedDisks = kwargs.get('mountAllUnmountedDisks',None) # bool
        #Whether prewarming should be performed during normalization
        self.prewarmDirectory = kwargs.get('prewarmDirectory',None) # bool
        #Whether the root partition should be resized during normalization
        self.resizeRootPartition = kwargs.get('resizeRootPartition',None) # bool
        
