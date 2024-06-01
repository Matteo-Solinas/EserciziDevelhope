package com.exercise.Unit.Test.services;

import com.exercise.Unit.Test.dtos.UserDTO;
import com.exercise.Unit.Test.entities.UserEntity;
import com.exercise.Unit.Test.mapper.UserMapper;
import com.exercise.Unit.Test.mapper.UserMapperImpl;
import com.exercise.Unit.Test.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    private UserService(UserRepository userRepository, UserMapper userMapper) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }

    public UserDTO createUser(UserDTO userDTO) {
        UserEntity newUser = userMapper.asEntity(userDTO);
        this.userRepository.saveAndFlush(newUser);
        return userMapper.asDTO(newUser);
    }

    public List<UserDTO> getAllUsers() {
        List<UserDTO> users = this.userRepository.findAll().stream().map(userMapper::asDTO).toList();
        if (users.isEmpty()) {
            return new ArrayList<>();
        }
        return users;
    }

    public UserDTO getUserById(Long id) {
        Optional<UserEntity> userFound = this.userRepository.findById(id);
        return userMapper.asDTO(userFound.orElse(null));
    }

    public UserDTO updateUser(Long id, UserDTO userDTO) {
        Optional<UserEntity> userToUpdate = this.userRepository.findById(id);
        if (userToUpdate.isEmpty()) {
            return null;
        } else {
            userToUpdate.get().setFirstName(userDTO.getFirstName());
            userToUpdate.get().setLastname(userDTO.getLastname());
            return userMapper.asDTO(this.userRepository.saveAndFlush(userToUpdate.get()));
        }
    }

    public void deleteUser(Long id) {
        if (!userRepository.existsById(id)) {
            this.userRepository.deleteById(id);
        }
    }

}
