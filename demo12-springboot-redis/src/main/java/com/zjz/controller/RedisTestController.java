package com.zjz.controller;

import com.zjz.utils.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
public class RedisTestController {

    @Autowired
    private RedisUtil redisUtil;


    @GetMapping("/hello/{id}")
    @ResponseBody
    public String hello(@PathVariable(value = "id") String id){
        String s = (String) redisUtil.get(id);
        System.out.println("id is: " + id + "\tvalue is: " + s);
//        List<Object> a = redisUtil.lGet("mylist", 0, -1);
        redisUtil.lSet("mylist", id);
        System.out.println(redisUtil.lGet("mylist", 0, -1));
        return s;
    }

}
