

# RequestedFeedbackOnSelfEventDetail19acce0101b310002e6bf03e1bbc0000AllOf


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**businessProcessParameters** | [**BusinessProcessParameters4db9c44d36231000134c7a5b6f3b0000**](BusinessProcessParameters4db9c44d36231000134c7a5b6f3b0000.md) |  |  [optional] |
|**feedbackQuestions** | [**List&lt;RequestedFeedbackQuestionFfdd5de32f7f1000144df0c21e640000&gt;**](RequestedFeedbackQuestionFfdd5de32f7f1000144df0c21e640000.md) | Feedback questions used in requested feedback events. |  [optional] |
|**feedbackAbout** | [**FeedbackAbout4db9c44d36231000134c7b8eb3800003**](FeedbackAbout4db9c44d36231000134c7b8eb3800003.md) |  |  [optional] |
|**feedbackTemplate** | [**FeedbackTemplate4db9c44d36231000134c7b8eb3800000**](FeedbackTemplate4db9c44d36231000134c7b8eb3800000.md) |  |  [optional] |
|**expirationDate** | **LocalDate** | The date the feedback request expires. |  [optional] |
|**requestDate** | **LocalDate** | The date the feedback request was initiated. |  [optional] [readonly] |
|**feedbackOverallStatus** | **String** | Overall status of the requested feedback process. |  [optional] [readonly] |
|**feedbackPrivate** | **Boolean** | Private feedback between the feedback provider and the worker. Private feedback isn&#39;t shared with managers. |  [optional] |
|**feedbackResponders** | [**List&lt;FeedbackRespondersFfdd5de32f7f100016dbb1b188d70000&gt;**](FeedbackRespondersFfdd5de32f7f100016dbb1b188d70000.md) | The respondents who&#39;ve been requested to provide feedback. |  |
|**showFeedbackProviderName** | **Boolean** | Whether to display the name of the responders or have them remain anonymous. |  [optional] |
|**descriptor** | **String** | A preview of the instance |  [optional] |
|**id** | **String** | Id of the instance |  [optional] |



