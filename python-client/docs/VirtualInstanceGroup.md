# VirtualInstanceGroup

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**min_count** | **int** | Minimum acceptable number of instances in this group | 
**name** | **str** | Virtual instance group name | 
**role_types_configs** | **dict(str, dict(str, dict(str, str)))** | Custom role configurations | [optional] 
**service_type_to_role_types** | **dict(str, list[str])** | Role assignments | [optional] 
**virtual_instances** | [**list[VirtualInstance]**](VirtualInstance.md) | List of virtual instances in this group | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


