package com.exercise.crudTest1.servicesTest;

import com.exercise.crudTest1.dtos.StudentChangeStatusDTO;
import com.exercise.crudTest1.dtos.StudentDTO;
import com.exercise.crudTest1.dtos.StudentMapper;
import com.exercise.crudTest1.entities.StudentEntity;
import com.exercise.crudTest1.repositories.StudentRepository;
import com.exercise.crudTest1.services.StudentService;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;


@SpringBootTest
class StudentServiceTest {

    @Autowired
    private StudentService studentService;

    @MockBean
    private StudentRepository studentRepository;

    @Mock
    private StudentMapper studentMapper;

    @Test
    public void testCreateStudent() {
        StudentDTO studentDTO = new StudentDTO();
        studentDTO.setName("Mario");
        studentDTO.setSurname("Rossi");
        studentDTO.setIsWorking(true);

        StudentEntity student = new StudentEntity();
        student.setId(1L);
        student.setName("Mario");
        student.setSurname("Rossi");
        student.setIsWorking(true);

        StudentEntity studentSaved = new StudentEntity();
        studentSaved.setId(1L);
        studentSaved.setName("Mario");
        studentSaved.setSurname("Rossi");
        studentSaved.setIsWorking(true);

        when(studentMapper.asEntity(studentDTO)).thenReturn(student);
        when(studentRepository.saveAndFlush(any(StudentEntity.class))).thenReturn(studentSaved);
        when(studentMapper.asDTO(studentSaved)).thenReturn(studentDTO);

        StudentDTO newStudent = studentService.createStudent(studentDTO);
        assertEquals("Mario", newStudent.getName());
        assertEquals("Rossi", newStudent.getSurname());
        assertEquals(true, newStudent.getIsWorking());
    }

    @Test
    public void testGetSingleStudent() {
        StudentEntity student = new StudentEntity();
        student.setId(1L);
        student.setName("Mario");
        student.setSurname("Rossi");
        student.setIsWorking(true);

        when(studentRepository.findById(1L)).thenReturn(Optional.of(student));

        StudentEntity studentFound = studentService.getSingleStudent(1L);
        assertEquals(1L, studentFound.getId());
        assertEquals("Mario", studentFound.getName());
        assertEquals("Rossi", studentFound.getSurname());
        assertEquals(true, studentFound.getIsWorking());
    }

    @Test
    public void testUpdateWorkingStatus() {
        StudentEntity student = new StudentEntity();
        student.setId(1L);
        student.setName("Mario");
        student.setSurname("Rossi");
        student.setIsWorking(true);

        StudentChangeStatusDTO studentChangeStatusDTO = new StudentChangeStatusDTO();
        studentChangeStatusDTO.setIsWorking(false);

        when(studentRepository.findById(1L)).thenReturn(Optional.of(student));
        when(studentRepository.saveAndFlush(any(StudentEntity.class))).thenReturn(student);

        StudentDTO studentUpdated = studentService.updateIsWorking(1L, studentChangeStatusDTO);
        assertEquals(false, studentUpdated.getIsWorking());
    }


}