package com.konfigthis.client;

import com.konfigthis.client.api.PromptValuesApi;
import com.konfigthis.client.api.FeedbackBadgesApi;
import com.konfigthis.client.api.GiveRequestedFeedbackEventsApi;
import com.konfigthis.client.api.WorkersApi;

public class WorkdayPerformanceEnablement {
    private ApiClient apiClient;
    public final PromptValuesApi promptValues;
    public final FeedbackBadgesApi feedbackBadges;
    public final GiveRequestedFeedbackEventsApi giveRequestedFeedbackEvents;
    public final WorkersApi workers;

    public WorkdayPerformanceEnablement() {
        this(null);
    }

    public WorkdayPerformanceEnablement(Configuration configuration) {
        this.apiClient = new ApiClient(null, configuration);
        this.promptValues = new PromptValuesApi(this.apiClient);
        this.feedbackBadges = new FeedbackBadgesApi(this.apiClient);
        this.giveRequestedFeedbackEvents = new GiveRequestedFeedbackEventsApi(this.apiClient);
        this.workers = new WorkersApi(this.apiClient);
    }

}
