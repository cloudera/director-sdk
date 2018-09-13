#! /usr/bin/env python

# Copyright (c) 2015 Cloudera, Inc.
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

"""
Simple script that shows how to use the Cloudera Altus Director API to manage user accounts.
"""

import argparse
import sys
from cloudera.director.common.client import ApiClient, Configuration
from cloudera.director.common.rest import ApiException
from cloudera.director.latest import UsersApi
from cloudera.director.latest.models import User

class ExitCodes(object):
    """
    Exit codes for this script.
    """
    OK = 0
    DUPLICATE_USER = 10

def get_authenticated_client(args):
    """
    Create a new API client and authenticate against a server as admin

    @param args: dict of parsed command line arguments that
                 include server host and admin credentials
    @rtype:      ApiClient
    @return:     authenticated API client
    """

    configuration = Configuration()
    configuration.host = args.server
    configuration.username = args.admin_username
    configuration.password = args.admin_password

    if args.server.startswith('https'):
        configuration.verify_ssl = True
        if args.cafile:
            configuration.ssl_ca_cert = args.cafile

    client = ApiClient(configuration=configuration)
    return client

def add_user(args):
    """
    Create a new user account

    @param args: dict of parsed command line arguments that include
                 an username and a password for the new account
    @return:     script exit code
    """
    try:
        users_api = UsersApi(get_authenticated_client(args))
        users_api.create(User(username=args.username, password=args.password,
                              enabled=True, roles=["ROLE_ADMIN"]))
        return ExitCodes.OK

    except ApiException as exc:
        if exc.status == 409:  # conflict
            sys.stderr.write("Cannot create duplicate user '%s'.\n" % (args.username,))
            return ExitCodes.DUPLICATE_USER
        else:
            raise exc

def list_users(args):
    """
    List all the existing user accounts

    @param args: dict of parsed command line arguments only used to
                 authenticate as a admin
    @return:     script exit code
    """
    users_api = UsersApi(get_authenticated_client(args))
    for user in users_api.list():
        print user

    return ExitCodes.OK

def delete_user(args):
    """
    Delete an user account

    @param args: dict of parsed command line arguments that include
                 the username of the user to be deleted
    @return:     script exit code
    """
    users_api = UsersApi(get_authenticated_client(args))
    users_api.delete(args.username)

    return ExitCodes.OK

def main():
    """
    Main function

    @return: exit code from subcommand
    """

    parser = argparse.ArgumentParser(prog="users.py")
    parser.add_argument('--admin-username', default="admin",
                        help='Name of an user with administrative access (defaults to %(default)s)')
    parser.add_argument('--admin-password', default="admin",
                        help='Password for the administrative user (defaults to %(default)s)')
    parser.add_argument('--server', default="http://localhost:7189",
                        help="Cloudera Altus Director server URL (defaults to %(default)s)")
    parser.add_argument('--cafile', default=None,
                        help='Path to file containing trusted certificate(s) ' +
                        '(defaults to %(default)s)')

    subparsers = parser.add_subparsers(title="commands")

    # Configure the add user command argument parser

    add_parser = subparsers.add_parser('add', help='Add user')
    add_parser.add_argument('--username', help="A name for the new user", required=True)
    add_parser.add_argument('--password', help="A password for the new user", required=True)
    add_parser.set_defaults(func=add_user)

    # Configure the list user command argument parser

    list_parser = subparsers.add_parser('list', help='List users')
    list_parser.set_defaults(func=list_users)

    # Configure the delete user command argument parser

    delete_parser = subparsers.add_parser('delete', help='Delete user')
    delete_parser.add_argument('--username', help="Name of the user to be deleted", required=True)
    delete_parser.set_defaults(func=delete_user)

    # Parse the arguments and call the proper function

    args = parser.parse_args()
    return args.func(args)

if __name__ == '__main__':
    sys.exit(main())
