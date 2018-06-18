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

/**
 * Wordnik.com's Swagger generic API client. This client handles the client-
 * server communication, and is invariant across implementations. Specifics of
 * the methods and models for each application are generated from the Swagger
 * templates.
 */

// Note: This file is auto generated. Do not edit manually.

package com.cloudera.director.client.common;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON_TYPE;
import static javax.ws.rs.core.MediaType.TEXT_PLAIN_TYPE;

import com.fasterxml.jackson.databind.JavaType;

import com.google.json.JsonSanitizer;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource.Builder;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.api.client.filter.HTTPBasicAuthFilter;
import com.sun.jersey.api.client.filter.LoggingFilter;
import com.sun.jersey.client.urlconnection.HTTPSProperties;
import com.sun.jersey.multipart.FormDataMultiPart;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.ws.rs.core.Cookie;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.NewCookie;
import javax.ws.rs.core.Response.Status.Family;

public class ApiClient {

  private static final MediaType APPLICATION_HOCON_TYPE = new MediaType("application", "hocon");
  private static final MediaType[] ACCEPTED_MEDIA_TYPES =
    {APPLICATION_JSON_TYPE, APPLICATION_HOCON_TYPE, TEXT_PLAIN_TYPE};

  private Map<String, Client> hostMap = new HashMap<String, Client>();
  private Map<String, String> defaultHeaderMap = new HashMap<String, String>();
  private Set<Cookie> cookies = new HashSet<Cookie>();
  private String basePath;
  private boolean isDebug = false;
  private String username;
  private String password;
  private boolean tlsEnabled;
  private boolean hostnameVerificationEnabled;
  private String directorClientType = "SDK-Java";

  public void enableDebug() {
    isDebug = true;
  }

  public void addDefaultHeader(String key, String value) {
     defaultHeaderMap.put(key, value);
  }

  public String escapeString(String str) {
    try {
      return URLEncoder.encode(str, "UTF-8").replaceAll("\\+", "%20");
    } catch (UnsupportedEncodingException e) {
      return str;
    }
  }

  public String getBasePath() {
    return this.basePath;
  }

  public ApiClient(String apiServer) {
    this(apiServer, apiServer.startsWith("https"), true);
  }

  public ApiClient(String apiServer, boolean tlsEnabled, boolean hostnameVerificationEnabled,
    String directorClientType) {
    this(apiServer, tlsEnabled, hostnameVerificationEnabled);
    this.directorClientType = Preconditions.checkNotNull(directorClientType, "directorClientType is null");
  }

  public ApiClient(String apiServer, boolean tlsEnabled, boolean hostnameVerificationEnabled) {
    this.basePath = Preconditions.checkNotNull(apiServer, "apiServer is null");
    this.tlsEnabled = tlsEnabled;
    this.hostnameVerificationEnabled = hostnameVerificationEnabled;
  }

  public ApiClient(String apiServer, String username, String password) {
    this(apiServer, username, password, apiServer.startsWith("https"), true);
  }

  public ApiClient(String apiServer, String username, String password, boolean tlsEnabled,
    boolean hostnameVerificationEnabled) {
    this.basePath = Preconditions.checkNotNull(apiServer, "apiServer is null");
    this.username = Preconditions.checkNotNull(username, "username is null");
    this.password = Preconditions.checkNotNull(password, "password is null");
    this.tlsEnabled = tlsEnabled;
    this.hostnameVerificationEnabled = hostnameVerificationEnabled;
  }

  public ApiClient(String apiServer, String username, String password, boolean tlsEnabled,
    boolean hostnameVerificationEnabled, String directorClientType) {
    this(apiServer, username, password, tlsEnabled, hostnameVerificationEnabled);
    this.directorClientType = Preconditions.checkNotNull(directorClientType, "directorClientType is null");
  }

  public static Object deserialize(String json, String containerType, Class cls) throws ApiException {
    try {
      if ("List".equals(containerType)) {
        JavaType typeInfo = JsonUtil.getJsonMapper().getTypeFactory().constructCollectionType(List.class, cls);
        String sanitizedJson = JsonSanitizer.sanitize(json);
        List response = (List<?>) JsonUtil.getJsonMapper().readValue(sanitizedJson, typeInfo);
        return response;
      } else if (String.class.equals(cls)) {
        if (json != null && json.startsWith("\"") && json.endsWith("\"") && json.length() > 1)
          return json.substring(1, json.length() - 2);
        else
          return json;
      } else {
        String sanitizedJson = JsonSanitizer.sanitize(json);
        return JsonUtil.getJsonMapper().readValue(sanitizedJson, cls);
      }
    } catch (IOException e) {
      throw new ApiException(500, e.getMessage());
    }
  }

