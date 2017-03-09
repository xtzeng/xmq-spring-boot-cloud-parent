package com.xmq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.xmq.service.inf.IXmqClient;

@RestController
public class ConsumerController {

    @Autowired
    IXmqClient iXmqClient;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public Integer add() {
        return iXmqClient.add(10, 20);
    }

}