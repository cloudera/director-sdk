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


package com.cloudera.director.client.v11.model;

import java.util.Objects;
import com.cloudera.director.client.v11.model.ClusterAdministrationSettings;
import com.cloudera.director.client.v11.model.ExternalDatabase;
import com.cloudera.director.client.v11.model.ExternalDatabaseTemplate;
import com.cloudera.director.client.v11.model.Migration;
import com.cloudera.director.client.v11.model.VirtualInstanceGroup;
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
 * A template for a cluster running in a cloud provider
 */
@ApiModel(description = "A template for a cluster running in a cloud provider")

public class ClusterTemplate {
  @SerializedName("administrationSettings")
  private ClusterAdministrationSettings administrationSettings = null;
  @SerializedName("externalDatabaseTemplates")
  private Map<String, ExternalDatabaseTemplate> externalDatabaseTemplates = null;
  @SerializedName("externalDatabases")
  private Map<String, ExternalDatabase> externalDatabases = null;
  @SerializedName("instancePostCreateScripts")
  private List<String> instancePostCreateScripts = null;
  @SerializedName("migrations")
  private List<Migration> migrations = null;
  @SerializedName("name")
  private String name = null;
  @SerializedName("parcelRepositories")
  private List<String> parcelRepositories = null;
  @SerializedName("postCreateScripts")
  private List<String> postCreateScripts = null;
  @SerializedName("preTerminateScripts")
  private List<String> preTerminateScripts = null;
  @SerializedName("productVersions")
  private Map<String, String> productVersions = null;
  @SerializedName("redeployClientConfigsOnUpdate")
  private Boolean redeployClientConfigsOnUpdate = null;
  @SerializedName("restartClusterOnUpdate")
  private Boolean restartClusterOnUpdate = null;
  @SerializedName("services")
  private List<String> services = null;
  @SerializedName("servicesConfigs")
  private Map<String, Map<String, String>> servicesConfigs = null;
  @SerializedName("virtualInstanceGroups")
  private Map<String, VirtualInstanceGroup> virtualInstanceGroups = new HashMap<String, VirtualInstanceGroup>();

  public ClusterTemplate() {
    // Do nothing
  }

  private ClusterTemplate(ClusterTemplateBuilder builder) {
      this.administrationSettings = builder.administrationSettings;
      this.externalDatabaseTemplates = builder.externalDatabaseTemplates;
      this.externalDatabases = builder.externalDatabases;
      this.instancePostCreateScripts = builder.instancePostCreateScripts;
      this.migrations = builder.migrations;
      this.name = builder.name;
      this.parcelRepositories = builder.parcelRepositories;
      this.postCreateScripts = builder.postCreateScripts;
      this.preTerminateScripts = builder.preTerminateScripts;
      this.productVersions = builder.productVersions;
      this.redeployClientConfigsOnUpdate = builder.redeployClientConfigsOnUpdate;
      this.restartClusterOnUpdate = builder.restartClusterOnUpdate;
      this.services = builder.services;
      this.servicesConfigs = builder.servicesConfigs;
      this.virtualInstanceGroups = builder.virtualInstanceGroups;
    }

  public static ClusterTemplateBuilder builder() {
    return new ClusterTemplateBuilder();
  }

  public static class ClusterTemplateBuilder {
      private ClusterAdministrationSettings administrationSettings = null;
      private Map<String, ExternalDatabaseTemplate> externalDatabaseTemplates = new HashMap<String, ExternalDatabaseTemplate>();
      private Map<String, ExternalDatabase> externalDatabases = new HashMap<String, ExternalDatabase>();
      private List<String> instancePostCreateScripts = new ArrayList<String>();
      private List<Migration> migrations = new ArrayList<Migration>();
      private String name = null;
      private List<String> parcelRepositories = new ArrayList<String>();
      private List<String> postCreateScripts = new ArrayList<String>();
      private List<String> preTerminateScripts = new ArrayList<String>();
      private Map<String, String> productVersions = new HashMap<String, String>();
      private Boolean redeployClientConfigsOnUpdate = null;
      private Boolean restartClusterOnUpdate = null;
      private List<String> services = new ArrayList<String>();
      private Map<String, Map<String, String>> servicesConfigs = new HashMap<String, Map<String, String>>();
      private Map<String, VirtualInstanceGroup> virtualInstanceGroups = new HashMap<String, VirtualInstanceGroup>();
  

