package com.asiainfo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient// 启动服务发现中心
@EnableFeignClients// 使用feign客户端
public class App {
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}
