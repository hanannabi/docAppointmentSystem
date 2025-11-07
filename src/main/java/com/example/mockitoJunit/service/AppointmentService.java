package com.example.mockitoJunit.service;

import com.example.mockitoJunit.dto.AppointmentRequest;
import com.example.mockitoJunit.dto.AppointmentResponse;
import com.example.mockitoJunit.entity.AppUser;
import com.example.mockitoJunit.entity.Appointment;
import com.example.mockitoJunit.entity.Doctor;
import com.example.mockitoJunit.mapper.AppointmentMapper;
import com.example.mockitoJunit.repository.AppointmentRepository;
import com.example.mockitoJunit.repository.DoctorRepository;
import com.example.mockitoJunit.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AppointmentService {

    @Autowired
    private AppointmentRepository appointmentRepository;

    @Autowired
    private DoctorRepository doctorRepository;

    @Autowired
    private UserRepository userRepository;

    public AppointmentResponse makeAppointment(AppointmentRequest request) {
        Appointment entity = AppointmentMapper.toEntity(request);
        Doctor doctor = doctorRepository.findById(request.doctorId())
                .orElseThrow(() -> new RuntimeException("Doctor not found with id" + request.doctorId()));
        AppUser appUser = userRepository.findById(request.patientId())
                .orElseThrow(() -> new RuntimeException("Patient Not found with id" + request.patientId()));
        Appointment appointment = new Appointment();
        appointment.setDoctor(doctor);
        appointment.setUser(appUser);
        appointment.setLocalDateTime(request.appointmentTime());
        Appointment savedAppointment = appointmentRepository.save(appointment);
        AppointmentResponse dto = AppointmentMapper.toDto(savedAppointment);
        return dto;

    }
}
