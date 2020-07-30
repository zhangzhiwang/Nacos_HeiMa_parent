package com.asiainfo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	@Autowired
	private ConfigurableApplicationContext configurableApplicationContext;

	@GetMapping("/test1")
	public String test1() {
		String property = configurableApplicationContext.getEnvironment().getProperty("a.b");
		String dbProperties = configurableApplicationContext.getEnvironment().getProperty("db.pass");
		String toolsProperties = configurableApplicationContext.getEnvironment().getProperty("ftp_ip");
		String mqProperties = configurableApplicationContext.getEnvironment().getProperty("mq_tag");
		return property + " + " + dbProperties + " + " + toolsProperties + " + " + mqProperties;
	}
}