package com.kuang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 书
 * @date 2021/4/9 - 19:18
 */
@Controller
public class HelloController {
    @RequestMapping
    public String hello(Model model){
        //封装数据
        model.addAttribute("msg","Hello,SpringMVC");
        //会被视图解析器处理
        return "hello";
    }
}
