package com.example.mockitoJunit.dto;

public class DoctorCountRequest {
    private Long doctorId;
    private Integer count;

    public Long getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Long doctorId) {
        this.doctorId = doctorId;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}
