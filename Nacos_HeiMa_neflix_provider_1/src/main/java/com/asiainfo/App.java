package com.asiainfo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Spring Cloud体系分为Spring Cloud Netflix系列和Spring Cloud Alibaba系列，这是两个平行的微服务全套解决方案。
 * 本工程是用Spring Cloud Netflix体系进行测试，将其中的注册中心由eureka换成alibaba的nacos，这也说明两大体系的组件是可以交叉使用的。
 * 另外，alibaba的nacos具有配置管理和服务发现的功能，相当于netflix的spring cloud config + eureka，将两者合二为一
 */
@SpringBootApplication
@EnableDiscoveryClient// 启动服务发现中心
public class App {
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}
