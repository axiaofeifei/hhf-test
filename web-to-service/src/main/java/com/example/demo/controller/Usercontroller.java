package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 小非肥
 * @version 1.0
 * @date 2022/3/18 21:27
 */
@RestController
@RequestMapping("users")
public class Usercontroller {

    @RequestMapping("login")
    public void login(String username,String password){
        System.out.println("username = " + username);
        System.out.println("password = " + password);
    }
}
