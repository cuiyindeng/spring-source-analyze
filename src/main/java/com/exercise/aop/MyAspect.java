package com.exercise.aop;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 切面
 * 切面把切点和通知结合起来，运用到连接点上。
 */
@Aspect
public class MyAspect {

    Logger logger = LoggerFactory.getLogger(MyAspect.class);

    /**
     * 切点
     */
    @Pointcut("execution(* com.exercise.aop.impl.CarServiceImpl.printCar(..))")
    public void pointCut() {
        logger.info("before........");
    }

    /**
     * 通知
     */
    @Before("pointCut()")
    public void before() {
        logger.info("before........");
    }

    @After("pointCut()")
    public void after() {
        logger.info("after........");
    }

    @AfterReturning("pointCut()")
    public void afterReturning() {
        logger.info("afterReturning........");
    }

    @AfterThrowing("pointCut()")
    public void afterThrowing() {
        logger.info("afterThrowing........");
    }

    /**
     * 环绕通知
     * @param joinPoint
     * @throws Throwable
     */
    @Around("pointCut()")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
        logger.info("around before........");
        Object proceed = joinPoint.proceed();
        logger.info("around after........");

    }
}
