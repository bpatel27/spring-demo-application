package com.grubhub.demo.mapper;

import com.grubhub.demo.dto.UserDto;
import com.grubhub.demo.model.User;

public class UserMapper {
    public static UserDto getUser(User user){
        return UserDto.builder().id(user.getId()).firstName(user.getFirstName()).lastName(user.getLastName()).build();
    }
}
