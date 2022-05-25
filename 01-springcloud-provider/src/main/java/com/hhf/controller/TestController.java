package com.hhf.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 小非肥
 * @version 1.0
 * @date 2022/4/8 22:23
 */
@RestController
public class TestController {
    @GetMapping("/test")
    public String test(){
        return "第一个SpringCloud项目的服务提供者";
    }
}
