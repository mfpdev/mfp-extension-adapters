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
import com.ibm.mfp.adapters.sample.model.Example;
import com.ibm.mfp.adapters.sample.model.Pagination;
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
 * ExampleCollection
 */
@javax.annotation.Generated(value = "com.github.mfpdev.adapters.swagger.codegen.MfpAdapterCodegen", date = "2017-09-04T16:39:33.075+05:30")
public class ExampleCollection   {
  @JsonProperty("examples")
  private List<Example> examples = new ArrayList<Example>();

  @JsonProperty("pagination")
  private Pagination pagination = null;

  public ExampleCollection examples(List<Example> examples) {
    this.examples = examples;
    return this;
  }

  public ExampleCollection addExamplesItem(Example examplesItem) {
    this.examples.add(examplesItem);
    return this;
  }

   /**
   * An array of Example objects describing the examples defined for the intent.
   * @return examples
  **/
  @JsonProperty("examples")
  @ApiModelProperty(required = true, value = "An array of Example objects describing the examples defined for the intent.")
  @NotNull
  public List<Example> getExamples() {
    return examples;
  }

  public void setExamples(List<Example> examples) {
    this.examples = examples;
  }

  public ExampleCollection pagination(Pagination pagination) {
    this.pagination = pagination;
    return this;
  }

   /**
   * An object defining the pagination data for the returned objects.
   * @return pagination
  **/
  @JsonProperty("pagination")
  @ApiModelProperty(required = true, value = "An object defining the pagination data for the returned objects.")
  @NotNull
  public Pagination getPagination() {
    return pagination;
  }

  public void setPagination(Pagination pagination) {
    this.pagination = pagination;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExampleCollection exampleCollection = (ExampleCollection) o;
    return Objects.equals(this.examples, exampleCollection.examples) &&
        Objects.equals(this.pagination, exampleCollection.pagination);
  }

  @Override
  public int hashCode() {
    return Objects.hash(examples, pagination);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExampleCollection {\n");
    
    sb.append("    examples: ").append(toIndentedString(examples)).append("\n");
    sb.append("    pagination: ").append(toIndentedString(pagination)).append("\n");
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

