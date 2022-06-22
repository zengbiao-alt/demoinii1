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
/**
 * @description: 根据医院转态查询出医院的列表
 * @author: 朝乐格尔
 * @date:  上午15:00
 * @param: * @hospital对象:
 * @return: * @result
 **/
@RestController
@RequestMapping("/hospital")
public class hospitalController {
    @Autowired
    public hospitalService hospitalservice;

    @PostMapping("listHospital")
    public Result listHospital(@RequestBody  Hospital hospital)
    {
        Hospital hospital1=hospitalservice.listHospital(hospital);
        return Result.success(hospital1);
    }

    /**
     * @description: 根据已存在的医院信息进行更新
     * @author: 朝乐格尔
     * @date:  上午15:00
     * @param: * @hospital对象:
     * @return: * @result
     **/
    @PostMapping("/updateOrdersState")
    public Result updateOrdersState(@RequestBody Hospital hospital)
    {
        int result=hospitalservice.updateOrdersState(hospital);
        return Result.success(result);
    }
    /**
     * @description: 根据医院编号查询医院信息
     * @author: 朝乐格尔
     * @date:  上午15:00
     * @param: * @hospital对象:
     * @return: * @result
     **/
    @PostMapping("/getHospitalById")
    public Result getHospitalById(@RequestBody Hospital hospital)
    {
        Hospital hospital1=hospitalservice.getHospitalById(hospital);
        return Result.success(hospital1);
        
    }

}