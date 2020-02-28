package edu.asu.diging.citesphere.messages.model;

public interface KafkaReturnMessage {

    String getJobId();

    void setJobId(String jobId);

    Status getStatus();

    void setStatus(Status status);

    ResponseCode getCode();

    void setCode(ResponseCode code);

}