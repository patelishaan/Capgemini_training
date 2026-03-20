package com.capgemini.service;

import com.capgemini.entity.dto.StudentRequestDto;
import com.capgemini.entity.dto.StudentResponseDto;

import java.util.List;

public interface StudentService {
    void enrollStudent(StudentRequestDto dto);//will return the id of the new student
    StudentResponseDto getStudentById(Long id);
    List<StudentResponseDto> getStudentsByCourse(String course);
}
