package com.asiainfo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableDiscoveryClient // 启动nacos服务发现
@EnableZuulProxy// 启用网关zuul，可见Spring Cloud Netflix和Spring Cloud Alibaba的组件是可以混用的
public class App {
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}