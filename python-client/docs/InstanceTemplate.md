# InstanceTemplate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** | Instance template name | 
**type** | **str** | Instance type | 
**image** | **str** | Operating system image | 
**rack_id** | **str** | Instance virtual rack ID | [optional] 
**config** | **dict(str, str)** | Instance configuration properties | [optional] 
**tags** | **dict(str, str)** | Instance tags | [optional] 
**normalize_instance** | **bool** | Flag indicating whether to normalize the instance | [optional] 
**normalization_config** | [**NormalizationConfiguration**](NormalizationConfiguration.md) | Normalization configuration | [optional] 
**ssh_username** | **str** | Optional SSH username to override username specified in environment | [optional] 
**bootstrap_scripts** | [**list[Script]**](Script.md) | List of instance bootstrap scripts | [optional] 
**pre_terminate_scripts** | [**list[Script]**](Script.md) | List of instance pre-terminate scripts | [optional] 
**ssh_host_key_retrieval_type** | **str** | SSH host key retrieval type | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