    public ClusterTemplateBuilder administrationSettings(ClusterAdministrationSettings administrationSettings) {
      this.administrationSettings = administrationSettings;
      return this;
    }


    public ClusterTemplateBuilder externalDatabaseTemplates(Map<String, ExternalDatabaseTemplate> externalDatabaseTemplates) {
      this.externalDatabaseTemplates = externalDatabaseTemplates;
      return this;
    }


    public ClusterTemplateBuilder externalDatabases(Map<String, ExternalDatabase> externalDatabases) {
      this.externalDatabases = externalDatabases;
      return this;
    }


    public ClusterTemplateBuilder instancePostCreateScripts(List<String> instancePostCreateScripts) {
      this.instancePostCreateScripts = instancePostCreateScripts;
      return this;
    }


    public ClusterTemplateBuilder migrations(List<Migration> migrations) {
      this.migrations = migrations;
      return this;
    }


    public ClusterTemplateBuilder name(String name) {
      this.name = name;
      return this;
    }


    public ClusterTemplateBuilder parcelRepositories(List<String> parcelRepositories) {
      this.parcelRepositories = parcelRepositories;
      return this;
    }


    public ClusterTemplateBuilder postCreateScripts(List<String> postCreateScripts) {
      this.postCreateScripts = postCreateScripts;
      return this;
    }


    public ClusterTemplateBuilder preTerminateScripts(List<String> preTerminateScripts) {
      this.preTerminateScripts = preTerminateScripts;
      return this;
    }


    public ClusterTemplateBuilder productVersions(Map<String, String> productVersions) {
      this.productVersions = productVersions;
      return this;
    }


    public ClusterTemplateBuilder redeployClientConfigsOnUpdate(Boolean redeployClientConfigsOnUpdate) {
      this.redeployClientConfigsOnUpdate = redeployClientConfigsOnUpdate;
      return this;
    }


    public ClusterTemplateBuilder restartClusterOnUpdate(Boolean restartClusterOnUpdate) {
      this.restartClusterOnUpdate = restartClusterOnUpdate;
      return this;
    }


    public ClusterTemplateBuilder services(List<String> services) {
      this.services = services;
      return this;
    }


    public ClusterTemplateBuilder servicesConfigs(Map<String, Map<String, String>> servicesConfigs) {
      this.servicesConfigs = servicesConfigs;
      return this;
    }


    public ClusterTemplateBuilder virtualInstanceGroups(Map<String, VirtualInstanceGroup> virtualInstanceGroups) {
      this.virtualInstanceGroups = virtualInstanceGroups;
      return this;
    }


    public ClusterTemplate build() {
      return new ClusterTemplate(this);
    }
  }

  public ClusterTemplateBuilder toBuilder() {
    return builder()
      .administrationSettings(administrationSettings)
            .externalDatabaseTemplates(externalDatabaseTemplates)
            .externalDatabases(externalDatabases)
            .instancePostCreateScripts(instancePostCreateScripts)
            .migrations(migrations)
            .name(name)
            .parcelRepositories(parcelRepositories)
            .postCreateScripts(postCreateScripts)
            .preTerminateScripts(preTerminateScripts)
            .productVersions(productVersions)
            .redeployClientConfigsOnUpdate(redeployClientConfigsOnUpdate)
            .restartClusterOnUpdate(restartClusterOnUpdate)
            .services(services)
            .servicesConfigs(servicesConfigs)
            .virtualInstanceGroups(virtualInstanceGroups)
      ;
  }

  public ClusterTemplate administrationSettings(ClusterAdministrationSettings administrationSettings) {
    this.administrationSettings = administrationSettings;
    return this;
  }

   /**
   * Optional cluster administration settings
   * @return administrationSettings
  **/
  @ApiModelProperty(value = "Optional cluster administration settings")
  public ClusterAdministrationSettings getAdministrationSettings() {
    return administrationSettings;
  }

  public void setAdministrationSettings(ClusterAdministrationSettings administrationSettings) {
    this.administrationSettings = administrationSettings;
  }

  public ClusterTemplate externalDatabaseTemplates(Map<String, ExternalDatabaseTemplate> externalDatabaseTemplates) {
    this.externalDatabaseTemplates = externalDatabaseTemplates;
    return this;
  }

  public ClusterTemplate putExternalDatabaseTemplatesItem(String key, ExternalDatabaseTemplate externalDatabaseTemplatesItem) {
    if (this.externalDatabaseTemplates == null) {
      this.externalDatabaseTemplates = new HashMap<String, ExternalDatabaseTemplate>();
    }
    this.externalDatabaseTemplates.put(key, externalDatabaseTemplatesItem);
    return this;
  }

