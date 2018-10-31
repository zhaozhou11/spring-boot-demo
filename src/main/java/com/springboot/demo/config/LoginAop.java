package com.springboot.demo.config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.MDC;
import org.springframework.stereotype.Component;

import java.util.UUID;

/**
 * Created by zhaozhou on 2018/10/31.
 */
@Aspect
@Component
public class LoginAop {

    private static String MDC_KEY_USER_NAME = "userName";
    private static String MDC_KEY_REQ_ID = "reqId";

    @Pointcut("execution(public * com.springboot.demo.controller..*.*(..))")
    public void webLog(){}

    @Before("webLog()")
    public void before(JoinPoint joinPoint){
        MDC.put(MDC_KEY_USER_NAME,"zhaozhou");
        MDC.put(MDC_KEY_REQ_ID, UUID.randomUUID().toString());
    }

    @AfterReturning(pointcut = "webLog()", returning = "ret")
    public void afterReturning(Object ret){
        MDC.remove(MDC_KEY_USER_NAME);
        MDC.remove(MDC_KEY_REQ_ID);
    }
}
