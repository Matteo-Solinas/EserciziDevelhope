package com.exercise.crudTest1.dtos;

import com.exercise.crudTest1.entities.StudentEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface StudentMapper {

    StudentEntity asEntity(StudentDTO studentDTO);

    StudentDTO asDTO(StudentEntity studentEntity);
}
