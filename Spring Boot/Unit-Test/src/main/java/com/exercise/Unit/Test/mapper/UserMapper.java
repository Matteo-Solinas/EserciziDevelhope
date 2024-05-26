package com.exercise.Unit.Test.mapper;

import com.exercise.Unit.Test.dtos.UserDTO;
import com.exercise.Unit.Test.entities.UserEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserEntity asEntity(UserDTO userDTO);

    UserDTO asDTO(UserEntity userEntity);

}
