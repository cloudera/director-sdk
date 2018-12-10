# Cloudera Altus Director API v10 (2.6.0) Changelog

This document summarizes changes to the Altus Director server API from version v9 to the new version v10, released with Altus Director 2.6.0.

* [Altus Director 2.6.0 documentation](https://www.cloudera.com/documentation/director/2-6-x.html)
* [Java and Python SDK](https://github.com/cloudera/director-sdk)
* To experiment, access the API console at http://*director-host*:7189/api-console/.

## Breaking Changes

There are no breaking changes in this new server API version.

The following concerns are typical for moving to a new API version.

- Some client-side libraries rely on schema to map incoming JSON to model objects, and they may generate parse errors if new, unexpected fields appear. If this happens, update the schema as necessary.
- Client-side code might not be able to handle previously unknown error codes and their accompanying metadata. Update error-handling code accordingly.

When a new Altus Director server API version is released, older versions remain available and supported. Therefore, moving to the new version is usually only needed to make use of new API features. Over time, however, very old API versions are deprecated and then removed.

## TLS

Deployment and deployment template objects now include the following new fields:

* tlsEnabled: a boolean indicating whether TLS is enabled for Cloudera Manager and clusters
* trustedCertificate: an X.509 certificate that forms the basis of trust for TLS connections to Cloudera Manager, either its server certificate or the certificate for a certificate authority in its signing chain
* tlsConfigurationProperties: a table of key/value pairs for configuration properties that modify how Cloudera Manager automatically configures TLS

The PUT endpoint environments/*e*/deployments/*d*/clusters/*c*/template now allows for updating the following deployment template fields:

* port
* tlsEnabled
* trustedCertificate

The following related error codes may now be returned:

- CERTIFICATE_PARSE_FAILURE: The trusted certificate for TLS could not be parsed.
- TLS_CERTMANAGER_ABSENT: The certmanager utility, normally present in Cloudera Manager for implementing auto-TLS, is missing.
- CERTIFICATE_PROHIBITED_FOR_AUTO_TLS: The POST request to create a new deployment specifies auto-TLS, but a trusted certificate was also included. (One should not be included.)
- CA_NAME_TOO_LONG: The CN of a CA's certificate exceeds 64 characters in length.

See [Altus Director documentation on TLS](https://www.cloudera.com/documentation/director/2-6-x/topics/director_tls_enable.html) for details on how to use these API changes to work with TLS.

## SSH Host Key Fingerprints

Instance objects returned from the API now include the following new field:

* sshHostKeyFingerprints: a set of SSH host key fingerprints, filled in when Altus Director is able to determine them

Instance template objects now include the following new field:

* sshHostKeyRetrievalType: an enumeration describing how Altus Director should attempt to determine the SSH host key fingerprints of instances.

The valid values for sshHostKeyRetrievalType are:

* NONE = do not attempt
* INSTANCE = use SSH commands on the instance
* PROVIDER = query the instance's cloud provider
* FALLBACK = try PROVIDER, and then INSTANCE

The following related error code may now be returned:

- SSH_KEY_RETRIEVAL_FAILED: Altus Director was unable to retrieve any SSH host key fingerprints

See [Altus Director documentation on SSH host key fingerprints](https://www.cloudera.com/documentation/director/2-6-x/topics/director_ssh_host_key.html) for more information.

## Miscellaneous

Cluster objects returned by Altus Director now include the following new field:

* createdExternalDatabases: A list of external databases created to support the cluster.

It is now possible to GET a cluster which is in the middle of updating; in this case, the last known data for the cluster is returned.

Instance template objects now also include the following new field:

* rackId: An optional rack ID; when provided, Altus Director sets the rack ID in Cloudera Manager for each instance accordingly.

The following error code related to rack IDs may now be returned:

* CM_HOST_ID_NOT_FOUND: Altus Director is unable to locate the host corresponding to an instance in Cloudera Manager.
