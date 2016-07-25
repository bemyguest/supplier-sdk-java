/*
 * BeMyGuestSuppliersAPIV1Lib
 *
 * This file was automatically generated for BeMyGuest by APIMATIC v2.0 ( https://apimatic.io ) on 07/25/2016
 */
package sg.com.bemyguest.api.models;

import java.util.*;

public class BaseResponseBuilder {
    //the instance to build
    private BaseResponse baseResponse;

    /**
     * Default constructor to initialize the instance
     */
    public BaseResponseBuilder() {
        baseResponse = new BaseResponse();
    }

    public BaseResponseBuilder data(List<String> data) {
        baseResponse.setData(data);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public BaseResponse build() {
        return baseResponse;
    }
}