  public static String serialize(Object obj) throws ApiException {
    try {
      if (obj != null)
        return JsonUtil.getJsonMapper().writeValueAsString(obj);
      else
        return null;
    } catch (Exception e) {
      throw new ApiException(500, e.getMessage());
    }
  }

  public void invokeAPI(String path, String method, Map<String, String> queryParams, Object body,
    Map<String, String> headerParams, Map<String, String> formParams, String contentType)
    throws ApiException {

    ClientResponse response = internalInvokeAPI(path, method, queryParams, body, headerParams,
    formParams, contentType);

    if (response.getClientResponseStatus() == ClientResponse.Status.NO_CONTENT) {
      return;
    } else if (response.getClientResponseStatus().getFamily() == Family.SUCCESSFUL) {
      for (NewCookie newCookie : response.getCookies()) {
        cookies.add(newCookie.toCookie());
      }
    } else {
      throw new ApiException(
        response.getClientResponseStatus().getStatusCode(),
        response.getEntity(String.class));
    }
  }

  public Object invokeAPI(String path, String method, Map<String, String> queryParams, Object body,
    Map<String, String> headerParams, Map<String, String> formParams, String contentType,
    String containerType, Class cls)
    throws ApiException {

    ClientResponse response = internalInvokeAPI(path, method, queryParams, body, headerParams,
    formParams, contentType);

    if (response.getClientResponseStatus() == ClientResponse.Status.NO_CONTENT) {
      return null;
    } else if (response.getClientResponseStatus().getFamily() == Family.SUCCESSFUL) {
      for (NewCookie newCookie : response.getCookies()) {
        cookies.add(newCookie.toCookie());
      }

      String entityString = (String) response.getEntity(String.class);

      MediaType responseContentType = response.getType();
      if (APPLICATION_JSON_TYPE.isCompatible(responseContentType)) {
        return ApiClient.deserialize(entityString, containerType, cls);
      } else if (APPLICATION_HOCON_TYPE.isCompatible(responseContentType) ||
                 TEXT_PLAIN_TYPE.isCompatible(responseContentType)) {
        if (!(containerType == null || containerType.isEmpty()) ||
            cls != String.class) {
          throw new IllegalArgumentException("Server response with mime type " + responseContentType +
                                             " cannot be deserialized into containerType '" +
                                             containerType + "' and class '" + cls + "'");
        }
        return entityString;
      } else {
        throw new IllegalArgumentException("Server response with mime type " +
                                           responseContentType + " cannot be accepted");
      }
    } else {
      throw new ApiException(
        response.getClientResponseStatus().getStatusCode(),
        response.getEntity(String.class));
    }
  }

