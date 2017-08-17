/*
 *  IBM Confidential OCO Source Materials
 *                                                                 
 *  5725-I43 Copyright IBM Corp. 2011, 2017
 *                                                                   
 *  The source code for this program is not published or otherwise
 *  divested of its trade secrets, irrespective of what has
 *  been deposited with the U.S. Copyright Office.
 *                   
 */


/*
 * OpenWhisk REST API
 * API for OpenWhisk
 *
 * OpenAPI spec version: 0.1.0
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
import com.ibm.mfp.adapters.sample.model.KeyValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;

/*
 *  IBM Confidential OCO Source Materials
 *                                                                 
 *  5725-I43 Copyright IBM Corp. 2011, 2017
 *                                                                   
 *  The source code for this program is not published or otherwise
 *  divested of its trade secrets, irrespective of what has
 *  been deposited with the U.S. Copyright Office.
 *                   
 */


/**
 * Provider
 */
@javax.annotation.Generated(value = "com.github.mfpdev.adapters.swagger.codegen.MfpAdapterCodegen", date = "2017-08-16T15:08:23.571+05:30")
public class Provider   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("publish")
  private Boolean publish = null;

  @JsonProperty("parameters")
  private List<KeyValue> parameters = null;

  public Provider name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the provider
   * @return name
  **/
  @JsonProperty("name")
  @ApiModelProperty(required = true, value = "Name of the provider")
  @NotNull
 @Size(min=1)  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Provider publish(Boolean publish) {
    this.publish = publish;
    return this;
  }

   /**
   * Whether to publish the provider or not
   * @return publish
  **/
  @JsonProperty("publish")
  @ApiModelProperty(value = "Whether to publish the provider or not")
  public Boolean getPublish() {
    return publish;
  }

  public void setPublish(Boolean publish) {
    this.publish = publish;
  }

  public Provider parameters(List<KeyValue> parameters) {
    this.parameters = parameters;
    return this;
  }

  public Provider addParametersItem(KeyValue parametersItem) {
    if (this.parameters == null) {
      this.parameters = new ArrayList<KeyValue>();
    }
    this.parameters.add(parametersItem);
    return this;
  }

   /**
   * parameter bindings included in the context passed to the provider
   * @return parameters
  **/
  @JsonProperty("parameters")
  @ApiModelProperty(value = "parameter bindings included in the context passed to the provider")
  public List<KeyValue> getParameters() {
    return parameters;
  }

  public void setParameters(List<KeyValue> parameters) {
    this.parameters = parameters;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Provider provider = (Provider) o;
    return Objects.equals(this.name, provider.name) &&
        Objects.equals(this.publish, provider.publish) &&
        Objects.equals(this.parameters, provider.parameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, publish, parameters);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Provider {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    publish: ").append(toIndentedString(publish)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
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

