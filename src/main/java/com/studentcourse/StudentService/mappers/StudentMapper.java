package com.studentcourse.StudentService.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.studentcourse.StudentService.dto.StudentRequest;
import com.studentcourse.StudentService.dto.StudentResponse;
import com.studentcourse.StudentService.model.Student;

@Mapper(componentModel = "spring")

public interface StudentMapper {

   @Mapping(target = "id", ignore = true)
   Student toEntity(StudentRequest studentRequest);

   StudentResponse toResponseDto(Student student);
}