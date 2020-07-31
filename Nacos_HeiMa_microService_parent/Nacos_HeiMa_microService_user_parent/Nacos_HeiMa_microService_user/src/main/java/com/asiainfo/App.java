package com.asiainfo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@EnableDiscoveryClient
@ImportResource({"classpath:provider.xml","classpath:consumer.xml"})
public class App {
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}
