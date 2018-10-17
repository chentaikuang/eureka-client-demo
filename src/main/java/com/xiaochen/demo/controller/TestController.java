package com.xiaochen.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value = "/test")
public class TestController {

    /**
     * visit url:http://localhost:8882/test/tips
     * @return
     */
    @GetMapping("/tips")
    public Map tips(){
        Map map = new HashMap();
        map.put("tips","eureka client...");
        map.put("curTime",new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date()));
        return map;
    }

    @GetMapping("/invokeGet")
    public Map invoke(String tips){
        Map map = new HashMap();
        map.put("tips","eureka client:"+tips);
        map.put("type","GET");
        map.put("curTime",new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date()));
        return map;
    }

    @PostMapping("/invokePost")
    public Map invokePost(String tips){
        Map map = new HashMap();
        map.put("type","POST");
        map.put("tips","eureka client:"+tips);
        map.put("curTime",new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date()));
        return map;
    }
}
