package cn.demo.spring.aop;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Component;

import java.util.List;


@Aspect
@Component


public class Aop {
	private String s;

	@Autowired
	private ConversionService conversionService;

	public Aop(String s) {
		this.s = s;

	}

	public static void main(String[] args) {

	}

	@Pointcut("execution(* demo.springcloud.aop.A.send(..))")
    public void send() {
        System.out.println("send..");
    }

    @Before("send()")
    public void before2(JoinPoint point) {
        List list = (List) point.getArgs()[0];
        list.add("拦截数据2");
        System.out.println("before2");
    }


    @Before("execution(* demo.springcloud.aop.A.send(..))")
    public void before(JoinPoint point) {
        List list = (List) point.getArgs()[0];
        list.add("拦截数据");
        System.out.println("before");

    }

	public String getS() {
		return s;
	}

	public void setS(String s) {
		this.s = s;
	}
}
