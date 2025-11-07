package com.example.mockitoJunit.mapper;

import com.example.mockitoJunit.dto.AppointmentRequest;
import com.example.mockitoJunit.dto.AppointmentResponse;
import com.example.mockitoJunit.entity.Appointment;

public class AppointmentMapper {
    public static Appointment toEntity(AppointmentRequest request) {
        return new Appointment(request.appointmentTime(),
                request.patientId(),
                request.doctorId());
    }

    public static AppointmentResponse toDto(Appointment savedAppointment) {
        return new AppointmentResponse(savedAppointment.getDoctor(),
                savedAppointment.getLocalDateTime(),
                savedAppointment.getId(),
                savedAppointment.getUser());
    }
}
