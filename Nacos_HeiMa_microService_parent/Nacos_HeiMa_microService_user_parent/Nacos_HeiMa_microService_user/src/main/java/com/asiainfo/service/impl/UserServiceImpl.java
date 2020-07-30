package com.asiainfo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.asiainfo.service.api.IOrderService;
import com.asiainfo.service.api.IUserService;

public class UserServiceImpl implements IUserService {
	@Autowired
	private IOrderService orderService;

	@Override
	public String saveUser() {
		return "保存user成功！";
	}

	@Override
	public String queryUserOrder() {
		String user = orderService.getUserById();
		return "user->order : " + user;
	}

}
