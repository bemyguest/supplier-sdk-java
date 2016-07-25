/*
 * BeMyGuestSuppliersAPIV1Lib
 *
 * This file was automatically generated for BeMyGuest by APIMATIC v2.0 ( https://apimatic.io ) on 07/25/2016
 */
package sg.com.bemyguest.api.models;

import java.util.*;

public class TicketsBatchBuilder {
    //the instance to build
    private TicketsBatch ticketsBatch;

    /**
     * Default constructor to initialize the instance
     */
    public TicketsBatchBuilder() {
        ticketsBatch = new TicketsBatch();
    }

    public TicketsBatchBuilder adultsAllowed(boolean adultsAllowed) {
        ticketsBatch.setAdultsAllowed(adultsAllowed);
        return this;
    }

    public TicketsBatchBuilder barcodeTypeUuid(UUID barcodeTypeUuid) {
        ticketsBatch.setBarcodeTypeUuid(barcodeTypeUuid);
        return this;
    }

    public TicketsBatchBuilder childrenAllowed(boolean childrenAllowed) {
        ticketsBatch.setChildrenAllowed(childrenAllowed);
        return this;
    }

    public TicketsBatchBuilder currencyUuid(UUID currencyUuid) {
        ticketsBatch.setCurrencyUuid(currencyUuid);
        return this;
    }

    public TicketsBatchBuilder pricePerTicket(int pricePerTicket) {
        ticketsBatch.setPricePerTicket(pricePerTicket);
        return this;
    }

    public TicketsBatchBuilder productTypesUuid(UUID productTypesUuid) {
        ticketsBatch.setProductTypesUuid(productTypesUuid);
        return this;
    }

    public TicketsBatchBuilder tickets(List<Ticket> tickets) {
        ticketsBatch.setTickets(tickets);
        return this;
    }

    public TicketsBatchBuilder ticketsBatchName(String ticketsBatchName) {
        ticketsBatch.setTicketsBatchName(ticketsBatchName);
        return this;
    }

    public TicketsBatchBuilder ticketsBatchReference(String ticketsBatchReference) {
        ticketsBatch.setTicketsBatchReference(ticketsBatchReference);
        return this;
    }

    public TicketsBatchBuilder ticketsOrderDate(String ticketsOrderDate) {
        ticketsBatch.setTicketsOrderDate(ticketsOrderDate);
        return this;
    }

    public TicketsBatchBuilder ticketsPerPerson(int ticketsPerPerson) {
        ticketsBatch.setTicketsPerPerson(ticketsPerPerson);
        return this;
    }

    public TicketsBatchBuilder validFrom(String validFrom) {
        ticketsBatch.setValidFrom(validFrom);
        return this;
    }

    public TicketsBatchBuilder validTo(String validTo) {
        ticketsBatch.setValidTo(validTo);
        return this;
    }

    public TicketsBatchBuilder ticketsOrderReference(String ticketsOrderReference) {
        ticketsBatch.setTicketsOrderReference(ticketsOrderReference);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public TicketsBatch build() {
        return ticketsBatch;
    }
}