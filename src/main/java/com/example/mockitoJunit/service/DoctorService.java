package com.example.mockitoJunit.service;

import com.example.mockitoJunit.dto.AppointmentCountResponse;
import com.example.mockitoJunit.dto.DoctorCountRequest;
import com.example.mockitoJunit.dto.Request;
import com.example.mockitoJunit.dto.Response;
import com.example.mockitoJunit.entity.Doctor;
import com.example.mockitoJunit.mapper.DoctorMapper;
import com.example.mockitoJunit.repository.AppointmentRepository;
import com.example.mockitoJunit.repository.DoctorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DoctorService {

    @Autowired
    private DoctorRepository doctorRepository;

    @Autowired
    private AppointmentRepository appointmentRepository;

    public Response addDoctor(Request request) {
      if (doctorRepository.findByName(request.name()).isPresent()){
       throw new RuntimeException("Doctor already exists");
      }
        Doctor doctor = DoctorMapper.dtoToEntity(request);
        Doctor savedDoctor = doctorRepository.save(doctor);
        Response response = DoctorMapper.entityToDto(savedDoctor);
        return response;
    }

    public AppointmentCountResponse countAppointments(DoctorCountRequest doctorCountRequest) {
        Doctor doctor = doctorRepository.findById(doctorCountRequest.getDoctorId())
                .orElseThrow(() -> new RuntimeException("Doctor not found"));

        long count = appointmentRepository.countByDoctorId(doctorCountRequest.getDoctorId());

        return new AppointmentCountResponse(doctor.id(),
                doctor.name(),
                doctor.speciality(),
                count);
    }
}
