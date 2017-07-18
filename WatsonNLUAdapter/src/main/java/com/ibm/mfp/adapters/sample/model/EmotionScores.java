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
import java.math.BigDecimal;
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
 * EmotionScores
 */
@javax.annotation.Generated(value = "com.github.mfpdev.adapters.swagger.codegen.MfpAdapterCodegen", date = "2017-07-18T18:06:10.304+05:30")
public class EmotionScores   {
  @JsonProperty("anger")
  private BigDecimal anger = null;

  @JsonProperty("disgust")
  private BigDecimal disgust = null;

  @JsonProperty("fear")
  private BigDecimal fear = null;

  @JsonProperty("joy")
  private BigDecimal joy = null;

  @JsonProperty("sadness")
  private BigDecimal sadness = null;

  public EmotionScores anger(BigDecimal anger) {
    this.anger = anger;
    return this;
  }

   /**
   * Anger score from 0 to 1. A higher score means that the text is more likely to convey anger
   * @return anger
  **/
  @JsonProperty("anger")
  @ApiModelProperty(value = "Anger score from 0 to 1. A higher score means that the text is more likely to convey anger")
  public BigDecimal getAnger() {
    return anger;
  }

  public void setAnger(BigDecimal anger) {
    this.anger = anger;
  }

  public EmotionScores disgust(BigDecimal disgust) {
    this.disgust = disgust;
    return this;
  }

   /**
   * Disgust score from 0 to 1. A higher score means that the text is more likely to convey disgust
   * @return disgust
  **/
  @JsonProperty("disgust")
  @ApiModelProperty(value = "Disgust score from 0 to 1. A higher score means that the text is more likely to convey disgust")
  public BigDecimal getDisgust() {
    return disgust;
  }

  public void setDisgust(BigDecimal disgust) {
    this.disgust = disgust;
  }

  public EmotionScores fear(BigDecimal fear) {
    this.fear = fear;
    return this;
  }

   /**
   * Fear score from 0 to 1. A higher score means that the text is more likely to convey fear
   * @return fear
  **/
  @JsonProperty("fear")
  @ApiModelProperty(value = "Fear score from 0 to 1. A higher score means that the text is more likely to convey fear")
  public BigDecimal getFear() {
    return fear;
  }

  public void setFear(BigDecimal fear) {
    this.fear = fear;
  }

  public EmotionScores joy(BigDecimal joy) {
    this.joy = joy;
    return this;
  }

   /**
   * Joy score from 0 to 1. A higher score means that the text is more likely to convey joy
   * @return joy
  **/
  @JsonProperty("joy")
  @ApiModelProperty(value = "Joy score from 0 to 1. A higher score means that the text is more likely to convey joy")
  public BigDecimal getJoy() {
    return joy;
  }

  public void setJoy(BigDecimal joy) {
    this.joy = joy;
  }

  public EmotionScores sadness(BigDecimal sadness) {
    this.sadness = sadness;
    return this;
  }

   /**
   * Sadness score from 0 to 1. A higher score means that the text is more likely to convey sadness
   * @return sadness
  **/
  @JsonProperty("sadness")
  @ApiModelProperty(value = "Sadness score from 0 to 1. A higher score means that the text is more likely to convey sadness")
  public BigDecimal getSadness() {
    return sadness;
  }

  public void setSadness(BigDecimal sadness) {
    this.sadness = sadness;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmotionScores emotionScores = (EmotionScores) o;
    return Objects.equals(this.anger, emotionScores.anger) &&
        Objects.equals(this.disgust, emotionScores.disgust) &&
        Objects.equals(this.fear, emotionScores.fear) &&
        Objects.equals(this.joy, emotionScores.joy) &&
        Objects.equals(this.sadness, emotionScores.sadness);
  }

  @Override
  public int hashCode() {
    return Objects.hash(anger, disgust, fear, joy, sadness);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmotionScores {\n");
    
    sb.append("    anger: ").append(toIndentedString(anger)).append("\n");
    sb.append("    disgust: ").append(toIndentedString(disgust)).append("\n");
    sb.append("    fear: ").append(toIndentedString(fear)).append("\n");
    sb.append("    joy: ").append(toIndentedString(joy)).append("\n");
    sb.append("    sadness: ").append(toIndentedString(sadness)).append("\n");
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

