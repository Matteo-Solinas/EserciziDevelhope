package com.exercise.crudTest1.services;

import com.exercise.crudTest1.dtos.StudentChangeStatusDTO;
import com.exercise.crudTest1.dtos.StudentDTO;
import com.exercise.crudTest1.mapper.StudentMapper;
import com.exercise.crudTest1.entities.StudentEntity;
import com.exercise.crudTest1.exceptions.StudentNotFoundException;
import com.exercise.crudTest1.repositories.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository studentRepository;
    private final StudentMapper studentMapper;

    public StudentDTO createStudent(StudentDTO studentDTO) {
        StudentEntity newStudent = studentMapper.asEntity(studentDTO);
        this.studentRepository.saveAndFlush(newStudent);
        return studentMapper.asDTO(newStudent);
    }

    public List<StudentDTO> getAllStudents() {
        List<StudentDTO> students = this.studentRepository.findAll().stream().map(studentMapper::asDTO).toList();
        if (students.isEmpty()) {
            throw new StudentNotFoundException();
        } else {
            return students;
        }
    }

    public StudentDTO getSingleStudent(Long id) {
        Optional<StudentEntity> studentFound = this.studentRepository.findById(id);
        if (studentFound.isEmpty()) {
            throw new StudentNotFoundException();
        } else {
            return studentMapper.asDTO(studentFound.get());
        }

    }

    public StudentDTO updateStudent(Long id, StudentDTO studentDTO) {
        Optional<StudentEntity> studentToUpdate = this.studentRepository.findById(id);
        if (studentToUpdate.isEmpty()) {
            throw new StudentNotFoundException();
        } else {
            studentToUpdate.get().setName(studentDTO.getName());
            studentToUpdate.get().setSurname(studentDTO.getSurname());
            return studentMapper.asDTO(this.studentRepository.saveAndFlush(studentToUpdate.get()));
        }
    }

    public StudentDTO updateIsWorking(Long id, StudentChangeStatusDTO studentChangeStatusDTO) {
        Optional<StudentEntity> studentToUpdate = this.studentRepository.findById(id);
        if (studentToUpdate.isEmpty()) {
            throw new StudentNotFoundException();
        } else {
            studentToUpdate.get().setIsWorking(studentChangeStatusDTO.getIsWorking());
            return studentMapper.asDTO(this.studentRepository.saveAndFlush(studentToUpdate.get()));
        }
    }

    public void deleteStudent(Long id) {
        if (!studentRepository.existsById(id)) {
            throw new StudentNotFoundException();
        } else {
            this.studentRepository.deleteById(id);
        }
    }

}
