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


package com.cloudera.director.client.latest.model;

import java.util.Objects;
import com.cloudera.director.client.latest.model.ErrorInfo;
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
 * Error information
 */
@ApiModel(description = "Error information")

public class ErrorInfo {
  /**
   * Error code
   */
  @JsonAdapter(ErrorCodeEnum.Adapter.class)
  public enum ErrorCodeEnum {
    CLUSTER_DEPLOYMENT_IN_WRONG_STAGE("CLUSTER_DEPLOYMENT_IN_WRONG_STAGE"),
    
    CLUSTER_DEPLOYMENT_FAIL("CLUSTER_DEPLOYMENT_FAIL"),
    
    CLUSTER_GET_PARCEL_FAIL("CLUSTER_GET_PARCEL_FAIL"),
    
    CLUSTER_HOST_DECOMMISSION_FAIL("CLUSTER_HOST_DECOMMISSION_FAIL"),
    
    CLUSTER_MISSING_PRODUCT_PARCEL("CLUSTER_MISSING_PRODUCT_PARCEL"),
    
    CLUSTER_PARCEL_VALIDATION_FAIL("CLUSTER_PARCEL_VALIDATION_FAIL"),
    
    CLUSTER_UNSUPPORTED_UPDATE_STEP("CLUSTER_UNSUPPORTED_UPDATE_STEP"),
    
    DB_SERVER_CREATION_FAIL("DB_SERVER_CREATION_FAIL"),
    
    DB_SERVER_IN_FAILURE_STAGE("DB_SERVER_IN_FAILURE_STAGE"),
    
    INSTANCE_DNS_MISCONFIGURED("INSTANCE_DNS_MISCONFIGURED"),
    
    INSTANCE_MISSING_CAPABILITIES("INSTANCE_MISSING_CAPABILITIES"),
    
    INSTANCE_MISSING_FQDN("INSTANCE_MISSING_FQDN"),
    
    INSTANCE_NOT_FOUND("INSTANCE_NOT_FOUND"),
    
    JOB_CANCELLATION_FAIL("JOB_CANCELLATION_FAIL"),
    
    JOB_CANCELLATION_TIMEOUT("JOB_CANCELLATION_TIMEOUT"),
    
    INVALID_CLIENT_CONFIG_PROPERTY_NOT_FOUND("INVALID_CLIENT_CONFIG_PROPERTY_NOT_FOUND"),
    
    INVALID_CLIENT_CONFIG_ILLEGAL_ARGUMENT("INVALID_CLIENT_CONFIG_ILLEGAL_ARGUMENT"),
    
    SERVICE_NOT_FOUND("SERVICE_NOT_FOUND"),
    
    ROLE_NOT_FOUND("ROLE_NOT_FOUND"),
    
    CLUSTER_RESTART_FAIL("CLUSTER_RESTART_FAIL"),
    
    CM_AGENT_INSTALLATION_FAIL("CM_AGENT_INSTALLATION_FAIL"),
    
    CM_BAD_REQUEST("CM_BAD_REQUEST"),
    
    CM_CMD_FAIL("CM_CMD_FAIL"),
    
    CM_HOST_INSTALL_CANCELLATION_FAIL("CM_HOST_INSTALL_CANCELLATION_FAIL"),
    
    CM_HOST_ID_NOT_FOUND("CM_HOST_ID_NOT_FOUND"),
    
    CM_ILLEGAL_API_VERSION("CM_ILLEGAL_API_VERSION"),
    
    CM_ILLEGAL_ARGUMENT("CM_ILLEGAL_ARGUMENT"),
    
    CM_REPO_EMPTY_URL("CM_REPO_EMPTY_URL"),
    
    CM_REPO_MULTIPLE_URL("CM_REPO_MULTIPLE_URL"),
    
    CM_UNAUTHORIZED_OPERATION("CM_UNAUTHORIZED_OPERATION"),
    
    CM_UNSUPPORTED_OPERATION("CM_UNSUPPORTED_OPERATION"),
    
    CM_UNSUPPORTED_SERVICES_AND_VERSIONS("CM_UNSUPPORTED_SERVICES_AND_VERSIONS"),
    
    CM_REDEPLOY_CLIENT_CONFIGS_FAIL("CM_REDEPLOY_CLIENT_CONFIGS_FAIL"),
    
    CM_IMPORT_KERBEROS_MISSING_PRINCIPAL("CM_IMPORT_KERBEROS_MISSING_PRINCIPAL"),
    
