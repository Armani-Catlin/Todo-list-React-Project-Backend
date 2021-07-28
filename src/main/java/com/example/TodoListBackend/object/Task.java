package com.example.TodoListBackend.object;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class Task {
    private Long id;
    @NotBlank
    private String task;
    private boolean completion;

    public Task() {}

    public Task(Long id, String task, boolean completion) {
        this.id = id;
        this.task = task;
        this.completion = completion;
    }

    @Id
    @GeneratedValue()
    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public String getTask() { return task; }

    public void setTask(String task) { this.task = task; }

    public boolean isCompletion() { return completion; }

    public void setCompletion(boolean completion) { this.completion = completion; }
}