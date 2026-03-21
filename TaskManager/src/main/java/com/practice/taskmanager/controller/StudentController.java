package com.practice.taskmanager.controller;

import com.practice.taskmanager.constants.TaskStatus;
import com.practice.taskmanager.entity.dto.TaskRequestDto;
import com.practice.taskmanager.entity.dto.TaskResponseDto;
import com.practice.taskmanager.service.TaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
@RequiredArgsConstructor
@RequestMapping("/task")
public class StudentController {
    private final TaskService taskService;

    @PostMapping("/create")
    public ResponseEntity<TaskResponseDto> createTask(@RequestBody TaskRequestDto dto){
        taskService.createTask(dto);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> removeTask(@PathVariable Long id){
        taskService.removeTaskById(id);
        return ResponseEntity.ok("task deleted successfully");
    }

    @GetMapping("/getStatus/{title}")
    public ResponseEntity<TaskStatus> getStatus(@PathVariable String title){
        TaskStatus result = taskService.fetchStatus(title);
        return ResponseEntity.ok(result);
    }

    @GetMapping("/getDeadline/{title}")
    public ResponseEntity<LocalDate> getDeadline(@PathVariable String title){
        LocalDate result = taskService.getDeadline(title);
        return ResponseEntity.ok(result);
    }
}
