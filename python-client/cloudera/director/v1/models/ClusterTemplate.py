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

class ClusterTemplate:

    def __init__(self, **kwargs):
        self.swaggerTypes = {
            'externalDatabases': 'dict[str,cloudera.director.v1.models.ExternalDatabase]',
            'name': 'str',
            'parcelRepositories': 'set[str]',
            'productVersions': 'dict[str,str]',
            'services': 'list[str]',
            'servicesConfigs': 'dict[str,dict[str,str]]',
            'virtualInstanceGroups': 'dict[str,cloudera.director.v1.models.VirtualInstanceGroup]'

        }


        #Optional external databases
        self.externalDatabases = kwargs.get('externalDatabases',{}) # dict[str,cloudera.director.v1.models.ExternalDatabase]
        #Cluster name
        self.name = kwargs.get('name',None) # str
        #Optional list of cluster parcel repositories
        self.parcelRepositories = kwargs.get('parcelRepositories',set()) # set[str]
        #Versions for cluster components
        self.productVersions = kwargs.get('productVersions',{}) # dict[str,str]
        #Cluster services
        self.services = kwargs.get('services',[]) # list[str]
        #Cluster services configurations
        self.servicesConfigs = kwargs.get('servicesConfigs',{}) # dict[str,dict[str,str]]
        #List of virtual instances
        self.virtualInstanceGroups = kwargs.get('virtualInstanceGroups',{}) # dict[str,cloudera.director.v1.models.VirtualInstanceGroup]
        