    CM_IMPORT_KERBEROS_INCORRECT_PASSWORD("CM_IMPORT_KERBEROS_INCORRECT_PASSWORD"),
    
    CM_SERVICE_HOST_NOT_FOUND("CM_SERVICE_HOST_NOT_FOUND"),
    
    CM_SERVICE_READ_ERROR("CM_SERVICE_READ_ERROR"),
    
    CM_SERVICE_WRONG_STATE_FOR_DELETION("CM_SERVICE_WRONG_STATE_FOR_DELETION"),
    
    CM_SERVICE_DB_AND_TEMPLATE_MISSING("CM_SERVICE_DB_AND_TEMPLATE_MISSING"),
    
    CM_FAIL_TRIGGER_FIRSTRUN("CM_FAIL_TRIGGER_FIRSTRUN"),
    
    CM_FAILED_TO_START("CM_FAILED_TO_START"),
    
    CM_FIRSTRUN_AUTH_FAIL("CM_FIRSTRUN_AUTH_FAIL"),
    
    CM_FIRSTRUN_IO_ERROR("CM_FIRSTRUN_IO_ERROR"),
    
    CM_FIRSTRUN_BAD_RESPONSE("CM_FIRSTRUN_BAD_RESPONSE"),
    
    CM_MISSING_PARCEL_PRODUCTS("CM_MISSING_PARCEL_PRODUCTS"),
    
    DB_SERVER_MISSING("DB_SERVER_MISSING"),
    
    DB_SERVER_NOT_READY("DB_SERVER_NOT_READY"),
    
    DB_SERVER_PROVIDER_RETRIEVAL_FAIL("DB_SERVER_PROVIDER_RETRIEVAL_FAIL"),
    
    DB_SERVER_TEMPLATE_EXIST("DB_SERVER_TEMPLATE_EXIST"),
    
    INSTANCE_SSH_PORT_UNAVAILABLE("INSTANCE_SSH_PORT_UNAVAILABLE"),
    
    INSTANCE_SSH_CONNECTION_FAIL("INSTANCE_SSH_CONNECTION_FAIL"),
    
    INSTANCE_ALLOCATION_FAILURE("INSTANCE_ALLOCATION_FAILURE"),
    
    INSTANCE_ALLOCATION_TIME_OUT("INSTANCE_ALLOCATION_TIME_OUT"),
    
    INSTANCE_ALLOCATION_ILLEGAL_ARGUMENT("INSTANCE_ALLOCATION_ILLEGAL_ARGUMENT"),
    
    INSTANCE_ALLOCATION_ILLEGAL_STATE("INSTANCE_ALLOCATION_ILLEGAL_STATE"),
    
    INSTANCE_ROOT_PARTITION_RESIZE_FAIL("INSTANCE_ROOT_PARTITION_RESIZE_FAIL"),
    
    NO_PARCEL_FOUND("NO_PARCEL_FOUND"),
    
    NO_PARCEL_FOUND_WITH_VERSION("NO_PARCEL_FOUND_WITH_VERSION"),
    
    MULTIPLE_PARCELS_FOUND("MULTIPLE_PARCELS_FOUND"),
    
    DUPLICATE_SERVICE("DUPLICATE_SERVICE"),
    
    UNSUPPORTED_PROVIDER_TYPE("UNSUPPORTED_PROVIDER_TYPE"),
    
    INVALID_EXTERNAL_DATABASE_SERVERS("INVALID_EXTERNAL_DATABASE_SERVERS"),
    
    INVALID_NAME("INVALID_NAME"),
    
    NEED_BOTH_KRB_ADMIN_ITEMS("NEED_BOTH_KRB_ADMIN_ITEMS"),
    
    NEED_KDC_TYPE("NEED_KDC_TYPE"),
    
    MISSING_COMPONENT_DB_TEMPLATE("MISSING_COMPONENT_DB_TEMPLATE"),
    
    MISSING_COMPONENT_DB("MISSING_COMPONENT_DB"),
    
    EMPTY_BILLING_ID("EMPTY_BILLING_ID"),
    
    CM_INVALID_LICENSE("CM_INVALID_LICENSE"),
    
    HETEROGENEOUS_INSTANCE_TEMPLATES_IN_VIRTUAL_INSTANCE_GROUP("HETEROGENEOUS_INSTANCE_TEMPLATES_IN_VIRTUAL_INSTANCE_GROUP"),
    
    CM_CONNECTION_FAIL("CM_CONNECTION_FAIL"),
    
