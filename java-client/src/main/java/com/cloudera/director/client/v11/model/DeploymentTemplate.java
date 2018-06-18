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

// Note: This file is auto generated. Do not edit manually.

package com.cloudera.director.client.v11.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DeploymentTemplate {
  /* BillingId for Cloudera Manager [redacted on read] */
  private String billingId;
  /* Optional configurations for Cloudera Manager and its management services */
  private Map<String, Map<String, String>> configs;
  /* A list of CSD package URLs */
  private List<String> csds;
  /* Whether to enable Cloudera Enterprise Trial */
  private Boolean enableEnterpriseTrial;
  /* External account definitions */
  private Map<String, ExternalAccount> externalAccounts;
  /* External database template definitions */
  private Map<String, ExternalDatabaseTemplate> externalDatabaseTemplates;
  /* External database definitions */
  private Map<String, ExternalDatabase> externalDatabases;
  /* Hostname for existing Cloudera Manager installation */
  private String hostname;
  /* Cloudera Director and Cloudera Manager's Java installation strategy */
  private String javaInstallationStrategy;
  /* Password for Kerberos administrative principal used by Cloudera Manager [redacted on read] */
  private String krbAdminPassword;
  /* Username for Kerberos administrative principal used by Cloudera Manager */
  private String krbAdminUsername;
  /* License for Cloudera Manager [redacted on read] */
  private String license;
  /* Instance definition for a Cloudera Manager instance created from scratch */
  private VirtualInstance managerVirtualInstance;
  /* Deployment name */
  private String name;
  /* Web UI and API password [redacted on read] */
  private String password;
  /* Port for existing Cloudera Manager installation */
  private Integer port;
  /* A list of scripts to be run after deployment creation */
  private List<String> postCreateScripts;
  /* Custom Cloudera Manager repository URL */
  private String repository;
  /* Custom Cloudera Manager public GPG key */
  private String repositoryKeyUrl;
  /* TLS configuration properties */
  private Map<String, String> tlsConfigurationProperties;
  /* Whether to enable TLS */
  private Boolean tlsEnabled;
  /* Trusted certificate for the Cloudera Manager server */
  private String trustedCertificate;
  /* Whether to install unlimited strength JCE policy files */
  private Boolean unlimitedJce;
  /* Web UI and API username */
  private String username;
  public interface JavaInstallationStrategy {
    String AUTO = "AUTO";
    String NONE = "NONE";
    String DIRECTOR_MANAGED = "DIRECTOR_MANAGED";
  }
  public DeploymentTemplate() { }

  private DeploymentTemplate(String billingId, Map<String, Map<String, String>> configs, List<String> csds, Boolean enableEnterpriseTrial, Map<String, ExternalAccount> externalAccounts, Map<String, ExternalDatabaseTemplate> externalDatabaseTemplates, Map<String, ExternalDatabase> externalDatabases, String hostname, String javaInstallationStrategy, String krbAdminPassword, String krbAdminUsername, String license, VirtualInstance managerVirtualInstance, String name, String password, Integer port, List<String> postCreateScripts, String repository, String repositoryKeyUrl, Map<String, String> tlsConfigurationProperties, Boolean tlsEnabled, String trustedCertificate, Boolean unlimitedJce, String username) {
    this.billingId = billingId;
    this.configs = configs;
    this.csds = csds;
    this.enableEnterpriseTrial = enableEnterpriseTrial;
    this.externalAccounts = externalAccounts;
    this.externalDatabaseTemplates = externalDatabaseTemplates;
    this.externalDatabases = externalDatabases;
    this.hostname = hostname;
    this.javaInstallationStrategy = javaInstallationStrategy;
    this.krbAdminPassword = krbAdminPassword;
    this.krbAdminUsername = krbAdminUsername;
    this.license = license;
    this.managerVirtualInstance = managerVirtualInstance;
    this.name = name;
    this.password = password;
    this.port = port;
    this.postCreateScripts = postCreateScripts;
    this.repository = repository;
    this.repositoryKeyUrl = repositoryKeyUrl;
    this.tlsConfigurationProperties = tlsConfigurationProperties;
    this.tlsEnabled = tlsEnabled;
    this.trustedCertificate = trustedCertificate;
    this.unlimitedJce = unlimitedJce;
    this.username = username;
  }

  private DeploymentTemplate(DeploymentTemplateBuilder builder) {
    this.billingId = builder.billingId;
    this.configs = builder.configs;
    this.csds = builder.csds;
    this.enableEnterpriseTrial = builder.enableEnterpriseTrial;
    this.externalAccounts = builder.externalAccounts;
    this.externalDatabaseTemplates = builder.externalDatabaseTemplates;
    this.externalDatabases = builder.externalDatabases;
    this.hostname = builder.hostname;
    this.javaInstallationStrategy = builder.javaInstallationStrategy;
    this.krbAdminPassword = builder.krbAdminPassword;
    this.krbAdminUsername = builder.krbAdminUsername;
    this.license = builder.license;
    this.managerVirtualInstance = builder.managerVirtualInstance;
    this.name = builder.name;
    this.password = builder.password;
    this.port = builder.port;
    this.postCreateScripts = builder.postCreateScripts;
    this.repository = builder.repository;
    this.repositoryKeyUrl = builder.repositoryKeyUrl;
    this.tlsConfigurationProperties = builder.tlsConfigurationProperties;
    this.tlsEnabled = builder.tlsEnabled;
    this.trustedCertificate = builder.trustedCertificate;
    this.unlimitedJce = builder.unlimitedJce;
    this.username = builder.username;
  }

  public static DeploymentTemplateBuilder builder() {
    return new DeploymentTemplateBuilder();
  }

  public static class DeploymentTemplateBuilder {
    private String billingId = null;
    private Map<String, Map<String, String>> configs = new HashMap<String, Map<String, String>>();
    private List<String> csds = new ArrayList<String>();
    private Boolean enableEnterpriseTrial = null;
    private Map<String, ExternalAccount> externalAccounts = new HashMap<String, ExternalAccount>();
    private Map<String, ExternalDatabaseTemplate> externalDatabaseTemplates = new HashMap<String, ExternalDatabaseTemplate>();
    private Map<String, ExternalDatabase> externalDatabases = new HashMap<String, ExternalDatabase>();
    private String hostname = null;
    private String javaInstallationStrategy = null;
    private String krbAdminPassword = null;
    private String krbAdminUsername = null;
    private String license = null;
    private VirtualInstance managerVirtualInstance = null;
    private String name = null;
    private String password = null;
    private Integer port = null;
    private List<String> postCreateScripts = new ArrayList<String>();
    private String repository = null;
    private String repositoryKeyUrl = null;
    private Map<String, String> tlsConfigurationProperties = new HashMap<String, String>();
    private Boolean tlsEnabled = null;
    private String trustedCertificate = null;
    private Boolean unlimitedJce = null;
    private String username = null;

    public DeploymentTemplateBuilder billingId(String billingId) {
      this.billingId = billingId;
      return this;
    }

    public DeploymentTemplateBuilder configs(Map<String, Map<String, String>> configs) {
      this.configs = configs;
      return this;
    }

    public DeploymentTemplateBuilder csds(List<String> csds) {
      this.csds = csds;
      return this;
    }

    public DeploymentTemplateBuilder enableEnterpriseTrial(Boolean enableEnterpriseTrial) {
      this.enableEnterpriseTrial = enableEnterpriseTrial;
      return this;
    }

    public DeploymentTemplateBuilder externalAccounts(Map<String, ExternalAccount> externalAccounts) {
      this.externalAccounts = externalAccounts;
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

    public DeploymentTemplateBuilder hostname(String hostname) {
      this.hostname = hostname;
      return this;
    }

    public DeploymentTemplateBuilder javaInstallationStrategy(String javaInstallationStrategy) {
      this.javaInstallationStrategy = javaInstallationStrategy;
      return this;
    }

    public DeploymentTemplateBuilder krbAdminPassword(String krbAdminPassword) {
      this.krbAdminPassword = krbAdminPassword;
      return this;
    }

    public DeploymentTemplateBuilder krbAdminUsername(String krbAdminUsername) {
      this.krbAdminUsername = krbAdminUsername;
      return this;
    }

    public DeploymentTemplateBuilder license(String license) {
      this.license = license;
      return this;
    }

    public DeploymentTemplateBuilder managerVirtualInstance(VirtualInstance managerVirtualInstance) {
      this.managerVirtualInstance = managerVirtualInstance;
      return this;
    }

    public DeploymentTemplateBuilder name(String name) {
      this.name = name;
      return this;
    }

    public DeploymentTemplateBuilder password(String password) {
      this.password = password;
      return this;
    }

    public DeploymentTemplateBuilder port(Integer port) {
      this.port = port;
      return this;
    }

    public DeploymentTemplateBuilder postCreateScripts(List<String> postCreateScripts) {
      this.postCreateScripts = postCreateScripts;
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

    public DeploymentTemplateBuilder tlsConfigurationProperties(Map<String, String> tlsConfigurationProperties) {
      this.tlsConfigurationProperties = tlsConfigurationProperties;
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

    public DeploymentTemplateBuilder unlimitedJce(Boolean unlimitedJce) {
      this.unlimitedJce = unlimitedJce;
      return this;
    }

    public DeploymentTemplateBuilder username(String username) {
      this.username = username;
      return this;
    }

    public DeploymentTemplate build() {
      return new DeploymentTemplate(this);
    }
  }

  public DeploymentTemplateBuilder toBuilder() {
    return builder()
      .billingId(billingId)
      .configs(configs)
      .csds(csds)
      .enableEnterpriseTrial(enableEnterpriseTrial)
      .externalAccounts(externalAccounts)
      .externalDatabaseTemplates(externalDatabaseTemplates)
      .externalDatabases(externalDatabases)
      .hostname(hostname)
      .javaInstallationStrategy(javaInstallationStrategy)
      .krbAdminPassword(krbAdminPassword)
      .krbAdminUsername(krbAdminUsername)
      .license(license)
      .managerVirtualInstance(managerVirtualInstance)
      .name(name)
      .password(password)
      .port(port)
      .postCreateScripts(postCreateScripts)
      .repository(repository)
      .repositoryKeyUrl(repositoryKeyUrl)
      .tlsConfigurationProperties(tlsConfigurationProperties)
      .tlsEnabled(tlsEnabled)
      .trustedCertificate(trustedCertificate)
      .unlimitedJce(unlimitedJce)
      .username(username)
      ;
  }
  public String getBillingId() {
    return billingId;
  }
  public void setBillingId(String billingId) {
    this.billingId = billingId;
  }

  public Map<String, Map<String, String>> getConfigs() {
    return configs;
  }
  public void setConfigs(Map<String, Map<String, String>> configs) {
    this.configs = configs;
  }

  public List<String> getCsds() {
    return csds;
  }
  public void setCsds(List<String> csds) {
    this.csds = csds;
  }

  public Boolean getEnableEnterpriseTrial() {
    return enableEnterpriseTrial;
  }
  public void setEnableEnterpriseTrial(Boolean enableEnterpriseTrial) {
    this.enableEnterpriseTrial = enableEnterpriseTrial;
  }

  public Map<String, ExternalAccount> getExternalAccounts() {
    return externalAccounts;
  }
  public void setExternalAccounts(Map<String, ExternalAccount> externalAccounts) {
    this.externalAccounts = externalAccounts;
  }

  public Map<String, ExternalDatabaseTemplate> getExternalDatabaseTemplates() {
    return externalDatabaseTemplates;
  }
  public void setExternalDatabaseTemplates(Map<String, ExternalDatabaseTemplate> externalDatabaseTemplates) {
    this.externalDatabaseTemplates = externalDatabaseTemplates;
  }

  public Map<String, ExternalDatabase> getExternalDatabases() {
    return externalDatabases;
  }
  public void setExternalDatabases(Map<String, ExternalDatabase> externalDatabases) {
    this.externalDatabases = externalDatabases;
  }

  public String getHostname() {
    return hostname;
  }
  public void setHostname(String hostname) {
    this.hostname = hostname;
  }

  public String getJavaInstallationStrategy() {
    return javaInstallationStrategy;
  }
  public void setJavaInstallationStrategy(String javaInstallationStrategy) {
    this.javaInstallationStrategy = javaInstallationStrategy;
  }

  public String getKrbAdminPassword() {
    return krbAdminPassword;
  }
  public void setKrbAdminPassword(String krbAdminPassword) {
    this.krbAdminPassword = krbAdminPassword;
  }

  public String getKrbAdminUsername() {
    return krbAdminUsername;
  }
  public void setKrbAdminUsername(String krbAdminUsername) {
    this.krbAdminUsername = krbAdminUsername;
  }

  public String getLicense() {
    return license;
  }
  public void setLicense(String license) {
    this.license = license;
  }

  public VirtualInstance getManagerVirtualInstance() {
    return managerVirtualInstance;
  }
  public void setManagerVirtualInstance(VirtualInstance managerVirtualInstance) {
    this.managerVirtualInstance = managerVirtualInstance;
  }

  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }

  public Integer getPort() {
    return port;
  }
  public void setPort(Integer port) {
    this.port = port;
  }

  public List<String> getPostCreateScripts() {
    return postCreateScripts;
  }
  public void setPostCreateScripts(List<String> postCreateScripts) {
    this.postCreateScripts = postCreateScripts;
  }

  public String getRepository() {
    return repository;
  }
  public void setRepository(String repository) {
    this.repository = repository;
  }

  public String getRepositoryKeyUrl() {
    return repositoryKeyUrl;
  }
  public void setRepositoryKeyUrl(String repositoryKeyUrl) {
    this.repositoryKeyUrl = repositoryKeyUrl;
  }

  public Map<String, String> getTlsConfigurationProperties() {
    return tlsConfigurationProperties;
  }
  public void setTlsConfigurationProperties(Map<String, String> tlsConfigurationProperties) {
    this.tlsConfigurationProperties = tlsConfigurationProperties;
  }

  public Boolean getTlsEnabled() {
    return tlsEnabled;
  }
  public void setTlsEnabled(Boolean tlsEnabled) {
    this.tlsEnabled = tlsEnabled;
  }

  public String getTrustedCertificate() {
    return trustedCertificate;
  }
  public void setTrustedCertificate(String trustedCertificate) {
    this.trustedCertificate = trustedCertificate;
  }

  public Boolean getUnlimitedJce() {
    return unlimitedJce;
  }
  public void setUnlimitedJce(Boolean unlimitedJce) {
    this.unlimitedJce = unlimitedJce;
  }

  public String getUsername() {
    return username;
  }
  public void setUsername(String username) {
    this.username = username;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    DeploymentTemplate other = (DeploymentTemplate) o; // NOPMD

    if (configs != null ?
        !configs.equals(other.configs) :
        other.configs != null) return false;
    if (csds != null ?
        !csds.equals(other.csds) :
        other.csds != null) return false;
    if (enableEnterpriseTrial != null ?
        !enableEnterpriseTrial.equals(other.enableEnterpriseTrial) :
        other.enableEnterpriseTrial != null) return false;
    if (externalAccounts != null ?
        !externalAccounts.equals(other.externalAccounts) :
        other.externalAccounts != null) return false;
    if (externalDatabaseTemplates != null ?
        !externalDatabaseTemplates.equals(other.externalDatabaseTemplates) :
        other.externalDatabaseTemplates != null) return false;
    if (externalDatabases != null ?
        !externalDatabases.equals(other.externalDatabases) :
        other.externalDatabases != null) return false;
    if (hostname != null ?
        !hostname.equals(other.hostname) :
        other.hostname != null) return false;
    if (javaInstallationStrategy != null ?
        !javaInstallationStrategy.equals(other.javaInstallationStrategy) :
        other.javaInstallationStrategy != null) return false;
    if (krbAdminUsername != null ?
        !krbAdminUsername.equals(other.krbAdminUsername) :
        other.krbAdminUsername != null) return false;
    if (managerVirtualInstance != null ?
        !managerVirtualInstance.equals(other.managerVirtualInstance) :
        other.managerVirtualInstance != null) return false;
    if (name != null ?
        !name.equals(other.name) :
        other.name != null) return false;
    if (port != null ?
        !port.equals(other.port) :
        other.port != null) return false;
    if (postCreateScripts != null ?
        !postCreateScripts.equals(other.postCreateScripts) :
        other.postCreateScripts != null) return false;
    if (repository != null ?
        !repository.equals(other.repository) :
        other.repository != null) return false;
    if (repositoryKeyUrl != null ?
        !repositoryKeyUrl.equals(other.repositoryKeyUrl) :
        other.repositoryKeyUrl != null) return false;
    if (tlsConfigurationProperties != null ?
        !tlsConfigurationProperties.equals(other.tlsConfigurationProperties) :
        other.tlsConfigurationProperties != null) return false;
    if (tlsEnabled != null ?
        !tlsEnabled.equals(other.tlsEnabled) :
        other.tlsEnabled != null) return false;
    if (trustedCertificate != null ?
        !trustedCertificate.equals(other.trustedCertificate) :
        other.trustedCertificate != null) return false;
    if (unlimitedJce != null ?
        !unlimitedJce.equals(other.unlimitedJce) :
        other.unlimitedJce != null) return false;
    if (username != null ?
        !username.equals(other.username) :
        other.username != null) return false;
    return true;
  }

  @Override
  public int hashCode() {
    int result = 0;
    result = 31 * result + (configs != null ? configs.hashCode() : 0);
    result = 31 * result + (csds != null ? csds.hashCode() : 0);
    result = 31 * result + (enableEnterpriseTrial != null ? enableEnterpriseTrial.hashCode() : 0);
    result = 31 * result + (externalAccounts != null ? externalAccounts.hashCode() : 0);
    result = 31 * result + (externalDatabaseTemplates != null ? externalDatabaseTemplates.hashCode() : 0);
    result = 31 * result + (externalDatabases != null ? externalDatabases.hashCode() : 0);
    result = 31 * result + (hostname != null ? hostname.hashCode() : 0);
    result = 31 * result + (javaInstallationStrategy != null ? javaInstallationStrategy.hashCode() : 0);
    result = 31 * result + (krbAdminUsername != null ? krbAdminUsername.hashCode() : 0);
    result = 31 * result + (managerVirtualInstance != null ? managerVirtualInstance.hashCode() : 0);
    result = 31 * result + (name != null ? name.hashCode() : 0);
    result = 31 * result + (port != null ? port.hashCode() : 0);
    result = 31 * result + (postCreateScripts != null ? postCreateScripts.hashCode() : 0);
    result = 31 * result + (repository != null ? repository.hashCode() : 0);
    result = 31 * result + (repositoryKeyUrl != null ? repositoryKeyUrl.hashCode() : 0);
    result = 31 * result + (tlsConfigurationProperties != null ? tlsConfigurationProperties.hashCode() : 0);
    result = 31 * result + (tlsEnabled != null ? tlsEnabled.hashCode() : 0);
    result = 31 * result + (trustedCertificate != null ? trustedCertificate.hashCode() : 0);
    result = 31 * result + (unlimitedJce != null ? unlimitedJce.hashCode() : 0);
    result = 31 * result + (username != null ? username.hashCode() : 0);
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    String newLine = System.getProperty("line.separator");
    sb.append("class DeploymentTemplate {" + newLine);
    sb.append("  billingId: ").append("REDACTED").append(newLine);
    sb.append("  configs: ").append(configs).append(newLine);
    sb.append("  csds: ").append(csds).append(newLine);
    sb.append("  enableEnterpriseTrial: ").append(enableEnterpriseTrial).append(newLine);
    sb.append("  externalAccounts: ").append(externalAccounts).append(newLine);
    sb.append("  externalDatabaseTemplates: ").append(externalDatabaseTemplates).append(newLine);
    sb.append("  externalDatabases: ").append(externalDatabases).append(newLine);
    sb.append("  hostname: ").append(hostname).append(newLine);
    sb.append("  javaInstallationStrategy: ").append(javaInstallationStrategy).append(newLine);
    sb.append("  krbAdminPassword: ").append("REDACTED").append(newLine);
    sb.append("  krbAdminUsername: ").append(krbAdminUsername).append(newLine);
    sb.append("  license: ").append("REDACTED").append(newLine);
    sb.append("  managerVirtualInstance: ").append(managerVirtualInstance).append(newLine);
    sb.append("  name: ").append(name).append(newLine);
    sb.append("  password: ").append("REDACTED").append(newLine);
    sb.append("  port: ").append(port).append(newLine);
    sb.append("  postCreateScripts: ").append(postCreateScripts).append(newLine);
    sb.append("  repository: ").append(repository).append(newLine);
    sb.append("  repositoryKeyUrl: ").append(repositoryKeyUrl).append(newLine);
    sb.append("  tlsConfigurationProperties: ").append(tlsConfigurationProperties).append(newLine);
    sb.append("  tlsEnabled: ").append(tlsEnabled).append(newLine);
    sb.append("  trustedCertificate: ").append(trustedCertificate).append(newLine);
    sb.append("  unlimitedJce: ").append(unlimitedJce).append(newLine);
    sb.append("  username: ").append(username).append(newLine);
    sb.append("}" + newLine);
    return sb.toString();
  }
}

