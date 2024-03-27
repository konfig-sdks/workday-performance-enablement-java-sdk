

# GiveRequestedFeedbackDetailsD396fd5bffec10000e3eba1a70440000


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**dueDate** | **LocalDate** | The date the business process needs to be completed. |  [optional] [readonly] |
|**feedbackGivenDate** | **LocalDate** | The date the feedback was provided. |  [optional] [readonly] |
|**feedbackCreationDate** | **LocalDate** | The date the feedback event was created. |  [optional] [readonly] |
|**requestedBy** | [**RequestedByD396fd5bffec1000100f44a5808f0006**](RequestedByD396fd5bffec1000100f44a5808f0006.md) |  |  [optional] |
|**aboutWorker** | [**AboutWorkerD396fd5bffec1000100f44a5808f0005**](AboutWorkerD396fd5bffec1000100f44a5808f0005.md) |  |  [optional] |
|**expirationDate** | **LocalDate** | The date the feedback request expires. |  [optional] [readonly] |
|**displayNameofResponder** | **Boolean** | True if the feedback provider&#39;s name is not displayed. |  [optional] [readonly] |
|**feedbackComments** | [**List&lt;RequestedFeedbackCommentsD396fd5bffec10001393477e77870000&gt;**](RequestedFeedbackCommentsD396fd5bffec10001393477e77870000.md) | The feedback comments for this feedback event. To include feedback comments in reports or notifications intended for Employees, use Feedback Comments for Self-Service Reporting instead. |  [optional] |
|**businessProcessParameters** | [**BusinessProcessParametersD396fd5bffec1000100f440bde4c0001**](BusinessProcessParametersD396fd5bffec1000100f440bde4c0001.md) |  |  [optional] |
|**feedbackPrivate** | **Boolean** | Yes if the feedback is private between the feedback provider and the worker. |  [optional] |
|**feedbackConfidential** | **Boolean** | Yes if the feedback is confidential between the feedback provider and the manager. Employees, or who the feedback is about, don&#39;t see confidential feedback. |  [optional] |
|**id** | **String** | Id of the instance |  [optional] |
|**descriptor** | **String** | A preview of the instance |  [optional] |



