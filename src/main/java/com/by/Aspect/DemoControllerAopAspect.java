package com.by.Aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@Aspect
public class DemoControllerAopAspect {

    @Before("execution(public * com.by.controller..*(..))")
    public void doBefore(JoinPoint joinPoint) {
        log.info("before joinPoint");
        String methodName = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        printInfos(methodName,args);
    }

    @AfterReturning(value = "execution(public * com.by.controller..*(..))", returning = "returnValue")
    public void doAfterReturning(JoinPoint point, Object returnValue){
        String methodName = point.getSignature().getName();
        Object[] args = point.getArgs();
        log.info("AfterReturning");
        printInfos(methodName,args);
    }

    private void printInfos(String methodName,Object[] args){
        String body = "";
        log.info("methodName: " + methodName + ", methodArgs: "+ body);
    }



}
