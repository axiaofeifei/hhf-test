package com.hhf.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 小非肥
 * @version 1.0
 * @date 2022/4/12 10:42
 */
@RestController
public class FindAController {
    @RequestMapping("/find")
    public String findB(){
        return "发现全部8811";
    }
}
