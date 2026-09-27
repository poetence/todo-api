package com.poetence.todoapi;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TodoController {
    private final TodoService todoService;
    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }
    @GetMapping("/todos")
    public List<Todo> getAllTodos() {
        return todoService.getTodos();
    }
    @GetMapping("/todos/{id}")
    public Todo getTodo(@PathVariable Long id) {
        return todoService.getTodo(id);
    }
    @PostMapping("/todos")
    public Todo createTodo(@RequestBody CreateTodoRequest request) {
        return todoService.createTodo(request.getTitle());
    }
    @PutMapping("/todos/{id}")
    public void updateTodo(@PathVariable Long id, @RequestBody UpdateTodoRequest request) {
        todoService.updateTodo(id,request.isComplete());
    }
    @DeleteMapping("/todos/{id}")
    public void deleteTodo(@PathVariable Long id) {
        todoService.deleteTodo(id);
    }
}
