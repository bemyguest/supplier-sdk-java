/*
 * BeMyGuestSuppliersAPIV1Lib
 *
 * This file was automatically generated for BeMyGuest by APIMATIC v2.0 ( https://apimatic.io ) on 07/25/2016
 */
package sg.com.bemyguest.api.models;

import java.util.*;

public class GetTicketStatusResponseBuilder 
        extends BaseResponseBuilder {
    //the instance to build
    private GetTicketStatusResponse getTicketStatusResponse;

    /**
     * Default constructor to initialize the instance
     */
    public GetTicketStatusResponseBuilder() {
        getTicketStatusResponse = new GetTicketStatusResponse();
    }

    public GetTicketStatusResponseBuilder date(List<Ticket> date) {
        getTicketStatusResponse.setDate(date);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public GetTicketStatusResponse build() {
        return getTicketStatusResponse;
    }
}