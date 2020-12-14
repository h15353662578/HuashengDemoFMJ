package com.hs.fmj_controller.controller;

import com.hs.fmj.module.OrderUser;
import com.hs.fmj_service.service.OrderUserService;
import io.swagger.annotations.ApiOperation;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author 华生
 * 2020/12/12
 */
@RestController
@RequestMapping("/orderUser")
public class OrderUserController {

    @Reference
    private OrderUserService orderUserService;

    @ApiOperation("/查询所有订单用户信息")
    @GetMapping("/findAll")
    public List<OrderUser> findAll(){
        return orderUserService.findAll();
    }

    @ApiOperation("/根据id删除订单用户信息")
    @DeleteMapping("/deleteOrderUserById")
    public int deleteOrderUserById(Long orderId){
        return orderUserService.deleteOrderUserById(orderId);
    }

    @ApiOperation("/添加订单用户信息")
    @PutMapping("/addOrderUser")
    public int addOrderUser(@RequestBody OrderUser orderUser){
        return orderUserService.addOrderUser(orderUser);
    }
}
