package com.practice.taskmanager.service;

import com.practice.taskmanager.constants.TaskStatus;
import com.practice.taskmanager.entity.Task;
import com.practice.taskmanager.entity.dto.TaskRequestDto;

import java.time.LocalDate;
import java.util.Optional;

public interface TaskService {
    void markCompleted(String title);
    void removeTaskById(Long id);
    TaskStatus fetchStatus(String title);
    LocalDate getDeadline(String title);
    void createTask(TaskRequestDto dto);
    Optional<Task> findByTitle(String title);
}
