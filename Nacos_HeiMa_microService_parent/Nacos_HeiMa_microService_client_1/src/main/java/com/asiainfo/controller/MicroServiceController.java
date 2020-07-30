package com.asiainfo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.asiainfo.service.api.IOrderService;

@RestController
public class MicroServiceController {
	@Autowired
	private ConfigurableApplicationContext configurableApplicationContext;
	@Autowired
	private IOrderService userService;
	
	@GetMapping("/login")
	public String login() {
		String property = configurableApplicationContext.getEnvironment().getProperty("login.success");
		String user = userService.getUserById();
		return property + " Hello," + user;
	}
}
