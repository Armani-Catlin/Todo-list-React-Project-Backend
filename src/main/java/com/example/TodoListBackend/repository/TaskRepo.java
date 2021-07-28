package com.example.TodoListBackend.repository;

import com.example.TodoListBackend.object.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepo extends JpaRepository<Task, Long> {
}