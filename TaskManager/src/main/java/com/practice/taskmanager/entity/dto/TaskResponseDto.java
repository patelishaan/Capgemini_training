package com.practice.taskmanager.entity.dto;

import com.practice.taskmanager.constants.TaskStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TaskResponseDto {
    private String title;
    private TaskStatus status;
    private LocalDate deadline;
    //private Long id;
}
