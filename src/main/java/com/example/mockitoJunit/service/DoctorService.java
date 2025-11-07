package com.example.mockitoJunit.service;

import com.example.mockitoJunit.dto.Request;
import com.example.mockitoJunit.dto.Response;
import com.example.mockitoJunit.entity.Doctor;
import com.example.mockitoJunit.mapper.DoctorMapper;
import com.example.mockitoJunit.repository.DoctorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DoctorService {

    @Autowired
    private DoctorRepository doctorRepository;

    public Response addDoctor(Request request) {
      if (doctorRepository.findByName(request.name()).isPresent()){
       throw new RuntimeException("Doctor already exists");
      }
        Doctor doctor = DoctorMapper.dtoToEntity(request);
        Doctor savedDoctor = doctorRepository.save(doctor);
        Response response = DoctorMapper.entityToDto(savedDoctor);
        return response;
    }
}
