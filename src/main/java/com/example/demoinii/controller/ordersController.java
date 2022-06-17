package com.example.demoinii.controller;

import com.example.demoinii.common.Result;
import com.example.demoinii.exception.MallExcptionEum;
import com.example.demoinii.po.Orders;
import com.example.demoinii.service.ordersService;
import com.example.demoinii.service.overallResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
@RequestMapping("/orders")
public class ordersController {
    @Autowired
    public ordersService orderservice;
    @PostMapping("/getOrdersByUserId")
    public Result findRegistByPhone(@RequestBody Orders order, HttpSession session)
    {
        int result=orderservice.findRegistByPhone(order);
        if(result==1)
        {
            return Result.error(MallExcptionEum.REGIST_PHONE);
        }
       return Result.success(result);
    }
    @PostMapping("/saveOrders")
    public Result getUsersById(@RequestBody Orders orders)
    {
        int  result=orderservice.saveOrders(orders);
        if(result==1)
        {
            return Result.error(MallExcptionEum.ORDER_EXIST);
        }
        return Result.success(result);
    }
    @PostMapping("/listOrdersByUserId")
    public Result listOrdersByUserId(@RequestBody Orders orders)
    {
        List<Orders> orders1=orderservice.listOrdersByUserId(orders);
        return Result.success(orders1);
    }
    @PostMapping("/removeOrders")
    public Result removeOrders(@RequestBody Orders orders)
    {
        int  result=orderservice.removeOrders(orders);
        return Result.success(result);
    }
    @PostMapping("/getOrdersById")
    public  Result getOrdersById(@RequestBody Orders orders)
    {
        Orders orders1=orderservice.getOrdersById(orders);
        return Result.success(orders1);
    }

}
