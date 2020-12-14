package com.hs.fmj_service.service;

import com.hs.fmj.module.OrderUser;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 华生
 * 2020/12/11
 */
@Service
public interface OrderUserService {

    List<OrderUser> findAll();

    public int deleteOrderUserById(Long orderId);

    public int addOrderUser(OrderUser orderUser);
}
