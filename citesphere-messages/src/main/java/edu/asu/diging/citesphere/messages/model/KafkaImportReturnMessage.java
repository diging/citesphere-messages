package edu.asu.diging.citesphere.messages.model;

import com.fasterxml.jackson.annotation.JsonCreator;

public class KafkaImportReturnMessage {

    private ItemCreationResponse zoteroResponse;
    private String jobId;
    
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
    
}
