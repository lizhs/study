package cn.demo.spring.controller.advice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.demo.spring.domain.CityDao;
import cn.demo.spring.domain.DemoMapper;
import cn.demo.spring.domain.entity.City;
import cn.demo.spring.domain.entity.Person;
import cn.demo.spring.domain.old.PersonDao;

@RestController
public class DMController {
//	@Autowired
//	CityRepository cityRepository;
	
	@Autowired
	PersonDao personDao;
	
	@Autowired
	DemoMapper demoMapper;
	
	@Autowired
	CityDao cityDao;
	
	
	@GetMapping("/dao")
	@Cacheable
	public String dao() {
		try {
			//long count = cityDao.count();
			City ret = cityDao.findByState("1");
			City ret2 = cityDao.findByState("call");
			System.out.println(ret);
			cityDao.findByStateAndid("1", 1L);
			cityDao.findByStateOrid("1", 1L);
			
			String personName = demoMapper.findPersonNameById(1L);
			System.out.println(personName);
 			//System.out.println("count="+count);
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
		
		return "ok";
	}
	
	
	
	
	
	

	@GetMapping("/mapper")
	@Cacheable
	public String mapper() {
		try {
			Person p=new Person();
			p.setId(2L);
			p.setAddress("2");
			p.setEmail("2");
			p.setGender("2");
			p.setName("2");
			personDao.insert(p);
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
		
 		return "ok";
	}
}
