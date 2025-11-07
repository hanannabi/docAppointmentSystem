package com.example.mockitoJunit.service;

import com.example.mockitoJunit.dto.UserRequest;
import com.example.mockitoJunit.dto.UserResponse;
import com.example.mockitoJunit.entity.AppUser;
import com.example.mockitoJunit.mapper.UserMapper;
import com.example.mockitoJunit.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository  userRepository;

    public UserResponse addUser(UserRequest request) {
        AppUser appUser = UserMapper.toEntity(request);
        AppUser savedUser = userRepository.save(appUser);
        UserResponse dto = UserMapper.toDto(savedUser);
        return dto;
    }
}
