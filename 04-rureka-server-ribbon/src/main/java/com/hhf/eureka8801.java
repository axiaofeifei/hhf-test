package com.hhf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class eureka8801 {

	public static void main(String[] args) {
		SpringApplication.run(eureka8801.class, args);
	}

}
