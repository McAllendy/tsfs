package com.xm.tsfs.web.handler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by linwenqiang on 2017/4/1.
 */
@Controller
public class LoginHandler {
    @RequestMapping("/login.do")
    public String login(String account,String password){
        System.out.println("我 进来了");
        return "index";
    }
}
