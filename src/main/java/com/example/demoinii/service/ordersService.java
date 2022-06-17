package com.example.demoinii.service;

import com.example.demoinii.po.Orders;

import java.util.List;

public interface ordersService {
    int findRegistByPhone(Orders order);
    int  saveOrders(Orders orders);
    List<Orders> listOrdersByUserId(Orders orders);
    public int  removeOrders(Orders orders);
    public Orders getOrdersById(Orders orders);
}
