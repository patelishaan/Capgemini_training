package com.capgemini.controller;

import com.capgemini.entity.dto.StudentRequestDto;
import com.capgemini.entity.dto.StudentResponseDto;
import com.capgemini.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
@RequestMapping("/student")
public class StudentController {
    private final StudentService studentService;

    @PostMapping("/enroll")
    public ResponseEntity<StudentResponseDto> enrollStudent(@RequestBody StudentRequestDto studentRequestDto){
        studentService.enrollStudent(studentRequestDto);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/byid/{id}")
    public ResponseEntity<StudentResponseDto> getStudentById(@PathVariable Long id){
        return ResponseEntity.ok(studentService.getStudentById(id));
    }

    @GetMapping("/bycourse/{course}")
    public ResponseEntity<List<StudentResponseDto>> getStudentsByCourse(@PathVariable String course){
        List<StudentResponseDto> results = studentService.getStudentsByCourse(course).stream()
                .map(s->{
                    StudentResponseDto dto = new StudentResponseDto();
                    dto.setId(s.getId());
                    dto.setName(s.getName());
                    return dto;

                })
                .collect(Collectors.toList());
        return ResponseEntity.ok(results);
    }
}
