package com.redhat.eventmodel.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.ArrayList;
import java.util.List;

@JsonPropertyOrder({"ID", "Name", "ModelName", "ResultType", "Results"})
public class BusinessKnowledgeModel {

    private String ID;
    private String name;
    private String modelName;
    private String resultType;
    private List<DecisionModelExecutionResult> results = new ArrayList<>( );

	@JsonProperty("ID")
    public String getID() {
        return this.ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

	@JsonProperty("Name")
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

	@JsonProperty("ModelName")
    public String getModelName() {
        return this.modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

	@JsonProperty("ResultType")
    public String getResultType() {
        return this.resultType;
    }

    public void setResultType(String resultType) {
        this.resultType = resultType;
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
        return "BKM ID=" + getID() + ", name=" + getName() + ", modelName=" + getModelName() + ", resultType= " + getResultType();
    }
}