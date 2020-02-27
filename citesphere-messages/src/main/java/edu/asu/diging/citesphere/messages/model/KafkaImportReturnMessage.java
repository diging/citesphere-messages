package edu.asu.diging.citesphere.messages.model;

import com.fasterxml.jackson.annotation.JsonCreator;

public class KafkaImportReturnMessage implements KafkaReturnMessage {

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
    /* (non-Javadoc)
     * @see edu.asu.diging.citesphere.messages.model.KafkaReturnMessage#getJobId()
     */
    @Override
    public String getJobId() {
        return jobId;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.citesphere.messages.model.KafkaReturnMessage#setJobId(java.lang.String)
     */
    @Override
    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.citesphere.messages.model.KafkaReturnMessage#getStatus()
     */
    @Override
    public Status getStatus() {
        return status;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.citesphere.messages.model.KafkaReturnMessage#setStatus(edu.asu.diging.citesphere.messages.model.Status)
     */
    @Override
    public void setStatus(Status status) {
        this.status = status;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.citesphere.messages.model.KafkaReturnMessage#getCode()
     */
    @Override
    public ResponseCode getCode() {
        return code;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.citesphere.messages.model.KafkaReturnMessage#setCode(edu.asu.diging.citesphere.messages.model.ResponseCode)
     */
    @Override
    public void setCode(ResponseCode code) {
        this.code = code;
    }
    
}
