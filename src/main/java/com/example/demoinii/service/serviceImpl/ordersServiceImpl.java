package com.example.demoinii.service.serviceImpl;

import com.example.demoinii.common.Result;
import com.example.demoinii.exception.MallExcetion;
import com.example.demoinii.exception.MallExcptionEum;
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
     int result= orderMapper.findRegistByPhone(order);
        if(result==1)
        {
            throw new MallExcetion(MallExcptionEum.REGIST_PHONE);
        }
        return result;
    }

    @Override
    public int saveOrders(Orders orders) {
        //首先首先判断添加的信息是是否已经存在
       Orders orders1= orderMapper.getOrdersById(orders);
       if(orders1!=null)
       {
           throw new MallExcetion(MallExcptionEum.ORDER_EXIST);
       }
       else {
           int result = orderMapper.saveOrders(orders);
           if (result == 1) {
               throw new MallExcetion(MallExcptionEum.ORDER_SAVE_FAIL);
           }
           return result;
       }
    }

    @Override
    public List<Orders> listOrdersByUserId(Orders orders) {
        return  orderMapper.listOrdersByUserId(orders);
    }

    @Override
    public int removeOrders(Orders orders) {
        //首先判断该订单是否存在
        int status=orderMapper.removeOrders(orders);
        if(status==0)
        {
            throw new MallExcetion(MallExcptionEum.ORDER_NOT_EXISTS);
        }
        else {
            int state=orderMapper.removeOrders(orders);
            if(state==0)
            {
                throw new MallExcetion(MallExcptionEum.DELETE_FAILED);
            }
            return state;
        }

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
        //更新的时候需要判断的是该订单是否存在
        int status=orderMapper.removeOrders(orders);
        if(status==0)
        {
            throw new MallExcetion(MallExcptionEum.ORDER_NOT_EXISTS);
        }
        else {
            int status1 = orderMapper.updateOrdersState(orders);
            if (status1 == 0) {
                throw new MallExcetion(MallExcptionEum.UPDATE_FAILED);
            }
            return status1;
        }
    }


}
