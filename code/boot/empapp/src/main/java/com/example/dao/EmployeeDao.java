package com.example.dao;
import java.util.*;

import com.example.dto.Employee;
public interface EmployeeDao {
	public List<Employee> getAll();
	public Employee getById(int id);

}
