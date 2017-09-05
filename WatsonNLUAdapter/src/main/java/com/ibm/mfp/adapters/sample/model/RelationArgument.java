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
import com.ibm.mfp.adapters.sample.model.RelationEntity;
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
 * RelationArgument
 */
@javax.annotation.Generated(value = "com.github.mfpdev.adapters.swagger.codegen.MfpAdapterCodegen", date = "2017-09-04T17:58:15.838+05:30")
public class RelationArgument   {
  @JsonProperty("entities")
  private List<RelationEntity> entities = null;

  @JsonProperty("text")
  private String text = null;

  public RelationArgument entities(List<RelationEntity> entities) {
    this.entities = entities;
    return this;
  }

  public RelationArgument addEntitiesItem(RelationEntity entitiesItem) {
    if (this.entities == null) {
      this.entities = new ArrayList<RelationEntity>();
    }
    this.entities.add(entitiesItem);
    return this;
  }

   /**
   * Get entities
   * @return entities
  **/
  @JsonProperty("entities")
  @ApiModelProperty(value = "")
  public List<RelationEntity> getEntities() {
    return entities;
  }

  public void setEntities(List<RelationEntity> entities) {
    this.entities = entities;
  }

  public RelationArgument text(String text) {
    this.text = text;
    return this;
  }

   /**
   * Text that corresponds to the argument
   * @return text
  **/
  @JsonProperty("text")
  @ApiModelProperty(value = "Text that corresponds to the argument")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RelationArgument relationArgument = (RelationArgument) o;
    return Objects.equals(this.entities, relationArgument.entities) &&
        Objects.equals(this.text, relationArgument.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entities, text);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RelationArgument {\n");
    
    sb.append("    entities: ").append(toIndentedString(entities)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
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

