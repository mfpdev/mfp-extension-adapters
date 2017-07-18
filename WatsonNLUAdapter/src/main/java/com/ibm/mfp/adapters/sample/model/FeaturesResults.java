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
import com.ibm.mfp.adapters.sample.model.CategoriesResult;
import com.ibm.mfp.adapters.sample.model.ConceptsResult;
import com.ibm.mfp.adapters.sample.model.EmotionResult;
import com.ibm.mfp.adapters.sample.model.EntitiesResult;
import com.ibm.mfp.adapters.sample.model.KeywordsResult;
import com.ibm.mfp.adapters.sample.model.MetadataResult;
import com.ibm.mfp.adapters.sample.model.RelationsResult;
import com.ibm.mfp.adapters.sample.model.SemanticRolesResult;
import com.ibm.mfp.adapters.sample.model.SentimentResult;
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
 * Analysis results for each requested feature
 */
@ApiModel(description = "Analysis results for each requested feature")
@javax.annotation.Generated(value = "com.github.mfpdev.adapters.swagger.codegen.MfpAdapterCodegen", date = "2017-07-18T18:06:10.304+05:30")
public class FeaturesResults   {
  @JsonProperty("concepts")
  private List<ConceptsResult> concepts = null;

  @JsonProperty("entities")
  private List<EntitiesResult> entities = null;

  @JsonProperty("keywords")
  private List<KeywordsResult> keywords = null;

  @JsonProperty("categories")
  private List<CategoriesResult> categories = null;

  @JsonProperty("emotion")
  private EmotionResult emotion = null;

  @JsonProperty("metadata")
  private MetadataResult metadata = null;

  @JsonProperty("relations")
  private List<RelationsResult> relations = null;

  @JsonProperty("semantic_roles")
  private List<SemanticRolesResult> semanticRoles = null;

  @JsonProperty("sentiment")
  private SentimentResult sentiment = null;

  public FeaturesResults concepts(List<ConceptsResult> concepts) {
    this.concepts = concepts;
    return this;
  }

  public FeaturesResults addConceptsItem(ConceptsResult conceptsItem) {
    if (this.concepts == null) {
      this.concepts = new ArrayList<ConceptsResult>();
    }
    this.concepts.add(conceptsItem);
    return this;
  }

   /**
   * The general concepts referenced or alluded to in the specified content
   * @return concepts
  **/
  @JsonProperty("concepts")
  @ApiModelProperty(value = "The general concepts referenced or alluded to in the specified content")
  public List<ConceptsResult> getConcepts() {
    return concepts;
  }

  public void setConcepts(List<ConceptsResult> concepts) {
    this.concepts = concepts;
  }

  public FeaturesResults entities(List<EntitiesResult> entities) {
    this.entities = entities;
    return this;
  }

  public FeaturesResults addEntitiesItem(EntitiesResult entitiesItem) {
    if (this.entities == null) {
      this.entities = new ArrayList<EntitiesResult>();
    }
    this.entities.add(entitiesItem);
    return this;
  }

   /**
   * The important entities in the specified content
   * @return entities
  **/
  @JsonProperty("entities")
  @ApiModelProperty(value = "The important entities in the specified content")
  public List<EntitiesResult> getEntities() {
    return entities;
  }

  public void setEntities(List<EntitiesResult> entities) {
    this.entities = entities;
  }

  public FeaturesResults keywords(List<KeywordsResult> keywords) {
    this.keywords = keywords;
    return this;
  }

  public FeaturesResults addKeywordsItem(KeywordsResult keywordsItem) {
    if (this.keywords == null) {
      this.keywords = new ArrayList<KeywordsResult>();
    }
    this.keywords.add(keywordsItem);
    return this;
  }

   /**
   * The important keywords in content organized by relevance
   * @return keywords
  **/
  @JsonProperty("keywords")
  @ApiModelProperty(value = "The important keywords in content organized by relevance")
  public List<KeywordsResult> getKeywords() {
    return keywords;
  }

  public void setKeywords(List<KeywordsResult> keywords) {
    this.keywords = keywords;
  }

  public FeaturesResults categories(List<CategoriesResult> categories) {
    this.categories = categories;
    return this;
  }

  public FeaturesResults addCategoriesItem(CategoriesResult categoriesItem) {
    if (this.categories == null) {
      this.categories = new ArrayList<CategoriesResult>();
    }
    this.categories.add(categoriesItem);
    return this;
  }

