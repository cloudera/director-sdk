
# ResourceProviderMetadata

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**configurationProperties** | [**List&lt;ConfigurationProperty&gt;**](ConfigurationProperty.md) | Resource provider configuration properties |  [optional]
**description** | **String** | Resource provider description | 
**id** | **String** | Resource provider metadata ID | 
**name** | **String** | Resource provider name | 
**resourceDisplayProperties** | [**List&lt;DisplayProperty&gt;**](DisplayProperty.md) | Resource provider display properties |  [optional]
**templateProperties** | [**List&lt;ConfigurationProperty&gt;**](ConfigurationProperty.md) | Template configuration properties |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | Resource provider metadata type | 


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
COMPUTE | &quot;COMPUTE&quot;
DATABASE | &quot;DATABASE&quot;
UNKNOWN | &quot;UNKNOWN&quot;



