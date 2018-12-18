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


package com.cloudera.director.client.v6.model;

import java.util.Objects;
import com.cloudera.director.client.v6.model.Instance;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * A deployment (Cloudera Manager installation) running in a cloud provider
 */
@ApiModel(description = "A deployment (Cloudera Manager installation) running in a cloud provider")

public class Deployment {
  @SerializedName("name")
  private String name = null;
  @SerializedName("hostname")
  private String hostname = null;
  @SerializedName("port")
  private Integer port = null;
  @SerializedName("username")
  private String username = null;
  @SerializedName("password")
  private String password = null;
  @SerializedName("managerInstance")
  private Instance managerInstance = null;
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

  public Deployment() {
    // Do nothing
  }

  private Deployment(DeploymentBuilder builder) {
      this.name = builder.name;
      this.hostname = builder.hostname;
      this.port = builder.port;
      this.username = builder.username;
      this.password = builder.password;
      this.managerInstance = builder.managerInstance;
      this.repository = builder.repository;
      this.repositoryKeyUrl = builder.repositoryKeyUrl;
      this.enableEnterpriseTrial = builder.enableEnterpriseTrial;
      this.unlimitedJce = builder.unlimitedJce;
      this.krbAdminUsername = builder.krbAdminUsername;
      this.krbAdminPassword = builder.krbAdminPassword;
      this.javaInstallationStrategy = builder.javaInstallationStrategy;
    }

  public static DeploymentBuilder builder() {
    return new DeploymentBuilder();
  }

  public static class DeploymentBuilder {
      private String name = null;
      private String hostname = null;
      private Integer port = null;
      private String username = null;
      private String password = null;
      private Instance managerInstance = null;
      private String repository = null;
      private String repositoryKeyUrl = null;
      private Boolean enableEnterpriseTrial = null;
      private Boolean unlimitedJce = null;
      private String krbAdminUsername = null;
      private String krbAdminPassword = null;
      private JavaInstallationStrategyEnum javaInstallationStrategy = null;
  

    public DeploymentBuilder name(String name) {
      this.name = name;
      return this;
    }


    public DeploymentBuilder hostname(String hostname) {
      this.hostname = hostname;
      return this;
    }


    public DeploymentBuilder port(Integer port) {
      this.port = port;
      return this;
    }


    public DeploymentBuilder username(String username) {
      this.username = username;
      return this;
    }


    public DeploymentBuilder password(String password) {
      this.password = password;
      return this;
    }


    public DeploymentBuilder managerInstance(Instance managerInstance) {
      this.managerInstance = managerInstance;
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


    public DeploymentBuilder enableEnterpriseTrial(Boolean enableEnterpriseTrial) {
      this.enableEnterpriseTrial = enableEnterpriseTrial;
      return this;
    }


    public DeploymentBuilder unlimitedJce(Boolean unlimitedJce) {
      this.unlimitedJce = unlimitedJce;
      return this;
    }


    public DeploymentBuilder krbAdminUsername(String krbAdminUsername) {
      this.krbAdminUsername = krbAdminUsername;
      return this;
    }


    public DeploymentBuilder krbAdminPassword(String krbAdminPassword) {
      this.krbAdminPassword = krbAdminPassword;
      return this;
    }


    public DeploymentBuilder javaInstallationStrategy(JavaInstallationStrategyEnum javaInstallationStrategy) {
      this.javaInstallationStrategy = javaInstallationStrategy;
      return this;
    }


    public Deployment build() {
      return new Deployment(this);
    }
  }

  public DeploymentBuilder toBuilder() {
    return builder()
      .name(name)
            .hostname(hostname)
            .port(port)
            .username(username)
            .password(password)
            .managerInstance(managerInstance)
            .repository(repository)
            .repositoryKeyUrl(repositoryKeyUrl)
            .enableEnterpriseTrial(enableEnterpriseTrial)
            .unlimitedJce(unlimitedJce)
            .krbAdminUsername(krbAdminUsername)
            .krbAdminPassword(krbAdminPassword)
            .javaInstallationStrategy(javaInstallationStrategy)
      ;
  }