   /**
   * The hierarchical 5-level taxonomy the content is categorized into
   * @return categories
  **/
  @JsonProperty("categories")
  @ApiModelProperty(value = "The hierarchical 5-level taxonomy the content is categorized into")
  public List<CategoriesResult> getCategories() {
    return categories;
  }

  public void setCategories(List<CategoriesResult> categories) {
    this.categories = categories;
  }

  public FeaturesResults emotion(EmotionResult emotion) {
    this.emotion = emotion;
    return this;
  }

   /**
   * The anger, disgust, fear, joy, or sadness conveyed by the content
   * @return emotion
  **/
  @JsonProperty("emotion")
  @ApiModelProperty(value = "The anger, disgust, fear, joy, or sadness conveyed by the content")
  public EmotionResult getEmotion() {
    return emotion;
  }

  public void setEmotion(EmotionResult emotion) {
    this.emotion = emotion;
  }

  public FeaturesResults metadata(MetadataResult metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * The metadata holds author information, publication date and the title of the text/HTML content
   * @return metadata
  **/
  @JsonProperty("metadata")
  @ApiModelProperty(value = "The metadata holds author information, publication date and the title of the text/HTML content")
  public MetadataResult getMetadata() {
    return metadata;
  }

  public void setMetadata(MetadataResult metadata) {
    this.metadata = metadata;
  }

  public FeaturesResults relations(List<RelationsResult> relations) {
    this.relations = relations;
    return this;
  }

  public FeaturesResults addRelationsItem(RelationsResult relationsItem) {
    if (this.relations == null) {
      this.relations = new ArrayList<RelationsResult>();
    }
    this.relations.add(relationsItem);
    return this;
  }

   /**
   * The relationships between entities in the content
   * @return relations
  **/
  @JsonProperty("relations")
  @ApiModelProperty(value = "The relationships between entities in the content")
  public List<RelationsResult> getRelations() {
    return relations;
  }

  public void setRelations(List<RelationsResult> relations) {
    this.relations = relations;
  }

  public FeaturesResults semanticRoles(List<SemanticRolesResult> semanticRoles) {
    this.semanticRoles = semanticRoles;
    return this;
  }

  public FeaturesResults addSemanticRolesItem(SemanticRolesResult semanticRolesItem) {
    if (this.semanticRoles == null) {
      this.semanticRoles = new ArrayList<SemanticRolesResult>();
    }
    this.semanticRoles.add(semanticRolesItem);
    return this;
  }

   /**
   * The subjects of actions and the objects the actions act upon
   * @return semanticRoles
  **/
  @JsonProperty("semantic_roles")
  @ApiModelProperty(value = "The subjects of actions and the objects the actions act upon")
  public List<SemanticRolesResult> getSemanticRoles() {
    return semanticRoles;
  }

  public void setSemanticRoles(List<SemanticRolesResult> semanticRoles) {
    this.semanticRoles = semanticRoles;
  }

  public FeaturesResults sentiment(SentimentResult sentiment) {
    this.sentiment = sentiment;
    return this;
  }

   /**
   * The sentiment of the content
   * @return sentiment
  **/
  @JsonProperty("sentiment")
  @ApiModelProperty(value = "The sentiment of the content")
  public SentimentResult getSentiment() {
    return sentiment;
  }

  public void setSentiment(SentimentResult sentiment) {
    this.sentiment = sentiment;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeaturesResults featuresResults = (FeaturesResults) o;
    return Objects.equals(this.concepts, featuresResults.concepts) &&
        Objects.equals(this.entities, featuresResults.entities) &&
        Objects.equals(this.keywords, featuresResults.keywords) &&
        Objects.equals(this.categories, featuresResults.categories) &&
        Objects.equals(this.emotion, featuresResults.emotion) &&
        Objects.equals(this.metadata, featuresResults.metadata) &&
        Objects.equals(this.relations, featuresResults.relations) &&
        Objects.equals(this.semanticRoles, featuresResults.semanticRoles) &&
        Objects.equals(this.sentiment, featuresResults.sentiment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(concepts, entities, keywords, categories, emotion, metadata, relations, semanticRoles, sentiment);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeaturesResults {\n");
    
    sb.append("    concepts: ").append(toIndentedString(concepts)).append("\n");
    sb.append("    entities: ").append(toIndentedString(entities)).append("\n");
    sb.append("    keywords: ").append(toIndentedString(keywords)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    emotion: ").append(toIndentedString(emotion)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    relations: ").append(toIndentedString(relations)).append("\n");
    sb.append("    semanticRoles: ").append(toIndentedString(semanticRoles)).append("\n");
    sb.append("    sentiment: ").append(toIndentedString(sentiment)).append("\n");
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

