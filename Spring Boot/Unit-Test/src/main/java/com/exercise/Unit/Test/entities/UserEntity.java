package com.exercise.Unit.Test.entities;

import com.exercise.Unit.Test.dtos.UserDTO;
import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;

    private String lastname;

    public UserEntity() {
    }

    public UserEntity(Long id, String firstName, String lastname) {
        this.id = id;
        this.firstName = firstName;
        this.lastname = lastname;
    }

    public Long getId() {
        return id;
    }

    public UserEntity setId(Long id) {
        this.id = id;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public UserEntity setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastname() {
        return lastname;
    }

    public UserEntity setLastname(String lastname) {
        this.lastname = lastname;
        return this;
    }

}