package com.example.mockitoJunit.dto;

public class UserRequest {

    private String name;
    private String phone;

    public String name() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String phone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
