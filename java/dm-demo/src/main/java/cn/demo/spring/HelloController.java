package cn.demo.spring;

import java.util.Map;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@GetMapping("/hello")
	public String hello(Model model) {
		Map<String, Object> map = model.asMap();
		System.out.println(map);
		int i = 1 / 0;
		return "hello controller advice";
	}
}
