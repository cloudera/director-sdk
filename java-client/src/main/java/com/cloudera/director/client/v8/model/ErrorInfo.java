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

package com.cloudera.director.client.v8.model;

import java.util.HashMap;
import java.util.Map;

public class ErrorInfo {
  /* Error code */
  private String errorCode;
  /* Error type */
  private String errorType;
  /* Properties */
  private Map<String, String> properties;
  /* Retryable */
  private Boolean retryable;
  public interface ErrorCode {
    String CLUSTER_DEPLOYMENT_IN_WRONG_STAGE = "CLUSTER_DEPLOYMENT_IN_WRONG_STAGE";
    String CLUSTER_DEPLOYMENT_FAIL = "CLUSTER_DEPLOYMENT_FAIL";
    String CLUSTER_GET_PARCEL_FAIL = "CLUSTER_GET_PARCEL_FAIL";
    String CLUSTER_MISSING_PRODUCT_PARCEL = "CLUSTER_MISSING_PRODUCT_PARCEL";
    String CLUSTER_PARCEL_VALIDATION_FAIL = "CLUSTER_PARCEL_VALIDATION_FAIL";
    String CLUSTER_UNSUPPORTED_UPDATE_STEP = "CLUSTER_UNSUPPORTED_UPDATE_STEP";
    String CLUSTER_RESTART_FAIL = "CLUSTER_RESTART_FAIL";
    String CM_AGENT_INSTALLATION_FAIL = "CM_AGENT_INSTALLATION_FAIL";
    String CM_BAD_REQUEST = "CM_BAD_REQUEST";
    String CM_CMD_FAIL = "CM_CMD_FAIL";
    String CM_ILLEGAL_API_VERSION = "CM_ILLEGAL_API_VERSION";
    String CM_ILLEGAL_ARGUMENT = "CM_ILLEGAL_ARGUMENT";
    String CM_REPO_EMPTY_URL = "CM_REPO_EMPTY_URL";
    String CM_REPO_MULTIPLE_URL = "CM_REPO_MULTIPLE_URL";
    String CM_UNAUTHORIZED_OPERATION = "CM_UNAUTHORIZED_OPERATION";
    String CM_UNSUPPORTED_OPERATION = "CM_UNSUPPORTED_OPERATION";
    String CM_UNSUPPORTED_SERVICE_VERSIONS = "CM_UNSUPPORTED_SERVICE_VERSIONS";
    String CM_REDEPLOY_CLIENT_CONFIGS_FAIL = "CM_REDEPLOY_CLIENT_CONFIGS_FAIL";
    String CM_IMPORT_KERBEROS_MISSING_PRINCIPAL = "CM_IMPORT_KERBEROS_MISSING_PRINCIPAL";
    String CM_IMPORT_KERBEROS_INCORRECT_PASSWORD = "CM_IMPORT_KERBEROS_INCORRECT_PASSWORD";
    String CM_SERVICE_HOST_NOT_FOUND = "CM_SERVICE_HOST_NOT_FOUND";
    String CM_SERVICE_READ_ERROR = "CM_SERVICE_READ_ERROR";
    String CM_SERVICE_WRONG_STATE_FOR_DELETION = "CM_SERVICE_WRONG_STATE_FOR_DELETION";
    String CM_SERVICE_DB_AND_TEMPLATE_MISSING = "CM_SERVICE_DB_AND_TEMPLATE_MISSING";
    String CM_FAIL_TRIGGER_FIRSTRUN = "CM_FAIL_TRIGGER_FIRSTRUN";
    String CM_FIRSTRUN_AUTH_FAIL = "CM_FIRSTRUN_AUTH_FAIL";
    String CM_FIRSTRUN_IO_ERROR = "CM_FIRSTRUN_IO_ERROR";
    String CM_FIRSTRUN_BAD_RESPONSE = "CM_FIRSTRUN_BAD_RESPONSE";
    String DB_SERVER_CREATION_FAIL = "DB_SERVER_CREATION_FAIL";
    String DB_SERVER_IN_FAILURE_STAGE = "DB_SERVER_IN_FAILURE_STAGE";
    String DB_SERVER_MISSING = "DB_SERVER_MISSING";
    String DB_SERVER_NOT_READY = "DB_SERVER_NOT_READY";
    String DB_SERVER_PROVIDER_RETRIEVAL_FAIL = "DB_SERVER_PROVIDER_RETRIEVAL_FAIL";
    String DB_SERVER_TEMPLATE_EXIST = "DB_SERVER_TEMPLATE_EXIST";
    String INSTANCE_DNS_MISCONFIGURED = "INSTANCE_DNS_MISCONFIGURED";
    String INSTANCE_MISSING_CAPABILITIES = "INSTANCE_MISSING_CAPABILITIES";
    String INSTANCE_MISSING_FQDN = "INSTANCE_MISSING_FQDN";
    String INSTANCE_NOT_FOUND = "INSTANCE_NOT_FOUND";
    String INSTANCE_SSH_CONNECTION_FAIL = "INSTANCE_SSH_CONNECTION_FAIL";
    String INSTANCE_ALLOCATION_TIME_OUT = "INSTANCE_ALLOCATION_TIME_OUT";
    String INSTANCE_ALLOCATION_ILLEGAL_ARGUMENT = "INSTANCE_ALLOCATION_ILLEGAL_ARGUMENT";
    String INSTANCE_ALLOCATION_ILLEGAL_STATE = "INSTANCE_ALLOCATION_ILLEGAL_STATE";
    String INSTANCE_ROOT_PARTITION_RESIZE_FAIL = "INSTANCE_ROOT_PARTITION_RESIZE_FAIL";
    String INSTANCE_TERMINATION_FAIL = "INSTANCE_TERMINATION_FAIL";
    String JOB_CANCELLATION_FAIL = "JOB_CANCELLATION_FAIL";
    String JOB_CANCELLATION_TIMEOUT = "JOB_CANCELLATION_TIMEOUT";
    String JOB_EXECUTION_FAIL = "JOB_EXECUTION_FAIL";
    String JOB_COMBINATION_INVALID_MAP_ENTRY = "JOB_COMBINATION_INVALID_MAP_ENTRY";
    String JOB_COMBINATION_DUPLICATE_ENTRIES = "JOB_COMBINATION_DUPLICATE_ENTRIES";
    String JOB_CREATION_FAIL = "JOB_CREATION_FAIL";
    String RUN_SCRIPT_FAIL = "RUN_SCRIPT_FAIL";
    String SSH_BACKGROUND_COMMAND_FAIL = "SSH_BACKGROUND_COMMAND_FAIL";
    String SSH_JOB_MISSING_BACKGROUND_PROCESS_STATE_FILE = "SSH_JOB_MISSING_BACKGROUND_PROCESS_STATE_FILE";
    String UNDEFINED = "UNDEFINED";
  }
  public interface ErrorType {
    String CLIENT = "CLIENT";
    String SERVICE = "SERVICE";
    String UNKNOWN = "UNKNOWN";
  }
  public ErrorInfo() { }

