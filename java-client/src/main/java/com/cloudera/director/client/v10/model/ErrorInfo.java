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

package com.cloudera.director.client.v10.model;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ErrorInfo {
  /* Causes */
  private Set<ErrorInfo> causes;
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
    String CLUSTER_HOST_DECOMMISSION_FAIL = "CLUSTER_HOST_DECOMMISSION_FAIL";
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
    String CM_UNSUPPORTED_SERVICES_AND_VERSIONS = "CM_UNSUPPORTED_SERVICES_AND_VERSIONS";
    String CM_REDEPLOY_CLIENT_CONFIGS_FAIL = "CM_REDEPLOY_CLIENT_CONFIGS_FAIL";
    String CM_HOST_INSTALL_CANCELLATION_FAIL = "CM_HOST_INSTALL_CANCELLATION_FAIL";
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
    String CM_MISSING_PARCEL_PRODUCTS = "CM_MISSING_PARCEL_PRODUCTS";
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
    String INSTANCE_SSH_PORT_UNAVAILABLE = "INSTANCE_SSH_PORT_UNAVAILABLE";
    String INSTANCE_SSH_CONNECTION_FAIL = "INSTANCE_SSH_CONNECTION_FAIL";
    String INSTANCE_ALLOCATION_FAILURE = "INSTANCE_ALLOCATION_FAILURE";
    String INSTANCE_ALLOCATION_TIME_OUT = "INSTANCE_ALLOCATION_TIME_OUT";
    String INSTANCE_ALLOCATION_ILLEGAL_ARGUMENT = "INSTANCE_ALLOCATION_ILLEGAL_ARGUMENT";
    String INSTANCE_ALLOCATION_ILLEGAL_STATE = "INSTANCE_ALLOCATION_ILLEGAL_STATE";
    String INSTANCE_ROOT_PARTITION_RESIZE_FAIL = "INSTANCE_ROOT_PARTITION_RESIZE_FAIL";
    String INSTANCE_TERMINATION_FAIL = "INSTANCE_TERMINATION_FAIL";
    String NOT_PERSISTED = "NOT_PERSISTED";
    String JOB_CANCELLATION_FAIL = "JOB_CANCELLATION_FAIL";
    String JOB_CANCELLATION_TIMEOUT = "JOB_CANCELLATION_TIMEOUT";
    String JOB_EXECUTION_ILLEGAL_STATE = "JOB_EXECUTION_ILLEGAL_STATE";
    String JOB_EXECUTION_FAIL = "JOB_EXECUTION_FAIL";
    String JOB_COMBINATION_INVALID_MAP_ENTRY = "JOB_COMBINATION_INVALID_MAP_ENTRY";
    String JOB_COMBINATION_DUPLICATE_ENTRIES = "JOB_COMBINATION_DUPLICATE_ENTRIES";
    String JOB_CREATION_FAIL = "JOB_CREATION_FAIL";
    String RUN_SCRIPT_FAIL = "RUN_SCRIPT_FAIL";
    String SSH_BACKGROUND_COMMAND_FAIL = "SSH_BACKGROUND_COMMAND_FAIL";
    String SSH_JOB_MISSING_BACKGROUND_PROCESS_STATE_FILE = "SSH_JOB_MISSING_BACKGROUND_PROCESS_STATE_FILE";
    String SSH_HOST_KEY_RETRIEVAL_FAILED = "SSH_HOST_KEY_RETRIEVAL_FAILED";
    String INVALID_CLIENT_CONFIG_PROPERTY_NOT_FOUND = "INVALID_CLIENT_CONFIG_PROPERTY_NOT_FOUND";
    String INVALID_CLIENT_CONFIG_ILLEGAL_ARGUMENT = "INVALID_CLIENT_CONFIG_ILLEGAL_ARGUMENT";
    String MALFORMED_DEBIAN_URL = "MALFORMED_DEBIAN_URL";
    String INVALID_URL = "INVALID_URL";
    String UNSUCCESSFUL_RESPONSE_FROM_URL = "UNSUCCESSFUL_RESPONSE_FROM_URL";
    String MALFORMED_URL = "MALFORMED_URL";
    String UNABLE_TO_CONNECT_URL = "UNABLE_TO_CONNECT_URL";
    String NO_PARCEL_FOUND = "NO_PARCEL_FOUND";
    String NO_PARCEL_FOUND_WITH_VERSION = "NO_PARCEL_FOUND_WITH_VERSION";
    String MULTIPLE_PARCELS_FOUND = "MULTIPLE_PARCELS_FOUND";
    String DUPLICATE_SERVICE = "DUPLICATE_SERVICE";
    String UNSUPPORTED_PROVIDER_TYPE = "UNSUPPORTED_PROVIDER_TYPE";
    String INVALID_EXTERNAL_DATABASE_SERVERS = "INVALID_EXTERNAL_DATABASE_SERVERS";
    String INVALID_NAME = "INVALID_NAME";
    String NEED_BOTH_KRB_ADMIN_ITEMS = "NEED_BOTH_KRB_ADMIN_ITEMS";
    String NEED_KDC_TYPE = "NEED_KDC_TYPE";
    String MISSING_COMPONENT_DB_TEMPLATE = "MISSING_COMPONENT_DB_TEMPLATE";
    String MISSING_COMPONENT_DB = "MISSING_COMPONENT_DB";
    String EMPTY_BILLING_ID = "EMPTY_BILLING_ID";
    String CM_CONNECTION_FAIL = "CM_CONNECTION_FAIL";
    String HETEROGENEOUS_INSTANCE_TEMPLATES_IN_VIRTUAL_INSTANCE_GROUP = "HETEROGENEOUS_INSTANCE_TEMPLATES_IN_VIRTUAL_INSTANCE_GROUP";
    String SSH_UNREADABLE_OR_UNDECRYPTABLE_PRIVATE_KEY = "SSH_UNREADABLE_OR_UNDECRYPTABLE_PRIVATE_KEY";
    String SSH_UNSUPPORTED_PRIVATE_KEY = "SSH_UNSUPPORTED_PRIVATE_KEY";
    String SSH_MISSING_PASSPHRASE = "SSH_MISSING_PASSPHRASE";
    String INVALID_LICENSE_BILLING_ID = "INVALID_LICENSE_BILLING_ID";
    String SCRIPT_NO_INSTANCES_AVAILABLE = "SCRIPT_NO_INSTANCES_AVAILABLE";
    String SCRIPT_NON_ZERO_EXIT_CODE = "SCRIPT_NON_ZERO_EXIT_CODE";
    String POLICY_FILE_INSTALLATION_FAIL = "POLICY_FILE_INSTALLATION_FAIL";
    String CERTIFICATE_PARSE_FAILURE = "CERTIFICATE_PARSE_FAILURE";
    String CA_NAME_TOO_LONG = "CA_NAME_TOO_LONG";
    String TLS_CERTMANAGER_ABSENT = "TLS_CERTMANAGER_ABSENT";
    String CM_HOST_ID_NOT_FOUND = "CM_HOST_ID_NOT_FOUND";
    String CERTIFICATE_PROHIBITED_FOR_AUTO_TLS = "CERTIFICATE_PROHIBITED_FOR_AUTO_TLS";
    String UNDEFINED = "UNDEFINED";
  }
  public interface ErrorType {
    String CLIENT = "CLIENT";
    String SERVICE = "SERVICE";
    String UNKNOWN = "UNKNOWN";
  }
  public ErrorInfo() { }

  private ErrorInfo(Set<ErrorInfo> causes, String errorCode, String errorType, Map<String, String> properties, Boolean retryable) {
    this.causes = causes;
    this.errorCode = errorCode;
    this.errorType = errorType;
    this.properties = properties;
    this.retryable = retryable;
  }

  private ErrorInfo(ErrorInfoBuilder builder) {
    this.causes = builder.causes;
    this.errorCode = builder.errorCode;
    this.errorType = builder.errorType;
    this.properties = builder.properties;
    this.retryable = builder.retryable;
  }

  public static ErrorInfoBuilder builder() {
    return new ErrorInfoBuilder();
  }

  public static class ErrorInfoBuilder {
    private Set<ErrorInfo> causes = null;
    private String errorCode = null;
    private String errorType = null;
    private Map<String, String> properties = new HashMap<String, String>();
    private Boolean retryable = null;

    public ErrorInfoBuilder causes(Set<ErrorInfo> causes) {
      this.causes = causes;
      return this;
    }

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
      .causes(causes)
      .errorCode(errorCode)
      .errorType(errorType)
      .properties(properties)
      .retryable(retryable)
      ;
  }
  public Set<ErrorInfo> getCauses() {
    return causes;
  }
  public void setCauses(Set<ErrorInfo> causes) {
    this.causes = causes;
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

    if (causes != null ?
        !causes.equals(other.causes) :
        other.causes != null) return false;
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
    result = 31 * result + (causes != null ? causes.hashCode() : 0);
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
    sb.append("  causes: ").append(causes).append(newLine);
    sb.append("  errorCode: ").append(errorCode).append(newLine);
    sb.append("  errorType: ").append(errorType).append(newLine);
    sb.append("  properties: ").append(properties).append(newLine);
    sb.append("  retryable: ").append(retryable).append(newLine);
    sb.append("}" + newLine);
    return sb.toString();
  }
}

