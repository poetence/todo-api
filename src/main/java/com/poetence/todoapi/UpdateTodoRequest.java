package com.poetence.todoapi;

public class UpdateTodoRequest {
    private final boolean complete;
    public UpdateTodoRequest(boolean update) {
        this.complete = update;
    }
    public boolean isComplete() {
        return complete;
    }
}
