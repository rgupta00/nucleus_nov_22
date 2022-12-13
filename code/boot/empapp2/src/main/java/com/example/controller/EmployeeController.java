package com.example.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.EmployeeDao;
import com.example.dto.Employee;
@CrossOrigin
@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeDao dao;
	

	@GetMapping(path = "/hello")
	public   String hello(@RequestParam(name = "name")String name) {
		Employee e= dao.findEmployee(name);
		if(e==null)
			return "name not found";
		else
			return "name found: "+ e.getName();
	}
}
