package com.example.TodoListBackend.controller;

import com.example.TodoListBackend.object.Task;
import com.example.TodoListBackend.repository.TaskRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

@RestController
@RequestMapping(value = "/todo")
public class TaskController {
    @Autowired
    private TaskRepo taskRepo;

    @GetMapping
    public List<Task> findAll(){ return taskRepo.findAll(); }

    @PostMapping
    public Task save(@Valid @NotNull @RequestBody Task task) { return taskRepo.save(task); }

    @PutMapping
    public Task update(@Valid @NotNull @RequestBody Task task) { return taskRepo.save(task); }
}