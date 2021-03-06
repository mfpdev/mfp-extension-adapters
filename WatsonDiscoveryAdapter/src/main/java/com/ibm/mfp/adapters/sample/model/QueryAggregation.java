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
import com.ibm.mfp.adapters.sample.model.AggregationResult;
import com.ibm.mfp.adapters.sample.model.QueryAggregation;
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
 * An aggregation produced by the Discovery service to analyze the input provided.
 */
@ApiModel(description = "An aggregation produced by the Discovery service to analyze the input provided.")
@javax.annotation.Generated(value = "com.github.mfpdev.adapters.swagger.codegen.MfpAdapterCodegen", date = "2017-09-04T17:22:26.527+05:30")
public class QueryAggregation   {
  @JsonProperty("type")
  private String type = null;

  @JsonProperty("field")
  private String field = null;

  @JsonProperty("results")
  private List<AggregationResult> results = null;

  @JsonProperty("match")
  private String match = null;

  @JsonProperty("matching_results")
  private Integer matchingResults = null;

  @JsonProperty("aggregations")
  private List<QueryAggregation> aggregations = null;

  @JsonProperty("interval")
  private Integer interval = null;

  @JsonProperty("value")
  private Double value = null;

  public QueryAggregation type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The type of aggregation command used. e.g. term, filter, max, min, etc.
   * @return type
  **/
  @JsonProperty("type")
  @ApiModelProperty(value = "The type of aggregation command used. e.g. term, filter, max, min, etc.")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public QueryAggregation field(String field) {
    this.field = field;
    return this;
  }

   /**
   * The field where the aggregation is located in the document.
   * @return field
  **/
  @JsonProperty("field")
  @ApiModelProperty(value = "The field where the aggregation is located in the document.")
  public String getField() {
    return field;
  }

  public void setField(String field) {
    this.field = field;
  }

  public QueryAggregation results(List<AggregationResult> results) {
    this.results = results;
    return this;
  }

  public QueryAggregation addResultsItem(AggregationResult resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<AggregationResult>();
    }
    this.results.add(resultsItem);
    return this;
  }

   /**
   * Get results
   * @return results
  **/
  @JsonProperty("results")
  @ApiModelProperty(value = "")
  public List<AggregationResult> getResults() {
    return results;
  }

  public void setResults(List<AggregationResult> results) {
    this.results = results;
  }

  public QueryAggregation match(String match) {
    this.match = match;
    return this;
  }

   /**
   * The match the aggregated results queried for.
   * @return match
  **/
  @JsonProperty("match")
  @ApiModelProperty(value = "The match the aggregated results queried for.")
  public String getMatch() {
    return match;
  }

  public void setMatch(String match) {
    this.match = match;
  }

  public QueryAggregation matchingResults(Integer matchingResults) {
    this.matchingResults = matchingResults;
    return this;
  }

   /**
   * Number of matching results.
   * @return matchingResults
  **/
  @JsonProperty("matching_results")
  @ApiModelProperty(value = "Number of matching results.")
  public Integer getMatchingResults() {
    return matchingResults;
  }

  public void setMatchingResults(Integer matchingResults) {
    this.matchingResults = matchingResults;
  }

  public QueryAggregation aggregations(List<QueryAggregation> aggregations) {
    this.aggregations = aggregations;
    return this;
  }

  public QueryAggregation addAggregationsItem(QueryAggregation aggregationsItem) {
    if (this.aggregations == null) {
      this.aggregations = new ArrayList<QueryAggregation>();
    }
    this.aggregations.add(aggregationsItem);
    return this;
  }

   /**
   * Aggregations returned by the Discovery service.
   * @return aggregations
  **/
  @JsonProperty("aggregations")
  @ApiModelProperty(value = "Aggregations returned by the Discovery service.")
  public List<QueryAggregation> getAggregations() {
    return aggregations;
  }

  public void setAggregations(List<QueryAggregation> aggregations) {
    this.aggregations = aggregations;
  }

  public QueryAggregation interval(Integer interval) {
    this.interval = interval;
    return this;
  }

   /**
   * Interval specified by using aggregation type 'timeslice'.
   * @return interval
  **/
  @JsonProperty("interval")
  @ApiModelProperty(value = "Interval specified by using aggregation type 'timeslice'.")
  public Integer getInterval() {
    return interval;
  }

  public void setInterval(Integer interval) {
    this.interval = interval;
  }

  public QueryAggregation value(Double value) {
    this.value = value;
    return this;
  }

   /**
   * Value of the aggregation. (For 'max' and 'min' type).
   * @return value
  **/
  @JsonProperty("value")
  @ApiModelProperty(value = "Value of the aggregation. (For 'max' and 'min' type).")
  public Double getValue() {
    return value;
  }

  public void setValue(Double value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryAggregation queryAggregation = (QueryAggregation) o;
    return Objects.equals(this.type, queryAggregation.type) &&
        Objects.equals(this.field, queryAggregation.field) &&
        Objects.equals(this.results, queryAggregation.results) &&
        Objects.equals(this.match, queryAggregation.match) &&
        Objects.equals(this.matchingResults, queryAggregation.matchingResults) &&
        Objects.equals(this.aggregations, queryAggregation.aggregations) &&
        Objects.equals(this.interval, queryAggregation.interval) &&
        Objects.equals(this.value, queryAggregation.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, field, results, match, matchingResults, aggregations, interval, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryAggregation {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
    sb.append("    match: ").append(toIndentedString(match)).append("\n");
    sb.append("    matchingResults: ").append(toIndentedString(matchingResults)).append("\n");
    sb.append("    aggregations: ").append(toIndentedString(aggregations)).append("\n");
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

