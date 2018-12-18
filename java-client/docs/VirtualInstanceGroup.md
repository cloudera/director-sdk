
# VirtualInstanceGroup

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Virtual instance group name | 
**virtualInstances** | [**List&lt;VirtualInstance&gt;**](VirtualInstance.md) | List of virtual instances in this group | 
**serviceTypeToRoleTypes** | [**Map&lt;String, List&lt;String&gt;&gt;**](List.md) | Role assignments |  [optional]
**roleTypesConfigs** | [**Map&lt;String, Map&lt;String, Map&lt;String, String&gt;&gt;&gt;**](Map.md) | Custom role configurations |  [optional]
**minCount** | **Integer** | Minimum acceptable number of instances in this group | 



