package edu.asu.diging.citesphere.messages;

public interface KafkaTopics {

    public final static String REFERENCES_IMPORT_TOPIC = "_citesphere_import_references_topic";
    public final static String REFERENCES_IMPORT_DONE_TOPIC = "_citesphere_import_references_done_topic";

    public final static String REFERENCES_EXPORT_TOPIC = "_citesphere_export_references_topic";
    public final static String REFERENCES_EXPORT_DONE_TOPIC = "_citesphere_export_references_done_topic";
    
    /**
    * The name of the Kafka topic used for collection import events. Messages published to this topic
    * will trigger import processing of citations to a collection/group from BibTex File, which 
    * is exported from Zotero.
    */
    public final static String COLLECTION_IMPORT_TOPIC = "_citesphere_import_collections_topic";
    /**
     * The name of the Kafka topic used for crossref citation import events. Messages published to this topic
     * will trigger import processing of citations to a group from crossref.
     */
    public final static String REFERENCES_IMPORT_CROSSREF_TOPIC = "_citesphere_import_crossref_topic";
}
