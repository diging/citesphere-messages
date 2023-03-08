package edu.asu.diging.citesphere.messages;

public interface KafkaTopics {

    public final static String REFERENCES_IMPORT_TOPIC = "_citesphere_import_references_topic";
    public final static String REFERENCES_IMPORT_DONE_TOPIC = "_citesphere_import_references_done_topic";

    public final static String REFERENCES_EXPORT_TOPIC = "_citesphere_export_references_topic";
    public final static String REFERENCES_EXPORT_DONE_TOPIC = "_citesphere_export_references_done_topic";
    public final static String REFERENCES_IMPORT_CROSSREF_TOPIC = "_citesphere_import_crossref_topic";
}
