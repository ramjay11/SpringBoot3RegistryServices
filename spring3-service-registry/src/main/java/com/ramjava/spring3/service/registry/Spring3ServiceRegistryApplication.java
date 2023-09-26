package com.ramjava.spring3.service.registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Spring3ServiceRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(Spring3ServiceRegistryApplication.class, args);
	}

}
