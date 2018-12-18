
# ConfigurationProperty

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**configKey** | **String** | Configuration property key | 
**name** | **String** | Configuration property name |  [optional]
**description** | **String** | Configuration property description |  [optional]
**sensitive** | **Boolean** | Whether this property is sensitive |  [optional]
**required** | **Boolean** | Whether this property is required |  [optional]
**basic** | **Boolean** | Whether this property is basic |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | Configuration property type |  [optional]
**widget** | [**WidgetEnum**](#WidgetEnum) | Widget used to display this property |  [optional]
**defaultValue** | **String** | Default value for this property |  [optional]
**listSeparator** | **String** | Character to use to separate lists |  [optional]
**placeholder** | **String** | Placeholder value to use if the value is unset |  [optional]
**validValues** | [**List&lt;ConfigurationPropertyValue&gt;**](ConfigurationPropertyValue.md) | List of all valid values for this property |  [optional]


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



