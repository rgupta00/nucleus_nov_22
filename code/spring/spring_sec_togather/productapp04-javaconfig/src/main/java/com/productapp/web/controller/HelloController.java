package com.productapp.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;

//@Controller
public class HelloController {

	@GetMapping(path ="mgr")
	public String sayHome(ModelMap model) {
		model.addAttribute("greeting", "hello home");
		return "home_mgr";
	}
	@GetMapping(path ="emp")
	public String sayHello(ModelMap model) {
		model.addAttribute("greeting", "hello emp");
		return "home_emp";
	}

	@GetMapping(path ="admin")
	public String sayhome(ModelMap model) {
		model.addAttribute("greeting", "Hello admin");
		return "home_admin";
	}

	@GetMapping("home")
	public String home(){
		return "home";
	}

	@GetMapping("login")
	public String loginMethod(){
		return "login_page";
	}

	@GetMapping(value = "403")
	public String accesssDenied(ModelMap model, Principal principal) {
		model.addAttribute("username",principal.getName());
		return "access_denied";
	}
}
