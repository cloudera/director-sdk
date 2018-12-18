# Deployment

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** | Deployment name | 
**hostname** | **str** | Hostname for existing Cloudera Manager installation | [optional] 
**port** | **int** | API port for an existing Cloudera Manager installation | [optional] 
**username** | **str** | Username for API access | [optional] 
**password** | **str** | Password for API access [redacted on read] | [optional] 
**tls_enabled** | **bool** | Whether TLS is enabled | [optional] 
**trusted_certificate** | **str** | Trusted certificate for the Cloudera Manager server | [optional] 
**tls_configuration_properties** | **dict(str, str)** | TLS configuration properties | [optional] 
**manager_instance** | [**Instance**](Instance.md) | Instance where Cloudera Manager is installed | [optional] 
**repository** | **str** | Custom Cloudera Manager repository URL | [optional] 
**repository_key_url** | **str** | Custom Cloudera Manager public GPG key | [optional] 
**repository_key_bundle_url** | **str** | Custom Cloudera Manager key bundle URL | [optional] 
**enable_enterprise_trial** | **bool** | Whether to enable Cloudera Enterprise Trial | [optional] 
**unlimited_jce** | **bool** | Whether to install unlimited strength JCE policy files | [optional] 
**krb_admin_username** | **str** | Username for Kerberos administrative principal used by Cloudera Manager | [optional] 
**krb_admin_password** | **str** | Password for Kerberos administrative principal used by Cloudera Manager [redacted on read] | [optional] 
**java_installation_strategy** | **str** | Cloudera Altus Director and Cloudera Manager&#39;s Java installation strategy | [optional] 
**cm_version** | **str** | Cloudera Manager Version | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


