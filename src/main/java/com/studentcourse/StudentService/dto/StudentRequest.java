package com.studentcourse.StudentService.dto;

import java.time.LocalDate;

import lombok.Data;

@Data
public class StudentRequest {
    private String fullname;
    private Integer age;
    private LocalDate dateOfBirth;
    private String email;
}
