package com.anik.springboot.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RequestMappingController {

	@GetMapping("/index") //@RequestMapping("/index") will also work
	public String showIndex()
	{
		return "index";
	}
}
