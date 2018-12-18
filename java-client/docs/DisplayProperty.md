
# DisplayProperty

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**displayKey** | **String** | Display property key | 
**name** | **String** | Display property name |  [optional]
**description** | **String** | Display property description |  [optional]
**sensitive** | **Boolean** | Whether this property is sensitive |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | Display property type |  [optional]
**widget** | [**WidgetEnum**](#WidgetEnum) | Widget used to display this property |  [optional]
**backingConfigKey** | **String** | Backing configuration property key |  [optional]


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
BOOLEAN | &quot;BOOLEAN&quot;
INTEGER | &quot;INTEGER&quot;
DOUBLE | &quot;DOUBLE&quot;
STRING | &quot;STRING&quot;


<a name="WidgetEnum"></a>
## Enum: WidgetEnum
Name | Value
---- | -----
RADIO | &quot;RADIO&quot;
CHECKBOX | &quot;CHECKBOX&quot;
TEXT | &quot;TEXT&quot;
PASSWORD | &quot;PASSWORD&quot;
NUMBER | &quot;NUMBER&quot;
TEXTAREA | &quot;TEXTAREA&quot;
FILE | &quot;FILE&quot;
LIST | &quot;LIST&quot;
OPENLIST | &quot;OPENLIST&quot;
MULTI | &quot;MULTI&quot;
OPENMULTI | &quot;OPENMULTI&quot;



