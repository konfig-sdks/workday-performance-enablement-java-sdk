

# BusinessProcessParametersAfd6ac52d6251000117d0a60ed8b0000

The Action Event instance to be used with businessProcessLinkable linked service representations.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**action** | [**Action38ff08ab6736100010816009079d0126**](Action38ff08ab6736100010816009079d0126.md) |  |  |
|**overallBusinessProcess** | [**OverallBusinessProcess5d688bd57bb910001815ab49927724aa**](OverallBusinessProcess5d688bd57bb910001815ab49927724aa.md) |  |  [optional] |
|**comment** | **String** | Returns a null. |  [optional] |
|**comments** | [**List&lt;Comments86093b8a932f10001499f356ff83012e&gt;**](Comments86093b8a932f10001499f356ff83012e.md) | Returns the comments for the current business process. |  [optional] [readonly] |
|**transactionStatus** | [**TransactionStatus7457adcbe0fa1000089b63ab3a510000**](TransactionStatus7457adcbe0fa1000089b63ab3a510000.md) |  |  [optional] |
|**warningValidations** | **String** | Warning message for an action event triggered by a condition. |  [optional] [readonly] |
|**overallStatus** | **String** | The current status of the business process.  For example: Successfully Completed, Denied, Terminated. |  [optional] [readonly] |
|**attachments** | [**List&lt;EventAttachmentsForToolbar43b30ba735b8100011ee4767246d0143&gt;**](EventAttachmentsForToolbar43b30ba735b8100011ee4767246d0143.md) | Returns attachments associated with this business process that are uploaded from the toolbar and are accessible to the processing person. Returns blank if either of these conditions are not met. |  [optional] |
|**criticalValidations** | **String** | Validation message for an action event triggered by a condition. |  [optional] [readonly] |
|**_for** | [**For5d688bd57bb910001815ab3dd10024a9**](For5d688bd57bb910001815ab3dd10024a9.md) |  |  [optional] |



