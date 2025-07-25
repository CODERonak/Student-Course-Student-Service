package com.studentcourse.StudentService;

import java.util.List;

import org.springframework.stereotype.Service;

import com.studentcourse.StudentService.dto.StudentRequest;
import com.studentcourse.StudentService.dto.StudentResponse;
import com.studentcourse.StudentService.mappers.StudentMapper;
import com.studentcourse.StudentService.model.Student;
import com.studentcourse.StudentService.repository.StudentRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class StudentService {
    private final StudentRepository studentRepository;
    private final StudentMapper mapper;

    public StudentResponse addStudent(StudentRequest request) {
        Student student = mapper.toEntity(request);
        Student savedStudent = studentRepository.save(student);

        return mapper.toResponseDto(savedStudent);
    }

    public List<StudentResponse> getAllStudents() {
        List<Student> students = studentRepository.findAll();
        return students.stream().map(mapper::toResponseDto).toList();
    }
}