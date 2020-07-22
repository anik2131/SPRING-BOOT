package com.anik.springboot.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {

	@RequestMapping(value="/login")
	public String showLoginPage()
	{
		return "login";
	}
	
	@RequestMapping(value="/admin")
	public String showAdmin()
	{
		return "admin";
	}
	
	
	@RequestMapping(value={"/home"})
	public String home(){
		return "home";
	}
	
	@RequestMapping(value={"/user"})
	public String user(){
		return "user";
	}
	
	@RequestMapping(value={"/guest"})
	public String guest(){
		return "guest";
	}
	
	
	
}
