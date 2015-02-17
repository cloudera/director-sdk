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

class Capabilities:

    def __init__(self, **kwargs):
        self.swaggerTypes = {
            'iptablesEnabled': 'bool',
            'javaVendor': 'str',
            'javaVersion': 'str',
            'operatingSystemType': 'str',
            'operatingSystemVersion': 'str',
            'packageManager': 'str',
            'passwordlessSudoEnabled': 'bool',
            'pythonVersion': 'str',
            'virtualizationType': 'str'

        }


        self.iptablesEnabled = kwargs.get('iptablesEnabled',None) # bool
        self.javaVendor = kwargs.get('javaVendor',None) # str
        self.javaVersion = kwargs.get('javaVersion',None) # str
        self.operatingSystemType = kwargs.get('operatingSystemType',None) # str
        self.operatingSystemVersion = kwargs.get('operatingSystemVersion',None) # str
        self.packageManager = kwargs.get('packageManager',None) # str
        self.passwordlessSudoEnabled = kwargs.get('passwordlessSudoEnabled',None) # bool
        self.pythonVersion = kwargs.get('pythonVersion',None) # str
        self.virtualizationType = kwargs.get('virtualizationType',None) # str
        
