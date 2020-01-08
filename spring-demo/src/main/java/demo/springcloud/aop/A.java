package demo.springcloud.aop;

import java.util.List;

import org.springframework.stereotype.Component;
@Component
public class A {
	public void send(List<String> list) {
		for(String s:list) {
			System.out.println(s);
		}
	}
}
