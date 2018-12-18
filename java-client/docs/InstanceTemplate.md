
# InstanceTemplate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Instance template name | 
**type** | **String** | Instance type | 
**image** | **String** | Operating system image | 
**rackId** | **String** | Instance virtual rack ID |  [optional]
**config** | **Map&lt;String, String&gt;** | Instance configuration properties |  [optional]
**tags** | **Map&lt;String, String&gt;** | Instance tags |  [optional]
**normalizeInstance** | **Boolean** | Flag indicating whether to normalize the instance |  [optional]
**normalizationConfig** | [**NormalizationConfiguration**](NormalizationConfiguration.md) | Normalization configuration |  [optional]
**sshUsername** | **String** | Optional SSH username to override username specified in environment |  [optional]
**bootstrapScripts** | [**List&lt;Script&gt;**](Script.md) | List of instance bootstrap scripts |  [optional]
**preTerminateScripts** | [**List&lt;Script&gt;**](Script.md) | List of instance pre-terminate scripts |  [optional]
**sshHostKeyRetrievalType** | [**SshHostKeyRetrievalTypeEnum**](#SshHostKeyRetrievalTypeEnum) | SSH host key retrieval type |  [optional]


<a name="SshHostKeyRetrievalTypeEnum"></a>
## Enum: SshHostKeyRetrievalTypeEnum
Name | Value
---- | -----
NONE | &quot;NONE&quot;
INSTANCE | &quot;INSTANCE&quot;
PROVIDER | &quot;PROVIDER&quot;
FALLBACK | &quot;FALLBACK&quot;



