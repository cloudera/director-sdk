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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * SshCredentials
 */

public class SshCredentials {
  @SerializedName("username")
  private String username = null;
  @SerializedName("password")
  private String password = null;
  @SerializedName("privateKey")
  private String privateKey = null;
  @SerializedName("passphrase")
  private String passphrase = null;
  @SerializedName("port")
  private Integer port = null;
  @SerializedName("hostKeyFingerprint")
  private String hostKeyFingerprint = null;

  public SshCredentials() {
    // Do nothing
  }

  private SshCredentials(SshCredentialsBuilder builder) {
      this.username = builder.username;
      this.password = builder.password;
      this.privateKey = builder.privateKey;
      this.passphrase = builder.passphrase;
      this.port = builder.port;
      this.hostKeyFingerprint = builder.hostKeyFingerprint;
    }

  public static SshCredentialsBuilder builder() {
    return new SshCredentialsBuilder();
  }

  public static class SshCredentialsBuilder {
      private String username = null;
      private String password = null;
      private String privateKey = null;
      private String passphrase = null;
      private Integer port = null;
      private String hostKeyFingerprint = null;
  

    public SshCredentialsBuilder username(String username) {
      this.username = username;
      return this;
    }


    public SshCredentialsBuilder password(String password) {
      this.password = password;
      return this;
    }


    public SshCredentialsBuilder privateKey(String privateKey) {
      this.privateKey = privateKey;
      return this;
    }


    public SshCredentialsBuilder passphrase(String passphrase) {
      this.passphrase = passphrase;
      return this;
    }


    public SshCredentialsBuilder port(Integer port) {
      this.port = port;
      return this;
    }


    public SshCredentialsBuilder hostKeyFingerprint(String hostKeyFingerprint) {
      this.hostKeyFingerprint = hostKeyFingerprint;
      return this;
    }


    public SshCredentials build() {
      return new SshCredentials(this);
    }
  }

  public SshCredentialsBuilder toBuilder() {
    return builder()
      .username(username)
            .password(password)
            .privateKey(privateKey)
            .passphrase(passphrase)
            .port(port)
            .hostKeyFingerprint(hostKeyFingerprint)
      ;
  }

  public SshCredentials username(String username) {
    this.username = username;
    return this;
  }

   /**
   * SSH user
   * @return username
  **/
  @ApiModelProperty(required = true, value = "SSH user")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public SshCredentials password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Optional SSH password [redacted on read]
   * @return password
  **/
  @ApiModelProperty(value = "Optional SSH password [redacted on read]")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public SshCredentials privateKey(String privateKey) {
    this.privateKey = privateKey;
    return this;
  }

   /**
   * Optional SSH PKCS8 private key [redacted on read]
   * @return privateKey
  **/
  @ApiModelProperty(value = "Optional SSH PKCS8 private key [redacted on read]")
  public String getPrivateKey() {
    return privateKey;
  }

  public void setPrivateKey(String privateKey) {
    this.privateKey = privateKey;
  }

  public SshCredentials passphrase(String passphrase) {
    this.passphrase = passphrase;
    return this;
  }

   /**
   * Optional private key passphrase [redacted on read]
   * @return passphrase
  **/
  @ApiModelProperty(value = "Optional private key passphrase [redacted on read]")
  public String getPassphrase() {
    return passphrase;
  }

  public void setPassphrase(String passphrase) {
    this.passphrase = passphrase;
  }

  public SshCredentials port(Integer port) {
    this.port = port;
    return this;
  }

   /**
   * SSH server port
   * @return port
  **/
  @ApiModelProperty(required = true, value = "SSH server port")
  public Integer getPort() {
    return port;
  }

  public void setPort(Integer port) {
    this.port = port;
  }

  public SshCredentials hostKeyFingerprint(String hostKeyFingerprint) {
    this.hostKeyFingerprint = hostKeyFingerprint;
    return this;
  }

   /**
   * SSH server host key fingerprint
   * @return hostKeyFingerprint
  **/
  @ApiModelProperty(value = "SSH server host key fingerprint")
  public String getHostKeyFingerprint() {
    return hostKeyFingerprint;
  }

  public void setHostKeyFingerprint(String hostKeyFingerprint) {
    this.hostKeyFingerprint = hostKeyFingerprint;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SshCredentials sshCredentials = (SshCredentials) o;
    return Objects.equals(this.username, sshCredentials.username) &&
        Objects.equals(this.password, sshCredentials.password) &&
        Objects.equals(this.privateKey, sshCredentials.privateKey) &&
        Objects.equals(this.passphrase, sshCredentials.passphrase) &&
        Objects.equals(this.port, sshCredentials.port) &&
        Objects.equals(this.hostKeyFingerprint, sshCredentials.hostKeyFingerprint);
  }

  @Override
  public int hashCode() {
    return Objects.hash(username, password, privateKey, passphrase, port, hostKeyFingerprint);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SshCredentials {\n");
    
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    privateKey: ").append(toIndentedString(privateKey)).append("\n");
    sb.append("    passphrase: ").append(toIndentedString(passphrase)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    hostKeyFingerprint: ").append(toIndentedString(hostKeyFingerprint)).append("\n");
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

