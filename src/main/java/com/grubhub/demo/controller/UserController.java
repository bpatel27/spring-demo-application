package com.grubhub.demo.controller;

import com.grubhub.demo.dto.UserDto;
import com.grubhub.demo.model.User;
import com.grubhub.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<UserDto> getAllUsers(){
        return userService.getAllUsers();
    }

    @GetMapping("{userId}")
    public UserDto getUserById(@PathVariable("userId") Long userId){
        return userService.getUserById(userId);
    }

    @PostMapping
    public UserDto createUser(@RequestBody User user){
        return userService.createUser(user);
    }
}
