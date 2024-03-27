<div align="left">

[![Visit Workday](./header.png)](https://workday.com)

# [Workday](https://workday.com)

The Performance Management service enables applications to access and create feedback about workers in the system.

</div>

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

If you are adding this library to an Android Application or Library:

3. Android 8.0+ (API Level 26+)

## Installation<a id="installation"></a>
<div align="center">
  <a href="https://konfigthis.com/sdk-sign-up?company=Workday&serviceName=PerformanceEnablement&language=Java">
    <img src="https://raw.githubusercontent.com/konfig-dev/brand-assets/HEAD/cta-images/java-cta.png" width="70%">
  </a>
</div>

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.konfigthis</groupId>
  <artifactId>workday-performance-enablement-java-sdk</artifactId>
  <version>v5</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your `build.gradle`:

```groovy
// build.gradle
repositories {
  mavenCentral()
}

dependencies {
   implementation "com.konfigthis:workday-performance-enablement-java-sdk:v5"
}
```

### Android users

Make sure your `build.gradle` file as a `minSdk` version of at least 26:
```groovy
// build.gradle
android {
    defaultConfig {
        minSdk 26
    }
}
```

Also make sure your library or application has internet permissions in your `AndroidManifest.xml`:

```xml
<!--AndroidManifest.xml-->
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools">
    <uses-permission android:name="android.permission.INTERNET"/>
</manifest>
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/workday-performance-enablement-java-sdk-v5.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

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

## Documentation for API Endpoints

All URIs are relative to *https://&lt;tenantHostname&gt;/performanceEnablement/v5*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*PromptValuesApi* | [**getInstances**](docs/PromptValuesApi.md#getInstances) | **GET** /values/workersToNotify/workersToNotify | 
*PromptValuesApi* | [**getInstances_0**](docs/PromptValuesApi.md#getInstances_0) | **GET** /values/feedbackTemplate/feedbackTemplate | 
*PromptValuesApi* | [**getInstances_1**](docs/PromptValuesApi.md#getInstances_1) | **GET** /values/feedbackOnWorker/feedbackOnWorker | 
*PromptValuesApi* | [**getInstances_2**](docs/PromptValuesApi.md#getInstances_2) | **GET** /values/feedbackResponder/feedbackResponder | 
*PromptValuesApi* | [**getInstances_3**](docs/PromptValuesApi.md#getInstances_3) | **GET** /values/relatesTo/relatesTo | 
*FeedbackBadgesApi* | [**getById**](docs/FeedbackBadgesApi.md#getById) | **GET** /feedbackBadges/{ID} | Retrieves a Feedback Badge with the specified ID.
*FeedbackBadgesApi* | [**getCollection**](docs/FeedbackBadgesApi.md#getCollection) | **GET** /feedbackBadges | Retrieves a collection of active Feedback Badges.
*GiveRequestedFeedbackEventsApi* | [**getCollectionFeedbackEvents**](docs/GiveRequestedFeedbackEventsApi.md#getCollectionFeedbackEvents) | **GET** /giveRequestedFeedbackEvents | Retrieves a collection of feedback given events about the user that responded to the feedback request.
*GiveRequestedFeedbackEventsApi* | [**getInstance**](docs/GiveRequestedFeedbackEventsApi.md#getInstance) | **GET** /giveRequestedFeedbackEvents/{ID} | Retrieves a single requested feedback given event instance with the specified ID of the user that responded to the feedback request.
*GiveRequestedFeedbackEventsApi* | [**updateEvent**](docs/GiveRequestedFeedbackEventsApi.md#updateEvent) | **PATCH** /giveRequestedFeedbackEvents/{ID} | Updates the Give Requested Feedback Event that matches the WID in the url, and the current authenticated user is a responder for the event.
*WorkersApi* | [**createFeedbackEvent**](docs/WorkersApi.md#createFeedbackEvent) | **POST** /workers/{ID}/anytimeFeedbackEvents | Creates a single feedback given event instance about the specified worker.
*WorkersApi* | [**getCollectionStaffing**](docs/WorkersApi.md#getCollectionStaffing) | **GET** /workers | Retrieves a collection of workers and current staffing information.
*WorkersApi* | [**getFeedbackEvent**](docs/WorkersApi.md#getFeedbackEvent) | **GET** /workers/{ID}/anytimeFeedbackEvents/{subresourceID} | Retrieves a feedback given event instance with the specified ID.
*WorkersApi* | [**getFeedbackEvents**](docs/WorkersApi.md#getFeedbackEvents) | **GET** /workers/{ID}/anytimeFeedbackEvents | Retrieves a collection of feedback given events about the specified worker.
*WorkersApi* | [**getGoals**](docs/WorkersApi.md#getGoals) | **GET** /workers/{ID}/goals | Retrieves a collection of goals for a specific worker.
*WorkersApi* | [**getRequestedEvent**](docs/WorkersApi.md#getRequestedEvent) | **GET** /workers/{ID}/requestedFeedbackOnWorkerEvents/{subresourceID} | Retrieves a single requested feedback event instance for the specified worker.
*WorkersApi* | [**getRequestedFeedbackEvents**](docs/WorkersApi.md#getRequestedFeedbackEvents) | **GET** /workers/{ID}/requestedFeedbackOnWorkerEvents | Retrieves a collection of requested feedback events for the specified worker.
*WorkersApi* | [**getSelfRequestedFeedback**](docs/WorkersApi.md#getSelfRequestedFeedback) | **GET** /workers/{ID}/requestedFeedbackOnSelfEvents | Retrieves a collection of self-requested feedback events for the specified worker.
*WorkersApi* | [**getSelfRequestedFeedbackEvent**](docs/WorkersApi.md#getSelfRequestedFeedbackEvent) | **GET** /workers/{ID}/requestedFeedbackOnSelfEvents/{subresourceID} | Retrieves a single self-requested feedback event instance for the specified worker.
*WorkersApi* | [**getSingleGoal**](docs/WorkersApi.md#getSingleGoal) | **GET** /workers/{ID}/goals/{subresourceID} | Retrieves a single goal instance for a specific worker.
*WorkersApi* | [**getStaffingInformation**](docs/WorkersApi.md#getStaffingInformation) | **GET** /workers/{ID} | Retrieves a collection of workers and current staffing information.
*WorkersApi* | [**requestFeedbackOnSelfEvents**](docs/WorkersApi.md#requestFeedbackOnSelfEvents) | **POST** /workers/{ID}/requestedFeedbackOnSelfEvents | 
*WorkersApi* | [**requestFeedbackOnWorkerEvents**](docs/WorkersApi.md#requestFeedbackOnWorkerEvents) | **POST** /workers/{ID}/requestedFeedbackOnWorkerEvents | Not applicable.


## Documentation for Models

 - [AboutWorkerD396fd5bffec1000100f44a5808f0005](docs/AboutWorkerD396fd5bffec1000100f44a5808f0005.md)
 - [Action38ff08ab6736100010816009079d0126](docs/Action38ff08ab6736100010816009079d0126.md)
 - [ActivityStreamableItemSummary88d272af423b100036fc19a90e210000](docs/ActivityStreamableItemSummary88d272af423b100036fc19a90e210000.md)
 - [ActivityStreamableItemSummary88d272af423b100036fc19a90e210000AllOf](docs/ActivityStreamableItemSummary88d272af423b100036fc19a90e210000AllOf.md)
 - [AssociatedReviewsSummary2c793e888bcd1000346e381955dd0000](docs/AssociatedReviewsSummary2c793e888bcd1000346e381955dd0000.md)
 - [AssociatedReviewsSummary2c793e888bcd1000346e381955dd0000AllOf](docs/AssociatedReviewsSummary2c793e888bcd1000346e381955dd0000AllOf.md)
 - [BadgeAfd6ac52d62510001357f891ccfd0003](docs/BadgeAfd6ac52d62510001357f891ccfd0003.md)
 - [BusinessProcessParameters2b4c8a6ca069100035b85907ae2c0000](docs/BusinessProcessParameters2b4c8a6ca069100035b85907ae2c0000.md)
 - [BusinessProcessParameters4db9c44d36231000134c7a5b6f3b0000](docs/BusinessProcessParameters4db9c44d36231000134c7a5b6f3b0000.md)
 - [BusinessProcessParameters9708c966f04f10000e4ae9a03cf80001](docs/BusinessProcessParameters9708c966f04f10000e4ae9a03cf80001.md)
 - [BusinessProcessParametersAfd6ac52d6251000117be546cb060000](docs/BusinessProcessParametersAfd6ac52d6251000117be546cb060000.md)
 - [BusinessProcessParametersAfd6ac52d6251000117be546cb060000AllOf](docs/BusinessProcessParametersAfd6ac52d6251000117be546cb060000AllOf.md)
 - [BusinessProcessParametersAfd6ac52d6251000117d0a60ed8b0000](docs/BusinessProcessParametersAfd6ac52d6251000117d0a60ed8b0000.md)
 - [BusinessProcessParametersD396fd5bffec1000100f440bde4c0001](docs/BusinessProcessParametersD396fd5bffec1000100f440bde4c0001.md)
 - [Category43b30ba735b8100011ee4781a9d50146](docs/Category43b30ba735b8100011ee4781a9d50146.md)
 - [CategorySummary88d272af423b100036e57ea69d570000](docs/CategorySummary88d272af423b100036e57ea69d570000.md)
 - [CategorySummary88d272af423b100036e57ea69d570000AllOf](docs/CategorySummary88d272af423b100036e57ea69d570000AllOf.md)
 - [Comments86093b8a932f10001499f356ff83012e](docs/Comments86093b8a932f10001499f356ff83012e.md)
 - [Comments86093b8a932f10001499f356ff83012eAllOf](docs/Comments86093b8a932f10001499f356ff83012eAllOf.md)
 - [ContentType43b30ba735b8100011ee47993f11014a](docs/ContentType43b30ba735b8100011ee47993f11014a.md)
 - [CountryAf21e47ff7c01000092ecf4d7ad30270](docs/CountryAf21e47ff7c01000092ecf4d7ad30270.md)
 - [CountryDataForLocationDataAf21e47ff7c01000092e0e4f9a22026e](docs/CountryDataForLocationDataAf21e47ff7c01000092e0e4f9a22026e.md)
 - [CountryDataForLocationDataAf21e47ff7c01000092e0e4f9a22026eAllOf](docs/CountryDataForLocationDataAf21e47ff7c01000092e0e4f9a22026eAllOf.md)
 - [CreatedBy88d272af423b100036b561a7784b0000](docs/CreatedBy88d272af423b100036b561a7784b0000.md)
 - [ERRORMODELREFERENCE](docs/ERRORMODELREFERENCE.md)
 - [EventAttachmentsForToolbar43b30ba735b8100011ee4767246d0143](docs/EventAttachmentsForToolbar43b30ba735b8100011ee4767246d0143.md)
 - [EventAttachmentsForToolbar43b30ba735b8100011ee4767246d0143AllOf](docs/EventAttachmentsForToolbar43b30ba735b8100011ee4767246d0143AllOf.md)
 - [FACETSMODELREFERENCEInner](docs/FACETSMODELREFERENCEInner.md)
 - [FACETSMODELREFERENCEInnerValuesInner](docs/FACETSMODELREFERENCEInnerValuesInner.md)
 - [FeedbackAbout2b4c8a6ca069100035b85907ae2c0002](docs/FeedbackAbout2b4c8a6ca069100035b85907ae2c0002.md)
 - [FeedbackAbout4db9c44d36231000134c7b8eb3800003](docs/FeedbackAbout4db9c44d36231000134c7b8eb3800003.md)
 - [FeedbackBadgeDetail9eab868ca81410001402525d054211f7](docs/FeedbackBadgeDetail9eab868ca81410001402525d054211f7.md)
 - [FeedbackBadgeDetail9eab868ca81410001402525d054211f7AllOf](docs/FeedbackBadgeDetail9eab868ca81410001402525d054211f7AllOf.md)
 - [FeedbackBadgeIconD4d355b2d3db100020b8608b75250016](docs/FeedbackBadgeIconD4d355b2d3db100020b8608b75250016.md)
 - [FeedbackBadgesGetCollectionResponse](docs/FeedbackBadgesGetCollectionResponse.md)
 - [FeedbackEventDetailAfd6ac52d62510001086b5c85cd50000](docs/FeedbackEventDetailAfd6ac52d62510001086b5c85cd50000.md)
 - [FeedbackEventDetailAfd6ac52d62510001086b5c85cd50000AllOf](docs/FeedbackEventDetailAfd6ac52d62510001086b5c85cd50000AllOf.md)
 - [FeedbackQuestionD396fd5bffec10001393481822cd0007](docs/FeedbackQuestionD396fd5bffec10001393481822cd0007.md)
 - [FeedbackResponder2f703c317dc910001c16504848720001](docs/FeedbackResponder2f703c317dc910001c16504848720001.md)
 - [FeedbackRespondersFfdd5de32f7f100016dbb1b188d70000](docs/FeedbackRespondersFfdd5de32f7f100016dbb1b188d70000.md)
 - [FeedbackRespondersFfdd5de32f7f100016dbb1b188d70000AllOf](docs/FeedbackRespondersFfdd5de32f7f100016dbb1b188d70000AllOf.md)
 - [FeedbackResponse2f703c317dc910001bd2de83d1590000](docs/FeedbackResponse2f703c317dc910001bd2de83d1590000.md)
 - [FeedbackResponse2f703c317dc910001bd2de83d1590000AllOf](docs/FeedbackResponse2f703c317dc910001bd2de83d1590000AllOf.md)
 - [FeedbackTemplate2b4c8a6ca069100035b859a141200001](docs/FeedbackTemplate2b4c8a6ca069100035b859a141200001.md)
 - [FeedbackTemplate4db9c44d36231000134c7b8eb3800000](docs/FeedbackTemplate4db9c44d36231000134c7b8eb3800000.md)
 - [For5d688bd57bb910001815ab3dd10024a9](docs/For5d688bd57bb910001815ab3dd10024a9.md)
 - [FromWorkerAfd6ac52d62510001357f891ccfd0001](docs/FromWorkerAfd6ac52d62510001357f891ccfd0001.md)
 - [GetWorkersFeedbackAlsoAbout3ab333661034100010b5635b2f7a0302](docs/GetWorkersFeedbackAlsoAbout3ab333661034100010b5635b2f7a0302.md)
 - [GetWorkersFeedbackAlsoAbout3ab333661034100010b5635b2f7a0302AllOf](docs/GetWorkersFeedbackAlsoAbout3ab333661034100010b5635b2f7a0302AllOf.md)
 - [GigOpeningTalentTagAbe398d81e1e1000167d6197a9060000](docs/GigOpeningTalentTagAbe398d81e1e1000167d6197a9060000.md)
 - [GigOpeningTalentTagAbe398d81e1e1000167d6197a9060000AllOf](docs/GigOpeningTalentTagAbe398d81e1e1000167d6197a9060000AllOf.md)
 - [GiveRequestedFeedbackDetailsD396fd5bffec10000e3eba1a70440000](docs/GiveRequestedFeedbackDetailsD396fd5bffec10000e3eba1a70440000.md)
 - [GiveRequestedFeedbackDetailsD396fd5bffec10000e3eba1a70440000AllOf](docs/GiveRequestedFeedbackDetailsD396fd5bffec10000e3eba1a70440000AllOf.md)
 - [GiveRequestedFeedbackEventsGetCollectionFeedbackEventsResponse](docs/GiveRequestedFeedbackEventsGetCollectionFeedbackEventsResponse.md)
 - [GoalsSummary2c793e888bcd100033e663075a2b0000](docs/GoalsSummary2c793e888bcd100033e663075a2b0000.md)
 - [GoalsSummary2c793e888bcd100033e663075a2b0000AllOf](docs/GoalsSummary2c793e888bcd100033e663075a2b0000AllOf.md)
 - [INSTANCEMODELREFERENCE](docs/INSTANCEMODELREFERENCE.md)
 - [JobDataForWorkerB8ac205877fd10000ea91719a02a00a2](docs/JobDataForWorkerB8ac205877fd10000ea91719a02a00a2.md)
 - [JobDataForWorkerB8ac205877fd10000ea91719a02a00a2AllOf](docs/JobDataForWorkerB8ac205877fd10000ea91719a02a00a2AllOf.md)
 - [JobProfileB8ac205877fd10000ea9174f73c500aa](docs/JobProfileB8ac205877fd10000ea9174f73c500aa.md)
 - [JobProfileJobViewFab4a151b24810000d511d61ee641262](docs/JobProfileJobViewFab4a151b24810000d511d61ee641262.md)
 - [JobProfileJobViewFab4a151b24810000d511d61ee641262AllOf](docs/JobProfileJobViewFab4a151b24810000d511d61ee641262AllOf.md)
 - [JobTypeB8ac205877fd10000ea91752f39c00ab](docs/JobTypeB8ac205877fd10000ea91752f39c00ab.md)
 - [JobTypeDataB8ac205877fd100005c3b50b74a30055](docs/JobTypeDataB8ac205877fd100005c3b50b74a30055.md)
 - [JobTypeDataB8ac205877fd100005c3b50b74a30055AllOf](docs/JobTypeDataB8ac205877fd100005c3b50b74a30055AllOf.md)
 - [JobWorkspaceData1005157e3d631000144205466a6c13d3](docs/JobWorkspaceData1005157e3d631000144205466a6c13d3.md)
 - [JobWorkspaceData1005157e3d631000144205466a6c13d3AllOf](docs/JobWorkspaceData1005157e3d631000144205466a6c13d3AllOf.md)
 - [LocationB8ac205877fd10000ea91737c7da00a5](docs/LocationB8ac205877fd10000ea91737c7da00a5.md)
 - [LocationDataJobView6d3eb084b4c410002b5fa13f0c9d0056](docs/LocationDataJobView6d3eb084b4c410002b5fa13f0c9d0056.md)
 - [LocationDataJobView6d3eb084b4c410002b5fa13f0c9d0056AllOf](docs/LocationDataJobView6d3eb084b4c410002b5fa13f0c9d0056AllOf.md)
 - [MULTIPLEINSTANCEMODELREFERENCE](docs/MULTIPLEINSTANCEMODELREFERENCE.md)
 - [MultipleChoiceAnswers06c0300303a9100019828d5ca44a0000](docs/MultipleChoiceAnswers06c0300303a9100019828d5ca44a0000.md)
 - [MultipleChoiceAnswers06c0300303a9100019828d5ca44a0000AllOf](docs/MultipleChoiceAnswers06c0300303a9100019828d5ca44a0000AllOf.md)
 - [OverallBusinessProcess5d688bd57bb910001815ab49927724aa](docs/OverallBusinessProcess5d688bd57bb910001815ab49927724aa.md)
 - [Person0ad147648b0a1000237bd486634a001a](docs/Person0ad147648b0a1000237bd486634a001a.md)
 - [Person86093b8a932f10001499f38c72410130](docs/Person86093b8a932f10001499f38c72410130.md)
 - [PersonDataViewBe343791f59d100028d6a277ca8a0017](docs/PersonDataViewBe343791f59d100028d6a277ca8a0017.md)
 - [PersonDataViewBe343791f59d100028d6a277ca8a0017AllOf](docs/PersonDataViewBe343791f59d100028d6a277ca8a0017AllOf.md)
 - [PossibleMultipleChoiceAnswers4c60c128c16510000a59980041610000](docs/PossibleMultipleChoiceAnswers4c60c128c16510000a59980041610000.md)
 - [PossibleMultipleChoiceAnswers4c60c128c16510000a59980041610000AllOf](docs/PossibleMultipleChoiceAnswers4c60c128c16510000a59980041610000AllOf.md)
 - [PrimaryJob352c3a97ecd51000353cba144c5b0042](docs/PrimaryJob352c3a97ecd51000353cba144c5b0042.md)
 - [QuestionMultipleChoiceFfdd5de32f7f100016c2c1e768f40000](docs/QuestionMultipleChoiceFfdd5de32f7f100016c2c1e768f40000.md)
 - [QuestionMultipleChoiceFfdd5de32f7f100016c2c1e768f40000AllOf](docs/QuestionMultipleChoiceFfdd5de32f7f100016c2c1e768f40000AllOf.md)
 - [QuestionType544916c1cd75100006c4f105d3f60000](docs/QuestionType544916c1cd75100006c4f105d3f60000.md)
 - [QuestionTypeFfdd5de32f7f1000144df15bb77b0001](docs/QuestionTypeFfdd5de32f7f1000144df15bb77b0001.md)
 - [RelatedFeedbackEvents9708c966f04f10000e1e9b7f9a5c0000](docs/RelatedFeedbackEvents9708c966f04f10000e1e9b7f9a5c0000.md)
 - [RelatedFeedbackEvents9708c966f04f10000e1e9b7f9a5c0000AllOf](docs/RelatedFeedbackEvents9708c966f04f10000e1e9b7f9a5c0000AllOf.md)
 - [RelatesTo9d12ad407f0f10001c3949add7d40000](docs/RelatesTo9d12ad407f0f10001c3949add7d40000.md)
 - [RelatesToC836a10b43ed10000beb5b92b4c10000](docs/RelatesToC836a10b43ed10000beb5b92b4c10000.md)
 - [RelatesToC836a10b43ed10000beb5b92b4c10000AllOf](docs/RelatesToC836a10b43ed10000beb5b92b4c10000AllOf.md)
 - [RelatesToSummary2c793e888bcd100034b42ada01b20000](docs/RelatesToSummary2c793e888bcd100034b42ada01b20000.md)
 - [RelatesToSummary2c793e888bcd100034b42ada01b20000AllOf](docs/RelatesToSummary2c793e888bcd100034b42ada01b20000AllOf.md)
 - [RequestedByD396fd5bffec1000100f44a5808f0006](docs/RequestedByD396fd5bffec1000100f44a5808f0006.md)
 - [RequestedFeedbackCommentsD396fd5bffec10001393477e77870000](docs/RequestedFeedbackCommentsD396fd5bffec10001393477e77870000.md)
 - [RequestedFeedbackCommentsD396fd5bffec10001393477e77870000AllOf](docs/RequestedFeedbackCommentsD396fd5bffec10001393477e77870000AllOf.md)
 - [RequestedFeedbackOnSelfEventDetail19acce0101b310002e6bf03e1bbc0000](docs/RequestedFeedbackOnSelfEventDetail19acce0101b310002e6bf03e1bbc0000.md)
 - [RequestedFeedbackOnSelfEventDetail19acce0101b310002e6bf03e1bbc0000AllOf](docs/RequestedFeedbackOnSelfEventDetail19acce0101b310002e6bf03e1bbc0000AllOf.md)
 - [RequestedFeedbackOnWorkerEventDetail2b4c8a6ca069100035b8586e16c20000](docs/RequestedFeedbackOnWorkerEventDetail2b4c8a6ca069100035b8586e16c20000.md)
 - [RequestedFeedbackOnWorkerEventDetail2b4c8a6ca069100035b8586e16c20000AllOf](docs/RequestedFeedbackOnWorkerEventDetail2b4c8a6ca069100035b8586e16c20000AllOf.md)
 - [RequestedFeedbackQuestionFfdd5de32f7f1000144df0c21e640000](docs/RequestedFeedbackQuestionFfdd5de32f7f1000144df0c21e640000.md)
 - [RequestedFeedbackQuestionFfdd5de32f7f1000144df0c21e640000AllOf](docs/RequestedFeedbackQuestionFfdd5de32f7f1000144df0c21e640000AllOf.md)
 - [Status9df8579a128710001ac8e9879d1f0001](docs/Status9df8579a128710001ac8e9879d1f0001.md)
 - [SupervisoryOrganizationB8ac205877fd10000ea91743659800a7](docs/SupervisoryOrganizationB8ac205877fd10000ea91743659800a7.md)
 - [SupervisoryOrganizationJobViewFab4a151b24810000d29746fb7e21259](docs/SupervisoryOrganizationJobViewFab4a151b24810000d29746fb7e21259.md)
 - [SupervisoryOrganizationJobViewFab4a151b24810000d29746fb7e21259AllOf](docs/SupervisoryOrganizationJobViewFab4a151b24810000d29746fb7e21259AllOf.md)
 - [Supports9df8579a128710001ac8e9879d1f0000](docs/Supports9df8579a128710001ac8e9879d1f0000.md)
 - [TalentTagFfdd5de32f7f100016c88e016ad20000](docs/TalentTagFfdd5de32f7f100016c88e016ad20000.md)
 - [TalentTagFfdd5de32f7f100016c88e016ad20000AllOf](docs/TalentTagFfdd5de32f7f100016c88e016ad20000AllOf.md)
 - [ToWorkerF4946919a39f10000f03207b1f230000](docs/ToWorkerF4946919a39f10000f03207b1f230000.md)
 - [TransactionStatus7457adcbe0fa1000089b63ab3a510000](docs/TransactionStatus7457adcbe0fa1000089b63ab3a510000.md)
 - [UploadedByB32ff437243510000e22e06470370160](docs/UploadedByB32ff437243510000e22e06470370160.md)
 - [VALIDATIONERRORMODELREFERENCE](docs/VALIDATIONERRORMODELREFERENCE.md)
 - [VALIDATIONERRORMODELREFERENCEAllOf](docs/VALIDATIONERRORMODELREFERENCEAllOf.md)
 - [WorkSpace426ac445037110001b3eb91ddf6f0100](docs/WorkSpace426ac445037110001b3eb91ddf6f0100.md)
 - [Worker47e98fa91eee100017c2c78c80410000](docs/Worker47e98fa91eee100017c2c78c80410000.md)
 - [WorkerDataC2466b0778c610000d1936006720000e](docs/WorkerDataC2466b0778c610000d1936006720000e.md)
 - [WorkerDataC2466b0778c610000d1936006720000eAllOf](docs/WorkerDataC2466b0778c610000d1936006720000eAllOf.md)
 - [WorkerType3f78eeedc01d1000138d97d80e5a0000](docs/WorkerType3f78eeedc01d1000138d97d80e5a0000.md)
 - [WorkersGetCollectionStaffingResponse](docs/WorkersGetCollectionStaffingResponse.md)
 - [WorkersGetFeedbackEventsResponse](docs/WorkersGetFeedbackEventsResponse.md)
 - [WorkersGetGoalsResponse](docs/WorkersGetGoalsResponse.md)
 - [WorkersGetRequestedFeedbackEventsResponse](docs/WorkersGetRequestedFeedbackEventsResponse.md)
 - [WorkersGetSelfRequestedFeedbackResponse](docs/WorkersGetSelfRequestedFeedbackResponse.md)
 - [WorkersToNotify9e478586f65410001035b6c26a4c0000](docs/WorkersToNotify9e478586f65410001035b6c26a4c0000.md)
 - [WorkersToNotify9e478586f65410001035b6c26a4c0000AllOf](docs/WorkersToNotify9e478586f65410001035b6c26a4c0000AllOf.md)


## Author
This Java package is automatically generated by [Konfig](https://konfigthis.com)
