package com.kuang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * @author 书
 * @date 2021/4/14 - 21:26
 */
@Controller
@RequestMapping("/user")
public class LoginController {
    @RequestMapping("/main")
    public String main() {
        return "main";
    }

    @RequestMapping("/goLogin")
    public String login() {
        return "login";
    }
    @RequestMapping("/login")
    public String login(HttpSession session, String username, String password, Model model) {

        //把用户的信息存在session中
        session.setAttribute("userLoginInfo",username);
        model.addAttribute("password",password);
        model.addAttribute("username",username);
        return "main";
    }

    @RequestMapping("/goOut")
    public String goOut(HttpSession sessionl) {
        sessionl.removeAttribute("userLoginInfo");
        return "login";
    }
}
