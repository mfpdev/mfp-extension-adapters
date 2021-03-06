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
import com.ibm.mfp.adapters.sample.model.CreateExample;
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
 * CreateIntent
 */
@javax.annotation.Generated(value = "com.github.mfpdev.adapters.swagger.codegen.MfpAdapterCodegen", date = "2017-09-04T16:39:33.075+05:30")
public class CreateIntent   {
  @JsonProperty("intent")
  private String intent = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("examples")
  private List<CreateExample> examples = null;

  public CreateIntent intent(String intent) {
    this.intent = intent;
    return this;
  }

   /**
   * The name of the intent.
   * @return intent
  **/
  @JsonProperty("intent")
  @ApiModelProperty(required = true, value = "The name of the intent.")
  @NotNull
  public String getIntent() {
    return intent;
  }

  public void setIntent(String intent) {
    this.intent = intent;
  }

  public CreateIntent description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The description of the intent.
   * @return description
  **/
  @JsonProperty("description")
  @ApiModelProperty(value = "The description of the intent.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CreateIntent examples(List<CreateExample> examples) {
    this.examples = examples;
    return this;
  }

  public CreateIntent addExamplesItem(CreateExample examplesItem) {
    if (this.examples == null) {
      this.examples = new ArrayList<CreateExample>();
    }
    this.examples.add(examplesItem);
    return this;
  }

   /**
   * An array of user input examples.
   * @return examples
  **/
  @JsonProperty("examples")
  @ApiModelProperty(value = "An array of user input examples.")
  public List<CreateExample> getExamples() {
    return examples;
  }

  public void setExamples(List<CreateExample> examples) {
    this.examples = examples;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateIntent createIntent = (CreateIntent) o;
    return Objects.equals(this.intent, createIntent.intent) &&
        Objects.equals(this.description, createIntent.description) &&
        Objects.equals(this.examples, createIntent.examples);
  }

  @Override
  public int hashCode() {
    return Objects.hash(intent, description, examples);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateIntent {\n");
    
    sb.append("    intent: ").append(toIndentedString(intent)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    examples: ").append(toIndentedString(examples)).append("\n");
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

