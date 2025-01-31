/*
 * performanceEnablement
 * The Performance Management service enables applications to access and create feedback about workers in the system.
 *
 * The version of the OpenAPI document: v5
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.api;

import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.AboutWorkerD396fd5bffec1000100f44a5808f0005;
import com.konfigthis.client.model.BusinessProcessParametersD396fd5bffec1000100f440bde4c0001;
import com.konfigthis.client.model.ERRORMODELREFERENCE;
import com.konfigthis.client.model.GiveRequestedFeedbackDetailsD396fd5bffec10000e3eba1a70440000;
import com.konfigthis.client.model.GiveRequestedFeedbackEventsGetCollectionFeedbackEventsResponse;
import java.time.LocalDate;
import com.konfigthis.client.model.RequestedByD396fd5bffec1000100f44a5808f0006;
import com.konfigthis.client.model.RequestedFeedbackCommentsD396fd5bffec10001393477e77870000;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for GiveRequestedFeedbackEventsApi
 */
@Disabled
public class GiveRequestedFeedbackEventsApiTest {

    private static GiveRequestedFeedbackEventsApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new GiveRequestedFeedbackEventsApi(apiClient);
    }

    /**
     * Retrieves a collection of feedback given events about the user that responded to the feedback request.
     *
     * Retrieves all requested feedback given events for the user that responded to the feedback request.  Secured by: Self-Service: Role Requested Feedback, Self-Service: Self Requested Feedback  Scope: Performance Enablement, Worker Profile and Skills
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getCollectionFeedbackEventsTest() throws ApiException {
        Long limit = null;
        Long offset = null;
        GiveRequestedFeedbackEventsGetCollectionFeedbackEventsResponse response = api.getCollectionFeedbackEvents()
                .limit(limit)
                .offset(offset)
                .execute();
        // TODO: test validations
    }

    /**
     * Retrieves a single requested feedback given event instance with the specified ID of the user that responded to the feedback request.
     *
     * Retrieves a single requested feedback given event instance for the user that responded to the feedback request.  Secured by: Self-Service: Role Requested Feedback, Self-Service: Self Requested Feedback  Scope: Performance Enablement, Worker Profile and Skills
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getInstanceTest() throws ApiException {
        String ID = null;
        GiveRequestedFeedbackDetailsD396fd5bffec10000e3eba1a70440000 response = api.getInstance(ID)
                .execute();
        // TODO: test validations
    }

    /**
     * Updates the Give Requested Feedback Event that matches the WID in the url, and the current authenticated user is a responder for the event.
     *
     * Updates the Give Requested Feedback Event that matches the WID in the url, and the current authenticated user is a responder for the event. This endpoint is equivalent to the Give Requested Feedback task in Workday.  Secured by: Give Requested Feedback REST+TG  Scope: Performance Enablement, Worker Profile and Skills
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateEventTest() throws ApiException {
        String ID = null;
        LocalDate dueDate = null;
        LocalDate feedbackGivenDate = null;
        LocalDate feedbackCreationDate = null;
        RequestedByD396fd5bffec1000100f44a5808f0006 requestedBy = null;
        AboutWorkerD396fd5bffec1000100f44a5808f0005 aboutWorker = null;
        LocalDate expirationDate = null;
        Boolean displayNameofResponder = null;
        List<RequestedFeedbackCommentsD396fd5bffec10001393477e77870000> feedbackComments = null;
        BusinessProcessParametersD396fd5bffec1000100f440bde4c0001 businessProcessParameters = null;
        Boolean feedbackPrivate = null;
        Boolean feedbackConfidential = null;
        String id = null;
        String descriptor = null;
        GiveRequestedFeedbackDetailsD396fd5bffec10000e3eba1a70440000 response = api.updateEvent(ID)
                .dueDate(dueDate)
                .feedbackGivenDate(feedbackGivenDate)
                .feedbackCreationDate(feedbackCreationDate)
                .requestedBy(requestedBy)
                .aboutWorker(aboutWorker)
                .expirationDate(expirationDate)
                .displayNameofResponder(displayNameofResponder)
                .feedbackComments(feedbackComments)
                .businessProcessParameters(businessProcessParameters)
                .feedbackPrivate(feedbackPrivate)
                .feedbackConfidential(feedbackConfidential)
                .id(id)
                .descriptor(descriptor)
                .execute();
        // TODO: test validations
    }

}
