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
import com.ibm.mfp.adapters.sample.model.PackageBinding;
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
 * ModelPackage
 */
@javax.annotation.Generated(value = "com.github.mfpdev.adapters.swagger.codegen.MfpAdapterCodegen", date = "2017-07-03T19:13:35.134+05:30")
public class ModelPackage   {
  @JsonProperty("namespace")
  private String namespace = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("version")
  private String version = null;

  @JsonProperty("publish")
  private Boolean publish = null;

  @JsonProperty("annotations")
  private List<KeyValue> annotations = null;

  @JsonProperty("parameters")
  private List<KeyValue> parameters = new ArrayList<KeyValue>();

  @JsonProperty("binding")
  private PackageBinding binding = null;

  public ModelPackage namespace(String namespace) {
    this.namespace = namespace;
    return this;
  }

   /**
   * Namespace of the item
   * @return namespace
  **/
  @JsonProperty("namespace")
  @ApiModelProperty(required = true, value = "Namespace of the item")
  @NotNull
 @Size(min=1)  public String getNamespace() {
    return namespace;
  }

  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }

  public ModelPackage name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the item
   * @return name
  **/
  @JsonProperty("name")
  @ApiModelProperty(required = true, value = "Name of the item")
  @NotNull
 @Size(min=1)  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ModelPackage version(String version) {
    this.version = version;
    return this;
  }

   /**
   * Semantic version of the item
   * @return version
  **/
  @JsonProperty("version")
  @ApiModelProperty(required = true, value = "Semantic version of the item")
  @NotNull
 @Size(min=1)  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public ModelPackage publish(Boolean publish) {
    this.publish = publish;
    return this;
  }

   /**
   * Whether to publish the item or not
   * @return publish
  **/
  @JsonProperty("publish")
  @ApiModelProperty(required = true, value = "Whether to publish the item or not")
  @NotNull
  public Boolean getPublish() {
    return publish;
  }

  public void setPublish(Boolean publish) {
    this.publish = publish;
  }

  public ModelPackage annotations(List<KeyValue> annotations) {
    this.annotations = annotations;
    return this;
  }

  public ModelPackage addAnnotationsItem(KeyValue annotationsItem) {
    if (this.annotations == null) {
      this.annotations = new ArrayList<KeyValue>();
    }
    this.annotations.add(annotationsItem);
    return this;
  }

   /**
   * annotations on the item
   * @return annotations
  **/
  @JsonProperty("annotations")
  @ApiModelProperty(value = "annotations on the item")
  public List<KeyValue> getAnnotations() {
    return annotations;
  }

  public void setAnnotations(List<KeyValue> annotations) {
    this.annotations = annotations;
  }

  public ModelPackage parameters(List<KeyValue> parameters) {
    this.parameters = parameters;
    return this;
  }

  public ModelPackage addParametersItem(KeyValue parametersItem) {
    this.parameters.add(parametersItem);
    return this;
  }

   /**
   * parameter for the package
   * @return parameters
  **/
  @JsonProperty("parameters")
  @ApiModelProperty(required = true, value = "parameter for the package")
  @NotNull
  public List<KeyValue> getParameters() {
    return parameters;
  }

  public void setParameters(List<KeyValue> parameters) {
    this.parameters = parameters;
  }

  public ModelPackage binding(PackageBinding binding) {
    this.binding = binding;
    return this;
  }

   /**
   * Get binding
   * @return binding
  **/
  @JsonProperty("binding")
  @ApiModelProperty(value = "")
  public PackageBinding getBinding() {
    return binding;
  }

  public void setBinding(PackageBinding binding) {
    this.binding = binding;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelPackage _package = (ModelPackage) o;
    return Objects.equals(this.namespace, _package.namespace) &&
        Objects.equals(this.name, _package.name) &&
        Objects.equals(this.version, _package.version) &&
        Objects.equals(this.publish, _package.publish) &&
        Objects.equals(this.annotations, _package.annotations) &&
        Objects.equals(this.parameters, _package.parameters) &&
        Objects.equals(this.binding, _package.binding);
  }

  @Override
  public int hashCode() {
    return Objects.hash(namespace, name, version, publish, annotations, parameters, binding);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelPackage {\n");
    
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    publish: ").append(toIndentedString(publish)).append("\n");
    sb.append("    annotations: ").append(toIndentedString(annotations)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    binding: ").append(toIndentedString(binding)).append("\n");
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
