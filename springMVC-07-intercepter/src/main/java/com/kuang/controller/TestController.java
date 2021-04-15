package com.kuang.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 书
 * @date 2021/4/14 - 20:50
 */
@RestController
public class TestController {
    @GetMapping("/t1")
    public String test() {
        System.out.println("TestController.test");
        return "ok";
    }
}
