
# ClusterTemplate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**administrationSettings** | [**ClusterAdministrationSettings**](ClusterAdministrationSettings.md) | Optional cluster administration settings |  [optional]
**externalDatabaseTemplates** | [**Map&lt;String, ExternalDatabaseTemplate&gt;**](ExternalDatabaseTemplate.md) | Optional external database templates |  [optional]
**externalDatabases** | [**Map&lt;String, ExternalDatabase&gt;**](ExternalDatabase.md) | Optional external databases |  [optional]
**instancePostCreateScripts** | [**List&lt;Script&gt;**](Script.md) | A list of scripts to be run after cluster creation on all cluster instances |  [optional]
**migrations** | [**List&lt;Migration&gt;**](Migration.md) | A description of current manual migrations (read only) |  [optional]
**name** | **String** | Cluster name | 
**parcelRepositories** | **List&lt;String&gt;** | Optional set of cluster parcel repositories |  [optional]
**postCreateScripts** | [**List&lt;Script&gt;**](Script.md) | A list of scripts to be run after cluster creation |  [optional]
**preTerminateScripts** | [**List&lt;Script&gt;**](Script.md) | A list of scripts to be run before cluster termination |  [optional]
**productVersions** | **Map&lt;String, String&gt;** | Versions for cluster components |  [optional]
**redeployClientConfigsOnUpdate** | **Boolean** | Whether to redeploy client configuration on cluster update |  [optional]
**restartClusterOnUpdate** | **Boolean** | Whether to restart the cluster on cluster update |  [optional]
**services** | **List&lt;String&gt;** | Cluster services |  [optional]
**servicesConfigs** | [**Map&lt;String, Map&lt;String, String&gt;&gt;**](Map.md) | Cluster services configurations |  [optional]
**virtualInstanceGroups** | [**Map&lt;String, VirtualInstanceGroup&gt;**](VirtualInstanceGroup.md) | List of virtual instances | 



