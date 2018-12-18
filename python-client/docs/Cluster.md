# Cluster

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** | Cluster name | 
**instances** | [**list[Instance]**](Instance.md) | Instances making this cluster | [optional] 
**services** | [**list[Service]**](Service.md) | Services that belong to this cluster | [optional] 
**url** | **str** | Optional URL for cluster in Cloudera Manager | [optional] 
**instances_url** | **str** | Optional URL for cluster instances in Cloudera Manager | [optional] 
**health** | [**Health**](Health.md) | Overall cluster health | [optional] 
**feature_availability** | **dict(str, str)** | Availability information for features | [optional] 
**created_external_databases** | [**list[ExternalDatabase]**](ExternalDatabase.md) | External databases created for this cluster | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


