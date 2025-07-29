package com.studentcourse.StudentService.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.studentcourse.StudentService.StudentService;
import com.studentcourse.StudentService.dto.StudentRequest;
import com.studentcourse.StudentService.dto.StudentResponse;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("api/students")
@AllArgsConstructor
public class StudentController {
    private final StudentService service;

    @PostMapping
    public ResponseEntity<StudentResponse> addStudent(@RequestBody StudentRequest request) {
        StudentResponse response = service.addStudent(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @GetMapping("/{id}")
    public ResponseEntity<StudentResponse> getStudentById(@PathVariable Long id) {
        StudentResponse response = service.getStudentById(id);
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }

    @GetMapping
    public ResponseEntity<List<StudentResponse>> getAllStudents() {
        List<StudentResponse> response = service.getAllStudents();
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }
}