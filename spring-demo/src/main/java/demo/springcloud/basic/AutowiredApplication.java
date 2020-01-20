package demo.springcloud.basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="demo.springcloud.aop")
@ComponentScan
public class AutowiredApplication {
	@Autowired
    Interface1[] ints;

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(AutowiredApplication.class, args);
        AutowiredApplication application = (AutowiredApplication) run.getBean("autowiredApplication");
        System.out.printf("application="+application.ints);

        
    }
    
    
    
 
}
