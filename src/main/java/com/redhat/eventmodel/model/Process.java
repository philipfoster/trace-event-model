package com.redhat.eventmodel.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Map;

@JsonPropertyOrder({"Name", "ParentProcessID", "Node", "ProcessVariables"})
public class Process {

    private String name;
    private long parentProcessID;
    private Map<String, Object> processVariables;
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

    @JsonProperty("ProcessVariables")
    public Map<String, Object> getProcessVariables() {
        return processVariables;
    }

    public void setProcessVariables(Map<String, Object> processVariables) {
        this.processVariables = processVariables;
    }

    public void setNode(Node node) {
        this.node = node;
    }

//    @Override
//    public String toString() {
//        return "Process name=" + getName() + ", parentProcessID=" + getParentProcessID() + ", node=" + getNode();
//    }


    @Override
    public String toString() {
        return "Process{" +
            "name='" + name + '\'' +
            ", parentProcessID=" + parentProcessID +
            ", processVariables=" + processVariables +
            ", node=" + node +
            '}';
    }
}