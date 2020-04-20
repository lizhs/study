package cn.demo.spring.controller.advice;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
//	@Autowired
//	CityRepository cityRepository;
	
	@GetMapping("/user")
	@Cacheable
	public String hello(String name) {
		  
 		return name+"abc";
	}
}
