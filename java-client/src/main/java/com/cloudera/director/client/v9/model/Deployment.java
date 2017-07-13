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

package com.cloudera.director.client.v9.model;


public class Deployment {
  /* Cloudera Manager Version */
  private String cmVersion;
  /* Whether to enable Cloudera Enterprise Trial */
  private Boolean enableEnterpriseTrial;
  /* Hostname for existing Cloudera Manager installation */
  private String hostname;
  /* Cloudera Director and Cloudera Manager's Java installation strategy */
  private String javaInstallationStrategy;
  /* Password for Kerberos administrative principal used by Cloudera Manager [redacted on read] */
  private String krbAdminPassword;
  /* Username for Kerberos administrative principal used by Cloudera Manager */
  private String krbAdminUsername;
  private Instance managerInstance;
  /* Deployment name */
  private String name;
  /* Password for API access [redacted on read] */
  private String password;
  /* API port for an existing Cloudera Manager installation */
  private Integer port;
  /* Custom Cloudera Manager repository URL */
  private String repository;
  /* Custom Cloudera Manager public GPG key */
  private String repositoryKeyUrl;
  /* Whether to install unlimited strength JCE policy files */
  private Boolean unlimitedJce;
  /* Username for API access */
  private String username;
  public interface JavaInstallationStrategy {
    String AUTO = "AUTO";
    String NONE = "NONE";
  }
  public Deployment() { }

  private Deployment(String cmVersion, Boolean enableEnterpriseTrial, String hostname, String javaInstallationStrategy, String krbAdminPassword, String krbAdminUsername, Instance managerInstance, String name, String password, Integer port, String repository, String repositoryKeyUrl, Boolean unlimitedJce, String username) {
    this.cmVersion = cmVersion;
    this.enableEnterpriseTrial = enableEnterpriseTrial;
    this.hostname = hostname;
    this.javaInstallationStrategy = javaInstallationStrategy;
    this.krbAdminPassword = krbAdminPassword;
    this.krbAdminUsername = krbAdminUsername;
    this.managerInstance = managerInstance;
    this.name = name;
    this.password = password;
    this.port = port;
    this.repository = repository;
    this.repositoryKeyUrl = repositoryKeyUrl;
    this.unlimitedJce = unlimitedJce;
    this.username = username;
  }

  private Deployment(DeploymentBuilder builder) {
    this.cmVersion = builder.cmVersion;
    this.enableEnterpriseTrial = builder.enableEnterpriseTrial;
    this.hostname = builder.hostname;
    this.javaInstallationStrategy = builder.javaInstallationStrategy;
    this.krbAdminPassword = builder.krbAdminPassword;
    this.krbAdminUsername = builder.krbAdminUsername;
    this.managerInstance = builder.managerInstance;
    this.name = builder.name;
    this.password = builder.password;
    this.port = builder.port;
    this.repository = builder.repository;
    this.repositoryKeyUrl = builder.repositoryKeyUrl;
    this.unlimitedJce = builder.unlimitedJce;
    this.username = builder.username;
  }

  public static DeploymentBuilder builder() {
    return new DeploymentBuilder();
  }

  public static class DeploymentBuilder {
    private String cmVersion = null;
    private Boolean enableEnterpriseTrial = null;
    private String hostname = null;
    private String javaInstallationStrategy = null;
    private String krbAdminPassword = null;
    private String krbAdminUsername = null;
    private Instance managerInstance = null;
    private String name = null;
    private String password = null;
    private Integer port = null;
    private String repository = null;
    private String repositoryKeyUrl = null;
    private Boolean unlimitedJce = null;
    private String username = null;

    public DeploymentBuilder cmVersion(String cmVersion) {
      this.cmVersion = cmVersion;
      return this;
    }

    public DeploymentBuilder enableEnterpriseTrial(Boolean enableEnterpriseTrial) {
      this.enableEnterpriseTrial = enableEnterpriseTrial;
      return this;
    }

    public DeploymentBuilder hostname(String hostname) {
      this.hostname = hostname;
      return this;
    }

    public DeploymentBuilder javaInstallationStrategy(String javaInstallationStrategy) {
      this.javaInstallationStrategy = javaInstallationStrategy;
      return this;
    }

    public DeploymentBuilder krbAdminPassword(String krbAdminPassword) {
      this.krbAdminPassword = krbAdminPassword;
      return this;
    }

    public DeploymentBuilder krbAdminUsername(String krbAdminUsername) {
      this.krbAdminUsername = krbAdminUsername;
      return this;
    }

    public DeploymentBuilder managerInstance(Instance managerInstance) {
      this.managerInstance = managerInstance;
      return this;
    }

    public DeploymentBuilder name(String name) {
      this.name = name;
      return this;
    }

    public DeploymentBuilder password(String password) {
      this.password = password;
      return this;
    }

    public DeploymentBuilder port(Integer port) {
      this.port = port;
      return this;
    }

    public DeploymentBuilder repository(String repository) {
      this.repository = repository;
      return this;
    }

    public DeploymentBuilder repositoryKeyUrl(String repositoryKeyUrl) {
      this.repositoryKeyUrl = repositoryKeyUrl;
      return this;
    }

