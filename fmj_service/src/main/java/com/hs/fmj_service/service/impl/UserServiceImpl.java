package com.hs.fmj_service.service.impl;

/**
 * @author 华生
 * 2020/12/11
 */

import com.hs.fmj.module.User;
import com.hs.fmj_service.mapper.UserMapper;
import com.hs.fmj_service.service.UserService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

@Autowired
private UserMapper userMapper;

@Override
public List<User> findAll() {
        return userMapper.findAll();
        }

@Override
public User likename(String name){
        return userMapper.likename(name);
        }

@Override
public int addUser(User user){
        return userMapper.addUser(user);
        }

@Override
public Integer deleteUserByName(String userName){
        return userMapper.deleteUserByName(userName);
        }

@Override
public List<User> findByName(String userName){
        return userMapper.findByName(userName);
        }

@Override
public Integer save(User user){
        return userMapper.save(user);
        }

@Override
public Integer deleteUserById(Long id){
        return userMapper.deleteUserById(id);
        }
        }
