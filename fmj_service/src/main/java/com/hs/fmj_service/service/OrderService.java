package com.hs.fmj_service.service;

import com.hs.fmj.module.Order;
import com.hs.fmj.module.OrderUser;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author 华生
 * 2020/12/11
 */
@Service
public interface OrderService {

    /***
     * 根据orderID查询订单
     * @param orderId
     * @return
     */
    Map<Order, OrderUser> findByOrderId(Long orderId);

    /***
     * 查询订单与用户信息
     * @return
     */
    List<Map<Order, OrderUser>> findAll();

    /***
     * 查询所有订单
     * @return
     */
    List<Order>findList();

    /***
     * 查询订单信息
     */
    public int deleteOrderById(Long orderId);

    /***
     * 添加订单
     */
    public int addOrder(Order order);

    public int save(Order order);
}
