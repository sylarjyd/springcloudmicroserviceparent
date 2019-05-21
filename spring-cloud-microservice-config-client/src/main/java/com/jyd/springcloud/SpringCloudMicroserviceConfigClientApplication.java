package com.jyd.springcloud;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RefreshScope
public class SpringCloudMicroserviceConfigClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudMicroserviceConfigClientApplication.class, args);
	}
	// git配置文件里的key
	@Value("${myww}")
	private String myww;
	@Value("${jyd}")
	private String jyd;
	@RequestMapping(value = "/hi")
	public String hi(){
		return myww+"\r\n"+jyd;
	}

}
