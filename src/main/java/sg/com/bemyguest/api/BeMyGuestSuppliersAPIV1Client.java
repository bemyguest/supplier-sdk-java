/*
 * BeMyGuestSuppliersAPIV1Lib
 *
 * This file was automatically generated for BeMyGuest by APIMATIC v2.0 ( https://apimatic.io ) on 07/25/2016
 */
package sg.com.bemyguest.api;

import sg.com.bemyguest.api.controllers.*;
import sg.com.bemyguest.api.http.client.HttpClient;

public class BeMyGuestSuppliersAPIV1Client {
    /**
     * Singleton access to Client controller
     * @return	Returns the APIController instance 
     */
    public APIController getClient() {
        return APIController.getInstance();
    }

    /**
     * Get the shared http client currently being used for API calls
     * @return The http client instance currently being used
     */
    public HttpClient getSharedHttpClient() {
        return BaseController.getClientInstance();
    }
    
    /**
     * Set a shared http client to be used for API calls
     * @param httpClient The http client to use
     */
    public void setSharedHttpClient(HttpClient httpClient) {
        BaseController.setClientInstance(httpClient);
    }

    /**
     * Default constructor 
     */     
    public BeMyGuestSuppliersAPIV1Client() {	
	}

    /**
     * Client initialization constructor 
     */     
    public BeMyGuestSuppliersAPIV1Client(String xAuthorization) {
        this();
        Configuration.xAuthorization = xAuthorization;
    }
}