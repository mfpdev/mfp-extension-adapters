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
import com.ibm.mfp.adapters.sample.model.LogExport;
import com.ibm.mfp.adapters.sample.model.LogPagination;
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
 * LogCollection
 */
@javax.annotation.Generated(value = "com.github.mfpdev.adapters.swagger.codegen.MfpAdapterCodegen", date = "2017-09-04T16:39:33.075+05:30")
public class LogCollection   {
  @JsonProperty("logs")
  private List<LogExport> logs = new ArrayList<LogExport>();

  @JsonProperty("pagination")
  private LogPagination pagination = null;

  public LogCollection logs(List<LogExport> logs) {
    this.logs = logs;
    return this;
  }

  public LogCollection addLogsItem(LogExport logsItem) {
    this.logs.add(logsItem);
    return this;
  }

   /**
   * An array of log events.
   * @return logs
  **/
  @JsonProperty("logs")
  @ApiModelProperty(required = true, value = "An array of log events.")
  @NotNull
  public List<LogExport> getLogs() {
    return logs;
  }

  public void setLogs(List<LogExport> logs) {
    this.logs = logs;
  }

  public LogCollection pagination(LogPagination pagination) {
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
  public LogPagination getPagination() {
    return pagination;
  }

  public void setPagination(LogPagination pagination) {
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
    LogCollection logCollection = (LogCollection) o;
    return Objects.equals(this.logs, logCollection.logs) &&
        Objects.equals(this.pagination, logCollection.pagination);
  }

  @Override
  public int hashCode() {
    return Objects.hash(logs, pagination);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogCollection {\n");
    
    sb.append("    logs: ").append(toIndentedString(logs)).append("\n");
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

