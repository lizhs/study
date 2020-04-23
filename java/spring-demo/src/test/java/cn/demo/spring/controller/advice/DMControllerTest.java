package cn.demo.spring.controller.advice;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@SpringBootTest
@ComponentScan(basePackages = {"cn.demo.spring"})
@AutoConfigureMockMvc
@EntityScan(basePackages={"cn.***.***.domain"})
@MapperScan("cn.demo.spring.domain")
public class DMControllerTest {
	@Autowired
	MockMvc mvc;

	@Test
	public void mapperTest() throws Exception {
		mvc.perform(get("/mapper").param("name","lizhs")).andExpect(status().isOk()).andExpect(content().string("ok"));
	}
	
	@Test
	public void daoTest() throws Exception {
		mvc.perform(get("/dao").param("name","lizhs")).andExpect(status().isOk()).andExpect(content().string("ok"));
	}

}
