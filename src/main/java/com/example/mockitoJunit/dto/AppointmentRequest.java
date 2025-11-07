package com.example.mockitoJunit.dto;

import java.time.LocalDateTime;

public class AppointmentRequest {
    private Long doctorId;
    private Long patientId;
    private LocalDateTime appointmentTime;

    public Long doctorId() {
        return doctorId;
    }

    public void setDoctorId(Long doctorId) {
        this.doctorId = doctorId;
    }

    public Long patientId() {
        return patientId;
    }

    public void setPatientId(Long patientId) {
        this.patientId = patientId;
    }

    public LocalDateTime appointmentTime() {
        return appointmentTime;
    }

    public void setAppointmentTime(LocalDateTime appointmentTime) {
        this.appointmentTime = appointmentTime;
    }
}
