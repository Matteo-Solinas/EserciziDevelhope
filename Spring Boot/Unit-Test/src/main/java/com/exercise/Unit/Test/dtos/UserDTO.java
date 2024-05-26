package com.exercise.Unit.Test.dtos;

import com.exercise.Unit.Test.entities.UserEntity;

public class UserDTO {

    private Long id;

    private String firstName;

    private String lastname;

    public UserDTO() {
    }

    public UserDTO(Long id, String firstName, String lastname) {
        this.id = id;
        this.firstName = firstName;
        this.lastname = lastname;
    }

    public Long getId() {
        return id;
    }

    public UserDTO setId(Long id) {
        this.id = id;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public UserDTO setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastname() {
        return lastname;
    }

    public UserDTO setLastname(String lastname) {
        this.lastname = lastname;
        return this;
    }

}