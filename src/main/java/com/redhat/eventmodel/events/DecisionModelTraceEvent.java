package com.redhat.eventmodel.events;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.redhat.eventmodel.model.BusinessKnowledgeModel;
import com.redhat.eventmodel.model.DecisionModelContextEntry;
import com.redhat.eventmodel.model.DecisionTable;
import com.redhat.eventmodel.model.EvaluatedDecision;


@JsonPropertyOrder({"ID", "TimeStamp", "EventType", "Type", "ModelName", "DecisionTable", "BKM", "ContextEntry", "EvaluatedDecision"})
public class DecisionModelTraceEvent extends TraceEvent {

	private DecisionModelTraceEventType type = DecisionModelTraceEventType.None;
	private String modelName;
	private DecisionTable decisionTable;
	private BusinessKnowledgeModel bkm;
	private DecisionModelContextEntry contextEntry;
	private EvaluatedDecision evaluatedDecision;

	@JsonProperty("Type")
	public DecisionModelTraceEventType getType() {
		return this.type;
	}	

	public void setType(DecisionModelTraceEventType type) {
		this.type = type;
	}

	@JsonProperty("ModelName")
	public String getModelName() {
		return this.modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	@JsonProperty("DecisionTable")
	public DecisionTable getDecisionTable() {
		return this.decisionTable;
	}

	public void setDecisionTable(DecisionTable decisionTable) {
		this.decisionTable = decisionTable;
	}

	@JsonProperty("BKM")
	public BusinessKnowledgeModel getBKM() {
		return this.bkm;
	}

	public void setBKM(BusinessKnowledgeModel bkm) {
		this.bkm = bkm;
	}

	@JsonProperty("ContextEntry")
	public DecisionModelContextEntry getContextEntry() {
		return this.contextEntry;
	}

	public void setContextEntry(DecisionModelContextEntry contextEntry) {
		this.contextEntry = contextEntry;
	}

	@JsonProperty("EvaluatedDecision")
	public EvaluatedDecision getEvaluatedDecision() {
		return evaluatedDecision;
	}

	public void setEvaluatedDecision(EvaluatedDecision evaluatedDecision) {
		this.evaluatedDecision = evaluatedDecision;
	}

	
}
