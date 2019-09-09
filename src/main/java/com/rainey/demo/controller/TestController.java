package com.rainey.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Rainey
 * @Date: 2019/9/9 9:20
 * @Version: 1.0
 **/
@RestController
public class TestController {

    @RequestMapping("/t1")
    public String test1(){
        return "测试";
    }
}
