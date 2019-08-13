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
     * Requested action is being processed. 
     */
    P00("Processing"),
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
    X30("Unkown file format.");
    
    private String message;
    
    private ResponseCode(String msg) {
        this.message = msg;
    }
    
    public String getMessage() {
        return message;
    }
}
