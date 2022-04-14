package com.grubhub.demo.mapper;

import com.grubhub.demo.dto.UserDto;
import com.grubhub.demo.model.User;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class UserMapperTest {

    @Test
    public void getUser(){
        User user = new User(1, "firstName", "lastName", "password");
        UserDto userDto = UserMapper.getUser(user);

        assertEquals(1, userDto.getId());
        assertEquals("firstName", userDto.getFirstName());
        assertEquals("lastName", userDto.getLastName());
    }
}
