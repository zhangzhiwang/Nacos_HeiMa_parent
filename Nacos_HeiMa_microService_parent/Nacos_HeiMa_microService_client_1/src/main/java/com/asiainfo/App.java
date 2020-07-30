package com.asiainfo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@EnableDiscoveryClient // 启动nacos服务发现
@ImportResource({"classpath:consumer.xml"})
public class App {
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}
