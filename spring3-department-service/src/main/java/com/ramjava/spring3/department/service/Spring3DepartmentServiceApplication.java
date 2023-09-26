package com.ramjava.spring3.department.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Spring3DepartmentServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(Spring3DepartmentServiceApplication.class, args);
	}

}
