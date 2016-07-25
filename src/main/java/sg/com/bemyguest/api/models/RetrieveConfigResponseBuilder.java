/*
 * BeMyGuestSuppliersAPIV1Lib
 *
 * This file was automatically generated for BeMyGuest by APIMATIC v2.0 ( https://apimatic.io ) on 07/25/2016
 */
package sg.com.bemyguest.api.models;

import java.util.*;

public class RetrieveConfigResponseBuilder 
        extends BaseResponseBuilder {
    //the instance to build
    private RetrieveConfigResponse retrieveConfigResponse;

    /**
     * Default constructor to initialize the instance
     */
    public RetrieveConfigResponseBuilder() {
        retrieveConfigResponse = new RetrieveConfigResponse();
    }

    public RetrieveConfigResponseBuilder data(List<Object> data) {
        retrieveConfigResponse.setData(data);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public RetrieveConfigResponse build() {
        return retrieveConfigResponse;
    }
}