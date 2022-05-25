package com.hhf.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 小非肥
 * @version 1.0
 * @date 2022/4/8 10:40
 */
@RestController
public class controller {

    @GetMapping("/test")
    public String test(){
        return "使用eurake的第一个服务";
    }
}
