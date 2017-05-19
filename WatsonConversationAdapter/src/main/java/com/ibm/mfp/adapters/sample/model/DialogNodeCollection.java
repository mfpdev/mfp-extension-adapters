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
import com.ibm.mfp.adapters.sample.model.DialogNodeResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;

/**
 * DialogNodeCollection
 */
@javax.annotation.Generated(value = "com.github.mfpdev.adapters.swagger.codegen.MfpAdapterCodegen", date = "2017-05-19T13:34:31.991+05:30")
public class DialogNodeCollection   {
  @JsonProperty("dialog_nodes")
  private List<DialogNodeResponse> dialogNodes = null;

  public DialogNodeCollection dialogNodes(List<DialogNodeResponse> dialogNodes) {
    this.dialogNodes = dialogNodes;
    return this;
  }

  public DialogNodeCollection addDialogNodesItem(DialogNodeResponse dialogNodesItem) {
    if (this.dialogNodes == null) {
      this.dialogNodes = new ArrayList<DialogNodeResponse>();
    }
    this.dialogNodes.add(dialogNodesItem);
    return this;
  }

   /**
   * An array of objects describing the dialog nodes in the workspace.
   * @return dialogNodes
  **/
  @JsonProperty("dialog_nodes")
  @ApiModelProperty(value = "An array of objects describing the dialog nodes in the workspace.")

  public List<DialogNodeResponse> getDialogNodes() {
    return dialogNodes;
  }

  public void setDialogNodes(List<DialogNodeResponse> dialogNodes) {
    this.dialogNodes = dialogNodes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DialogNodeCollection dialogNodeCollection = (DialogNodeCollection) o;
    return Objects.equals(this.dialogNodes, dialogNodeCollection.dialogNodes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dialogNodes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DialogNodeCollection {\n");
    
    sb.append("    dialogNodes: ").append(toIndentedString(dialogNodes)).append("\n");
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
