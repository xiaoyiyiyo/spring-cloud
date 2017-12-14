package com.xiaoyiyiyo.controller;

import com.xiaoyiyiyo.service.IFeignOneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by xiaoyiyiyo on 2017/12/14.
 */
@RestController
public class FeignOneController {

    @Autowired
    private IFeignOneService feignOneService;

    @RequestMapping("/test")
    public String one() {
        return feignOneService.one();
    }
}
