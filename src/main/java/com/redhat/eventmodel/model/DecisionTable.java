package com.redhat.eventmodel.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.ArrayList;
import java.util.List;

@JsonPropertyOrder({"Name", "NodeName", "Matches", "Results"})
public class DecisionTable {

    private String name;
    private String nodeName;
    private List<Integer> matches = new ArrayList<>( );
    private List<DecisionModelExecutionResult> results = new ArrayList<>( );

	@JsonProperty("Name")
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

	@JsonProperty("NodeName")
    public String getNodeName() {
        return this.nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

	@JsonProperty("Matches")
    public List<Integer> getMatches() {
        return this.matches;
    }

    public void setMatches(List<Integer> matches) {
        this.matches = matches;
    }

    @JsonProperty("Results")
    public List<DecisionModelExecutionResult> getResults() {
        return this.results;
    }

    public void setResults(List<DecisionModelExecutionResult> results) {
        this.results = results;
    }

    @Override
    public String toString() {
        return "DecisionTable name=" + getName() + ", nodeName=" + getNodeName();
    }
}