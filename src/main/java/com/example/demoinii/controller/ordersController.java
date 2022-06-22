package com.example.demoinii.controller;

import com.example.demoinii.common.Result;
import com.example.demoinii.exception.MallExcptionEum;
import com.example.demoinii.po.Orders;
import com.example.demoinii.po.OrdersPageRequestDto;
import com.example.demoinii.service.ordersService;
import io.swagger.annotations.ApiOperation;
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
    /**
     * @description: ：根据电话号码查询是否预约过
     * @author: 曾彪
     * @date:  上午10:42
     * @param: * @param :Orders
     * @return: * @return: Result
     **/
    @ApiOperation("：根据电话号码查询是否预约过")
    @PostMapping("/getOrdersByUserId")
    public Result findRegistByPhone(@RequestBody Orders order, HttpSession session)
    {
        int result=orderservice.findRegistByPhone(order);
       return Result.success(result);
    }
    /**
     * @description: ：添加总检的信息
     * @author: 曾彪
     * @date:  上午10:42
     * @param: * @param :Orders
     * @return: * @return: Result
     **/
    @ApiOperation("：添加总检的信息")
    //添加总检的信息
    @PostMapping("/saveOrders")
    public Result saveOrders(@RequestBody Orders orders)
    {
        int  result=orderservice.saveOrders(orders);
        return Result.success(result);
    }
    /**
     * @description: ：根据用户编号和订单状态查询体检预约列表
     * @author: 曾彪
     * @date:  上午10:42
     * @param: * @param :Orders
     * @return: * @return: Result
     **/
    @ApiOperation("：根据用户编号和订单状态查询体检预约列表")
    @PostMapping("/listOrdersByUserId")
    public Result listOrdersByUserId(@RequestBody Orders orders)
    {
        List<Orders> orders1=orderservice.listOrdersByUserId(orders);
        return Result.success(orders1);
    }

    /**
     * @description: ：根据体检预约编号删除体检预约信息
     * @author: 曾彪
     * @date:  上午10:42
     * @param: * @param :Orders
     * @return: * @return: Result
     **/
    @ApiOperation("：根据体检预约编号删除体检预约信息")
    @PostMapping("/removeOrders")
    public Result removeOrders(@RequestBody Orders orders)
    {
        int  result=orderservice.removeOrders(orders);
        return Result.success(result);
    }

    /**
     * @description: ：根据体检预约编号查询体检预约信息
     * @author: 曾彪
     * @date:  上午10:42
     * @param: * @param :Orders
     * @return: * @return: Result
     **/
    @ApiOperation("：根据体检预约编号查询体检预约信息")
    @PostMapping("/getOrdersById")
    public  Result getOrdersById(@RequestBody Orders orders)
    {
        Orders orders1=orderservice.getOrdersById(orders);
        return Result.success(orders1);
    }

    /**
     * @description: ：根据体检预约编号更新状态
     * @author: 曾彪
     * @date:  上午10:42
     * @param: * @param :Orders
     * @return: * @return: Result
     **/
    @ApiOperation("：根据体检预约编号更新状态")
    //根据体检预约编号更新状态
    @PostMapping("updateOrdersState")
    public Result updateOrdersState(@RequestBody Orders orders)
    {
        int status=orderservice.updateOrdersState(orders);
        return Result.success(status);
    }

    /**
     * @description: ：根据体检预约编号更新状态
     * @author: 曾彪
     * @date:  上午10:42
     * @param: * @param :OrdersPageRequestDto
     * @return: * @return: Result
     **/
    @ApiOperation("：根据体检预约编号更新状态")
    @PostMapping("listOrders")
    public Result listOrders(@RequestBody OrdersPageRequestDto ordersPageRequestDto)
    {
        OrdersPageRequestDto ordersPageRequestDto1=orderservice.listOrders(ordersPageRequestDto.getPageNum(),ordersPageRequestDto.getPageSize());
        return  Result.success(ordersPageRequestDto1);
    }

}
