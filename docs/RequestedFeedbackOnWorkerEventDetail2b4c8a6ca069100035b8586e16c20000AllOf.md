

# RequestedFeedbackOnWorkerEventDetail2b4c8a6ca069100035b8586e16c20000AllOf


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**feedbackAbout** | [**FeedbackAbout2b4c8a6ca069100035b85907ae2c0002**](FeedbackAbout2b4c8a6ca069100035b85907ae2c0002.md) |  |  [optional] |
|**feedbackConfidential** | **Boolean** | Yes if the feedback is confidential between the feedback provider and the manager. Workers don&#39;t see confidential feedback. |  [optional] |
|**feedbackOverallStatus** | **String** | Overall status of the requested feedback process. |  [optional] [readonly] |
|**showFeedbackProviderName** | **Boolean** | Whether to display the name of the responders or have them remain anonymous.ccc |  [optional] |
|**requestDate** | **LocalDate** | The date the feedback request was initiated. |  [optional] [readonly] |
|**expirationDate** | **LocalDate** | The date the feedback request expires. |  [optional] |
|**feedbackQuestions** | [**List&lt;RequestedFeedbackQuestionFfdd5de32f7f1000144df0c21e640000&gt;**](RequestedFeedbackQuestionFfdd5de32f7f1000144df0c21e640000.md) | Feedback questions used in requested feedback events. |  [optional] |
|**feedbackTemplate** | [**FeedbackTemplate2b4c8a6ca069100035b859a141200001**](FeedbackTemplate2b4c8a6ca069100035b859a141200001.md) |  |  [optional] |
|**feedbackResponders** | [**List&lt;FeedbackRespondersFfdd5de32f7f100016dbb1b188d70000&gt;**](FeedbackRespondersFfdd5de32f7f100016dbb1b188d70000.md) | The respondents who&#39;ve been requested to provide feedback. |  |
|**businessProcessParameters** | [**BusinessProcessParameters2b4c8a6ca069100035b85907ae2c0000**](BusinessProcessParameters2b4c8a6ca069100035b85907ae2c0000.md) |  |  [optional] |
|**descriptor** | **String** | A preview of the instance |  [optional] |
|**id** | **String** | Id of the instance |  [optional] |



