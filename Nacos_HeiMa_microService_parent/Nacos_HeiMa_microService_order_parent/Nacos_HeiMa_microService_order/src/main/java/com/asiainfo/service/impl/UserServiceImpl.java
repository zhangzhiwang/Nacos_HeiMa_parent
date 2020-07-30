package com.asiainfo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;

import com.asiainfo.service.api.IUserService;

public class UserServiceImpl implements IUserService {
	@Autowired
	private ConfigurableApplicationContext configurableApplicationContext; 
	
	@Override
	public String getUserById() {
		return configurableApplicationContext.getEnvironment().getProperty("user.name");
	}

}
