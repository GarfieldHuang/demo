package xyz.hdpz.springbootspringbootdataredissentinel.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.hdpz.springbootspringbootdataredissentinel.utils.RedisUtil;

import java.util.Date;


/**
 * 测试Controller
 */
@RestController
@Slf4j
public class TestController {

    @Autowired
    RedisUtil redisUtil;

    @RequestMapping("/test")
    public String Test() {
        redisUtil.set("name", "黄大胖子");
        String name = (String) redisUtil.get("name");

        redisUtil.set("url","www.hdpz.xyz");
        String url = redisUtil.get("url");

        redisUtil.set("time", String.valueOf(new Date()));
        String time = redisUtil.get("time");
        return name+url+time;
    }
}
