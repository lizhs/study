package demo.springcloud.aop;

import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Aop {
	
	@Pointcut("execution(* demo.springcloud.aop.A.send(..))")
	public void send() {
		System.out.println("send..");
	}
	
	@Before("send()")
	public void before2(JoinPoint point) {
		List list=(List) point.getArgs()[0];
		list.add("拦截数据2");
		System.out.println("before2");
	}
	
	
	
	@Before("execution(* demo.springcloud.aop.A.send(..))")
	public void before(JoinPoint point) {
		List list=(List) point.getArgs()[0];
		list.add("拦截数据");
		System.out.println("before");
	}
}
