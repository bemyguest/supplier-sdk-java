/*
 * BeMyGuestSuppliersAPIV1Lib
 *
 * This file was automatically generated for BeMyGuest by APIMATIC v2.0 ( https://apimatic.io ) on 07/25/2016
 */
package sg.com.bemyguest.api.models;

import java.util.*;

public class UpdateTicketsStatusRequestBuilder {
    //the instance to build
    private UpdateTicketsStatusRequest updateTicketsStatusRequest;

    /**
     * Default constructor to initialize the instance
     */
    public UpdateTicketsStatusRequestBuilder() {
        updateTicketsStatusRequest = new UpdateTicketsStatusRequest();
    }

    public UpdateTicketsStatusRequestBuilder data(List<Ticket> data) {
        updateTicketsStatusRequest.setData(data);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public UpdateTicketsStatusRequest build() {
        return updateTicketsStatusRequest;
    }
}