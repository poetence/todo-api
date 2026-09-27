package com.poetence.todoapi;

public class CreateTodoRequest {
    private final String title;
    public CreateTodoRequest(String title) {
        this.title = title;
    }
    public String getTitle() {
        return title;
    }
}
