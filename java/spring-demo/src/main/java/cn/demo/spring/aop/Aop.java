package cn.demo.spring.aop;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.List;


@Aspect
@Component
public class Aop {

	@Pointcut("execution(* cn.demo.spring.aop.A.send(..))")
    public void send() { 
        System.out.println("send..");
    }

    @Before("send()")
    public void before2(JoinPoint point) {
        List list = (List) point.getArgs()[0];
        list.add("拦截数据2");
        System.out.println("before2");
    }


    @Before("execution(* cn.demo.spring.aop.A.send(..))")
    public void before(JoinPoint point) {
        List list = (List) point.getArgs()[0];
        list.add("拦截数据");
        System.out.println("before");

    }


}
