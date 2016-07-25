/*
 * BeMyGuestSuppliersAPIV1Lib
 *
 * This file was automatically generated for BeMyGuest by APIMATIC v2.0 ( https://apimatic.io ) on 07/25/2016
 */
package sg.com.bemyguest.api.controllers;

import java.io.*;
import java.util.*;
import java.util.concurrent.*;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;

import sg.com.bemyguest.api.http.client.HttpClient;
import sg.com.bemyguest.api.http.client.HttpContext;
import sg.com.bemyguest.api.http.request.HttpRequest;
import sg.com.bemyguest.api.http.response.HttpResponse;
import sg.com.bemyguest.api.http.response.HttpStringResponse;
import sg.com.bemyguest.api.http.client.APICallBack;
import sg.com.bemyguest.api.controllers.syncwrapper.APICallBackCatcher;
import sg.com.bemyguest.api.*;
import sg.com.bemyguest.api.models.*;

public class APIController extends BaseController {    
    //private static variables for the singleton pattern
    private static Object syncObject = new Object();
    private static APIController instance = null;

    /**
     * Singleton pattern implementation 
     * @return The singleton instance of the APIController class 
     */
    public static APIController getInstance() {
        synchronized (syncObject) {
            if (null == instance) {
                instance = new APIController();
            }
        }
        return instance;
    }

