package com.studentcourse.StudentService.dto;

import lombok.Data;

@Data
public class StudentResponse {
    private Long id;
    private String fullname;
    private String email;
}
