package com.asiainfo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.asiainfo.service.api.IOrderService;
import com.asiainfo.service.api.IUserService;

@RestController
@RequestMapping("microServiceController")
public class MicroServiceController {
	@Autowired
	private ConfigurableApplicationContext configurableApplicationContext;
	@Autowired
	private IOrderService orderService;
	@Autowired
	private IUserService userService;
	
	@GetMapping("/login")
	public String login() {
		String property = configurableApplicationContext.getEnvironment().getProperty("login.success");
		String user = orderService.getUserById();
		return property + " Hello," + user;
	}
	
	@GetMapping("/saveUser")
	public String saveUser() {
		return userService.saveUser();
	}
	
	@GetMapping("/queryUserOrder")
	public String queryUserOrder() {
		return userService.queryUserOrder();		
	}
}
