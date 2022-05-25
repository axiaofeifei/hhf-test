package com.hhf.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author 小非肥
 * @version 1.0
 * @date 2022/4/9 8:48
 */
@Configuration
public class RestTemplateConfig {
    //在spring上下文中定义一个Rest模板对象
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
