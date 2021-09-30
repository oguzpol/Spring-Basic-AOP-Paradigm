package com.polatmehmetoguz.aopdemoapp.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MessageAspect {

    @Before("execution(* com.polatmehmetoguz.aopdemoapp.service.MessageService.sendMessage(..))")
    public void beforeSendMessageMethod(JoinPoint joinPoint){
        System.out.println("We found the parameter before the sendMessage method : " + joinPoint.getArgs()[0]);
        System.out.println(joinPoint.getSignature());
    }

    @After("execution(* com.polatmehmetoguz.aopdemoapp.service.MessageService.sendMessage(..))")
    public void afterSendMessageMethod(JoinPoint joinPoint){
        System.out.println("We found the parameter after the sendMessage method : "+ joinPoint.getArgs()[0]);
        System.out.println(joinPoint.getSignature());
    }
}
