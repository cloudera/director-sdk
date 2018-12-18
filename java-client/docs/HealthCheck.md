
# HealthCheck

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**checkName** | **String** | Health check name | 
**healthStatus** | [**HealthStatusEnum**](#HealthStatusEnum) | Health status value | 
**explanation** | **String** | Explanation for health status |  [optional]
**suppressed** | **Boolean** | Check suppression flag |  [optional]


<a name="HealthStatusEnum"></a>
## Enum: HealthStatusEnum
Name | Value
---- | -----
DISABLED | &quot;DISABLED&quot;
NOT_AVAILABLE | &quot;NOT_AVAILABLE&quot;
STARTING | &quot;STARTING&quot;
STOPPING | &quot;STOPPING&quot;
STOPPED | &quot;STOPPED&quot;
GOOD | &quot;GOOD&quot;
CONCERNING | &quot;CONCERNING&quot;
BAD | &quot;BAD&quot;



