package com.grubhub.demo.service;

import com.grubhub.demo.mapper.UserMapper;
import com.grubhub.demo.dto.UserDto;
import com.grubhub.demo.model.User;
import com.grubhub.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<UserDto> getAllUsers(){
        return userRepository.findAll().stream()
                .map(UserMapper::getUser)
                .collect(Collectors.toList());
    }

    public UserDto createUser(User user){
        return UserMapper.getUser(userRepository.save(user));
    }

    public UserDto getUserById(long userId){
        return UserMapper.getUser(userRepository.findById(userId).get());
    }
}
