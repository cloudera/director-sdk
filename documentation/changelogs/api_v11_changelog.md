# Cloudera Altus Director API v11 (2.7.0) Changelog

This document summarizes changes to the Altus Director server API from version v10 to the new version v11, released with Altus Director 2.7.0.

* [Altus Director 2.7.0 documentation](https://www.cloudera.com/documentation/director/2-7-x.html)
* [Java and Python SDK](https://github.com/cloudera/director-sdk)
* To experiment, access the API console at http://*director-host*:7189/api-console/.

## Breaking Changes

* API calls to work with user accounts return HTTP 400 Bad Request when Altus Director is configured to use LDAP or Active Directory for user accounts. See "User Management Status Endpoint" below for more.

The following concerns are typical for moving to a new API version.

* Some client-side libraries rely on schema to map incoming JSON to model objects, and they may generate parse errors if new, unexpected fields appear. If this happens, update the schema as necessary.
* Client-side code might not be able to handle previously unknown error codes and their accompanying metadata. Update error-handling code accordingly.

When a new Altus Director server API version is released, older versions remain available and supported. Therefore, moving to the new version is usually only needed to make use of new API features. Over time, however, very old API versions are deprecated and then removed.

## Detailed Provider Error Information

The following new error codes may now be returned with additional details on cloud provider errors:

* PROVIDER_ERROR: The cloud provider encountered an error
* PROVIDER_ERROR_MULTIPLE: The cloud provider encountered one or more errors

An individual PROVIDER_ERROR error information object includes these fields:

* message: A general message describing the error
* details: A provider-specific table of error details

Errors caught by the Altus Director AWS plugin include the following error details in the `details` table:

* message: Plugin-specific error message
* awsErrorCode: Error code returned by AWS, e.g., InsufficientInstanceCapacity, InstanceLimitExceeded, RequestLimitExceeded
* awsErrormessage: Error message returned by AWS

Errors caught by the Altus Director Azure plugin include the following error details in the `details` table:

* message: Plugin-specific error message
* azureErrorCode: Error code returned by Azure, e.g., ResourceQuotaExceeded, AuthorizationFailed, InvalidClientSecret
* azureErrormessage: Error message returned by Azure

The Google plugin does not currently use this mechanism to supply detailed error information.

A PROVIDER_ERROR_MULTIPLE error information object includes one or more PROVIDER_ERROR error information object in its `causes` field.

## User Management Status Endpoint

Altus Director 2.7 can make use of a backing LDAP or Active Directory (AD) server for managing user accounts. A new GET API endpoint `users/managementStatus` is available for clients to determine how Director is configured for user management. The JSON result includes the following fields:

* localUserManagementEnabled: true if Altus Director itself is managing user accounts, false otherwise
* userSource: "internal" for Director database, "LDAP" for LDAP or AD

When Altus Director is configured to use LDAP or AD for user accounts, API calls to work with user accounts return an HTTP 400 Bad Request response with the reason "Local user management is disabled". Use the new `users/managementStatus` endpoint to check on the management status to avoid receiving these error responses.

See [Altus Director documentation on LDAP and AD configuration](https://www.cloudera.com/documentation/director/2-7-x/topics/director_configure_ldap.html) for more information.

## Fine-grained Normalization Configuration

Altus Director 2.7 offers fine-grained control of the instance normalization process, where new cloud instances are updated and configured for use with Cloudera Manager or as part of a cluster. Instance template objects may now include the following optional new field:

* normalizationConfig: a map of Boolean flags indicating whether phases of instance normalization are performed (true) or skipped (false)

The flags in the `normalizationConfig` map are:

* prewarmDirectory: whether to "prewarm" the CDH parcel directory
* installPackages: whether to install core packages needed by Cloudera Manager or a cluster, such as curl
* miscellaneousServiceAdjustment: whether to adjust several services and capabilities, including: SELinux, iptables, transparent hugepages, ntp or chronyd, and more
* minimizeSwappiness: whether to minimize kernel swappiness
* increaseMaxNumberOfOpenFiles: whether to increase the permitted maximum number of open files
* resizeRootPartition: whether to resize the root partition to maximize available space
* mountAllUnmountedDisks: whether to mount any available volumes that are not mounted on boot

See the [AWS reference client configuration file](https://github.com/cloudera/director-scripts/blob/master/configs/aws.reference.conf) for additional details. Contact Cloudera for guidance in using this advanced capability.

## Miscellaneous

The following new error codes may now be returned:

* CM_FAILED_TO_START: Altus Director timed out waiting for Cloudera Manager to start
* SERVICE_NOT_FOUND: reserved
* ROLE_NOT_FOUND: reserved
* CM_HOST_FQDN_MISSING: reserved

The codes noted in the list above as "reserved" are not returned by Altus Director under normal operation, but are reserved for future use. Please contact Cloudera support if they are encountered.
