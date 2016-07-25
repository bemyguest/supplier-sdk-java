/*
 * BeMyGuestSuppliersAPIV1Lib
 *
 * This file was automatically generated for BeMyGuest by APIMATIC v2.0 ( https://apimatic.io ) on 07/25/2016
 */
package sg.com.bemyguest.api.models;

import java.util.*;

public class AddTicketsBatchResponseBuilder {
    //the instance to build
    private AddTicketsBatchResponse addTicketsBatchResponse;

    /**
     * Default constructor to initialize the instance
     */
    public AddTicketsBatchResponseBuilder() {
        addTicketsBatchResponse = new AddTicketsBatchResponse();
    }

    public AddTicketsBatchResponseBuilder data(List<TicketsBatch> data) {
        addTicketsBatchResponse.setData(data);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public AddTicketsBatchResponse build() {
        return addTicketsBatchResponse;
    }
}