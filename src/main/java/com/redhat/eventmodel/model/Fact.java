package com.redhat.eventmodel.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"ID", "Type", "Value"})
public class Fact {

    private String ID;
    private FactType type = FactType.None;
    private Object object;

	@JsonProperty("ID")
    public String getID() {
        return this.ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

	@JsonProperty("Type")
    public FactType getType() {
        return this.type;
    }

    public void setType(FactType type) {
        this.type = type;
    }

	@JsonProperty("Value")
    public Object getObject() {
        return this.object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    @Override
    public String toString() {
        return "Fact ID=" + getID() + ", type=" + getType() + ", value=" + getObject().toString();
    }
}