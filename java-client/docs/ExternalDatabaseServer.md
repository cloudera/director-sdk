
# ExternalDatabaseServer

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**hostname** | **String** | External database server hostname | 
**name** | **String** | External database server name | 
**password** | **String** | Password for administrative access to external database server [redacted on read] | 
**port** | **Integer** | External database server port | 
**properties** | **Map&lt;String, String&gt;** | External database server display properties |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | External database server type | 
**username** | **String** | User name for administrative access to external database server | 


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
POSTGRESQL | &quot;POSTGRESQL&quot;
MYSQL | &quot;MYSQL&quot;
ORACLE | &quot;ORACLE&quot;



