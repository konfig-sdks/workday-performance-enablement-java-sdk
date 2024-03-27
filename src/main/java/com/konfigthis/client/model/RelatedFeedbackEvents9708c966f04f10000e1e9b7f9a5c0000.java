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
import com.konfigthis.client.model.BusinessProcessParameters9708c966f04f10000e4ae9a03cf80001;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

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
 * RelatedFeedbackEvents9708c966f04f10000e1e9b7f9a5c0000
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class RelatedFeedbackEvents9708c966f04f10000e1e9b7f9a5c0000 {
  public static final String SERIALIZED_NAME_BUSINESS_PROCESS_PARAMETERS = "businessProcessParameters";
  @SerializedName(SERIALIZED_NAME_BUSINESS_PROCESS_PARAMETERS)
  private BusinessProcessParameters9708c966f04f10000e4ae9a03cf80001 businessProcessParameters;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_DESCRIPTOR = "descriptor";
  @SerializedName(SERIALIZED_NAME_DESCRIPTOR)
  private String descriptor;

  public RelatedFeedbackEvents9708c966f04f10000e1e9b7f9a5c0000() {
  }

  public RelatedFeedbackEvents9708c966f04f10000e1e9b7f9a5c0000 businessProcessParameters(BusinessProcessParameters9708c966f04f10000e4ae9a03cf80001 businessProcessParameters) {
    
    
    
    
    this.businessProcessParameters = businessProcessParameters;
    return this;
  }

   /**
   * Get businessProcessParameters
   * @return businessProcessParameters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BusinessProcessParameters9708c966f04f10000e4ae9a03cf80001 getBusinessProcessParameters() {
    return businessProcessParameters;
  }


  public void setBusinessProcessParameters(BusinessProcessParameters9708c966f04f10000e4ae9a03cf80001 businessProcessParameters) {
    
    
    
    this.businessProcessParameters = businessProcessParameters;
  }


  public RelatedFeedbackEvents9708c966f04f10000e1e9b7f9a5c0000 id(String id) {
    
    
    
    
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


  public RelatedFeedbackEvents9708c966f04f10000e1e9b7f9a5c0000 descriptor(String descriptor) {
    
    
    
    
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
   * @return the RelatedFeedbackEvents9708c966f04f10000e1e9b7f9a5c0000 instance itself
   */
  public RelatedFeedbackEvents9708c966f04f10000e1e9b7f9a5c0000 putAdditionalProperty(String key, Object value) {
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
    RelatedFeedbackEvents9708c966f04f10000e1e9b7f9a5c0000 relatedFeedbackEvents9708c966f04f10000e1e9b7f9a5c0000 = (RelatedFeedbackEvents9708c966f04f10000e1e9b7f9a5c0000) o;
    return Objects.equals(this.businessProcessParameters, relatedFeedbackEvents9708c966f04f10000e1e9b7f9a5c0000.businessProcessParameters) &&
        Objects.equals(this.id, relatedFeedbackEvents9708c966f04f10000e1e9b7f9a5c0000.id) &&
        Objects.equals(this.descriptor, relatedFeedbackEvents9708c966f04f10000e1e9b7f9a5c0000.descriptor)&&
        Objects.equals(this.additionalProperties, relatedFeedbackEvents9708c966f04f10000e1e9b7f9a5c0000.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(businessProcessParameters, id, descriptor, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RelatedFeedbackEvents9708c966f04f10000e1e9b7f9a5c0000 {\n");
    sb.append("    businessProcessParameters: ").append(toIndentedString(businessProcessParameters)).append("\n");
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
    openapiFields.add("businessProcessParameters");
    openapiFields.add("id");
    openapiFields.add("descriptor");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RelatedFeedbackEvents9708c966f04f10000e1e9b7f9a5c0000
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!RelatedFeedbackEvents9708c966f04f10000e1e9b7f9a5c0000.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RelatedFeedbackEvents9708c966f04f10000e1e9b7f9a5c0000 is not found in the empty JSON string", RelatedFeedbackEvents9708c966f04f10000e1e9b7f9a5c0000.openapiRequiredFields.toString()));
        }
      }
      // validate the optional field `businessProcessParameters`
      if (jsonObj.get("businessProcessParameters") != null && !jsonObj.get("businessProcessParameters").isJsonNull()) {
        BusinessProcessParameters9708c966f04f10000e4ae9a03cf80001.validateJsonObject(jsonObj.getAsJsonObject("businessProcessParameters"));
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
       if (!RelatedFeedbackEvents9708c966f04f10000e1e9b7f9a5c0000.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RelatedFeedbackEvents9708c966f04f10000e1e9b7f9a5c0000' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RelatedFeedbackEvents9708c966f04f10000e1e9b7f9a5c0000> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RelatedFeedbackEvents9708c966f04f10000e1e9b7f9a5c0000.class));

       return (TypeAdapter<T>) new TypeAdapter<RelatedFeedbackEvents9708c966f04f10000e1e9b7f9a5c0000>() {
           @Override
           public void write(JsonWriter out, RelatedFeedbackEvents9708c966f04f10000e1e9b7f9a5c0000 value) throws IOException {
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
           public RelatedFeedbackEvents9708c966f04f10000e1e9b7f9a5c0000 read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             RelatedFeedbackEvents9708c966f04f10000e1e9b7f9a5c0000 instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of RelatedFeedbackEvents9708c966f04f10000e1e9b7f9a5c0000 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RelatedFeedbackEvents9708c966f04f10000e1e9b7f9a5c0000
  * @throws IOException if the JSON string is invalid with respect to RelatedFeedbackEvents9708c966f04f10000e1e9b7f9a5c0000
  */
  public static RelatedFeedbackEvents9708c966f04f10000e1e9b7f9a5c0000 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RelatedFeedbackEvents9708c966f04f10000e1e9b7f9a5c0000.class);
  }

 /**
  * Convert an instance of RelatedFeedbackEvents9708c966f04f10000e1e9b7f9a5c0000 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

