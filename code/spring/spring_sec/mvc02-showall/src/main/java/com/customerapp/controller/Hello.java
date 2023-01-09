package com.customerapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Hello {

	@GetMapping(path ="home")
	public String sayHome(ModelMap model) {
		model.addAttribute("greeting", "hello home");
		return "home";
	}
	@GetMapping(path ="emp")
	public String sayHello(ModelMap model) {
		model.addAttribute("greeting", "hello emp");
		return "emp";
	}

	@GetMapping(path ="admin")
	public String sayhome(ModelMap model) {
		model.addAttribute("greeting", "Hello admin");
		return "admin";
	}
}