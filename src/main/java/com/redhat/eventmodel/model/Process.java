package com.redhat.eventmodel.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"Name", "ParentProcessID", "Node"})
public class Process {

    private String name;
    private long parentProcessID;
    private Node node;

	@JsonProperty("Name")
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

	@JsonProperty("ParentProcessID")
    public long getParentProcessID() {
        return this.parentProcessID;
    }

    public void setParentProcessID(long parentProcessID) {
        this.parentProcessID = parentProcessID;
    }

    @JsonProperty("Node")
    public Node getNode() {
        return this.node;
    }

    public void setNode(Node node) {
        this.node = node;
    }

    @Override
    public String toString() {
        return "Process name=" + getName() + ", parentProcessID=" + getParentProcessID() + ", node=" + getNode().toString();
    }
}