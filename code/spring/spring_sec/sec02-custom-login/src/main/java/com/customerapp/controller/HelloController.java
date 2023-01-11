package com.customerapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;

@Controller
public class HelloController {

	@GetMapping(path ="home")
	public String sayHome(ModelMap model) {
		model.addAttribute("greeting", "hello home");
		return "home";
	}
	@GetMapping(path ="emp")
	public String sayHelloEmp(ModelMap model) {
		model.addAttribute("greeting", "hello emp");
		return "home_emp";
	}
	@GetMapping(path ="mgr")
	public String sayHelloMgr(ModelMap model) {
		model.addAttribute("greeting", "hello emp");
		return "home_mgr";
	}


	@GetMapping(path ="admin")
	public String sayHelloAdmin(ModelMap model) {
		model.addAttribute("greeting", "Hello admin");
		return "home_admin";
	}
	@GetMapping(value = "403")
	public String accesssDenied(ModelMap model, Principal principal) {
		model.addAttribute("user",principal.getName());
		return "access_denied";
	}
	@GetMapping(value = "login")
	public String login() {
		return "login_page";

	}
}