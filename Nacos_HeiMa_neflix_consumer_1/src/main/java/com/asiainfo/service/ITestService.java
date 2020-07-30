package com.asiainfo.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "Nacos-HeiMa-neflix-provider")// 指定服务提供者的应用名称。一个很大的坑：feign不支持名称带有下划线“_”，所以服务提供者的应用名称
public interface ITestService {
	@GetMapping("/test1")// 指定要调用的服务路径
	String hello();
}
