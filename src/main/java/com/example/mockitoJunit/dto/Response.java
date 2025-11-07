package com.example.mockitoJunit.dto;

import lombok.Data;

@Data
public class Response {
    private Long id;
    private String name;
    private String speciality;

    public Response(Long id, String name, String speciality) {
        this.id = id;
        this.name = name;
        this.speciality = speciality;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

}
