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
 * Natural Language Understanding
 * Analyze various features of text content at scale. Provide text, raw HTML, or a public URL, and IBM Watson Natural Language Understanding will give you results for the features you request. The service cleans HTML content before analysis by default, so the results can ignore most advertisements and other unwanted content.    ### Concepts  Identify general concepts that are referenced or alluded to in your content. Concepts that are detected typically have an associated link to a DBpedia resource.    ### Entities  Detect important people, places, geopolitical entities and other types of entities in your content. Entity detection recognizes consecutive coreferences of each entity. For example, analysis of the following text would count \"Barack Obama\" and \"He\" as the same entity:    \"Barack Obama was the 44th President of the United States. He took office in January 2009.\"    ### Keywords  Determine the most important keywords in your content. Keyword phrases are organized by relevance in the results.    ### Categories  Categorize your content into a hierarchical 5-level taxonomy. For example, \"Leonardo DiCaprio won an Oscar\" returns \"/art and entertainment/movies and tv/movies\" as the most confident classification.    ### Sentiment  Determine whether your content conveys postive or negative sentiment. Sentiment information can be returned for detected entities, keywords, or user-specified target phrases found in the text.    ### Emotion  Detect anger, disgust, fear, joy, or sadness that is conveyed by your content. Emotion information can be returned for detected entities, keywords, or user-specified target phrases found in the text.    ### Relations  Recognize when two entities are related, and identify the type of relation.  For example, you can identify an \"awardedTo\" relation between an award and its recipient.    ### Semantic Roles  Parse sentences into subject-action-object form, and identify entities and keywords that are subjects or objects of an action.    ### Metadata  Get author information, publication date, and the title of your text/HTML content.  
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
 * 
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "com.github.mfpdev.adapters.swagger.codegen.MfpAdapterCodegen", date = "2017-09-04T17:58:15.838+05:30")
public class Model   {
  @JsonProperty("status")
  private String status = null;

  @JsonProperty("model_id")
  private String modelId = null;

  @JsonProperty("language")
  private String language = null;

  @JsonProperty("description")
  private String description = null;

  public Model status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Shows as available if the model is ready for use
   * @return status
  **/
  @JsonProperty("status")
  @ApiModelProperty(value = "Shows as available if the model is ready for use")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public Model modelId(String modelId) {
    this.modelId = modelId;
    return this;
  }

   /**
   * Unique model ID
   * @return modelId
  **/
  @JsonProperty("model_id")
  @ApiModelProperty(value = "Unique model ID")
  public String getModelId() {
    return modelId;
  }

  public void setModelId(String modelId) {
    this.modelId = modelId;
  }

  public Model language(String language) {
    this.language = language;
    return this;
  }

   /**
   * ISO 639-1 code indicating the language of the model
   * @return language
  **/
  @JsonProperty("language")
  @ApiModelProperty(value = "ISO 639-1 code indicating the language of the model")
  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public Model description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Model description
   * @return description
  **/
  @JsonProperty("description")
  @ApiModelProperty(value = "Model description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Model model = (Model) o;
    return Objects.equals(this.status, model.status) &&
        Objects.equals(this.modelId, model.modelId) &&
        Objects.equals(this.language, model.language) &&
        Objects.equals(this.description, model.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, modelId, language, description);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Model {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    modelId: ").append(toIndentedString(modelId)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

