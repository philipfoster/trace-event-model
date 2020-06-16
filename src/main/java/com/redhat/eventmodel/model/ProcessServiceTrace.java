package com.redhat.eventmodel.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.redhat.eventmodel.marshalling.LocalDateTimeDeserializer;
import com.redhat.eventmodel.marshalling.LocalDateTimeSerializer;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@JsonPropertyOrder({"ID", "CorrelationID", "StartedOn", "CompletedOn", "Nodes"})
public class ProcessServiceTrace {

    private String ID;
    private String correlationID;

    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    private LocalDateTime startedOn;

    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    private LocalDateTime completedOn;
    private List<Node> nodes = new ArrayList<>( );

    public ProcessServiceTrace() {

    }

	@JsonProperty("ID")
    public String getID() {
        return this.ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    @JsonProperty("CorrelationID")
    public String getCorrelationID() {
        return correlationID;
    }

    public void setCorrelationID(String correlationID) {
        this.correlationID = correlationID;
    }

    @JsonProperty("StartedOn")
    public LocalDateTime getStartedOn() {
        return this.startedOn;
    }

    public void setStartedOn(LocalDateTime startedOn) {
        this.startedOn = startedOn;
    }

    @JsonProperty("CompletedOn")
    public LocalDateTime getCompletedOn() {
        return this.completedOn;
    }

    public void setCompletedOn(LocalDateTime completedOn) {
        this.completedOn = completedOn;
    }

    @JsonProperty("Nodes")
    public List<Node> getNodes() {
        return this.nodes;
    }

    public void setNodes(List<Node> nodes) {
        this.nodes = nodes;
    }

    public ProcessServiceTrace(String ID, String correlationID, LocalDateTime startedOn, LocalDateTime completedOn, List<Node> nodes) {
        this.ID = ID;
        this.correlationID = correlationID;
        this.startedOn = startedOn;
        this.completedOn = completedOn;
        this.nodes = nodes;
    }

    @Override
    public String toString() {
        return "ProcessServiceTrace ID=" + getID() + ", startedOn=" + getStartedOn() + ", completedOn" + getCompletedOn() + ", totalNumberOfNodes=" + getNodes().size();
    }
}