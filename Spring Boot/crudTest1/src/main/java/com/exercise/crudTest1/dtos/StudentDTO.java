package com.exercise.crudTest1.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentDTO {

    private String name;

    private String surname;

    private Boolean isWorking;

}
