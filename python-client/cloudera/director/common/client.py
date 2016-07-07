#!/usr/bin/env python
"""Wordnik.com's Swagger generic API client. This client handles the client-
server communication, and is invariant across implementations. Specifics of
the methods and models for each application are generated from the Swagger
templates."""

# Note: This file is auto generated. Do not edit manually.

import sys
import os
import re
import urllib
import urllib2
import base64
import httplib
import json
import datetime

import cloudera


class ApiClient:
    """Generic API client for Swagger client library builds"""

    def __init__(self, apiServer=None, username=None, password=None):
        self.apiServer = apiServer
        self.cookie = None
        self.username = username
        self.password = password

    # Return key value as a tuple from "dict[key,value]", handles nested structures
    def _getKeyValue(self, dict_str):
        inner = (dict_str.replace(" ", ""))[5:-1]
        bracket_count = 0
        index_count = 0

        for ch in inner:
            index_count += 1
            if ch == '[':
                bracket_count += 1
            elif ch == ']':
                bracket_count -= 1
            elif ch == ',' and bracket_count == 0:
                break

        key = inner[0:index_count - 1]
        value = inner[index_count:]
        return key, value

    def callAPI(self, resourcePath, method, queryParams, postData,
                          headerParams=None, contentType=None):
        string = self.callAPIAndGetRawString(resourcePath, method, queryParams, postData, headerParams, contentType)

        try:
            data = json.loads(string)
        except ValueError:  # PUT requests don't return anything
            data = None

        return data

    def callAPIAndGetRawString(self, resourcePath, method, queryParams, postData,
                headerParams=None, contentType=None):

        url = self.apiServer + resourcePath
        headers = {}
        if headerParams:
            for param, value in headerParams.iteritems():
                headers[param] = value

        #headers['Content-type'] = 'application/json'
        if self.cookie:
            headers['Cookie'] = self.cookie

        data = None

        if queryParams:
            # Need to remove None values, these should not be sent
            sentQueryParams = {}
            for param, value in queryParams.items():
                if value != None:
                    sentQueryParams[param] = value
            url = url + '?' + urllib.urlencode(sentQueryParams)

        if method in ['GET']:

            #Options to add statements later on and for compatibility
            pass

        elif method in ['POST', 'PUT', 'DELETE']:

            if postData:
                headers['Content-type'] = contentType
                if contentType == "application/json":
                  data = self.sanitizeForSerialization(postData)
                  data = json.dumps(data)

                elif contentType == "text/plain":
                  data = postData

        else:
            raise Exception('Method ' + method + ' is not recognized.')

        request = MethodRequest(method=method, url=url, headers=headers,
                                data=data)
        if not (self.username is None or self.password is None):
            base64string = base64.encodestring('%s:%s' % (self.username, self.password)).replace('\n', '')
            request.add_header("Authorization", "Basic %s" % base64string)

        # Make the request
        response = urllib2.urlopen(request)
        if 'Set-Cookie' in response.headers:
            self.cookie = response.headers['Set-Cookie']
        string = response.read()

        return string

    def toPathValue(self, obj):
        """Convert a string or object to a path-friendly value
        Args:
            obj -- object or string value
        Returns:
            string -- quoted value
        """
        if type(obj) == list:
            return urllib.quote(','.join(obj))
        else:
            return urllib.quote(str(obj))

    def sanitizeForSerialization(self, obj):
        """Dump an object into JSON for POSTing."""

        if type(obj) == type(None):
            return None
        elif type(obj) in [str, int, long, float, bool]:
            return obj
        elif type(obj) == list or type(obj) == set:
            return [self.sanitizeForSerialization(subObj) for subObj in obj]
        elif type(obj) == datetime.datetime:
            return obj.isoformat()
        else:
            if type(obj) == dict:
                objDict = obj
            else:
                objDict = obj.__dict__

            ret = {}
            for (key, val) in objDict.iteritems():
                if key != 'swaggerTypes':
                    ret[key] = self.sanitizeForSerialization(val)
            return ret


        if type(postData) == list:
            # Could be a list of objects
            if type(postData[0]) in safeToDump:
                data = json.dumps(postData)
            else:
                data = json.dumps([datum.__dict__ for datum in postData])
        elif type(postData) not in safeToDump:
            data = json.dumps(postData.__dict__)

    def deserialize(self, obj, objClass):
        """Derialize a JSON string into an object.

        Args:
            obj -- string or object to be deserialized
            objClass -- class literal for deserialzied object, or string
                of class name
        Returns:
            object -- deserialized object"""

        # Have to accept objClass as string or actual type. Type could be a
        # native Python type, or one of the model classes.
        if type(objClass) == str:
            if objClass.startswith('list['):
                match = re.match('list\[(.*)\]', objClass)
                subClass = match.group(1)
                return [self.deserialize(subObj, subClass) for subObj in obj]

            if objClass.startswith('dict['):
                (key_class, value_class) = self._getKeyValue(objClass)
                ret = {}
                for key in obj:
                    ret[self.deserialize(key, key_class)] = self.deserialize(obj[key], value_class)
                return ret


            if objClass.startswith('set['):
                match = re.match('set\[(.*)\]', objClass)
                subClass = match.group(1)
                ret = set()
                for subObj in obj:
                  ret.add(self.deserialize(subObj, subClass))
                return ret


            if (objClass in ['int', 'float', 'long', 'dict', 'list', 'str', 'bool', 'datetime']):
                objClass = eval(objClass)
            else:  # not a native type, must be model class
                objClass = eval(objClass)

        if objClass in [int, long, float, dict, list, str, bool]:
            return objClass(obj)
        elif objClass == datetime:
            # Server will always return a time stamp in UTC, but with
            # trailing +0000 indicating no offset from UTC. So don't process
            # last 5 characters.
            return datetime.datetime.strptime(obj[:-5],
                                              "%Y-%m-%dT%H:%M:%S.%f")

        instance = objClass()

        for attr, attrType in instance.swaggerTypes.iteritems():
            if obj is not None and attr in obj and type(obj) in [list, dict]:
                value = obj[attr]
                if attrType in ['str', 'int', 'long', 'float', 'bool']:
                    attrType = eval(attrType)
                    try:
                        value = attrType(value)
                    except UnicodeEncodeError:
                        value = unicode(value)
                    except TypeError:
                        value = value
                    setattr(instance, attr, value)
                elif (attrType == 'datetime'):
                    setattr(instance, attr, datetime.datetime.strptime(value[:-5],
                                              "%Y-%m-%dT%H:%M:%S.%f"))
                elif attrType.startswith('list['):
                    match = re.match('list\[(.*)\]', attrType)
                    subClass = match.group(1)
                    subValues = []
                    if not value:
                        setattr(instance, attr, None)
                    else:
                        for subValue in value:
                            subValues.append(self.deserialize(subValue,
                                                              subClass))
                    setattr(instance, attr, subValues)
                else:
                    setattr(instance, attr, self.deserialize(value,
                                                             attrType))

        return instance


class MethodRequest(urllib2.Request):

    def __init__(self, *args, **kwargs):
        """Construct a MethodRequest. Usage is the same as for
        `urllib2.Request` except it also takes an optional `method`
        keyword argument. If supplied, `method` will be used instead of
        the default."""

        if 'method' in kwargs:
            self.method = kwargs.pop('method')
        return urllib2.Request.__init__(self, *args, **kwargs)

    def get_method(self):
        return getattr(self, 'method', urllib2.Request.get_method(self))


