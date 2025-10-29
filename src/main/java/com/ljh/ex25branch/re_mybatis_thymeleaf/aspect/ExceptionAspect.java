package com.ljh.ex25branch.re_mybatis_thymeleaf.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Slf4j
@Aspect
@Component
public class ExceptionAspect {

    @AfterThrowing(pointcut = "execution(* com.ljh.ex25branch.re_mybatis_thymeleaf.service.*.*(..))", throwing = "excep")
    public void logError(JoinPoint jp, Exception excep) {
        log.info("### 메서드중 오류\n 예외발생위치: {}, \n오류상황: {} #####end#####", jp.getSignature(), excep.getMessage());
    }
}
