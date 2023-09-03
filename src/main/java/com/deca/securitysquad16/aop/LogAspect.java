package com.deca.securitysquad16.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
@Slf4j
public class LogAspect {
    @Before("execution(* com.deca.securitysquad16.controllers.HomeController.addNewUser(..)) && args(com.deca.securitysquad16.DTOs.UsersDTO)")
    public void beforeAddingNewUser(JoinPoint point){
       log.info("This is about to add a new user..."+ Arrays.toString(point.getArgs()) );
    }


    @After(value = "execution(* com.deca.securitysquad16.controllers.HomeController.addNewUser(..)) && args(com.deca.securitysquad16.DTOs.UsersDTO))")
    public void afterAddingNewUser(JoinPoint joinPoint){
        log.info(("Finished adding a new user...%s".formatted(joinPoint.getArgs())));
    }

    @AfterThrowing(value = "execution(* com.deca.securitysquad16.controllers.HomeController.addNewUser(..))", throwing = "ex")
    public void addingNewUserException(Exception ex){
        log.info(("Method threw exception... %s".formatted( ex.getMessage())));

    }
}
