
# InstanceTemplate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bootstrapScripts** | [**List&lt;Script&gt;**](Script.md) | List of instance bootstrap scripts |  [optional]
**config** | **Map&lt;String, String&gt;** | Instance configuration properties |  [optional]
**image** | **String** | Operating system image | 
**name** | **String** | Instance template name | 
**normalizationConfig** | [**NormalizationConfiguration**](NormalizationConfiguration.md) | Normalization configuration |  [optional]
**normalizeInstance** | **Boolean** | Flag indicating whether to normalize the instance |  [optional]
**rackId** | **String** | Instance virtual rack ID |  [optional]
**sshHostKeyRetrievalType** | [**SshHostKeyRetrievalTypeEnum**](#SshHostKeyRetrievalTypeEnum) | SSH host key retrieval type |  [optional]
**sshUsername** | **String** | Optional SSH username to override username specified in environment |  [optional]
**tags** | **Map&lt;String, String&gt;** | Instance tags |  [optional]
**type** | **String** | Instance type | 


<a name="SshHostKeyRetrievalTypeEnum"></a>
## Enum: SshHostKeyRetrievalTypeEnum
Name | Value
---- | -----
NONE | &quot;NONE&quot;
INSTANCE | &quot;INSTANCE&quot;
PROVIDER | &quot;PROVIDER&quot;
FALLBACK | &quot;FALLBACK&quot;



