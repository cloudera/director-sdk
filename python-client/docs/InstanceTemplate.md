# InstanceTemplate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bootstrap_scripts** | [**list[Script]**](Script.md) | List of instance bootstrap scripts | [optional] 
**config** | **dict(str, str)** | Instance configuration properties | [optional] 
**image** | **str** | Operating system image | 
**name** | **str** | Instance template name | 
**normalization_config** | [**NormalizationConfiguration**](NormalizationConfiguration.md) | Normalization configuration | [optional] 
**normalize_instance** | **bool** | Flag indicating whether to normalize the instance | [optional] 
**rack_id** | **str** | Instance virtual rack ID | [optional] 
**ssh_host_key_retrieval_type** | **str** | SSH host key retrieval type | [optional] 
**ssh_username** | **str** | Optional SSH username to override username specified in environment | [optional] 
**tags** | **dict(str, str)** | Instance tags | [optional] 
**type** | **str** | Instance type | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


