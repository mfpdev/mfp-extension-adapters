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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;
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
 * Counterexample
 */
@javax.annotation.Generated(value = "com.github.mfpdev.adapters.swagger.codegen.MfpAdapterCodegen", date = "2017-09-04T16:39:33.075+05:30")
public class Counterexample   {
  @JsonProperty("text")
  private String text = null;

  @JsonProperty("created")
  private DateTime created = null;

  @JsonProperty("updated")
  private DateTime updated = null;

  public Counterexample text(String text) {
    this.text = text;
    return this;
  }

   /**
   * The text of the counterexample.
   * @return text
  **/
  @JsonProperty("text")
  @ApiModelProperty(required = true, value = "The text of the counterexample.")
  @NotNull
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

   /**
   * The timestamp for creation of the counterexample.
   * @return created
  **/
  @JsonProperty("created")
  @ApiModelProperty(required = true, value = "The timestamp for creation of the counterexample.")
  @NotNull
  public DateTime getCreated() {
    return created;
  }

   /**
   * The timestamp for the last update to the counterexample.
   * @return updated
  **/
  @JsonProperty("updated")
  @ApiModelProperty(required = true, value = "The timestamp for the last update to the counterexample.")
  @NotNull
  public DateTime getUpdated() {
    return updated;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Counterexample counterexample = (Counterexample) o;
    return Objects.equals(this.text, counterexample.text) &&
        Objects.equals(this.created, counterexample.created) &&
        Objects.equals(this.updated, counterexample.updated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(text, created, updated);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Counterexample {\n");
    
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
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

