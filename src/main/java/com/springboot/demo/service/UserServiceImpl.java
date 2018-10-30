package com.springboot.demo.service;


import com.springboot.demo.dao.UserDao;
import com.springboot.demo.entity.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by zhaozhou on 2017/5/10.
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    UserDao userDao;


    @Override
    public User getUserById(Long id) {
        return userDao.getUserById(id);
    }
}
