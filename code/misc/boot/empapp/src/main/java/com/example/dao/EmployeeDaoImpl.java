package com.example.dao;

import java.util.*;

import org.springframework.stereotype.Repository;

import com.example.dto.Employee;
@Repository
public class EmployeeDaoImpl implements EmployeeDao{

	private Map<Integer, Employee> map;
	public EmployeeDaoImpl() {
		map=new HashMap<>();
		map.put(1, new Employee(1, "raj",6000.00));
		map.put(2, new Employee(2, "etka",6000.00));
	}
	@Override
	public List<Employee> getAll() {
		return new ArrayList<>(map.values());
	}

	@Override
	public Employee getById(int id) {
		return map.get(id);
	}

}
