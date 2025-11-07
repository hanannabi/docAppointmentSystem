package com.example.mockitoJunit.mapper;

import com.example.mockitoJunit.dto.UserRequest;
import com.example.mockitoJunit.dto.UserResponse;
import com.example.mockitoJunit.entity.AppUser;

public class UserMapper {
    public static AppUser toEntity(UserRequest request) {
        return new AppUser(request.name(),
                request.phone());
    }

    public static UserResponse toDto(AppUser appUser) {
        return new UserResponse(appUser.getId(),
                appUser.getName(),
                appUser.getPhone());
    }


}
