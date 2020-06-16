package com.redhat.eventmodel.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.ArrayList;
import java.util.List;

@JsonPropertyOrder({"ID", "Name", "ResultType", "ModelName", "Results"})
public class EvaluatedDecision {
    private String name;
    private String resultType;
    private String ID;
    private String modelName;
    private List<DecisionModelExecutionResult> results = new ArrayList<>( );

    @JsonProperty("Name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("ResultType")
    public String getResultType() {
        return resultType;
    }

    public void setResultType(String resultType) {
        this.resultType = resultType;
    }

    @JsonProperty("ID")
    public String getID() {
        return ID;
    }

    public void setID(String iD) {
        ID = iD;
    }

	@JsonProperty("ModelName")
    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    @JsonProperty("Results")
    public List<DecisionModelExecutionResult> getResults() {
        return results;
    }

    public void setResults(List<DecisionModelExecutionResult> results) {
        this.results = results;
    }

}
    