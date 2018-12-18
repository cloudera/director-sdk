# DeploymentTemplate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** | Deployment name | 
**manager_virtual_instance** | [**VirtualInstance**](VirtualInstance.md) | Instance definition for a Cloudera Manager instance created from scratch | [optional] 
**external_database_templates** | [**dict(str, ExternalDatabaseTemplate)**](ExternalDatabaseTemplate.md) | External database template definitions | [optional] 
**external_databases** | [**dict(str, ExternalDatabase)**](ExternalDatabase.md) | External database definitions | [optional] 
**configs** | **dict(str, dict(str, str))** | Optional configurations for Cloudera Manager and its management services | [optional] 
**external_accounts** | [**dict(str, ExternalAccount)**](ExternalAccount.md) | External account definitions | [optional] 
**hostname** | **str** | Hostname for existing Cloudera Manager installation | [optional] 
**port** | **int** | Port for existing Cloudera Manager installation | [optional] 
**username** | **str** | Web UI and API username | [optional] 
**password** | **str** | Web UI and API password [redacted on read] | [optional] 
**tls_enabled** | **bool** | Whether to enable TLS | [optional] 
**trusted_certificate** | **str** | Trusted certificate for the Cloudera Manager server | [optional] 
**tls_configuration_properties** | **dict(str, str)** | TLS configuration properties | [optional] 
**repository** | **str** | Custom Cloudera Manager repository URL | [optional] 
**repository_key_url** | **str** | Custom Cloudera Manager public GPG key | [optional] 
**repository_key_bundle_url** | **str** | Custom Cloudera Manager key bundle URL | [optional] 
**enable_enterprise_trial** | **bool** | Whether to enable Cloudera Enterprise Trial | [optional] 
**unlimited_jce** | **bool** | Whether to install unlimited strength JCE policy files | [optional] 
**krb_admin_username** | **str** | Username for Kerberos administrative principal used by Cloudera Manager | [optional] 
**krb_admin_password** | **str** | Password for Kerberos administrative principal used by Cloudera Manager [redacted on read] | [optional] 
**java_installation_strategy** | **str** | Cloudera Altus Director and Cloudera Manager&#39;s Java installation strategy | [optional] 
**license** | **str** | License for Cloudera Manager [redacted on read] | [optional] 
**billing_id** | **str** | Billing ID for usage-based billing [redacted on read] | [optional] 
**post_create_scripts** | [**list[Script]**](Script.md) | A list of scripts to be run after deployment creation | [optional] 
**csds** | **list[str]** | A list of CSD package URLs | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


