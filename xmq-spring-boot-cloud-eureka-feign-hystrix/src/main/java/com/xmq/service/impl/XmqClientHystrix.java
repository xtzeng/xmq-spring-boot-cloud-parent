package com.xmq.service.impl;


import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

import com.xmq.service.inf.IXmqClient;

@Component
public class XmqClientHystrix implements IXmqClient {

    @Override
    public Integer add(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b) {
        return -9999;
    }

}
