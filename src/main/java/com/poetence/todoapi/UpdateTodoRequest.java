package com.poetence.todoapi;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class UpdateTodoRequest {
    private final boolean complete;
    @JsonCreator
    public UpdateTodoRequest(@JsonProperty("complete") boolean complete) {

        this.complete = complete;
    }
    public boolean isComplete() {
        return complete;
    }
}
