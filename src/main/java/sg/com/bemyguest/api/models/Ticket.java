/*
 * BeMyGuestSuppliersAPIV1Lib
 *
 * This file was automatically generated for BeMyGuest by APIMATIC v2.0 ( https://apimatic.io ) on 07/25/2016
 */
package sg.com.bemyguest.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class Ticket 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5327437232329913729L;
    private String status;
    private String value;
    private Date updatedAt;
    /** GETTER
     * Status of the ticket - unused | used | invalid
     */
    @JsonGetter("status")
    public String getStatus ( ) { 
        return this.status;
    }
    
    /** SETTER
     * Status of the ticket - unused | used | invalid
     */
    @JsonSetter("status")
    public void setStatus (String value) { 
        this.status = value;
    }
 
    /** GETTER
     * Value of the ticket number
     */
    @JsonGetter("value")
    public String getValue ( ) { 
        return this.value;
    }
    
    /** SETTER
     * Value of the ticket number
     */
    @JsonSetter("value")
    public void setValue (String value) { 
        this.value = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("updatedAt")
    public Date getUpdatedAt ( ) { 
        return this.updatedAt;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("updatedAt")
    public void setUpdatedAt (Date value) { 
        this.updatedAt = value;
    }
 
}
 