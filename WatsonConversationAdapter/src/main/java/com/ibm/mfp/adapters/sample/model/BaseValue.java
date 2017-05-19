/*
 * Conversation
 * The IBM Watson&trade; Conversation service combines machine learning, natural language understanding, and integrated dialog tools to create conversation flows between your apps and your users.
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.ibm.mfp.adapters.sample.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;

/**
 * BaseValue
 */
@javax.annotation.Generated(value = "com.github.mfpdev.adapters.swagger.codegen.MfpAdapterCodegen", date = "2017-05-19T13:34:31.991+05:30")
public class BaseValue   {
  @JsonProperty("value")
  private String value = null;

  @JsonProperty("metadata")
  private Object metadata = null;

  public BaseValue value(String value) {
    this.value = value;
    return this;
  }

   /**
   * The text of the entity value.
   * @return value
  **/
  @JsonProperty("value")
  @ApiModelProperty(value = "The text of the entity value.")

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public BaseValue metadata(Object metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Any metadata related to the entity value.
   * @return metadata
  **/
  @JsonProperty("metadata")
  @ApiModelProperty(value = "Any metadata related to the entity value.")

  public Object getMetadata() {
    return metadata;
  }

  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BaseValue baseValue = (BaseValue) o;
    return Objects.equals(this.value, baseValue.value) &&
        Objects.equals(this.metadata, baseValue.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, metadata);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BaseValue {\n");
    
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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
