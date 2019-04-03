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


package com.cloudera.director.client.d6_2.model;

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
 * a marketplace image
 */
@ApiModel(description = "a marketplace image")

public class MarketplaceImage {
  @SerializedName("imageName")
  private String imageName = null;
  @SerializedName("imageId")
  private String imageId = null;

  public MarketplaceImage() {
    // Do nothing
  }

  private MarketplaceImage(MarketplaceImageBuilder builder) {
      this.imageName = builder.imageName;
      this.imageId = builder.imageId;
    }

  public static MarketplaceImageBuilder builder() {
    return new MarketplaceImageBuilder();
  }

  public static class MarketplaceImageBuilder {
      private String imageName = null;
      private String imageId = null;
  

    public MarketplaceImageBuilder imageName(String imageName) {
      this.imageName = imageName;
      return this;
    }


    public MarketplaceImageBuilder imageId(String imageId) {
      this.imageId = imageId;
      return this;
    }


    public MarketplaceImage build() {
      return new MarketplaceImage(this);
    }
  }

  public MarketplaceImageBuilder toBuilder() {
    return builder()
      .imageName(imageName)
            .imageId(imageId)
      ;
  }

  public MarketplaceImage imageName(String imageName) {
    this.imageName = imageName;
    return this;
  }

   /**
   * Image name
   * @return imageName
  **/
  @ApiModelProperty(required = true, value = "Image name")
  public String getImageName() {
    return imageName;
  }

  public void setImageName(String imageName) {
    this.imageName = imageName;
  }

  public MarketplaceImage imageId(String imageId) {
    this.imageId = imageId;
    return this;
  }

   /**
   * Image id
   * @return imageId
  **/
  @ApiModelProperty(value = "Image id")
  public String getImageId() {
    return imageId;
  }

  public void setImageId(String imageId) {
    this.imageId = imageId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MarketplaceImage marketplaceImage = (MarketplaceImage) o;
    return Objects.equals(this.imageName, marketplaceImage.imageName) &&
        Objects.equals(this.imageId, marketplaceImage.imageId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(imageName, imageId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MarketplaceImage {\n");
    
    sb.append("    imageName: ").append(toIndentedString(imageName)).append("\n");
    sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
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

