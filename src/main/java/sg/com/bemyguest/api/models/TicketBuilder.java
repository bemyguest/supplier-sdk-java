/*
 * BeMyGuestSuppliersAPIV1Lib
 *
 * This file was automatically generated for BeMyGuest by APIMATIC v2.0 ( https://apimatic.io ) on 07/25/2016
 */
package sg.com.bemyguest.api.models;

import java.util.*;

public class TicketBuilder {
    //the instance to build
    private Ticket ticket;

    /**
     * Default constructor to initialize the instance
     */
    public TicketBuilder() {
        ticket = new Ticket();
    }

    /**
     * Status of the ticket - unused | used | invalid
     */
    public TicketBuilder status(String status) {
        ticket.setStatus(status);
        return this;
    }

    /**
     * Value of the ticket number
     */
    public TicketBuilder value(String value) {
        ticket.setValue(value);
        return this;
    }

    public TicketBuilder updatedAt(Date updatedAt) {
        ticket.setUpdatedAt(updatedAt);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public Ticket build() {
        return ticket;
    }
}