    /**
     * A Config object has the following attributes:
     * + `timezone` - Our sever timezone
     * + `now` - Our server timestamp
     * + `version` - Current version is "1.0"
     * + `serverUrl` - Main API URL
     * + user - All important userdata for provided API key
     *     + `name` - Name / Company / Organization
     *     + `email` - E-Mail Address
     *     + `uuid` - Unique ID
     *     + `defaultPagination` - Default Pagination value (per page), between 1-100
     *     + `defaultCurrencyUuid` - Default currency UUID for /products (if not specified)
     *     + `defaultCurrencyCode` - Default currency code for /products (if not specified)
     *     + `defaultLanguageUuid` - Default language UUID  /products (if not specified)
     *     + `defaultLanguageCode` - Default language code  /products (if not specified)
     * + `products` - A list of supplier products
     *     + `productTypes` - A list of prodcut types bellonging to this product
     * + `languages` - A list of supported languages.
     * + `currencies` - An array of supported currencies.
     * + `barcodeTypes` - An array of supported barcode types.
     * @return    Returns the RetrieveConfigResponse response from the API call 
     */
    public RetrieveConfigResponse retrieveConfig(
    ) throws Throwable {
        APICallBackCatcher<RetrieveConfigResponse> callback = new APICallBackCatcher<RetrieveConfigResponse>();
        retrieveConfigAsync(callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * A Config object has the following attributes:
     * + `timezone` - Our sever timezone
     * + `now` - Our server timestamp
     * + `version` - Current version is "1.0"
     * + `serverUrl` - Main API URL
     * + user - All important userdata for provided API key
     *     + `name` - Name / Company / Organization
     *     + `email` - E-Mail Address
     *     + `uuid` - Unique ID
     *     + `defaultPagination` - Default Pagination value (per page), between 1-100
     *     + `defaultCurrencyUuid` - Default currency UUID for /products (if not specified)
     *     + `defaultCurrencyCode` - Default currency code for /products (if not specified)
     *     + `defaultLanguageUuid` - Default language UUID  /products (if not specified)
     *     + `defaultLanguageCode` - Default language code  /products (if not specified)
     * + `products` - A list of supplier products
     *     + `productTypes` - A list of prodcut types bellonging to this product
     * + `languages` - A list of supported languages.
     * + `currencies` - An array of supported currencies.
     * + `barcodeTypes` - An array of supported barcode types.
     * @return    Returns the void response from the API call 
     */
    public void retrieveConfigAsync(
                final APICallBack<RetrieveConfigResponse> callBack
    ) {
        //the base uri for api requests
        String _baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/v1/suppliers/config");
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5433617713280790449L;
            {
                    put( "user-agent", "BeMyGuest.Suppliers.SDK.v1" );
                    put( "accept", "application/json" );
                    put( "X-Authorization", Configuration.xAuthorization );
            }
        };

        //prepare and invoke the API call request to fetch the response
        final HttpRequest _request = getClientInstance().get(_queryUrl, _headers, null);

        //invoke the callback before request if its not null
        if (getHttpCallBack() != null)
        {
            getHttpCallBack().OnBeforeRequest(_request);
        }

        //invoke request and get response
        Runnable _responseTask = new Runnable() {
            public void run() {
                //make the API call
                getClientInstance().executeAsStringAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {

                            //invoke the callback after response if its not null
                            if (getHttpCallBack() != null)	
                            {
                                getHttpCallBack().OnAfterResponse(_context);
                            }

                            //handle errors defined at the API level
                            validateResponse(_response, _context);

                            //extract result from the http response
                            String _responseBody = ((HttpStringResponse)_response).getBody();
                            RetrieveConfigResponse _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<RetrieveConfigResponse>(){});

                            //let the caller know of the success
                            callBack.onSuccess(_context, _result);
                        } catch (APIException error) {
                            //let the caller know of the error
                            callBack.onFailure(_context, error);
                        } catch (IOException ioException) {
                            //let the caller know of the caught IO Exception
                            callBack.onFailure(_context, ioException);
                        } catch (Exception exception) {
                            //let the caller know of the caught Exception
                            callBack.onFailure(_context, exception);
                        }
                    }
                    public void onFailure(HttpContext _context, Throwable _error) {
                        //invoke the callback after response if its not null
                        if (getHttpCallBack() != null)	
                            {
                            getHttpCallBack().OnAfterResponse(_context);
                        }

                        //let the caller know of the failure
                        callBack.onFailure(_context, _error);
                    }
                });
            }
        };

        //execute async using thread pool
        APIHelper.getScheduler().execute(_responseTask);
    }

    /**
     * ## Add Tickets BatchPlease remember that with all update tickets status requests you need to providea proper Content-Type header.`Content-Type: application/json`Example JSON request:        {          "ticketsBatchName" : "1 DAY ADULT TAB 6M (PEAK)",          "ticketsBatchReference" : "USS1DADTAB6MA0210004",          "ticketsOrderReference" : "1609871",          "ticketsOrderDate" : "2016-01-12",          "ticketsPerPerson" : 1,          "productTypesUuid": [            "3016c3cf-d483-5e81-ad55-ba362670e2e2"          ],          "currencyUuid": "0a1f8d35-3b6f-54ac-8421-131f340b6334",          "barcodeTypeUuid": "a87e1e6f-c4f0-5655-b0b6-05e066bdb51b",          "adultsAllowed" : true,          "childrenAllowed" : true,          "seniorsAllowed" : true,          "validFrom" : "2016-01-15",          "validTo" : "2016-06-15",          "pricePerTicket" : 67.00,          "tickets": [            {              "value" : "100040100100005022",              "status" : "unused"            },            {              "value" : "100040100100005023",              "status" : "unused"            },            {              "value" : "100040100100005024",              "status" : "unused"            }          ]        }A response object has the following attributes:+ `ticketsBatchName` - name of the inserted ticket batch+ `ticketsBatchReference` - reference of the inserted ticket batch+ `ticketsOrderReference` - tickets order reference+ `ticketsOrderDate` - date - tickets order date+ `ticketsPerPerson` - integer+ `productTypesUuid` - array - all attached product types to this batch+ `currencyUuid` - string+ `barcodeTypeUuid` - string+ `adultsAllowed` - bool - batch validity for adults bookings - true|false+ `childrenAllowed` - bool - batch validity for children bookings - true|false+ `validFrom` - string - valid from date for the batch+ `validTo` - string - valid to date for the batch+ `pricePerTicket` - number - price per ticket+ `tickets` - array - list of all tickets that have been added to the batch with their number and statusesExample JSON response:        {          "data": {            "ticketsBatchName": "1 DAY ADULT TAB 6M (PEAK)",            "ticketsBatchReference": "USS1DADTAB6MA0210004",            "ticketsOrderReference": "1609871",            "ticketsOrderDate": "2016-01-12",            "ticketsPerPerson": 1,            "productTypesUuid": [              "3016c3cf-d483-5e81-ad55-ba362670e2e2"            ],            "currencyUuid": "0a1f8d35-3b6f-54ac-8421-131f340b6334",            "barcodeTypeUuid": "a87e1e6f-c4f0-5655-b0b6-05e066bdb51b",            "adultsAllowed": true,            "childrenAllowed": true,            "validFrom": "2016-01-15",            "validTo": "2016-06-15",            "pricePerTicket": 67,            "tickets": {              "data": [                {                  "value": "100040100100005022",                  "status": "unused",                  "usedAt": null                },                {                  "value": "100040100100005023",                  "status": "unused",                  "usedAt": null                },                {                  "value": "100040100100005024",                  "status": "unused",                  "usedAt": null                }              ]            }          }        }## Update Tickets StatusPlease remember that with all update tickets status requests you need to providea proper Content-Type header.`Content-Type: application/json`Example JSON request:        {          "data": [            {              "value" : "100040100100005022",              "status" : "used"            },           {              "value" : "0041018110401587837",                "status" : "unused"            }          ]        }A response object has the following attributes:+ `value` - value of ticket number+ `status` - unused / used / invalid - status of the ticket after the update+ `usedAt` - null / dateExample JSON response:        {          "data": [            {              "value": "100040100100005022",              "status": "used",              "usedAt": "2016-07-25 11:47:23"            },            {              "value": "0041018110401587837",              "status": "unused",              "usedAt": null            }          ]        }
     * @param    data    Required parameter: Example: 
     * @return    Returns the AddTicketsBatchResponse response from the API call 
     */
    public AddTicketsBatchResponse addTicketsBatch(
                final AddTicketsBatchRequest data
    ) throws Throwable {
        APICallBackCatcher<AddTicketsBatchResponse> callback = new APICallBackCatcher<AddTicketsBatchResponse>();
        addTicketsBatchAsync(data, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * ## Add Tickets BatchPlease remember that with all update tickets status requests you need to providea proper Content-Type header.`Content-Type: application/json`Example JSON request:        {          "ticketsBatchName" : "1 DAY ADULT TAB 6M (PEAK)",          "ticketsBatchReference" : "USS1DADTAB6MA0210004",          "ticketsOrderReference" : "1609871",          "ticketsOrderDate" : "2016-01-12",          "ticketsPerPerson" : 1,          "productTypesUuid": [            "3016c3cf-d483-5e81-ad55-ba362670e2e2"          ],          "currencyUuid": "0a1f8d35-3b6f-54ac-8421-131f340b6334",          "barcodeTypeUuid": "a87e1e6f-c4f0-5655-b0b6-05e066bdb51b",          "adultsAllowed" : true,          "childrenAllowed" : true,          "seniorsAllowed" : true,          "validFrom" : "2016-01-15",          "validTo" : "2016-06-15",          "pricePerTicket" : 67.00,          "tickets": [            {              "value" : "100040100100005022",              "status" : "unused"            },            {              "value" : "100040100100005023",              "status" : "unused"            },            {              "value" : "100040100100005024",              "status" : "unused"            }          ]        }A response object has the following attributes:+ `ticketsBatchName` - name of the inserted ticket batch+ `ticketsBatchReference` - reference of the inserted ticket batch+ `ticketsOrderReference` - tickets order reference+ `ticketsOrderDate` - date - tickets order date+ `ticketsPerPerson` - integer+ `productTypesUuid` - array - all attached product types to this batch+ `currencyUuid` - string+ `barcodeTypeUuid` - string+ `adultsAllowed` - bool - batch validity for adults bookings - true|false+ `childrenAllowed` - bool - batch validity for children bookings - true|false+ `validFrom` - string - valid from date for the batch+ `validTo` - string - valid to date for the batch+ `pricePerTicket` - number - price per ticket+ `tickets` - array - list of all tickets that have been added to the batch with their number and statusesExample JSON response:        {          "data": {            "ticketsBatchName": "1 DAY ADULT TAB 6M (PEAK)",            "ticketsBatchReference": "USS1DADTAB6MA0210004",            "ticketsOrderReference": "1609871",            "ticketsOrderDate": "2016-01-12",            "ticketsPerPerson": 1,            "productTypesUuid": [              "3016c3cf-d483-5e81-ad55-ba362670e2e2"            ],            "currencyUuid": "0a1f8d35-3b6f-54ac-8421-131f340b6334",            "barcodeTypeUuid": "a87e1e6f-c4f0-5655-b0b6-05e066bdb51b",            "adultsAllowed": true,            "childrenAllowed": true,            "validFrom": "2016-01-15",            "validTo": "2016-06-15",            "pricePerTicket": 67,            "tickets": {              "data": [                {                  "value": "100040100100005022",                  "status": "unused",                  "usedAt": null                },                {                  "value": "100040100100005023",                  "status": "unused",                  "usedAt": null                },                {                  "value": "100040100100005024",                  "status": "unused",                  "usedAt": null                }              ]            }          }        }## Update Tickets StatusPlease remember that with all update tickets status requests you need to providea proper Content-Type header.`Content-Type: application/json`Example JSON request:        {          "data": [            {              "value" : "100040100100005022",              "status" : "used"            },           {              "value" : "0041018110401587837",                "status" : "unused"            }          ]        }A response object has the following attributes:+ `value` - value of ticket number+ `status` - unused / used / invalid - status of the ticket after the update+ `usedAt` - null / dateExample JSON response:        {          "data": [            {              "value": "100040100100005022",              "status": "used",              "usedAt": "2016-07-25 11:47:23"            },            {              "value": "0041018110401587837",              "status": "unused",              "usedAt": null            }          ]        }
     * @param    data    Required parameter: Example: 
     * @return    Returns the void response from the API call 
     */
    public void addTicketsBatchAsync(
                final AddTicketsBatchRequest data,
                final APICallBack<AddTicketsBatchResponse> callBack
    ) throws JsonProcessingException {
        //the base uri for api requests
        String _baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/v1/suppliers/tickets");
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5710666320612820003L;
            {
                    put( "user-agent", "BeMyGuest.Suppliers.SDK.v1" );
                    put( "accept", "application/json" );
                    put( "X-Authorization", Configuration.xAuthorization );
            }
        };

        //prepare and invoke the API call request to fetch the response
        final HttpRequest _request = getClientInstance().postBody(_queryUrl, _headers, APIHelper.serialize(data));

        //invoke the callback before request if its not null
        if (getHttpCallBack() != null)
        {
            getHttpCallBack().OnBeforeRequest(_request);
        }

        //invoke request and get response
        Runnable _responseTask = new Runnable() {
            public void run() {
                //make the API call
                getClientInstance().executeAsStringAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {

                            //invoke the callback after response if its not null
                            if (getHttpCallBack() != null)	
                            {
                                getHttpCallBack().OnAfterResponse(_context);
                            }

                            //handle errors defined at the API level
                            validateResponse(_response, _context);

                            //extract result from the http response
                            String _responseBody = ((HttpStringResponse)_response).getBody();
                            AddTicketsBatchResponse _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<AddTicketsBatchResponse>(){});

                            //let the caller know of the success
                            callBack.onSuccess(_context, _result);
                        } catch (APIException error) {
                            //let the caller know of the error
                            callBack.onFailure(_context, error);
                        } catch (IOException ioException) {
                            //let the caller know of the caught IO Exception
                            callBack.onFailure(_context, ioException);
                        } catch (Exception exception) {
                            //let the caller know of the caught Exception
                            callBack.onFailure(_context, exception);
                        }
                    }
                    public void onFailure(HttpContext _context, Throwable _error) {
                        //invoke the callback after response if its not null
                        if (getHttpCallBack() != null)	
                            {
                            getHttpCallBack().OnAfterResponse(_context);
                        }

                        //let the caller know of the failure
                        callBack.onFailure(_context, _error);
                    }
                });
            }
        };

        //execute async using thread pool
        APIHelper.getScheduler().execute(_responseTask);
    }

    /**
     * Update statuses for all the provided tickets
     * @param    data    Required parameter: Example: 
     * @return    Returns the UpdateTicketsStatusResponse response from the API call 
     */
    public UpdateTicketsStatusResponse updateTicketsStatus(
                final UpdateTicketsStatusRequest data
    ) throws Throwable {
        APICallBackCatcher<UpdateTicketsStatusResponse> callback = new APICallBackCatcher<UpdateTicketsStatusResponse>();
        updateTicketsStatusAsync(data, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * Update statuses for all the provided tickets
     * @param    data    Required parameter: Example: 
     * @return    Returns the void response from the API call 
     */
    public void updateTicketsStatusAsync(
                final UpdateTicketsStatusRequest data,
                final APICallBack<UpdateTicketsStatusResponse> callBack
    ) throws JsonProcessingException {
        //the base uri for api requests
        String _baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/v1/suppliers/tickets");
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 4670993475480581372L;
            {
                    put( "user-agent", "BeMyGuest.Suppliers.SDK.v1" );
                    put( "accept", "application/json" );
                    put( "X-Authorization", Configuration.xAuthorization );
            }
        };

        //prepare and invoke the API call request to fetch the response
        final HttpRequest _request = getClientInstance().putBody(_queryUrl, _headers, APIHelper.serialize(data));

        //invoke the callback before request if its not null
        if (getHttpCallBack() != null)
        {
            getHttpCallBack().OnBeforeRequest(_request);
        }

        //invoke request and get response
        Runnable _responseTask = new Runnable() {
            public void run() {
                //make the API call
                getClientInstance().executeAsStringAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {

                            //invoke the callback after response if its not null
                            if (getHttpCallBack() != null)	
                            {
                                getHttpCallBack().OnAfterResponse(_context);
                            }

                            //handle errors defined at the API level
                            validateResponse(_response, _context);

                            //extract result from the http response
                            String _responseBody = ((HttpStringResponse)_response).getBody();
                            UpdateTicketsStatusResponse _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<UpdateTicketsStatusResponse>(){});

                            //let the caller know of the success
                            callBack.onSuccess(_context, _result);
                        } catch (APIException error) {
                            //let the caller know of the error
                            callBack.onFailure(_context, error);
                        } catch (IOException ioException) {
                            //let the caller know of the caught IO Exception
                            callBack.onFailure(_context, ioException);
                        } catch (Exception exception) {
                            //let the caller know of the caught Exception
                            callBack.onFailure(_context, exception);
                        }
                    }
                    public void onFailure(HttpContext _context, Throwable _error) {
                        //invoke the callback after response if its not null
                        if (getHttpCallBack() != null)	
                            {
                            getHttpCallBack().OnAfterResponse(_context);
                        }

                        //let the caller know of the failure
                        callBack.onFailure(_context, _error);
                    }
                });
            }
        };

        //execute async using thread pool
        APIHelper.getScheduler().execute(_responseTask);
    }

    /**
     * Get status for specific ticket number.##ResponseA response object has the following attributes:+ `value` - value of ticket number+ `status` - unused / used / invalid - current status of the ticket+ `usedAt` - null / date
     * @param    ticketNumber    Required parameter: Example: 
     * @return    Returns the GetTicketStatusResponse response from the API call 
     */
    public GetTicketStatusResponse getTicketStatus(
                final String ticketNumber
    ) throws Throwable {
        APICallBackCatcher<GetTicketStatusResponse> callback = new APICallBackCatcher<GetTicketStatusResponse>();
        getTicketStatusAsync(ticketNumber, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * Get status for specific ticket number.##ResponseA response object has the following attributes:+ `value` - value of ticket number+ `status` - unused / used / invalid - current status of the ticket+ `usedAt` - null / date
     * @param    ticketNumber    Required parameter: Example: 
     * @return    Returns the void response from the API call 
     */
    public void getTicketStatusAsync(
                final String ticketNumber,
                final APICallBack<GetTicketStatusResponse> callBack
    ) {
        //the base uri for api requests
        String _baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/v1/suppliers/tickets/{ticket_number}");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 4834871560088832527L;
            {
                    put( "ticket_number", ticketNumber );
            }});
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5223418220036090841L;
            {
                    put( "user-agent", "BeMyGuest.Suppliers.SDK.v1" );
                    put( "accept", "application/json" );
                    put( "X-Authorization", Configuration.xAuthorization );
            }
        };

        //prepare and invoke the API call request to fetch the response
        final HttpRequest _request = getClientInstance().get(_queryUrl, _headers, null);

        //invoke the callback before request if its not null
        if (getHttpCallBack() != null)
        {
            getHttpCallBack().OnBeforeRequest(_request);
        }

        //invoke request and get response
        Runnable _responseTask = new Runnable() {
            public void run() {
                //make the API call
                getClientInstance().executeAsStringAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {

                            //invoke the callback after response if its not null
                            if (getHttpCallBack() != null)	
                            {
                                getHttpCallBack().OnAfterResponse(_context);
                            }

                            //handle errors defined at the API level
                            validateResponse(_response, _context);

                            //extract result from the http response
                            String _responseBody = ((HttpStringResponse)_response).getBody();
                            GetTicketStatusResponse _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<GetTicketStatusResponse>(){});

                            //let the caller know of the success
                            callBack.onSuccess(_context, _result);
                        } catch (APIException error) {
                            //let the caller know of the error
                            callBack.onFailure(_context, error);
                        } catch (IOException ioException) {
                            //let the caller know of the caught IO Exception
                            callBack.onFailure(_context, ioException);
                        } catch (Exception exception) {
                            //let the caller know of the caught Exception
                            callBack.onFailure(_context, exception);
                        }
                    }
                    public void onFailure(HttpContext _context, Throwable _error) {
                        //invoke the callback after response if its not null
                        if (getHttpCallBack() != null)	
                            {
                            getHttpCallBack().OnAfterResponse(_context);
                        }

                        //let the caller know of the failure
                        callBack.onFailure(_context, _error);
                    }
                });
            }
        };

        //execute async using thread pool
        APIHelper.getScheduler().execute(_responseTask);
    }

}