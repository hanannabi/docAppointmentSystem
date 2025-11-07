package com.example.mockitoJunit.mapper;

import com.example.mockitoJunit.dto.Request;
import com.example.mockitoJunit.dto.Response;
import com.example.mockitoJunit.entity.Doctor;

public class DoctorMapper {
    public static Doctor dtoToEntity(Request request) {
        return new Doctor(request.name(),
                request.speciality());
    }

    public static Response entityToDto(Doctor savedDoctor) {
        return new Response(savedDoctor.id(),
                savedDoctor.name(),
                savedDoctor.speciality());
    }
}
