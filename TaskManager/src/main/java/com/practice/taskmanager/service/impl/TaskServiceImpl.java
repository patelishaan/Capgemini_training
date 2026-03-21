package com.practice.taskmanager.service.impl;

import com.practice.taskmanager.constants.TaskStatus;
import com.practice.taskmanager.entity.Task;
import com.practice.taskmanager.entity.dto.TaskRequestDto;
import com.practice.taskmanager.entity.dto.TaskResponseDto;
import com.practice.taskmanager.repository.TaskRepository;
import com.practice.taskmanager.service.TaskService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Optional;

@Service
public class TaskServiceImpl implements TaskService {
    @Autowired
    TaskRepository taskRepository;
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public void markCompleted(String title) {
        Task task = taskRepository.findByTitle(title)
                .orElseThrow(() -> new RuntimeException("Task not found: " + title));

        task.setStatus(TaskStatus.COMPLETED);
        taskRepository.save(task);
    }

    @Override
    public void removeTaskById(Long id) {
        Task task = taskRepository.findById(id)
                .orElseThrow(()->new RuntimeException(("Task not found"+id)));
        taskRepository.deleteById(id);
        //taskRepository.save()
    }


    @Override
    public TaskStatus fetchStatus(String title) {
        Task task = taskRepository.findByTitle(title)
                .orElseThrow(()-> new RuntimeException("task not found"));
        //return modelMapper.map(task, TaskStatus.class);
        return task.getStatus();
    }

    @Override
    public LocalDate getDeadline(String title) {
        Task task = taskRepository.findByTitle(title)
                .orElseThrow(()-> new RuntimeException("task not found"));
        return task.getDeadline();
    }

    @Override
    public void createTask(TaskRequestDto dto) {
        Task task = new Task();
        task.setTitle(dto.getTitle());
        task.setDeadline(dto.getDeadline());
        taskRepository.save(task);
    }

    @Override
    public Optional<Task> findByTitle(String title) {
        Task task = taskRepository.findByTitle(title)
                .orElseThrow(()->new RuntimeException("task not found"));
        return Optional.of(task);
        //return Optional.empty();
    }


}
