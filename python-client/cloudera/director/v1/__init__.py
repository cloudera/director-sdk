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

"""Add all of the modules in the current directory to __all__"""

import os
import sys

__all__ = []

for module in os.listdir(os.path.dirname(__file__)):
    if module != '__init__.py' and module[-3:] == '.py':
        __all__.append(module[:-3])


api_classes = ["InstanceTemplatesApi",
                "AuthenticationApi",
                "DeploymentsApi",
                "ClustersApi",
                "UsersApi",
                "EnvironmentsApi",
                ]

# import all the api classes
for class_name in api_classes:
    module_path = '.'.join([__name__, class_name])
    module = __import__(module_path, fromlist=[class_name])
    if hasattr(module, class_name):
        cls = getattr(module, class_name)
        setattr(sys.modules[__name__], cls.__name__, cls)

