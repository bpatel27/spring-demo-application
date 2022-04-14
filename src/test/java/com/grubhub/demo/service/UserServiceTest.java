package com.grubhub.demo.service;

import com.grubhub.demo.dto.UserDto;
import com.grubhub.demo.model.User;
import com.grubhub.demo.repository.UserRepository;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;
import org.mockito.junit.jupiter.MockitoExtension;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import java.util.List;

@ExtendWith(MockitoExtension.class)
public class UserServiceTest {

    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private UserService userService;

    @Test
    public void getAllUsers(){
        User user1 = new User(1, "firstName1", "lastName1", "password");
        User user2 = new User(1, "firstName2", "lastName2", "password");
        when(userRepository.findAll()).thenReturn(List.of(user1, user2));

        List<UserDto> userDtos = userService.getAllUsers();
        assertEquals(2, userDtos.size());
        assertEquals("firstName1", userDtos.get(0).getFirstName());
        assertEquals("firstName2", userDtos.get(1).getFirstName());
    }
}
