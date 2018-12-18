# Status

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**stage** | **str** | Current stage of the process | 
**description** | **str** | Status description | 
**description_details** | **list[str]** | Detailed status description | [optional] 
**error_info** | [**ErrorInfo**](ErrorInfo.md) | Error information associated with the status | [optional] 
**remaining_steps** | **int** | Number of remaining steps planned for the process | 
**completed_steps** | **int** | Number of steps completed for the process | 
**health** | [**Health**](Health.md) | Health reported for the entity being processed | 
**diagnostic_data_summaries** | [**list[DiagnosticDataSummary]**](DiagnosticDataSummary.md) | Diagnostic data summaries | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