   /**
   * Optional external database templates
   * @return externalDatabaseTemplates
  **/
  @ApiModelProperty(value = "Optional external database templates")
  public Map<String, ExternalDatabaseTemplate> getExternalDatabaseTemplates() {
    return externalDatabaseTemplates;
  }

  public void setExternalDatabaseTemplates(Map<String, ExternalDatabaseTemplate> externalDatabaseTemplates) {
    this.externalDatabaseTemplates = externalDatabaseTemplates;
  }

  public ClusterTemplate externalDatabases(Map<String, ExternalDatabase> externalDatabases) {
    this.externalDatabases = externalDatabases;
    return this;
  }

  public ClusterTemplate putExternalDatabasesItem(String key, ExternalDatabase externalDatabasesItem) {
    if (this.externalDatabases == null) {
      this.externalDatabases = new HashMap<String, ExternalDatabase>();
    }
    this.externalDatabases.put(key, externalDatabasesItem);
    return this;
  }

   /**
   * Optional external databases
   * @return externalDatabases
  **/
  @ApiModelProperty(value = "Optional external databases")
  public Map<String, ExternalDatabase> getExternalDatabases() {
    return externalDatabases;
  }

  public void setExternalDatabases(Map<String, ExternalDatabase> externalDatabases) {
    this.externalDatabases = externalDatabases;
  }

  public ClusterTemplate instancePostCreateScripts(List<String> instancePostCreateScripts) {
    this.instancePostCreateScripts = instancePostCreateScripts;
    return this;
  }

  public ClusterTemplate addInstancePostCreateScriptsItem(String instancePostCreateScriptsItem) {
    if (this.instancePostCreateScripts == null) {
      this.instancePostCreateScripts = new ArrayList<String>();
    }
    this.instancePostCreateScripts.add(instancePostCreateScriptsItem);
    return this;
  }

   /**
   * A list of scripts to be run after cluster creation on all cluster instances
   * @return instancePostCreateScripts
  **/
  @ApiModelProperty(value = "A list of scripts to be run after cluster creation on all cluster instances")
  public List<String> getInstancePostCreateScripts() {
    return instancePostCreateScripts;
  }

  public void setInstancePostCreateScripts(List<String> instancePostCreateScripts) {
    this.instancePostCreateScripts = instancePostCreateScripts;
  }

  public ClusterTemplate migrations(List<Migration> migrations) {
    this.migrations = migrations;
    return this;
  }

  public ClusterTemplate addMigrationsItem(Migration migrationsItem) {
    if (this.migrations == null) {
      this.migrations = new ArrayList<Migration>();
    }
    this.migrations.add(migrationsItem);
    return this;
  }

   /**
   * A description of current manual migrations (read only)
   * @return migrations
  **/
  @ApiModelProperty(value = "A description of current manual migrations (read only)")
  public List<Migration> getMigrations() {
    return migrations;
  }

  public void setMigrations(List<Migration> migrations) {
    this.migrations = migrations;
  }

  public ClusterTemplate name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Cluster name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Cluster name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ClusterTemplate parcelRepositories(List<String> parcelRepositories) {
    this.parcelRepositories = parcelRepositories;
    return this;
  }

  public ClusterTemplate addParcelRepositoriesItem(String parcelRepositoriesItem) {
    if (this.parcelRepositories == null) {
      this.parcelRepositories = new ArrayList<String>();
    }
    this.parcelRepositories.add(parcelRepositoriesItem);
    return this;
  }

   /**
   * Optional set of cluster parcel repositories
   * @return parcelRepositories
  **/
  @ApiModelProperty(value = "Optional set of cluster parcel repositories")
  public List<String> getParcelRepositories() {
    return parcelRepositories;
  }

  public void setParcelRepositories(List<String> parcelRepositories) {
    this.parcelRepositories = parcelRepositories;
  }

  public ClusterTemplate postCreateScripts(List<String> postCreateScripts) {
    this.postCreateScripts = postCreateScripts;
    return this;
  }

  public ClusterTemplate addPostCreateScriptsItem(String postCreateScriptsItem) {
    if (this.postCreateScripts == null) {
      this.postCreateScripts = new ArrayList<String>();
    }
    this.postCreateScripts.add(postCreateScriptsItem);
    return this;
  }

