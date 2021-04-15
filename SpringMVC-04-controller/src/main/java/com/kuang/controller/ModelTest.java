package com.kuang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 书
 * @date 2021/4/10 - 9:59
 */

@Controller
public class ModelTest {
    @RequestMapping("/m1/t1")
    public String test(Model model) {
        model.addAttribute("msg","ModelTest1");
        //转发,默认（不配置视图解析器）
        //return "forward:/WEB-INF/jsp/test.jsp";
        //重定向（不配置视图解析器）
        //return "redirect:/index.jsp";
        //转发forward,默认（配置视图解析器）
        //return "test";
        //重定向（配置视图解析器）
        return "redirect:/index.jsp";
    }

}
