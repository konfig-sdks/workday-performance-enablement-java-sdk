# PromptValuesApi

All URIs are relative to *https://&lt;tenantHostname&gt;/performanceEnablement/v5*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getInstances**](PromptValuesApi.md#getInstances) | **GET** /values/workersToNotify/workersToNotify |  |
| [**getInstances_0**](PromptValuesApi.md#getInstances_0) | **GET** /values/feedbackTemplate/feedbackTemplate |  |
| [**getInstances_1**](PromptValuesApi.md#getInstances_1) | **GET** /values/feedbackOnWorker/feedbackOnWorker |  |
| [**getInstances_2**](PromptValuesApi.md#getInstances_2) | **GET** /values/feedbackResponder/feedbackResponder |  |
| [**getInstances_3**](PromptValuesApi.md#getInstances_3) | **GET** /values/relatesTo/relatesTo |  |


<a name="getInstances"></a>
# **getInstances**
> MULTIPLEINSTANCEMODELREFERENCE getInstances().limit(limit).offset(offset).workers(workers).execute();



Retrieves instances that can be used as values for other endpoint parameters in this service.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayPerformanceEnablement;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PromptValuesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://<tenantHostname>/performanceEnablement/v5";
    WorkdayPerformanceEnablement client = new WorkdayPerformanceEnablement(configuration);
    Long limit = 56L; // The maximum number of objects in a single response. The default and maximum is 1000.
    Long offset = 56L; // The zero-based index of the first object in a response collection. The default is 0. Use offset with the limit parameter to control paging of a response collection. Example: If limit is 5 and offset is 9, the response returns a collection of 5 objects starting with the 10th object.
    List<String> workers = Arrays.asList();
    try {
      MULTIPLEINSTANCEMODELREFERENCE result = client
              .promptValues
              .getInstances()
              .limit(limit)
              .offset(offset)
              .workers(workers)
              .execute();
      System.out.println(result);
      System.out.println(result.getTotal());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling PromptValuesApi#getInstances");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<MULTIPLEINSTANCEMODELREFERENCE> response = client
              .promptValues
              .getInstances()
              .limit(limit)
              .offset(offset)
              .workers(workers)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PromptValuesApi#getInstances");
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
| **limit** | **Long**| The maximum number of objects in a single response. The default and maximum is 1000. | [optional] |
| **offset** | **Long**| The zero-based index of the first object in a response collection. The default is 0. Use offset with the limit parameter to control paging of a response collection. Example: If limit is 5 and offset is 9, the response returns a collection of 5 objects starting with the 10th object. | [optional] |
| **workers** | [**List&lt;String&gt;**](String.md)|  | [optional] |

### Return type

[**MULTIPLEINSTANCEMODELREFERENCE**](MULTIPLEINSTANCEMODELREFERENCE.md)

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

<a name="getInstances_0"></a>
# **getInstances_0**
> MULTIPLEINSTANCEMODELREFERENCE getInstances_0().limit(limit).offset(offset).templateType(templateType).worker(worker).execute();



Retrieves instances that can be used as values for other endpoint parameters in this service.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayPerformanceEnablement;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PromptValuesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://<tenantHostname>/performanceEnablement/v5";
    WorkdayPerformanceEnablement client = new WorkdayPerformanceEnablement(configuration);
    Long limit = 56L; // The maximum number of objects in a single response. The default and maximum is 1000.
    Long offset = 56L; // The zero-based index of the first object in a response collection. The default is 0. Use offset with the limit parameter to control paging of a response collection. Example: If limit is 5 and offset is 9, the response returns a collection of 5 objects starting with the 10th object.
    String templateType = "templateType_example"; // The feedback template type for this feedback event, either Feedback on Self, 133de7d11fea10001dbb45a701140098 or Feedback on Worker 133de7d11fea10001dbb45973dec0097. This field is required.
    String worker = "worker_example"; // The worker WID. This field is required for the Feedback on Worker template and not supported for the Feedback on Self template. It can't be the processing worker.
    try {
      MULTIPLEINSTANCEMODELREFERENCE result = client
              .promptValues
              .getInstances_0()
              .limit(limit)
              .offset(offset)
              .templateType(templateType)
              .worker(worker)
              .execute();
      System.out.println(result);
      System.out.println(result.getTotal());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling PromptValuesApi#getInstances_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<MULTIPLEINSTANCEMODELREFERENCE> response = client
              .promptValues
              .getInstances_0()
              .limit(limit)
              .offset(offset)
              .templateType(templateType)
              .worker(worker)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PromptValuesApi#getInstances_0");
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
| **limit** | **Long**| The maximum number of objects in a single response. The default and maximum is 1000. | [optional] |
| **offset** | **Long**| The zero-based index of the first object in a response collection. The default is 0. Use offset with the limit parameter to control paging of a response collection. Example: If limit is 5 and offset is 9, the response returns a collection of 5 objects starting with the 10th object. | [optional] |
| **templateType** | **String**| The feedback template type for this feedback event, either Feedback on Self, 133de7d11fea10001dbb45a701140098 or Feedback on Worker 133de7d11fea10001dbb45973dec0097. This field is required. | [optional] |
| **worker** | **String**| The worker WID. This field is required for the Feedback on Worker template and not supported for the Feedback on Self template. It can&#39;t be the processing worker. | [optional] |

### Return type

[**MULTIPLEINSTANCEMODELREFERENCE**](MULTIPLEINSTANCEMODELREFERENCE.md)

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

<a name="getInstances_1"></a>
# **getInstances_1**
> MULTIPLEINSTANCEMODELREFERENCE getInstances_1().limit(limit).offset(offset).execute();



Retrieves instances that can be used as values for other endpoint parameters in this service.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayPerformanceEnablement;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PromptValuesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://<tenantHostname>/performanceEnablement/v5";
    WorkdayPerformanceEnablement client = new WorkdayPerformanceEnablement(configuration);
    Long limit = 56L; // The maximum number of objects in a single response. The default and maximum is 1000.
    Long offset = 56L; // The zero-based index of the first object in a response collection. The default is 0. Use offset with the limit parameter to control paging of a response collection. Example: If limit is 5 and offset is 9, the response returns a collection of 5 objects starting with the 10th object.
    try {
      MULTIPLEINSTANCEMODELREFERENCE result = client
              .promptValues
              .getInstances_1()
              .limit(limit)
              .offset(offset)
              .execute();
      System.out.println(result);
      System.out.println(result.getTotal());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling PromptValuesApi#getInstances_1");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<MULTIPLEINSTANCEMODELREFERENCE> response = client
              .promptValues
              .getInstances_1()
              .limit(limit)
              .offset(offset)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PromptValuesApi#getInstances_1");
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
| **limit** | **Long**| The maximum number of objects in a single response. The default and maximum is 1000. | [optional] |
| **offset** | **Long**| The zero-based index of the first object in a response collection. The default is 0. Use offset with the limit parameter to control paging of a response collection. Example: If limit is 5 and offset is 9, the response returns a collection of 5 objects starting with the 10th object. | [optional] |

### Return type

[**MULTIPLEINSTANCEMODELREFERENCE**](MULTIPLEINSTANCEMODELREFERENCE.md)

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

<a name="getInstances_2"></a>
# **getInstances_2**
> MULTIPLEINSTANCEMODELREFERENCE getInstances_2().limit(limit).offset(offset).templateType(templateType).worker(worker).execute();



Retrieves instances that can be used as values for other endpoint parameters in this service.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayPerformanceEnablement;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PromptValuesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://<tenantHostname>/performanceEnablement/v5";
    WorkdayPerformanceEnablement client = new WorkdayPerformanceEnablement(configuration);
    Long limit = 56L; // The maximum number of objects in a single response. The default and maximum is 1000.
    Long offset = 56L; // The zero-based index of the first object in a response collection. The default is 0. Use offset with the limit parameter to control paging of a response collection. Example: If limit is 5 and offset is 9, the response returns a collection of 5 objects starting with the 10th object.
    String templateType = "templateType_example"; // The feedback template type for this feedback event, either Feedback on Self, 133de7d11fea10001dbb45a701140098 or Feedback on Worker 133de7d11fea10001dbb45973dec0097. This field is required.
    String worker = "worker_example"; // The worker WID. This field is required for the Feedback on Worker templateType and not supported for the Feedback on Self templateType. It can't be the processing worker.
    try {
      MULTIPLEINSTANCEMODELREFERENCE result = client
              .promptValues
              .getInstances_2()
              .limit(limit)
              .offset(offset)
              .templateType(templateType)
              .worker(worker)
              .execute();
      System.out.println(result);
      System.out.println(result.getTotal());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling PromptValuesApi#getInstances_2");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<MULTIPLEINSTANCEMODELREFERENCE> response = client
              .promptValues
              .getInstances_2()
              .limit(limit)
              .offset(offset)
              .templateType(templateType)
              .worker(worker)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PromptValuesApi#getInstances_2");
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
| **limit** | **Long**| The maximum number of objects in a single response. The default and maximum is 1000. | [optional] |
| **offset** | **Long**| The zero-based index of the first object in a response collection. The default is 0. Use offset with the limit parameter to control paging of a response collection. Example: If limit is 5 and offset is 9, the response returns a collection of 5 objects starting with the 10th object. | [optional] |
| **templateType** | **String**| The feedback template type for this feedback event, either Feedback on Self, 133de7d11fea10001dbb45a701140098 or Feedback on Worker 133de7d11fea10001dbb45973dec0097. This field is required. | [optional] |
| **worker** | **String**| The worker WID. This field is required for the Feedback on Worker templateType and not supported for the Feedback on Self templateType. It can&#39;t be the processing worker. | [optional] |

### Return type

[**MULTIPLEINSTANCEMODELREFERENCE**](MULTIPLEINSTANCEMODELREFERENCE.md)

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

<a name="getInstances_3"></a>
# **getInstances_3**
> MULTIPLEINSTANCEMODELREFERENCE getInstances_3().limit(limit).offset(offset).relatesToTag(relatesToTag).execute();



Retrieves instances that can be used as values for other endpoint parameters in this service.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayPerformanceEnablement;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PromptValuesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://<tenantHostname>/performanceEnablement/v5";
    WorkdayPerformanceEnablement client = new WorkdayPerformanceEnablement(configuration);
    Long limit = 56L; // The maximum number of objects in a single response. The default and maximum is 1000.
    Long offset = 56L; // The zero-based index of the first object in a response collection. The default is 0. Use offset with the limit parameter to control paging of a response collection. Example: If limit is 5 and offset is 9, the response returns a collection of 5 objects starting with the 10th object.
    String relatesToTag = "relatesToTag_example"; // The talent tag linked to the feedback question.
    try {
      MULTIPLEINSTANCEMODELREFERENCE result = client
              .promptValues
              .getInstances_3()
              .limit(limit)
              .offset(offset)
              .relatesToTag(relatesToTag)
              .execute();
      System.out.println(result);
      System.out.println(result.getTotal());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling PromptValuesApi#getInstances_3");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<MULTIPLEINSTANCEMODELREFERENCE> response = client
              .promptValues
              .getInstances_3()
              .limit(limit)
              .offset(offset)
              .relatesToTag(relatesToTag)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PromptValuesApi#getInstances_3");
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
| **limit** | **Long**| The maximum number of objects in a single response. The default and maximum is 1000. | [optional] |
| **offset** | **Long**| The zero-based index of the first object in a response collection. The default is 0. Use offset with the limit parameter to control paging of a response collection. Example: If limit is 5 and offset is 9, the response returns a collection of 5 objects starting with the 10th object. | [optional] |
| **relatesToTag** | **String**| The talent tag linked to the feedback question. | [optional] |

### Return type

[**MULTIPLEINSTANCEMODELREFERENCE**](MULTIPLEINSTANCEMODELREFERENCE.md)

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

