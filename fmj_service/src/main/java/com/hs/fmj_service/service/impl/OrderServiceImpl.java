package com.hs.fmj_service.service.impl;

import com.hs.fmj.module.Order;
import com.hs.fmj.module.OrderUser;
import com.hs.fmj_service.mapper.OrderMapper;
import com.hs.fmj_service.service.OrderService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

/**
 * @author 华生
 * 2020/12/11
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Override
    public Map<Order, OrderUser> findByOrderId(Long orderId){
        return orderMapper.findByOrderId(orderId);
    }

    @Override
    public List<Map<Order,OrderUser>> findAll(){
        return orderMapper.findAll();
    }

    @Override
    public List<Order> findList(){
        return orderMapper.findList();
    }

    @Override
    public int deleteOrderById(Long orderId){
        return orderMapper.deleteOrderById(orderId);
    }

    @Override
    public int addOrder(Order order){
        return orderMapper.addOrder(order);
    }

    @Override
    public int save(Order order){
        return orderMapper.save(order);
    }
}
