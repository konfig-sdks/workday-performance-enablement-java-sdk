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
import com.konfigthis.client.model.FeedbackResponse2f703c317dc910001bd2de83d1590000;
import com.konfigthis.client.model.QuestionMultipleChoiceFfdd5de32f7f100016c2c1e768f40000;
import com.konfigthis.client.model.QuestionTypeFfdd5de32f7f1000144df15bb77b0001;
import com.konfigthis.client.model.TalentTagFfdd5de32f7f100016c88e016ad20000;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
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
 * RequestedFeedbackQuestionFfdd5de32f7f1000144df0c21e640000AllOf
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class RequestedFeedbackQuestionFfdd5de32f7f1000144df0c21e640000AllOf {
  public static final String SERIALIZED_NAME_RELATES_TO = "relatesTo";
  @SerializedName(SERIALIZED_NAME_RELATES_TO)
  private List<TalentTagFfdd5de32f7f100016c88e016ad20000> relatesTo = null;

  public static final String SERIALIZED_NAME_QUESTION = "question";
  @SerializedName(SERIALIZED_NAME_QUESTION)
  private String question;

  public static final String SERIALIZED_NAME_QUESTION_TYPE = "questionType";
  @SerializedName(SERIALIZED_NAME_QUESTION_TYPE)
  private QuestionTypeFfdd5de32f7f1000144df15bb77b0001 questionType;

  public static final String SERIALIZED_NAME_FEEDBACK_RESPONSE = "feedbackResponse";
  @SerializedName(SERIALIZED_NAME_FEEDBACK_RESPONSE)
  private List<FeedbackResponse2f703c317dc910001bd2de83d1590000> feedbackResponse = null;

  public static final String SERIALIZED_NAME_QUESTION_MULTIPLE_CHOICE_ANSWERS = "questionMultipleChoiceAnswers";
  @SerializedName(SERIALIZED_NAME_QUESTION_MULTIPLE_CHOICE_ANSWERS)
  private List<QuestionMultipleChoiceFfdd5de32f7f100016c2c1e768f40000> questionMultipleChoiceAnswers = null;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_DESCRIPTOR = "descriptor";
  @SerializedName(SERIALIZED_NAME_DESCRIPTOR)
  private String descriptor;

  public RequestedFeedbackQuestionFfdd5de32f7f1000144df0c21e640000AllOf() {
  }

  
  public RequestedFeedbackQuestionFfdd5de32f7f1000144df0c21e640000AllOf(
     List<FeedbackResponse2f703c317dc910001bd2de83d1590000> feedbackResponse, 
     List<QuestionMultipleChoiceFfdd5de32f7f100016c2c1e768f40000> questionMultipleChoiceAnswers
  ) {
    this();
    this.feedbackResponse = feedbackResponse;
    this.questionMultipleChoiceAnswers = questionMultipleChoiceAnswers;
  }

  public RequestedFeedbackQuestionFfdd5de32f7f1000144df0c21e640000AllOf relatesTo(List<TalentTagFfdd5de32f7f100016c88e016ad20000> relatesTo) {
    
    
    
    
    this.relatesTo = relatesTo;
    return this;
  }

  public RequestedFeedbackQuestionFfdd5de32f7f1000144df0c21e640000AllOf addRelatesToItem(TalentTagFfdd5de32f7f100016c88e016ad20000 relatesToItem) {
    if (this.relatesTo == null) {
      this.relatesTo = new ArrayList<>();
    }
    this.relatesTo.add(relatesToItem);
    return this;
  }

   /**
   * The talent tags that relate to feedback question or response for requested feedback events.
   * @return relatesTo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The talent tags that relate to feedback question or response for requested feedback events.")

  public List<TalentTagFfdd5de32f7f100016c88e016ad20000> getRelatesTo() {
    return relatesTo;
  }


  public void setRelatesTo(List<TalentTagFfdd5de32f7f100016c88e016ad20000> relatesTo) {
    
    
    
    this.relatesTo = relatesTo;
  }


  public RequestedFeedbackQuestionFfdd5de32f7f1000144df0c21e640000AllOf question(String question) {
    
    
    
    
    this.question = question;
    return this;
  }

   /**
   * The rich text part of a Question in a feedback request.
   * @return question
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Lorem ipsum dolor sit amet, cum choro singulis consectetuer ut, ubique iisque contentiones ex duo. Quo lorem etiam eu.", value = "The rich text part of a Question in a feedback request.")

  public String getQuestion() {
    return question;
  }


  public void setQuestion(String question) {
    
    
    
    this.question = question;
  }


  public RequestedFeedbackQuestionFfdd5de32f7f1000144df0c21e640000AllOf questionType(QuestionTypeFfdd5de32f7f1000144df15bb77b0001 questionType) {
    
    
    
    
    this.questionType = questionType;
    return this;
  }

   /**
   * Get questionType
   * @return questionType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public QuestionTypeFfdd5de32f7f1000144df15bb77b0001 getQuestionType() {
    return questionType;
  }


  public void setQuestionType(QuestionTypeFfdd5de32f7f1000144df15bb77b0001 questionType) {
    
    
    
    this.questionType = questionType;
  }


   /**
   * All the feedback responses for the feedback question.
   * @return feedbackResponse
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "All the feedback responses for the feedback question.")

  public List<FeedbackResponse2f703c317dc910001bd2de83d1590000> getFeedbackResponse() {
    return feedbackResponse;
  }




   /**
   * Answers for multiple choice questions in requested feedback events.
   * @return questionMultipleChoiceAnswers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Answers for multiple choice questions in requested feedback events.")

  public List<QuestionMultipleChoiceFfdd5de32f7f100016c2c1e768f40000> getQuestionMultipleChoiceAnswers() {
    return questionMultipleChoiceAnswers;
  }




  public RequestedFeedbackQuestionFfdd5de32f7f1000144df0c21e640000AllOf id(String id) {
    
    
    
    
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


  public RequestedFeedbackQuestionFfdd5de32f7f1000144df0c21e640000AllOf descriptor(String descriptor) {
    
    
    
    
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
   * @return the RequestedFeedbackQuestionFfdd5de32f7f1000144df0c21e640000AllOf instance itself
   */
  public RequestedFeedbackQuestionFfdd5de32f7f1000144df0c21e640000AllOf putAdditionalProperty(String key, Object value) {
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
    RequestedFeedbackQuestionFfdd5de32f7f1000144df0c21e640000AllOf requestedFeedbackQuestionFfdd5de32f7f1000144df0c21e640000AllOf = (RequestedFeedbackQuestionFfdd5de32f7f1000144df0c21e640000AllOf) o;
    return Objects.equals(this.relatesTo, requestedFeedbackQuestionFfdd5de32f7f1000144df0c21e640000AllOf.relatesTo) &&
        Objects.equals(this.question, requestedFeedbackQuestionFfdd5de32f7f1000144df0c21e640000AllOf.question) &&
        Objects.equals(this.questionType, requestedFeedbackQuestionFfdd5de32f7f1000144df0c21e640000AllOf.questionType) &&
        Objects.equals(this.feedbackResponse, requestedFeedbackQuestionFfdd5de32f7f1000144df0c21e640000AllOf.feedbackResponse) &&
        Objects.equals(this.questionMultipleChoiceAnswers, requestedFeedbackQuestionFfdd5de32f7f1000144df0c21e640000AllOf.questionMultipleChoiceAnswers) &&
        Objects.equals(this.id, requestedFeedbackQuestionFfdd5de32f7f1000144df0c21e640000AllOf.id) &&
        Objects.equals(this.descriptor, requestedFeedbackQuestionFfdd5de32f7f1000144df0c21e640000AllOf.descriptor)&&
        Objects.equals(this.additionalProperties, requestedFeedbackQuestionFfdd5de32f7f1000144df0c21e640000AllOf.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(relatesTo, question, questionType, feedbackResponse, questionMultipleChoiceAnswers, id, descriptor, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestedFeedbackQuestionFfdd5de32f7f1000144df0c21e640000AllOf {\n");
    sb.append("    relatesTo: ").append(toIndentedString(relatesTo)).append("\n");
    sb.append("    question: ").append(toIndentedString(question)).append("\n");
    sb.append("    questionType: ").append(toIndentedString(questionType)).append("\n");
    sb.append("    feedbackResponse: ").append(toIndentedString(feedbackResponse)).append("\n");
    sb.append("    questionMultipleChoiceAnswers: ").append(toIndentedString(questionMultipleChoiceAnswers)).append("\n");
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
    openapiFields.add("relatesTo");
    openapiFields.add("question");
    openapiFields.add("questionType");
    openapiFields.add("feedbackResponse");
    openapiFields.add("questionMultipleChoiceAnswers");
    openapiFields.add("id");
    openapiFields.add("descriptor");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RequestedFeedbackQuestionFfdd5de32f7f1000144df0c21e640000AllOf
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!RequestedFeedbackQuestionFfdd5de32f7f1000144df0c21e640000AllOf.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RequestedFeedbackQuestionFfdd5de32f7f1000144df0c21e640000AllOf is not found in the empty JSON string", RequestedFeedbackQuestionFfdd5de32f7f1000144df0c21e640000AllOf.openapiRequiredFields.toString()));
        }
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
            TalentTagFfdd5de32f7f100016c88e016ad20000.validateJsonObject(jsonArrayrelatesTo.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("question") != null && !jsonObj.get("question").isJsonNull()) && !jsonObj.get("question").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `question` to be a primitive type in the JSON string but got `%s`", jsonObj.get("question").toString()));
      }
      // validate the optional field `questionType`
      if (jsonObj.get("questionType") != null && !jsonObj.get("questionType").isJsonNull()) {
        QuestionTypeFfdd5de32f7f1000144df15bb77b0001.validateJsonObject(jsonObj.getAsJsonObject("questionType"));
      }
      if (jsonObj.get("feedbackResponse") != null && !jsonObj.get("feedbackResponse").isJsonNull()) {
        JsonArray jsonArrayfeedbackResponse = jsonObj.getAsJsonArray("feedbackResponse");
        if (jsonArrayfeedbackResponse != null) {
          // ensure the json data is an array
          if (!jsonObj.get("feedbackResponse").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `feedbackResponse` to be an array in the JSON string but got `%s`", jsonObj.get("feedbackResponse").toString()));
          }

          // validate the optional field `feedbackResponse` (array)
          for (int i = 0; i < jsonArrayfeedbackResponse.size(); i++) {
            FeedbackResponse2f703c317dc910001bd2de83d1590000.validateJsonObject(jsonArrayfeedbackResponse.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("questionMultipleChoiceAnswers") != null && !jsonObj.get("questionMultipleChoiceAnswers").isJsonNull()) {
        JsonArray jsonArrayquestionMultipleChoiceAnswers = jsonObj.getAsJsonArray("questionMultipleChoiceAnswers");
        if (jsonArrayquestionMultipleChoiceAnswers != null) {
          // ensure the json data is an array
          if (!jsonObj.get("questionMultipleChoiceAnswers").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `questionMultipleChoiceAnswers` to be an array in the JSON string but got `%s`", jsonObj.get("questionMultipleChoiceAnswers").toString()));
          }

          // validate the optional field `questionMultipleChoiceAnswers` (array)
          for (int i = 0; i < jsonArrayquestionMultipleChoiceAnswers.size(); i++) {
            QuestionMultipleChoiceFfdd5de32f7f100016c2c1e768f40000.validateJsonObject(jsonArrayquestionMultipleChoiceAnswers.get(i).getAsJsonObject());
          };
        }
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
       if (!RequestedFeedbackQuestionFfdd5de32f7f1000144df0c21e640000AllOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RequestedFeedbackQuestionFfdd5de32f7f1000144df0c21e640000AllOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RequestedFeedbackQuestionFfdd5de32f7f1000144df0c21e640000AllOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RequestedFeedbackQuestionFfdd5de32f7f1000144df0c21e640000AllOf.class));

       return (TypeAdapter<T>) new TypeAdapter<RequestedFeedbackQuestionFfdd5de32f7f1000144df0c21e640000AllOf>() {
           @Override
           public void write(JsonWriter out, RequestedFeedbackQuestionFfdd5de32f7f1000144df0c21e640000AllOf value) throws IOException {
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
           public RequestedFeedbackQuestionFfdd5de32f7f1000144df0c21e640000AllOf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             RequestedFeedbackQuestionFfdd5de32f7f1000144df0c21e640000AllOf instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of RequestedFeedbackQuestionFfdd5de32f7f1000144df0c21e640000AllOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RequestedFeedbackQuestionFfdd5de32f7f1000144df0c21e640000AllOf
  * @throws IOException if the JSON string is invalid with respect to RequestedFeedbackQuestionFfdd5de32f7f1000144df0c21e640000AllOf
  */
  public static RequestedFeedbackQuestionFfdd5de32f7f1000144df0c21e640000AllOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RequestedFeedbackQuestionFfdd5de32f7f1000144df0c21e640000AllOf.class);
  }

 /**
  * Convert an instance of RequestedFeedbackQuestionFfdd5de32f7f1000144df0c21e640000AllOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

