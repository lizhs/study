package demo.springcloud.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.Profile;
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {
	static {
		System.setProperty("spring.profiles.active", "eureka");
	}
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class, args);
    }
}
