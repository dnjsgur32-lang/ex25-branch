package com.ljh.ex25branch.re_mybatis_thymeleaf.aspect;

import lombok.extern.slf4j.Slf4j;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@Aspect
public class LoggingAspect {

    @Before("execution(* com.ljh.ex25branch.re_mybatis_thymeleaf.service.*.*(..))")
    public void logBefore(JoinPoint jp) {
        log.info("MMMMMMM 메서드 실행전: {} MMMMM", jp.getSignature());
    }

    @AfterReturning(pointcut = "execution(* com.kim.ex25branch.mybatis.service.*.*(..))", returning = "result")
    public void logAfter(JoinPoint jp, Object result) {
        log.info("WWWWWW 메서드 실행후: {} WWWWW \n WWWWW {} WWWWW", jp.getSignature(), result);

    }

}