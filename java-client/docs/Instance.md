
# Instance

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ipAddress** | **String** | IP address of instance | 
**properties** | **Map&lt;String, String&gt;** | Instance properties |  [optional]
**virtualInstance** | [**VirtualInstance**](VirtualInstance.md) | Virtual instance mapping to this instance | 
**capabilities** | [**Capabilities**](Capabilities.md) | Optional instance capabilities |  [optional]
**cmHostId** | **String** | Optional Cloudera Manager HostId |  [optional]
**cmHostUrl** | **String** | Optional Cloudera Manager Host URL |  [optional]
**hostKeyFingerprints** | **List&lt;String&gt;** | Optional Host Key Fingerprints |  [optional]
**state** | [**InstanceState**](InstanceState.md) | Instance state |  [optional]
**validationConditions** | [**List&lt;ValidationExceptionCondition&gt;**](ValidationExceptionCondition.md) | Validation conditions |  [optional]
**health** | [**Health**](Health.md) | Instance health |  [optional]



