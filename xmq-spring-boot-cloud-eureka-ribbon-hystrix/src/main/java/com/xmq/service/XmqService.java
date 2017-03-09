package com.xmq.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class XmqService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "addServiceFallback")
    public String addService() {
        return restTemplate.getForEntity("http://XMQ-SERVICE/add?a=10&b=20", String.class).getBody();
    }

    public String addServiceFallback() {
        return "error";
    }

}