  @SuppressWarnings("PMD.EmptyCatchBlock")
  private ClientResponse internalInvokeAPI(String path, String method, Map<String, String> queryParams,
    Object body, Map<String, String> headerParams, Map<String, String> formParams, String contentType)
      throws ApiException {

    String host = getBasePath();
    Client client;

    try {
      if (username == null || password == null) {
        client = getClient(host, tlsEnabled, hostnameVerificationEnabled);
      } else {
        client = getClient(host, username, password, tlsEnabled, hostnameVerificationEnabled);
      }
    } catch (NoSuchAlgorithmException e) {
      throw new ApiException(500, e.getMessage());
    }

    StringBuilder b = new StringBuilder();

    for (Map.Entry<String, String> entry : queryParams.entrySet()) {
      String key = entry.getKey();
      String value = entry.getValue();
      if (value != null) {
        if (b.toString().length() == 0)
          b.append("?");
        else
          b.append("&");
        b.append(escapeString(key)).append("=").append(escapeString(value));
      }
    }
    String querystring = b.toString();

    Builder builder = client.resource(host + path + querystring)
      .accept(ACCEPTED_MEDIA_TYPES);
    for (Map.Entry<String, String> entry : headerParams.entrySet()) {
      builder.header(entry.getKey(), entry.getValue());
    }

    // Inject a custom header that Director can use to distinguish what type of client is being used (SDK, CLI, etc.)
    builder.header("X-Director-Client", directorClientType);

    for (Cookie c : cookies) {
      builder.cookie(c);
    }

    for (Map.Entry<String, String> entry : defaultHeaderMap.entrySet()) {
      String key = entry.getKey();
      if (!headerParams.containsKey(key)) {
        builder.header(key, entry.getValue());
      }
    }

    ClientResponse response = null;

    if ("GET".equals(method)) {
      response = (ClientResponse) builder.get(ClientResponse.class);
    } else if ("POST".equals(method)) {
      if (body == null) {
        response = builder.post(ClientResponse.class, null);
      } else if (body instanceof FormDataMultiPart) {
        response = builder.type(contentType).post(ClientResponse.class, body);
      } else if ("application/hocon".equals(contentType) || "text/plain".equals(contentType)) {
        response = builder.type(contentType).post(ClientResponse.class, body);
      } else { // assume application/json
        response = builder.type(contentType).post(ClientResponse.class, serialize(body));
      }
    } else if ("PUT".equals(method)) {
      if (body == null) {
        response = builder.put(ClientResponse.class, null);
      } else {
        if ("application/x-www-form-urlencoded".equals(contentType)) {
          StringBuilder formParamBuilder = new StringBuilder();

          // encode the form params
          for (Map.Entry<String, String> entry : formParams.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (value != null && !"".equals(value.trim())) {
              if (formParamBuilder.length() > 0) {
                formParamBuilder.append("&");
              }
              try {
                formParamBuilder.append(URLEncoder.encode(key, "UTF-8"))
                  .append("=")
                  .append(URLEncoder.encode(value, "UTF-8"));
              } catch (UnsupportedEncodingException e) {
                // move on to next
              }
            }
          }
          response = builder.type(contentType).put(ClientResponse.class, formParamBuilder.toString());
        } else if ("application/hocon".equals(contentType) || "text/plain".equals(contentType)) {
          response = builder.type(contentType).put(ClientResponse.class, body);
        } else {
          response = builder.type(contentType).put(ClientResponse.class, serialize(body));
        }
      }
    } else if ("DELETE".equals(method)) {
      if (body == null)
        response = builder.delete(ClientResponse.class, null);
      else
        response = builder.type(contentType).delete(ClientResponse.class, serialize(body));
    } else {
      throw new ApiException(500, "unknown method type " + method);
    }

    return response;
  }

  private Client getClient(String host, boolean tlsEnabled, boolean hostnameVerificationEnabled)
    throws NoSuchAlgorithmException {
    if (!hostMap.containsKey(host)) {
      ClientConfig clientConfig = getClientConfig(tlsEnabled, hostnameVerificationEnabled);
      Client client = Client.create(clientConfig);
      if (isDebug) {
        client.addFilter(new LoggingFilter());
      }

      hostMap.put(host, client);
    }
    return hostMap.get(host);
  }

  private Client getClient(String host, String username, String password, boolean tlsEnabled,
    boolean hostnameVerificationEnabled) throws NoSuchAlgorithmException {
    if (!hostMap.containsKey(host)) {
      ClientConfig clientConfig = getClientConfig(tlsEnabled, hostnameVerificationEnabled);
      Client client = Client.create(clientConfig);
      client.addFilter(new HTTPBasicAuthFilter(username, password));

      if (isDebug) {
        client.addFilter(new LoggingFilter());
      }

      hostMap.put(host, client);
    }
    return hostMap.get(host);
  }

  private static final HostnameVerifier ALLOW_ALL_HOSTNAME_VERIFIER = new HostnameVerifier() {
    @Override
    public boolean verify(String hostname, SSLSession session) {
      return true;
    }
  };

  private ClientConfig getClientConfig(boolean tlsEnabled, boolean hostnameVerificationEnabled)
    throws NoSuchAlgorithmException {
    ClientConfig clientConfig = new DefaultClientConfig();
    if (tlsEnabled) {
      HostnameVerifier verifier = hostnameVerificationEnabled ?
        HttpsURLConnection.getDefaultHostnameVerifier() : ALLOW_ALL_HOSTNAME_VERIFIER;
      clientConfig.getProperties().put(HTTPSProperties.PROPERTY_HTTPS_PROPERTIES,
        new HTTPSProperties(verifier, SSLContext.getDefault()));
    }
    return clientConfig;
  }
}

