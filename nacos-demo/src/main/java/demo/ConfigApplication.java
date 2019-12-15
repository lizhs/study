package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import com.alibaba.nacos.spring.context.annotation.config.EnableNacosConfig;

@SpringBootApplication
@Controller
@ComponentScan(basePackages="demo")
@RequestMapping("config")
@EnableNacosConfig
//@RefreshScope
//@EnableNacos(globalProperties = @NacosProperties(serverAddr = "127.0.0.1:8848"))
public class ConfigApplication {
	static {
		//System.setProperty("spring.profiles.active", "nacos");
	}

	public static void main(String[] args) {
		SpringApplication.run(ConfigApplication.class, args);
	}

	@NacosValue(value = "${key1:123}", autoRefreshed = true)
	private  String key1;
	
	@NacosValue(value = "${a}", autoRefreshed = true)
	private String a;
	
	
	@Value(value = "${b}")
	private String b;
	
	public String getB() {
		return b;
	}

	public void setB(String b) {
		this.b = b;
	}

	@Autowired
	private MyConf conf;

 	@RequestMapping(value = "/get", method = RequestMethod.GET)
    @ResponseBody
	public String get() {
		return a;
	}
 	
 	@RequestMapping(value = "/get2", method = RequestMethod.GET)
    @ResponseBody
	public String get2() {
		return  conf.getName();
	}
 	
 	@RequestMapping(value = "/get3", method = RequestMethod.GET)
    @ResponseBody
	public String get3() {
		return b;
	}
}