/*
 * BeMyGuestSuppliersAPIV1Lib
 *
 * This file was automatically generated for BeMyGuest by APIMATIC v2.0 ( https://apimatic.io ) on 07/25/2016
 */
package sg.com.bemyguest.api;

import java.io.InputStream;

import sg.com.bemyguest.api.http.client.HttpContext;

public class APIException extends Exception {
    //UID for serialization
    private static final long serialVersionUID = 6424174253911720338L;

    //private fields
    private int responseCode;

    //private fields
    private HttpContext httpContext;

    /**
    * The HTTP response code from the API request
    */
    public int getResponseCode() {
        return (httpContext != null) ? httpContext.getResponse().getStatusCode() : -1;
    }

    /**
     * The HTTP response body from the API request
     */
    public HttpContext getHttpContext() {
        return httpContext;
    }

    /**
     * Initialization constructor
     * @param reason The reason for throwing exception
     */
    public APIException(String reason) {
        super(reason);
    }

    /**
     * Initialization constructor
     * @param   reason  The reason for throwing exception
     * @param   context The http context of the API exception
     */
    public APIException(String reason, HttpContext context) {
        super(reason);
        this.httpContext = context;
    }
}