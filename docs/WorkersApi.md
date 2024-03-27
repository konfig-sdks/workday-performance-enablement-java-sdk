# WorkersApi

All URIs are relative to *https://&lt;tenantHostname&gt;/performanceEnablement/v5*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createFeedbackEvent**](WorkersApi.md#createFeedbackEvent) | **POST** /workers/{ID}/anytimeFeedbackEvents | Creates a single feedback given event instance about the specified worker. |
| [**getCollectionStaffing**](WorkersApi.md#getCollectionStaffing) | **GET** /workers | Retrieves a collection of workers and current staffing information. |
| [**getFeedbackEvent**](WorkersApi.md#getFeedbackEvent) | **GET** /workers/{ID}/anytimeFeedbackEvents/{subresourceID} | Retrieves a feedback given event instance with the specified ID. |
| [**getFeedbackEvents**](WorkersApi.md#getFeedbackEvents) | **GET** /workers/{ID}/anytimeFeedbackEvents | Retrieves a collection of feedback given events about the specified worker. |
| [**getGoals**](WorkersApi.md#getGoals) | **GET** /workers/{ID}/goals | Retrieves a collection of goals for a specific worker. |
| [**getRequestedEvent**](WorkersApi.md#getRequestedEvent) | **GET** /workers/{ID}/requestedFeedbackOnWorkerEvents/{subresourceID} | Retrieves a single requested feedback event instance for the specified worker. |
| [**getRequestedFeedbackEvents**](WorkersApi.md#getRequestedFeedbackEvents) | **GET** /workers/{ID}/requestedFeedbackOnWorkerEvents | Retrieves a collection of requested feedback events for the specified worker. |
| [**getSelfRequestedFeedback**](WorkersApi.md#getSelfRequestedFeedback) | **GET** /workers/{ID}/requestedFeedbackOnSelfEvents | Retrieves a collection of self-requested feedback events for the specified worker. |
| [**getSelfRequestedFeedbackEvent**](WorkersApi.md#getSelfRequestedFeedbackEvent) | **GET** /workers/{ID}/requestedFeedbackOnSelfEvents/{subresourceID} | Retrieves a single self-requested feedback event instance for the specified worker. |
| [**getSingleGoal**](WorkersApi.md#getSingleGoal) | **GET** /workers/{ID}/goals/{subresourceID} | Retrieves a single goal instance for a specific worker. |
| [**getStaffingInformation**](WorkersApi.md#getStaffingInformation) | **GET** /workers/{ID} | Retrieves a collection of workers and current staffing information. |
| [**requestFeedbackOnSelfEvents**](WorkersApi.md#requestFeedbackOnSelfEvents) | **POST** /workers/{ID}/requestedFeedbackOnSelfEvents |  |
| [**requestFeedbackOnWorkerEvents**](WorkersApi.md#requestFeedbackOnWorkerEvents) | **POST** /workers/{ID}/requestedFeedbackOnWorkerEvents | Not applicable. |


<a name="createFeedbackEvent"></a>
# **createFeedbackEvent**
> FeedbackEventDetailAfd6ac52d62510001086b5c85cd50000 createFeedbackEvent(ID, feedbackEventDetailAfd6ac52d62510001086b5c85cd50000).execute();

Creates a single feedback given event instance about the specified worker.

Creates a single instance of feedback for each of the specified workers with the provided data. The worker is specified by the Workday ID of the worker. You can use a returned id from GET /workers in the Staffing service /staffing.  If you want to see the status of conditionally hidden attributes for this request, call this method with the wd-metadata-api-version header. Set the header value to v1 (or the latest Workday Metadata API version). When you specify the wd-metadata-api-version header, this method returns the response metadata, instead of the actual data.  This endpoint is equivalent to the Give Feedback task in Workday. This endpoint initiates the Give Feedback business process or the Give Feedback to Multiple Recipients business process based on the request.  Secured by: Give Feedback  Scope: Performance Enablement, Worker Profile and Skills

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayPerformanceEnablement;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkersApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://<tenantHostname>/performanceEnablement/v5";
    WorkdayPerformanceEnablement client = new WorkdayPerformanceEnablement(configuration);
    String ID = "ID_example"; // The Workday ID of the resource.
    ToWorkerF4946919a39f10000f03207b1f230000 toWorker = new ToWorkerF4946919a39f10000f03207b1f230000();
    List<WorkersToNotify9e478586f65410001035b6c26a4c0000> workersToNotify = Arrays.asList(); // The workers that were selected to be notified of the feedback given event.
    RelatesTo9d12ad407f0f10001c3949add7d40000 relatesTo = new RelatesTo9d12ad407f0f10001c3949add7d40000();
    BusinessProcessParametersAfd6ac52d6251000117d0a60ed8b0000 businessProcessParameters = new BusinessProcessParametersAfd6ac52d6251000117d0a60ed8b0000();
    List<GetWorkersFeedbackAlsoAbout3ab333661034100010b5635b2f7a0302> feedbackAlsoAbout = Arrays.asList(); // The other workers this feedback event is about.
    Boolean hiddenFromWorker = true; // True if the feedback event is confidential between the feedback provider and the manager. Workers don't see confidential feedback.
    Boolean hiddenFromManager = true; // True if the feedback event is private between the feedback provider and the worker. Private feedback isn't shared with managers.
    String comment = "comment_example"; // The comment text for an anytime feedback event.
    FromWorkerAfd6ac52d62510001357f891ccfd0001 fromWorker = new FromWorkerAfd6ac52d62510001357f891ccfd0001();
    BadgeAfd6ac52d62510001357f891ccfd0003 badge = new BadgeAfd6ac52d62510001357f891ccfd0003();
    List<RelatedFeedbackEvents9708c966f04f10000e1e9b7f9a5c0000> relatedFeedbackEvents = Arrays.asList(); // The anytime feedback events for the multiple recipients event.
    LocalDate feedbackGivenDate = LocalDate.now(); // The date the feedback was provided.
    Boolean showFeedbackProviderName = true; // True if the feedback provider's name has chosen to be displayed. Names not chosen to be displayed are not shared.
    String href = "href_example"; // A link to the instance
    String id = "id_example"; // Id of the instance
    String descriptor = "descriptor_example"; // A preview of the instance
    try {
      FeedbackEventDetailAfd6ac52d62510001086b5c85cd50000 result = client
              .workers
              .createFeedbackEvent(ID)
              .toWorker(toWorker)
              .workersToNotify(workersToNotify)
              .relatesTo(relatesTo)
              .businessProcessParameters(businessProcessParameters)
              .feedbackAlsoAbout(feedbackAlsoAbout)
              .hiddenFromWorker(hiddenFromWorker)
              .hiddenFromManager(hiddenFromManager)
              .comment(comment)
              .fromWorker(fromWorker)
              .badge(badge)
              .relatedFeedbackEvents(relatedFeedbackEvents)
              .feedbackGivenDate(feedbackGivenDate)
              .showFeedbackProviderName(showFeedbackProviderName)
              .href(href)
              .id(id)
              .descriptor(descriptor)
              .execute();
      System.out.println(result);
      System.out.println(result.getToWorker());
      System.out.println(result.getWorkersToNotify());
      System.out.println(result.getRelatesTo());
      System.out.println(result.getBusinessProcessParameters());
      System.out.println(result.getFeedbackAlsoAbout());
      System.out.println(result.getHiddenFromWorker());
      System.out.println(result.getHiddenFromManager());
      System.out.println(result.getComment());
      System.out.println(result.getFromWorker());
      System.out.println(result.getBadge());
      System.out.println(result.getRelatedFeedbackEvents());
      System.out.println(result.getFeedbackGivenDate());
      System.out.println(result.getShowFeedbackProviderName());
      System.out.println(result.getHref());
      System.out.println(result.getId());
      System.out.println(result.getDescriptor());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersApi#createFeedbackEvent");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<FeedbackEventDetailAfd6ac52d62510001086b5c85cd50000> response = client
              .workers
              .createFeedbackEvent(ID)
              .toWorker(toWorker)
              .workersToNotify(workersToNotify)
              .relatesTo(relatesTo)
              .businessProcessParameters(businessProcessParameters)
              .feedbackAlsoAbout(feedbackAlsoAbout)
              .hiddenFromWorker(hiddenFromWorker)
              .hiddenFromManager(hiddenFromManager)
              .comment(comment)
              .fromWorker(fromWorker)
              .badge(badge)
              .relatedFeedbackEvents(relatedFeedbackEvents)
              .feedbackGivenDate(feedbackGivenDate)
              .showFeedbackProviderName(showFeedbackProviderName)
              .href(href)
              .id(id)
              .descriptor(descriptor)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersApi#createFeedbackEvent");
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
| **feedbackEventDetailAfd6ac52d62510001086b5c85cd50000** | [**FeedbackEventDetailAfd6ac52d62510001086b5c85cd50000**](FeedbackEventDetailAfd6ac52d62510001086b5c85cd50000.md)|  | |

### Return type

[**FeedbackEventDetailAfd6ac52d62510001086b5c85cd50000**](FeedbackEventDetailAfd6ac52d62510001086b5c85cd50000.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Resource created. |  -  |
| **0** | An error occurred. |  -  |

<a name="getCollectionStaffing"></a>
# **getCollectionStaffing**
> WorkersGetCollectionStaffingResponse getCollectionStaffing().includeTerminatedWorkers(includeTerminatedWorkers).limit(limit).offset(offset).search(search).execute();

Retrieves a collection of workers and current staffing information.

Retrieves a collection of workers and current staffing information.  Secured by: Self-Service: Current Staffing Information, Worker Data: Public Worker Reports  Scope: Staffing

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayPerformanceEnablement;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkersApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://<tenantHostname>/performanceEnablement/v5";
    WorkdayPerformanceEnablement client = new WorkdayPerformanceEnablement(configuration);
    Boolean includeTerminatedWorkers = true; // Include terminated workers in the output
    Long limit = 56L; // The maximum number of objects in a single response. The default is 20. The maximum is 100.
    Long offset = 56L; // The zero-based index of the first object in a response collection. The default is 0. Use offset with the limit parameter to control paging of a response collection. Example: If limit is 5 and offset is 9, the response returns a collection of 5 objects starting with the 10th object.
    String search = "search_example"; // Searches workers by name or worker ID. The search is case-insensitive. You can include space-delimited search strings for an OR search.
    try {
      WorkersGetCollectionStaffingResponse result = client
              .workers
              .getCollectionStaffing()
              .includeTerminatedWorkers(includeTerminatedWorkers)
              .limit(limit)
              .offset(offset)
              .search(search)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getTotal());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersApi#getCollectionStaffing");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WorkersGetCollectionStaffingResponse> response = client
              .workers
              .getCollectionStaffing()
              .includeTerminatedWorkers(includeTerminatedWorkers)
              .limit(limit)
              .offset(offset)
              .search(search)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersApi#getCollectionStaffing");
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
| **includeTerminatedWorkers** | **Boolean**| Include terminated workers in the output | [optional] |
| **limit** | **Long**| The maximum number of objects in a single response. The default is 20. The maximum is 100. | [optional] |
| **offset** | **Long**| The zero-based index of the first object in a response collection. The default is 0. Use offset with the limit parameter to control paging of a response collection. Example: If limit is 5 and offset is 9, the response returns a collection of 5 objects starting with the 10th object. | [optional] |
| **search** | **String**| Searches workers by name or worker ID. The search is case-insensitive. You can include space-delimited search strings for an OR search. | [optional] |

### Return type

[**WorkersGetCollectionStaffingResponse**](WorkersGetCollectionStaffingResponse.md)

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

<a name="getFeedbackEvent"></a>
# **getFeedbackEvent**
> FeedbackEventDetailAfd6ac52d62510001086b5c85cd50000 getFeedbackEvent(ID, subresourceID).execute();

Retrieves a feedback given event instance with the specified ID.

Retrieves a single feedback given event instance with the specified ID.  This endpoint is equivalent to the View Feedback task in Workday.  Secured by: Self-Service: Anytime Feedback, Worker Data: Anytime Feedback  Scope: Performance Enablement, Worker Profile and Skills

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayPerformanceEnablement;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkersApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://<tenantHostname>/performanceEnablement/v5";
    WorkdayPerformanceEnablement client = new WorkdayPerformanceEnablement(configuration);
    String ID = "ID_example"; // The Workday ID of the resource.
    String subresourceID = "subresourceID_example"; // The Workday ID of the subresource.
    try {
      FeedbackEventDetailAfd6ac52d62510001086b5c85cd50000 result = client
              .workers
              .getFeedbackEvent(ID, subresourceID)
              .execute();
      System.out.println(result);
      System.out.println(result.getToWorker());
      System.out.println(result.getWorkersToNotify());
      System.out.println(result.getRelatesTo());
      System.out.println(result.getBusinessProcessParameters());
      System.out.println(result.getFeedbackAlsoAbout());
      System.out.println(result.getHiddenFromWorker());
      System.out.println(result.getHiddenFromManager());
      System.out.println(result.getComment());
      System.out.println(result.getFromWorker());
      System.out.println(result.getBadge());
      System.out.println(result.getRelatedFeedbackEvents());
      System.out.println(result.getFeedbackGivenDate());
      System.out.println(result.getShowFeedbackProviderName());
      System.out.println(result.getHref());
      System.out.println(result.getId());
      System.out.println(result.getDescriptor());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersApi#getFeedbackEvent");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<FeedbackEventDetailAfd6ac52d62510001086b5c85cd50000> response = client
              .workers
              .getFeedbackEvent(ID, subresourceID)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersApi#getFeedbackEvent");
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
| **subresourceID** | **String**| The Workday ID of the subresource. | |

### Return type

[**FeedbackEventDetailAfd6ac52d62510001086b5c85cd50000**](FeedbackEventDetailAfd6ac52d62510001086b5c85cd50000.md)

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

<a name="getFeedbackEvents"></a>
# **getFeedbackEvents**
> WorkersGetFeedbackEventsResponse getFeedbackEvents(ID).limit(limit).offset(offset).execute();

Retrieves a collection of feedback given events about the specified worker.

Retrieves all feedback given events about the specified worker. Could also return a feedback multiple recipient event.  This endpoint is equivalent to the View Feedback task in Workday.  Secured by: Self-Service: Anytime Feedback, Worker Data: Anytime Feedback  Scope: Performance Enablement, Worker Profile and Skills

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayPerformanceEnablement;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkersApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://<tenantHostname>/performanceEnablement/v5";
    WorkdayPerformanceEnablement client = new WorkdayPerformanceEnablement(configuration);
    String ID = "ID_example"; // The Workday ID of the resource.
    Long limit = 56L; // The maximum number of objects in a single response. The default is 20. The maximum is 100.
    Long offset = 56L; // The zero-based index of the first object in a response collection. The default is 0. Use offset with the limit parameter to control paging of a response collection. Example: If limit is 5 and offset is 9, the response returns a collection of 5 objects starting with the 10th object.
    try {
      WorkersGetFeedbackEventsResponse result = client
              .workers
              .getFeedbackEvents(ID)
              .limit(limit)
              .offset(offset)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getTotal());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersApi#getFeedbackEvents");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WorkersGetFeedbackEventsResponse> response = client
              .workers
              .getFeedbackEvents(ID)
              .limit(limit)
              .offset(offset)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersApi#getFeedbackEvents");
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
| **limit** | **Long**| The maximum number of objects in a single response. The default is 20. The maximum is 100. | [optional] |
| **offset** | **Long**| The zero-based index of the first object in a response collection. The default is 0. Use offset with the limit parameter to control paging of a response collection. Example: If limit is 5 and offset is 9, the response returns a collection of 5 objects starting with the 10th object. | [optional] |

### Return type

[**WorkersGetFeedbackEventsResponse**](WorkersGetFeedbackEventsResponse.md)

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

<a name="getGoals"></a>
# **getGoals**
> WorkersGetGoalsResponse getGoals(ID).limit(limit).offset(offset).execute();

Retrieves a collection of goals for a specific worker.

Retrieves all goals for a worker with the specified ID. You can use a returned id from GET /workers in the Staffing service. The goal data includes name, description, category, tags, associated reviews, due date, completed date, status, creator, worker it is for, supporting organization goal, locked reason, and activity streamable item.  Secured by: Self-Service: Employee Goals, Worker Data: Employee Goals  Scope: Performance Enablement

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayPerformanceEnablement;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkersApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://<tenantHostname>/performanceEnablement/v5";
    WorkdayPerformanceEnablement client = new WorkdayPerformanceEnablement(configuration);
    String ID = "ID_example"; // The Workday ID of the resource.
    Long limit = 56L; // The maximum number of objects in a single response. The default is 20. The maximum is 100.
    Long offset = 56L; // The zero-based index of the first object in a response collection. The default is 0. Use offset with the limit parameter to control paging of a response collection. Example: If limit is 5 and offset is 9, the response returns a collection of 5 objects starting with the 10th object.
    try {
      WorkersGetGoalsResponse result = client
              .workers
              .getGoals(ID)
              .limit(limit)
              .offset(offset)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getTotal());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersApi#getGoals");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WorkersGetGoalsResponse> response = client
              .workers
              .getGoals(ID)
              .limit(limit)
              .offset(offset)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersApi#getGoals");
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
| **limit** | **Long**| The maximum number of objects in a single response. The default is 20. The maximum is 100. | [optional] |
| **offset** | **Long**| The zero-based index of the first object in a response collection. The default is 0. Use offset with the limit parameter to control paging of a response collection. Example: If limit is 5 and offset is 9, the response returns a collection of 5 objects starting with the 10th object. | [optional] |

### Return type

[**WorkersGetGoalsResponse**](WorkersGetGoalsResponse.md)

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

<a name="getRequestedEvent"></a>
# **getRequestedEvent**
> RequestedFeedbackOnWorkerEventDetail2b4c8a6ca069100035b8586e16c20000 getRequestedEvent(ID, subresourceID).execute();

Retrieves a single requested feedback event instance for the specified worker.

Retrieves a single requested feedback event instance for the specified worker. This endpoint is equivalent to the View Feedback and View Feedback by Request tasks in Workday.  Secured by: Self-Service: Role Requested Feedback, Worker Data: Role Requested Feedback  Scope: Performance Enablement, Worker Profile and Skills

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayPerformanceEnablement;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkersApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://<tenantHostname>/performanceEnablement/v5";
    WorkdayPerformanceEnablement client = new WorkdayPerformanceEnablement(configuration);
    String ID = "ID_example"; // The Workday ID of the resource.
    String subresourceID = "subresourceID_example"; // The Workday ID of the subresource.
    try {
      RequestedFeedbackOnWorkerEventDetail2b4c8a6ca069100035b8586e16c20000 result = client
              .workers
              .getRequestedEvent(ID, subresourceID)
              .execute();
      System.out.println(result);
      System.out.println(result.getFeedbackAbout());
      System.out.println(result.getFeedbackConfidential());
      System.out.println(result.getFeedbackOverallStatus());
      System.out.println(result.getShowFeedbackProviderName());
      System.out.println(result.getRequestDate());
      System.out.println(result.getExpirationDate());
      System.out.println(result.getFeedbackQuestions());
      System.out.println(result.getFeedbackTemplate());
      System.out.println(result.getFeedbackResponders());
      System.out.println(result.getBusinessProcessParameters());
      System.out.println(result.getDescriptor());
      System.out.println(result.getId());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersApi#getRequestedEvent");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<RequestedFeedbackOnWorkerEventDetail2b4c8a6ca069100035b8586e16c20000> response = client
              .workers
              .getRequestedEvent(ID, subresourceID)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersApi#getRequestedEvent");
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
| **subresourceID** | **String**| The Workday ID of the subresource. | |

### Return type

[**RequestedFeedbackOnWorkerEventDetail2b4c8a6ca069100035b8586e16c20000**](RequestedFeedbackOnWorkerEventDetail2b4c8a6ca069100035b8586e16c20000.md)

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

<a name="getRequestedFeedbackEvents"></a>
# **getRequestedFeedbackEvents**
> WorkersGetRequestedFeedbackEventsResponse getRequestedFeedbackEvents(ID).limit(limit).offset(offset).execute();

Retrieves a collection of requested feedback events for the specified worker.

Retrieves all requested feedback events for the specified worker. This endpoint is equivalent to the View Feedback task in Workday.  Secured by: Self-Service: Role Requested Feedback, Worker Data: Role Requested Feedback  Scope: Performance Enablement, Worker Profile and Skills

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayPerformanceEnablement;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkersApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://<tenantHostname>/performanceEnablement/v5";
    WorkdayPerformanceEnablement client = new WorkdayPerformanceEnablement(configuration);
    String ID = "ID_example"; // The Workday ID of the resource.
    Long limit = 56L; // The maximum number of objects in a single response. The default is 20. The maximum is 100.
    Long offset = 56L; // The zero-based index of the first object in a response collection. The default is 0. Use offset with the limit parameter to control paging of a response collection. Example: If limit is 5 and offset is 9, the response returns a collection of 5 objects starting with the 10th object.
    try {
      WorkersGetRequestedFeedbackEventsResponse result = client
              .workers
              .getRequestedFeedbackEvents(ID)
              .limit(limit)
              .offset(offset)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getTotal());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersApi#getRequestedFeedbackEvents");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WorkersGetRequestedFeedbackEventsResponse> response = client
              .workers
              .getRequestedFeedbackEvents(ID)
              .limit(limit)
              .offset(offset)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersApi#getRequestedFeedbackEvents");
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
| **limit** | **Long**| The maximum number of objects in a single response. The default is 20. The maximum is 100. | [optional] |
| **offset** | **Long**| The zero-based index of the first object in a response collection. The default is 0. Use offset with the limit parameter to control paging of a response collection. Example: If limit is 5 and offset is 9, the response returns a collection of 5 objects starting with the 10th object. | [optional] |

### Return type

[**WorkersGetRequestedFeedbackEventsResponse**](WorkersGetRequestedFeedbackEventsResponse.md)

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

<a name="getSelfRequestedFeedback"></a>
# **getSelfRequestedFeedback**
> WorkersGetSelfRequestedFeedbackResponse getSelfRequestedFeedback(ID).limit(limit).offset(offset).execute();

Retrieves a collection of self-requested feedback events for the specified worker.

Retrieves all self-requested feedback events for the specified worker. This endpoint is equivalent to the View Feedback task in Workday.  Secured by: Self-Service: Self Requested Feedback, Worker Data: Self Requested Feedback  Scope: Performance Enablement, Worker Profile and Skills

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayPerformanceEnablement;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkersApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://<tenantHostname>/performanceEnablement/v5";
    WorkdayPerformanceEnablement client = new WorkdayPerformanceEnablement(configuration);
    String ID = "ID_example"; // The Workday ID of the resource.
    Long limit = 56L; // The maximum number of objects in a single response. The default is 20. The maximum is 100.
    Long offset = 56L; // The zero-based index of the first object in a response collection. The default is 0. Use offset with the limit parameter to control paging of a response collection. Example: If limit is 5 and offset is 9, the response returns a collection of 5 objects starting with the 10th object.
    try {
      WorkersGetSelfRequestedFeedbackResponse result = client
              .workers
              .getSelfRequestedFeedback(ID)
              .limit(limit)
              .offset(offset)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getTotal());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersApi#getSelfRequestedFeedback");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WorkersGetSelfRequestedFeedbackResponse> response = client
              .workers
              .getSelfRequestedFeedback(ID)
              .limit(limit)
              .offset(offset)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersApi#getSelfRequestedFeedback");
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
| **limit** | **Long**| The maximum number of objects in a single response. The default is 20. The maximum is 100. | [optional] |
| **offset** | **Long**| The zero-based index of the first object in a response collection. The default is 0. Use offset with the limit parameter to control paging of a response collection. Example: If limit is 5 and offset is 9, the response returns a collection of 5 objects starting with the 10th object. | [optional] |

### Return type

[**WorkersGetSelfRequestedFeedbackResponse**](WorkersGetSelfRequestedFeedbackResponse.md)

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

<a name="getSelfRequestedFeedbackEvent"></a>
# **getSelfRequestedFeedbackEvent**
> RequestedFeedbackOnSelfEventDetail19acce0101b310002e6bf03e1bbc0000 getSelfRequestedFeedbackEvent(ID, subresourceID).execute();

Retrieves a single self-requested feedback event instance for the specified worker.

Retrieves a single self-requested feedback event instance for the specified worker. This endpoint is equivalent to the View Feedback and View Feedback by Request tasks in Workday.  Secured by: Self-Service: Self Requested Feedback, Worker Data: Self Requested Feedback  Scope: Performance Enablement, Worker Profile and Skills

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayPerformanceEnablement;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkersApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://<tenantHostname>/performanceEnablement/v5";
    WorkdayPerformanceEnablement client = new WorkdayPerformanceEnablement(configuration);
    String ID = "ID_example"; // The Workday ID of the resource.
    String subresourceID = "subresourceID_example"; // The Workday ID of the subresource.
    try {
      RequestedFeedbackOnSelfEventDetail19acce0101b310002e6bf03e1bbc0000 result = client
              .workers
              .getSelfRequestedFeedbackEvent(ID, subresourceID)
              .execute();
      System.out.println(result);
      System.out.println(result.getBusinessProcessParameters());
      System.out.println(result.getFeedbackQuestions());
      System.out.println(result.getFeedbackAbout());
      System.out.println(result.getFeedbackTemplate());
      System.out.println(result.getExpirationDate());
      System.out.println(result.getRequestDate());
      System.out.println(result.getFeedbackOverallStatus());
      System.out.println(result.getFeedbackPrivate());
      System.out.println(result.getFeedbackResponders());
      System.out.println(result.getShowFeedbackProviderName());
      System.out.println(result.getDescriptor());
      System.out.println(result.getId());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersApi#getSelfRequestedFeedbackEvent");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<RequestedFeedbackOnSelfEventDetail19acce0101b310002e6bf03e1bbc0000> response = client
              .workers
              .getSelfRequestedFeedbackEvent(ID, subresourceID)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersApi#getSelfRequestedFeedbackEvent");
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
| **subresourceID** | **String**| The Workday ID of the subresource. | |

### Return type

[**RequestedFeedbackOnSelfEventDetail19acce0101b310002e6bf03e1bbc0000**](RequestedFeedbackOnSelfEventDetail19acce0101b310002e6bf03e1bbc0000.md)

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

<a name="getSingleGoal"></a>
# **getSingleGoal**
> GoalsSummary2c793e888bcd100033e663075a2b0000 getSingleGoal(ID, subresourceID).execute();

Retrieves a single goal instance for a specific worker.

Retrieves a single goal instance for a worker with the specified ID. The goal data includes name, description, category, tags, associated reviews, due date, completed date, status, creator, worker it is for, supporting organization goal, locked reason, and activity streamable item.  Secured by: Self-Service: Employee Goals, Worker Data: Employee Goals  Scope: Performance Enablement

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayPerformanceEnablement;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkersApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://<tenantHostname>/performanceEnablement/v5";
    WorkdayPerformanceEnablement client = new WorkdayPerformanceEnablement(configuration);
    String ID = "ID_example"; // The Workday ID of the resource.
    String subresourceID = "subresourceID_example"; // The Workday ID of the subresource.
    try {
      GoalsSummary2c793e888bcd100033e663075a2b0000 result = client
              .workers
              .getSingleGoal(ID, subresourceID)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getName());
      System.out.println(result.getRelatesTo());
      System.out.println(result.getActivityStreamableItem());
      System.out.println(result.getDueDate());
      System.out.println(result.getAssociatedReviews());
      System.out.println(result.getCategory());
      System.out.println(result.getSupports());
      System.out.println(result.getWorker());
      System.out.println(result.getStatus());
      System.out.println(result.getCompletedOn());
      System.out.println(result.getCreatedBy());
      System.out.println(result.getState());
      System.out.println(result.getId());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersApi#getSingleGoal");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GoalsSummary2c793e888bcd100033e663075a2b0000> response = client
              .workers
              .getSingleGoal(ID, subresourceID)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersApi#getSingleGoal");
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
| **subresourceID** | **String**| The Workday ID of the subresource. | |

### Return type

[**GoalsSummary2c793e888bcd100033e663075a2b0000**](GoalsSummary2c793e888bcd100033e663075a2b0000.md)

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

<a name="getStaffingInformation"></a>
# **getStaffingInformation**
> WorkerDataC2466b0778c610000d1936006720000e getStaffingInformation(ID).execute();

Retrieves a collection of workers and current staffing information.

Retrieves a collection of workers and current staffing information.  Secured by: Self-Service: Current Staffing Information, Worker Data: Public Worker Reports  Scope: Staffing

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayPerformanceEnablement;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkersApi;
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
      WorkerDataC2466b0778c610000d1936006720000e result = client
              .workers
              .getStaffingInformation(ID)
              .execute();
      System.out.println(result);
      System.out.println(result.getPrimaryJob());
      System.out.println(result.getPerson());
      System.out.println(result.getWorkerId());
      System.out.println(result.getWorkerType());
      System.out.println(result.getAdditionalJobs());
      System.out.println(result.getId());
      System.out.println(result.getDescriptor());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersApi#getStaffingInformation");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WorkerDataC2466b0778c610000d1936006720000e> response = client
              .workers
              .getStaffingInformation(ID)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersApi#getStaffingInformation");
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

[**WorkerDataC2466b0778c610000d1936006720000e**](WorkerDataC2466b0778c610000d1936006720000e.md)

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

<a name="requestFeedbackOnSelfEvents"></a>
# **requestFeedbackOnSelfEvents**
> RequestedFeedbackOnSelfEventDetail19acce0101b310002e6bf03e1bbc0000 requestFeedbackOnSelfEvents(ID, requestedFeedbackOnSelfEventDetail19acce0101b310002e6bf03e1bbc0000).execute();



Secured by: Get Feedback on Self REST+TG  Scope: Performance Enablement, Worker Profile and Skills

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayPerformanceEnablement;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkersApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://<tenantHostname>/performanceEnablement/v5";
    WorkdayPerformanceEnablement client = new WorkdayPerformanceEnablement(configuration);
    String ID = "ID_example"; // The Workday ID of the resource.
    BusinessProcessParameters4db9c44d36231000134c7a5b6f3b0000 businessProcessParameters = new BusinessProcessParameters4db9c44d36231000134c7a5b6f3b0000();
    List<RequestedFeedbackQuestionFfdd5de32f7f1000144df0c21e640000> feedbackQuestions = Arrays.asList(); // Feedback questions used in requested feedback events.
    FeedbackAbout4db9c44d36231000134c7b8eb3800003 feedbackAbout = new FeedbackAbout4db9c44d36231000134c7b8eb3800003();
    FeedbackTemplate4db9c44d36231000134c7b8eb3800000 feedbackTemplate = new FeedbackTemplate4db9c44d36231000134c7b8eb3800000();
    LocalDate expirationDate = LocalDate.now(); // The date the feedback request expires.
    LocalDate requestDate = LocalDate.now(); // The date the feedback request was initiated.
    String feedbackOverallStatus = "feedbackOverallStatus_example"; // Overall status of the requested feedback process.
    Boolean feedbackPrivate = true; // Private feedback between the feedback provider and the worker. Private feedback isn't shared with managers.
    List<FeedbackRespondersFfdd5de32f7f100016dbb1b188d70000> feedbackResponders = Arrays.asList(); // The respondents who've been requested to provide feedback.
    Boolean showFeedbackProviderName = true; // Whether to display the name of the responders or have them remain anonymous.
    String descriptor = "descriptor_example"; // A preview of the instance
    String id = "id_example"; // Id of the instance
    try {
      RequestedFeedbackOnSelfEventDetail19acce0101b310002e6bf03e1bbc0000 result = client
              .workers
              .requestFeedbackOnSelfEvents(ID)
              .businessProcessParameters(businessProcessParameters)
              .feedbackQuestions(feedbackQuestions)
              .feedbackAbout(feedbackAbout)
              .feedbackTemplate(feedbackTemplate)
              .expirationDate(expirationDate)
              .requestDate(requestDate)
              .feedbackOverallStatus(feedbackOverallStatus)
              .feedbackPrivate(feedbackPrivate)
              .feedbackResponders(feedbackResponders)
              .showFeedbackProviderName(showFeedbackProviderName)
              .descriptor(descriptor)
              .id(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getBusinessProcessParameters());
      System.out.println(result.getFeedbackQuestions());
      System.out.println(result.getFeedbackAbout());
      System.out.println(result.getFeedbackTemplate());
      System.out.println(result.getExpirationDate());
      System.out.println(result.getRequestDate());
      System.out.println(result.getFeedbackOverallStatus());
      System.out.println(result.getFeedbackPrivate());
      System.out.println(result.getFeedbackResponders());
      System.out.println(result.getShowFeedbackProviderName());
      System.out.println(result.getDescriptor());
      System.out.println(result.getId());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersApi#requestFeedbackOnSelfEvents");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<RequestedFeedbackOnSelfEventDetail19acce0101b310002e6bf03e1bbc0000> response = client
              .workers
              .requestFeedbackOnSelfEvents(ID)
              .businessProcessParameters(businessProcessParameters)
              .feedbackQuestions(feedbackQuestions)
              .feedbackAbout(feedbackAbout)
              .feedbackTemplate(feedbackTemplate)
              .expirationDate(expirationDate)
              .requestDate(requestDate)
              .feedbackOverallStatus(feedbackOverallStatus)
              .feedbackPrivate(feedbackPrivate)
              .feedbackResponders(feedbackResponders)
              .showFeedbackProviderName(showFeedbackProviderName)
              .descriptor(descriptor)
              .id(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersApi#requestFeedbackOnSelfEvents");
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
| **requestedFeedbackOnSelfEventDetail19acce0101b310002e6bf03e1bbc0000** | [**RequestedFeedbackOnSelfEventDetail19acce0101b310002e6bf03e1bbc0000**](RequestedFeedbackOnSelfEventDetail19acce0101b310002e6bf03e1bbc0000.md)|  | |

### Return type

[**RequestedFeedbackOnSelfEventDetail19acce0101b310002e6bf03e1bbc0000**](RequestedFeedbackOnSelfEventDetail19acce0101b310002e6bf03e1bbc0000.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Resource created. |  -  |
| **0** | An error occurred. |  -  |

<a name="requestFeedbackOnWorkerEvents"></a>
# **requestFeedbackOnWorkerEvents**
> RequestedFeedbackOnWorkerEventDetail2b4c8a6ca069100035b8586e16c20000 requestFeedbackOnWorkerEvents(ID, requestedFeedbackOnWorkerEventDetail2b4c8a6ca069100035b8586e16c20000).execute();

Not applicable.

Not applicable.  Secured by: Get Feedback on \\~Worker\\~ REST+TG  Scope: Performance Enablement, Worker Profile and Skills

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayPerformanceEnablement;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkersApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://<tenantHostname>/performanceEnablement/v5";
    WorkdayPerformanceEnablement client = new WorkdayPerformanceEnablement(configuration);
    String ID = "ID_example"; // The Workday ID of the resource.
    FeedbackAbout2b4c8a6ca069100035b85907ae2c0002 feedbackAbout = new FeedbackAbout2b4c8a6ca069100035b85907ae2c0002();
    Boolean feedbackConfidential = true; // Yes if the feedback is confidential between the feedback provider and the manager. Workers don't see confidential feedback.
    String feedbackOverallStatus = "feedbackOverallStatus_example"; // Overall status of the requested feedback process.
    Boolean showFeedbackProviderName = true; // Whether to display the name of the responders or have them remain anonymous.ccc
    LocalDate requestDate = LocalDate.now(); // The date the feedback request was initiated.
    LocalDate expirationDate = LocalDate.now(); // The date the feedback request expires.
    List<RequestedFeedbackQuestionFfdd5de32f7f1000144df0c21e640000> feedbackQuestions = Arrays.asList(); // Feedback questions used in requested feedback events.
    FeedbackTemplate2b4c8a6ca069100035b859a141200001 feedbackTemplate = new FeedbackTemplate2b4c8a6ca069100035b859a141200001();
    List<FeedbackRespondersFfdd5de32f7f100016dbb1b188d70000> feedbackResponders = Arrays.asList(); // The respondents who've been requested to provide feedback.
    BusinessProcessParameters2b4c8a6ca069100035b85907ae2c0000 businessProcessParameters = new BusinessProcessParameters2b4c8a6ca069100035b85907ae2c0000();
    String descriptor = "descriptor_example"; // A preview of the instance
    String id = "id_example"; // Id of the instance
    try {
      RequestedFeedbackOnWorkerEventDetail2b4c8a6ca069100035b8586e16c20000 result = client
              .workers
              .requestFeedbackOnWorkerEvents(ID)
              .feedbackAbout(feedbackAbout)
              .feedbackConfidential(feedbackConfidential)
              .feedbackOverallStatus(feedbackOverallStatus)
              .showFeedbackProviderName(showFeedbackProviderName)
              .requestDate(requestDate)
              .expirationDate(expirationDate)
              .feedbackQuestions(feedbackQuestions)
              .feedbackTemplate(feedbackTemplate)
              .feedbackResponders(feedbackResponders)
              .businessProcessParameters(businessProcessParameters)
              .descriptor(descriptor)
              .id(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getFeedbackAbout());
      System.out.println(result.getFeedbackConfidential());
      System.out.println(result.getFeedbackOverallStatus());
      System.out.println(result.getShowFeedbackProviderName());
      System.out.println(result.getRequestDate());
      System.out.println(result.getExpirationDate());
      System.out.println(result.getFeedbackQuestions());
      System.out.println(result.getFeedbackTemplate());
      System.out.println(result.getFeedbackResponders());
      System.out.println(result.getBusinessProcessParameters());
      System.out.println(result.getDescriptor());
      System.out.println(result.getId());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersApi#requestFeedbackOnWorkerEvents");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<RequestedFeedbackOnWorkerEventDetail2b4c8a6ca069100035b8586e16c20000> response = client
              .workers
              .requestFeedbackOnWorkerEvents(ID)
              .feedbackAbout(feedbackAbout)
              .feedbackConfidential(feedbackConfidential)
              .feedbackOverallStatus(feedbackOverallStatus)
              .showFeedbackProviderName(showFeedbackProviderName)
              .requestDate(requestDate)
              .expirationDate(expirationDate)
              .feedbackQuestions(feedbackQuestions)
              .feedbackTemplate(feedbackTemplate)
              .feedbackResponders(feedbackResponders)
              .businessProcessParameters(businessProcessParameters)
              .descriptor(descriptor)
              .id(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersApi#requestFeedbackOnWorkerEvents");
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
| **requestedFeedbackOnWorkerEventDetail2b4c8a6ca069100035b8586e16c20000** | [**RequestedFeedbackOnWorkerEventDetail2b4c8a6ca069100035b8586e16c20000**](RequestedFeedbackOnWorkerEventDetail2b4c8a6ca069100035b8586e16c20000.md)|  | |

### Return type

[**RequestedFeedbackOnWorkerEventDetail2b4c8a6ca069100035b8586e16c20000**](RequestedFeedbackOnWorkerEventDetail2b4c8a6ca069100035b8586e16c20000.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Resource created. |  -  |
| **0** | An error occurred. |  -  |

