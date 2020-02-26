package edu.asu.diging.citesphere.messages.model;

public class KafkaExportReturnMessage {

    private String username;
    private String jobId;
    private Status status;
    private ResponseCode code;
    
    public KafkaExportReturnMessage(String username, String jobId) {
        super();
        this.username = username;
        this.jobId = jobId;
    }
    public KafkaExportReturnMessage(String username, String jobId, Status status, ResponseCode code) {
        super();
        this.username = username;
        this.jobId = jobId;
        this.status = status;
        this.code = code;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
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
