package com.hs.fmj_controller.controller;

import java.util.List;
import java.util.Map;

import com.hs.fmj.module.Order;
import com.hs.fmj.module.OrderUser;
import com.hs.fmj_service.service.OrderService;
import io.swagger.annotations.ApiOperation;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.*;


/**
 * @author 华生
 * 2020/12/12
 */
@RestController
@RequestMapping("/order")
public class OrderController {


//    @Reference(protocol = "fmj_service" ,interfaceClass = OrderService.class)
    @Reference
    private OrderService orderService;


    @ApiOperation("/查询用户订单")
    @GetMapping("/findByOrderId")
    public Map<Order, OrderUser> findByOrderId(Long orderId){
        return orderService.findByOrderId(orderId);
    }

    @ApiOperation("/查询所有订单与用户信息")
    @GetMapping("/findAll")
    public List<Map<Order,OrderUser>> findAll(){
        return orderService.findAll();
    }

    @ApiOperation("/查询所有订单")
    @GetMapping("/findList")
    public List<Order> findList(){
        return orderService.findList();
    }

    @ApiOperation("/根据id删除订单")
    @DeleteMapping("/deleteOrderById")
    public int deleteOrderById(Long orderId){
        return orderService.deleteOrderById(orderId);
    }

    @ApiOperation("/添加订单")
    @PutMapping("/addOrder")
    public int addOrder(@RequestBody Order order){
        return orderService.addOrder(order);
    }

    @ApiOperation("/修改订单")
    @PostMapping("/saveOrder")
    public int save(@RequestBody  Order order){
        return orderService.save(order);
    }
}
