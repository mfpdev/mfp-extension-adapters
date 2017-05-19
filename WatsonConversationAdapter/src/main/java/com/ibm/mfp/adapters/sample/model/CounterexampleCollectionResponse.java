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
import com.ibm.mfp.adapters.sample.model.ExampleResponse;
import com.ibm.mfp.adapters.sample.model.PaginationResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;

/**
 * CounterexampleCollectionResponse
 */
@javax.annotation.Generated(value = "com.github.mfpdev.adapters.swagger.codegen.MfpAdapterCodegen", date = "2017-05-19T13:34:31.991+05:30")
public class CounterexampleCollectionResponse   {
  @JsonProperty("counterexamples")
  private List<ExampleResponse> counterexamples = new ArrayList<ExampleResponse>();

  @JsonProperty("pagination")
  private PaginationResponse pagination = null;

  public CounterexampleCollectionResponse counterexamples(List<ExampleResponse> counterexamples) {
    this.counterexamples = counterexamples;
    return this;
  }

  public CounterexampleCollectionResponse addCounterexamplesItem(ExampleResponse counterexamplesItem) {
    this.counterexamples.add(counterexamplesItem);
    return this;
  }

   /**
   * An array of ExampleResponse objects describing the examples marked as irrelevant input.
   * @return counterexamples
  **/
  @JsonProperty("counterexamples")
  @ApiModelProperty(required = true, value = "An array of ExampleResponse objects describing the examples marked as irrelevant input.")
  @NotNull 

  public List<ExampleResponse> getCounterexamples() {
    return counterexamples;
  }

  public void setCounterexamples(List<ExampleResponse> counterexamples) {
    this.counterexamples = counterexamples;
  }

  public CounterexampleCollectionResponse pagination(PaginationResponse pagination) {
    this.pagination = pagination;
    return this;
  }

   /**
   * Get pagination
   * @return pagination
  **/
  @JsonProperty("pagination")
  @ApiModelProperty(required = true, value = "")
  @NotNull 

  public PaginationResponse getPagination() {
    return pagination;
  }

  public void setPagination(PaginationResponse pagination) {
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
    CounterexampleCollectionResponse counterexampleCollectionResponse = (CounterexampleCollectionResponse) o;
    return Objects.equals(this.counterexamples, counterexampleCollectionResponse.counterexamples) &&
        Objects.equals(this.pagination, counterexampleCollectionResponse.pagination);
  }

  @Override
  public int hashCode() {
    return Objects.hash(counterexamples, pagination);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CounterexampleCollectionResponse {\n");
    
    sb.append("    counterexamples: ").append(toIndentedString(counterexamples)).append("\n");
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
