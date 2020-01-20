package cn.demo.spring.basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages="cn.demo.spring.basic")
//@ComponentScan
public class AutowiredApplication {
	
	//动态注入所有实现该接口的类
	@Autowired
    Interface1[] implList;

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(AutowiredApplication.class, args);
        AutowiredApplication application = (AutowiredApplication) run.getBean("autowiredApplication");
        Interface1[] implList = application.implList;
        
        System.out.printf("implList="+implList.length);
        throw  new RuntimeException("xx");
    }
    
    
    
 
}
