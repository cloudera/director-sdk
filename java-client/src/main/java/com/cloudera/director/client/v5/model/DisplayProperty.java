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

package com.cloudera.director.client.v5.model;


public class DisplayProperty {
  /* Description of the display property */
  private String description;
  /* Display property key */
  private String displayKey;
  /* Display property name */
  private String name;
  /* Whether this property is sensitive */
  private Boolean sensitive;
  /* This property's type */
  private String type;
  /* The widget used to display this property */
  private String widget;
  public interface Type {
    String BOOLEAN = "BOOLEAN";
    String INTEGER = "INTEGER";
    String DOUBLE = "DOUBLE";
    String STRING = "STRING";
  }
  public interface Widget {
    String RADIO = "RADIO";
    String CHECKBOX = "CHECKBOX";
    String TEXT = "TEXT";
    String PASSWORD = "PASSWORD";
    String NUMBER = "NUMBER";
    String TEXTAREA = "TEXTAREA";
    String FILE = "FILE";
    String LIST = "LIST";
    String OPENLIST = "OPENLIST";
    String MULTI = "MULTI";
    String OPENMULTI = "OPENMULTI";
  }
  public DisplayProperty() { }

  private DisplayProperty(String description, String displayKey, String name, Boolean sensitive, String type, String widget) {
    this.description = description;
    this.displayKey = displayKey;
    this.name = name;
    this.sensitive = sensitive;
    this.type = type;
    this.widget = widget;
  }

  private DisplayProperty(DisplayPropertyBuilder builder) {
    this.description = builder.description;
    this.displayKey = builder.displayKey;
    this.name = builder.name;
    this.sensitive = builder.sensitive;
    this.type = builder.type;
    this.widget = builder.widget;
  }

  public static DisplayPropertyBuilder builder() {
    return new DisplayPropertyBuilder();
  }

  public static class DisplayPropertyBuilder {
    private String description = null;
    private String displayKey = null;
    private String name = null;
    private Boolean sensitive = null;
    private String type = null;
    private String widget = null;

    public DisplayPropertyBuilder description(String description) {
      this.description = description;
      return this;
    }

    public DisplayPropertyBuilder displayKey(String displayKey) {
      this.displayKey = displayKey;
      return this;
    }

    public DisplayPropertyBuilder name(String name) {
      this.name = name;
      return this;
    }

    public DisplayPropertyBuilder sensitive(Boolean sensitive) {
      this.sensitive = sensitive;
      return this;
    }

    public DisplayPropertyBuilder type(String type) {
      this.type = type;
      return this;
    }

    public DisplayPropertyBuilder widget(String widget) {
      this.widget = widget;
      return this;
    }

    public DisplayProperty build() {
      return new DisplayProperty(this);
    }
  }

  public DisplayPropertyBuilder toBuilder() {
    return builder()
      .description(description)
      .displayKey(displayKey)
      .name(name)
      .sensitive(sensitive)
      .type(type)
      .widget(widget)
      ;
  }
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  public String getDisplayKey() {
    return displayKey;
  }
  public void setDisplayKey(String displayKey) {
    this.displayKey = displayKey;
  }

  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  public Boolean getSensitive() {
    return sensitive;
  }
  public void setSensitive(Boolean sensitive) {
    this.sensitive = sensitive;
  }

  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  public String getWidget() {
    return widget;
  }
  public void setWidget(String widget) {
    this.widget = widget;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    DisplayProperty other = (DisplayProperty) o; // NOPMD

    if (description != null ?
        !description.equals(other.description) :
        other.description != null) return false;
    if (displayKey != null ?
        !displayKey.equals(other.displayKey) :
        other.displayKey != null) return false;
    if (name != null ?
        !name.equals(other.name) :
        other.name != null) return false;
    if (sensitive != null ?
        !sensitive.equals(other.sensitive) :
        other.sensitive != null) return false;
    if (type != null ?
        !type.equals(other.type) :
        other.type != null) return false;
    if (widget != null ?
        !widget.equals(other.widget) :
        other.widget != null) return false;
    return true;
  }

  @Override
  public int hashCode() {
    int result = 0;
    result = 31 * result + (description != null ? description.hashCode() : 0);
    result = 31 * result + (displayKey != null ? displayKey.hashCode() : 0);
    result = 31 * result + (name != null ? name.hashCode() : 0);
    result = 31 * result + (sensitive != null ? sensitive.hashCode() : 0);
    result = 31 * result + (type != null ? type.hashCode() : 0);
    result = 31 * result + (widget != null ? widget.hashCode() : 0);
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    String newLine = System.getProperty("line.separator");
    sb.append("class DisplayProperty {" + newLine);
    sb.append("  description: ").append(description).append(newLine);
    sb.append("  displayKey: ").append(displayKey).append(newLine);
    sb.append("  name: ").append(name).append(newLine);
    sb.append("  sensitive: ").append(sensitive).append(newLine);
    sb.append("  type: ").append(type).append(newLine);
    sb.append("  widget: ").append(widget).append(newLine);
    sb.append("}" + newLine);
    return sb.toString();
  }
}

