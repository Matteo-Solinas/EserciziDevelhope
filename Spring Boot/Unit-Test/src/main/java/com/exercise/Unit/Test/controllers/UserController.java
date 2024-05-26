package com.exercise.Unit.Test.controllers;

import com.exercise.Unit.Test.dtos.UserDTO;
import com.exercise.Unit.Test.entities.UserEntity;
import com.exercise.Unit.Test.services.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    @ResponseBody
    public ResponseEntity<UserDTO> createUser(@RequestBody UserDTO userDTO) {
        UserDTO newUser = this.userService.createUser(userDTO);
        return new ResponseEntity<>(newUser, HttpStatus.CREATED);
    }

    @GetMapping
    @ResponseBody
    public ResponseEntity<List<UserEntity>> getAllUsers() {
        List<UserEntity> users = this.userService.getAllUsers();
        return ResponseEntity.ok().body(users);
    }

    @GetMapping("/{id}")
    @ResponseBody
    public ResponseEntity<UserEntity> getUserById(@PathVariable Long id) {
        UserEntity userFound = this.userService.getUserById(id);
        return ResponseEntity.ok().body(userFound);
    }

    @PutMapping("/{id}")
    @ResponseBody
    public ResponseEntity<UserDTO> updateUser(@PathVariable Long id, @RequestBody UserDTO userDTO) {
        UserDTO updatedUser = this.userService.updateUser(id, userDTO);
        return ResponseEntity.ok().body(updatedUser);
    }

    @DeleteMapping("/{id}")
    @ResponseBody
    public ResponseEntity deleteUser(@PathVariable Long id) {
        this.userService.deleteUser(id);
        return ResponseEntity.noContent().build();
    }

}
