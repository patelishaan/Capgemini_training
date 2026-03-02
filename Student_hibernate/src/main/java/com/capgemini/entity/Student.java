package com.capgemini.entity;
import jakarta.persistence.*;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)


    private int id;
    private String name;
    private String dept;
    private int age;
    private double marks;
    public Student(String name, String dept, int age, double marks) {
        this.name = name;
        this.dept = dept;
        this.age = age;
        this.marks = marks;
        }


    public Student() {

    }
}
