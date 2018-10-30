package com.springboot.demo.dao;


import com.springboot.demo.entity.User;


public interface UserDao {
    User getUserById(Long id);

}