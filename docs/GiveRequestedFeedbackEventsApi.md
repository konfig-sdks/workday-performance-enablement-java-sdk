# GiveRequestedFeedbackEventsApi

All URIs are relative to *https://&lt;tenantHostname&gt;/performanceEnablement/v5*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getCollectionFeedbackEvents**](GiveRequestedFeedbackEventsApi.md#getCollectionFeedbackEvents) | **GET** /giveRequestedFeedbackEvents | Retrieves a collection of feedback given events about the user that responded to the feedback request. |
| [**getInstance**](GiveRequestedFeedbackEventsApi.md#getInstance) | **GET** /giveRequestedFeedbackEvents/{ID} | Retrieves a single requested feedback given event instance with the specified ID of the user that responded to the feedback request. |
| [**updateEvent**](GiveRequestedFeedbackEventsApi.md#updateEvent) | **PATCH** /giveRequestedFeedbackEvents/{ID} | Updates the Give Requested Feedback Event that matches the WID in the url, and the current authenticated user is a responder for the event. |


<a name="getCollectionFeedbackEvents"></a>
# **getCollectionFeedbackEvents**
> GiveRequestedFeedbackEventsGetCollectionFeedbackEventsResponse getCollectionFeedbackEvents().limit(limit).offset(offset).execute();

Retrieves a collection of feedback given events about the user that responded to the feedback request.

Retrieves all requested feedback given events for the user that responded to the feedback request.  Secured by: Self-Service: Role Requested Feedback, Self-Service: Self Requested Feedback  Scope: Performance Enablement, Worker Profile and Skills

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayPerformanceEnablement;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GiveRequestedFeedbackEventsApi;
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
      GiveRequestedFeedbackEventsGetCollectionFeedbackEventsResponse result = client
              .giveRequestedFeedbackEvents
              .getCollectionFeedbackEvents()
              .limit(limit)
              .offset(offset)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getTotal());
    } catch (ApiException e) {
      System.err.println("Exception when calling GiveRequestedFeedbackEventsApi#getCollectionFeedbackEvents");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GiveRequestedFeedbackEventsGetCollectionFeedbackEventsResponse> response = client
              .giveRequestedFeedbackEvents
              .getCollectionFeedbackEvents()
              .limit(limit)
              .offset(offset)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GiveRequestedFeedbackEventsApi#getCollectionFeedbackEvents");
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

[**GiveRequestedFeedbackEventsGetCollectionFeedbackEventsResponse**](GiveRequestedFeedbackEventsGetCollectionFeedbackEventsResponse.md)

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

<a name="getInstance"></a>
# **getInstance**
> GiveRequestedFeedbackDetailsD396fd5bffec10000e3eba1a70440000 getInstance(ID).execute();

Retrieves a single requested feedback given event instance with the specified ID of the user that responded to the feedback request.

Retrieves a single requested feedback given event instance for the user that responded to the feedback request.  Secured by: Self-Service: Role Requested Feedback, Self-Service: Self Requested Feedback  Scope: Performance Enablement, Worker Profile and Skills

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayPerformanceEnablement;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GiveRequestedFeedbackEventsApi;
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
      GiveRequestedFeedbackDetailsD396fd5bffec10000e3eba1a70440000 result = client
              .giveRequestedFeedbackEvents
              .getInstance(ID)
              .execute();
      System.out.println(result);
      System.out.println(result.getDueDate());
      System.out.println(result.getFeedbackGivenDate());
      System.out.println(result.getFeedbackCreationDate());
      System.out.println(result.getRequestedBy());
      System.out.println(result.getAboutWorker());
      System.out.println(result.getExpirationDate());
      System.out.println(result.getDisplayNameofResponder());
      System.out.println(result.getFeedbackComments());
      System.out.println(result.getBusinessProcessParameters());
      System.out.println(result.getFeedbackPrivate());
      System.out.println(result.getFeedbackConfidential());
      System.out.println(result.getId());
      System.out.println(result.getDescriptor());
    } catch (ApiException e) {
      System.err.println("Exception when calling GiveRequestedFeedbackEventsApi#getInstance");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GiveRequestedFeedbackDetailsD396fd5bffec10000e3eba1a70440000> response = client
              .giveRequestedFeedbackEvents
              .getInstance(ID)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GiveRequestedFeedbackEventsApi#getInstance");
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

[**GiveRequestedFeedbackDetailsD396fd5bffec10000e3eba1a70440000**](GiveRequestedFeedbackDetailsD396fd5bffec10000e3eba1a70440000.md)

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

<a name="updateEvent"></a>
# **updateEvent**
> GiveRequestedFeedbackDetailsD396fd5bffec10000e3eba1a70440000 updateEvent(ID, giveRequestedFeedbackDetailsD396fd5bffec10000e3eba1a70440000).execute();

Updates the Give Requested Feedback Event that matches the WID in the url, and the current authenticated user is a responder for the event.

Updates the Give Requested Feedback Event that matches the WID in the url, and the current authenticated user is a responder for the event. This endpoint is equivalent to the Give Requested Feedback task in Workday.  Secured by: Give Requested Feedback REST+TG  Scope: Performance Enablement, Worker Profile and Skills

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayPerformanceEnablement;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GiveRequestedFeedbackEventsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://<tenantHostname>/performanceEnablement/v5";
    WorkdayPerformanceEnablement client = new WorkdayPerformanceEnablement(configuration);
    String ID = "ID_example"; // The Workday ID of the resource.
    LocalDate dueDate = LocalDate.now(); // The date the business process needs to be completed.
    LocalDate feedbackGivenDate = LocalDate.now(); // The date the feedback was provided.
    LocalDate feedbackCreationDate = LocalDate.now(); // The date the feedback event was created.
    RequestedByD396fd5bffec1000100f44a5808f0006 requestedBy = new RequestedByD396fd5bffec1000100f44a5808f0006();
    AboutWorkerD396fd5bffec1000100f44a5808f0005 aboutWorker = new AboutWorkerD396fd5bffec1000100f44a5808f0005();
    LocalDate expirationDate = LocalDate.now(); // The date the feedback request expires.
    Boolean displayNameofResponder = true; // True if the feedback provider's name is not displayed.
    List<RequestedFeedbackCommentsD396fd5bffec10001393477e77870000> feedbackComments = Arrays.asList(); // The feedback comments for this feedback event. To include feedback comments in reports or notifications intended for Employees, use Feedback Comments for Self-Service Reporting instead.
    BusinessProcessParametersD396fd5bffec1000100f440bde4c0001 businessProcessParameters = new BusinessProcessParametersD396fd5bffec1000100f440bde4c0001();
    Boolean feedbackPrivate = true; // Yes if the feedback is private between the feedback provider and the worker.
    Boolean feedbackConfidential = true; // Yes if the feedback is confidential between the feedback provider and the manager. Employees, or who the feedback is about, don't see confidential feedback.
    String id = "id_example"; // Id of the instance
    String descriptor = "descriptor_example"; // A preview of the instance
    try {
      GiveRequestedFeedbackDetailsD396fd5bffec10000e3eba1a70440000 result = client
              .giveRequestedFeedbackEvents
              .updateEvent(ID)
              .dueDate(dueDate)
              .feedbackGivenDate(feedbackGivenDate)
              .feedbackCreationDate(feedbackCreationDate)
              .requestedBy(requestedBy)
              .aboutWorker(aboutWorker)
              .expirationDate(expirationDate)
              .displayNameofResponder(displayNameofResponder)
              .feedbackComments(feedbackComments)
              .businessProcessParameters(businessProcessParameters)
              .feedbackPrivate(feedbackPrivate)
              .feedbackConfidential(feedbackConfidential)
              .id(id)
              .descriptor(descriptor)
              .execute();
      System.out.println(result);
      System.out.println(result.getDueDate());
      System.out.println(result.getFeedbackGivenDate());
      System.out.println(result.getFeedbackCreationDate());
      System.out.println(result.getRequestedBy());
      System.out.println(result.getAboutWorker());
      System.out.println(result.getExpirationDate());
      System.out.println(result.getDisplayNameofResponder());
      System.out.println(result.getFeedbackComments());
      System.out.println(result.getBusinessProcessParameters());
      System.out.println(result.getFeedbackPrivate());
      System.out.println(result.getFeedbackConfidential());
      System.out.println(result.getId());
      System.out.println(result.getDescriptor());
    } catch (ApiException e) {
      System.err.println("Exception when calling GiveRequestedFeedbackEventsApi#updateEvent");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GiveRequestedFeedbackDetailsD396fd5bffec10000e3eba1a70440000> response = client
              .giveRequestedFeedbackEvents
              .updateEvent(ID)
              .dueDate(dueDate)
              .feedbackGivenDate(feedbackGivenDate)
              .feedbackCreationDate(feedbackCreationDate)
              .requestedBy(requestedBy)
              .aboutWorker(aboutWorker)
              .expirationDate(expirationDate)
              .displayNameofResponder(displayNameofResponder)
              .feedbackComments(feedbackComments)
              .businessProcessParameters(businessProcessParameters)
              .feedbackPrivate(feedbackPrivate)
              .feedbackConfidential(feedbackConfidential)
              .id(id)
              .descriptor(descriptor)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GiveRequestedFeedbackEventsApi#updateEvent");
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
| **giveRequestedFeedbackDetailsD396fd5bffec10000e3eba1a70440000** | [**GiveRequestedFeedbackDetailsD396fd5bffec10000e3eba1a70440000**](GiveRequestedFeedbackDetailsD396fd5bffec10000e3eba1a70440000.md)|  | |

### Return type

[**GiveRequestedFeedbackDetailsD396fd5bffec10000e3eba1a70440000**](GiveRequestedFeedbackDetailsD396fd5bffec10000e3eba1a70440000.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response. A successful response can return no matched data. Updating resource. |  -  |
| **0** | An error occurred. |  -  |

