package com.asiainfo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	@GetMapping("/test1")
	public String test1() {
		return "TestController_2";
	}
}
