package com.example.mockitoJunit.controller;

import com.example.mockitoJunit.dto.AppointmentRequest;
import com.example.mockitoJunit.dto.AppointmentResponse;
import com.example.mockitoJunit.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("book")
public class AppointmentController {

    @Autowired
    private AppointmentService appointmentService;

    @PostMapping("/appointment")
    public AppointmentResponse makeAppointment(@RequestBody AppointmentRequest request) {
        AppointmentResponse appointmentResponse = appointmentService.makeAppointment(request);
        return appointmentResponse;
    }
}
