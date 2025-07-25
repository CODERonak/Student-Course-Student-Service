package com.studentcourse.StudentService.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "students")
public class Student {
    private Long id;
    private String fullname;
    private String email;
}