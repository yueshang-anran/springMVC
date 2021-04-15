package com.kuang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 书
 * @date 2021/4/9 - 20:06
 */
@Controller
public class ControllerTest3 {
    @RequestMapping("/t3")
    public String test1(Model model) {
        model.addAttribute("msg","ControllerTest3");
        return "test";
    }
}
