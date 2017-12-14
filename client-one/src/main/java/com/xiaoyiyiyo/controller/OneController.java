package com.xiaoyiyiyo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by xiaoyiyiyo on 2017/12/14.
 */
@RestController
public class OneController {

    @Value("${server.port}")
    String port;

    @RequestMapping("/test")
    public String one() {
        return "Hello cloud." + port;
    }
}
