package demo.springcloud.aop;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="demo.springcloud.aop")
@ComponentScan
public class AopApplication {
	
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(AopApplication.class, args);
        A a = (A) run.getBean("a");
        
        List<String> list=new ArrayList<String>();
        list.add("11");
        a.send(list);
        
    }
    
    
    
 
}
