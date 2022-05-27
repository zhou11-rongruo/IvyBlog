package com.siyun.ivyadmin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhou11
 * @version 1.0.0
 * @description TODO
 * @date 2022/5/16
 */
@RestController
public class HelloIvyController {

    @Autowired
    private RedisTemplate redisTemplate;

    @GetMapping("hello")
    public String sayHello() {
        redisTemplate.opsForValue().set("testIvyRedis", "this is test");
        return "hello ivy";
    }


}
