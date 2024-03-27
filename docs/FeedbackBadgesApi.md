# FeedbackBadgesApi

All URIs are relative to *https://&lt;tenantHostname&gt;/performanceEnablement/v5*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getById**](FeedbackBadgesApi.md#getById) | **GET** /feedbackBadges/{ID} | Retrieves a Feedback Badge with the specified ID. |
| [**getCollection**](FeedbackBadgesApi.md#getCollection) | **GET** /feedbackBadges | Retrieves a collection of active Feedback Badges. |


<a name="getById"></a>
# **getById**
> FeedbackBadgeDetail9eab868ca81410001402525d054211f7 getById(ID).execute();

Retrieves a Feedback Badge with the specified ID.

Retrieves a single Feedback Badge instance  Secured by: Give Feedback  Scope: Performance Enablement, Worker Profile and Skills

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayPerformanceEnablement;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.FeedbackBadgesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://<tenantHostname>/performanceEnablement/v5";
    WorkdayPerformanceEnablement client = new WorkdayPerformanceEnablement(configuration);
    String ID = "ID_example"; // The Workday ID of the resource.
    try {
      FeedbackBadgeDetail9eab868ca81410001402525d054211f7 result = client
              .feedbackBadges
              .getById(ID)
              .execute();
      System.out.println(result);
      System.out.println(result.getFeedbackBadgeIcon());
      System.out.println(result.getWorkdayID());
      System.out.println(result.getFeedbackBadgeID());
      System.out.println(result.getName());
    } catch (ApiException e) {
      System.err.println("Exception when calling FeedbackBadgesApi#getById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<FeedbackBadgeDetail9eab868ca81410001402525d054211f7> response = client
              .feedbackBadges
              .getById(ID)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling FeedbackBadgesApi#getById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ID** | **String**| The Workday ID of the resource. | |

### Return type

[**FeedbackBadgeDetail9eab868ca81410001402525d054211f7**](FeedbackBadgeDetail9eab868ca81410001402525d054211f7.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response. A successful response can return no matched data. |  -  |
| **0** | An error occurred. |  -  |

<a name="getCollection"></a>
# **getCollection**
> FeedbackBadgesGetCollectionResponse getCollection().limit(limit).offset(offset).execute();

Retrieves a collection of active Feedback Badges.

Retrieves all active Feedback Badges.  Secured by: Give Feedback  Scope: Performance Enablement, Worker Profile and Skills

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayPerformanceEnablement;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.FeedbackBadgesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://<tenantHostname>/performanceEnablement/v5";
    WorkdayPerformanceEnablement client = new WorkdayPerformanceEnablement(configuration);
    Long limit = 56L; // The maximum number of objects in a single response. The default is 20. The maximum is 100.
    Long offset = 56L; // The zero-based index of the first object in a response collection. The default is 0. Use offset with the limit parameter to control paging of a response collection. Example: If limit is 5 and offset is 9, the response returns a collection of 5 objects starting with the 10th object.
    try {
      FeedbackBadgesGetCollectionResponse result = client
              .feedbackBadges
              .getCollection()
              .limit(limit)
              .offset(offset)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getTotal());
    } catch (ApiException e) {
      System.err.println("Exception when calling FeedbackBadgesApi#getCollection");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<FeedbackBadgesGetCollectionResponse> response = client
              .feedbackBadges
              .getCollection()
              .limit(limit)
              .offset(offset)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling FeedbackBadgesApi#getCollection");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **limit** | **Long**| The maximum number of objects in a single response. The default is 20. The maximum is 100. | [optional] |
| **offset** | **Long**| The zero-based index of the first object in a response collection. The default is 0. Use offset with the limit parameter to control paging of a response collection. Example: If limit is 5 and offset is 9, the response returns a collection of 5 objects starting with the 10th object. | [optional] |

### Return type

[**FeedbackBadgesGetCollectionResponse**](FeedbackBadgesGetCollectionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response. A successful response can return no matched data. |  -  |
| **0** | An error occurred. |  -  |