  public Deployment name(String name) {
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

  public Deployment hostname(String hostname) {
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

  public Deployment port(Integer port) {
    this.port = port;
    return this;
  }

   /**
   * API port for an existing Cloudera Manager installation
   * @return port
  **/
  @ApiModelProperty(value = "API port for an existing Cloudera Manager installation")
  public Integer getPort() {
    return port;
  }

  public void setPort(Integer port) {
    this.port = port;
  }

  public Deployment username(String username) {
    this.username = username;
    return this;
  }

   /**
   * Username for API access
   * @return username
  **/
  @ApiModelProperty(value = "Username for API access")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public Deployment password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Password for API access [redacted on read]
   * @return password
  **/
  @ApiModelProperty(value = "Password for API access [redacted on read]")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public Deployment managerInstance(Instance managerInstance) {
    this.managerInstance = managerInstance;
    return this;
  }

   /**
   * Instance where Cloudera Manager is installed
   * @return managerInstance
  **/
  @ApiModelProperty(value = "Instance where Cloudera Manager is installed")
  public Instance getManagerInstance() {
    return managerInstance;
  }

  public void setManagerInstance(Instance managerInstance) {
    this.managerInstance = managerInstance;
  }

  public Deployment repository(String repository) {
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

  public Deployment repositoryKeyUrl(String repositoryKeyUrl) {
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

  public Deployment enableEnterpriseTrial(Boolean enableEnterpriseTrial) {
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

  public Deployment unlimitedJce(Boolean unlimitedJce) {
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

  public Deployment krbAdminUsername(String krbAdminUsername) {
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

  public Deployment krbAdminPassword(String krbAdminPassword) {
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

  public Deployment javaInstallationStrategy(JavaInstallationStrategyEnum javaInstallationStrategy) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Deployment deployment = (Deployment) o;
    return Objects.equals(this.name, deployment.name) &&
        Objects.equals(this.hostname, deployment.hostname) &&
        Objects.equals(this.port, deployment.port) &&
        Objects.equals(this.username, deployment.username) &&
        Objects.equals(this.password, deployment.password) &&
        Objects.equals(this.managerInstance, deployment.managerInstance) &&
        Objects.equals(this.repository, deployment.repository) &&
        Objects.equals(this.repositoryKeyUrl, deployment.repositoryKeyUrl) &&
        Objects.equals(this.enableEnterpriseTrial, deployment.enableEnterpriseTrial) &&
        Objects.equals(this.unlimitedJce, deployment.unlimitedJce) &&
        Objects.equals(this.krbAdminUsername, deployment.krbAdminUsername) &&
        Objects.equals(this.krbAdminPassword, deployment.krbAdminPassword) &&
        Objects.equals(this.javaInstallationStrategy, deployment.javaInstallationStrategy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, hostname, port, username, password, managerInstance, repository, repositoryKeyUrl, enableEnterpriseTrial, unlimitedJce, krbAdminUsername, krbAdminPassword, javaInstallationStrategy);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Deployment {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    managerInstance: ").append(toIndentedString(managerInstance)).append("\n");
    sb.append("    repository: ").append(toIndentedString(repository)).append("\n");
    sb.append("    repositoryKeyUrl: ").append(toIndentedString(repositoryKeyUrl)).append("\n");
    sb.append("    enableEnterpriseTrial: ").append(toIndentedString(enableEnterpriseTrial)).append("\n");
    sb.append("    unlimitedJce: ").append(toIndentedString(unlimitedJce)).append("\n");
    sb.append("    krbAdminUsername: ").append(toIndentedString(krbAdminUsername)).append("\n");
    sb.append("    krbAdminPassword: ").append(toIndentedString(krbAdminPassword)).append("\n");
    sb.append("    javaInstallationStrategy: ").append(toIndentedString(javaInstallationStrategy)).append("\n");
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