  private ErrorInfo(String errorCode, String errorType, Map<String, String> properties, Boolean retryable) {
    this.errorCode = errorCode;
    this.errorType = errorType;
    this.properties = properties;
    this.retryable = retryable;
  }

  private ErrorInfo(ErrorInfoBuilder builder) {
    this.errorCode = builder.errorCode;
    this.errorType = builder.errorType;
    this.properties = builder.properties;
    this.retryable = builder.retryable;
  }

  public static ErrorInfoBuilder builder() {
    return new ErrorInfoBuilder();
  }

  public static class ErrorInfoBuilder {
    private String errorCode = null;
    private String errorType = null;
    private Map<String, String> properties = new HashMap<String, String>();
    private Boolean retryable = null;

    public ErrorInfoBuilder errorCode(String errorCode) {
      this.errorCode = errorCode;
      return this;
    }

    public ErrorInfoBuilder errorType(String errorType) {
      this.errorType = errorType;
      return this;
    }

    public ErrorInfoBuilder properties(Map<String, String> properties) {
      this.properties = properties;
      return this;
    }

    public ErrorInfoBuilder retryable(Boolean retryable) {
      this.retryable = retryable;
      return this;
    }

    public ErrorInfo build() {
      return new ErrorInfo(this);
    }
  }

  public ErrorInfoBuilder toBuilder() {
    return builder()
      .errorCode(errorCode)
      .errorType(errorType)
      .properties(properties)
      .retryable(retryable)
      ;
  }
  public String getErrorCode() {
    return errorCode;
  }
  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }

  public String getErrorType() {
    return errorType;
  }
  public void setErrorType(String errorType) {
    this.errorType = errorType;
  }

  public Map<String, String> getProperties() {
    return properties;
  }
  public void setProperties(Map<String, String> properties) {
    this.properties = properties;
  }

  public Boolean getRetryable() {
    return retryable;
  }
  public void setRetryable(Boolean retryable) {
    this.retryable = retryable;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    ErrorInfo other = (ErrorInfo) o; // NOPMD

    if (errorCode != null ?
        !errorCode.equals(other.errorCode) :
        other.errorCode != null) return false;
    if (errorType != null ?
        !errorType.equals(other.errorType) :
        other.errorType != null) return false;
    if (properties != null ?
        !properties.equals(other.properties) :
        other.properties != null) return false;
    if (retryable != null ?
        !retryable.equals(other.retryable) :
        other.retryable != null) return false;
    return true;
  }

  @Override
  public int hashCode() {
    int result = 0;
    result = 31 * result + (errorCode != null ? errorCode.hashCode() : 0);
    result = 31 * result + (errorType != null ? errorType.hashCode() : 0);
    result = 31 * result + (properties != null ? properties.hashCode() : 0);
    result = 31 * result + (retryable != null ? retryable.hashCode() : 0);
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    String newLine = System.getProperty("line.separator");
    sb.append("class ErrorInfo {" + newLine);
    sb.append("  errorCode: ").append(errorCode).append(newLine);
    sb.append("  errorType: ").append(errorType).append(newLine);
    sb.append("  properties: ").append(properties).append(newLine);
    sb.append("  retryable: ").append(retryable).append(newLine);
    sb.append("}" + newLine);
    return sb.toString();
  }
}

