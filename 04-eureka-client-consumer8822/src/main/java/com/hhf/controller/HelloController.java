package com.hhf.controller;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author 小非肥
 * @version 1.0
 * @date 2022/4/10 15:42
 */
@RestController
public class HelloController {

    @Autowired
    RestTemplate restTemplate;


    @Qualifier("eurekaClient")
    @Autowired
    EurekaClient eurekaClient;


    @GetMapping("/finda")
    public String findA(){

        InstanceInfo nextServerFromEureka = eurekaClient.getNextServerFromEureka("04-eureka-client-provider", false);
        String homePageUrl = nextServerFromEureka.getHomePageUrl();

        System.out.println(homePageUrl);

        String forEntity = restTemplate.getForObject(homePageUrl+"/find", String.class);

        return forEntity;
    }

    @GetMapping("/hello")
    public String hello(){

        return "使用ribbon的项目的服务消费者------";

    }
}
