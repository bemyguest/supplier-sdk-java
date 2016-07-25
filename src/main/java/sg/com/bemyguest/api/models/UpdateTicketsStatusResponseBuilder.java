/*
 * BeMyGuestSuppliersAPIV1Lib
 *
 * This file was automatically generated for BeMyGuest by APIMATIC v2.0 ( https://apimatic.io ) on 07/25/2016
 */
package sg.com.bemyguest.api.models;

import java.util.*;

public class UpdateTicketsStatusResponseBuilder {
    //the instance to build
    private UpdateTicketsStatusResponse updateTicketsStatusResponse;

    /**
     * Default constructor to initialize the instance
     */
    public UpdateTicketsStatusResponseBuilder() {
        updateTicketsStatusResponse = new UpdateTicketsStatusResponse();
    }

    public UpdateTicketsStatusResponseBuilder data(List<Ticket> data) {
        updateTicketsStatusResponse.setData(data);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public UpdateTicketsStatusResponse build() {
        return updateTicketsStatusResponse;
    }
}