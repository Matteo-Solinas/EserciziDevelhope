package com.exercise.Unit.Test;

import com.exercise.Unit.Test.dtos.UserDTO;
import com.exercise.Unit.Test.entities.UserEntity;
import com.exercise.Unit.Test.mapper.UserMapper;
import com.exercise.Unit.Test.repositories.UserRepository;
import com.exercise.Unit.Test.services.UserService;
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
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @MockBean
    private UserRepository userRepository;

    @Mock
    private UserMapper userMapper;

    @Test
    public void testCreateUser() {
        UserDTO userDTO = new UserDTO();
        userDTO.setId(1L);
        userDTO.setFirstName("Mario");
        userDTO.setLastname("Rossi");

        UserEntity user = new UserEntity();
        user.setId(1L);
        user.setFirstName("Mario");
        user.setLastname("Rossi");

        UserEntity userSaved = new UserEntity();
        userSaved.setId(1L);
        userSaved.setFirstName("Mario");
        userSaved.setLastname("Rossi");

        when(userMapper.asEntity(userDTO)).thenReturn(user);
        when(userRepository.saveAndFlush(any(UserEntity.class))).thenReturn(userSaved);
        when(userMapper.asDTO(userSaved)).thenReturn(userDTO);

        UserDTO newUser = userService.createUser(userDTO);
        assertEquals("Mario", newUser.getFirstName());
        assertEquals("Rossi", newUser.getLastname());
    }

    @Test
    public void testGetUserById() {
        UserEntity user = new UserEntity();
        user.setId(1L);
        user.setFirstName("Mario");
        user.setLastname("Rossi");

        when(userRepository.findById(1L)).thenReturn(Optional.of(user));

        UserEntity userFound = userService.getUserById(1L);
        assertEquals(1L, userFound.getId());
        assertEquals("Mario", userFound.getFirstName());
        assertEquals("Rossi", userFound.getLastname());
    }

    @Test
    public void testUpdateUser() {
        UserEntity user = new UserEntity();
        user.setId(1L);
        user.setFirstName("Mario");
        user.setLastname("Rossi");

        UserDTO userDTO = new UserDTO();
        userDTO.setId(1L);
        userDTO.setFirstName("Mario");
        userDTO.setLastname("Rossi");

        when(userRepository.findById(1L)).thenReturn(Optional.of(user));
        when(userRepository.saveAndFlush(any(UserEntity.class))).thenReturn(user);

        UserDTO userUpdated = userService.updateUser(1L, userDTO);
        assertEquals(1L, userUpdated.getId());
        assertEquals("Mario", userUpdated.getFirstName());
        assertEquals("Rossi", userUpdated.getLastname());
    }
}
