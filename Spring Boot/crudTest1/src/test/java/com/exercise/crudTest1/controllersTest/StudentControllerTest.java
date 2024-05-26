package com.exercise.crudTest1.controllersTest;

import com.exercise.crudTest1.entities.StudentEntity;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import java.util.List;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@AutoConfigureMockMvc
class StudentControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    @Order(1)
    public void testCreateStudent() throws Exception {
        StudentEntity s = new StudentEntity();
        s.setId(1L);
        s.setName("Matteo");
        s.setSurname("Solinas");
        s.setIsWorking(true);
        String studentJson = objectMapper.writeValueAsString(s);

        this.mockMvc.perform(post("/api/v1/students")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(studentJson)).andDo(print())
                .andExpect(status().isCreated());
    }

    @Test
    @Order(2)
    public void testGetAllStudents() throws Exception {
        MvcResult result = this.mockMvc.perform(get("/api/v1/students"))
                .andDo(print())
                .andExpect(status().isOk())
                .andReturn();
        List<StudentEntity> studentsResponse = objectMapper.readValue(result.getResponse().getContentAsString(), List.class);
        assert (!studentsResponse.isEmpty());
    }

    @Test
    @Order(3)
    public void testGetStudent() throws Exception {
        MvcResult result = this.mockMvc.perform(get("/api/v1/students/" + 1))
                .andDo(print())
                .andExpect(status().isOk())
                .andReturn();
        StudentEntity studentResponse = objectMapper.readValue(result.getResponse().getContentAsString(), StudentEntity.class);
        assert (studentResponse.getName().equals("Matteo"));
    }

    @Test
    @Order(4)
    public void testUpdateStudent() throws Exception {
        StudentEntity updateStudent = new StudentEntity();
        updateStudent.setName("Mario");
        updateStudent.setSurname("Rossi");
        String studentJson = objectMapper.writeValueAsString(updateStudent);
        MvcResult result = this.mockMvc.perform(put("/api/v1/students/" + 1)
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(studentJson))
                .andDo(print())
                .andExpect(status().isOk())
                .andReturn();
        StudentEntity studentResponse = objectMapper.readValue(result.getResponse().getContentAsString(), StudentEntity.class);
        assert (studentResponse.getName().equals("Mario"));
        assert (studentResponse.getSurname().equals("Rossi"));
    }

    @Test
    @Order(5)
    public void testUpdateWorkingStatus() throws Exception {
        StudentEntity updateStudent = new StudentEntity();
        updateStudent.setIsWorking(false);
        String studentJson = objectMapper.writeValueAsString(updateStudent);
        MvcResult result = this.mockMvc.perform(patch("/api/v1/students/" + 1)
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(studentJson))
                .andDo(print())
                .andExpect(status().isOk())
                .andReturn();
        StudentEntity studentResponse = objectMapper.readValue(result.getResponse().getContentAsString(), StudentEntity.class);
        assert (studentResponse.getIsWorking().equals(false));
    }

    @Test
    @Order(6)
    public void testDeleteStudent() throws Exception {
        this.mockMvc.perform(delete("/api/v1/students/" + 1))
                .andDo(print())
                .andExpect(status().isNoContent());
    }
}