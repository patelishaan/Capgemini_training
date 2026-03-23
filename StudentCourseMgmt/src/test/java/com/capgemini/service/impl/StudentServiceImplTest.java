package com.capgemini.service.impl;

import com.capgemini.entity.Student;
import com.capgemini.entity.dto.StudentRequestDto;
import com.capgemini.entity.dto.StudentResponseDto;
import com.capgemini.repository.StudentRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.modelmapper.ModelMapper;

import java.util.List;
import static org.mockito.ArgumentMatchers.any;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class StudentServiceImplTest {

    @Mock
    private StudentRepository studentRepository;

    @Mock
    private ModelMapper modelMapper;

    @InjectMocks
    private StudentServiceImpl studentService;

    @Test
    void testgetStudentById(){
        Student student = new Student();
        student.setId(3L);
        student.setName("Ishaan");

        when(studentRepository.findStudentByid(3L))
                .thenReturn(student);
        StudentResponseDto responseDto = new StudentResponseDto();
        responseDto.setId(3L);
        responseDto.setName("Ishaan");

        when(modelMapper.map(student, StudentResponseDto.class)).thenReturn(responseDto);

        StudentResponseDto result = studentService.getStudentById(3L);
        assertEquals("Ishaan",result.getName());
    }

    @Test
    void testenrollStudent(){
        //arrange fake data -> student request dto
        StudentRequestDto studentRequestDto = new StudentRequestDto();
        studentRequestDto.setName("Chaintanya");
        studentRequestDto.setCourses(List.of("Maths","Physics","Chemistry"));
        //calling service
        studentService.enrollStudent(studentRequestDto);
        //verify (not assertEquals) because enrollStudent does not return anything
        verify(studentRepository, times(1)).save(any(Student.class));
    }

}
