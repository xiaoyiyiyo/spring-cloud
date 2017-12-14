package com.xiaoyiyiyo.controller;

import com.xiaoyiyiyo.service.OneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by xiaoyiyiyo on 2017/12/14.
 */
@RestController
public class OneController {

    @Autowired
    private OneService oneService;

    @RequestMapping("/test")
    public String one() {
        return oneService.one();
    }
}
