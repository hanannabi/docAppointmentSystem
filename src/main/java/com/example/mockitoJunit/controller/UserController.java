package com.example.mockitoJunit.controller;

import com.example.mockitoJunit.dto.UserRequest;
import com.example.mockitoJunit.dto.UserResponse;
import com.example.mockitoJunit.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/add")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/users")
    public UserResponse addUser(@RequestBody UserRequest request){
        UserResponse userResponse = userService.addUser(request);
        return userResponse;
    }

}
