
# ResourceProviderMetadata

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Resource provider metadata ID | 
**type** | [**TypeEnum**](#TypeEnum) | Resource provider metadata type | 
**name** | **String** | Resource provider name | 
**description** | **String** | Resource provider description | 
**configurationProperties** | [**List&lt;ConfigurationProperty&gt;**](ConfigurationProperty.md) | Resource provider configuration properties |  [optional]
**templateProperties** | [**List&lt;ConfigurationProperty&gt;**](ConfigurationProperty.md) | Template configuration properties |  [optional]
**resourceDisplayProperties** | [**List&lt;DisplayProperty&gt;**](DisplayProperty.md) | Resource provider display properties |  [optional]


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
COMPUTE | &quot;COMPUTE&quot;
DATABASE | &quot;DATABASE&quot;
UNKNOWN | &quot;UNKNOWN&quot;



