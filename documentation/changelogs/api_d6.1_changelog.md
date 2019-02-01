# Cloudera Altus Director API d6.1 Changelog

This document summarizes changes to the Altus Director server API from version d6.0 to the new version d6.1, released with Altus Director 6.1.0.

* [Altus Director 6.1.0 documentation](https://www.cloudera.com/documentation/director/6-1-x.html)
* [Java and Python SDK](https://github.com/cloudera/director-sdk)
* To experiment, access the API console at http://*director-host*:7189/api-console/.

## Breaking Changes

There are no breaking changes in this new server API version.

The following concerns are typical for moving to a new API version.

* Some client-side libraries rely on schema to map incoming JSON to model objects, and they may generate parse errors if new, unexpected fields appear. If this happens, update the schema as necessary.
* Client-side code might not be able to handle previously unknown error codes and their accompanying metadata. Update error-handling code accordingly. All previously unknown error codes are listed in this document.

When a new Altus Director server API version is released, older versions remain available and supported. Therefore, moving to the new version is usually only needed to make use of new API features. Over time, however, very old API versions are deprecated and then removed.

## Cloudera Manager Repository Key Bundle File URL

Deployment and deployment template objects now include the following new field:

* repositoryKeyBundleUrl: the URL for a Cloudera Manager 6 repository key bundle file

The new field is optional and is normally computed from the repository URL. However, it may be necessary to provide it when running Altus Director and Cloudera Manager behind a proxy. See Altus Director documentation on proxy configuration for more information.

## Instance Template Pre-terminate Scripts

Instance template objects now include the following new field:

* preTerminateScripts: a list of objects containing scripts to be run immediately before instance termination

The new field is optional. The structure of each script object in this new field matches the structure for bootstrapScripts and other similar fields in the API which take in script objects. See Altus Director documentation on scripts for more information.

## Script Environment Map

Script objects now include the following new field:

* env: a map (table) of environment variable keys and corresponding values

The new field is optional, and may be empty if defined. Altus Director sets each environment variable in the map before executing the script in its script object. All user-defined scripts supported by Altus Director, including the new pre-terminate scripts, allow specifying environment variables. See Altus Director documentation on scripts for more information.