   /**
   * A list of scripts to be run after cluster creation
   * @return postCreateScripts
  **/
  @ApiModelProperty(value = "A list of scripts to be run after cluster creation")
  public List<String> getPostCreateScripts() {
    return postCreateScripts;
  }

  public void setPostCreateScripts(List<String> postCreateScripts) {
    this.postCreateScripts = postCreateScripts;
  }

  public ClusterTemplate preTerminateScripts(List<String> preTerminateScripts) {
    this.preTerminateScripts = preTerminateScripts;
    return this;
  }

  public ClusterTemplate addPreTerminateScriptsItem(String preTerminateScriptsItem) {
    if (this.preTerminateScripts == null) {
      this.preTerminateScripts = new ArrayList<String>();
    }
    this.preTerminateScripts.add(preTerminateScriptsItem);
    return this;
  }

   /**
   * A list of scripts to be run before cluster termination
   * @return preTerminateScripts
  **/
  @ApiModelProperty(value = "A list of scripts to be run before cluster termination")
  public List<String> getPreTerminateScripts() {
    return preTerminateScripts;
  }

  public void setPreTerminateScripts(List<String> preTerminateScripts) {
    this.preTerminateScripts = preTerminateScripts;
  }

  public ClusterTemplate productVersions(Map<String, String> productVersions) {
    this.productVersions = productVersions;
    return this;
  }

  public ClusterTemplate putProductVersionsItem(String key, String productVersionsItem) {
    if (this.productVersions == null) {
      this.productVersions = new HashMap<String, String>();
    }
    this.productVersions.put(key, productVersionsItem);
    return this;
  }

   /**
   * Versions for cluster products
   * @return productVersions
  **/
  @ApiModelProperty(value = "Versions for cluster products")
  public Map<String, String> getProductVersions() {
    return productVersions;
  }

  public void setProductVersions(Map<String, String> productVersions) {
    this.productVersions = productVersions;
  }

  public ClusterTemplate redeployClientConfigsOnUpdate(Boolean redeployClientConfigsOnUpdate) {
    this.redeployClientConfigsOnUpdate = redeployClientConfigsOnUpdate;
    return this;
  }

   /**
   * Whether to redeploy client configuration on cluster update
   * @return redeployClientConfigsOnUpdate
  **/
  @ApiModelProperty(example = "false", value = "Whether to redeploy client configuration on cluster update")
  public Boolean isRedeployClientConfigsOnUpdate() {
    return redeployClientConfigsOnUpdate;
  }

  public void setRedeployClientConfigsOnUpdate(Boolean redeployClientConfigsOnUpdate) {
    this.redeployClientConfigsOnUpdate = redeployClientConfigsOnUpdate;
  }

  public ClusterTemplate restartClusterOnUpdate(Boolean restartClusterOnUpdate) {
    this.restartClusterOnUpdate = restartClusterOnUpdate;
    return this;
  }

   /**
   * Whether to restart the cluster on cluster update
   * @return restartClusterOnUpdate
  **/
  @ApiModelProperty(example = "false", value = "Whether to restart the cluster on cluster update")
  public Boolean isRestartClusterOnUpdate() {
    return restartClusterOnUpdate;
  }

  public void setRestartClusterOnUpdate(Boolean restartClusterOnUpdate) {
    this.restartClusterOnUpdate = restartClusterOnUpdate;
  }

  public ClusterTemplate services(List<String> services) {
    this.services = services;
    return this;
  }

  public ClusterTemplate addServicesItem(String servicesItem) {
    if (this.services == null) {
      this.services = new ArrayList<String>();
    }
    this.services.add(servicesItem);
    return this;
  }

   /**
   * Cluster services
   * @return services
  **/
  @ApiModelProperty(value = "Cluster services")
  public List<String> getServices() {
    return services;
  }

  public void setServices(List<String> services) {
    this.services = services;
  }

  public ClusterTemplate servicesConfigs(Map<String, Map<String, String>> servicesConfigs) {
    this.servicesConfigs = servicesConfigs;
    return this;
  }

  public ClusterTemplate putServicesConfigsItem(String key, Map<String, String> servicesConfigsItem) {
    if (this.servicesConfigs == null) {
      this.servicesConfigs = new HashMap<String, Map<String, String>>();
    }
    this.servicesConfigs.put(key, servicesConfigsItem);
    return this;
  }

   /**
   * Cluster services configurations
   * @return servicesConfigs
  **/
  @ApiModelProperty(value = "Cluster services configurations")
  public Map<String, Map<String, String>> getServicesConfigs() {
    return servicesConfigs;
  }

