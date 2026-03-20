package com.capgemini.repository;

import com.capgemini.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    Student findStudentByid(Long Id);
    List<Student> findStudentsByCourses(String course);

}
