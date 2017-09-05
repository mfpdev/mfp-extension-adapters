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
import com.fasterxml.jackson.annotation.JsonValue;
import com.ibm.mfp.adapters.sample.model.DialogNodeAction;
import com.ibm.mfp.adapters.sample.model.DialogNodeNextStep;
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
 * CreateDialogNode
 */
@javax.annotation.Generated(value = "com.github.mfpdev.adapters.swagger.codegen.MfpAdapterCodegen", date = "2017-09-04T16:39:33.075+05:30")
public class CreateDialogNode   {
  @JsonProperty("dialog_node")
  private String dialogNode = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("conditions")
  private String conditions = null;

  @JsonProperty("parent")
  private String parent = null;

  @JsonProperty("previous_sibling")
  private String previousSibling = null;

  @JsonProperty("output")
  private Object output = null;

  @JsonProperty("context")
  private Object context = null;

  @JsonProperty("metadata")
  private Object metadata = null;

  @JsonProperty("next_step")
  private DialogNodeNextStep nextStep = null;

  @JsonProperty("actions")
  private List<DialogNodeAction> actions = null;

  @JsonProperty("title")
  private String title = null;

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
   * How the dialog node is processed.
   */
  public enum TypeEnum {
    STANDARD("standard"),
    
    EVENT_HANDLER("event_handler"),
    
    FRAME("frame"),
    
    SLOT("slot"),
    
    RESPONSE_CONDITION("response_condition");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("type")
  private TypeEnum type = null;

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
   * How an `event_handler` node is processed.
   */
  public enum EventNameEnum {
    FOCUS("focus"),
    
    INPUT("input"),
    
    FILLED("filled"),
    
    VALIDATE("validate"),
    
    FILLED_MULTIPLE("filled_multiple"),
    
    GENERIC("generic"),
    
    NOMATCH("nomatch"),
    
    NOMATCH_RESPONSES_DEPLETED("nomatch_responses_depleted");

    private String value;

    EventNameEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static EventNameEnum fromValue(String text) {
      for (EventNameEnum b : EventNameEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("event_name")
  private EventNameEnum eventName = null;

  @JsonProperty("variable")
  private String variable = null;

  public CreateDialogNode dialogNode(String dialogNode) {
    this.dialogNode = dialogNode;
    return this;
  }

   /**
   * The dialog node ID.
   * @return dialogNode
  **/
  @JsonProperty("dialog_node")
  @ApiModelProperty(required = true, value = "The dialog node ID.")
  @NotNull
  public String getDialogNode() {
    return dialogNode;
  }

  public void setDialogNode(String dialogNode) {
    this.dialogNode = dialogNode;
  }

  public CreateDialogNode description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The description of the dialog node.
   * @return description
  **/
  @JsonProperty("description")
  @ApiModelProperty(value = "The description of the dialog node.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CreateDialogNode conditions(String conditions) {
    this.conditions = conditions;
    return this;
  }

   /**
   * The condition that will trigger the dialog node.
   * @return conditions
  **/
  @JsonProperty("conditions")
  @ApiModelProperty(value = "The condition that will trigger the dialog node.")
  public String getConditions() {
    return conditions;
  }

  public void setConditions(String conditions) {
    this.conditions = conditions;
  }

  public CreateDialogNode parent(String parent) {
    this.parent = parent;
    return this;
  }

   /**
   * The ID of the parent dialog node (if any).
   * @return parent
  **/
  @JsonProperty("parent")
  @ApiModelProperty(value = "The ID of the parent dialog node (if any).")
  public String getParent() {
    return parent;
  }

  public void setParent(String parent) {
    this.parent = parent;
  }

  public CreateDialogNode previousSibling(String previousSibling) {
    this.previousSibling = previousSibling;
    return this;
  }

   /**
   * The previous dialog node.
   * @return previousSibling
  **/
  @JsonProperty("previous_sibling")
  @ApiModelProperty(value = "The previous dialog node.")
  public String getPreviousSibling() {
    return previousSibling;
  }

  public void setPreviousSibling(String previousSibling) {
    this.previousSibling = previousSibling;
  }

  public CreateDialogNode output(Object output) {
    this.output = output;
    return this;
  }

   /**
   * The output of the dialog node.
   * @return output
  **/
  @JsonProperty("output")
  @ApiModelProperty(value = "The output of the dialog node.")
  public Object getOutput() {
    return output;
  }

  public void setOutput(Object output) {
    this.output = output;
  }

  public CreateDialogNode context(Object context) {
    this.context = context;
    return this;
  }

   /**
   * The context for the dialog node.
   * @return context
  **/
  @JsonProperty("context")
  @ApiModelProperty(value = "The context for the dialog node.")
  public Object getContext() {
    return context;
  }

  public void setContext(Object context) {
    this.context = context;
  }

  public CreateDialogNode metadata(Object metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * The metadata for the dialog node.
   * @return metadata
  **/
  @JsonProperty("metadata")
  @ApiModelProperty(value = "The metadata for the dialog node.")
  public Object getMetadata() {
    return metadata;
  }

  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }

  public CreateDialogNode nextStep(DialogNodeNextStep nextStep) {
    this.nextStep = nextStep;
    return this;
  }

   /**
   * Get nextStep
   * @return nextStep
  **/
  @JsonProperty("next_step")
  @ApiModelProperty(value = "")
  public DialogNodeNextStep getNextStep() {
    return nextStep;
  }

  public void setNextStep(DialogNodeNextStep nextStep) {
    this.nextStep = nextStep;
  }

  public CreateDialogNode actions(List<DialogNodeAction> actions) {
    this.actions = actions;
    return this;
  }

  public CreateDialogNode addActionsItem(DialogNodeAction actionsItem) {
    if (this.actions == null) {
      this.actions = new ArrayList<DialogNodeAction>();
    }
    this.actions.add(actionsItem);
    return this;
  }

   /**
   * The actions for the dialog node.
   * @return actions
  **/
  @JsonProperty("actions")
  @ApiModelProperty(value = "The actions for the dialog node.")
 @Size(max=5)  public List<DialogNodeAction> getActions() {
    return actions;
  }

  public void setActions(List<DialogNodeAction> actions) {
    this.actions = actions;
  }

  public CreateDialogNode title(String title) {
    this.title = title;
    return this;
  }

   /**
   * The alias used to identify the dialog node.
   * @return title
  **/
  @JsonProperty("title")
  @ApiModelProperty(value = "The alias used to identify the dialog node.")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public CreateDialogNode type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * How the dialog node is processed.
   * @return type
  **/
  @JsonProperty("type")
  @ApiModelProperty(value = "How the dialog node is processed.")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public CreateDialogNode eventName(EventNameEnum eventName) {
    this.eventName = eventName;
    return this;
  }

   /**
   * How an `event_handler` node is processed.
   * @return eventName
  **/
  @JsonProperty("event_name")
  @ApiModelProperty(value = "How an `event_handler` node is processed.")
  public EventNameEnum getEventName() {
    return eventName;
  }

  public void setEventName(EventNameEnum eventName) {
    this.eventName = eventName;
  }

  public CreateDialogNode variable(String variable) {
    this.variable = variable;
    return this;
  }

   /**
   * The location in the dialog context where output is stored.
   * @return variable
  **/
  @JsonProperty("variable")
  @ApiModelProperty(value = "The location in the dialog context where output is stored.")
  public String getVariable() {
    return variable;
  }

  public void setVariable(String variable) {
    this.variable = variable;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateDialogNode createDialogNode = (CreateDialogNode) o;
    return Objects.equals(this.dialogNode, createDialogNode.dialogNode) &&
        Objects.equals(this.description, createDialogNode.description) &&
        Objects.equals(this.conditions, createDialogNode.conditions) &&
        Objects.equals(this.parent, createDialogNode.parent) &&
        Objects.equals(this.previousSibling, createDialogNode.previousSibling) &&
        Objects.equals(this.output, createDialogNode.output) &&
        Objects.equals(this.context, createDialogNode.context) &&
        Objects.equals(this.metadata, createDialogNode.metadata) &&
        Objects.equals(this.nextStep, createDialogNode.nextStep) &&
        Objects.equals(this.actions, createDialogNode.actions) &&
        Objects.equals(this.title, createDialogNode.title) &&
        Objects.equals(this.type, createDialogNode.type) &&
        Objects.equals(this.eventName, createDialogNode.eventName) &&
        Objects.equals(this.variable, createDialogNode.variable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dialogNode, description, conditions, parent, previousSibling, output, context, metadata, nextStep, actions, title, type, eventName, variable);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateDialogNode {\n");
    
    sb.append("    dialogNode: ").append(toIndentedString(dialogNode)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
    sb.append("    previousSibling: ").append(toIndentedString(previousSibling)).append("\n");
    sb.append("    output: ").append(toIndentedString(output)).append("\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    nextStep: ").append(toIndentedString(nextStep)).append("\n");
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    eventName: ").append(toIndentedString(eventName)).append("\n");
    sb.append("    variable: ").append(toIndentedString(variable)).append("\n");
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

