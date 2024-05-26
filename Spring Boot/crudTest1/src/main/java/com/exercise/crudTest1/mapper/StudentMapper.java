package com.exercise.crudTest1.mapper;

import com.exercise.crudTest1.dtos.StudentDTO;
import com.exercise.crudTest1.entities.StudentEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface StudentMapper {

    StudentEntity asEntity(StudentDTO studentDTO);

    StudentDTO asDTO(StudentEntity studentEntity);
}
