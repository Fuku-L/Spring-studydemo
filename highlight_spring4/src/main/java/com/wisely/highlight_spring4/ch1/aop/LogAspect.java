package com.wisely.highlight_spring4.ch1.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

// 编写切面
@Aspect
@Component
public class LogAspect {
    @Pointcut("@annotation(com.wisely.highlight_spring4.ch1.aop.Action)")
    public void annotationPointCut(){}

    // 使用注解拦截
    @After("annotationPointCut()")
    public void after(JoinPoint joinPoint){
        MethodSignature signature = (MethodSignature)joinPoint.getSignature();
        Method method = signature.getMethod();
        Action action = method.getAnnotation(Action.class);
        System.out.println("注解式拦截启动..."+action.name()+"执行结束，输出...");
    }

    // 使用方法规则拦截
    @Before("execution(* com.wisely.highlight_spring4.ch1.aop.DemoMethodService.*(..))")
    public void before(JoinPoint joinPoint) {
        MethodSignature signature = (MethodSignature)joinPoint.getSignature();
        Method method = signature.getMethod();
        System.out.println("方法规则式拦截启动..."+method.getName()+"()操作执行开始..Before输出");
    }



}
