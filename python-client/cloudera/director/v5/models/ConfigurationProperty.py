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

class ConfigurationProperty:

    def __init__(self, **kwargs):
        self.swaggerTypes = {
            'basic': 'bool',
            'configKey': 'str',
            'defaultValue': 'str',
            'description': 'str',
            'listSeparator': 'str',
            'name': 'str',
            'placeholder': 'str',
            'required': 'bool',
            'sensitive': 'bool',
            'type': 'str',
            'validValues': 'list[cloudera.director.v5.models.ConfigurationPropertyValue]',
            'widget': 'str'

        }


        #Whether this property is basic
        self.basic = kwargs.get('basic',None) # bool
        #Configuration property key
        self.configKey = kwargs.get('configKey',None) # str
        #The default value for this property
        self.defaultValue = kwargs.get('defaultValue',None) # str
        #Description of the configuration property
        self.description = kwargs.get('description',None) # str
        #The character to use to separate lists
        self.listSeparator = kwargs.get('listSeparator',None) # str
        #Configuration property name
        self.name = kwargs.get('name',None) # str
        #The placeholder value to use if the value is unset
        self.placeholder = kwargs.get('placeholder',None) # str
        #Whether this property is required
        self.required = kwargs.get('required',None) # bool
        #Whether this property is sensitive
        self.sensitive = kwargs.get('sensitive',None) # bool
        #This property's type
        self.type = kwargs.get('type',None) # str
        #A list of all valid values for this property
        self.validValues = kwargs.get('validValues',[]) # list[cloudera.director.v5.models.ConfigurationPropertyValue]
        #The widget used to display this property
        self.widget = kwargs.get('widget',None) # str
        
