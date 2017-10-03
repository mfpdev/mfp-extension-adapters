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
 * Tone Analyzer
 * ### Service Overview The IBM Watson&trade; Tone Analyzer service uses linguistic analysis to detect emotional, social, and language tones in written text. The service can analyze tone at both the document and sentence levels. You can use the service to understand how your written communications are perceived and then to improve the tone of your communications. Businesses can use the service to learn the tone of their customers' communications and to respond to each customer appropriately, or to understand and improve their customer conversations. ### API Usage The following information provides details about using the service to analyze tone: * **The tone method:** The service offers `GET` and `POST /v3/tone` methods that use the general purpose endpoint to analyze the tone of input content. The methods accept a maximum of 128 KB of content in JSON, plain text, or HTML format. * **The tone_chat method:** The service offers a `POST /v3/tone_chat` method that uses the customer engagement endpoint to analyze the tone of customer service and customer support conversations. The method accepts a maximum of 128 KB of content in JSON format. * **Authentication:** You authenticate to the service by using your service credentials. You can use your credentials to authenticate via a proxy server that resides in Bluemix, or you can use your credentials to obtain a token and contact the service directly. See [Service credentials for Watson services](https://console.bluemix.net/docs/services/watson/getting-started-credentials.html) and [Tokens for authentication](https://console.bluemix.net/docs/services/watson/getting-started-tokens.html). * **Request Logging:** By default, all Watson services log requests and their results. Data is collected only to improve the Watson services. If you do not want to share your data, set the header parameter `X-Watson-Learning-Opt-Out` to `true` for each request. Data is collected for any request that omits this header. See [Controlling request logging for Watson services](https://console.bluemix.net/docs/services/watson/getting-started-logging.html).   For more information about the service, see [About Tone Analyzer](https://console.bluemix.net/docs/services/tone-analyzer/index.html).
 *
 * OpenAPI spec version: 3.3.4
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
import com.ibm.mfp.adapters.sample.model.ToneChatScore;
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
 * UtteranceAnalysis
 */
@javax.annotation.Generated(value = "com.github.mfpdev.adapters.swagger.codegen.MfpAdapterCodegen", date = "2017-10-03T17:26:51.394+05:30")
public class UtteranceAnalysis   {
  @JsonProperty("utterance_id")
  private String utteranceId = null;

  @JsonProperty("utterance_text")
  private String utteranceText = null;

  @JsonProperty("tones")
  private List<ToneChatScore> tones = new ArrayList<ToneChatScore>();

  public UtteranceAnalysis utteranceId(String utteranceId) {
    this.utteranceId = utteranceId;
    return this;
  }

   /**
   * The unique identifier of the utterance. The first utterance has ID 0, and the ID of each subsequent utterance is incremented by one.
   * @return utteranceId
  **/
  @JsonProperty("utterance_id")
  @ApiModelProperty(required = true, value = "The unique identifier of the utterance. The first utterance has ID 0, and the ID of each subsequent utterance is incremented by one.")
  @NotNull
  public String getUtteranceId() {
    return utteranceId;
  }

  public void setUtteranceId(String utteranceId) {
    this.utteranceId = utteranceId;
  }

  public UtteranceAnalysis utteranceText(String utteranceText) {
    this.utteranceText = utteranceText;
    return this;
  }

   /**
   * The text of the utterance.
   * @return utteranceText
  **/
  @JsonProperty("utterance_text")
  @ApiModelProperty(required = true, value = "The text of the utterance.")
  @NotNull
  public String getUtteranceText() {
    return utteranceText;
  }

  public void setUtteranceText(String utteranceText) {
    this.utteranceText = utteranceText;
  }

  public UtteranceAnalysis tones(List<ToneChatScore> tones) {
    this.tones = tones;
    return this;
  }

  public UtteranceAnalysis addTonesItem(ToneChatScore tonesItem) {
    this.tones.add(tonesItem);
    return this;
  }

   /**
   * An array of `ToneChatScore` objects that provides results for the most prevalent tones of the utterance. The array includes results for any tone whose score is at least 0.5. The array is empty if no tone has a score that meets this threshold.
   * @return tones
  **/
  @JsonProperty("tones")
  @ApiModelProperty(required = true, value = "An array of `ToneChatScore` objects that provides results for the most prevalent tones of the utterance. The array includes results for any tone whose score is at least 0.5. The array is empty if no tone has a score that meets this threshold.")
  @NotNull
  public List<ToneChatScore> getTones() {
    return tones;
  }

  public void setTones(List<ToneChatScore> tones) {
    this.tones = tones;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UtteranceAnalysis utteranceAnalysis = (UtteranceAnalysis) o;
    return Objects.equals(this.utteranceId, utteranceAnalysis.utteranceId) &&
        Objects.equals(this.utteranceText, utteranceAnalysis.utteranceText) &&
        Objects.equals(this.tones, utteranceAnalysis.tones);
  }

  @Override
  public int hashCode() {
    return Objects.hash(utteranceId, utteranceText, tones);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UtteranceAnalysis {\n");
    
    sb.append("    utteranceId: ").append(toIndentedString(utteranceId)).append("\n");
    sb.append("    utteranceText: ").append(toIndentedString(utteranceText)).append("\n");
    sb.append("    tones: ").append(toIndentedString(tones)).append("\n");
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
