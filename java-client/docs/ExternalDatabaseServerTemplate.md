
# ExternalDatabaseServerTemplate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | External database server template name | 
**type** | [**TypeEnum**](#TypeEnum) | External database server type | 
**hostname** | **String** | If server already exists, external database server hostname |  [optional]
**port** | **Integer** | If server already exists, external database server port |  [optional]
**username** | **String** | User name for administrative access to external database server | 
**password** | **String** | Password for administrative access to external database server [redacted on read] | 
**config** | **Map&lt;String, String&gt;** | Provider-specific configuration properties for creating a new external database server |  [optional]
**tags** | **Map&lt;String, String&gt;** | Tags to associate with a new external database server |  [optional]


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
POSTGRESQL | &quot;POSTGRESQL&quot;
MYSQL | &quot;MYSQL&quot;
ORACLE | &quot;ORACLE&quot;



