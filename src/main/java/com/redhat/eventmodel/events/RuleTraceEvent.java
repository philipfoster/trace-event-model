package com.redhat.eventmodel.events;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.redhat.eventmodel.model.Fact;
import com.redhat.eventmodel.model.Rule;

import java.util.ArrayList;
import java.util.List;

@JsonPropertyOrder({"ID", "TimeStamp", "EventType", "Type", "Rule", "Facts", "RulesNotFired"})
public class RuleTraceEvent extends TraceEvent {

	private RuleTraceEventType type = RuleTraceEventType.None;
	private Rule rule;
	private List<Fact> facts = new ArrayList<>( );
	private List<Rule> rulesNotFired = new ArrayList<>( );

	@JsonProperty("Type")
	public RuleTraceEventType getType() {
		return this.type;
	}	

	public void setType(RuleTraceEventType type) {
		this.type = type;
	}

	@JsonProperty("Rule")
	public Rule getRule() {
		return this.rule;
	}

	public void setRule(Rule rule) {
		this.rule = rule;
	}

	@JsonProperty("Facts")
	public List<Fact> getFacts() {
		return this.facts;
	}

	public void setFacts(List<Fact> facts) {
		this.facts = facts;
	}

	@JsonProperty("RulesNotFired")
	public List<Rule> getRulesNotFired() {
		return this.rulesNotFired;
	}
	public void setRulesNotFired(List<Rule> rulesNotFired) {
		this.rulesNotFired = rulesNotFired;
	}
}
