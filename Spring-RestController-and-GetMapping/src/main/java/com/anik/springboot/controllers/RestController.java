package com.anik.springboot.controllers;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

	@GetMapping("/zonix")
	public String display()
	{
		return "HELLO THIS IS A REST CONTROLLER";
	}
}
