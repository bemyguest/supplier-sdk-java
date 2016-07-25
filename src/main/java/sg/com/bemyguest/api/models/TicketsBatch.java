/*
 * BeMyGuestSuppliersAPIV1Lib
 *
 * This file was automatically generated for BeMyGuest by APIMATIC v2.0 ( https://apimatic.io ) on 07/25/2016
 */
package sg.com.bemyguest.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class TicketsBatch 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5682273486934213547L;
    private boolean adultsAllowed;
    private UUID barcodeTypeUuid;
    private boolean childrenAllowed;
    private UUID currencyUuid;
    private int pricePerTicket;
    private UUID productTypesUuid;
    private List<Ticket> tickets;
    private String ticketsBatchName;
    private String ticketsBatchReference;
    private String ticketsOrderDate;
    private int ticketsPerPerson;
    private String validFrom;
    private String validTo;
    private String ticketsOrderReference;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("adultsAllowed")
    public boolean getAdultsAllowed ( ) { 
        return this.adultsAllowed;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("adultsAllowed")
    public void setAdultsAllowed (boolean value) { 
        this.adultsAllowed = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("barcodeTypeUuid")
    public UUID getBarcodeTypeUuid ( ) { 
        return this.barcodeTypeUuid;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("barcodeTypeUuid")
    public void setBarcodeTypeUuid (UUID value) { 
        this.barcodeTypeUuid = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("childrenAllowed")
    public boolean getChildrenAllowed ( ) { 
        return this.childrenAllowed;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("childrenAllowed")
    public void setChildrenAllowed (boolean value) { 
        this.childrenAllowed = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("currencyUuid")
    public UUID getCurrencyUuid ( ) { 
        return this.currencyUuid;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("currencyUuid")
    public void setCurrencyUuid (UUID value) { 
        this.currencyUuid = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("pricePerTicket")
    public int getPricePerTicket ( ) { 
        return this.pricePerTicket;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("pricePerTicket")
    public void setPricePerTicket (int value) { 
        this.pricePerTicket = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("productTypesUuid")
    public UUID getProductTypesUuid ( ) { 
        return this.productTypesUuid;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("productTypesUuid")
    public void setProductTypesUuid (UUID value) { 
        this.productTypesUuid = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("tickets")
    public List<Ticket> getTickets ( ) { 
        return this.tickets;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("tickets")
    public void setTickets (List<Ticket> value) { 
        this.tickets = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("ticketsBatchName")
    public String getTicketsBatchName ( ) { 
        return this.ticketsBatchName;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("ticketsBatchName")
    public void setTicketsBatchName (String value) { 
        this.ticketsBatchName = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("ticketsBatchReference")
    public String getTicketsBatchReference ( ) { 
        return this.ticketsBatchReference;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("ticketsBatchReference")
    public void setTicketsBatchReference (String value) { 
        this.ticketsBatchReference = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("ticketsOrderDate")
    public String getTicketsOrderDate ( ) { 
        return this.ticketsOrderDate;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("ticketsOrderDate")
    public void setTicketsOrderDate (String value) { 
        this.ticketsOrderDate = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("ticketsPerPerson")
    public int getTicketsPerPerson ( ) { 
        return this.ticketsPerPerson;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("ticketsPerPerson")
    public void setTicketsPerPerson (int value) { 
        this.ticketsPerPerson = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("validFrom")
    public String getValidFrom ( ) { 
        return this.validFrom;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("validFrom")
    public void setValidFrom (String value) { 
        this.validFrom = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("validTo")
    public String getValidTo ( ) { 
        return this.validTo;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("validTo")
    public void setValidTo (String value) { 
        this.validTo = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("ticketsOrderReference")
    public String getTicketsOrderReference ( ) { 
        return this.ticketsOrderReference;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("ticketsOrderReference")
    public void setTicketsOrderReference (String value) { 
        this.ticketsOrderReference = value;
    }
 
}
 