package com.springboot.demo.controller;

import com.springboot.demo.TestConfigurationProperties;
import com.springboot.demo.entity.User;
import com.springboot.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * Created by zhaozhou on 2018/10/18.
 */
@Controller
@RequestMapping("/")
public class TestController {


    @Autowired
    private Environment env;

    @Autowired
    private TestConfigurationProperties config;

    @Resource
    private UserService userService;

    @RequestMapping("")
    public String index(){
        User user = userService.getUserById(1L);

        return "/index.html";
    }
}
