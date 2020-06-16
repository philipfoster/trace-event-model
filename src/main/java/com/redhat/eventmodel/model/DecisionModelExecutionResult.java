package com.redhat.eventmodel.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"DecisionID", "Name", "EvaluationStatus", "Result"})
public class DecisionModelExecutionResult {

    String decisionID;
    String name;
    String evaluationStatus;
    Object result;

    @JsonProperty("DecisionID")
    public String getDecisionID() {
        return decisionID;
    }

    public void setDecisionID(String decisionID) {
        this.decisionID = decisionID;
    }
    @JsonProperty("Name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("EvaluationStatus")
    public String getEvaluationStatus() {
        return evaluationStatus;
    }

    public void setEvaluationStatus(String evaluationStatus) {
        this.evaluationStatus = evaluationStatus;
    }

    @JsonProperty("Result")
    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }
}