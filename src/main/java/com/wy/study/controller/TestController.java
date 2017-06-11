package com.wy.study.controller;

import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wy_ms on 2017/06/10.
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @RequestMapping("/info")
    public String info(){
        LoggerFactory.getLogger(TestController.class).info("test info");
        return "test info";
    }

}
