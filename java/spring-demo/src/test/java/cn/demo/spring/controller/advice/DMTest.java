package cn.demo.spring.controller.advice;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringRunner;

import cn.demo.spring.domain.CityDao;
import cn.demo.spring.domain.DemoMapper;
import cn.demo.spring.domain.entity.City;
import cn.demo.spring.domain.old.PersonDao;

@RunWith(SpringRunner.class)
@SpringBootTest
@ComponentScan(basePackages = {"cn.demo.spring"})
//@AutoConfigureMockMvc
//@EntityScan(basePackages={"cn.***.***.domain"})
@MapperScan("cn.demo.spring.domain")
public class DMTest {
	@Autowired
	PersonDao personDao;
	
	@Autowired
	DemoMapper demoMapper;
	
	@Autowired
	CityDao cityDao;
	
	@Test
	public void daoTest() throws Exception {
		City ret = cityDao.findByState("1");
		City ret2 = cityDao.findByState("call");
		System.out.println(ret);
		cityDao.findByStateAndid("1", 1L);
		cityDao.findByStateOrid("1", 1L);
		
		String personName = demoMapper.findPersonNameById(1L);
		System.out.println(personName);
 	}

}
