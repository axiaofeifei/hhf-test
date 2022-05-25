package com.hhf.eurekaservertest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerTestApplication.class, args);
	}

}
