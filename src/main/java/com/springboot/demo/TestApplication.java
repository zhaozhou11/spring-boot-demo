package com.springboot.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@SpringBootApplication
//@PropertySource("classpath:config/myconfig.properties")
@MapperScan("com.springboot.demo.dao")
public class TestApplication {


	@Autowired
	private Environment env;

	public static void main(String[] args) {

		SpringApplication.run(TestApplication.class, args);
	}
}
