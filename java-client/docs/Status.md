
# Status

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**completedSteps** | **Integer** | Number of steps completed for the process | 
**description** | **String** | Status description | 
**descriptionDetails** | **List&lt;String&gt;** | Detailed status description |  [optional]
**diagnosticDataSummaries** | [**List&lt;DiagnosticDataSummary&gt;**](DiagnosticDataSummary.md) | Diagnostic data summaries |  [optional]
**errorInfo** | [**ErrorInfo**](ErrorInfo.md) | Error information associated with the status |  [optional]
**health** | [**Health**](Health.md) | Health reported for the entity being processed | 
**remainingSteps** | **Integer** | Number of remaining steps planned for the process | 
**stage** | [**StageEnum**](#StageEnum) | Current stage of the process | 


<a name="StageEnum"></a>
## Enum: StageEnum
Name | Value
---- | -----
BOOTSTRAPPING | &quot;BOOTSTRAPPING&quot;
BOOTSTRAP_FAILED | &quot;BOOTSTRAP_FAILED&quot;
READY | &quot;READY&quot;
UPDATING | &quot;UPDATING&quot;
UPDATE_FAILED | &quot;UPDATE_FAILED&quot;
TERMINATING | &quot;TERMINATING&quot;
TERMINATE_FAILED | &quot;TERMINATE_FAILED&quot;
TERMINATED | &quot;TERMINATED&quot;
UNKNOWN | &quot;UNKNOWN&quot;



