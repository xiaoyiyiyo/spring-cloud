package com.xiaoyiyiyo.service;

import org.springframework.stereotype.Service;

/**
 * Created by xiaoyiyiyo on 2017/12/14.
 */
@Service
public class FeignOneFailService implements IFeignOneService{

    @Override
    public String one() {
        return "Sorry.";
    }
}
