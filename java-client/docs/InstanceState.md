
# InstanceState

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**StatusEnum**](#StatusEnum) | Instance status | 
**lastReported** | **Long** | Last time that instance state was reported | 
**lastChecked** | **Long** | Last time that instance state was checked | 


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
PENDING | &quot;PENDING&quot;
RUNNING | &quot;RUNNING&quot;
STOPPING | &quot;STOPPING&quot;
STOPPED | &quot;STOPPED&quot;
DELETING | &quot;DELETING&quot;
DELETED | &quot;DELETED&quot;
FAILED | &quot;FAILED&quot;
UNKNOWN | &quot;UNKNOWN&quot;
MISSING | &quot;MISSING&quot;



