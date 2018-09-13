
# ExternalDatabaseServerTemplate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**config** | **Map&lt;String, String&gt;** | Provider-specific configuration properties for creating a new external database server |  [optional]
**hostname** | **String** | If server already exists, external database server hostname |  [optional]
**name** | **String** | External database server template name | 
**password** | **String** | Password for administrative access to external database server [redacted on read] | 
**port** | **Integer** | If server already exists, external database server port |  [optional]
**tags** | **Map&lt;String, String&gt;** | Tags to associate with a new external database server |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | External database server type | 
**username** | **String** | User name for administrative access to external database server | 


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
POSTGRESQL | &quot;POSTGRESQL&quot;
MYSQL | &quot;MYSQL&quot;
ORACLE | &quot;ORACLE&quot;



