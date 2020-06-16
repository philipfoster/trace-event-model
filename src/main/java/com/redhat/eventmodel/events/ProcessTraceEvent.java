package com.redhat.eventmodel.events;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


@JsonPropertyOrder({"ID", "TimeStamp", "EventType", "Type", "Process"})
public class ProcessTraceEvent extends TraceEvent {

	private ProcessTraceEventType type = ProcessTraceEventType.None;
	private Process process;

	@JsonProperty("Type")
	public ProcessTraceEventType getType() {
		return this.type;
	}	

	public void setType(ProcessTraceEventType type) {
		this.type = type;
	}

	@JsonProperty("Process")
	public Process getProcess() {
		return this.process;
	}	

	public void setProcess(Process process) {
		this.process = process;
	}
}
