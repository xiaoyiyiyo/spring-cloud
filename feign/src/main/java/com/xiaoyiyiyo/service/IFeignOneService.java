package com.xiaoyiyiyo.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by xiaoyiyiyo on 2017/12/14.
 */
@Service
@FeignClient(value = "client-one", fallback = FeignOneFailService.class)
public interface IFeignOneService {

    @RequestMapping("/test")
    String one();
}
