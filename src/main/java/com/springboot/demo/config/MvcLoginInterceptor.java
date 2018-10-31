package com.springboot.demo.config;

import com.springboot.demo.interceptor.LoginInterceptor;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Created by zhaozhou on 2018/10/31.
 */
/*
@Component
public class MvcLoginInterceptor implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 注册拦截器
        InterceptorRegistration ir = registry.addInterceptor(new LoginInterceptor());
        // 配置拦截的路径
        ir.addPathPatterns("*/
/**");
        // 配置不拦截的路径
        ir.excludePathPatterns("/static*/
/**","/templates*/
/**");
    }
}
*/
