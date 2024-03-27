/*
 * performanceEnablement
 * The Performance Management service enables applications to access and create feedback about workers in the system.
 *
 * The version of the OpenAPI document: v5
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.konfigthis.client.model.FeedbackQuestionD396fd5bffec10001393481822cd0007;
import com.konfigthis.client.model.MultipleChoiceAnswers06c0300303a9100019828d5ca44a0000;
import com.konfigthis.client.model.PossibleMultipleChoiceAnswers4c60c128c16510000a59980041610000;
import com.konfigthis.client.model.QuestionType544916c1cd75100006c4f105d3f60000;
import com.konfigthis.client.model.RelatesToC836a10b43ed10000beb5b92b4c10000;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.konfigthis.client.JSON;

/**
 * RequestedFeedbackCommentsD396fd5bffec10001393477e77870000AllOf
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class RequestedFeedbackCommentsD396fd5bffec10001393477e77870000AllOf {
  public static final String SERIALIZED_NAME_FEEDBACK_DECLINED = "feedbackDeclined";
  @SerializedName(SERIALIZED_NAME_FEEDBACK_DECLINED)
  private Boolean feedbackDeclined;

  public static final String SERIALIZED_NAME_FEEDBACK_DECLINE_REASON = "feedbackDeclineReason";
  @SerializedName(SERIALIZED_NAME_FEEDBACK_DECLINE_REASON)
  private String feedbackDeclineReason;

  public static final String SERIALIZED_NAME_POSSIBLE_MULTIPLE_CHOICE_ANSWERS = "possibleMultipleChoiceAnswers";
  @SerializedName(SERIALIZED_NAME_POSSIBLE_MULTIPLE_CHOICE_ANSWERS)
  private List<PossibleMultipleChoiceAnswers4c60c128c16510000a59980041610000> possibleMultipleChoiceAnswers = null;

  public static final String SERIALIZED_NAME_QUESTION_TYPE = "questionType";
  @SerializedName(SERIALIZED_NAME_QUESTION_TYPE)
  private QuestionType544916c1cd75100006c4f105d3f60000 questionType;

  public static final String SERIALIZED_NAME_MULTIPLE_CHOICE_ANSWERS = "multipleChoiceAnswers";
  @SerializedName(SERIALIZED_NAME_MULTIPLE_CHOICE_ANSWERS)
  private List<MultipleChoiceAnswers06c0300303a9100019828d5ca44a0000> multipleChoiceAnswers = null;

  public static final String SERIALIZED_NAME_NUMERIC_ANSWER = "numericAnswer";
  @SerializedName(SERIALIZED_NAME_NUMERIC_ANSWER)
  private Integer numericAnswer;

  public static final String SERIALIZED_NAME_DATE_ANSWER = "dateAnswer";
  @SerializedName(SERIALIZED_NAME_DATE_ANSWER)
  private LocalDate dateAnswer;

  public static final String SERIALIZED_NAME_RESPONSE = "response";
  @SerializedName(SERIALIZED_NAME_RESPONSE)
  private String response;

  public static final String SERIALIZED_NAME_RELATES_TO = "relatesTo";
  @SerializedName(SERIALIZED_NAME_RELATES_TO)
  private List<RelatesToC836a10b43ed10000beb5b92b4c10000> relatesTo = null;

  public static final String SERIALIZED_NAME_FEEDBACK_QUESTION = "feedbackQuestion";
  @SerializedName(SERIALIZED_NAME_FEEDBACK_QUESTION)
  private FeedbackQuestionD396fd5bffec10001393481822cd0007 feedbackQuestion;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_DESCRIPTOR = "descriptor";
  @SerializedName(SERIALIZED_NAME_DESCRIPTOR)
  private String descriptor;

  public RequestedFeedbackCommentsD396fd5bffec10001393477e77870000AllOf() {
  }

  
  public RequestedFeedbackCommentsD396fd5bffec10001393477e77870000AllOf(
     List<PossibleMultipleChoiceAnswers4c60c128c16510000a59980041610000> possibleMultipleChoiceAnswers, 
     List<RelatesToC836a10b43ed10000beb5b92b4c10000> relatesTo
  ) {
    this();
    this.possibleMultipleChoiceAnswers = possibleMultipleChoiceAnswers;
    this.relatesTo = relatesTo;
  }

  public RequestedFeedbackCommentsD396fd5bffec10001393477e77870000AllOf feedbackDeclined(Boolean feedbackDeclined) {
    
    
    
    
    this.feedbackDeclined = feedbackDeclined;
    return this;
  }

   /**
   * Returns True if the responder declined to submit a response to a specific feedback question.
   * @return feedbackDeclined
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Returns True if the responder declined to submit a response to a specific feedback question.")

  public Boolean getFeedbackDeclined() {
    return feedbackDeclined;
  }


  public void setFeedbackDeclined(Boolean feedbackDeclined) {
    
    
    
    this.feedbackDeclined = feedbackDeclined;
  }


  public RequestedFeedbackCommentsD396fd5bffec10001393477e77870000AllOf feedbackDeclineReason(String feedbackDeclineReason) {
    
    
    
    
    this.feedbackDeclineReason = feedbackDeclineReason;
    return this;
  }

   /**
   * The reason a requested feedback question was declined.
   * @return feedbackDeclineReason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Lorem ipsum dolor sit amet, cum choro singulis consectetuer ut, ubique iisque contentiones ex duo. Quo lorem etiam eu.", value = "The reason a requested feedback question was declined.")

  public String getFeedbackDeclineReason() {
    return feedbackDeclineReason;
  }


  public void setFeedbackDeclineReason(String feedbackDeclineReason) {
    
    
    
    this.feedbackDeclineReason = feedbackDeclineReason;
  }


   /**
   * All possible multiple choice answers available to the feedback question.
   * @return possibleMultipleChoiceAnswers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "All possible multiple choice answers available to the feedback question.")

  public List<PossibleMultipleChoiceAnswers4c60c128c16510000a59980041610000> getPossibleMultipleChoiceAnswers() {
    return possibleMultipleChoiceAnswers;
  }




  public RequestedFeedbackCommentsD396fd5bffec10001393477e77870000AllOf questionType(QuestionType544916c1cd75100006c4f105d3f60000 questionType) {
    
    
    
    
    this.questionType = questionType;
    return this;
  }

   /**
   * Get questionType
   * @return questionType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public QuestionType544916c1cd75100006c4f105d3f60000 getQuestionType() {
    return questionType;
  }


  public void setQuestionType(QuestionType544916c1cd75100006c4f105d3f60000 questionType) {
    
    
    
    this.questionType = questionType;
  }


  public RequestedFeedbackCommentsD396fd5bffec10001393477e77870000AllOf multipleChoiceAnswers(List<MultipleChoiceAnswers06c0300303a9100019828d5ca44a0000> multipleChoiceAnswers) {
    
    
    
    
    this.multipleChoiceAnswers = multipleChoiceAnswers;
    return this;
  }

  public RequestedFeedbackCommentsD396fd5bffec10001393477e77870000AllOf addMultipleChoiceAnswersItem(MultipleChoiceAnswers06c0300303a9100019828d5ca44a0000 multipleChoiceAnswersItem) {
    if (this.multipleChoiceAnswers == null) {
      this.multipleChoiceAnswers = new ArrayList<>();
    }
    this.multipleChoiceAnswers.add(multipleChoiceAnswersItem);
    return this;
  }

   /**
   * The answers selected from the feedback multiple choice question.
   * @return multipleChoiceAnswers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The answers selected from the feedback multiple choice question.")

  public List<MultipleChoiceAnswers06c0300303a9100019828d5ca44a0000> getMultipleChoiceAnswers() {
    return multipleChoiceAnswers;
  }


  public void setMultipleChoiceAnswers(List<MultipleChoiceAnswers06c0300303a9100019828d5ca44a0000> multipleChoiceAnswers) {
    
    
    
    this.multipleChoiceAnswers = multipleChoiceAnswers;
  }


  public RequestedFeedbackCommentsD396fd5bffec10001393477e77870000AllOf numericAnswer(Integer numericAnswer) {
    
    
    
    
    this.numericAnswer = numericAnswer;
    return this;
  }

   /**
   * The numeric answer from the Number question type.
   * @return numericAnswer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "523672239", value = "The numeric answer from the Number question type.")

  public Integer getNumericAnswer() {
    return numericAnswer;
  }


  public void setNumericAnswer(Integer numericAnswer) {
    
    
    
    this.numericAnswer = numericAnswer;
  }


  public RequestedFeedbackCommentsD396fd5bffec10001393477e77870000AllOf dateAnswer(LocalDate dateAnswer) {
    
    
    
    
    this.dateAnswer = dateAnswer;
    return this;
  }

   /**
   * The date answer from the Date question type.
   * @return dateAnswer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date answer from the Date question type.")

  public LocalDate getDateAnswer() {
    return dateAnswer;
  }


  public void setDateAnswer(LocalDate dateAnswer) {
    
    
    
    this.dateAnswer = dateAnswer;
  }


  public RequestedFeedbackCommentsD396fd5bffec10001393477e77870000AllOf response(String response) {
    
    
    
    
    this.response = response;
    return this;
  }

   /**
   * The feedback response for a feedback question.
   * @return response
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Lorem ipsum dolor sit amet, cum choro singulis consectetuer ut, ubique iisque contentiones ex duo. Quo lorem etiam eu.", value = "The feedback response for a feedback question.")

  public String getResponse() {
    return response;
  }


  public void setResponse(String response) {
    
    
    
    this.response = response;
  }


   /**
   * The talent tags that relate to the feedback question or response.
   * @return relatesTo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The talent tags that relate to the feedback question or response.")

  public List<RelatesToC836a10b43ed10000beb5b92b4c10000> getRelatesTo() {
    return relatesTo;
  }




  public RequestedFeedbackCommentsD396fd5bffec10001393477e77870000AllOf feedbackQuestion(FeedbackQuestionD396fd5bffec10001393481822cd0007 feedbackQuestion) {
    
    
    
    
    this.feedbackQuestion = feedbackQuestion;
    return this;
  }

   /**
   * Get feedbackQuestion
   * @return feedbackQuestion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public FeedbackQuestionD396fd5bffec10001393481822cd0007 getFeedbackQuestion() {
    return feedbackQuestion;
  }


  public void setFeedbackQuestion(FeedbackQuestionD396fd5bffec10001393481822cd0007 feedbackQuestion) {
    
    
    
    this.feedbackQuestion = feedbackQuestion;
  }


  public RequestedFeedbackCommentsD396fd5bffec10001393477e77870000AllOf id(String id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * Id of the instance
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Id of the instance")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    
    
    
    this.id = id;
  }


  public RequestedFeedbackCommentsD396fd5bffec10001393477e77870000AllOf descriptor(String descriptor) {
    
    
    
    
    this.descriptor = descriptor;
    return this;
  }

   /**
   * A preview of the instance
   * @return descriptor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Lorem ipsum dolor sit ame", value = "A preview of the instance")

  public String getDescriptor() {
    return descriptor;
  }


  public void setDescriptor(String descriptor) {
    
    
    
    this.descriptor = descriptor;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the RequestedFeedbackCommentsD396fd5bffec10001393477e77870000AllOf instance itself
   */
  public RequestedFeedbackCommentsD396fd5bffec10001393477e77870000AllOf putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestedFeedbackCommentsD396fd5bffec10001393477e77870000AllOf requestedFeedbackCommentsD396fd5bffec10001393477e77870000AllOf = (RequestedFeedbackCommentsD396fd5bffec10001393477e77870000AllOf) o;
    return Objects.equals(this.feedbackDeclined, requestedFeedbackCommentsD396fd5bffec10001393477e77870000AllOf.feedbackDeclined) &&
        Objects.equals(this.feedbackDeclineReason, requestedFeedbackCommentsD396fd5bffec10001393477e77870000AllOf.feedbackDeclineReason) &&
        Objects.equals(this.possibleMultipleChoiceAnswers, requestedFeedbackCommentsD396fd5bffec10001393477e77870000AllOf.possibleMultipleChoiceAnswers) &&
        Objects.equals(this.questionType, requestedFeedbackCommentsD396fd5bffec10001393477e77870000AllOf.questionType) &&
        Objects.equals(this.multipleChoiceAnswers, requestedFeedbackCommentsD396fd5bffec10001393477e77870000AllOf.multipleChoiceAnswers) &&
        Objects.equals(this.numericAnswer, requestedFeedbackCommentsD396fd5bffec10001393477e77870000AllOf.numericAnswer) &&
        Objects.equals(this.dateAnswer, requestedFeedbackCommentsD396fd5bffec10001393477e77870000AllOf.dateAnswer) &&
        Objects.equals(this.response, requestedFeedbackCommentsD396fd5bffec10001393477e77870000AllOf.response) &&
        Objects.equals(this.relatesTo, requestedFeedbackCommentsD396fd5bffec10001393477e77870000AllOf.relatesTo) &&
        Objects.equals(this.feedbackQuestion, requestedFeedbackCommentsD396fd5bffec10001393477e77870000AllOf.feedbackQuestion) &&
        Objects.equals(this.id, requestedFeedbackCommentsD396fd5bffec10001393477e77870000AllOf.id) &&
        Objects.equals(this.descriptor, requestedFeedbackCommentsD396fd5bffec10001393477e77870000AllOf.descriptor)&&
        Objects.equals(this.additionalProperties, requestedFeedbackCommentsD396fd5bffec10001393477e77870000AllOf.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(feedbackDeclined, feedbackDeclineReason, possibleMultipleChoiceAnswers, questionType, multipleChoiceAnswers, numericAnswer, dateAnswer, response, relatesTo, feedbackQuestion, id, descriptor, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestedFeedbackCommentsD396fd5bffec10001393477e77870000AllOf {\n");
    sb.append("    feedbackDeclined: ").append(toIndentedString(feedbackDeclined)).append("\n");
    sb.append("    feedbackDeclineReason: ").append(toIndentedString(feedbackDeclineReason)).append("\n");
    sb.append("    possibleMultipleChoiceAnswers: ").append(toIndentedString(possibleMultipleChoiceAnswers)).append("\n");
    sb.append("    questionType: ").append(toIndentedString(questionType)).append("\n");
    sb.append("    multipleChoiceAnswers: ").append(toIndentedString(multipleChoiceAnswers)).append("\n");
    sb.append("    numericAnswer: ").append(toIndentedString(numericAnswer)).append("\n");
    sb.append("    dateAnswer: ").append(toIndentedString(dateAnswer)).append("\n");
    sb.append("    response: ").append(toIndentedString(response)).append("\n");
    sb.append("    relatesTo: ").append(toIndentedString(relatesTo)).append("\n");
    sb.append("    feedbackQuestion: ").append(toIndentedString(feedbackQuestion)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    descriptor: ").append(toIndentedString(descriptor)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("feedbackDeclined");
    openapiFields.add("feedbackDeclineReason");
    openapiFields.add("possibleMultipleChoiceAnswers");
    openapiFields.add("questionType");
    openapiFields.add("multipleChoiceAnswers");
    openapiFields.add("numericAnswer");
    openapiFields.add("dateAnswer");
    openapiFields.add("response");
    openapiFields.add("relatesTo");
    openapiFields.add("feedbackQuestion");
    openapiFields.add("id");
    openapiFields.add("descriptor");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RequestedFeedbackCommentsD396fd5bffec10001393477e77870000AllOf
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!RequestedFeedbackCommentsD396fd5bffec10001393477e77870000AllOf.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RequestedFeedbackCommentsD396fd5bffec10001393477e77870000AllOf is not found in the empty JSON string", RequestedFeedbackCommentsD396fd5bffec10001393477e77870000AllOf.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("feedbackDeclineReason") != null && !jsonObj.get("feedbackDeclineReason").isJsonNull()) && !jsonObj.get("feedbackDeclineReason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `feedbackDeclineReason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("feedbackDeclineReason").toString()));
      }
      if (jsonObj.get("possibleMultipleChoiceAnswers") != null && !jsonObj.get("possibleMultipleChoiceAnswers").isJsonNull()) {
        JsonArray jsonArraypossibleMultipleChoiceAnswers = jsonObj.getAsJsonArray("possibleMultipleChoiceAnswers");
        if (jsonArraypossibleMultipleChoiceAnswers != null) {
          // ensure the json data is an array
          if (!jsonObj.get("possibleMultipleChoiceAnswers").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `possibleMultipleChoiceAnswers` to be an array in the JSON string but got `%s`", jsonObj.get("possibleMultipleChoiceAnswers").toString()));
          }

          // validate the optional field `possibleMultipleChoiceAnswers` (array)
          for (int i = 0; i < jsonArraypossibleMultipleChoiceAnswers.size(); i++) {
            PossibleMultipleChoiceAnswers4c60c128c16510000a59980041610000.validateJsonObject(jsonArraypossibleMultipleChoiceAnswers.get(i).getAsJsonObject());
          };
        }
      }
      // validate the optional field `questionType`
      if (jsonObj.get("questionType") != null && !jsonObj.get("questionType").isJsonNull()) {
        QuestionType544916c1cd75100006c4f105d3f60000.validateJsonObject(jsonObj.getAsJsonObject("questionType"));
      }
      if (jsonObj.get("multipleChoiceAnswers") != null && !jsonObj.get("multipleChoiceAnswers").isJsonNull()) {
        JsonArray jsonArraymultipleChoiceAnswers = jsonObj.getAsJsonArray("multipleChoiceAnswers");
        if (jsonArraymultipleChoiceAnswers != null) {
          // ensure the json data is an array
          if (!jsonObj.get("multipleChoiceAnswers").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `multipleChoiceAnswers` to be an array in the JSON string but got `%s`", jsonObj.get("multipleChoiceAnswers").toString()));
          }

          // validate the optional field `multipleChoiceAnswers` (array)
          for (int i = 0; i < jsonArraymultipleChoiceAnswers.size(); i++) {
            MultipleChoiceAnswers06c0300303a9100019828d5ca44a0000.validateJsonObject(jsonArraymultipleChoiceAnswers.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("response") != null && !jsonObj.get("response").isJsonNull()) && !jsonObj.get("response").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `response` to be a primitive type in the JSON string but got `%s`", jsonObj.get("response").toString()));
      }
      if (jsonObj.get("relatesTo") != null && !jsonObj.get("relatesTo").isJsonNull()) {
        JsonArray jsonArrayrelatesTo = jsonObj.getAsJsonArray("relatesTo");
        if (jsonArrayrelatesTo != null) {
          // ensure the json data is an array
          if (!jsonObj.get("relatesTo").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `relatesTo` to be an array in the JSON string but got `%s`", jsonObj.get("relatesTo").toString()));
          }

          // validate the optional field `relatesTo` (array)
          for (int i = 0; i < jsonArrayrelatesTo.size(); i++) {
            RelatesToC836a10b43ed10000beb5b92b4c10000.validateJsonObject(jsonArrayrelatesTo.get(i).getAsJsonObject());
          };
        }
      }
      // validate the optional field `feedbackQuestion`
      if (jsonObj.get("feedbackQuestion") != null && !jsonObj.get("feedbackQuestion").isJsonNull()) {
        FeedbackQuestionD396fd5bffec10001393481822cd0007.validateJsonObject(jsonObj.getAsJsonObject("feedbackQuestion"));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("descriptor") != null && !jsonObj.get("descriptor").isJsonNull()) && !jsonObj.get("descriptor").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `descriptor` to be a primitive type in the JSON string but got `%s`", jsonObj.get("descriptor").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RequestedFeedbackCommentsD396fd5bffec10001393477e77870000AllOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RequestedFeedbackCommentsD396fd5bffec10001393477e77870000AllOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RequestedFeedbackCommentsD396fd5bffec10001393477e77870000AllOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RequestedFeedbackCommentsD396fd5bffec10001393477e77870000AllOf.class));

       return (TypeAdapter<T>) new TypeAdapter<RequestedFeedbackCommentsD396fd5bffec10001393477e77870000AllOf>() {
           @Override
           public void write(JsonWriter out, RequestedFeedbackCommentsD396fd5bffec10001393477e77870000AllOf value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public RequestedFeedbackCommentsD396fd5bffec10001393477e77870000AllOf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             RequestedFeedbackCommentsD396fd5bffec10001393477e77870000AllOf instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RequestedFeedbackCommentsD396fd5bffec10001393477e77870000AllOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RequestedFeedbackCommentsD396fd5bffec10001393477e77870000AllOf
  * @throws IOException if the JSON string is invalid with respect to RequestedFeedbackCommentsD396fd5bffec10001393477e77870000AllOf
  */
  public static RequestedFeedbackCommentsD396fd5bffec10001393477e77870000AllOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RequestedFeedbackCommentsD396fd5bffec10001393477e77870000AllOf.class);
  }

 /**
  * Convert an instance of RequestedFeedbackCommentsD396fd5bffec10001393477e77870000AllOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
