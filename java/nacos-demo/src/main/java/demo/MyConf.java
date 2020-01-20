package demo;

import org.springframework.stereotype.Component;

import com.alibaba.nacos.api.config.annotation.NacosConfigurationProperties;

@NacosConfigurationProperties(prefix="test",autoRefreshed=true, dataId = "example" ,groupId="DEFAULT_GROUP")
@Component
public class MyConf {
	private String id;
	private String name;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
