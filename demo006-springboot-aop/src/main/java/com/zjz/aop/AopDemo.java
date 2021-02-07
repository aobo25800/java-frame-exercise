package com.zjz.aop;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Aspect
@Configuration
public class AopDemo {

    @Pointcut(value = "execution(* com.zjz.controller.HomeController.home(..))")
    public void name(){}

    @Before("name()")
    public void before(){
        System.out.println("kaishi");
    }

    @AfterReturning("name()")
    public void after(){
        System.out.println("jieshu");
    }
}
