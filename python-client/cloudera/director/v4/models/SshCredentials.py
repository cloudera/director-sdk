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

class SshCredentials:

    def __init__(self, **kwargs):
        self.swaggerTypes = {
            'bastionHost': 'str',
            'hostKeyFingerprint': 'str',
            'passphrase': 'str',
            'password': 'str',
            'port': 'int',
            'privateKey': 'str',
            'username': 'str'

        }


        #
        self.bastionHost = kwargs.get('bastionHost',None) # str
        #SSH server host key fingerprint
        self.hostKeyFingerprint = kwargs.get('hostKeyFingerprint',None) # str
        #Optional private key passphrase [redacted on read]
        self.passphrase = kwargs.get('passphrase',None) # str
        #Optional SSH password [redacted on read]
        self.password = kwargs.get('password',None) # str
        #SSH server port
        self.port = kwargs.get('port',None) # int
        #Optional SSH PKCS8 private key [redacted on read]
        self.privateKey = kwargs.get('privateKey',None) # str
        #SSH user
        self.username = kwargs.get('username',None) # str
        
