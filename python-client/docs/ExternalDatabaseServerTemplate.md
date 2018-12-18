# ExternalDatabaseServerTemplate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** | External database server template name | 
**type** | **str** | External database server type | 
**hostname** | **str** | If server already exists, external database server hostname | [optional] 
**port** | **int** | If server already exists, external database server port | [optional] 
**username** | **str** | User name for administrative access to external database server | 
**password** | **str** | Password for administrative access to external database server [redacted on read] | 
**config** | **dict(str, str)** | Provider-specific configuration properties for creating a new external database server | [optional] 
**tags** | **dict(str, str)** | Tags to associate with a new external database server | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


