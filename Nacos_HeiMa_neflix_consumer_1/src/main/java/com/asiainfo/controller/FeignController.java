package com.asiainfo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.asiainfo.service.ITestService;

@RestController
public class FeignController {
	@Autowired
	private ITestService testService;
	
	@GetMapping("/sayHello")
	public String sayHello() {
		String result = testService.hello();// 通过feign客户端调用服务提供者的服务
		return result;
	}
}
