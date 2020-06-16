package com.redhat.eventmodel.events;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.redhat.eventmodel.model.Fact;
import com.redhat.eventmodel.model.Rule;

@JsonPropertyOrder({"ID", "TimeStamp", "EventType", "Type", "Rule", "Fact", "OldFact"})
public class WorkingMemoryTraceEvent extends TraceEvent {

	private WorkingMemoryTraceEventType type = WorkingMemoryTraceEventType.None;
	private Rule rule;
	private Fact fact;
	private Fact oldFact;

	@JsonProperty("Type")
	public WorkingMemoryTraceEventType getType() {
		return this.type;
	}	

	public void setType(WorkingMemoryTraceEventType type) {
		this.type = type;
	}

	@JsonProperty("Rule")
	public Rule getRule() {
		return this.rule;
	}

	public void setRule(Rule rule) {
		this.rule = rule;
	}

	@JsonProperty("Fact")
	public Fact getFact() {
		return this.fact;
	}

	public void setFact(Fact fact) {
		this.fact = fact;
	}

	@JsonProperty("OldFact")
	public Fact getOldFact() {
		return this.oldFact;
	}

	public void setOldFact(Fact oldFact) {
		this.oldFact = oldFact;
	}
}
