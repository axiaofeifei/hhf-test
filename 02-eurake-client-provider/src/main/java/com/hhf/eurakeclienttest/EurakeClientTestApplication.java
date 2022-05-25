package com.hhf.eurakeclienttest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EurakeClientTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurakeClientTestApplication.class, args);
	}

}
