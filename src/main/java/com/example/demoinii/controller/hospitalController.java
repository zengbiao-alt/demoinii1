package com.example.demoinii.controller;

import com.example.demoinii.common.Result;
import com.example.demoinii.po.Hospital;
import com.example.demoinii.service.hospitalService;
import com.example.demoinii.service.ordersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hospital")
public class hospitalController {
    @Autowired
    public hospitalService hospitalservice;
    @PostMapping("/listHospital")
    public Result listHospital(@RequestBody  Hospital hospital)
    {
        Hospital hospital1=hospitalservice.listHospital(hospital);
        return Result.success(hospital1);
    }
    @PostMapping("/updateOrdersState")
    public Result updateOrdersState(@RequestBody Hospital hospital)
    {
        int result=hospitalservice.updateOrdersState(hospital);
        return Result.success(result);
    }


}
