package com.zjz.controller;

import com.zjz.common.CommonResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult index(){

        return CommonResult.ok("index");
    }

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult hemo(){
        return CommonResult.ok("home");
    }

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult hello(){
        return CommonResult.ok("hello");
    }

}
