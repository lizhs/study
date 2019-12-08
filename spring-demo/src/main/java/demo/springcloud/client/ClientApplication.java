package demo.springcloud.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@SpringBootApplication
@EnableDiscoveryClient
public class ClientApplication {
	static {
		System.setProperty("spring.profiles.active", "client");
	}
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/test")
    public String test() {
        return restTemplate.getForEntity("http://SERVICEAPP1/test", String.class).getBody();
    }
    @Bean
    @LoadBalanced
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
    public static void main(String[] args) {
        SpringApplication.run(ClientApplication.class, args);
    }
}
