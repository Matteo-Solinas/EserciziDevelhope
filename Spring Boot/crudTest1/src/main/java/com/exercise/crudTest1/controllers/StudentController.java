package com.exercise.crudTest1.controllers;

import com.exercise.crudTest1.dtos.StudentChangeStatusDTO;
import com.exercise.crudTest1.dtos.StudentDTO;
import com.exercise.crudTest1.entities.StudentEntity;
import com.exercise.crudTest1.services.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("api/v1/students")
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @PostMapping
    @ResponseBody
    public ResponseEntity<StudentDTO> createStudent(@RequestBody StudentDTO studentDTO) {
        StudentDTO newStudent = this.studentService.createStudent(studentDTO);
        return ResponseEntity.created(URI.create("api/v1/students")).body(newStudent);
    }

    @GetMapping
    @ResponseBody
    public ResponseEntity<List<StudentEntity>> getAllStudents() {
        List<StudentEntity> students = this.studentService.getAllStudents();
        return ResponseEntity.ok().body(students);
    }

    @GetMapping("/{id}")
    @ResponseBody
    public ResponseEntity<StudentEntity> getStudent(@PathVariable Long id) {
        StudentEntity studentFound = this.studentService.getSingleStudent(id);
        return ResponseEntity.ok().body(studentFound);
    }

    @PutMapping("/{id}")
    @ResponseBody
    public ResponseEntity<StudentDTO> updateStudent(@PathVariable Long id, @RequestBody StudentDTO studentDTO) {
        StudentDTO updatedStudent = this.studentService.updateStudent(id, studentDTO);
        return ResponseEntity.ok().body(updatedStudent);
    }

    @PatchMapping("/{id}")
    @ResponseBody
    public ResponseEntity<StudentDTO> updateWorkingStatus(@PathVariable Long id,
                                                          @RequestBody StudentChangeStatusDTO studentChangeStatusDTO) {
        StudentDTO updatedStudent = this.studentService.updateIsWorking(id, studentChangeStatusDTO);
        return ResponseEntity.ok().body(updatedStudent);
    }

    @DeleteMapping("/{id}")
    @ResponseBody
    public ResponseEntity<?> deleteStudent(@PathVariable Long id) {
        this.studentService.deleteStudent(id);
        return ResponseEntity.noContent().build();
    }

}
