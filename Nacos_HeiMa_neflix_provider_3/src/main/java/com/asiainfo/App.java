package com.asiainfo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient// 启动服务发现中心
public class App {
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}
