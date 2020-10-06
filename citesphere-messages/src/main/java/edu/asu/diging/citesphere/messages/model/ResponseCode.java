package edu.asu.diging.citesphere.messages.model;

/**
 * Response codes for return messages send through Kafka.
 * @author jdamerow
 *
 */
public enum ResponseCode {
    /**
     * Completed action was successful.
     */
    S00("Success"),
    /**
     * Data is out of date and needs to be synced first. Please retry. 
     */
    P10("Syncing"),
    /**
     * Requested action is being processed. 
     */
    P00("Processing"),
    /**
     * An error occured but processing might still have finished successfully.
     */
    W10("An error occured but processing might still have finished successfully."),
    /**
     * Request could not be processed due to an internal error.
     */
    X00("Request could not be processed due to an internal error."),
    /**
     * Authentication with Citesphere failed.
     */
    X10("Citesphere authentication failed."),
    /**
     * Download from Citesphere failed.
     */
    X20("Citesphere download failed."),
    /**
     * File format cannot be handled.
     */
    X30("Unkown file format."),
    /**
     * Communication with Zotero failed.
     */
    X40("Communication with Zotero failed."),
    /**
     * Group does not exist.
     */
    X50("Group does not exist.")
    ;
    
    private String message;
    
    private ResponseCode(String msg) {
        this.message = msg;
    }
    
    public String getMessage() {
        return message;
    }
}
