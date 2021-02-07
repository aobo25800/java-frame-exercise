package com.zjz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    @ResponseBody
    public String index(){
        System.out.println("index接口执行了");
        return "Hi index";
    }

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    @ResponseBody
    public String home(){
        System.out.println("home接口执行了");
        return "Hi home";
    }
}
