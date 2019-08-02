package edu.asu.diging.citesphere.messages.model;

import com.fasterxml.jackson.annotation.JsonCreator;

public class KafkaImportReturnMessage {

    private ItemCreationResponse zoteroResponse;
    private String jobId;
    private Status status;
    private ResponseCode code;
    
    @JsonCreator
    public KafkaImportReturnMessage() {
        super();
    }
    
    public KafkaImportReturnMessage(ItemCreationResponse zoteroResponse, String jobId) {
        super();
        this.zoteroResponse = zoteroResponse;
        this.jobId = jobId;
    }
    
    public ItemCreationResponse getZoteroResponse() {
        return zoteroResponse;
    }
    public void setZoteroResponse(ItemCreationResponse zoteroResponse) {
        this.zoteroResponse = zoteroResponse;
    }
    public String getJobId() {
        return jobId;
    }
    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public ResponseCode getCode() {
        return code;
    }

    public void setCode(ResponseCode code) {
        this.code = code;
    }
    
}
