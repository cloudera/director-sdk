
# Cluster

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Cluster name | 
**instances** | [**List&lt;Instance&gt;**](Instance.md) | Instances making this cluster |  [optional]
**services** | [**List&lt;Service&gt;**](Service.md) | Services that belong to this cluster |  [optional]
**url** | **String** | Optional URL for cluster in Cloudera Manager |  [optional]
**instancesUrl** | **String** | Optional URL for cluster instances in Cloudera Manager |  [optional]
**health** | [**Health**](Health.md) | Overall cluster health |  [optional]
**featureAvailability** | [**Map&lt;String, InnerEnum&gt;**](#Map&lt;String, InnerEnum&gt;) | Availability information for features |  [optional]
**createdExternalDatabases** | [**List&lt;ExternalDatabase&gt;**](ExternalDatabase.md) | External databases created for this cluster |  [optional]


<a name="Map<String, InnerEnum>"></a>
## Enum: Map&lt;String, InnerEnum&gt;
Name | Value
---- | -----
UNKNOWN | &quot;UNKNOWN&quot;
UNAVAILABLE | &quot;UNAVAILABLE&quot;
AVAILABLE | &quot;AVAILABLE&quot;