    public DeploymentBuilder unlimitedJce(Boolean unlimitedJce) {
      this.unlimitedJce = unlimitedJce;
      return this;
    }

    public DeploymentBuilder username(String username) {
      this.username = username;
      return this;
    }

    public Deployment build() {
      return new Deployment(this);
    }
  }

  public DeploymentBuilder toBuilder() {
    return builder()
      .cmVersion(cmVersion)
      .enableEnterpriseTrial(enableEnterpriseTrial)
      .hostname(hostname)
      .javaInstallationStrategy(javaInstallationStrategy)
      .krbAdminPassword(krbAdminPassword)
      .krbAdminUsername(krbAdminUsername)
      .managerInstance(managerInstance)
      .name(name)
      .password(password)
      .port(port)
      .repository(repository)
      .repositoryKeyUrl(repositoryKeyUrl)
      .unlimitedJce(unlimitedJce)
      .username(username)
      ;
  }
  public String getCmVersion() {
    return cmVersion;
  }
  public void setCmVersion(String cmVersion) {
    this.cmVersion = cmVersion;
  }

  public Boolean getEnableEnterpriseTrial() {
    return enableEnterpriseTrial;
  }
  public void setEnableEnterpriseTrial(Boolean enableEnterpriseTrial) {
    this.enableEnterpriseTrial = enableEnterpriseTrial;
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

  public Instance getManagerInstance() {
    return managerInstance;
  }
  public void setManagerInstance(Instance managerInstance) {
    this.managerInstance = managerInstance;
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

    Deployment other = (Deployment) o; // NOPMD

    if (cmVersion != null ?
        !cmVersion.equals(other.cmVersion) :
        other.cmVersion != null) return false;
    if (enableEnterpriseTrial != null ?
        !enableEnterpriseTrial.equals(other.enableEnterpriseTrial) :
        other.enableEnterpriseTrial != null) return false;
    if (hostname != null ?
        !hostname.equals(other.hostname) :
        other.hostname != null) return false;
    if (javaInstallationStrategy != null ?
        !javaInstallationStrategy.equals(other.javaInstallationStrategy) :
        other.javaInstallationStrategy != null) return false;
    if (krbAdminUsername != null ?
        !krbAdminUsername.equals(other.krbAdminUsername) :
        other.krbAdminUsername != null) return false;
    if (managerInstance != null ?
        !managerInstance.equals(other.managerInstance) :
        other.managerInstance != null) return false;
    if (name != null ?
        !name.equals(other.name) :
        other.name != null) return false;
    if (port != null ?
        !port.equals(other.port) :
        other.port != null) return false;
    if (repository != null ?
        !repository.equals(other.repository) :
        other.repository != null) return false;
    if (repositoryKeyUrl != null ?
        !repositoryKeyUrl.equals(other.repositoryKeyUrl) :
        other.repositoryKeyUrl != null) return false;
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
    result = 31 * result + (cmVersion != null ? cmVersion.hashCode() : 0);
    result = 31 * result + (enableEnterpriseTrial != null ? enableEnterpriseTrial.hashCode() : 0);
    result = 31 * result + (hostname != null ? hostname.hashCode() : 0);
    result = 31 * result + (javaInstallationStrategy != null ? javaInstallationStrategy.hashCode() : 0);
    result = 31 * result + (krbAdminUsername != null ? krbAdminUsername.hashCode() : 0);
    result = 31 * result + (managerInstance != null ? managerInstance.hashCode() : 0);
    result = 31 * result + (name != null ? name.hashCode() : 0);
    result = 31 * result + (port != null ? port.hashCode() : 0);
    result = 31 * result + (repository != null ? repository.hashCode() : 0);
    result = 31 * result + (repositoryKeyUrl != null ? repositoryKeyUrl.hashCode() : 0);
    result = 31 * result + (unlimitedJce != null ? unlimitedJce.hashCode() : 0);
    result = 31 * result + (username != null ? username.hashCode() : 0);
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    String newLine = System.getProperty("line.separator");
    sb.append("class Deployment {" + newLine);
    sb.append("  cmVersion: ").append(cmVersion).append(newLine);
    sb.append("  enableEnterpriseTrial: ").append(enableEnterpriseTrial).append(newLine);
    sb.append("  hostname: ").append(hostname).append(newLine);
    sb.append("  javaInstallationStrategy: ").append(javaInstallationStrategy).append(newLine);
    sb.append("  krbAdminPassword: ").append("REDACTED").append(newLine);
    sb.append("  krbAdminUsername: ").append(krbAdminUsername).append(newLine);
    sb.append("  managerInstance: ").append(managerInstance).append(newLine);
    sb.append("  name: ").append(name).append(newLine);
    sb.append("  password: ").append("REDACTED").append(newLine);
    sb.append("  port: ").append(port).append(newLine);
    sb.append("  repository: ").append(repository).append(newLine);
    sb.append("  repositoryKeyUrl: ").append(repositoryKeyUrl).append(newLine);
    sb.append("  unlimitedJce: ").append(unlimitedJce).append(newLine);
    sb.append("  username: ").append(username).append(newLine);
    sb.append("}" + newLine);
    return sb.toString();
  }
}

