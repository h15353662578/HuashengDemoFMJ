package com.hs.fmj_service.service;

import com.hs.fmj.module.User;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 华生
 * 2020/12/11
 */
@Service
public interface UserService  {

    public List<User> findByName(String userName);

    public List<User> findAll();

    public User likename(String name);

    public int addUser(User user);

    public Integer deleteUserByName(String userName);

    public Integer save(User user);

    public Integer deleteUserById(Long id);
}
