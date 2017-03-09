package com.xmq.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.xmq.service.XmqService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@RestController
public class ConsumerController {

    @Autowired
    private XmqService xmqService;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String add() {
        return xmqService.addService();
    }

}

