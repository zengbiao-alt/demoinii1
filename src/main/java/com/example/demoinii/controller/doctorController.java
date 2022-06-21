package com.example.demoinii.controller;

import com.example.demoinii.common.Result;
import com.example.demoinii.po.Doctor;
import com.example.demoinii.service.doctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/doctor")
public class doctorController {
    @Autowired
    private doctorService doctorservices;
    @PostMapping("/getDoctorByCodeByPass")
    public Result getDoctorByCodeByPass(@RequestBody  Doctor doctor){
        Doctor doctor1=doctorservices.getDoctorByCodeByPass(doctor);
        return  Result.success(doctor1);
    }
}
