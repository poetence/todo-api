package com.poetence.todoapi;


public class Todo {
    final Long id;
    final String title;
    boolean completed;

    Todo(Long id, String title, boolean completed){
        this.id = id;
        this.title = title;
        this.completed = completed;
    }
    public Long getId() { return id; }
    public String getTitle() { return title; }
    public boolean isCompleted() { return completed; }
    public void setCompleted(boolean completed) { this.completed = completed; }
    @Override
    public String toString() {
        return "[Id: " + id + ", Title: " + title + ", Completed: " + completed + "]";
    }
}
