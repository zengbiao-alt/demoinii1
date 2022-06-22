package com.example.demoinii.controller;

import com.example.demoinii.common.Result;
import com.example.demoinii.po.Doctor;
import com.example.demoinii.service.doctorService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * @description: 根据医生编码和密码进行登录
 * @author: 谭雄雯
 * @param:  doctor:
 * @return:  Result
 **/
@RestController
@RequestMapping("/doctor")
public class doctorController {
    @Autowired
    private doctorService doctorservices;

    @PostMapping("/getDoctorByCodeByPass")
    @ApiOperation("根据医生编码和密码进行登录")
    public Result getDoctorByCodeByPass(@RequestBody Doctor doctor) {
        Doctor doctor1 = doctorservices.getDoctorByCodeByPass(doctor);
        return Result.success(doctor1);
    }
}