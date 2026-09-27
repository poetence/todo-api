package com.poetence.todoapi;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class TodoService {
    private final Map<Long, Todo> todos;
    private final AtomicLong counter;
    public TodoService() {
        this.todos = new HashMap<Long, Todo>();
        this.counter = new AtomicLong(0);
    }

    public Map<Long, Todo> getTodos() {
        return Map.copyOf(todos);
    }
    public Todo getTodo(Long id) {
        if (this.todos.containsKey(id)) {
            return todos.get(id);
        }
        else {
            throw new IllegalArgumentException("Id not found in TodoService");
        }
    }
    public Todo createTodo(String title) {
        Long id = counter.incrementAndGet();
        Todo item = new Todo(id, title, false);
        this.todos.put(id, item);
        return item;
    }
    public void updateTodo(Long id, boolean completed) {
        if (this.todos.containsKey(id)) {
            this.todos.get(id).setCompleted(completed);
        }
        else {
            throw new IllegalArgumentException("Id not found in TodoService");
        }
    }
    public void deleteTodo(Long id) {
        if (this.todos.containsKey(id)) {
            this.todos.remove(id);
        }
        else {
            throw new IllegalArgumentException("Id not found in TodoService");
        }
    }
}
