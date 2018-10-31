package com.springboot.demo;


import com.springboot.demo.entity.User;
import com.springboot.demo.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;


@RunWith(SpringRunner.class)
@SpringBootTest
public class TestApplicationTests {

	private static Logger logger = LoggerFactory.getLogger(TestApplicationTests.class);

	@Resource
	private UserService userService;

	@Test
	public void getUserTest() {
		User user = userService.getUserById(1L);
		logger.debug("this is debug!");
		logger.info("this is info!");
		logger.warn("this is warn!");
		logger.error("this is error!");
		System.out.println("用户名：" + user.getName());
	}

}
