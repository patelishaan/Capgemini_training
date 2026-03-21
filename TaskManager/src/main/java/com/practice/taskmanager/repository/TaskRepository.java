package com.practice.taskmanager.repository;

import com.practice.taskmanager.constants.TaskStatus;
import com.practice.taskmanager.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.Optional;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
    void removeTaskById(Long id);
    TaskStatus getStatusByTitle(String title);
    LocalDate getDeadlineByTitle(String title);
    Optional<Task> findByTitle(String title);
    //mark completed and create task to be implemented in the service layer
}
