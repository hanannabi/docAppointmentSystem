package com.example.mockitoJunit.entity;

import jakarta.persistence.*;

import javax.print.Doc;
import java.util.List;

@Entity
@Table(name = "doctor")
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "speciality")
    private String speciality;

    @Column(name = "appointments")
    @OneToMany(mappedBy = "doctor")
    private List<Appointment> appointments;

    public Doctor(String name, String speciality) {
        this.name = name;
        this.speciality = speciality;
    }

    public Doctor(){}

    public Long id() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String name() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String speciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public List<Appointment> appointments() {
        return appointments;
    }

    public void setAppointments(List<Appointment> appointments) {
        this.appointments = appointments;
    }
}