    SCRIPT_NO_INSTANCES_AVAILABLE("SCRIPT_NO_INSTANCES_AVAILABLE"),
    
    SCRIPT_NON_ZERO_EXIT_CODE("SCRIPT_NON_ZERO_EXIT_CODE"),
    
    POLICY_FILE_INSTALLATION_FAIL("POLICY_FILE_INSTALLATION_FAIL"),
    
    CERTIFICATE_PARSE_FAILURE("CERTIFICATE_PARSE_FAILURE"),
    
    CA_NAME_TOO_LONG("CA_NAME_TOO_LONG"),
    
    TLS_CERTMANAGER_ABSENT("TLS_CERTMANAGER_ABSENT"),
    
    CERTIFICATE_PROHIBITED_FOR_AUTO_TLS("CERTIFICATE_PROHIBITED_FOR_AUTO_TLS"),
    
    SSH_HOST_KEY_RETRIEVAL_FAILED("SSH_HOST_KEY_RETRIEVAL_FAILED"),
    
    CM_HOST_FQDN_MISSING("CM_HOST_FQDN_MISSING"),
    
    INSTANCE_TERMINATION_FAIL("INSTANCE_TERMINATION_FAIL"),
    
    INVALID_URL("INVALID_URL"),
    
    MALFORMED_DEBIAN_URL("MALFORMED_DEBIAN_URL"),
    
    MALFORMED_URL("MALFORMED_URL"),
    
    UNABLE_TO_CONNECT_URL("UNABLE_TO_CONNECT_URL"),
    
    UNSUCCESSFUL_RESPONSE_FROM_URL("UNSUCCESSFUL_RESPONSE_FROM_URL"),
    
    SSH_UNREADABLE_OR_UNDECRYPTABLE_PRIVATE_KEY("SSH_UNREADABLE_OR_UNDECRYPTABLE_PRIVATE_KEY"),
    
    SSH_UNSUPPORTED_PRIVATE_KEY("SSH_UNSUPPORTED_PRIVATE_KEY"),
    
    SSH_MISSING_PASSPHRASE("SSH_MISSING_PASSPHRASE"),
    
    NOT_PERSISTED("NOT_PERSISTED"),
    
    JOB_EXECUTION_ILLEGAL_STATE("JOB_EXECUTION_ILLEGAL_STATE"),
    
    JOB_EXECUTION_FAIL("JOB_EXECUTION_FAIL"),
    
    JOB_COMBINATION_INVALID_MAP_ENTRY("JOB_COMBINATION_INVALID_MAP_ENTRY"),
    
    JOB_COMBINATION_DUPLICATE_ENTRIES("JOB_COMBINATION_DUPLICATE_ENTRIES"),
    
    JOB_CREATION_FAIL("JOB_CREATION_FAIL"),
    
    RUN_SCRIPT_FAIL("RUN_SCRIPT_FAIL"),
    
    SSH_BACKGROUND_COMMAND_FAIL("SSH_BACKGROUND_COMMAND_FAIL"),
    
    SSH_JOB_MISSING_BACKGROUND_PROCESS_STATE_FILE("SSH_JOB_MISSING_BACKGROUND_PROCESS_STATE_FILE"),
    
    PROVIDER_ERROR("PROVIDER_ERROR"),
    
    PROVIDER_ERROR_MULTIPLE("PROVIDER_ERROR_MULTIPLE"),
    
    INVALID_LICENSE_BILLING_ID("INVALID_LICENSE_BILLING_ID"),
    
    WORKFLOW_FAILED("WORKFLOW_FAILED"),
    
    SCRIPT_NOT_FOUND("SCRIPT_NOT_FOUND"),
    
    SHELL_COMMAND_FAILED("SHELL_COMMAND_FAILED"),
    
    UNDEFINED("UNDEFINED");

    private String value;

    ErrorCodeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ErrorCodeEnum fromValue(String text) {
      for (ErrorCodeEnum b : ErrorCodeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ErrorCodeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ErrorCodeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ErrorCodeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ErrorCodeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("errorCode")
  private ErrorCodeEnum errorCode = null;
  /**
   * Error type
   */
  @JsonAdapter(ErrorTypeEnum.Adapter.class)
  public enum ErrorTypeEnum {
    CLIENT("CLIENT"),
    
    SERVICE("SERVICE"),
    
    UNKNOWN("UNKNOWN");

    private String value;

    ErrorTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ErrorTypeEnum fromValue(String text) {
      for (ErrorTypeEnum b : ErrorTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ErrorTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ErrorTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ErrorTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ErrorTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("errorType")
  private ErrorTypeEnum errorType = null;
  @SerializedName("properties")
  private Map<String, String> properties = new HashMap<String, String>();
  @SerializedName("retryable")
  private Boolean retryable = null;
  @SerializedName("causes")
  private List<ErrorInfo> causes = new ArrayList<ErrorInfo>();

  public ErrorInfo() {
    // Do nothing
  }

  private ErrorInfo(ErrorInfoBuilder builder) {
      this.errorCode = builder.errorCode;
      this.errorType = builder.errorType;
      this.properties = builder.properties;
      this.retryable = builder.retryable;
      this.causes = builder.causes;
    }

  public static ErrorInfoBuilder builder() {
    return new ErrorInfoBuilder();
  }

  public static class ErrorInfoBuilder {
      private ErrorCodeEnum errorCode = null;
      private ErrorTypeEnum errorType = null;
      private Map<String, String> properties = new HashMap<String, String>();
      private Boolean retryable = null;
      private List<ErrorInfo> causes = new ArrayList<ErrorInfo>();
  

    public ErrorInfoBuilder errorCode(ErrorCodeEnum errorCode) {
      this.errorCode = errorCode;
      return this;
    }


    public ErrorInfoBuilder errorType(ErrorTypeEnum errorType) {
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


    public ErrorInfoBuilder causes(List<ErrorInfo> causes) {
      this.causes = causes;
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
            .causes(causes)
      ;
  }

  public ErrorInfo errorCode(ErrorCodeEnum errorCode) {
    this.errorCode = errorCode;
    return this;
  }

   /**
   * Error code
   * @return errorCode
  **/
  @ApiModelProperty(required = true, value = "Error code")
  public ErrorCodeEnum getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(ErrorCodeEnum errorCode) {
    this.errorCode = errorCode;
  }

  public ErrorInfo errorType(ErrorTypeEnum errorType) {
    this.errorType = errorType;
    return this;
  }

   /**
   * Error type
   * @return errorType
  **/
  @ApiModelProperty(required = true, value = "Error type")
  public ErrorTypeEnum getErrorType() {
    return errorType;
  }

  public void setErrorType(ErrorTypeEnum errorType) {
    this.errorType = errorType;
  }

  public ErrorInfo properties(Map<String, String> properties) {
    this.properties = properties;
    return this;
  }

  public ErrorInfo putPropertiesItem(String key, String propertiesItem) {
    this.properties.put(key, propertiesItem);
    return this;
  }

   /**
   * Properties associated with the error
   * @return properties
  **/
  @ApiModelProperty(required = true, value = "Properties associated with the error")
  public Map<String, String> getProperties() {
    return properties;
  }

  public void setProperties(Map<String, String> properties) {
    this.properties = properties;
  }

  public ErrorInfo retryable(Boolean retryable) {
    this.retryable = retryable;
    return this;
  }

   /**
   * Whether the operation that produced this error is retryable
   * @return retryable
  **/
  @ApiModelProperty(required = true, value = "Whether the operation that produced this error is retryable")
  public Boolean isRetryable() {
    return retryable;
  }

  public void setRetryable(Boolean retryable) {
    this.retryable = retryable;
  }

  public ErrorInfo causes(List<ErrorInfo> causes) {
    this.causes = causes;
    return this;
  }

  public ErrorInfo addCausesItem(ErrorInfo causesItem) {
    this.causes.add(causesItem);
    return this;
  }

   /**
   * Causes of the error, if any
   * @return causes
  **/
  @ApiModelProperty(required = true, value = "Causes of the error, if any")
  public List<ErrorInfo> getCauses() {
    return causes;
  }

  public void setCauses(List<ErrorInfo> causes) {
    this.causes = causes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorInfo errorInfo = (ErrorInfo) o;
    return Objects.equals(this.errorCode, errorInfo.errorCode) &&
        Objects.equals(this.errorType, errorInfo.errorType) &&
        Objects.equals(this.properties, errorInfo.properties) &&
        Objects.equals(this.retryable, errorInfo.retryable) &&
        Objects.equals(this.causes, errorInfo.causes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorCode, errorType, properties, retryable, causes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorInfo {\n");
    
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    errorType: ").append(toIndentedString(errorType)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    retryable: ").append(toIndentedString(retryable)).append("\n");
    sb.append("    causes: ").append(toIndentedString(causes)).append("\n");
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