  public void setServicesConfigs(Map<String, Map<String, String>> servicesConfigs) {
    this.servicesConfigs = servicesConfigs;
  }

  public ClusterTemplate virtualInstanceGroups(Map<String, VirtualInstanceGroup> virtualInstanceGroups) {
    this.virtualInstanceGroups = virtualInstanceGroups;
    return this;
  }

  public ClusterTemplate putVirtualInstanceGroupsItem(String key, VirtualInstanceGroup virtualInstanceGroupsItem) {
    this.virtualInstanceGroups.put(key, virtualInstanceGroupsItem);
    return this;
  }

   /**
   * List of virtual instances
   * @return virtualInstanceGroups
  **/
  @ApiModelProperty(required = true, value = "List of virtual instances")
  public Map<String, VirtualInstanceGroup> getVirtualInstanceGroups() {
    return virtualInstanceGroups;
  }

  public void setVirtualInstanceGroups(Map<String, VirtualInstanceGroup> virtualInstanceGroups) {
    this.virtualInstanceGroups = virtualInstanceGroups;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClusterTemplate clusterTemplate = (ClusterTemplate) o;
    return Objects.equals(this.administrationSettings, clusterTemplate.administrationSettings) &&
        Objects.equals(this.externalDatabaseTemplates, clusterTemplate.externalDatabaseTemplates) &&
        Objects.equals(this.externalDatabases, clusterTemplate.externalDatabases) &&
        Objects.equals(this.instancePostCreateScripts, clusterTemplate.instancePostCreateScripts) &&
        Objects.equals(this.migrations, clusterTemplate.migrations) &&
        Objects.equals(this.name, clusterTemplate.name) &&
        Objects.equals(this.parcelRepositories, clusterTemplate.parcelRepositories) &&
        Objects.equals(this.postCreateScripts, clusterTemplate.postCreateScripts) &&
        Objects.equals(this.preTerminateScripts, clusterTemplate.preTerminateScripts) &&
        Objects.equals(this.productVersions, clusterTemplate.productVersions) &&
        Objects.equals(this.redeployClientConfigsOnUpdate, clusterTemplate.redeployClientConfigsOnUpdate) &&
        Objects.equals(this.restartClusterOnUpdate, clusterTemplate.restartClusterOnUpdate) &&
        Objects.equals(this.services, clusterTemplate.services) &&
        Objects.equals(this.servicesConfigs, clusterTemplate.servicesConfigs) &&
        Objects.equals(this.virtualInstanceGroups, clusterTemplate.virtualInstanceGroups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(administrationSettings, externalDatabaseTemplates, externalDatabases, instancePostCreateScripts, migrations, name, parcelRepositories, postCreateScripts, preTerminateScripts, productVersions, redeployClientConfigsOnUpdate, restartClusterOnUpdate, services, servicesConfigs, virtualInstanceGroups);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClusterTemplate {\n");
    
    sb.append("    administrationSettings: ").append(toIndentedString(administrationSettings)).append("\n");
    sb.append("    externalDatabaseTemplates: ").append(toIndentedString(externalDatabaseTemplates)).append("\n");
    sb.append("    externalDatabases: ").append(toIndentedString(externalDatabases)).append("\n");
    sb.append("    instancePostCreateScripts: ").append(toIndentedString(instancePostCreateScripts)).append("\n");
    sb.append("    migrations: ").append(toIndentedString(migrations)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    parcelRepositories: ").append(toIndentedString(parcelRepositories)).append("\n");
    sb.append("    postCreateScripts: ").append(toIndentedString(postCreateScripts)).append("\n");
    sb.append("    preTerminateScripts: ").append(toIndentedString(preTerminateScripts)).append("\n");
    sb.append("    productVersions: ").append(toIndentedString(productVersions)).append("\n");
    sb.append("    redeployClientConfigsOnUpdate: ").append(toIndentedString(redeployClientConfigsOnUpdate)).append("\n");
    sb.append("    restartClusterOnUpdate: ").append(toIndentedString(restartClusterOnUpdate)).append("\n");
    sb.append("    services: ").append(toIndentedString(services)).append("\n");
    sb.append("    servicesConfigs: ").append(toIndentedString(servicesConfigs)).append("\n");
    sb.append("    virtualInstanceGroups: ").append(toIndentedString(virtualInstanceGroups)).append("\n");
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

