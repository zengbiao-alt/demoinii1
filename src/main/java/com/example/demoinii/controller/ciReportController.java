package com.example.demoinii.controller;

import com.example.demoinii.common.Result;
import com.example.demoinii.po.Cireport;
import com.example.demoinii.po.Hospital;
import com.example.demoinii.po.Orders;
import com.example.demoinii.service.ciRporService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ciReport")
public class ciReportController {
@Autowired
    private ciRporService ciRporservice;
    @PostMapping("/listCiReport")
    public Result listCiReport(@RequestBody Cireport cireport)
    {
       List<Cireport>cireports =ciRporservice.listCiReport(cireport);
        return Result.success(cireports);
    }
    //根据预约订单信息创建体检报告模板
    @PostMapping("createReportTemplate")
    public Result createReportTemplate(@RequestBody Orders order)
    {
        int status=ciRporservice.createReportTemplate(order);
        return Result.success(status);
    }


}
