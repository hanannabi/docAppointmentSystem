package com.example.mockitoJunit.repository;

import com.example.mockitoJunit.entity.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
    @Query("SELECT COUNT(a) FROM Appointment a WHERE a.doctor.id = :doctorId")
    long countByDoctorId(Long doctorId);
}
