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
 * Discovery
 * The IBM Watson&trade; Discovery Service is a cognitive search and content analytics engine that you can add to applications to identify patterns, trends and actionable insights to drive better decision-making. Securely unify structured and unstructured data with pre-enriched content, and use a simplified query language to eliminate the need for manual filtering of results. 
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
import java.util.HashMap;
import java.util.Map;
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
 * QueryResult
 */
@javax.annotation.Generated(value = "com.github.mfpdev.adapters.swagger.codegen.MfpAdapterCodegen", date = "2017-09-04T17:22:26.527+05:30")
public class QueryResult extends HashMap<String, Object>  {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("score")
  private Double score = null;

  @JsonProperty("metadata")
  private Object metadata = null;

  public QueryResult id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The unique identifier of the document.
   * @return id
  **/
  @JsonProperty("id")
  @ApiModelProperty(value = "The unique identifier of the document.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public QueryResult score(Double score) {
    this.score = score;
    return this;
  }

   /**
   * The confidence score of the result's analysis. Scores range from 0 to 1, with a higher score indicating greater confidence.
   * @return score
  **/
  @JsonProperty("score")
  @ApiModelProperty(value = "The confidence score of the result's analysis. Scores range from 0 to 1, with a higher score indicating greater confidence.")
  public Double getScore() {
    return score;
  }

  public void setScore(Double score) {
    this.score = score;
  }

  public QueryResult metadata(Object metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Metadata of the document.
   * @return metadata
  **/
  @JsonProperty("metadata")
  @ApiModelProperty(value = "Metadata of the document.")
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
    QueryResult queryResult = (QueryResult) o;
    return Objects.equals(this.id, queryResult.id) &&
        Objects.equals(this.score, queryResult.score) &&
        Objects.equals(this.metadata, queryResult.metadata) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, score, metadata, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryResult {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
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

