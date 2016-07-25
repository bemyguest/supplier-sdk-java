/*
 * BeMyGuestSuppliersAPIV1Lib
 *
 * This file was automatically generated for BeMyGuest by APIMATIC v2.0 ( https://apimatic.io ) on 07/25/2016
 */
package sg.com.bemyguest.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class GetTicketStatusResponse 
        extends BaseResponse {
    private static final long serialVersionUID = 5000631822953566488L;
    private List<Ticket> date;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("date")
    public List<Ticket> getDate ( ) { 
        return this.date;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("date")
    public void setDate (List<Ticket> value) { 
        this.date = value;
    }
 
}
 