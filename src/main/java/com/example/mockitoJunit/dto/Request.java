package com.example.mockitoJunit.dto;


public class Request {
    private String name;
    private String speciality;

    public String name() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String speciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
}
