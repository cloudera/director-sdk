# ClusterTemplate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**administration_settings** | [**ClusterAdministrationSettings**](ClusterAdministrationSettings.md) | Optional cluster administration settings | [optional] 
**external_database_templates** | [**dict(str, ExternalDatabaseTemplate)**](ExternalDatabaseTemplate.md) | Optional external database templates | [optional] 
**external_databases** | [**dict(str, ExternalDatabase)**](ExternalDatabase.md) | Optional external databases | [optional] 
**instance_post_create_scripts** | [**list[Script]**](Script.md) | A list of scripts to be run after cluster creation on all cluster instances | [optional] 
**migrations** | [**list[Migration]**](Migration.md) | A description of current manual migrations (read only) | [optional] 
**name** | **str** | Cluster name | 
**parcel_repositories** | **list[str]** | Optional set of cluster parcel repositories | [optional] 
**post_create_scripts** | [**list[Script]**](Script.md) | A list of scripts to be run after cluster creation | [optional] 
**pre_terminate_scripts** | [**list[Script]**](Script.md) | A list of scripts to be run before cluster termination | [optional] 
**product_versions** | **dict(str, str)** | Versions for cluster components | [optional] 
**redeploy_client_configs_on_update** | **bool** | Whether to redeploy client configuration on cluster update | [optional] 
**restart_cluster_on_update** | **bool** | Whether to restart the cluster on cluster update | [optional] 
**services** | **list[str]** | Cluster services | [optional] 
**services_configs** | **dict(str, dict(str, str))** | Cluster services configurations | [optional] 
**virtual_instance_groups** | [**dict(str, VirtualInstanceGroup)**](VirtualInstanceGroup.md) | List of virtual instances | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


