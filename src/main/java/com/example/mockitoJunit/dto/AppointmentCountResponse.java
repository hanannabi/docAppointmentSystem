package com.example.mockitoJunit.dto;

public class AppointmentCountResponse {
    private Long doctorId;
    private String doctorName;
    private String speciality;
    private long appointmentCount;

    public AppointmentCountResponse(Long id, String name, String speciality, long count) {
        this.doctorId=id;
        this.doctorName=name;
        this.speciality=speciality;
        this.appointmentCount=count;
    }

    public Long getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Long doctorId) {
        this.doctorId = doctorId;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public long getAppointmentCount() {
        return appointmentCount;
    }

    public void setAppointmentCount(long appointmentCount) {
        this.appointmentCount = appointmentCount;
    }
}
