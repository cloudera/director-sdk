# Instance

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ip_address** | **str** | IP address of instance | 
**properties** | **dict(str, str)** | Instance properties | [optional] 
**virtual_instance** | [**VirtualInstance**](VirtualInstance.md) | Virtual instance mapping to this instance | 
**capabilities** | [**Capabilities**](Capabilities.md) | Optional instance capabilities | [optional] 
**cm_host_id** | **str** | Optional Cloudera Manager HostId | [optional] 
**cm_host_url** | **str** | Optional Cloudera Manager Host URL | [optional] 
**host_key_fingerprints** | **list[str]** | Optional Host Key Fingerprints | [optional] 
**state** | [**InstanceState**](InstanceState.md) | Instance state | [optional] 
**validation_conditions** | [**list[ValidationExceptionCondition]**](ValidationExceptionCondition.md) | Validation conditions | [optional] 
**health** | [**Health**](Health.md) | Instance health | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


