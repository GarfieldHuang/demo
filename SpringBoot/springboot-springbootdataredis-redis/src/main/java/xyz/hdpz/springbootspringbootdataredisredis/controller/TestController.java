package xyz.hdpz.springbootspringbootdataredisredis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.hdpz.springbootspringbootdataredisredis.utils.RedisUtil;


/**
 * 测试Controller
 */
@RestController
public class TestController {

    /**
     * 这里直接引入工具类就可以了
     */
    @Autowired
    RedisUtil redisUtil;

    @RequestMapping("/test")
    public String Test() {
        redisUtil.set("name", "黄大胖子");
        String name = redisUtil.get("name");

        redisUtil.set("url","www.hdpz.xyz");
        String url = redisUtil.get("url");
        return name+url;
    }
}
