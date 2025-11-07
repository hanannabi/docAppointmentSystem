package com.example.mockitoJunit.dto;

import com.example.mockitoJunit.entity.AppUser;
import com.example.mockitoJunit.entity.Doctor;

import java.time.LocalDateTime;

public class AppointmentResponse {
    private Long appointmentId;
    private String doctorName;
    private String doctorSpeciality;
    private String patientName;
    private String patientPhone;
    private LocalDateTime appointmentTime;

    public AppointmentResponse(Doctor doctor, LocalDateTime localDateTime, Long id, AppUser user) {
        this.doctorName = doctor.name();
        this.appointmentTime=localDateTime;
        this.appointmentId=id;
        this.patientName= user.getName();

    }


    public Long getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(Long appointmentId) {
        this.appointmentId = appointmentId;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getDoctorSpeciality() {
        return doctorSpeciality;
    }

    public void setDoctorSpeciality(String doctorSpeciality) {
        this.doctorSpeciality = doctorSpeciality;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getPatientPhone() {
        return patientPhone;
    }

    public void setPatientPhone(String patientPhone) {
        this.patientPhone = patientPhone;
    }

    public LocalDateTime getAppointmentTime() {
        return appointmentTime;
    }

    public void setAppointmentTime(LocalDateTime appointmentTime) {
        this.appointmentTime = appointmentTime;
    }
}
