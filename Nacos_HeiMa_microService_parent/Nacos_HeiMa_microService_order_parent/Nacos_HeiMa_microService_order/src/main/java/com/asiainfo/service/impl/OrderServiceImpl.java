package com.asiainfo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;

import com.asiainfo.service.api.IOrderService;

public class OrderServiceImpl implements IOrderService {
	@Autowired
	private ConfigurableApplicationContext configurableApplicationContext; 
	
	@Override
	public String getUserById() {
		return configurableApplicationContext.getEnvironment().getProperty("user.name");
	}

}
