package com.example.demoinii.service.serviceImpl;

import com.example.demoinii.mapper.OrderMapper;
import com.example.demoinii.po.Orders;
import com.example.demoinii.service.ordersService;
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

}
