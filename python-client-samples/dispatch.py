#! /usr/bin/env python

# Copyright (c) 2016 Cloudera, Inc.
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
# http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.

# Simple script that shows how to use the API to import a client config file

import sys
import argparse

from os.path import isfile
from urllib2 import HTTPError

from cloudera.director.latest.models import Login

from cloudera.director.common.client import ApiClient
from cloudera.director.latest import (AuthenticationApi, ImportClientConfigApi)

def get_authenticated_client(args):
  """
  Create a new API client and authenticate against a server as admin

  @param args: dict of parsed command line arguments that
               include server host and admin credentials
  @rtype:      ApiClient
  @return:     authenticated API client
  """

  # Start by creating a client pointing to the right server
  client = ApiClient(args.server)

  # Authenticate. This will start a session and store the cookie
  auth = AuthenticationApi(client)
  auth.login(Login(username=args.admin_username, password=args.admin_password))

  return client

def main():
  parser = argparse.ArgumentParser(prog='dispatch.py')

  parser.add_argument('--admin-username', default="admin",
                      help='Name of an user with administrative access (defaults to %(default)s)')
  parser.add_argument('--admin-password', default="admin",
                      help='Password for the administrative user (defaults to %(default)s)')
  parser.add_argument('--server', default="http://localhost:7189",
                      help="Cloudera Director server URL (defaults to %(default)s)")

  parser.add_argument('config_file', help="Cluster configuration file (.conf)")

  args = parser.parse_args()

  if not isfile(args.config_file):
    print 'Error: "%s" not found or not a file' % args.config_file
    return -1

  config = open(args.config_file, 'r').read()
  client = get_authenticated_client(args)

  api = ImportClientConfigApi(client)
  result = api.importClientConfig(config)

  print "Environment: %s (skipped: %s)" % (result.environment.name, result.environment.skipped)
  print "Deployment: %s (skipped: %s)" % (result.deployment.name, result.deployment.skipped)
  print "Cluster: %s (skipped: %s)" % (result.cluster.name, result.cluster.skipped)

  return 0

if __name__ == '__main__':
  try:
    sys.exit(main())

  except HTTPError as e:
    print e.read()
    raise e
