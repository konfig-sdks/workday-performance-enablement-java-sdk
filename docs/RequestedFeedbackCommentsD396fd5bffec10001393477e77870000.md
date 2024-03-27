

# RequestedFeedbackCommentsD396fd5bffec10001393477e77870000


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**feedbackDeclined** | **Boolean** | Returns True if the responder declined to submit a response to a specific feedback question. |  [optional] |
|**feedbackDeclineReason** | **String** | The reason a requested feedback question was declined. |  [optional] |
|**possibleMultipleChoiceAnswers** | [**List&lt;PossibleMultipleChoiceAnswers4c60c128c16510000a59980041610000&gt;**](PossibleMultipleChoiceAnswers4c60c128c16510000a59980041610000.md) | All possible multiple choice answers available to the feedback question. |  [optional] [readonly] |
|**questionType** | [**QuestionType544916c1cd75100006c4f105d3f60000**](QuestionType544916c1cd75100006c4f105d3f60000.md) |  |  [optional] |
|**multipleChoiceAnswers** | [**List&lt;MultipleChoiceAnswers06c0300303a9100019828d5ca44a0000&gt;**](MultipleChoiceAnswers06c0300303a9100019828d5ca44a0000.md) | The answers selected from the feedback multiple choice question. |  [optional] |
|**numericAnswer** | **Integer** | The numeric answer from the Number question type. |  [optional] |
|**dateAnswer** | **LocalDate** | The date answer from the Date question type. |  [optional] |
|**response** | **String** | The feedback response for a feedback question. |  [optional] |
|**relatesTo** | [**List&lt;RelatesToC836a10b43ed10000beb5b92b4c10000&gt;**](RelatesToC836a10b43ed10000beb5b92b4c10000.md) | The talent tags that relate to the feedback question or response. |  [optional] [readonly] |
|**feedbackQuestion** | [**FeedbackQuestionD396fd5bffec10001393481822cd0007**](FeedbackQuestionD396fd5bffec10001393481822cd0007.md) |  |  [optional] |
|**id** | **String** | Id of the instance |  [optional] |
|**descriptor** | **String** | A preview of the instance |  [optional] |



