package com.hhf.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author 小非肥
 * @version 1.0
 * @date 2022/4/8 22:23
 */
@RestController
public class TestController {
    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/test")
    public String test(){

        ResponseEntity<String> forEntity = restTemplate.getForEntity("http://02-EUREKA-CLIENT-PROVIDER/test", String.class);

        String body = forEntity.getBody();
        return "第一个rureka项目的服务消费者------"+body;

    }
}
