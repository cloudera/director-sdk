
# ConfigurationProperty

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**basic** | **Boolean** | Whether this property is basic |  [optional]
**configKey** | **String** | Configuration property key | 
**defaultValue** | **String** | Default value for this property |  [optional]
**description** | **String** | Configuration property description |  [optional]
**listSeparator** | **String** | Character to use to separate lists |  [optional]
**name** | **String** | Configuration property name |  [optional]
**placeholder** | **String** | Placeholder value to use if the value is unset |  [optional]
**required** | **Boolean** | Whether this property is required |  [optional]
**sensitive** | **Boolean** | Whether this property is sensitive |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | Configuration property type |  [optional]
**validValues** | [**List&lt;ConfigurationPropertyValue&gt;**](ConfigurationPropertyValue.md) | List of all valid values for this property |  [optional]
**widget** | [**WidgetEnum**](#WidgetEnum) | Widget used to display this property |  [optional]


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



