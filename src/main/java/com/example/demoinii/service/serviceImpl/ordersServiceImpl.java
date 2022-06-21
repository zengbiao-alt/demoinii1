package com.example.demoinii.service.serviceImpl;

import com.example.demoinii.mapper.OrderMapper;
import com.example.demoinii.po.Orders;
import com.example.demoinii.po.OrdersPageRequestDto;
import com.example.demoinii.service.ordersService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ordersServiceImpl implements ordersService {
    @Autowired
    private OrderMapper orderMapper;

    @Override
    public int findRegistByPhone(Orders order) {
      return  orderMapper.findRegistByPhone(order);
    }

    @Override
    public int saveOrders(Orders orders) {
        return  orderMapper.saveOrders(orders);
    }

    @Override
    public List<Orders> listOrdersByUserId(Orders orders) {
        return  orderMapper.listOrdersByUserId(orders);
    }

    @Override
    public int removeOrders(Orders orders) {
       return orderMapper.removeOrders(orders);
    }

    @Override
    public Orders getOrdersById(Orders orders) {
        return  orderMapper.getOrdersById(orders);
    }
    @Override
    public OrdersPageRequestDto listOrders(Integer pageNum, Integer pageSize) {
        //开启分页
        PageHelper.startPage(pageNum, pageSize, "orderId");
        //查询所有的数据
        List<Orders> orders = orderMapper.listOrders(null);
        OrdersPageRequestDto ordersPageRequestDto=new OrdersPageRequestDto();
        ordersPageRequestDto.setList(orders);
        return  ordersPageRequestDto;
    }

    @Override
    public int updateOrdersState(Orders orders) {
        return  orderMapper.updateOrdersState(orders);
    }


}
