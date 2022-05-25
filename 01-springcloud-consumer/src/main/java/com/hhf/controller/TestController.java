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
        /**
         * RestTemplate是一个基于http的工具对象
         * 我们可以利用这个对象，以htttp协议发送请求到指定的某个web服务器
         * 在springCloud利用这个对象访问服务提供者
         * 使用new  或者spring。。。建议使用spring
         */
//        RestTemplate restTemplate = new RestTemplate();

        /**
         * getForEntity是以get方式发送请求，访问web服务器中的某个请求对应着另一个工程中的getMapping
         * 或RequestMapping
         * 参数一：访问的具体请求路径
         * 参数二：本次请求服务器返回的数据类型
         * 参数三：可变长度的Object类型数据，表示本次的url参数类型
         *
         *
         * 返回值：ResponseEntity()的对象，封装本次请求后的相应实体
         * 这个对象我们可以获取本次请求的状态码，头文件信息，具体响应数据
         */
        ResponseEntity<String> forEntity = restTemplate.getForEntity("http://localhost:8081/test", String.class);
//        获取响应状态码
        System.out.println(forEntity.getStatusCode());
//        获取响应头
        System.out.println(forEntity.getHeaders());
//        获取具体的数据相应类型
        String body = forEntity.getBody();
        return "第一个SpringCloud项目的服务消费者------"+body;
    }
}
