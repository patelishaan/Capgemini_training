package com.capgemini.entity.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentRequestDto {
    //private Long id;
    private String name;
    private List<String> courses;
}
