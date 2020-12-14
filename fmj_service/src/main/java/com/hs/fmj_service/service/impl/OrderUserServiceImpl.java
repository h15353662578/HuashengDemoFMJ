package com.hs.fmj_service.service.impl;

import com.hs.fmj.module.OrderUser;
import com.hs.fmj_service.mapper.OrderUserMapper;
import com.hs.fmj_service.service.OrderUserService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author 华生
 * 2020/12/11
 */
@Service
public class OrderUserServiceImpl implements OrderUserService {

    @Autowired
    private OrderUserMapper orderUserMapper;

    @Override
    public List<OrderUser> findAll(){
        return orderUserMapper.findAll();
    }

    @Override
    public int deleteOrderUserById(Long orderId){
        return orderUserMapper.deleteOrderUserById(orderId);
    }

    @Override
    public int addOrderUser(OrderUser orderUser){
        return orderUserMapper.addOrderUser(orderUser);
    }


}
