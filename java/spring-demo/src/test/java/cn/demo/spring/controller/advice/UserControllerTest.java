package cn.demo.spring.controller.advice;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
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
public class UserControllerTest {
	@Autowired
	MockMvc mvc;

	@Test
	public void exampleTest() throws Exception {
		mvc.perform(get("/user").param("name","lizhs")).andExpect(status().isOk()).andExpect(content().string("lizhsabc"));
	}

}
