
# Deployment

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Deployment name | 
**hostname** | **String** | Hostname for existing Cloudera Manager installation |  [optional]
**port** | **Integer** | API port for an existing Cloudera Manager installation |  [optional]
**username** | **String** | Username for API access |  [optional]
**password** | **String** | Password for API access [redacted on read] |  [optional]
**tlsEnabled** | **Boolean** | Whether TLS is enabled |  [optional]
**trustedCertificate** | **String** | Trusted certificate for the Cloudera Manager server |  [optional]
**tlsConfigurationProperties** | **Map&lt;String, String&gt;** | TLS configuration properties |  [optional]
**managerInstance** | [**Instance**](Instance.md) | Instance where Cloudera Manager is installed |  [optional]
**repository** | **String** | Custom Cloudera Manager repository URL |  [optional]
**repositoryKeyUrl** | **String** | Custom Cloudera Manager public GPG key |  [optional]
**repositoryKeyBundleUrl** | **String** | Custom Cloudera Manager key bundle URL |  [optional]
**enableEnterpriseTrial** | **Boolean** | Whether to enable Cloudera Enterprise Trial |  [optional]
**unlimitedJce** | **Boolean** | Whether to install unlimited strength JCE policy files |  [optional]
**krbAdminUsername** | **String** | Username for Kerberos administrative principal used by Cloudera Manager |  [optional]
**krbAdminPassword** | **String** | Password for Kerberos administrative principal used by Cloudera Manager [redacted on read] |  [optional]
**javaInstallationStrategy** | [**JavaInstallationStrategyEnum**](#JavaInstallationStrategyEnum) | Cloudera Altus Director and Cloudera Manager&#39;s Java installation strategy |  [optional]
**cmVersion** | **String** | Cloudera Manager Version |  [optional]


<a name="JavaInstallationStrategyEnum"></a>
## Enum: JavaInstallationStrategyEnum
Name | Value
---- | -----
AUTO | &quot;AUTO&quot;
NONE | &quot;NONE&quot;
DIRECTOR_MANAGED | &quot;DIRECTOR_MANAGED&quot;



