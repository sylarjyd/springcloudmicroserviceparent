package com.jyd.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringCloudMicroserviceEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudMicroserviceEurekaServerApplication.class, args);
	}

}
