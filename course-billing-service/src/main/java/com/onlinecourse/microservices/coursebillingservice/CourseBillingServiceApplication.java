package com.onlinecourse.microservices.coursebillingservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.onlinecourse.microservices.coursebillingservice")
@EnableDiscoveryClient
public class CourseBillingServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CourseBillingServiceApplication.class, args);
	}

}
