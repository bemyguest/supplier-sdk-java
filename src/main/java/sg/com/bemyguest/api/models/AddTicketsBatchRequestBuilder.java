/*
 * BeMyGuestSuppliersAPIV1Lib
 *
 * This file was automatically generated for BeMyGuest by APIMATIC v2.0 ( https://apimatic.io ) on 07/25/2016
 */
package sg.com.bemyguest.api.models;

import java.util.*;

public class AddTicketsBatchRequestBuilder {
    //the instance to build
    private AddTicketsBatchRequest addTicketsBatchRequest;

    /**
     * Default constructor to initialize the instance
     */
    public AddTicketsBatchRequestBuilder() {
        addTicketsBatchRequest = new AddTicketsBatchRequest();
    }

    public AddTicketsBatchRequestBuilder data(List<TicketsBatch> data) {
        addTicketsBatchRequest.setData(data);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public AddTicketsBatchRequest build() {
        return addTicketsBatchRequest;
    }
}