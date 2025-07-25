package com.studentcourse.StudentService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.studentcourse.StudentService.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}