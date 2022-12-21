package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.dao.EmployeeDao;
import com.example.dto.Employee;

@SpringBootApplication
public class EmpappApplication implements CommandLineRunner{

	@Autowired
	private EmployeeDao dao;
	
	public static void main(String[] args) {
		SpringApplication.run(EmpappApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		dao.save(new Employee("ravi", 5000.00));
		dao.save(new Employee("ekta", 5000.00));
		dao.save(new Employee("gunika", 5000.00));
		
		
	}

}
