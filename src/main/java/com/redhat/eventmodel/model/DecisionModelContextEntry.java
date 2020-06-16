package com.redhat.eventmodel.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.ArrayList;
import java.util.List;

@JsonPropertyOrder({"NodeName", "VariableName", "ExpressionResult", "Results"})
public class DecisionModelContextEntry {

    private String nodeName;
    private String variableName;
    private Object expressionResult;
    private List<DecisionModelExecutionResult> results = new ArrayList<>( );

	@JsonProperty("NodeName")
    public String getNodeName() {
        return this.nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

	@JsonProperty("VariableName")
    public String getVariableName() {
        return this.variableName;
    }

    public void setVariableName(String variableName) {
        this.variableName = variableName;
    }

    @JsonProperty("ExpressionResult")
    public Object getExpressionResult() {
        return this.expressionResult;
    }

    public void setExpressionResult(Object expressionResult) {
        this.expressionResult = expressionResult;
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
        return "DecisionModelContextEntry nodeName=" + getNodeName() + ", variableName=" + getVariableName() + ", expressionResult=" + getExpressionResult().toString();
    }
}