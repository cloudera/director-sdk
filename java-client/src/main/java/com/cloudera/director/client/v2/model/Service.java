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

import com.cloudera.director.client.v2.model.Health;
public class Service {
  private Health health;
  private String serviceName;
  public Service() {} 

  private Service(Health health, String serviceName) {
    this.health = health;
    this.serviceName = serviceName;
    
  }
  
  private Service (ServiceBuilder builder) {
    this.health = builder.health;
    this.serviceName = builder.serviceName;
    
  }

  public static ServiceBuilder builder() {
    return new ServiceBuilder();
  }

  
  public static class ServiceBuilder {
    private Health health = null;
    private String serviceName = null;
    
    public ServiceBuilder health(Health health) {
      this.health = health;
      return this;
    }

    public ServiceBuilder serviceName(String serviceName) {
      this.serviceName = serviceName;
      return this;
    }

    public Service build(){
      return new Service(this);
    }
  }

  public ServiceBuilder toBuilder() {
    return builder()
      .health(health)
      .serviceName(serviceName)
      ;
  }
  public Health getHealth() {
    return health;
  }
  public void setHealth(Health health) {
    this.health = health;
  }

  public String getServiceName() {
    return serviceName;
  }
  public void setServiceName(String serviceName) {
    this.serviceName = serviceName;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    String newLine = System.getProperty("line.separator");
    sb.append("class Service {" + newLine);
    sb.append("  health: ").append(health).append(newLine);
    sb.append("  serviceName: ").append(serviceName).append(newLine);
    sb.append("}" + newLine);
    return sb.toString();
  }
}

