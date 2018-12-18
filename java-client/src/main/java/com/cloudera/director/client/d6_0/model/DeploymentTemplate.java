// Licensed to Cloudera, Inc. under one
// or more contributor license agreements.  See the NOTICE file
// distributed with this work for additional information
// regarding copyright ownership.  Cloudera, Inc. licenses this file
// to you under the Apache License, Version 2.0 (the
// "License"); you may not use this file except in compliance
// with the License.  You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.


package com.cloudera.director.client.d6_0.model;

import java.util.Objects;
import com.cloudera.director.client.d6_0.model.ExternalAccount;
import com.cloudera.director.client.d6_0.model.ExternalDatabase;
import com.cloudera.director.client.d6_0.model.ExternalDatabaseTemplate;
import com.cloudera.director.client.d6_0.model.Script;
import com.cloudera.director.client.d6_0.model.VirtualInstance;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * A template for a deployment (Cloudera Manager installation) running in a cloud provider
 */
@ApiModel(description = "A template for a deployment (Cloudera Manager installation) running in a cloud provider")

public class DeploymentTemplate {
  @SerializedName("name")
  private String name = null;
  @SerializedName("managerVirtualInstance")
  private VirtualInstance managerVirtualInstance = null;
  @SerializedName("externalDatabaseTemplates")
  private Map<String, ExternalDatabaseTemplate> externalDatabaseTemplates = null;
  @SerializedName("externalDatabases")
  private Map<String, ExternalDatabase> externalDatabases = null;
  @SerializedName("configs")
  private Map<String, Map<String, String>> configs = null;
  @SerializedName("externalAccounts")
  private Map<String, ExternalAccount> externalAccounts = null;
  @SerializedName("hostname")
  private String hostname = null;
  @SerializedName("port")
  private Integer port = null;
  @SerializedName("username")
  private String username = null;
  @SerializedName("password")
  private String password = null;
  @SerializedName("tlsEnabled")
  private Boolean tlsEnabled = null;
  @SerializedName("trustedCertificate")
  private String trustedCertificate = null;
  @SerializedName("tlsConfigurationProperties")
  private Map<String, String> tlsConfigurationProperties = null;
  @SerializedName("repository")
  private String repository = null;
  @SerializedName("repositoryKeyUrl")
  private String repositoryKeyUrl = null;
  @SerializedName("enableEnterpriseTrial")
  private Boolean enableEnterpriseTrial = null;
  @SerializedName("unlimitedJce")
  private Boolean unlimitedJce = null;
  @SerializedName("krbAdminUsername")
  private String krbAdminUsername = null;
  @SerializedName("krbAdminPassword")
  private String krbAdminPassword = null;
  /**
   * Cloudera Altus Director and Cloudera Manager&#39;s Java installation strategy
   */
  @JsonAdapter(JavaInstallationStrategyEnum.Adapter.class)
  public enum JavaInstallationStrategyEnum {
    AUTO("AUTO"),
    
    NONE("NONE"),
    
    DIRECTOR_MANAGED("DIRECTOR_MANAGED");

    private String value;

    JavaInstallationStrategyEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static JavaInstallationStrategyEnum fromValue(String text) {
      for (JavaInstallationStrategyEnum b : JavaInstallationStrategyEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<JavaInstallationStrategyEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final JavaInstallationStrategyEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public JavaInstallationStrategyEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return JavaInstallationStrategyEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("javaInstallationStrategy")
  private JavaInstallationStrategyEnum javaInstallationStrategy = null;
  @SerializedName("license")
  private String license = null;
  @SerializedName("billingId")
  private String billingId = null;
  @SerializedName("postCreateScripts")
  private List<Script> postCreateScripts = null;
  @SerializedName("csds")
  private List<String> csds = null;

  public DeploymentTemplate() {
    // Do nothing
  }

  private DeploymentTemplate(DeploymentTemplateBuilder builder) {
      this.name = builder.name;
      this.managerVirtualInstance = builder.managerVirtualInstance;
      this.externalDatabaseTemplates = builder.externalDatabaseTemplates;
      this.externalDatabases = builder.externalDatabases;
      this.configs = builder.configs;
      this.externalAccounts = builder.externalAccounts;
      this.hostname = builder.hostname;
      this.port = builder.port;
      this.username = builder.username;
      this.password = builder.password;
      this.tlsEnabled = builder.tlsEnabled;
      this.trustedCertificate = builder.trustedCertificate;
      this.tlsConfigurationProperties = builder.tlsConfigurationProperties;
      this.repository = builder.repository;
      this.repositoryKeyUrl = builder.repositoryKeyUrl;
      this.enableEnterpriseTrial = builder.enableEnterpriseTrial;
      this.unlimitedJce = builder.unlimitedJce;
      this.krbAdminUsername = builder.krbAdminUsername;
      this.krbAdminPassword = builder.krbAdminPassword;
      this.javaInstallationStrategy = builder.javaInstallationStrategy;
      this.license = builder.license;
      this.billingId = builder.billingId;
      this.postCreateScripts = builder.postCreateScripts;
      this.csds = builder.csds;
    }

  public static DeploymentTemplateBuilder builder() {
    return new DeploymentTemplateBuilder();
  }

  public static class DeploymentTemplateBuilder {
      private String name = null;
      private VirtualInstance managerVirtualInstance = null;
      private Map<String, ExternalDatabaseTemplate> externalDatabaseTemplates = new HashMap<String, ExternalDatabaseTemplate>();
      private Map<String, ExternalDatabase> externalDatabases = new HashMap<String, ExternalDatabase>();
      private Map<String, Map<String, String>> configs = new HashMap<String, Map<String, String>>();
      private Map<String, ExternalAccount> externalAccounts = new HashMap<String, ExternalAccount>();
      private String hostname = null;
      private Integer port = null;
      private String username = null;
      private String password = null;
      private Boolean tlsEnabled = null;
      private String trustedCertificate = null;
      private Map<String, String> tlsConfigurationProperties = new HashMap<String, String>();
      private String repository = null;
      private String repositoryKeyUrl = null;
      private Boolean enableEnterpriseTrial = null;
      private Boolean unlimitedJce = null;
      private String krbAdminUsername = null;
      private String krbAdminPassword = null;
      private JavaInstallationStrategyEnum javaInstallationStrategy = null;
      private String license = null;
      private String billingId = null;
      private List<Script> postCreateScripts = new ArrayList<Script>();
      private List<String> csds = new ArrayList<String>();
  

    public DeploymentTemplateBuilder name(String name) {
      this.name = name;
      return this;
    }


    public DeploymentTemplateBuilder managerVirtualInstance(VirtualInstance managerVirtualInstance) {
      this.managerVirtualInstance = managerVirtualInstance;
      return this;
    }


    public DeploymentTemplateBuilder externalDatabaseTemplates(Map<String, ExternalDatabaseTemplate> externalDatabaseTemplates) {
      this.externalDatabaseTemplates = externalDatabaseTemplates;
      return this;
    }


    public DeploymentTemplateBuilder externalDatabases(Map<String, ExternalDatabase> externalDatabases) {
      this.externalDatabases = externalDatabases;
      return this;
    }


    public DeploymentTemplateBuilder configs(Map<String, Map<String, String>> configs) {
      this.configs = configs;
      return this;
    }


    public DeploymentTemplateBuilder externalAccounts(Map<String, ExternalAccount> externalAccounts) {
      this.externalAccounts = externalAccounts;
      return this;
    }


    public DeploymentTemplateBuilder hostname(String hostname) {
      this.hostname = hostname;
      return this;
    }


    public DeploymentTemplateBuilder port(Integer port) {
      this.port = port;
      return this;
    }


    public DeploymentTemplateBuilder username(String username) {
      this.username = username;
      return this;
    }


    public DeploymentTemplateBuilder password(String password) {
      this.password = password;
      return this;
    }


    public DeploymentTemplateBuilder tlsEnabled(Boolean tlsEnabled) {
      this.tlsEnabled = tlsEnabled;
      return this;
    }


    public DeploymentTemplateBuilder trustedCertificate(String trustedCertificate) {
      this.trustedCertificate = trustedCertificate;
      return this;
    }


    public DeploymentTemplateBuilder tlsConfigurationProperties(Map<String, String> tlsConfigurationProperties) {
      this.tlsConfigurationProperties = tlsConfigurationProperties;
      return this;
    }


    public DeploymentTemplateBuilder repository(String repository) {
      this.repository = repository;
      return this;
    }


    public DeploymentTemplateBuilder repositoryKeyUrl(String repositoryKeyUrl) {
      this.repositoryKeyUrl = repositoryKeyUrl;
      return this;
    }


    public DeploymentTemplateBuilder enableEnterpriseTrial(Boolean enableEnterpriseTrial) {
      this.enableEnterpriseTrial = enableEnterpriseTrial;
      return this;
    }


    public DeploymentTemplateBuilder unlimitedJce(Boolean unlimitedJce) {
      this.unlimitedJce = unlimitedJce;
      return this;
    }


    public DeploymentTemplateBuilder krbAdminUsername(String krbAdminUsername) {
      this.krbAdminUsername = krbAdminUsername;
      return this;
    }


    public DeploymentTemplateBuilder krbAdminPassword(String krbAdminPassword) {
      this.krbAdminPassword = krbAdminPassword;
      return this;
    }


    public DeploymentTemplateBuilder javaInstallationStrategy(JavaInstallationStrategyEnum javaInstallationStrategy) {
      this.javaInstallationStrategy = javaInstallationStrategy;
      return this;
    }


    public DeploymentTemplateBuilder license(String license) {
      this.license = license;
      return this;
    }


    public DeploymentTemplateBuilder billingId(String billingId) {
      this.billingId = billingId;
      return this;
    }


    public DeploymentTemplateBuilder postCreateScripts(List<Script> postCreateScripts) {
      this.postCreateScripts = postCreateScripts;
      return this;
    }


    public DeploymentTemplateBuilder csds(List<String> csds) {
      this.csds = csds;
      return this;
    }


    public DeploymentTemplate build() {
      return new DeploymentTemplate(this);
    }
  }

  public DeploymentTemplateBuilder toBuilder() {
    return builder()
      .name(name)
            .managerVirtualInstance(managerVirtualInstance)
            .externalDatabaseTemplates(externalDatabaseTemplates)
            .externalDatabases(externalDatabases)
            .configs(configs)
            .externalAccounts(externalAccounts)
            .hostname(hostname)
            .port(port)
            .username(username)
            .password(password)
            .tlsEnabled(tlsEnabled)
            .trustedCertificate(trustedCertificate)
            .tlsConfigurationProperties(tlsConfigurationProperties)
            .repository(repository)
            .repositoryKeyUrl(repositoryKeyUrl)
            .enableEnterpriseTrial(enableEnterpriseTrial)
            .unlimitedJce(unlimitedJce)
            .krbAdminUsername(krbAdminUsername)
            .krbAdminPassword(krbAdminPassword)
            .javaInstallationStrategy(javaInstallationStrategy)
            .license(license)
            .billingId(billingId)
            .postCreateScripts(postCreateScripts)
            .csds(csds)
      ;
  }

  public DeploymentTemplate name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Deployment name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Deployment name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DeploymentTemplate managerVirtualInstance(VirtualInstance managerVirtualInstance) {
    this.managerVirtualInstance = managerVirtualInstance;
    return this;
  }

   /**
   * Instance definition for a Cloudera Manager instance created from scratch
   * @return managerVirtualInstance
  **/
  @ApiModelProperty(value = "Instance definition for a Cloudera Manager instance created from scratch")
  public VirtualInstance getManagerVirtualInstance() {
    return managerVirtualInstance;
  }

  public void setManagerVirtualInstance(VirtualInstance managerVirtualInstance) {
    this.managerVirtualInstance = managerVirtualInstance;
  }

  public DeploymentTemplate externalDatabaseTemplates(Map<String, ExternalDatabaseTemplate> externalDatabaseTemplates) {
    this.externalDatabaseTemplates = externalDatabaseTemplates;
    return this;
  }

  public DeploymentTemplate putExternalDatabaseTemplatesItem(String key, ExternalDatabaseTemplate externalDatabaseTemplatesItem) {
    if (this.externalDatabaseTemplates == null) {
      this.externalDatabaseTemplates = new HashMap<String, ExternalDatabaseTemplate>();
    }
    this.externalDatabaseTemplates.put(key, externalDatabaseTemplatesItem);
    return this;
  }

   /**
   * External database template definitions
   * @return externalDatabaseTemplates
  **/
  @ApiModelProperty(value = "External database template definitions")
  public Map<String, ExternalDatabaseTemplate> getExternalDatabaseTemplates() {
    return externalDatabaseTemplates;
  }

  public void setExternalDatabaseTemplates(Map<String, ExternalDatabaseTemplate> externalDatabaseTemplates) {
    this.externalDatabaseTemplates = externalDatabaseTemplates;
  }

  public DeploymentTemplate externalDatabases(Map<String, ExternalDatabase> externalDatabases) {
    this.externalDatabases = externalDatabases;
    return this;
  }

  public DeploymentTemplate putExternalDatabasesItem(String key, ExternalDatabase externalDatabasesItem) {
    if (this.externalDatabases == null) {
      this.externalDatabases = new HashMap<String, ExternalDatabase>();
    }
    this.externalDatabases.put(key, externalDatabasesItem);
    return this;
  }

   /**
   * External database definitions
   * @return externalDatabases
  **/
  @ApiModelProperty(value = "External database definitions")
  public Map<String, ExternalDatabase> getExternalDatabases() {
    return externalDatabases;
  }

  public void setExternalDatabases(Map<String, ExternalDatabase> externalDatabases) {
    this.externalDatabases = externalDatabases;
  }

  public DeploymentTemplate configs(Map<String, Map<String, String>> configs) {
    this.configs = configs;
    return this;
  }

  public DeploymentTemplate putConfigsItem(String key, Map<String, String> configsItem) {
    if (this.configs == null) {
      this.configs = new HashMap<String, Map<String, String>>();
    }
    this.configs.put(key, configsItem);
    return this;
  }

   /**
   * Optional configurations for Cloudera Manager and its management services
   * @return configs
  **/
  @ApiModelProperty(value = "Optional configurations for Cloudera Manager and its management services")
  public Map<String, Map<String, String>> getConfigs() {
    return configs;
  }

  public void setConfigs(Map<String, Map<String, String>> configs) {
    this.configs = configs;
  }

  public DeploymentTemplate externalAccounts(Map<String, ExternalAccount> externalAccounts) {
    this.externalAccounts = externalAccounts;
    return this;
  }

  public DeploymentTemplate putExternalAccountsItem(String key, ExternalAccount externalAccountsItem) {
    if (this.externalAccounts == null) {
      this.externalAccounts = new HashMap<String, ExternalAccount>();
    }
    this.externalAccounts.put(key, externalAccountsItem);
    return this;
  }

   /**
   * External account definitions
   * @return externalAccounts
  **/
  @ApiModelProperty(value = "External account definitions")
  public Map<String, ExternalAccount> getExternalAccounts() {
    return externalAccounts;
  }

  public void setExternalAccounts(Map<String, ExternalAccount> externalAccounts) {
    this.externalAccounts = externalAccounts;
  }

  public DeploymentTemplate hostname(String hostname) {
    this.hostname = hostname;
    return this;
  }

   /**
   * Hostname for existing Cloudera Manager installation
   * @return hostname
  **/
  @ApiModelProperty(value = "Hostname for existing Cloudera Manager installation")
  public String getHostname() {
    return hostname;
  }

  public void setHostname(String hostname) {
    this.hostname = hostname;
  }

  public DeploymentTemplate port(Integer port) {
    this.port = port;
    return this;
  }

   /**
   * Port for existing Cloudera Manager installation
   * @return port
  **/
  @ApiModelProperty(value = "Port for existing Cloudera Manager installation")
  public Integer getPort() {
    return port;
  }

  public void setPort(Integer port) {
    this.port = port;
  }

  public DeploymentTemplate username(String username) {
    this.username = username;
    return this;
  }

   /**
   * Web UI and API username
   * @return username
  **/
  @ApiModelProperty(value = "Web UI and API username")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public DeploymentTemplate password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Web UI and API password [redacted on read]
   * @return password
  **/
  @ApiModelProperty(value = "Web UI and API password [redacted on read]")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public DeploymentTemplate tlsEnabled(Boolean tlsEnabled) {
    this.tlsEnabled = tlsEnabled;
    return this;
  }

   /**
   * Whether to enable TLS
   * @return tlsEnabled
  **/
  @ApiModelProperty(value = "Whether to enable TLS")
  public Boolean isTlsEnabled() {
    return tlsEnabled;
  }

  public void setTlsEnabled(Boolean tlsEnabled) {
    this.tlsEnabled = tlsEnabled;
  }

  public DeploymentTemplate trustedCertificate(String trustedCertificate) {
    this.trustedCertificate = trustedCertificate;
    return this;
  }

   /**
   * Trusted certificate for the Cloudera Manager server
   * @return trustedCertificate
  **/
  @ApiModelProperty(value = "Trusted certificate for the Cloudera Manager server")
  public String getTrustedCertificate() {
    return trustedCertificate;
  }

  public void setTrustedCertificate(String trustedCertificate) {
    this.trustedCertificate = trustedCertificate;
  }

  public DeploymentTemplate tlsConfigurationProperties(Map<String, String> tlsConfigurationProperties) {
    this.tlsConfigurationProperties = tlsConfigurationProperties;
    return this;
  }

  public DeploymentTemplate putTlsConfigurationPropertiesItem(String key, String tlsConfigurationPropertiesItem) {
    if (this.tlsConfigurationProperties == null) {
      this.tlsConfigurationProperties = new HashMap<String, String>();
    }
    this.tlsConfigurationProperties.put(key, tlsConfigurationPropertiesItem);
    return this;
  }

   /**
   * TLS configuration properties
   * @return tlsConfigurationProperties
  **/
  @ApiModelProperty(value = "TLS configuration properties")
  public Map<String, String> getTlsConfigurationProperties() {
    return tlsConfigurationProperties;
  }

  public void setTlsConfigurationProperties(Map<String, String> tlsConfigurationProperties) {
    this.tlsConfigurationProperties = tlsConfigurationProperties;
  }

  public DeploymentTemplate repository(String repository) {
    this.repository = repository;
    return this;
  }

   /**
   * Custom Cloudera Manager repository URL
   * @return repository
  **/
  @ApiModelProperty(value = "Custom Cloudera Manager repository URL")
  public String getRepository() {
    return repository;
  }

  public void setRepository(String repository) {
    this.repository = repository;
  }

  public DeploymentTemplate repositoryKeyUrl(String repositoryKeyUrl) {
    this.repositoryKeyUrl = repositoryKeyUrl;
    return this;
  }

   /**
   * Custom Cloudera Manager public GPG key
   * @return repositoryKeyUrl
  **/
  @ApiModelProperty(value = "Custom Cloudera Manager public GPG key")
  public String getRepositoryKeyUrl() {
    return repositoryKeyUrl;
  }

  public void setRepositoryKeyUrl(String repositoryKeyUrl) {
    this.repositoryKeyUrl = repositoryKeyUrl;
  }

  public DeploymentTemplate enableEnterpriseTrial(Boolean enableEnterpriseTrial) {
    this.enableEnterpriseTrial = enableEnterpriseTrial;
    return this;
  }

   /**
   * Whether to enable Cloudera Enterprise Trial
   * @return enableEnterpriseTrial
  **/
  @ApiModelProperty(value = "Whether to enable Cloudera Enterprise Trial")
  public Boolean isEnableEnterpriseTrial() {
    return enableEnterpriseTrial;
  }

  public void setEnableEnterpriseTrial(Boolean enableEnterpriseTrial) {
    this.enableEnterpriseTrial = enableEnterpriseTrial;
  }

  public DeploymentTemplate unlimitedJce(Boolean unlimitedJce) {
    this.unlimitedJce = unlimitedJce;
    return this;
  }

   /**
   * Whether to install unlimited strength JCE policy files
   * @return unlimitedJce
  **/
  @ApiModelProperty(value = "Whether to install unlimited strength JCE policy files")
  public Boolean isUnlimitedJce() {
    return unlimitedJce;
  }

  public void setUnlimitedJce(Boolean unlimitedJce) {
    this.unlimitedJce = unlimitedJce;
  }

  public DeploymentTemplate krbAdminUsername(String krbAdminUsername) {
    this.krbAdminUsername = krbAdminUsername;
    return this;
  }

   /**
   * Username for Kerberos administrative principal used by Cloudera Manager
   * @return krbAdminUsername
  **/
  @ApiModelProperty(value = "Username for Kerberos administrative principal used by Cloudera Manager")
  public String getKrbAdminUsername() {
    return krbAdminUsername;
  }

  public void setKrbAdminUsername(String krbAdminUsername) {
    this.krbAdminUsername = krbAdminUsername;
  }

  public DeploymentTemplate krbAdminPassword(String krbAdminPassword) {
    this.krbAdminPassword = krbAdminPassword;
    return this;
  }

   /**
   * Password for Kerberos administrative principal used by Cloudera Manager [redacted on read]
   * @return krbAdminPassword
  **/
  @ApiModelProperty(value = "Password for Kerberos administrative principal used by Cloudera Manager [redacted on read]")
  public String getKrbAdminPassword() {
    return krbAdminPassword;
  }

  public void setKrbAdminPassword(String krbAdminPassword) {
    this.krbAdminPassword = krbAdminPassword;
  }

  public DeploymentTemplate javaInstallationStrategy(JavaInstallationStrategyEnum javaInstallationStrategy) {
    this.javaInstallationStrategy = javaInstallationStrategy;
    return this;
  }

   /**
   * Cloudera Altus Director and Cloudera Manager&#39;s Java installation strategy
   * @return javaInstallationStrategy
  **/
  @ApiModelProperty(value = "Cloudera Altus Director and Cloudera Manager's Java installation strategy")
  public JavaInstallationStrategyEnum getJavaInstallationStrategy() {
    return javaInstallationStrategy;
  }

  public void setJavaInstallationStrategy(JavaInstallationStrategyEnum javaInstallationStrategy) {
    this.javaInstallationStrategy = javaInstallationStrategy;
  }

  public DeploymentTemplate license(String license) {
    this.license = license;
    return this;
  }

   /**
   * License for Cloudera Manager [redacted on read]
   * @return license
  **/
  @ApiModelProperty(value = "License for Cloudera Manager [redacted on read]")
  public String getLicense() {
    return license;
  }

  public void setLicense(String license) {
    this.license = license;
  }

  public DeploymentTemplate billingId(String billingId) {
    this.billingId = billingId;
    return this;
  }

   /**
   * Billing ID for usage-based billing [redacted on read]
   * @return billingId
  **/
  @ApiModelProperty(value = "Billing ID for usage-based billing [redacted on read]")
  public String getBillingId() {
    return billingId;
  }

  public void setBillingId(String billingId) {
    this.billingId = billingId;
  }

  public DeploymentTemplate postCreateScripts(List<Script> postCreateScripts) {
    this.postCreateScripts = postCreateScripts;
    return this;
  }

  public DeploymentTemplate addPostCreateScriptsItem(Script postCreateScriptsItem) {
    if (this.postCreateScripts == null) {
      this.postCreateScripts = new ArrayList<Script>();
    }
    this.postCreateScripts.add(postCreateScriptsItem);
    return this;
  }

   /**
   * A list of scripts to be run after deployment creation
   * @return postCreateScripts
  **/
  @ApiModelProperty(value = "A list of scripts to be run after deployment creation")
  public List<Script> getPostCreateScripts() {
    return postCreateScripts;
  }

  public void setPostCreateScripts(List<Script> postCreateScripts) {
    this.postCreateScripts = postCreateScripts;
  }

  public DeploymentTemplate csds(List<String> csds) {
    this.csds = csds;
    return this;
  }

  public DeploymentTemplate addCsdsItem(String csdsItem) {
    if (this.csds == null) {
      this.csds = new ArrayList<String>();
    }
    this.csds.add(csdsItem);
    return this;
  }

   /**
   * A list of CSD package URLs
   * @return csds
  **/
  @ApiModelProperty(value = "A list of CSD package URLs")
  public List<String> getCsds() {
    return csds;
  }

  public void setCsds(List<String> csds) {
    this.csds = csds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeploymentTemplate deploymentTemplate = (DeploymentTemplate) o;
    return Objects.equals(this.name, deploymentTemplate.name) &&
        Objects.equals(this.managerVirtualInstance, deploymentTemplate.managerVirtualInstance) &&
        Objects.equals(this.externalDatabaseTemplates, deploymentTemplate.externalDatabaseTemplates) &&
        Objects.equals(this.externalDatabases, deploymentTemplate.externalDatabases) &&
        Objects.equals(this.configs, deploymentTemplate.configs) &&
        Objects.equals(this.externalAccounts, deploymentTemplate.externalAccounts) &&
        Objects.equals(this.hostname, deploymentTemplate.hostname) &&
        Objects.equals(this.port, deploymentTemplate.port) &&
        Objects.equals(this.username, deploymentTemplate.username) &&
        Objects.equals(this.password, deploymentTemplate.password) &&
        Objects.equals(this.tlsEnabled, deploymentTemplate.tlsEnabled) &&
        Objects.equals(this.trustedCertificate, deploymentTemplate.trustedCertificate) &&
        Objects.equals(this.tlsConfigurationProperties, deploymentTemplate.tlsConfigurationProperties) &&
        Objects.equals(this.repository, deploymentTemplate.repository) &&
        Objects.equals(this.repositoryKeyUrl, deploymentTemplate.repositoryKeyUrl) &&
        Objects.equals(this.enableEnterpriseTrial, deploymentTemplate.enableEnterpriseTrial) &&
        Objects.equals(this.unlimitedJce, deploymentTemplate.unlimitedJce) &&
        Objects.equals(this.krbAdminUsername, deploymentTemplate.krbAdminUsername) &&
        Objects.equals(this.krbAdminPassword, deploymentTemplate.krbAdminPassword) &&
        Objects.equals(this.javaInstallationStrategy, deploymentTemplate.javaInstallationStrategy) &&
        Objects.equals(this.license, deploymentTemplate.license) &&
        Objects.equals(this.billingId, deploymentTemplate.billingId) &&
        Objects.equals(this.postCreateScripts, deploymentTemplate.postCreateScripts) &&
        Objects.equals(this.csds, deploymentTemplate.csds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, managerVirtualInstance, externalDatabaseTemplates, externalDatabases, configs, externalAccounts, hostname, port, username, password, tlsEnabled, trustedCertificate, tlsConfigurationProperties, repository, repositoryKeyUrl, enableEnterpriseTrial, unlimitedJce, krbAdminUsername, krbAdminPassword, javaInstallationStrategy, license, billingId, postCreateScripts, csds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeploymentTemplate {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    managerVirtualInstance: ").append(toIndentedString(managerVirtualInstance)).append("\n");
    sb.append("    externalDatabaseTemplates: ").append(toIndentedString(externalDatabaseTemplates)).append("\n");
    sb.append("    externalDatabases: ").append(toIndentedString(externalDatabases)).append("\n");
    sb.append("    configs: ").append(toIndentedString(configs)).append("\n");
    sb.append("    externalAccounts: ").append(toIndentedString(externalAccounts)).append("\n");
    sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    tlsEnabled: ").append(toIndentedString(tlsEnabled)).append("\n");
    sb.append("    trustedCertificate: ").append(toIndentedString(trustedCertificate)).append("\n");
    sb.append("    tlsConfigurationProperties: ").append(toIndentedString(tlsConfigurationProperties)).append("\n");
    sb.append("    repository: ").append(toIndentedString(repository)).append("\n");
    sb.append("    repositoryKeyUrl: ").append(toIndentedString(repositoryKeyUrl)).append("\n");
    sb.append("    enableEnterpriseTrial: ").append(toIndentedString(enableEnterpriseTrial)).append("\n");
    sb.append("    unlimitedJce: ").append(toIndentedString(unlimitedJce)).append("\n");
    sb.append("    krbAdminUsername: ").append(toIndentedString(krbAdminUsername)).append("\n");
    sb.append("    krbAdminPassword: ").append(toIndentedString(krbAdminPassword)).append("\n");
    sb.append("    javaInstallationStrategy: ").append(toIndentedString(javaInstallationStrategy)).append("\n");
    sb.append("    license: ").append(toIndentedString(license)).append("\n");
    sb.append("    billingId: ").append(toIndentedString(billingId)).append("\n");
    sb.append("    postCreateScripts: ").append(toIndentedString(postCreateScripts)).append("\n");
    sb.append("    csds: ").append(toIndentedString(csds)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

