package com.example.controller;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.EmployeeDao;
import com.example.dto.Employee;
@CrossOrigin
@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeDao dao;
	

	@GetMapping("employees")
	public List<Employee> getAll(){
		return dao.getAll();
	}
	
	@GetMapping("employees/{id}")
	public Employee getById(@PathVariable  int id){
		return dao.getById(id); 
	}
}
