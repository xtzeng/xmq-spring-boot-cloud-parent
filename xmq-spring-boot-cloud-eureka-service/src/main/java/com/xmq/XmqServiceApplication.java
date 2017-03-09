package com.xmq;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class XmqServiceApplication {
	public static void main(String[] args) {
		new SpringApplicationBuilder(XmqServiceApplication.class).web(true).run(args);
	}
}
