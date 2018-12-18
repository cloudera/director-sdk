
# ExternalDatabaseServer

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | External database server name | 
**type** | [**TypeEnum**](#TypeEnum) | External database server type | 
**hostname** | **String** | External database server hostname | 
**port** | **Integer** | External database server port | 
**username** | **String** | User name for administrative access to external database server | 
**password** | **String** | Password for administrative access to external database server [redacted on read] | 
**properties** | **Map&lt;String, String&gt;** | External database server display properties |  [optional]


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
POSTGRESQL | &quot;POSTGRESQL&quot;
MYSQL | &quot;MYSQL&quot;
ORACLE | &quot;ORACLE&quot;



