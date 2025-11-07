package com.example.mockitoJunit.controller;

import com.example.mockitoJunit.dto.Request;
import com.example.mockitoJunit.dto.Response;
import com.example.mockitoJunit.service.DoctorService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/add")
public class DoctorController {

    @Autowired
    private DoctorService doctorService;

    @PostMapping("/doctor")
    public Response addDoctor(@RequestBody Request request ){
        Response response = doctorService.addDoctor(request);
        return response;
    }

}
