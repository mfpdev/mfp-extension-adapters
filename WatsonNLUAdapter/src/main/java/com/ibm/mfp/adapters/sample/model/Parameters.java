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
import com.ibm.mfp.adapters.sample.model.Features;
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
 * An object containing request parameters
 */
@ApiModel(description = "An object containing request parameters")
@javax.annotation.Generated(value = "com.github.mfpdev.adapters.swagger.codegen.MfpAdapterCodegen", date = "2017-09-04T17:58:15.838+05:30")
public class Parameters   {
  @JsonProperty("text")
  private String text = null;

  @JsonProperty("html")
  private String html = null;

  @JsonProperty("url")
  private String url = null;

  @JsonProperty("features")
  private Features features = null;

  @JsonProperty("clean")
  private Boolean clean = true;

  @JsonProperty("xpath")
  private String xpath = null;

  @JsonProperty("fallback_to_raw")
  private Boolean fallbackToRaw = true;

  @JsonProperty("return_analyzed_text")
  private Boolean returnAnalyzedText = false;

  @JsonProperty("language")
  private String language = null;

  public Parameters text(String text) {
    this.text = text;
    return this;
  }

   /**
   * The plain text to analyze
   * @return text
  **/
  @JsonProperty("text")
  @ApiModelProperty(value = "The plain text to analyze")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public Parameters html(String html) {
    this.html = html;
    return this;
  }

   /**
   * The HTML file to analyze
   * @return html
  **/
  @JsonProperty("html")
  @ApiModelProperty(value = "The HTML file to analyze")
  public String getHtml() {
    return html;
  }

  public void setHtml(String html) {
    this.html = html;
  }

  public Parameters url(String url) {
    this.url = url;
    return this;
  }

   /**
   * The web page to analyze
   * @return url
  **/
  @JsonProperty("url")
  @ApiModelProperty(value = "The web page to analyze")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public Parameters features(Features features) {
    this.features = features;
    return this;
  }

   /**
   * Specific features to analyze the document for
   * @return features
  **/
  @JsonProperty("features")
  @ApiModelProperty(required = true, value = "Specific features to analyze the document for")
  @NotNull
  public Features getFeatures() {
    return features;
  }

  public void setFeatures(Features features) {
    this.features = features;
  }

  public Parameters clean(Boolean clean) {
    this.clean = clean;
    return this;
  }

   /**
   * Remove website elements, such as links, ads, etc
   * @return clean
  **/
  @JsonProperty("clean")
  @ApiModelProperty(value = "Remove website elements, such as links, ads, etc")
  public Boolean getClean() {
    return clean;
  }

  public void setClean(Boolean clean) {
    this.clean = clean;
  }

  public Parameters xpath(String xpath) {
    this.xpath = xpath;
    return this;
  }

   /**
   * XPath query for targeting nodes in HTML
   * @return xpath
  **/
  @JsonProperty("xpath")
  @ApiModelProperty(value = "XPath query for targeting nodes in HTML")
  public String getXpath() {
    return xpath;
  }

  public void setXpath(String xpath) {
    this.xpath = xpath;
  }

  public Parameters fallbackToRaw(Boolean fallbackToRaw) {
    this.fallbackToRaw = fallbackToRaw;
    return this;
  }

   /**
   * Whether to use raw HTML content if text cleaning fails
   * @return fallbackToRaw
  **/
  @JsonProperty("fallback_to_raw")
  @ApiModelProperty(value = "Whether to use raw HTML content if text cleaning fails")
  public Boolean getFallbackToRaw() {
    return fallbackToRaw;
  }

  public void setFallbackToRaw(Boolean fallbackToRaw) {
    this.fallbackToRaw = fallbackToRaw;
  }

  public Parameters returnAnalyzedText(Boolean returnAnalyzedText) {
    this.returnAnalyzedText = returnAnalyzedText;
    return this;
  }

   /**
   * Whether or not to return the analyzed text
   * @return returnAnalyzedText
  **/
  @JsonProperty("return_analyzed_text")
  @ApiModelProperty(value = "Whether or not to return the analyzed text")
  public Boolean getReturnAnalyzedText() {
    return returnAnalyzedText;
  }

  public void setReturnAnalyzedText(Boolean returnAnalyzedText) {
    this.returnAnalyzedText = returnAnalyzedText;
  }

  public Parameters language(String language) {
    this.language = language;
    return this;
  }

   /**
   * ISO 639-1 code indicating the language to use in the analysis
   * @return language
  **/
  @JsonProperty("language")
  @ApiModelProperty(value = "ISO 639-1 code indicating the language to use in the analysis")
  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Parameters parameters = (Parameters) o;
    return Objects.equals(this.text, parameters.text) &&
        Objects.equals(this.html, parameters.html) &&
        Objects.equals(this.url, parameters.url) &&
        Objects.equals(this.features, parameters.features) &&
        Objects.equals(this.clean, parameters.clean) &&
        Objects.equals(this.xpath, parameters.xpath) &&
        Objects.equals(this.fallbackToRaw, parameters.fallbackToRaw) &&
        Objects.equals(this.returnAnalyzedText, parameters.returnAnalyzedText) &&
        Objects.equals(this.language, parameters.language);
  }

  @Override
  public int hashCode() {
    return Objects.hash(text, html, url, features, clean, xpath, fallbackToRaw, returnAnalyzedText, language);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Parameters {\n");
    
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    html: ").append(toIndentedString(html)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    features: ").append(toIndentedString(features)).append("\n");
    sb.append("    clean: ").append(toIndentedString(clean)).append("\n");
    sb.append("    xpath: ").append(toIndentedString(xpath)).append("\n");
    sb.append("    fallbackToRaw: ").append(toIndentedString(fallbackToRaw)).append("\n");
    sb.append("    returnAnalyzedText: ").append(toIndentedString(returnAnalyzedText)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
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

