
# VirtualInstanceGroup

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**minCount** | **Integer** | Minimum acceptable number of instances in this group | 
**name** | **String** | Virtual instance group name | 
**roleTypesConfigs** | [**Map&lt;String, Map&lt;String, Map&lt;String, String&gt;&gt;&gt;**](Map.md) | Custom role configurations |  [optional]
**serviceTypeToRoleTypes** | [**Map&lt;String, List&lt;String&gt;&gt;**](List.md) | Role assignments |  [optional]
**virtualInstances** | [**List&lt;VirtualInstance&gt;**](VirtualInstance.md) | List of virtual instances in this group | 



