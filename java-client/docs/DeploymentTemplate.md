
# DeploymentTemplate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Deployment name | 
**managerVirtualInstance** | [**VirtualInstance**](VirtualInstance.md) | Instance definition for a Cloudera Manager instance created from scratch |  [optional]
**externalDatabaseTemplates** | [**Map&lt;String, ExternalDatabaseTemplate&gt;**](ExternalDatabaseTemplate.md) | External database template definitions |  [optional]
**externalDatabases** | [**Map&lt;String, ExternalDatabase&gt;**](ExternalDatabase.md) | External database definitions |  [optional]
**configs** | [**Map&lt;String, Map&lt;String, String&gt;&gt;**](Map.md) | Optional configurations for Cloudera Manager and its management services |  [optional]
**externalAccounts** | [**Map&lt;String, ExternalAccount&gt;**](ExternalAccount.md) | External account definitions |  [optional]
**hostname** | **String** | Hostname for existing Cloudera Manager installation |  [optional]
**port** | **Integer** | Port for existing Cloudera Manager installation |  [optional]
**username** | **String** | Web UI and API username |  [optional]
**password** | **String** | Web UI and API password [redacted on read] |  [optional]
**tlsEnabled** | **Boolean** | Whether to enable TLS |  [optional]
**trustedCertificate** | **String** | Trusted certificate for the Cloudera Manager server |  [optional]
**tlsConfigurationProperties** | **Map&lt;String, String&gt;** | TLS configuration properties |  [optional]
**repository** | **String** | Custom Cloudera Manager repository URL |  [optional]
**repositoryKeyUrl** | **String** | Custom Cloudera Manager public GPG key |  [optional]
**repositoryKeyBundleUrl** | **String** | Custom Cloudera Manager key bundle URL |  [optional]
**enableEnterpriseTrial** | **Boolean** | Whether to enable Cloudera Enterprise Trial |  [optional]
**unlimitedJce** | **Boolean** | Whether to install unlimited strength JCE policy files |  [optional]
**krbAdminUsername** | **String** | Username for Kerberos administrative principal used by Cloudera Manager |  [optional]
**krbAdminPassword** | **String** | Password for Kerberos administrative principal used by Cloudera Manager [redacted on read] |  [optional]
**javaInstallationStrategy** | [**JavaInstallationStrategyEnum**](#JavaInstallationStrategyEnum) | Cloudera Altus Director and Cloudera Manager&#39;s Java installation strategy |  [optional]
**license** | **String** | License for Cloudera Manager [redacted on read] |  [optional]
**billingId** | **String** | Billing ID for usage-based billing [redacted on read] |  [optional]
**postCreateScripts** | [**List&lt;Script&gt;**](Script.md) | A list of scripts to be run after deployment creation |  [optional]
**csds** | **List&lt;String&gt;** | A list of CSD package URLs |  [optional]


<a name="JavaInstallationStrategyEnum"></a>
## Enum: JavaInstallationStrategyEnum
Name | Value
---- | -----
AUTO | &quot;AUTO&quot;
NONE | &quot;NONE&quot;
DIRECTOR_MANAGED | &quot;DIRECTOR_MANAGED&quot;



