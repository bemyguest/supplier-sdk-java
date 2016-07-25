/*
 * BeMyGuestSuppliersAPIV1Lib
 *
 * This file was automatically generated for BeMyGuest by APIMATIC v2.0 ( https://apimatic.io ) on 07/25/2016
 */
package sg.com.bemyguest.api.controllers;

import sg.com.bemyguest.api.APIException;
import sg.com.bemyguest.api.http.client.HttpClient;
import sg.com.bemyguest.api.http.client.HttpContext;
import sg.com.bemyguest.api.http.client.HttpCallBack;
import sg.com.bemyguest.api.http.client.UnirestClient;
import sg.com.bemyguest.api.http.response.HttpResponse;

public abstract class BaseController {
    /**
     * Private variable to keep shared reference of client instance
     */
    private static HttpClient clientInstance = null;
    private static Object syncObject = new Object();

    /**
     * Protected variable to keep reference of httpCallBack instance if user provides any
     */
    protected HttpCallBack httpCallBack = null;
    
    /**
     * Get httpCallBack associated with this controller
     * @return HttpCallBack
     */
    public HttpCallBack getHttpCallBack() {
        return httpCallBack;
    }
    
    /**
     * Set the httpCallBack for this controller
     * @param httpCallBack
     */
    public void setHttpCallBack(HttpCallBack httpCallBack) {
        this.httpCallBack = httpCallBack;
    }

    /**
     * Shared instance of the Http client
     * @return The shared instance of the http client 
     */
    public static HttpClient getClientInstance() {
        synchronized (syncObject) {
            if (null == clientInstance) {
        clientInstance = UnirestClient.getSharedInstance();
    }
        }
        return clientInstance;
    }

    /**
     * Shared instance of the Http client
     * @param    client    The shared instance of the http client 
     */
    public static void setClientInstance(HttpClient client) {
        synchronized (syncObject) {
            if (null != client) {
                clientInstance = client;
            }
        }
    }

    /**
     * Validates the response against HTTP errors defined at the API level
     * @param   response    The response recieved
     * @param   context     Context of the request and the recieved response 
     */
    protected void validateResponse(HttpResponse response, HttpContext context) 
            throws APIException {
        //get response status code to validate
        int responseCode = response.getStatusCode();
        if (responseCode == 400)
            throw new APIException("Wrong Arguments", context);

        else if (responseCode == 401)
            throw new APIException("Unauthorized", context);

        else if (responseCode == 403)
            throw new APIException("Forbidden", context);

        else if (responseCode == 404)
            throw new APIException("Resource Not Found", context);

        else if (responseCode == 405)
            throw new APIException("Method Not Allowed", context);

        else if (responseCode == 410)
            throw new APIException("Resource No Longer Available", context);

        else if ((responseCode < 200) || (responseCode > 206)) //[200,206] = HTTP OK
            throw new APIException("HTTP Response Not OK", context);
    }
}
