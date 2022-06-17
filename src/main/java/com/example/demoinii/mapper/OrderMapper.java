package com.example.demoinii.mapper;
import com.example.demoinii.po.Orders;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderMapper {
    public int findRegistByPhone(Orders order);
    public  int saveOrders(Orders orders);
    public List<Orders> listOrdersByUserId(Orders orders);
    public int  removeOrders(Orders orders);
    public  Orders getOrdersById(Orders orders);
}
