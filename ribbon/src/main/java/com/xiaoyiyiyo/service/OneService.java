package com.xiaoyiyiyo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by xiaoyiyiyo on 2017/12/14.
 */
@Service
public class OneService {

    @Autowired
    private RestTemplate restTemplate;

    public String one() {
        return restTemplate.getForObject("http://client-one/test", String.class);
    }

}
