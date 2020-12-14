package com.hs.fmj_controller.controller;

import com.hs.fmj.module.User;
import com.hs.fmj_service.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 华生
 * 2020/12/12
 */
@Api(value = "user")
@RestController
@RequestMapping("/user")
public class UserController {

    @Reference
    private UserService userService;

    @ApiOperation("/查询全部")
    @GetMapping("/findAll")
    public List<User> findAll() {
        return userService.findAll();
    }

    @ApiOperation("/根据姓名模糊查询")
    @GetMapping("/likename")
    public User likename(String name) {
        return userService.likename(name);
    }

    @ApiOperation("/添加用户")
    @PutMapping("/addUser")
    public int addUser(@RequestBody User user) {
        return userService.addUser(user);
    }

    @ApiOperation("/根据账号删除用户")
    @DeleteMapping("/deleteUserByName")
    public Integer deleteUserByName(@RequestBody String userName) {
        return userService.deleteUserByName(userName);
    }

    @ApiOperation("/根据账号查询用户")
    @GetMapping("/findByName")
    public List<User> findByName(@RequestBody String userName) {
        return userService.findByName(userName);
    }

    @ApiOperation("/更新用户")
    @PostMapping("/save")
    public Integer save(@RequestBody User user) {
        return userService.save(user);
    }

    @ApiOperation("/根据id删除用户")
    @DeleteMapping("/deleteUserById")
    public int deleteUserById( Long id) {
        return userService.deleteUserById(id);
    }
}
