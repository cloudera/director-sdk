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

package com.cloudera.director.client.v2.model;


public class SshCredentials {
  /*  */
  private String bastionHost;
  /* SSH server host key fingerprint */
  private String hostKeyFingerprint;
  /* Optional private key passphrase [redacted on read] */
  private String passphrase;
  /* Optional SSH password [redacted on read] */
  private String password;
  /* SSH server port */
  private Integer port;
  /* Optional SSH PKCS8 private key [redacted on read] */
  private String privateKey;
  /* SSH user */
  private String username;
  public SshCredentials() { }

  private SshCredentials(String bastionHost, String hostKeyFingerprint, String passphrase, String password, Integer port, String privateKey, String username) {
    this.bastionHost = bastionHost;
    this.hostKeyFingerprint = hostKeyFingerprint;
    this.passphrase = passphrase;
    this.password = password;
    this.port = port;
    this.privateKey = privateKey;
    this.username = username;
  }

  private SshCredentials(SshCredentialsBuilder builder) {
    this.bastionHost = builder.bastionHost;
    this.hostKeyFingerprint = builder.hostKeyFingerprint;
    this.passphrase = builder.passphrase;
    this.password = builder.password;
    this.port = builder.port;
    this.privateKey = builder.privateKey;
    this.username = builder.username;
  }

  public static SshCredentialsBuilder builder() {
    return new SshCredentialsBuilder();
  }

  public static class SshCredentialsBuilder {
    private String bastionHost = null;
    private String hostKeyFingerprint = null;
    private String passphrase = null;
    private String password = null;
    private Integer port = null;
    private String privateKey = null;
    private String username = null;

    public SshCredentialsBuilder bastionHost(String bastionHost) {
      this.bastionHost = bastionHost;
      return this;
    }

    public SshCredentialsBuilder hostKeyFingerprint(String hostKeyFingerprint) {
      this.hostKeyFingerprint = hostKeyFingerprint;
      return this;
    }

    public SshCredentialsBuilder passphrase(String passphrase) {
      this.passphrase = passphrase;
      return this;
    }

    public SshCredentialsBuilder password(String password) {
      this.password = password;
      return this;
    }

    public SshCredentialsBuilder port(Integer port) {
      this.port = port;
      return this;
    }

    public SshCredentialsBuilder privateKey(String privateKey) {
      this.privateKey = privateKey;
      return this;
    }

    public SshCredentialsBuilder username(String username) {
      this.username = username;
      return this;
    }

    public SshCredentials build() {
      return new SshCredentials(this);
    }
  }

  public SshCredentialsBuilder toBuilder() {
    return builder()
      .bastionHost(bastionHost)
      .hostKeyFingerprint(hostKeyFingerprint)
      .passphrase(passphrase)
      .password(password)
      .port(port)
      .privateKey(privateKey)
      .username(username)
      ;
  }
  public String getBastionHost() {
    return bastionHost;
  }
  public void setBastionHost(String bastionHost) {
    this.bastionHost = bastionHost;
  }

  public String getHostKeyFingerprint() {
    return hostKeyFingerprint;
  }
  public void setHostKeyFingerprint(String hostKeyFingerprint) {
    this.hostKeyFingerprint = hostKeyFingerprint;
  }

  public String getPassphrase() {
    return passphrase;
  }
  public void setPassphrase(String passphrase) {
    this.passphrase = passphrase;
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

  public String getPrivateKey() {
    return privateKey;
  }
  public void setPrivateKey(String privateKey) {
    this.privateKey = privateKey;
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

    SshCredentials other = (SshCredentials) o; // NOPMD

    if (bastionHost != null ?
        !bastionHost.equals(other.bastionHost) :
        other.bastionHost != null) return false;
    if (hostKeyFingerprint != null ?
        !hostKeyFingerprint.equals(other.hostKeyFingerprint) :
        other.hostKeyFingerprint != null) return false;
    if (port != null ?
        !port.equals(other.port) :
        other.port != null) return false;
    if (username != null ?
        !username.equals(other.username) :
        other.username != null) return false;
    return true;
  }

  @Override
  public int hashCode() {
    int result = 0;
    result = 31 * result + (bastionHost != null ? bastionHost.hashCode() : 0);
    result = 31 * result + (hostKeyFingerprint != null ? hostKeyFingerprint.hashCode() : 0);
    result = 31 * result + (port != null ? port.hashCode() : 0);
    result = 31 * result + (username != null ? username.hashCode() : 0);
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    String newLine = System.getProperty("line.separator");
    sb.append("class SshCredentials {" + newLine);
    sb.append("  bastionHost: ").append(bastionHost).append(newLine);
    sb.append("  hostKeyFingerprint: ").append(hostKeyFingerprint).append(newLine);
    sb.append("  passphrase: ").append("REDACTED").append(newLine);
    sb.append("  password: ").append("REDACTED").append(newLine);
    sb.append("  port: ").append(port).append(newLine);
    sb.append("  privateKey: ").append("REDACTED").append(newLine);
    sb.append("  username: ").append(username).append(newLine);
    sb.append("}" + newLine);
    return sb.toString();
  }
}

