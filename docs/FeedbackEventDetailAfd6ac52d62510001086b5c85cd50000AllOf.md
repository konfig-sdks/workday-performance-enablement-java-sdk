

# FeedbackEventDetailAfd6ac52d62510001086b5c85cd50000AllOf


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**toWorker** | [**ToWorkerF4946919a39f10000f03207b1f230000**](ToWorkerF4946919a39f10000f03207b1f230000.md) |  |  [optional] |
|**workersToNotify** | [**List&lt;WorkersToNotify9e478586f65410001035b6c26a4c0000&gt;**](WorkersToNotify9e478586f65410001035b6c26a4c0000.md) | The workers that were selected to be notified of the feedback given event. |  [optional] |
|**relatesTo** | [**RelatesTo9d12ad407f0f10001c3949add7d40000**](RelatesTo9d12ad407f0f10001c3949add7d40000.md) |  |  [optional] |
|**businessProcessParameters** | [**BusinessProcessParametersAfd6ac52d6251000117d0a60ed8b0000**](BusinessProcessParametersAfd6ac52d6251000117d0a60ed8b0000.md) |  |  [optional] |
|**feedbackAlsoAbout** | [**List&lt;GetWorkersFeedbackAlsoAbout3ab333661034100010b5635b2f7a0302&gt;**](GetWorkersFeedbackAlsoAbout3ab333661034100010b5635b2f7a0302.md) | The other workers this feedback event is about. |  [optional] |
|**hiddenFromWorker** | **Boolean** | True if the feedback event is confidential between the feedback provider and the manager. Workers don&#39;t see confidential feedback. |  [optional] |
|**hiddenFromManager** | **Boolean** | True if the feedback event is private between the feedback provider and the worker. Private feedback isn&#39;t shared with managers. |  [optional] |
|**comment** | **String** | The comment text for an anytime feedback event. |  [optional] |
|**fromWorker** | [**FromWorkerAfd6ac52d62510001357f891ccfd0001**](FromWorkerAfd6ac52d62510001357f891ccfd0001.md) |  |  [optional] |
|**badge** | [**BadgeAfd6ac52d62510001357f891ccfd0003**](BadgeAfd6ac52d62510001357f891ccfd0003.md) |  |  [optional] |
|**relatedFeedbackEvents** | [**List&lt;RelatedFeedbackEvents9708c966f04f10000e1e9b7f9a5c0000&gt;**](RelatedFeedbackEvents9708c966f04f10000e1e9b7f9a5c0000.md) | The anytime feedback events for the multiple recipients event. |  [optional] [readonly] |
|**feedbackGivenDate** | **LocalDate** | The date the feedback was provided. |  [optional] |
|**showFeedbackProviderName** | **Boolean** | True if the feedback provider&#39;s name has chosen to be displayed. Names not chosen to be displayed are not shared. |  [optional] |
|**href** | **String** | A link to the instance |  [optional] |
|**id** | **String** | Id of the instance |  [optional] |
|**descriptor** | **String** | A preview of the instance |  [optional] |



