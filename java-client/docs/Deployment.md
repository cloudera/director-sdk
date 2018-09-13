
# Deployment

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cmVersion** | **String** | Cloudera Manager Version |  [optional]
**enableEnterpriseTrial** | **Boolean** | Whether to enable Cloudera Enterprise Trial |  [optional]
**hostname** | **String** | Hostname for existing Cloudera Manager installation |  [optional]
**javaInstallationStrategy** | [**JavaInstallationStrategyEnum**](#JavaInstallationStrategyEnum) | Cloudera Altus Director and Cloudera Manager&#39;s Java installation strategy |  [optional]
**krbAdminPassword** | **String** | Password for Kerberos administrative principal used by Cloudera Manager [redacted on read] |  [optional]
**krbAdminUsername** | **String** | Username for Kerberos administrative principal used by Cloudera Manager |  [optional]
**managerInstance** | [**Instance**](Instance.md) | Instance where Cloudera Manager is installed |  [optional]
**name** | **String** | Deployment name | 
**password** | **String** | Password for API access [redacted on read] |  [optional]
**port** | **Integer** | API port for an existing Cloudera Manager installation |  [optional]
**repository** | **String** | Custom Cloudera Manager repository URL |  [optional]
**repositoryKeyUrl** | **String** | Custom Cloudera Manager public GPG key |  [optional]
**tlsConfigurationProperties** | **Map&lt;String, String&gt;** | TLS configuration properties |  [optional]
**tlsEnabled** | **Boolean** | Whether TLS is enabled |  [optional]
**trustedCertificate** | **String** | Trusted certificate for the Cloudera Manager server |  [optional]
**unlimitedJce** | **Boolean** | Whether to install unlimited strength JCE policy files |  [optional]
**username** | **String** | Username for API access |  [optional]


<a name="JavaInstallationStrategyEnum"></a>
## Enum: JavaInstallationStrategyEnum
Name | Value
---- | -----
AUTO | &quot;AUTO&quot;
NONE | &quot;NONE&quot;
DIRECTOR_MANAGED | &quot;DIRECTOR_MANAGED&quot;



